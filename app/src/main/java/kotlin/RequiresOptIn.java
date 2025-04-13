package kotlin;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: level */
/* JADX WARN: Method from annotation default annotation not found: message */
/* compiled from: OptIn.kt */
@Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, m31884d2 = {"Lkotlin/RequiresOptIn;", "", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "Lkotlin/RequiresOptIn$Level;", "level", "Level", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
/* loaded from: classes3.dex */
public @interface RequiresOptIn {

    /* compiled from: OptIn.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/RequiresOptIn$Level;", "", "WARNING", "ERROR", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public enum Level {
        WARNING,
        ERROR
    }
}
