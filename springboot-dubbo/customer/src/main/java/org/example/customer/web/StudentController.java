package org.example.customer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.customer.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller()
public class StudentController {
    @Reference(interfaceClass = StudentService.class, check = false)
    private StudentService studentService;

    @RequestMapping("/findstudnt/123")
    @ResponseBody
    public Object studentCont() {
        System.out.println("=======================================================");
        int count = studentService.findStudentCont();
        return "123" + count;
    }
}
