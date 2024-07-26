package com.common.mpg.mapper;

import com.common.mpg.pojo.Zhangh;
import java.util.List;

public interface ZhanghMapper {
    int deleteByPrimaryKey(Integer zhangh);

    int insert(Zhangh record);

    Zhangh selectByPrimaryKey(Integer zhangh);

    List<Zhangh> selectAll();

    int updateByPrimaryKey(Zhangh record);
}