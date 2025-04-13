package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: collate */
/* JADX WARN: Method from annotation default annotation not found: defaultValue */
/* JADX WARN: Method from annotation default annotation not found: index */
/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: typeAffinity */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface ColumnInfo {

    @Retention(RetentionPolicy.CLASS)
    public @interface Collate {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface SQLiteTypeAffinity {
    }
}
