package androidx.window.core;

import android.graphics.Rect;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Bounds.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/core/Bounds;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Bounds {

    /* renamed from: a */
    public final int f6680a;

    /* renamed from: b */
    public final int f6681b;

    /* renamed from: c */
    public final int f6682c;

    /* renamed from: d */
    public final int f6683d;

    public Bounds(@NotNull Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f6680a = i2;
        this.f6681b = i3;
        this.f6682c = i4;
        this.f6683d = i5;
    }

    /* renamed from: a */
    public final int m4415a() {
        return this.f6683d - this.f6681b;
    }

    /* renamed from: b */
    public final int m4416b() {
        return this.f6682c - this.f6680a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m32174c(Bounds.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        Bounds bounds = (Bounds) obj;
        return this.f6680a == bounds.f6680a && this.f6681b == bounds.f6681b && this.f6682c == bounds.f6682c && this.f6683d == bounds.f6683d;
    }

    public int hashCode() {
        return (((((this.f6680a * 31) + this.f6681b) * 31) + this.f6682c) * 31) + this.f6683d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) "Bounds");
        sb.append(" { [");
        sb.append(this.f6680a);
        sb.append(',');
        sb.append(this.f6681b);
        sb.append(',');
        sb.append(this.f6682c);
        sb.append(',');
        return C0000a.m18o(sb, this.f6683d, "] }");
    }
}
