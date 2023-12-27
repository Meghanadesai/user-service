package com.rest.webservice.restfulwebservice.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Mark",LocalDate.now().minusYears(40)));
		users.add(new User(2,"Jack",LocalDate.now().minusYears(47)));
		users.add(new User(3,"Leo",LocalDate.now().minusYears(20)));
		users.add(new User(4,"Ana",LocalDate.now().minusYears(35)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();		
	}
}
