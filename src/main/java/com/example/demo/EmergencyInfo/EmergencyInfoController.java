package com.example.demo.EmergencyInfo;

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
@RequestMapping(path= "emergencyInfo",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class EmergencyInfoController 
{
	private Long ActivityId;
	private final EmergencyInfoService emergencyInfoService;
	
	@Autowired
	public EmergencyInfoController(EmergencyInfoService emergencyInfoService)
	{
		this.emergencyInfoService=emergencyInfoService;
	}
	
	@GetMapping(path="/get/{ActivityId}")				//sayfa yönlendirme 
	public ModelAndView EmergencyInfoList(@PathVariable("ActivityId") Long Id)
	{
		this.ActivityId=Id;
		ModelAndView maw = new ModelAndView("EmergencyInfolist");
		maw.addObject("EmergencyInfo",emergencyInfoService.EmergencyInfoList(Id));
		return maw;
	}
	
	
	@DeleteMapping(path="{LockerNumber}")	// emergency info silme
	public ModelAndView deleteEmergencyInfo(@PathVariable("LockerNumber") Long LockerNumber)
	{
		
		emergencyInfoService.deleteEmergencyInfo(LockerNumber);
		String path = "redirect:http://localhost:8080/emergencyInfo/get/"+this.ActivityId;
		return new ModelAndView(path);
	}
	
	
	@PostMapping(path="post",params={"add"})		//emergency info kayıt işlemi için post
	public ModelAndView addEmergencyInfo(EmergencyInfo emergencyInfo)
	{
		emergencyInfo.setActivityId(this.ActivityId);
		emergencyInfoService.addEmergencyInfo(emergencyInfo);
		String path = "redirect:http://localhost:8080/emergencyInfo/get/"+this.ActivityId;
		return new ModelAndView(path);
	}
	
	
}
