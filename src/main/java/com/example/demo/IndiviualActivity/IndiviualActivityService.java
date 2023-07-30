package com.example.demo.IndiviualActivity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MassActivity.MassActivity;



@Service
public class IndiviualActivityService 
{
	
	private final IndiviualActivityRepository indiviualActivityRepository;
	
	@Autowired
	public IndiviualActivityService(IndiviualActivityRepository indiviualActivityRepository) {
		this.indiviualActivityRepository=indiviualActivityRepository;
	}
	
	public List<IndiviualActivity> getIndiviualActivity()
	{
		return indiviualActivityRepository.findAll();
	}


	public void addIndiviualActivity(IndiviualActivity indiviualActivity)
	{
		indiviualActivityRepository.save(indiviualActivity);
	}
	
	public void deleteIndiviualActivity(Long ActivityId) 
	{
		indiviualActivityRepository.deleteById(ActivityId);

	}
	
	public void addIndiviualActivity2(IndiviualActivity indiviualActivity)
	{
		indiviualActivityRepository.save(indiviualActivity);
	}
}
