package com.shuwangliantong.ehradapter.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 患者基本信息 DTO
 */
@Data
public class PatientInfoDto implements Serializable {
    /**
     * 患者ID
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 性别（1：男；2：女）
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 证件类型
     */
    private String certificateType;

    /**
     * 证件号
     */
    private String certNo;

    /**
     * 电话号
     */
    private String tel;

    /**
     * 住院号
     */
    private String inHospitalNo;
}

