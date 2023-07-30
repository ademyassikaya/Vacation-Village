package com.example.demo.Appointment;



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
@RequestMapping(path= "appointment",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class AppointmentController 
{
	private final AppointmentService appointmentService;
	
	@Autowired
	public AppointmentController(AppointmentService appointmentService)
	{
		this.appointmentService=appointmentService;
	}
	
	
	@PostMapping(path = "/{CustomerId}/{AnimatorId}/{ActivityId}/{DateHour}/{activityType}",params="register_button")
    public ModelAndView addAppointment(@PathVariable("CustomerId") Long customerId,@PathVariable("AnimatorId") Long animatorId,
            @PathVariable("ActivityId") Long activityId,@PathVariable("DateHour") String date,@PathVariable("activityType") String type)
    {
        Appointment appointment = new Appointment(activityId,customerId,animatorId,date);
        String path = "redirect:localhost://MassActivity/getAll/"+customerId;
        appointmentService.addAppointment(appointment);
        return new ModelAndView(path);

    }
	
	@GetMapping(path="/get")
	public ModelAndView appointmentlist()
	{
		ModelAndView maw = new ModelAndView("AppointmentListManager");
		maw.addObject("Appointment",appointmentService.appointmentlist());
		return maw;
	}
	
	@DeleteMapping(path="{ActivityId}")
	public ModelAndView deleteAnimator(@PathVariable("ActivityId") Long ActivityId)
	{
		appointmentService.deleteAppointment(ActivityId);
		return new ModelAndView("redirect:http://localhost:8080/appointment/get");
	}
	
}
