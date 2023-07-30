package com.example.demo.MassActivity;

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
@RequestMapping(path= "/MassActivity",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class MassActivityController 
{
	private final MassActivityService massActivityService;
	private Long AnimatorId;
	private Long CustomerId;
	
	@Autowired
	public MassActivityController(MassActivityService massActivityService) {
	this.massActivityService=massActivityService;	
	}
	
	
	@GetMapping(path="/get/{Id}",params="add_Appointment_button")
	public ModelAndView getMassActivity(@PathVariable("Id") Long Id)
	{
		this.CustomerId=Id;
		ModelAndView maw = new ModelAndView("MassActivityList");
		maw.addObject("MassActivity",massActivityService.getMassActivity());
		maw.addObject("CustomerId",Id);
		return maw;
	}
	
	@GetMapping(path="/get/Animator/{Id}")
	public ModelAndView getMassActivityforAnimators(@PathVariable("Id") Long Id)
	{
		this.AnimatorId=Id;
		ModelAndView maw = new ModelAndView("MassActivityListsil");
		maw.addObject("MassActivity",massActivityService.getMassActivity());
		maw.addObject("AnimatorId",Id);
		return maw;
	}
	
	@GetMapping(path="/kyt/{Id}")
	public ModelAndView registerMassActivity(@PathVariable("Id") Long AnimatorId)
	{
		ModelAndView maw = new ModelAndView("MassActivityrgstr");
		maw.addObject("AnimatorId",AnimatorId);
		return maw;
	}
	
	
	@PostMapping(path="post/{AnimatorId}",params={"add"})
	public ModelAndView addMassActivity(MassActivity massActivity,@PathVariable("AnimatorId") Long Id)
	{
		massActivity.setActivityId((long)0);
		massActivity.setActivityType("Mass");
		massActivity.setAnimatorId(Id);
		massActivityService.addMassActivity(massActivity);
		ModelAndView maw = new ModelAndView("MassActivityrgstr");
		maw.addObject("MassActivity",massActivity);
		return maw;
	}
	
	@DeleteMapping(path="{ActivityId}",params= {"deleteMassActivity"})
	public ModelAndView deleteMassActivity(@PathVariable("ActivityId") Long ActivityId)
	{
		String path="redirect:http://localhost:8080/MassActivity/get/Animator/"+this.AnimatorId;
		massActivityService.deleteMassActivity(ActivityId);
		ModelAndView redirect=new ModelAndView(path);
		return redirect;
	}
	 
	
}
