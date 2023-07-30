package com.example.demo.EmergencyInfo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmergencyInfoService 
{
	private final EmergencyInfoRepository emergencyInfoRepository;
	
	@Autowired
	public EmergencyInfoService(EmergencyInfoRepository emergencyInfoRepository)
	{
		this.emergencyInfoRepository=emergencyInfoRepository;
	}
	
	public void addEmergencyInfo(EmergencyInfo emergencyInfo)
	{
		emergencyInfoRepository.save(emergencyInfo);
	}
	
	public void deleteEmergencyInfo(Long LockerNumber) 
	{
		emergencyInfoRepository.deleteById(LockerNumber);

	}
	
	public EmergencyInfo EmergencyInfoList(Long Id)
	{
		Optional<EmergencyInfo> emergencyInfoOptional = emergencyInfoRepository.getInfoByActivityId(Id);
        if(emergencyInfoOptional.isPresent())
        {
            EmergencyInfo info = emergencyInfoOptional.orElseThrow(()-> new IllegalStateException(""));
            return info;
        }
        return null;
	}
	
}
