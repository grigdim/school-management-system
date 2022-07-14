package net.grigdim.sms.repos;

import net.grigdim.sms.entities.Course;
import net.grigdim.sms.entities.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeacherRepoTest {

    @Autowired
    private TeacherRepo teacherRepo;

    @Test
    public void saveTeacher() {

        Course courseDBA = Course.builder()
                .courseTitle("DBA")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .courseTitle("Java")
                .credit(6)
                .build();

        Teacher teacher =
                Teacher.builder()
                        .firstName("John")
                        .lastName("Doe")
                        //.courses(List.of(courseDBA,courseJava))
                        .build();

        teacherRepo.save(teacher);
    }
}