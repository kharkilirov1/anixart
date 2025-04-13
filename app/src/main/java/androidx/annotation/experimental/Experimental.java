package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX WARN: Method from annotation default annotation not found: level */
/* compiled from: Experimental.kt */
@Target({ElementType.ANNOTATION_TYPE})
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, m31884d2 = {"Landroidx/annotation/experimental/Experimental;", "", "Landroidx/annotation/experimental/Experimental$Level;", "level", "Level", "annotation-experimental_release"}, m31885k = 1, m31886mv = {1, 4, 2})
@Deprecated
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
/* loaded from: classes.dex */
public @interface Experimental {

    /* compiled from: Experimental.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/annotation/experimental/Experimental$Level;", "", "WARNING", "ERROR", "annotation-experimental_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public enum Level {
        /* JADX INFO: Fake field, exist only in values array */
        WARNING,
        ERROR
    }
}
