package co.za.trclngroup.coursesapi.topic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(id);
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
