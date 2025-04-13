package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.EnumC3124e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.w2 */
/* loaded from: classes2.dex */
public final class C4380w2 {

    /* renamed from: a */
    private final int f46844a;

    /* renamed from: b */
    private final int f46845b;

    /* renamed from: c */
    private final int f46846c;

    /* renamed from: d */
    private final float f46847d;

    /* renamed from: e */
    @Nullable
    private final EnumC3124e f46848e;

    public C4380w2(int i2, int i3, int i4, float f2, @Nullable EnumC3124e enumC3124e) {
        this.f46844a = i2;
        this.f46845b = i3;
        this.f46846c = i4;
        this.f46847d = f2;
        this.f46848e = enumC3124e;
    }

    @Nullable
    /* renamed from: a */
    public final EnumC3124e m21075a() {
        return this.f46848e;
    }

    /* renamed from: b */
    public final int m21076b() {
        return this.f46846c;
    }

    /* renamed from: c */
    public final int m21077c() {
        return this.f46845b;
    }

    /* renamed from: d */
    public final float m21078d() {
        return this.f46847d;
    }

    /* renamed from: e */
    public final int m21079e() {
        return this.f46844a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4380w2)) {
            return false;
        }
        C4380w2 c4380w2 = (C4380w2) obj;
        return this.f46844a == c4380w2.f46844a && this.f46845b == c4380w2.f46845b && this.f46846c == c4380w2.f46846c && Float.compare(this.f46847d, c4380w2.f46847d) == 0 && Intrinsics.m32174c(this.f46848e, c4380w2.f46848e);
    }

    public int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.f46847d) + (((((this.f46844a * 31) + this.f46845b) * 31) + this.f46846c) * 31)) * 31;
        EnumC3124e enumC3124e = this.f46848e;
        return floatToIntBits + (enumC3124e != null ? enumC3124e.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ScreenInfo(width=");
        m24u.append(this.f46844a);
        m24u.append(", height=");
        m24u.append(this.f46845b);
        m24u.append(", dpi=");
        m24u.append(this.f46846c);
        m24u.append(", scaleFactor=");
        m24u.append(this.f46847d);
        m24u.append(", deviceType=");
        m24u.append(this.f46848e);
        m24u.append(")");
        return m24u.toString();
    }
}
