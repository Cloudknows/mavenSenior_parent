package com.itcast.dao;

import com.itcast.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {

    @Select("select * from items where id = #{id}")
    Items findById(Integer id);

}
