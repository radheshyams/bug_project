package com.iris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iris.UserService.BugStatusService;
import com.iris.UserService.BugStatusUpdateService;
import com.iris.model.BugDetails;
import com.iris.model.BugStatus;

@Controller
public class DeveloperController {
	@Autowired
	BugStatusService bugStatusService;
	@Autowired
	BugStatusUpdateService bugStatusUpdateservice;
	
	@RequestMapping(value="/UpdateBugStatus",method=RequestMethod.GET)
	public ModelAndView getBug(){
		List<BugStatus>bgStatusList=bugStatusService.getAllBugStatus();
		List<BugDetails>bgdetailList=bugStatusUpdateservice.getAllotedBugToUpdate();
		System.out.println("bug setails from bug_details"+bgdetailList);
		ModelAndView mv=new ModelAndView("UpdateBugStatus");
		mv.addObject("bgstusList",bgStatusList);
		mv.addObject("bugDetailList",bgdetailList);
	return mv;

}
	
}
