package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: attributeId */
/* JADX WARN: Method from annotation default annotation not found: enumMapping */
/* JADX WARN: Method from annotation default annotation not found: flagMapping */
/* JADX WARN: Method from annotation default annotation not found: hasAttributeId */
/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: valueType */
@Target({ElementType.METHOD})
@Deprecated
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface InspectableProperty {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EnumEntry {
    }

    /* JADX WARN: Method from annotation default annotation not found: mask */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FlagEntry {
    }

    public enum ValueType {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        INFERRED,
        /* JADX INFO: Fake field, exist only in values array */
        INT_ENUM,
        /* JADX INFO: Fake field, exist only in values array */
        INT_FLAG,
        /* JADX INFO: Fake field, exist only in values array */
        COLOR,
        /* JADX INFO: Fake field, exist only in values array */
        GRAVITY,
        /* JADX INFO: Fake field, exist only in values array */
        RESOURCE_ID
    }
}
