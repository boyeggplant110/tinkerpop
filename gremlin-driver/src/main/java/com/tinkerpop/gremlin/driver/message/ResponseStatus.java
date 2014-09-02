package com.tinkerpop.gremlin.driver.message;

import java.util.Map;

/**
 * @author Stephen Mallette (http://stephen.genoprime.com)
 */
public class ResponseStatus {
    private final ResultCode code;
    private final String message;
    private final Map<String, Object> attributes;

    public ResponseStatus(final ResultCode code, final String message, final Map<String,Object> attributes){
        this.code = code;
        this.message = message;
        this.attributes = attributes;
    }

    public ResultCode getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "ResponseStatus{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
