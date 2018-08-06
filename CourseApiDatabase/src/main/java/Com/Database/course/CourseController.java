package Com.Database.course;

import Com.Database.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/topics/{topicId}/courses")
public List<Course> getAllCourses (@PathVariable String topicId) {

        //noinspection unchecked
        return courseService.getAllCourses(topicId);
}

@RequestMapping("/topics/{topicId}/courses/{id}")
public Course getCourse(@PathVariable String id)
{
return courseService.getCourse(id);
}
@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public  void addCourse(@RequestBody Course course,@PathVariable String topicId){
    course.setTopic(new Topic(topicId," "," "));
    courseService.addCourse(course);
    }
 @RequestMapping(method = RequestMethod.PUT, value = "topics/{topicId}/courses/{id}")
    public  void updateCourse(@RequestBody Course course, @PathVariable String id,@PathVariable String topicId){
     course.setTopic(new Topic(topicId," "," "));
     courseService.updateCourse(course,id);
    }
}
