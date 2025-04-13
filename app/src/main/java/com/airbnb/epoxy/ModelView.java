package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: autoLayout */
/* JADX WARN: Method from annotation default annotation not found: baseModelClass */
/* JADX WARN: Method from annotation default annotation not found: defaultLayout */
/* JADX WARN: Method from annotation default annotation not found: fullSpan */
/* JADX WARN: Method from annotation default annotation not found: saveViewState */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface ModelView {

    public enum Size {
        NONE,
        WRAP_WIDTH_WRAP_HEIGHT,
        /* JADX INFO: Fake field, exist only in values array */
        WRAP_WIDTH_MATCH_HEIGHT,
        MATCH_WIDTH_WRAP_HEIGHT,
        /* JADX INFO: Fake field, exist only in values array */
        MATCH_WIDTH_MATCH_HEIGHT
    }
}
