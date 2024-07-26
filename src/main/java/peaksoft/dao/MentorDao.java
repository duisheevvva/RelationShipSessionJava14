package peaksoft.dao;

import peaksoft.entity.Mentor;

import java.util.List;

public interface MentorDao {
//    CRUD
//    DopMethods
    String assignMentorToCourse(Long courseId,Long mentorId);
    List<Mentor> getAllMentorsByCourseId(Long courseId);
}
