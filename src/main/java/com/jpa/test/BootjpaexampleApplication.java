package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
	    
		UserRepository userRepository = context.getBean(UserRepository.class);
/*
	    //to set data create object of user class or you want
		User user1 = new User();
		user1.setName("golu");
		user1.setCity("city3");
		user1.setStatus("online");
		
		
		User user2 = new User();
		user2.setName("rinku");
		user2.setCity("city4");
		user2.setStatus("student2");
		
*/		
		/*
		// saving single user this save and also return data to use .
		User user0 = userRepository.save(user1);
		System.out.println("Single Saved user"+user0);
		*/

/*		
		//making list of multiple user
		List<User> users = List.of(user1,user2);
		//saving multiple user by pass list
		Iterable<User> result = userRepository.saveAll(users);
		
		print multiple user by foreach using lamda expression
		result.forEach(user->{System.out.println(user);});
*/

	/*	
		//update 
		Optional<User> optional = userRepository.findById(9);
		User user = optional.get();
		user.setName("Rahul");
		User result1 = userRepository.save(user);
		System.out.println("this is updated result"+result1);
	*/
	
	/*	
		// how to get data there is 3 ways 
	   //by findById -return Optional Containing your data
	
		//using lambda function short and easy way
		Iterable<User> itr = userRepository.findAll();
	    itr.forEach(user->{System.out.println(user);});
		
	*/	
		
	/*	
		Iterable<User> itr = userRepository.findAll();
       //this is old appproach
        Iterator<User> iterator = itr.iterator();	
	     while (iterator.hasNext()) {
			User user1 = iterator.next();
			System.out.println(user1);
		}
	*/
	/*	
		// tis method is also lengthy so we not use this also
		Iterable<User> itr = userRepository.findAll();
        itr.forEach(new Consumer<User>() {

			@Override
			public void accept(User t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
	*/
	
	    
	    //deleting 
	   
	    /*
	    //delete single by id
	    userRepository.deleteById(9);
	    System.out.println("Deleted`");
	    */
	   /* 
	    //delete multiple by iterable or delete all
	    Iterable<User> alluser = userRepository.findAll();
	    alluser.forEach(user->System.out.println(user));
	    userRepository.deleteAll(alluser);
	    */
       //Using Custom Methods
	   
		// first Custom method
/*		List<User> users1 = userRepository.findByName("bhaskar");
	    users1.forEach(e->System.out.println("this is find by name: "+e));
*/
	
/*		
		//Second custom method
		List<User> list = userRepository.findByNameAndCity("Rinku","city4");
		list.forEach(f->System.out.println("this is find by name and city : "+ f));
*/	
		
/*
		//Call Query Method
	    List<User> allUser = userRepository.getAllUser();
	    allUser.forEach(e->System.out.println("This is call by query "+e));
	    
	   
	    List<User> userByName = userRepository.getUserByName("Pinku");
	    userByName.forEach(e->System.out.println("this is call by second query "+ e));
	    
	    
	    
	    List<User> userByNameAndCity = userRepository.getUserByNameAndCity("Rinku","city4");
	    userByNameAndCity.forEach(e->System.out.println("this is by third query "+ e));
*/	
	    
	    // using native query
	    
	  List<User> users = userRepository.getUsers();
	  users.forEach(t->System.out.println("this is 4 query using native query "+ t));
	    
	    
	    
	    
	    
	    
	    
	    
	} 
	
}
