package com.notifications.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifications.entity.Notification;
import com.notifications.repo.NotificationRepo;

@Service
public class NotificationService {
	
	@Autowired NotificationRepo notificationRepo;
	
	public List<Notification> getNotifications() {
		
		return notificationRepo.findAll();
	}
	
	public Notification getNotificationById(Long id) {
		
		return notificationRepo.findById(id).get();
	}
	
	public Notification createNotification(Notification notification) {
		
		return notificationRepo.save(notification);
	}
	
	public Notification updateNotification(Notification notification) {
		
		return notificationRepo.save(notification);
	}
	
	public void deleteNotification(Long notificationId) {
		notificationRepo.deleteById(notificationId);
	}
}