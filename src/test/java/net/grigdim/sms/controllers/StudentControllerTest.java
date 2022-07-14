//package net.grigdim.sms.controllers;
//
//import net.grigdim.sms.entities.Student;
//import net.grigdim.sms.exceptions.StudentNotFoundException;
//import net.grigdim.sms.services.StudentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//
//@WebMvcTest(StudentController.class)
//class StudentControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private StudentService studentService;
//
//    private Student student;
//
//    @BeforeEach
//    void setUp() {
//        Student student = Student.builder().firstName("Minas").lastName("Androulakakis").email("mandroulakakis@gmail.com").id(1L).build();
//    }
//
//    @Test
//    void saveStudent() throws Exception {
//        Student inputStudent = Student.builder().firstName("Minas").lastName("Androulakakis").email("mandroulakakis@gmail.com").build();
//
//        Mockito.when(studentService.saveStudent(inputStudent)).thenReturn(student);
//
//        mockMvc.perform(post("/students").contentType(MediaType.APPLICATION_JSON).content("{\n" + "    \"firstName\": \"John\",\n" + "    \"lastName\": \"Doe\",\n" + "    \"email\": \"johnDoe@gmail.com\"\n" + "}")).andExpect(status().isOk());
//
//    }
//
//    @Test
//    void getStudentById() throws Exception {
//        Mockito.when(studentService.getStudentById(1L)).thenReturn(student);
//
//        mockMvc.perform(get("/students/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$.firstName").value(student.getFirstName()));
//    }
//}