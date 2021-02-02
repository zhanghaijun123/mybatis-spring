package tk.mybatis.web.model;

import java.io.Serializable;

/**
 * @Description: 系统字典表
 * @Author zhanghj
 * @Date 2021/2/2 14:22
 */
public class SysDict implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
