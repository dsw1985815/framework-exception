package com.framework.exception.bean;

/**
 * Created by zhu_kai1 on 2016/12/26.
 */
public class VersionExceptionMessage extends ExceptionMessage {

    private static final long serialVersionUID = 1L;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 版本异常构造函数<br/>
     * Demo:<br/>
     * VersionExceptionMessage ve = new
     * VersionExceptionMessage(tableName,messageCode)<br/>
     *
     * @param tableName
     *            表名
     * @param messageCode
     *            版本异常信息
     */
    public VersionExceptionMessage(String tableName, String messageCode) {
        super(messageCode);
        this.tableName = tableName;
    }

    /**
     * 版本异常构造函数<br/>
     * Demo:<br/>
     * VersionExceptionMessage ve = new
     * VersionExceptionMessage(tableName,messageCode,messageParams)<br/>
     *
     * @param tableName
     *            表名
     * @param messageCode
     *            版本异常信息
     *@param messageParams
     *            版本异常信息参数
     */
    public VersionExceptionMessage(String tableName,String messageCode, String... messageParams) {
        super(messageCode, messageParams);
        this.tableName = tableName;
    }


    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        String messageCode = getMessageCode();
        String[] messageParams = getMessageParams();

        sb.append("{code: ");
        sb.append(messageCode);
        sb.append(", ");

        sb.append("tableName: ");
        sb.append(tableName);
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
