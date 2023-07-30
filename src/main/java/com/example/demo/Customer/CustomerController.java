package com.example.demo.Customer;


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
@RequestMapping(path= "/customer",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class CustomerController {
	
	private final CustomerService customerService;
	
	
	/*Api oluşturarak controller yapıldığı kısım. Getmapping ile veriler postgresql kısmından alınıp.
	 müsteri.html kısmında gösterilmiştir.
	 DeleteMapping database kısmında olan verilerin silinmesi için yazılmıştır.
	 redirect ile tekrar aynı sayfa içerisinde kalması saglanmıştır.
	  */
	@Autowired
	public CustomerController(CustomerService customerService) {
	this.customerService=customerService;	
	}
	
	
	@GetMapping(path="/get")
	public ModelAndView getCustomer()
	{
		ModelAndView maw = new ModelAndView("müsteri");
		maw.addObject("Customer",customerService.getCustomer());
		return maw;
	}
	
	@DeleteMapping(path="{VacationVillageId}")
	public ModelAndView deleteCustomer(@PathVariable("VacationVillageId") Long VacationVillageId)
	{
		customerService.deleteCustomer(VacationVillageId);
		return new ModelAndView("redirect:http://localhost:8080/customer/get");
	}
	
	@GetMapping(path="/kyt")
	public ModelAndView registerCustomer()
	{
		ModelAndView maw = new ModelAndView("müsterirgstr");
		return maw;
	}
	
	@GetMapping(path="/dns")
	public ModelAndView dnsCustomer()
	{
		ModelAndView maw = new ModelAndView("Manager");
		return maw;
	}
	
	@PostMapping(path="post",params={"add"})
	public ModelAndView addCustomer(Customer customer)
	{
		customerService.addCustomer(customer);
		ModelAndView maw = new ModelAndView("customergrs");
		maw.addObject("Customer",customer);
		return maw;
	}
	 
	@GetMapping(path="/grs")
	public ModelAndView girisCustomer()
	{
		ModelAndView maw = new ModelAndView("grs");
		return maw;
	}
	
	
	
	
	@GetMapping(path="login", params = {"login_button"})
    public ModelAndView loginCustomer(String contactPhone,String userPassword)
    {
        Customer customer = customerService.grs(contactPhone, userPassword);
        if(customer != null)
        {
        	if(customer.getVacationVillageId()==1)
        	{
        	System.out.println("Kullanıcı bulundu");
            ModelAndView maw = new ModelAndView("Manager");
            maw.addObject("Customer",customer);
            return maw;
            }
        	 ModelAndView maw = new ModelAndView("customergrs");
             maw.addObject("Customer",customer);
             return maw;
        }
        else
        {
            System.out.println("Kullanıcı bulunamadı");
            return new ModelAndView("redirect:http://localhost:8080");
        }
    }
	
	
}
