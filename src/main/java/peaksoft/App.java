package peaksoft;

import peaksoft.config.HibernateConfig;
import peaksoft.entity.Course;
import peaksoft.entity.Student;
import peaksoft.service.CourseService;
import peaksoft.service.StudentService;
import peaksoft.service.serviceImpl.CourseServiceImpl;
import peaksoft.service.serviceImpl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        CourseService courseService = new CourseServiceImpl();
//        courseService.saveCourse(new Course("English",8000, LocalDate.of(2023,01,01)));
//        studentService.saveStudent(new Student("Janbolot","janbolot@gmail.com",1999));
//        List<Long> courseIds = new ArrayList<>();
//        courseIds.add(1L);
//        courseIds.add(2L);
//        System.out.println(studentService.assignStudentToCourse(3L, courseIds));
//        System.out.println("Count of students : ");
//        System.out.println(courseService.countOfStudentByCourseId(1L));
          courseService.deleteAllStudentByCourseId(1L);

    }
}
