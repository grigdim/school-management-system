package net.grigdim.sms.repos;

import net.grigdim.sms.entities.Student;
import net.grigdim.sms.entities.Guardian;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .email("johndoe@gmail.com")
                .firstName("John")
                .lastName("Doe")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("janedoe@gmail.com")
                .name("Jane")
                .mobile("9999956324")
                .build();

        Student student = Student.builder()
                .firstName("John")
                .email("johndoe@gmail.com")
                .lastName("Doe")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName() {

        List<Student> students =
                studentRepository.findByFirstNameIgnoreCase("john");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining() {

        List<Student> students =
                studentRepository.findByFirstNameContaining("jh");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students =
                studentRepository.findByGuardianName("Jane");
        System.out.println("students = " + students);
    }

//    @Test
//    public void printgetStudentByEmailAddress() {
//        Student student =
//                studentRepository.getStudentByEmailAddress(
//                        "shabbir@gmail.com"
//                );
//
//        System.out.println("student = " + student);
//    }
//
//    @Test
//    public void printgetStudentFirstNameByEmailAddress() {
//        String firstName =
//                studentRepository.getStudentFirstNameByEmailAddress(
//                        "shivam@gmail.com"
//                );
//        System.out.println("firstName = " + firstName);
//    }
//
//    @Test
//    public void printgetStudentByEmailAddressNative(){
//        Student student =
//                studentRepository.getStudentByEmailAddressNative(
//                        "shivam@gmail.com"
//                );
//
//        System.out.println("student = " + student);
//    }
//
//    @Test
//    public void printgetStudentByEmailAddressNativeNamedParam() {
//        Student student =
//                studentRepository.getStudentByEmailAddressNativeNamedParam(
//                        "shivam@gmail.com"
//                );
//
//        System.out.println("student = " + student);
//    }
//
//    @Test
//    public void updateStudentNameByEmailIdTest() {
//        studentRepository.updateStudentNameByEmailId(
//                "shabbir dawoodi",
//                "shabbir@gmail.com");
//    }

}