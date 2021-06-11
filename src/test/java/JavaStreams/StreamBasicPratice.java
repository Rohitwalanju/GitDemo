package JavaStreams;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;
import com.mongodb.connection.Stream;

public class StreamBasicPratice {
	
	@Test
	public void filter()
	{
		List<String> names=Arrays.asList("Rohit","Nilesh","Rahul","Deepak","Ganesh","Nikhil");
		//names.stream().filter(s->s.contains("a")).forEach(s->System.out.println(s));
		//names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//names.stream().forEach(s->System.out.println(s));
		List<String> names1=Arrays.asList("Amit","Kishor","Badresh","Kunal");
		
	  
	    
	}

}
