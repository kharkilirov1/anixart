package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: orders */
/* JADX WARN: Method from annotation default annotation not found: unique */
@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface Index {

    public enum Order {
        /* JADX INFO: Fake field, exist only in values array */
        ASC,
        /* JADX INFO: Fake field, exist only in values array */
        DESC
    }
}
