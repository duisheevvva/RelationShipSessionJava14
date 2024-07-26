package peaksoft.dao;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentDao {
    String saveStudent(Student student);
    String assignStudentToCourse(Long studentId, List<Long> courseId);
}
