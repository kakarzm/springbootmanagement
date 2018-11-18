package com.lm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lm.model.Position;

/**

 */
public interface PositionMapper {

    int addPos(@Param("pos") Position pos);

    Position getPosByName(String name);

    List<Position> getAllPos();

    int deletePosById(@Param("pids") String[] pids);

    int updatePosById(@Param("pos") Position position);
}
