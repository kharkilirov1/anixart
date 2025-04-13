package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: enums */
/* JADX WARN: Method from annotation default annotation not found: uuid */
@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface BuiltInTypeConverters {

    public enum State {
        /* JADX INFO: Fake field, exist only in values array */
        ENABLED,
        /* JADX INFO: Fake field, exist only in values array */
        DISABLED,
        INHERITED
    }
}
