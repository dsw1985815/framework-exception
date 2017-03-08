package com.framework.exception.bean;

/**
 * 必输项验证异常消息处理bean
 *
 * @author liu_tao2
 * @version 1.0
 */
public class ValidatorExceptionMessage extends ExceptionMessage {

    private static final long serialVersionUID = -6870696841928768140L;

    /**
     * sheet名称
     */
    private String sheetName;

    /**
     * 行数
     */
    private Integer rowNum;

    /**
     * 必输项验证异常参数名
     */
    private String fieldName;

    /**
     * 必输项验证异常构造函数<br/>
     * Demo ：<br/>
     * ValidatorExceptionMessage vem = new
     * ValidatorExceptionMessage(messageCode,sheetName,rowNum,fieldName)<br/>
     *
     * @param messageCode
     *            必输项验证异常信息
     * @param sheetName
     *            sheet名称
     * @param rowNum
     *            行数
     * @param fieldName
     *            必输项验证异常参数名
     */
    public ValidatorExceptionMessage(String messageCode, String sheetName, Integer rowNum, String fieldName) {
        super(messageCode);
        this.fieldName = fieldName;
        this.sheetName = sheetName;
        this.rowNum = rowNum;
    }

    /**
     * 必输项验证异常构造函数<br/>
     * Demo ：<br/>
     * ValidatorExceptionMessage vem = new
     * ValidatorExceptionMessage(messageCode,sheetName,rowNum,fieldName,messageParams)<br/>
     *
     * @param messageCode
     *            必输项验证异常信息
     * @param sheetName
     *            sheet名称
     * @param rowNum
     *            行数
     * @param fieldName
     *            必输项验证异常参数名
     * @param messageParams
     *            参数
     */
    public ValidatorExceptionMessage(String messageCode, String sheetName, Integer rowNum, String fieldName,
            String... messageParams) {
        super(messageCode, messageParams);
        this.fieldName = fieldName;
        this.sheetName = sheetName;
        this.rowNum = rowNum;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        String messageCode = getMessageCode();
        String[] messageParams = getMessageParams();

        sb.append("{\"messageCode\": ");
        sb.append("\""+messageCode+"\"");
        sb.append(", ");

        sb.append("\"sheetName\": ");
        sb.append(sheetName);
        sb.append(", ");

        sb.append("\"rowNum\": ");
        sb.append(rowNum);
        sb.append(", ");

        sb.append("\"fieldName\": ");
        sb.append("\""+fieldName+"\"");
        sb.append(", ");

        sb.append("\"messageParams\": [");
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

    public ValidatorExceptionMessage() {
    }
}
