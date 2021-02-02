package tk.mybatis.web.mapper;

import org.apache.ibatis.session.RowBounds;
import tk.mybatis.web.model.SysDict;

import java.util.List;

/**
 * @Description: 字典mapper接口
 * @Author zhanghj
 * @Date 2021/2/2 14:26
 */
public interface DictMapper {
    /**
     * 根据主键id查询
     * @param id
     * @return
     */
    SysDict selectByPrimaryKey(Long id);

    /**
     * 根据字典参数和分页参数查询
     * @param sysDcit
     * @param rowBounds
     * @return
     */
    List<SysDict> selectBySysDict(SysDict sysDcit, RowBounds rowBounds);

    /**
     * 新增
     * @param sysDict
     * @return
     */
    int insert(SysDict sysDict);

    /**
     * 根据主键更新
     * @param sysDict
     * @return
     */
    int updateById(SysDict sysDict);

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);
}
