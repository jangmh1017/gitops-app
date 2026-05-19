package ops.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController("api")
public class ApiOpsController {

	@GetMapping("/ops")
	public String OpsTest() {
		return "Get - /api/ops";
	}
	
	@GetMapping("health")
	public String healthCheck() {
		return "OK";
	}
	
	@GetMapping("/feat-ops")
	public String OpsCheck() {
		return "Get - /api/feat-ops";
	}
	
}
