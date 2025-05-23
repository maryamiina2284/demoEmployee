package com.exampleEmployee;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {


    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    //requests
    @GetMapping("/")
    public String getHomePage() {
        return "home"; //view name
    }
    @GetMapping("/Register")
    public String getRegister(){
        return "Register"; //view name
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee empl){
        service.insertEmployee(empl);
        return "redirect:/All";
    }
    @GetMapping("/All")
    public String getAll(Model model, @Param("keyword") Long keyword){
        List<Employee> list = service.getAllEmployee(keyword);
        model.addAttribute("employees" , list);
        model.addAttribute("keyword" , keyword);
        return "ListEmployee";
    }
    @RequestMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        service.deleteEmployee(id);
        return "redirect:/All";
    }
    @RequestMapping("/Edit/{id}")
    public String UpdateEmployee(@PathVariable Long id, Model model){
        Employee empl= service.getEmployeeById(id);
        model.addAttribute("employee" , empl);
        return "EditEmployee";  //view name
    }
}
