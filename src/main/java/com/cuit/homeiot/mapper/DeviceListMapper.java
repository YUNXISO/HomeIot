package com.cuit.homeiot.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cuit.homeiot.pojo.Device;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DeviceListMapper extends BaseMapper<Device> {
    Long countByTypeLong(@Param("type") String type);
}
