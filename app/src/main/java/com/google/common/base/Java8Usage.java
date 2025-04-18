package com.google.common.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
final class Java8Usage {

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SomeTypeAnnotation {
    }
}
