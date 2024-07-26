package peaksoft.service.serviceImpl;

import peaksoft.dao.CourseDao;
import peaksoft.dao.daoimpl.CourseDaoImpl;
import peaksoft.entity.Course;
import peaksoft.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private final CourseDao courseDao = new CourseDaoImpl();
    @Override
    public String saveCourse(Course course) {
        return courseDao.saveCourse(course);
    }

    @Override
    public Course getCourseById(Long courseId) {
        return null;
    }

    @Override
    public String updateCourse(Long courseId, Course newCourse) {
        return null;
    }

    @Override
    public String deleteCourse(Long courseId) {
        return null;
    }

    @Override
    public List<Course> getAllCourse() {
        return null;
    }

    @Override
    public int countOfStudentByCourseId(Long courseId) {
        return courseDao.countOfStudentByCourseId(courseId);
    }

    @Override
    public void deleteAllStudentByCourseId(Long courseId) {
        courseDao.deleteAllStudentByCourseId(courseId);

    }
}
