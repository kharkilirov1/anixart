package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Pair<F, S> {

    /* renamed from: a */
    public final F f3552a;

    /* renamed from: b */
    public final S f3553b;

    public Pair(F f2, S s) {
        this.f3552a = f2;
        this.f3553b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.Api19Impl.m2024a(pair.f3552a, this.f3552a) && ObjectsCompat.Api19Impl.m2024a(pair.f3553b, this.f3553b);
    }

    public int hashCode() {
        F f2 = this.f3552a;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f3553b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Pair{");
        m24u.append(this.f3552a);
        m24u.append(" ");
        m24u.append(this.f3553b);
        m24u.append("}");
        return m24u.toString();
    }
}
