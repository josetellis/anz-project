package anzazure.appservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	
    @GetMapping("/all")
	public String getData()
	{
		return "My data";
	}
   @GetMapping("/anz/{name}")
   public String getName(@PathVariable String name)
   {
	   return  "Hello" +"  "+ name;
   }
}
