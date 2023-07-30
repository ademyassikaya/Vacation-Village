package com.example.demo.IndiviualActivity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.MassActivity.MassActivity;



@RestController
@RequestMapping(path= "/IndiviualActivity",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class IndiviualActivityController 
{

	private final IndiviualActivityService indiviualActivityService;
	private Long AnimatorId;
	private Long CustomerId;
	
	@Autowired
	public IndiviualActivityController(IndiviualActivityService indiviualActivityService) {
	this.indiviualActivityService=indiviualActivityService;	
	}
	
	
	@GetMapping(path="/get/{Id}",params="add_Appointment_button")
	public ModelAndView getIndiviualActivity(@PathVariable("Id") Long Id)
	{
		this.CustomerId=Id;
		ModelAndView maw = new ModelAndView("IndiviualActivityList");
		maw.addObject("IndiviualActivity",indiviualActivityService.getIndiviualActivity());
		maw.addObject("CustomerId",Id);
		return maw;
	}
	
	@GetMapping(path="/kyt/{Id}")
	public ModelAndView registerIndiviualActivity(@PathVariable("Id") Long Id)  //activity list için get maping kullanıldı
	{
		this.AnimatorId=Id;
		ModelAndView maw = new ModelAndView("IndiviualActivityListsil");
		maw.addObject("IndiviualActivity",indiviualActivityService.getIndiviualActivity());
		maw.addObject("AnimatorId",Id);
		return maw;
	}
	
	@GetMapping(path="/kyt/Mass/{Id}")
	public ModelAndView registerIndiviualActivity1(@PathVariable("Id") Long AnimatorId)
	{
		ModelAndView maw = new ModelAndView("IndiviualActivityrgstr");
		maw.addObject("AnimatorId",AnimatorId);
		return maw;
	}
	
	
	
	@PostMapping(path="/kyt/post/{Id}",params={"add"})
	public ModelAndView addIndiviualActivity(IndiviualActivity indiviualActivity,@PathVariable("Id") Long Id)
	{
		indiviualActivityService.addIndiviualActivity(indiviualActivity);
		ModelAndView maw = new ModelAndView("IndiviualActivityrgstr");
		maw.addObject("IndiviualActivity",indiviualActivity);
		return maw;
	}
	
	
	@PostMapping(path="post/{AnimatorId}",params={"add"})
	public ModelAndView addIndiviualActivity2(IndiviualActivity indiviualActivity,@PathVariable("AnimatorId") Long Id)
	{
		indiviualActivity.setActivityId((long)0);
		indiviualActivity.setActivityType("Indiviual");
		indiviualActivity.setAnimatorId(Id);
		indiviualActivityService.addIndiviualActivity(indiviualActivity);
		ModelAndView maw = new ModelAndView("IndiviualActivityrgstr");
		maw.addObject("IndiviualActivity",indiviualActivity);
		return maw;
	}
	
	@DeleteMapping(path="{ActivityId}",params= {"deleteIndiviualActivity"})
	public ModelAndView deleteIndiviualActivity(@PathVariable("ActivityId") Long ActivityId)
	{
		String path="redirect:http://localhost:8080/IndiviualActivity/kyt/"+this.AnimatorId;
		indiviualActivityService.deleteIndiviualActivity(ActivityId);
		ModelAndView redirect= new ModelAndView(path);
		return redirect;
	}
}
