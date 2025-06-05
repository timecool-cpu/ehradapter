package com.shuwangliantong.ehradapter.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 上链接收状态 DTO
 */
@Data
public class ChainReceiptDto implements Serializable {

    /**
     * 接收状态（0:成功，1：失败）
     */
    private String state;

    /**
     * 上链凭证
     */
    private String credential;
}
