package pro.yuchen.demo.dubbo_demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(interfaceClass = IHelloService.class)
@Component
public class HelloServiceImpl implements IHelloService {

	@Override
	public String hello(String name) {
		System.out.println("Hello " + name);
		return "Hello " + name;
	}
}
