package com.db.dcs.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic(1,"Spring Boot","Spring Boot Description"),
			new Topic(2,"Core Java","Core Java Description"),
			new Topic(3,"Java Script","Java Script Description")
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(int id)
	{
		return topics.stream().filter(t -> t.getId()==id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		
		topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {
		for (int i=0;i<topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getId()==id)
			{
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void updateTopic(int id) {
		topics.removeIf(t -> t.getId()==id);
		
	}
}
