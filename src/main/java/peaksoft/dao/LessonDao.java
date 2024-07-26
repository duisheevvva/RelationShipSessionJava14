package peaksoft.dao;

import peaksoft.entity.Lesson;

import java.util.List;

public interface LessonDao {

//    CRUD
    String saveLessonToCourse(Long courseId, Lesson lesson);


//    Dop methods
     String deleteLessonByCourseId(Long courseId,Long lessonId);
     List<Lesson> sortLessonByPublishedDate();

}
