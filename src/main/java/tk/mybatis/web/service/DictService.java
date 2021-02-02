package tk.mybatis.web.service;

import tk.mybatis.web.model.SysDict;

import java.util.List;

/**
 * @Description: 业务接口层
 * @Author zhanghj
 * @Date 2021/2/2 14:55
 */
public interface DictService {

    SysDict findById(Long id);

    List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit);

    boolean saveOrUpdate(SysDict sysDict);

    boolean deleteById(Long id);
}
