package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	
	@RequestMapping(value = "/hi",method = { RequestMethod.GET} )
	@ResponseBody
	public String sayHello(){
		System.out.println("Comming Here hello.............");
		return "Hello World";
	}
	
	@RequestMapping(value = "/helloAgain",method = { RequestMethod.GET} )
	@ResponseBody
	public String sayHelloAgain(){
		System.out.println("Comming Here hello.............");
		return "Hello World again";
	}
	
	
	@RequestMapping(value = "/user",method = { RequestMethod.GET} )
	public User sayHelloToUser(){
		System.out.println("Comming Here User .............");
		return new User("Tim", "Joy");
	}
	
	@RequestMapping(value = "/user",method = { RequestMethod.POST} )
	public User postUser(@RequestBody User user){
		System.out.println("received User .............");
		return  user;
	}

}
