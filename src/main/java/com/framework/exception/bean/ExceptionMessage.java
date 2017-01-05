package com.framework.exception.bean;

import java.io.Serializable;

/**
 * 异常消息处理基准Bean
 *
 * @author liu_tao2
 * @version 1.0
 */
public class ExceptionMessage implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = -8099227016360373166L;
    /**
     * 异常信息
     */
    private String messageCode;
    /**
     * 异常信息参数集合
     */
    private String[] messageParams;

    /**
     * 异常消息处理构造函数 Demo ：<br/>
     * ExceptionMessage dem = new ExceptionMessage(messageCode)<br/>
     *
     * @param messageCode
     *            异常信息
     */
    public ExceptionMessage(String messageCode) {
        this.messageCode = messageCode;
    }

    /**
     * 异常消息处理构造函数 Demo ：<br/>
     * ExceptionMessage dem = new
     * ExceptionMessage(messageCode,messageParams)<br/>
     *
     * @param messageCode
     *            异常信息
     * @param messageParams
     *            异常信息参数集合
     */
    public ExceptionMessage(String messageCode, String... messageParams) {
        this.messageCode = messageCode;
        this.messageParams = messageParams;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String[] getMessageParams() {
        return messageParams;
    }

    public void setMessageParams(String... messageParams) {
        this.messageParams = messageParams;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");

        sb.append("{code: ");
        sb.append(messageCode);
        sb.append(", ");

        sb.append("args: [");
        if (messageParams != null && messageParams.length != 0) {
            for (int i = 0; i < messageParams.length; i++) {
                sb.append("\"");
                sb.append(messageParams[i]);
                sb.append("\"");
                if (i != messageParams.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]}");

        return sb.toString();
    }
}
