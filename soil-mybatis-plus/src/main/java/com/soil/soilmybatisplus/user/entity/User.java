package com.soil.soilmybatisplus.user.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * 类型 	解释
 * AUTO 	数据库自增ID
 * NONE 	数据库未设置主键类型（将会跟随全局）
 * INPUT 	用户输入ID（该类型可以通过自己注册自动填充插件进行填充）
 * ID_WORKER 	全局唯一ID (idWorker)
 * UUID 	全局唯一ID（UUID）
 * ID_WORKER_STR 	字符串全局唯一ID（idWorker 的字符串表示）
 * 使用方法：@TableId(type = IdType.AUTO)
 * @author soil
 * @since 2021-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
