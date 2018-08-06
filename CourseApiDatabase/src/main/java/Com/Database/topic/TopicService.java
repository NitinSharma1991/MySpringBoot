package Com.Database.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {
    @Autowired
    private TopicRepository TopicRepository;


   public List getAllTopics () {
    //return cours;
    List<Topic> topics = new ArrayList<>();
       TopicRepository.findAll().forEach(topics::add);
       return topics;
   }
public Topic getTopic(String id){

return TopicRepository.findOne(id);
   }
public void addTopic(List<Topic> Topic) {
        TopicRepository.save(Topic);
}
public void updateTopic(Topic Topic, String id) {
         TopicRepository.save(Topic);
        }
    }

