package com.xoa.dev.assets.service.impl;

import com.xoa.dev.assets.model.AstPremisesDetails;
import com.xoa.dev.assets.dao.AstPremisesDetailsMapper;
import com.xoa.dev.assets.service.AstPremisesDetailsService;
import com.xoa.util.page.PageParams;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * Created by liujian on 2019/06/08.
 */
@Service
public class AstPremisesDetailsServiceImpl implements AstPremisesDetailsService{

	@Autowired
    private AstPremisesDetailsMapper astPremisesDetailsMapper;

        public int insert(AstPremisesDetails record){
                        return astPremisesDetailsMapper.insert(record);
        }

        public int insertSelective(AstPremisesDetails record){
                        return astPremisesDetailsMapper.insertSelective(record);
        }

        public List<AstPremisesDetails> selectByCondition(Integer page, Integer pageSize, Boolean useFlag, Map map){
            PageParams pageParams = new PageParams();
                pageParams.setUseFlag(useFlag);
                pageParams.setPage(page);
                pageParams.setPageSize(pageSize);
                map.put("page", pageParams);
            return astPremisesDetailsMapper.selectByCondition(map);
        }

        public List<AstPremisesDetails> selectAll(){
                        return astPremisesDetailsMapper.selectAll();
        }

        public Integer count(AstPremisesDetails record){
                        return astPremisesDetailsMapper.count(record);
        }

        public int deleteByCondition(AstPremisesDetails record){
                        return astPremisesDetailsMapper.deleteByCondition(record);
        }

}
