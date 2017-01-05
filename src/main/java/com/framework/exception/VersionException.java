package com.framework.exception;

import com.framework.exception.bean.ExceptionMessage;
import com.framework.exception.bean.VersionExceptionMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhu_kai1 on 2016/12/26.
 */
public class VersionException extends AbstractManagedException {

    private static final long serialVersionUID = 1L;

    /**
     * 版本异常处理构造函数<br/>
     * Demo ： <br/>
     * VersionException ve = new VersionException(tableName,messageCode);
     *
     */
    public VersionException(String tableName, String messageCode) {
        super(new VersionExceptionMessage(tableName, messageCode).toString());
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        VersionExceptionMessage message = new VersionExceptionMessage(tableName, messageCode);
        messages.add(message);
        super.setType(ExceptionType.VERSION_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 版本异常处理构造函数<br/>
     * Demo ： <br/>
     * VersionException ve = new VersionException(tableName,messageCode,messageParams);
     *
     */
    public VersionException(String tableName, String messageCode,String... messageParams) {
        super(new VersionExceptionMessage(tableName, messageCode,messageParams).toString());
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        VersionExceptionMessage message = new VersionExceptionMessage(tableName, messageCode,messageParams);
        messages.add(message);
        super.setType(ExceptionType.VERSION_EXCEPTION);
        super.setMessages(messages);
    }
    /**
     * 版本异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new VersionException(new ArrayList<ExceptionMessage>());
     *
     */
    public VersionException(List<VersionExceptionMessage> messages){
        super(messages.toString());
        super.setType(ExceptionType.VERSION_EXCEPTION);
    }

    /**
     * 版本异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new VersionException(new Throwable());
     *
     * @param cause 需要返回的异常的接口
     */
    public VersionException(Throwable cause){
        super(cause);
        super.setType(ExceptionType.VERSION_EXCEPTION);
    }

    /**版本异常处理构造函数
     *  Demo ： <br/>
     * throw new VersionException(new ArrayList<ExceptionMessage>(),new
     * Throwable());
     * @param messages
     * @param cause
     */
    public VersionException(List<VersionExceptionMessage> messages,Throwable cause){
        super(cause);
        super.setType(ExceptionType.VERSION_EXCEPTION);
        List<ExceptionMessage> exceptionMessageList = new ArrayList<ExceptionMessage>();
        for (VersionExceptionMessage vem : messages) {
            exceptionMessageList.add((ExceptionMessage) vem);
        }
        setMessages(exceptionMessageList);
    }

    public  List<VersionExceptionMessage> getVersionMessage(){
        List<ExceptionMessage> messages = super.getMessages();
        if(messages == null){
            return null;
        }else{
            List<VersionExceptionMessage> veMessages = new ArrayList<VersionExceptionMessage>(messages.size());
            for (ExceptionMessage vem : messages) {
                veMessages.add((VersionExceptionMessage) vem);
            }
            return veMessages;
        }
    }

}
