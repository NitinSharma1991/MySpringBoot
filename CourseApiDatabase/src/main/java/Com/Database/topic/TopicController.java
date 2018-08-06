package Com.Database.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService Topicservice;
    @RequestMapping("/topics")
public List<Topic> getAllTopics () {

        //noinspection unchecked
        return Topicservice.getAllTopics();
}

@RequestMapping("/topics/{id}")
public Topic getTopic(@PathVariable String id)
{
return Topicservice.getTopic(id);
}
@RequestMapping(method = RequestMethod.POST, value = "/topics")
    public  void addTopic(@RequestBody List<Topic> topic){
        Topicservice.addTopic(topic);
    }
 @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public  void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        Topicservice.updateTopic(topic,id);
    }
}
