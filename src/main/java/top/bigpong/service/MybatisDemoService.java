package top.bigpong.service;

import top.bigpong.entity.DemoEntity;

import java.util.List;

/**
 * Created by Cornelius on 2017/6/28.
 */
public interface MybatisDemoService {
	
	public List<DemoEntity> query();
	
}
