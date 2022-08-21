package ir.sajjad.talakoob.my_first_project;

import ir.sajjad.talakoob.my_first_project.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class MyFirstSpringBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
    }


}
