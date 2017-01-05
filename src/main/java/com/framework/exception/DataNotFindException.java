package com.framework.exception;

import java.util.ArrayList;
import java.util.List;

import com.framework.exception.bean.ExceptionMessage;

/**
 * 没有返回结果异常处理类
 *
 * @author liu_tao2
 * @version 1.0
 */
public class DataNotFindException extends AbstractManagedException {

    private static final long serialVersionUID = -3604671899723134301L;

    /**
     * 没有返回结果异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new String());
     *
     * @param messageCode 需要返回的没有返回结果异常信息
     */
    public DataNotFindException(String messageCode) {
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        ExceptionMessage message = new ExceptionMessage(messageCode);
        messages.add(message);
        super.setType(ExceptionType.DATA_NOT_FIND_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 没有返回结果异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new String(), String...);
     *
     * @param messageCode 需要返回的没有返回结果异常信息
     */
    public DataNotFindException(String messageCode, String... messageParams) {
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        ExceptionMessage message = new ExceptionMessage(messageCode, messageParams);
        messages.add(message);
        super.setType(ExceptionType.DATA_NOT_FIND_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 没有返回结果异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new List<ExceptionMessage>());
     *
     * @param messages 需要返回的没有返回结果异常信息
     */
    public DataNotFindException(List<ExceptionMessage> messages) {
        super.setType(ExceptionType.DATA_NOT_FIND_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 没有返回结果异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new Throwable());
     *
     * @param cause 需要返回的没有返回结果异常的接口
     */
    public DataNotFindException(Throwable cause) {
        super(cause);
        super.setType(ExceptionType.DATA_NOT_FIND_EXCEPTION);
    }

    /**
     * 没有返回结果异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new SystemException(new List<ExceptionMessage>(),new Throwable());
     *
     * @param messages 需要返回的没有返回结果异常信息
     * @param cause    需要返回的没有返回结果异常的接口
     */
    public DataNotFindException(List<ExceptionMessage> messages, Throwable cause) {
        super(cause);
        super.setType(ExceptionType.DATA_NOT_FIND_EXCEPTION);
        super.setMessages(messages);
    }

}
