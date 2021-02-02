package tk.mybatis.web.service.impl;

import com.sun.istack.internal.NotNull;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.web.mapper.DictMapper;
import tk.mybatis.web.model.SysDict;
import tk.mybatis.web.service.DictService;

import java.util.List;

/**
 * @Description: 业务层实现类
 * @Author zhanghj
 * @Date 2021/2/2 14:58
 */
@Service
public class DictServiceImpl implements DictService {
    @Autowired
    private DictMapper dictMapper;
    @Override
    public SysDict findById(@NotNull Long id) {
        return dictMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit) {
        RowBounds rowBounds=RowBounds.DEFAULT;
        if(offset!=null && limit!=null){
         rowBounds=new RowBounds(offset,limit);
        }
        return dictMapper.selectBySysDict(sysDict,rowBounds);
    }

    @Override
    public boolean saveOrUpdate(SysDict sysDict) {
        if(sysDict.getId()==null){
            return dictMapper.insert(sysDict)==1;
        }else {
            return dictMapper.updateById(sysDict)==1;
        }

    }

    @Override
    public boolean deleteById(Long id) {
        return dictMapper.deleteById(id)==1;
    }
}
