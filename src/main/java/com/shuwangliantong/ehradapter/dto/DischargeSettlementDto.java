package com.shuwangliantong.ehradapter.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 患者离院结算信息 DTO
 */
@Data
public class DischargeSettlementDto implements Serializable {

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
     * 离院诊断（诊断名称，多条拼接）
     */
    private String leaveMedicalSick;

    /**
     * 离院日期
     */
    private String leaveDagte;

    /**
     * 诊治医生
     */
    private String masterDocton;

    /**
     * 总费用（客户在医院的所有治疗费用）
     */
    private BigDecimal totalMedicalCost;

    /**
     * 总自费（部分自费项目自费部分和全自费）
     */
    private BigDecimal insuranceDeduct;

    /**
     * 起付线（基本医疗保险起付金额）
     */
    private BigDecimal underwayCriterion;

    /**
     * 基本医疗赔付金额（基本医疗给客户的赔付金额）
     */
    private BigDecimal baseInsurance;

    /**
     * 大病、大额医疗赔付金额（补充医疗赔付金额）
     */
    private BigDecimal complementarityInsurance;

    /**
     * 其他保险赔付金额
     */
    private BigDecimal elseInsuranceMoney;

    /**
     * 全自费(丙类)
     */
    private BigDecimal selfamnt;

    /**
     * 不合理费用总额
     */
    private BigDecimal unRationalMoney;

    /**
     * 离院状态（治愈、好转、未愈、无效、死亡、其他、未明确）
     */
    private String dischargeStatus;

    /**
     * 自付一
     */
    private BigDecimal selfPaid;

    /**
     * 自付二
     */
    private BigDecimal selfPaid_;
}

