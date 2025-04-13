package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: hash */
/* JADX WARN: Method from annotation default annotation not found: setter */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface EpoxyAttribute {

    public enum Option {
        /* JADX INFO: Fake field, exist only in values array */
        NoGetter,
        /* JADX INFO: Fake field, exist only in values array */
        NoSetter,
        DoNotHash,
        /* JADX INFO: Fake field, exist only in values array */
        IgnoreRequireHashCode,
        /* JADX INFO: Fake field, exist only in values array */
        DoNotUseInToString
    }
}
