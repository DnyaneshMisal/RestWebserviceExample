package org.dnyanesh.site.messanger.database;

import java.util.HashMap;
import java.util.Map;

import org.dnyanesh.site.messanger.model.Message;
import org.dnyanesh.site.messanger.model.Profile;

public class DatabaseClass {
	
	private  static Map<Long, Message> messages= new HashMap<>();
	private  static Map<Long, Profile> profiles= new HashMap<>();
	
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}

}
