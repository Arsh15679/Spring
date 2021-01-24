package com.List.Exe1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.List.Exe1.dao.WorkerRepo;
import com.List.Exe1.model.Workers;
@Controller
public class WorkerControl {
	
	@Autowired
	WorkerRepo dao;
	
	@RequestMapping("/")
	public String Home() {
		return "Home.jsp";
	}
	@RequestMapping("/AddWorkers")
	public String AddWorker(Workers Work) {
		
		dao.save(Work);
		return "Home.jsp";
	}

}
