package com.example.demo.Animator;

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
@RequestMapping(path= "animator",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class AnimatorController 
{
	private final AnimatorService animatorService;
	
	@Autowired
	public AnimatorController(AnimatorService animatorService)
	{
		this.animatorService=animatorService;
	}
	
	

	
	@GetMapping(path="/grs")
	public ModelAndView girisAnimator()
	{
		ModelAndView maw = new ModelAndView("animatorgrs");
		return maw;
	}
	
	@GetMapping(path="/kyt")
	public ModelAndView registerAnimator()
	{
		ModelAndView maw = new ModelAndView("Animatorrgstr");
		return maw;
	}
	
	@PostMapping(path="post",params={"add"})
	public ModelAndView addAnimator(Animator animator)
	{
		animatorService.addAnimator(animator);
		ModelAndView maw = new ModelAndView("AnimatorHesap");
		maw.addObject("Animator",animator);
		return maw;
	}
	
	@GetMapping(path="/get")
	public ModelAndView animatorCustomer()
	{
		ModelAndView maw = new ModelAndView("AnimatorList");
		maw.addObject("Animator",animatorService.animatorCustomer());
		return maw;
	}
	
	@DeleteMapping(path="{EmployeeId}")
	public ModelAndView deleteAnimator(@PathVariable("EmployeeId") Long EmployeeId)
	{
		animatorService.deleteAnimator(EmployeeId);
		return new ModelAndView("redirect:http://localhost:8080/animator/get");
	}
	
	@GetMapping(path="login", params = {"login_button"})
    public ModelAndView loginAnimator(String phoneNumber,String aniUserPassword)
    {
        Animator animator = animatorService.grs(phoneNumber, aniUserPassword);
        if(animator != null)
        {
        	 ModelAndView maw = new ModelAndView("AnimatorHesap");
             maw.addObject("Animator",animator);
             return maw;
        }
        else
        {
            System.out.println("Kullanıcı bulunamadı");
            return new ModelAndView("redirect:http://localhost:8080");
        }
    }
}
