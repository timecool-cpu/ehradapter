package com.shuwangliantong.ehradapter.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 患者就诊信息 DTO
 */
@Data
public class MedicalVisitInfoDto implements Serializable {

    /**
     * 患者ID
     */
    private String id;

    /**
     * 就诊流水号
     */
    private String medicalSerialNo;

    /**
     * 住院号
     */
    private String inHospitalNo;

    /**
     * 入院日期
     */
    private String inhosDate;

    /**
     * 出生日期
     */
    private String birthDate;

    /**
     * 证件类型（1：身份证；2：护照）
     */
    private Integer certificateType;

    /**
     * 证件号码
     */
    private String certNo;

    /**
     * 患者名称
     */
    private String name;

    /**
     * 性别（1：男；2：女）
     */
    private Integer sex;

    /**
     * 就诊科室
     */
    private String medicalDept;

    /**
     * 病区名称
     */
    private String wardName;

    /**
     * 病房号
     */
    private String wardNumber;

    /**
     * 床位号
     */
    private String bedNumber;

    /**
     * 初始诊断（Json数组）
     */
    private List<String> initialDiagnosis;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 参保人身份类型编码（221：城镇；232：农村；243：失地农工）
     */
    private Integer insuredPersonTypeCode;

    /**
     * 是否社保客户（0：否；1：是）
     */
    private Integer isSocialSecurity;

    /**
     * 医疗类别（1：普通医疗保险；2：住院保险；3：手术保险；4：特种疾病保险；5：住院津贴保险；6：综合医疗保险）
     */
    private Integer medicalWpe;

    /**
     * 医保类型编码
     */
    private String socialSecurityType;

    /**
     * 医保类型名称
     */
    private String socialSecurityName;
}

