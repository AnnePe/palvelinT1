package kevat22.t1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class t1Controller {

	@RequestMapping("index")
	@ResponseBody
	public String Hello() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String Hello2() {
		return "this is the contactpage";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String Hello(@RequestParam(name="location", required=false, defaultValue="Moon" ) String paikka ,
	@RequestParam(name="name", required=false, defaultValue="dear friend" ) String nimi )
{
		return "Welcome to the  "+ paikka + " "+ nimi +"!!";
	}
}
