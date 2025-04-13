package com.yandex.metrica.impl.p023ob;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.sm */
/* loaded from: classes2.dex */
public final class C4296sm {

    /* renamed from: c */
    @NotNull
    public static final a f46477c = new a(null);

    /* renamed from: a */
    private final long f46478a;

    /* renamed from: b */
    private final int f46479b;

    /* renamed from: com.yandex.metrica.impl.ob.sm$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4296sm(long j2, int i2) {
        this.f46478a = j2;
        this.f46479b = i2;
    }

    /* renamed from: a */
    public final int m20767a() {
        return this.f46479b;
    }

    /* renamed from: b */
    public final long m20768b() {
        return this.f46478a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4296sm)) {
            return false;
        }
        C4296sm c4296sm = (C4296sm) obj;
        return this.f46478a == c4296sm.f46478a && this.f46479b == c4296sm.f46479b;
    }

    public int hashCode() {
        long j2 = this.f46478a;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + this.f46479b;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DecimalProtoModel(mantissa=");
        m24u.append(this.f46478a);
        m24u.append(", exponent=");
        return C0000a.m18o(m24u, this.f46479b, ")");
    }
}
