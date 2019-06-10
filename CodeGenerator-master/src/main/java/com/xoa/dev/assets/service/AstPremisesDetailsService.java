package com.xoa.dev.assets.service;

import com.xoa.dev.assets.model.AstPremisesDetails;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by liujian on 2019/06/08.
 */

public interface AstPremisesDetailsService{
            public int insert(AstPremisesDetails record);
            public int insertSelective(AstPremisesDetails record);
            public List<AstPremisesDetails> selectByCondition(Integer page, Integer pageSize, Boolean useFlag, Map map);
            public List<AstPremisesDetails> selectAll();
            public Integer count(AstPremisesDetails record);
            public int deleteByCondition(AstPremisesDetails record);
}
