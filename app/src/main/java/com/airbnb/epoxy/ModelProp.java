package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: defaultValue */
/* JADX WARN: Method from annotation default annotation not found: group */
/* JADX WARN: Method from annotation default annotation not found: options */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface ModelProp {

    public enum Option {
        /* JADX INFO: Fake field, exist only in values array */
        DoNotHash,
        /* JADX INFO: Fake field, exist only in values array */
        IgnoreRequireHashCode,
        /* JADX INFO: Fake field, exist only in values array */
        GenerateStringOverloads,
        /* JADX INFO: Fake field, exist only in values array */
        NullOnRecycle
    }
}
