package com.emc.managers;

import com.emc.entities.Event;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create(long id) {
		return new Event(id, "Mac Book Launch", "New Generation of Mac Books Launch");
	}

}
