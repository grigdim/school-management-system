package net.grigdim.sms.repos;

import net.grigdim.sms.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    List<Student> findByFirstNameIgnoreCase(String firstName);

    List<Student> findByLastNameIgnoreCase(String lastName);

    Student findByFirstNameAndLastName(String firstName, String lastName);

    List<Student> findByFirstNameContaining(String name);

    List<Student> findByLastNameNotNull();

    List<Student> findByGuardianName(String guardianName);

//    //JpaRepository can provide search methods for all attributes of an entity by using the 'findBy' followed by the name of tha attribute
//    //if there is a need for a custom search query we can do so by using the @Query annotation and defining our custom query (?1 points to the first param of the method)
//    //JPQL
//    @Query("select s from Students s where s.email= ?1")
//    Student getStudentByEmailAddress(String email);
//
//    //returns the first name of the student with the given email
//    //JPQL
//    @Query("select s.firstName from Students s where s.email= ?1")
//    String getStudentFirstNameByEmailAddress(String email);
//
//    //apart from jpql there are also native queries for more complex processes
//    @Query(value = "SELECT * FROM students s where s.email = ?1", nativeQuery = true)
//    Student getStudentByEmailAddressNative(String email);
//
//    //we can also use named params for more ease
//    @Query(value = "SELECT * FROM students s where s.email = :email", nativeQuery = true)
//    Student getStudentByEmailAddressNativeNamedParam(@Param("email") String email);
}