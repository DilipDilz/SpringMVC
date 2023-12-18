package com.jsp.Service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.EmployeeDao;
import com.jsp.Entity.Employee;

@Component
public class EmployeeService {
	
    employeeService.saveEmployee(employee) ;
    mav.setViewName("index.jsp");
    return mav ;
  }
  @RequestMapping("find")
  public ModelAndView findEmployee(ModelAndView mav) {
    mav.setViewName("findemployee.jsp");
    return mav ; 
  }
  @RequestMapping(value = "findemployee", method = RequestMethod.POST)
  public ModelAndView displyFindEmployee(HttpServletRequest request, ModelAndView mav) {
    System.out.println("Its Hitting");
    int id = Integer.parseInt(request.getParameter("id")) ;

    System.out.println("The id Is : "+Integer.parseInt(request.getParameter("id")));

    EmployeeService employee2 = EmployeeService.findEmployee(id) ;
    System.out.println(employee2);
    mav.addObject("emp", employee2) ;
    mav.setViewName("displayemployee.jsp");
    return mav ;
  }
}