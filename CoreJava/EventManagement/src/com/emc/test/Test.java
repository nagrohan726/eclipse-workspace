package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;
import com.emc.managers.EventManagerImpl2;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();

		organizer.setId(123l);
		organizer.setName("Apple Inc.");

		System.out.println(organizer);
		System.out.println(organizer.getName());

		Event event = new Event(456L, "iPhone 100 Launch", "Grand Launch");

//		event.id = 456l;
//		event.name = "iPhone 100 Launch";
//		event.description = "Grand Launch";

		System.out.println(event.getDescription());
		System.out.println(event.getName());

		EventManager em = new EventManagerImpl();
		System.out.println(em.create(456L).getId());

		em = new EventManagerImpl2();
		System.out.println(em.create(456L).getName());
	}

}
