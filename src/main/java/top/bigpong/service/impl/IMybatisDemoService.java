package top.bigpong.service.impl;

import org.springframework.stereotype.Service;
import top.bigpong.mapper.MybatisDemoMapper;
import top.bigpong.service.MybatisDemoService;

import javax.annotation.Resource;

/**
 * Created by Cornelius on 2017/6/28.
 */
@Service
public class IMybatisDemoService implements MybatisDemoService {
	
	@Resource
	private MybatisDemoMapper mybatisDemoMapper;
	public void updateNickName() {
		mybatisDemoMapper.updateNickName();
//		int[] arr = new int[1];
//		System.out.print(arr[11]);
	}
}
