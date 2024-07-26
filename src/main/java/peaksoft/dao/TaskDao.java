package peaksoft.dao;

public interface TaskDao {
//    CRUD
    String saveTaskToLesson(Long taskId,Long lessonId);


//    DOP methods
//    TODO Eger Task'tyn dealine'ny buto elek bolso Task ochup ketpesh kerek
     String deleteTaskByDeadline(Long taskId);



}
