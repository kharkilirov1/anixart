package com.google.j2objc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface LoopTranslation {

    public enum LoopStyle {
        /* JADX INFO: Fake field, exist only in values array */
        JAVA_ITERATOR,
        /* JADX INFO: Fake field, exist only in values array */
        FAST_ENUMERATION
    }
}
