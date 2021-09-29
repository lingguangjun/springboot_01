package com.cxw.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Data

public class User implements Serializable {

    @TableId(type = IdType.ID_WORKER)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;
    @TableField(fill = FieldFill.INSERT)
    private Date create_time;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date update_time;
}
