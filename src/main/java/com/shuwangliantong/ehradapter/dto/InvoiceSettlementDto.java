package com.shuwangliantong.ehradapter.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 发票结算信息 DTO
 */
@Data
public class InvoiceSettlementDto implements Serializable {

    /**
     * 患者ID
     */
    private String id;

    /**
     * 就诊流水号
     */
    private String medicalSerialNo;

    /**
     * 发票号
     */
    private String invoiceNo;

    /**
     * 结算日期
     */
    private String settleDate;
}

