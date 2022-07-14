//package net.grigdim.sms.services;
//
//import net.grigdim.sms.entities.Student;
//import net.grigdim.sms.repos.StudentRepo;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class StudentServiceTest {
//
//    @Autowired
//    private StudentService studentService;
//
//    @MockBean
//    private StudentRepo studentRepo;
//
//    @BeforeEach
//    void setUp() {
//        Student student =
//                Student.builder()
//                        .firstName("Minas")
//                        .lastName("Androulakakis")
//                        .email("mandroulakakis@gmail.com")
//                        .build();
//
//        Mockito.when(studentRepo.findByFirstNameIgnoreCase("Minas")).thenReturn(student);
//    }
//
//    @Test
//    public void whenValidStudentName_thenStudentShouldBeFound() {
//        String studentName = "Minas";
//        Student found = studentService.getStudentByFirstName(studentName);
//
//        assertEquals(studentName, found.getFirstName());
//    }
//}