package com.example.demo.MassActivity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MassActivityService 
{
	private final MassActivityRepository massActivityRepository;
	
	@Autowired
	public MassActivityService(MassActivityRepository massActivityRepository) {
		this.massActivityRepository=massActivityRepository;
	}
	
	public List<MassActivity> getMassActivity()
	{
		return massActivityRepository.findAll();
	}


	public void addMassActivity(MassActivity massActivity)
	{
		massActivityRepository.save(massActivity);
	}
	
	public void deleteMassActivity(Long ActivityId) 
	{
		massActivityRepository.deleteById(ActivityId);

	}
	
}
