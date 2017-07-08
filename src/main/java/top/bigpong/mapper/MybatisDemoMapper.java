package top.bigpong.mapper;

import top.bigpong.entity.DemoEntity;

import java.util.List;

/**
 * Created by Cornelius on 2017/6/28.
 */
public interface MybatisDemoMapper {
	
	public List<DemoEntity> query();
	
}
