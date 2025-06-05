package com.shuwangliantong.ehradapter.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 患者费用明细 DTO
 */
@Data
public class MedicalExpenseDetailDto implements Serializable {

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
     * 入院日期（YYYY-MM-DD）
     */
    private String inhosDate;

    /**
     * 处方医生
     */
    private String prescriptionDoctor;

    /**
     * 医疗目录编码（1：感冒清热软胶囊；2：感冒止咳颗粒；3：感冒灵颗粒）
     */
    private Integer medicalDirectoryCode;

    /**
     * 费用名称（对应产生费用项目名称）
     */
    private String expenseName;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 费用日期
     */
    private String expenseDate;

    /**
     * 标识号（his唯一标识）
     */
    private String sign;
}

