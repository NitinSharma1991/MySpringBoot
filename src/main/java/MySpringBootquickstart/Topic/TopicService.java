package MySpringBootquickstart.Topic;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {
private List<Topic> Topics = new ArrayList<>(Arrays.asList(
        new Topic("1","Maths","Learn Maths"),
            new Topic("2","Physics","Learn Physics"),
            new Topic("3","Chemistry","Learn Chemistry")
));

   public List getAllTopics () {
    return Topics;
}
public Topic getTopic(String id){

    Iterator<Topic> itr = Topics.listIterator();
    while (itr.hasNext())
    {
     Topic  Topic = itr.next();
       if (Topic.getId().equals(id))
           break;
    }
    return ((ListIterator<Topic>) itr).previous();
}
public void addTopic(Topic Topic) {
Topics.add(Topic);
}
public void updateTopic(Topic Topic,String id) {
        for (int i=0;i<Topics.size();i++){
            Topic t =Topics.get(i);
            if (t.getId().equals(id)){
                Topics.set(i,Topic);
                  return;
            }
        }
    }
}
