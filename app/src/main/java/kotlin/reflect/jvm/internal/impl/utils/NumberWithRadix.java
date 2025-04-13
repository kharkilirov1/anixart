package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: numbers.kt */
/* loaded from: classes3.dex */
public final class NumberWithRadix {

    /* renamed from: a */
    @NotNull
    public final String f66499a;

    /* renamed from: b */
    public final int f66500b;

    public NumberWithRadix(@NotNull String str, int i2) {
        this.f66499a = str;
        this.f66500b = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof NumberWithRadix) {
                NumberWithRadix numberWithRadix = (NumberWithRadix) obj;
                if (Intrinsics.m32174c(this.f66499a, numberWithRadix.f66499a)) {
                    if (this.f66500b == numberWithRadix.f66500b) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f66499a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f66500b;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NumberWithRadix(number=");
        m24u.append(this.f66499a);
        m24u.append(", radix=");
        return C0000a.m18o(m24u, this.f66500b, ")");
    }
}
