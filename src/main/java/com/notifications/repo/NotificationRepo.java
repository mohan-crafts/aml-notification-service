package com.notifications.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notifications.entity.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Long> {
		
}