package net.grigdim.sms.repos;

import net.grigdim.sms.entities.Course;
import net.grigdim.sms.entities.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class CourseMaterialTest {

    @Autowired
    private CourseMaterialRepo repository;

    @Test
    public void SaveCourseMaterial() {
        Course course =
                Course.builder()
                        .courseTitle(".net")
                        .credit(6)
                        .build();

        CourseMaterial courseMaterial =
                CourseMaterial.builder()
                        .courseMaterialUrl("www.dailycodebuffer.com")
                        .course(course)
                        .build();

//        repository.save(courseMaterial);
        repository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterials() {
        List<CourseMaterial> courseMaterials =
                repository.findAll();

        System.out.println("courseMaterials = " + courseMaterials);
    }
}