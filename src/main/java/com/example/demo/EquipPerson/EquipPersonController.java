package com.example.demo.EquipPerson;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(path= "equipPerson",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class EquipPersonController 
{
private final EquipPersonService equipPersonService;
	
	@Autowired
	public EquipPersonController(EquipPersonService equipPersonService)
	{
		this.equipPersonService=equipPersonService;
	}
	

	
	@GetMapping(path="/grs")
	public ModelAndView girisEquipPerson()
	{
		ModelAndView maw = new ModelAndView("equippersongrs");
		return maw;
	}
	
	@GetMapping(path="/kyt")
	public ModelAndView registerEquipPerson()
	{
		ModelAndView maw = new ModelAndView("EquipPersonrgstr");
		return maw;
	}
	
	@PostMapping(path="post",params={"add"})
	public ModelAndView addEquipPerson(EquipPerson equipPerson)
	{
		equipPersonService.addEquipPerson(equipPerson);
		ModelAndView maw = new ModelAndView("EquipPersonHesap");
		maw.addObject("EquipPerson",equipPerson);
		return maw;
	}
	
	@GetMapping(path="/get")
	public ModelAndView equipPersonList()
	{
		ModelAndView maw = new ModelAndView("equipPersonList");
		maw.addObject("EquipPerson",equipPersonService.equipPersonList());
		return maw;
	}
	
	@DeleteMapping(path="{Ssn}")
	public ModelAndView deleteEquipPerson(@PathVariable("Ssn") Long Ssn)
	{
		equipPersonService.deleteEquipPerson(Ssn);
		return new ModelAndView("redirect:http://localhost:8080/equipPerson/get");
	}
	
	@GetMapping(path="login", params = {"login_button"})
    public ModelAndView loginEquipPerson(String equPhoneNumber,String equUserPassword)
    {
		EquipPerson equipPerson = equipPersonService.grs(equPhoneNumber, equUserPassword);
        if(equipPerson != null)
        {
        	 ModelAndView maw = new ModelAndView("EquipPersonHesap");
             maw.addObject("EquipPerson",equipPerson);
             return maw;
        }
        else
        {
            System.out.println("Kullanıcı bulunamadı");
            return new ModelAndView("redirect:http://localhost:8080");
        }
    }
}

