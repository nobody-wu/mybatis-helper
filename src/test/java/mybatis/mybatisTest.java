package mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.bigpong.entity.DemoEntity;
import top.bigpong.pageHelper.PageHelper;
import top.bigpong.service.MybatisDemoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * mybatis分页测试
 * Created by Cornelius on 2017/7/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class mybatisTest {
	
	@Resource
	private MybatisDemoService mybatisDemoService;
	
	@Test
	public void test(){
		//分页处理，显示第一页的1条数据
		PageHelper.startPage(1, 1);
		List<DemoEntity> demoEntityList = mybatisDemoService.query();//查询
		// 取分页信息
//		PageInfo<DemoEntity> pageInfo = new PageInfo<DemoEntity>(demoEntityList);
//		long total = pageInfo.getEndRow();
//		System.out.println(total);
		for (DemoEntity demoEntity : demoEntityList){
			System.out.println(demoEntity.getNickName());
		}
		
	}
	
	
}
