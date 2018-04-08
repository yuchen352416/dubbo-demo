package pro.yuchen.demo.dubbo_demo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.yuchen.demo.dubbo_demo.service.IHelloService;

@RestController
public class HelloController {

	@Reference(url = "dubbo://127.0.0.1:20880")
	private IHelloService iHelloService;


	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return iHelloService.hello(name);
	}
}
