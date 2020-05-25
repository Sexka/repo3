package com;
/*定义异常类NoScoreException,继承RunntimeException
提供空参构造和有参构造方法！
* */

public class NoScoreException extends RuntimeException {
    //无参构造方法
    public NoScoreException() {
        super();
    }
    //有参构造方法
    public NoScoreException(String message) {
        super(message);
    }
}
