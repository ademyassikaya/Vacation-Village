package com.example.demo.Equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.EquipPerson.EquipPerson;



@RestController
@RequestMapping(path= "Equipment",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class EquipmentController 
{
	private final EquipmentService equipmentService;
	
	@Autowired
	public EquipmentController(EquipmentService equipmentService)
	{
		this.equipmentService=equipmentService;
	}
	
	@GetMapping(path="/kyt")
	public ModelAndView registerEquipment()
	{
		ModelAndView maw = new ModelAndView("Equipmentrgstr");
		return maw;
	}
	
	
	@GetMapping(path="/get")
	public ModelAndView equipmentList()
	{
		ModelAndView maw = new ModelAndView("equipmentList");
		maw.addObject("Equipment",equipmentService.equipmentList());
		return maw;
	}
	
	@DeleteMapping(path="{EquipmentId}")
	public ModelAndView deleteEquipment(@PathVariable("EquipmentId") Long EquipmentId)
	{
		equipmentService.deleteEquipment(EquipmentId);
		return new ModelAndView("redirect:http://localhost:8080/Equipment/get");
	}
	
	@PostMapping(path="post",params={"add"})
	public ModelAndView addEquipment(Equipment equipment)
	{
		equipmentService.addEquipment(equipment);
		return registerEquipment();
	}
	
}
