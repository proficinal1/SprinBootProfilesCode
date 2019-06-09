package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;
@Component
@Profile("dml")
public class DMLNotificationService implements INotificationService{

	@Override
	public void notification() {
		System.out.println("DML Notification Service");
	}

}
