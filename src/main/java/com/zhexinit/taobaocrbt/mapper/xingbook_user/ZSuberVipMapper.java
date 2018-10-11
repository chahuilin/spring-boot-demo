package com.zhexinit.taobaocrbt.mapper.xingbook_user;

import com.zhexinit.taobaocrbt.entity.ZSuberVip;
import com.zhexinit.taobaocrbt.entity.ZSuberVipExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZSuberVipMapper {
    long countByExample(ZSuberVipExample example);

    int deleteByExample(ZSuberVipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZSuberVip record);

    int insertSelective(ZSuberVip record);

    List<ZSuberVip> selectByExample(ZSuberVipExample example);

    ZSuberVip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZSuberVip record, @Param("example") ZSuberVipExample example);

    int updateByExample(@Param("record") ZSuberVip record, @Param("example") ZSuberVipExample example);

    int updateByPrimaryKeySelective(ZSuberVip record);

    int updateByPrimaryKey(ZSuberVip record);
}