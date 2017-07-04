package top.bigpong.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.bigpong.service.MybatisDemoService;

import javax.annotation.Resource;

/**
 * Created by Cornelius on 2017/6/28.
 */
@Controller
@RequestMapping("/api")
public class MybatisDemo {

	@Resource
	private MybatisDemoService mybatisDemoService;
	
	@ResponseBody
	@RequestMapping(value = "/demo", method = RequestMethod.POST)
	public String testDemo(){
		System.out.print(1);
//		DemoEntity demoEntity = mybatisDemoService.select();
//		return demoEntity.getNickName();
		return "";
	}

}
