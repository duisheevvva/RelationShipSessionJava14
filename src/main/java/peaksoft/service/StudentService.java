package peaksoft.service;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentService {
    String saveStudent(Student student);
    String assignStudentToCourse(Long studentId, List<Long> courseId);
}
