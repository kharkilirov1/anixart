package com.google.j2objc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface ReflectionSupport {

    public enum Level {
        /* JADX INFO: Fake field, exist only in values array */
        NATIVE_ONLY,
        FULL
    }
}
