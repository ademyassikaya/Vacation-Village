package com.example.demo.Manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path= "api/v1/Manager")
public class ManagerController {
			
		
		@GetMapping(path="/mngrkyt")
		public ModelAndView registerManager()
		{
			ModelAndView maw = new ModelAndView("Manager");
			return maw;
		}
		
}


