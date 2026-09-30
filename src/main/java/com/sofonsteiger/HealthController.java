package com.sofonsteiger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;


@RestController
public class HealthController {
	
	@GetMapping("health")
	public Map<String, String> health(){
		
		return Map.of("status", "ok");
	}

}
