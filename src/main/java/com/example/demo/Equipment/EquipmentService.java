package com.example.demo.Equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService 
{
private final EquipmentRepository equipmentRepository;
	
	@Autowired
	public EquipmentService(EquipmentRepository equipmentRepository)
	{
		this.equipmentRepository=equipmentRepository;
	}
	
	public void addEquipment(Equipment equipment)
	{
		equipmentRepository.save(equipment);
	}
	
	public void deleteEquipment(Long Ssn) 
	{
		equipmentRepository.deleteById(Ssn);

	}
	
	public List<Equipment> equipmentList()
	{
		return equipmentRepository.findAll();
	}
	
}
