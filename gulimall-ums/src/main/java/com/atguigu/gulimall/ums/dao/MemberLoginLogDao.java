package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author YG
 * @email YG@qq.com
 * @date 2019-08-01 21:32:50
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
