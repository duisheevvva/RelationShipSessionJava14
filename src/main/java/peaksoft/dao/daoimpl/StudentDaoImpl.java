package peaksoft.dao.daoimpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.StudentDao;
import peaksoft.entity.Course;
import peaksoft.entity.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    EntityManagerFactory entityManagerFactory  = HibernateConfig.getEntityManager();
    @Override
    public String saveStudent(Student student) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Success";
    }

    @Override
    public String assignStudentToCourse(Long studentId, List<Long> courseId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, studentId);
        List<Course> course = entityManager.createQuery("select c from Course c where id in (:courseId)")
                .setParameter("courseId",courseId).getResultList();
        student.setCourses(course);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Success";
    }
}
