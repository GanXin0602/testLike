package com.chen.mapper;

import com.chen.po.Specil;import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecilMapper {

    List<Specil> findAllSplit3(Map<String, Object> map);

    List<Specil> findAllSplit4(@Param("spilinfoid")int spilinfoid, @Param("depinfoid")int depinfoid, @Param("spilinfocode")String spilinfocode, @Param("spilinfoname")String spilinfoname, @Param("spilinfoaim")String spilinfoaim, @Param("spilinfoprodire")String spilinfoprodire);

}
