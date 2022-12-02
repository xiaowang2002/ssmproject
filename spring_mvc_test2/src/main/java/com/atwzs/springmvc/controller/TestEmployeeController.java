package com.atwzs.springmvc.controller;

import com.atwzs.springmvc.dao.EmployeeDao;
import com.atwzs.springmvc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @ClassName TestEmployeeController
 * @Description
 * @Author WangZhisheng
 * @Date 11:36 2022/11/27
 * @Version 11.0.15
 */
@Controller
public class TestEmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
//        重定向到列表功能
        //不能是转发，因为地址栏不变，
        return "redirect:/employee";
    }

    @RequestMapping("/to/add")
    public String addEmployeeTwo() {
        return "employee_add";
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";
    }

    @RequestMapping("/employee/{id}")
    public String updateEmployee(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }

    @PutMapping("/employee")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }
}
