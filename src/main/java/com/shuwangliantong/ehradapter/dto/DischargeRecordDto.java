package com.shuwangliantong.ehradapter.dto;

import lombok.Data;

import java.io.Serializable;
/**
 * 患者出院记录 DTO
 */
@Data
public class DischargeRecordDto implements Serializable {

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
     * 主诉
     */
    private String mainSuit;

    /**
     * 现病史
     */
    private String historyPresentIlliness;

    /**
     * 既往史
     */
    private String pastHistory;

    /**
     * 个人史
     */
    private String personalHistory;

    /**
     * 家族史
     */
    private String familyHistory;

    /**
     * 疾病代码
     */
    private String diseaseCode;

    /**
     * 疾病名称
     */
    private String diseaseName;

    /**
     * 手术编码
     */
    private String opsCode;

    /**
     * 手术名称
     */
    private String opsName;

    /**
     * 离院诊断
     */
    private String leaveMedicalSick;

    /**
     * 输血史
     */
    private String historyOfBloodTransfusion;

    /**
     * 过敏史
     */
    private String allergies;

    /**
     * 预防接种史
     */
    private String historyOfImmunizations;

    /**
     * 月经史
     */
    private String menstrualHistory;

    /**
     * 辅助检查结果
     */
    private String auxiliaryExamination;

    /**
     * 体格检查结果
     */
    private String physicalExamination;

    /**
     * 科室
     */
    private String treatOffice;

    /**
     * 病理检查号
     */
    private String pathologicalExaminationNo;

    /**
     * 入院情况（出院记录中的入院情况）
     */
    private String checkinDescription;

    /**
     * 诊疗经过（出院记录中的诊疗经过）
     */
    private String treatmentRecord;

    /**
     * 治疗结果
     */
    private String treatmentResult;

    /**
     * 出院情况描述（出院记录中的出院情况）
     */
    private String leaveDescription;

    /**
     * 出院医嘱（出院记录中的出院医嘱）
     */
    private String dischargeOrder;

    /**
     * 经治医生
     */
    private String masterDoctor;

    /**
     * 上级医生
     */
    private String superiordoctor;

    /**
     * 出院带药
     */
    private String dischargeMedication;
}

