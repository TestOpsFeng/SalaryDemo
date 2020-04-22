package top.testops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @ClassName Employees
  * @Description TODO
  * @author carson
  * @date 2020/4/22
**/
@RestController
@RequestMapping("/employees")
public class Employees {
    @GetMapping
    public void saveEmployee(){

    }
}
