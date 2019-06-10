package com.xoa.dev.assets.dao;

import com.xoa.dev.assets.model.AstPremisesDetails;
import java.util.List;
import java.util.Map;

public interface AstPremisesDetailsMapper {
    int insert(AstPremisesDetails record);

    int insertSelective(AstPremisesDetails record);

    List<AstPremisesDetails> selectByCondition(Map map);

    List<AstPremisesDetails> selectAll();

    Integer count(AstPremisesDetails record);

    int deleteByCondition(AstPremisesDetails record);
}