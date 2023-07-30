package com.example.demo.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(path= "api/v1/customer",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
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
		return new ModelAndView("redirect:/api/v1/customer/get");
	}
	
	@GetMapping(path="/kyt")
	public ModelAndView getCustomer1()
	{
		ModelAndView maw = new ModelAndView("müsterirgstr");
		return maw;
	}
	
	
}
