package Com.Database.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository CourseRepository;


   public List getAllCourses (String topicId) {
    //return topic;
    List<Course> courses= new ArrayList<>();
       CourseRepository.findByTopicId(topicId).forEach(courses::add);
       return courses;
   }
public Course getCourse(String id){

return CourseRepository.findOne(id);
   }
public void addCourse(Course course) {
        CourseRepository.save(course);
}
public void updateCourse(Course course, String id) {
         CourseRepository.save(course);
        }
    }

