package co.za.trclngroup.coursesapi.course;

import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
}
