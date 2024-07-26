package com.common.mpg.mapper;

import com.common.mpg.pojo.Xiaofmx;
import java.util.List;

public interface XiaofmxMapper {
    int insert(Xiaofmx record);

    List<Xiaofmx> selectAll();
}