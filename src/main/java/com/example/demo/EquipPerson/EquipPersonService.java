package com.example.demo.EquipPerson;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EquipPersonService 
{
	private final EquipPersonRepository equipPersonRepository;
	
	@Autowired
	public EquipPersonService(EquipPersonRepository equipPersonRepository)
	{
		this.equipPersonRepository=equipPersonRepository;
	}
	
	public void addEquipPerson(EquipPerson equipPerson)
	{
		equipPersonRepository.save(equipPerson);
	}
	
	public void deleteEquipPerson(Long Ssn) 
	{
		equipPersonRepository.deleteById(Ssn);

	}
	
	public List<EquipPerson> equipPersonList()
	{
		return equipPersonRepository.findAll();
	}
	
	public EquipPerson grs(String equPhoneNumber,String equUserPassword)
	{
		EquipPerson equipPerson = equipPersonRepository.find(equPhoneNumber,equUserPassword).orElseThrow(() -> new IllegalStateException(""));
        return equipPerson;
	
	}

}
