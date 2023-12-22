package com.employee.controller;

import com.employee.pojo.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {





    @RequestMapping("/v1/hello")
    Employee getHelloWorld()
    {
        Employee emp1 = new Employee();
        emp1.setEmpName("abc");
        emp1.setEmpId(100);
        emp1.setAddress("noida");
        emp1.setSalary("10000");
        emp1.setPinCode(101010);
        emp1.setDob("01/01/2004");

        return emp1;
    }


}
