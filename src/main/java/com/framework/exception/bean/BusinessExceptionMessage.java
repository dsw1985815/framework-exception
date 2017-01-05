package com.framework.exception.bean;

/**
 * 业务异常消息处理bean
 *
 * @author liu_tao2
 * @version 1.0
 */
public class BusinessExceptionMessage extends ExceptionMessage {

    private static final long serialVersionUID = 3825896327460747150L;

    /**
     * 模块名
     */
    private String moduleName;

    /**
     * 业务异常构造函数<br/>
     * Demo:<br/>
     * BusinessExceptionMessage bem = new
     * BusinessExceptionMessage(moduleName,messageCode)<br/>
     *
     * @param moduleName
     *            模块名
     * @param messageCode
     *            业务异常信息
     */
    public BusinessExceptionMessage(String moduleName, String messageCode) {
        super(messageCode);
        this.moduleName = moduleName;
    }

    /**
     * 业务异常构造函数<br/>
     * Demo:<br/>
     * BusinessExceptionMessage bem = new
     * BusinessExceptionMessage(moduleName,messageCode,messageParams)<br/>
     *
     * @param moduleName
     *            模块名
     * @param messageCode
     *            业务异常信息
     * @param messageParams
     *            业务异常信息参数
     */
    public BusinessExceptionMessage(String moduleName, String messageCode, String... messageParams) {
        super(messageCode, messageParams);
        this.moduleName = moduleName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        String messageCode = getMessageCode();
        String[] messageParams = getMessageParams();

        sb.append("{code: ");
        sb.append(messageCode);
        sb.append(", ");

        sb.append("module: ");
        sb.append(moduleName);
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
