package peaksoft.dao;

import peaksoft.entity.Course;

import java.util.List;

public interface CourseDao {
    String saveCourse(Course course);

    Course getCourseById(Long courseId);

    String updateCourse(Long courseId, Course newCourse);

    String deleteCourse(Long courseId);

    List<Course> getAllCourse();
    int countOfStudentByCourseId(Long courseId);
    void deleteAllStudentByCourseId(Long courseId);

}
