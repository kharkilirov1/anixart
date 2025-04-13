package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes3.dex */
final class EnhancementResult<T> {

    /* renamed from: a */
    public final T f64644a;

    /* renamed from: b */
    @Nullable
    public final Annotations f64645b;

    public EnhancementResult(T t, @Nullable Annotations annotations) {
        this.f64644a = t;
        this.f64645b = annotations;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnhancementResult)) {
            return false;
        }
        EnhancementResult enhancementResult = (EnhancementResult) obj;
        return Intrinsics.m32174c(this.f64644a, enhancementResult.f64644a) && Intrinsics.m32174c(this.f64645b, enhancementResult.f64645b);
    }

    public int hashCode() {
        T t = this.f64644a;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        Annotations annotations = this.f64645b;
        return hashCode + (annotations != null ? annotations.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("EnhancementResult(result=");
        m24u.append(this.f64644a);
        m24u.append(", enhancementAnnotations=");
        m24u.append(this.f64645b);
        m24u.append(")");
        return m24u.toString();
    }
}
