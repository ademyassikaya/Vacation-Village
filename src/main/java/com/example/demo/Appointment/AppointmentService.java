package com.example.demo.Appointment;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AppointmentService 
{
	private final AppointmentRepository appointmentRepository;
	
	@Autowired
	public AppointmentService(AppointmentRepository appointmentRepository)
	{
		this.appointmentRepository=appointmentRepository;
	}
	
	public void addAppointment(Appointment appointment)
	{
		appointmentRepository.save(appointment);
	}
	
	public List<Appointment> appointmentlist()
	{
		return appointmentRepository.findAll();
	}
	
	public void deleteAppointment(Long ActivityId) 
	{
		appointmentRepository.deleteById(ActivityId);

	}
}
