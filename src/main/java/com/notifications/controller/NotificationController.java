package com.notifications.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notifications.entity.Notification;
import com.notifications.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
	
	@Autowired NotificationService notificationService;
	
	@GetMapping("")
	public ResponseEntity<List<Notification>> getNotifications() {
		return ResponseEntity.ok(notificationService.getNotifications());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Notification> getNotificationById(@PathVariable("id") Long bookID) {
		return ResponseEntity.ok(notificationService.getNotificationById(bookID));
	}
	
	@PostMapping("")
	public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
		
		return ResponseEntity.ok(notificationService.createNotification(notification));
	}
	
	@PutMapping("")
	public ResponseEntity<Notification> updateNotification(@RequestBody Notification notification) {
		
		return ResponseEntity.ok(notificationService.updateNotification(notification));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteNotification(@PathVariable("id") Long notificationId) {
		notificationService.deleteNotification(notificationId);
		return ResponseEntity.ok(true);
	}
}