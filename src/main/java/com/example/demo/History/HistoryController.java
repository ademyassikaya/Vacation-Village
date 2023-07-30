package com.example.demo.History;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(path= "History",method= {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST})
public class HistoryController 
{
	private final HistoryRepository historyRepository;
	
	@Autowired
	public HistoryController(HistoryRepository historyRepository) {
	this.historyRepository=historyRepository;	
	}

	
	
	@GetMapping(path="/get")
	public ModelAndView historysyf()
	{
		ModelAndView maw = new ModelAndView("HistorySyf");
		maw.addObject("History",historyRepository.findAll());
		return maw;
	}
	
	
}
