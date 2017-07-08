package top.bigpong.service.impl;

import org.springframework.stereotype.Service;
import top.bigpong.entity.DemoEntity;
import top.bigpong.mapper.MybatisDemoMapper;
import top.bigpong.service.MybatisDemoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Cornelius on 2017/6/28.
 */
@Service
public class IMybatisDemoService implements MybatisDemoService {
	
	@Resource
	private MybatisDemoMapper mybatisDemoMapper;
	public List<DemoEntity> query() {
		return mybatisDemoMapper.query();
//		int[] arr = new int[1];
//		System.out.print(arr[11]);
	}
}
