package vip.openpark.quick.start.domain;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 表名：role
 * 表注释：角色表
*/
@Getter
@Setter
@ToString
@Table(name = "role")
public class RoleDO {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 业务编码
     */
    @Column(name = "code")
    private String code;

    /**
     * 角色描述
     */
    @Column(name = "role_desc")
    private String roleDesc;

    /**
     * 是否启用，0表示否，1表示是
     */
    @Column(name = "bl_enable")
    private Byte blEnable;

    /**
     * 是否删除，0表示否，1表示是
     */
    @Column(name = "bl_deleted")
    private Byte blDeleted;

    /**
     * 版本号
     */
    @Column(name = "version_number")
    private Long versionNumber;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 创建人真实姓名
     */
    @Column(name = "creator")
    private String creator;

    /**
     * 创建人ID
     */
    @Column(name = "creator_id")
    private Long creatorId;

    /**
     * 创建人code
     */
    @Column(name = "creator_code")
    private String creatorCode;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modify")
    private LocalDateTime gmtModify;

    /**
     * 修改人真实姓名
     */
    @Column(name = "modifier")
    private String modifier;

    /**
     * 修改人ID
     */
    @Column(name = "modifier_id")
    private Long modifierId;

    /**
     * 修改人code
     */
    @Column(name = "modifier_code")
    private String modifierCode;
}