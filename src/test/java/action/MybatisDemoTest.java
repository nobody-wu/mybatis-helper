package action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.bigpong.service.MybatisDemoService;

import javax.annotation.Resource;

/**
 * Created by Cornelius on 2017/6/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisDemoTest {

	@Resource
	private MybatisDemoService mybatisDemoService;
	
	@Test
	public void MyBatisDemoTest(){
		mybatisDemoService.query();
	}

}
