package me.whiteship.demospring51;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS) // 이 어노테이션 정보를 얼마나 유지할것인가? CLASSFILE, COMPILE, RUNTIME -> CLASS가 기본 값
@Target({ElementType.METHOD})
public @interface PerfLogging {
}
