package io.javabrains.springbootstarter.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript", "Javascript Description"),
			new Topic("HTML", "HTML Basics", "HTML Description")
			));
	

	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Optional<Topic> getTopic(String id) {

		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
			
		return topicRepository.findById(id);
	}

	public String addtopic(Topic topic) {
		// TODO Auto-generated method stub
		//topics.add(topic);
		topicRepository.save(topic);
		return "Added topic successfully";
	}

	public String updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		return "Updated topic with id : "+id+" successfully";
	}

	public String deleteTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
		return null;
	}
}
