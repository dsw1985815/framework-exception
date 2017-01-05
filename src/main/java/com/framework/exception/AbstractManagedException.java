package com.framework.exception;

import java.util.List;

import com.framework.exception.bean.ExceptionMessage;

public abstract class AbstractManagedException extends RuntimeException {

    private static final long serialVersionUID = -3330869060099576002L;

    /**
     * 异常信息
     */
    private List<ExceptionMessage> messages;

    /**
     * 异常类型
     */
    private ExceptionType type;

    protected AbstractManagedException() {
        super();
    }

    protected AbstractManagedException(Throwable cause) {
        super(cause);
    }

    protected AbstractManagedException(List<ExceptionMessage> messages) {
        super(messages.toString());
    }

    protected AbstractManagedException(String messages) {
        super(messages);
    }

    protected void setMessages(List<ExceptionMessage> messages) {
        this.messages = messages;
    }

    public List<ExceptionMessage> getMessages() {
        return this.messages;
    }

    /**
     * @return the type
     */
    public ExceptionType getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    protected void setType(ExceptionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String s = getClass().getName();
        if (messages != null && messages.size() != 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < messages.size(); i++) {
                sb.append(messages.get(i).toString());
                if (i != messages.size() - 1) {
                    sb.append(", ");
                }
            }
            return s + ": " + sb.toString();
        } else {
            return s;
        }
    }

}
