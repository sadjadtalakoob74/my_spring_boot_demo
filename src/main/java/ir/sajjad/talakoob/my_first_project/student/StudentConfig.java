package ir.sajjad.talakoob.my_first_project.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
        return args -> {
            Student maryam = new Student( "maryam", "sajjad@me.com", 26, LocalDate.of(2000, APRIL, 5));
            Student alex = new Student("alex", "sajjad@me.com", 26, LocalDate.of(2000, APRIL, 5));
            Student sajjad = new Student("sajjad", "sajjad@me.com", 26, LocalDate.of(2000, APRIL, 5));

            studentRepo.saveAll(List.of(maryam,alex,sajjad));
        };
    }
}
