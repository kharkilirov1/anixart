package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes3.dex */
public final class ApproximationBounds<T> {

    /* renamed from: a */
    public final T f66412a;

    /* renamed from: b */
    public final T f66413b;

    public ApproximationBounds(T t, T t2) {
        this.f66412a = t;
        this.f66413b = t2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.m32174c(this.f66412a, approximationBounds.f66412a) && Intrinsics.m32174c(this.f66413b, approximationBounds.f66413b);
    }

    public int hashCode() {
        T t = this.f66412a;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.f66413b;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ApproximationBounds(lower=");
        m24u.append(this.f66412a);
        m24u.append(", upper=");
        m24u.append(this.f66413b);
        m24u.append(")");
        return m24u.toString();
    }
}
