package com.framework.exception;

import java.util.ArrayList;
import java.util.List;

import com.framework.exception.bean.ExceptionMessage;

/**
 * 上传异常处理类
 *
 * @author liu_tao2
 * @version 1.0
 */
public class UploadException extends AbstractManagedException {

    private static final long serialVersionUID = -148280471319556746L;

    /**
     * 上传异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new String());
     *
     * @param messageCode 需要返回的上传异常信息
     */
    public UploadException(String messageCode) {
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        ExceptionMessage message = new ExceptionMessage(messageCode);
        messages.add(message);
        super.setType(ExceptionType.UPLOAD_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 上传异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new String(), String...);
     *
     * @param messageCode 需要返回的上传异常信息
     */
    public UploadException(String messageCode, String... messageParams) {
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        ExceptionMessage message = new ExceptionMessage(messageCode, messageParams);
        messages.add(message);
        super.setType(ExceptionType.UPLOAD_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 上传异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new List<ExceptionMessage>());
     *
     * @param messages 需要返回的上传异常信息
     */
    public UploadException(List<ExceptionMessage> messages) {
        super.setType(ExceptionType.UPLOAD_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 上传异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new Throwable());
     *
     * @param cause 需要返回的上传异常的接口
     */
    public UploadException(Throwable cause) {
        super(cause);
        super.setType(ExceptionType.UPLOAD_EXCEPTION);
    }

    /**
     * 上传异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new List<ExceptionMessage>(),new Throwable());
     *
     * @param messages 需要返回的上传异常信息
     * @param cause    需要返回的上传异常的接口
     */
    public UploadException(List<ExceptionMessage> messages, Throwable cause) {
        super(cause);
        super.setType(ExceptionType.UPLOAD_EXCEPTION);
        super.setMessages(messages);
    }

}
