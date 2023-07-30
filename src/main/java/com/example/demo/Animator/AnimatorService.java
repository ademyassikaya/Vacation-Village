package com.example.demo.Animator;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class AnimatorService 
{
	private final AnimatorRepository animatorRepository;
	
	@Autowired
	public AnimatorService(AnimatorRepository animatorRepository)
	{
		this.animatorRepository=animatorRepository;
	}
	
	public void addAnimator(Animator animator)
	{
		 animatorRepository.save(animator);
	}
	
	public void deleteAnimator(Long EmployeeId) 
	{
		animatorRepository.deleteById(EmployeeId);

	}
	
	public List<Animator> animatorCustomer()
	{
		return animatorRepository.findAll();
	}
	
	public Animator grs(String phoneNumber,String aniUserPassword)
	{
        Animator animator = animatorRepository.find(phoneNumber,aniUserPassword).orElseThrow(() -> new IllegalStateException(""));
        return animator;
	
	}
}
