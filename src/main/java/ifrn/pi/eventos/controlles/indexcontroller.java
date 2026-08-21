package ifrn.pi.eventos.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexcontroller {

	@RequestMapping("/")
	public String index() {
		System.out.println("chamou o método index");
		return "Home";
	}
	
}
