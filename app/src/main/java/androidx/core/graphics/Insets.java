package androidx.core.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class Insets {

    /* renamed from: e */
    @NonNull
    public static final Insets f3367e = new Insets(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3368a;

    /* renamed from: b */
    public final int f3369b;

    /* renamed from: c */
    public final int f3370c;

    /* renamed from: d */
    public final int f3371d;

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static android.graphics.Insets m1782a(int i2, int i3, int i4, int i5) {
            return android.graphics.Insets.of(i2, i3, i4, i5);
        }
    }

    public Insets(int i2, int i3, int i4, int i5) {
        this.f3368a = i2;
        this.f3369b = i3;
        this.f3370c = i4;
        this.f3371d = i5;
    }

    @NonNull
    /* renamed from: a */
    public static Insets m1778a(@NonNull Insets insets, @NonNull Insets insets2) {
        return m1779b(Math.max(insets.f3368a, insets2.f3368a), Math.max(insets.f3369b, insets2.f3369b), Math.max(insets.f3370c, insets2.f3370c), Math.max(insets.f3371d, insets2.f3371d));
    }

    @NonNull
    /* renamed from: b */
    public static Insets m1779b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f3367e : new Insets(i2, i3, i4, i5);
    }

    @NonNull
    @RequiresApi
    /* renamed from: c */
    public static Insets m1780c(@NonNull android.graphics.Insets insets) {
        return m1779b(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    @RequiresApi
    /* renamed from: d */
    public android.graphics.Insets m1781d() {
        return Api29Impl.m1782a(this.f3368a, this.f3369b, this.f3370c, this.f3371d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.f3371d == insets.f3371d && this.f3368a == insets.f3368a && this.f3370c == insets.f3370c && this.f3369b == insets.f3369b;
    }

    public int hashCode() {
        return (((((this.f3368a * 31) + this.f3369b) * 31) + this.f3370c) * 31) + this.f3371d;
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Insets{left=");
        m24u.append(this.f3368a);
        m24u.append(", top=");
        m24u.append(this.f3369b);
        m24u.append(", right=");
        m24u.append(this.f3370c);
        m24u.append(", bottom=");
        return C0000a.m17n(m24u, this.f3371d, '}');
    }
}
