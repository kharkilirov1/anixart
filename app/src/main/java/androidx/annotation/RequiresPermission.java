package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: allOf */
/* JADX WARN: Method from annotation default annotation not found: anyOf */
/* JADX WARN: Method from annotation default annotation not found: conditional */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface RequiresPermission {

    /* JADX WARN: Method from annotation default annotation not found: value */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    public @interface Read {
    }

    /* JADX WARN: Method from annotation default annotation not found: value */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    public @interface Write {
    }
}
