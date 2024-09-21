package vip.openpark.quick.start.domain;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 表名：person
 * 表注释：人员信息
*/
@Getter
@Setter
@ToString
@Table(name = "person")
public class PersonDO {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 人员姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 出生日期
     */
    @Column(name = "birthday")
    private LocalDateTime birthday;

    /**
     * 性别0表示女，1表示男
     */
    @Column(name = "sex")
    private Byte sex;

    /**
     * 婚姻状况，0表示未婚，2表示已婚，3表示离婚，4表示丧偶
     */
    @Column(name = "marital_status")
    private Byte maritalStatus;

    /**
     * 备注
     */
    @Column(name = "remark_text")
    private String remarkText;

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