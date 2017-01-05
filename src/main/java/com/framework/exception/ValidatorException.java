package com.framework.exception;

import java.util.ArrayList;
import java.util.List;

import com.framework.exception.bean.ExceptionMessage;
import com.framework.exception.bean.ValidatorExceptionMessage;

/**
 * 验证异常处理类
 *
 * @author liu_tao2
 * @version 1.0
 */
public class ValidatorException extends AbstractManagedException {

    private static final long serialVersionUID = 2806810719870636405L;

    /**
     * 验证异常处理构造函数<br/>
     * Demo : <br/>
     * ValidatorException be = new ValidatorException(sheetName, rowNum,
     * messageCode);<br/>
     * throw be;
     *
     * @param sheetName   Excel的sheet名
     * @param rowNum      验证的行号
     * @param messageCode 验证异常需要返回的信息
     */
    public ValidatorException(String messageCode, String sheetName, Integer rowNum, String fieldName) {
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        ValidatorExceptionMessage message = new ValidatorExceptionMessage(messageCode, sheetName, rowNum, fieldName);
        messages.add(message);
        super.setType(ExceptionType.VALIDATOR_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 验证异常处理构造函数<br/>
     * Demo : <br/>
     * ValidatorException be = new ValidatorException(new String());<br/>
     * throw be;
     *
     * @param messageCode 验证异常需要返回的信息
     */
    public ValidatorException(String messageCode, String sheetName, Integer rowNum, String fieldName,
                              String... messageParams) {
        List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>();
        ValidatorExceptionMessage message = new ValidatorExceptionMessage(messageCode, sheetName, rowNum, fieldName,
                messageParams);
        messages.add(message);
        super.setType(ExceptionType.VALIDATOR_EXCEPTION);
        super.setMessages(messages);
    }

    /**
     * 验证异常处理构造函数<br/>
     * Demo : <br/>
     * ValidatorException be = new ValidatorException(new
     * ArrayList<ValidatorExceptionMessage>());<br/>
     * throw be;
     *
     * @param messages 验证异常需要返回的信息集合
     */
    public ValidatorException(List<ExceptionMessage> messages) {
        super(messages);
        super.setType(ExceptionType.VALIDATOR_EXCEPTION);
        setMessages(messages);
        /*setValidatorExceptionMessages(messages);*/
    }

    /**
     * 验证异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new ValidatorException(new Throwable());
     *
     * @param cause 需要返回的验证异常的接口
     */
    public ValidatorException(Throwable cause) {
        super(cause);
        super.setType(ExceptionType.VALIDATOR_EXCEPTION);
    }

    /**
     * 验证异常处理构造函数<br/>
     * Demo ： <br/>
     * throw new ValidatorException(new
     * ArrayList<ValidatorExceptionMessage>(),new Throwable());
     *
     * @param messages 验证异常需要返回的信息集合
     * @param cause    需要返回的验证异常的接口
     */
    public ValidatorException(List<ExceptionMessage> messages, Throwable cause) {
        super(cause);
        super.setType(ExceptionType.VALIDATOR_EXCEPTION);
        setMessages(messages);
        /*setValidatorExceptionMessages(messages);*/
    }

    public List<ValidatorExceptionMessage> getValidatorExceptionMessages() {
        List<ExceptionMessage> messages = super.getMessages();
        if (messages == null) {
            return null;
        } else {
            List<ValidatorExceptionMessage> veMessages = new ArrayList<ValidatorExceptionMessage>(messages.size());
            for (ExceptionMessage message : messages) {
                veMessages.add((ValidatorExceptionMessage) message);
            }
            return veMessages;
        }
    }

    private void setValidatorExceptionMessages(List<ValidatorExceptionMessage> veMessages) {
        if (veMessages == null) {
            setMessages(null);
        } else {
            List<ExceptionMessage> messages = new ArrayList<ExceptionMessage>(veMessages.size());
            for (ValidatorExceptionMessage vem : veMessages) {
                messages.add((ExceptionMessage) vem);
            }
            setMessages(messages);
        }

    }
}
