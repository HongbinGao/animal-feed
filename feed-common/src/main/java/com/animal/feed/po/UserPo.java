package com.animal.feed.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Po --- user info
 *
 * @author wangyp
 * @since 27 October 2020
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user")
public class UserPo {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * name
     */
//    private String userName;
    /**
     * email
     */
    private String password;
    /**
     * phone
     */
    private String phone;
    /**
     * 创建时间
     */
//    private Long createTime;
    /**
     * 更新时间
     */
//    private Long updateTime;

}
