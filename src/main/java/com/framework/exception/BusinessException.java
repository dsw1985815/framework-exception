package com.framework.exception;

import java.util.ArrayList;
import java.util.List;

import com.framework.exception.bean.BusinessExceptionMessage;
import com.framework.exception.bean.ExceptionMessage;

/**
 * 业务异常处理类
 *
 * @author liu_tao2
 * @version 1.0
 */
public class BusinessException extends AbstractManagedException {

    private static final long serialVersionUID = -4567423151772598855L;

    /**
     * 业务异常处理构造函数<br/>
     * Demo : <br/>
     * BusinessException be = new BusinessException(moduleName,messageCode);<br/>
     * throw be;
     *
     * @param moduleName  模块名
     * @param messageCode 业务异常需要返回的信息
     */
    public BusinessException(String moduleName, String messageCode) {
        super(new BusinessExceptionMessage(moduleName, messageCode).toString());
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        BusinessExceptionMessage message = new BusinessExceptionMessage(moduleName, messageCode);
        messages.add(message);
        super.setType(ExceptionType.BUSINESS_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 业务异常处理构造函数<br/>
     * Demo : <br/>
     * BusinessException be = new BusinessException(moduleName,messageCode,messageParams);<br/>
     * throw be;
     *
     * @param moduleName    模块名
     * @param messageCode   业务异常需要返回的信息
     * @param messageParams 参数
     */
    public BusinessException(String moduleName, String messageCode, String... messageParams) {
        super(new BusinessExceptionMessage(moduleName, messageCode, messageParams).toString());
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        BusinessExceptionMessage message = new BusinessExceptionMessage(moduleName, messageCode, messageParams);
        messages.add(message);
        super.setType(ExceptionType.BUSINESS_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 业务异常处理构造函数<br/>
     * Demo : <br/>
     * BusinessException be = new BusinessException(new
     * ArrayList<BusinessExceptionMessage>());<br/>
     * throw be;
     *
     * @param messages 业务异常需要返回的信息集合
     */
    public BusinessException(List<BusinessExceptionMessage> messages) {
        super(messages.toString());
        super.setType(ExceptionType.BUSINESS_EXCEPTION);
        setBusinessExceptionMessages(messages);
    }

    /**
     * 业务异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new BusinessException(new Throwable());
     *
     * @param cause 需要返回的业务异常的接口
     */
    public BusinessException(Throwable cause) {
        super(cause);
        super.setType(ExceptionType.BUSINESS_EXCEPTION);
    }

    /**
     * 业务异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new BusinessException(new ArrayList<BusinessExceptionMessage>(),new
     * Throwable());
     *
     * @param messages 业务异常需要返回的信息集合
     * @param cause    需要返回的业务异常的接口
     */
    public BusinessException(List<BusinessExceptionMessage> messages, Throwable cause) {
        super(cause);
        super.setType(ExceptionType.BUSINESS_EXCEPTION);
        setBusinessExceptionMessages(messages);
    }

    public List<BusinessExceptionMessage> getBusinessExceptionMessages() {
        List<ExceptionMessage> messages = super.getMessages();
        if (messages == null) {
            return null;
        } else {
            List<BusinessExceptionMessage> beMessages = new ArrayList<BusinessExceptionMessage>(messages.size());
            for (ExceptionMessage message : messages) {
                beMessages.add((BusinessExceptionMessage) message);
            }
            return beMessages;
        }
    }

    private void setBusinessExceptionMessages(List<BusinessExceptionMessage> beMessages) {
        if (beMessages == null) {
            setMessages(null);
        } else {
            List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>(beMessages.size());
            for (BusinessExceptionMessage bem : beMessages) {
                messages.add((ExceptionMessage) bem);
            }
            setMessages(messages);
        }
    }

}
