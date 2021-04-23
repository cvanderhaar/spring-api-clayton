package co.za.trclngroup.coursesapi.course;

import co.za.trclngroup.coursesapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Topic getCourse(String id) {
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}

/*
  Old name       ║       New name        ║
╠═════════════════════╬═══════════════════════╣
║ findOne(…)          ║ findById(…)           ║
╠═════════════════════╬═══════════════════════╣
║ save(Iterable)      ║ saveAll(Iterable)     ║
╠═════════════════════╬═══════════════════════╣
║ findAll(Iterable)   ║ findAllById(…)        ║
╠═════════════════════╬═══════════════════════╣
║ delete(ID)          ║ deleteById(ID)        ║
╠═════════════════════╬═══════════════════════╣
║ delete(Iterable)    ║ deleteAll(Iterable)   ║
╠═════════════════════╬═══════════════════════╣
║ exists()            ║ existsById(…)
 */
