package peaksoft.dao.daoimpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.CourseDao;
import peaksoft.entity.Course;

import java.util.List;

public class CourseDaoImpl implements CourseDao {

    EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManager();
    @Override
    public String saveCourse(Course course) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Success";
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
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
//        int countOfStudent = (int) entityManager.createNativeQuery("select count(s.students_id) from students_courses s where s.courses_id =?", Integer.class)
//                .setParameter(1, courseId).getSingleResult();
        Long countOfStudent = entityManager.createQuery("select count(s.id) from Student s inner join s.courses sc where sc.id = :courseId", Long.class)
                .setParameter("courseId", courseId).getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return countOfStudent.intValue();
    }

    @Override
    public void deleteAllStudentByCourseId(Long courseId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNativeQuery("DELETE FROM students_courses WHERE courses_id =:courseId")
                .setParameter("courseId", courseId)
                .executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Success");
    }
}
