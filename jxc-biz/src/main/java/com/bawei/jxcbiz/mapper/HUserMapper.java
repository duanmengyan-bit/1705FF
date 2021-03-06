package com.bawei.jxcbiz.mapper;

import com.bawei.jxcbiz.entity.HUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 段梦燕
 * @since 2020-03-16
 */
public interface HUserMapper extends BaseMapper<HUser> {

    HUser getList(HUser user);
}
