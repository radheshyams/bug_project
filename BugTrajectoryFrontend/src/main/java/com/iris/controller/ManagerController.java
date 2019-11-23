package com.iris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iris.UserService.BugTypeService;
import com.iris.UserService.ProjectService;
import com.iris.UserService.SeverityService;
import com.iris.UserService.UserService;
import com.iris.model.BugType;
import com.iris.model.Project;
import com.iris.model.Severity;
import com.iris.model.User;

@Controller
public class ManagerController {
	@Autowired
	UserService userService;
	@Autowired
	ProjectService projectService;
	
	
	
	@RequestMapping(value="/Manager",method=RequestMethod.POST)
	  public ModelAndView getProjectAllocation(@RequestParam String project,@RequestParam int[] Developer,@RequestParam int[] Tester){
	              
	       Project pObj=projectService.getProjectById(project);
	       
	         List<User> usersList=pObj.getUser();
	              
	              for(int i:Developer) {
	                     
	                     User uObj=userService.getUserById(i);

	                     uObj.getProjects().add(pObj);
	                     
	                     usersList.add(uObj);
	                     }
	              
	              for(int i:Tester) {
	                     User uObj=userService.getUserById(i);
	                     uObj.getProjects().add(pObj);
	                     usersList.add(uObj);
	              }
	              
	              pObj.setUser(usersList);
	              
	              
	              System.out.println(pObj);
	              projectService.updateProject(pObj);
	              System.out.println("Project Obj : "+pObj);
	              
	   
		
		List<Project> prList=projectService.getAllProject();
	
		List<User> deList=userService.getAllDev();
	
		List<User> tsList=userService.getAllTest();
		
		ModelAndView mv=new ModelAndView("ManagerPage");
		mv.addObject("proList",prList);
		mv.addObject("devList",deList);
		mv.addObject("tstList",tsList);
		return mv;
	}
	


}
