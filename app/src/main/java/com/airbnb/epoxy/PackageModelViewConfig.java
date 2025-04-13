package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: defaultBaseModelClass */
/* JADX WARN: Method from annotation default annotation not found: defaultLayoutPattern */
/* JADX WARN: Method from annotation default annotation not found: disableGenerateBuilderOverloads */
/* JADX WARN: Method from annotation default annotation not found: disableGenerateGetters */
/* JADX WARN: Method from annotation default annotation not found: disableGenerateReset */
/* JADX WARN: Method from annotation default annotation not found: generatedModelSuffix */
/* JADX WARN: Method from annotation default annotation not found: useLayoutOverloads */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface PackageModelViewConfig {

    public enum Option {
        Default,
        /* JADX INFO: Fake field, exist only in values array */
        Enabled,
        /* JADX INFO: Fake field, exist only in values array */
        Disabled
    }
}
