package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i81<T> {

    /* renamed from: a */
    private final T f51242a;

    /* renamed from: b */
    private final long f51243b;

    /* renamed from: com.yandex.mobile.ads.impl.i81$a */
    public static final class C5218a {
        private C5218a() {
        }

        public /* synthetic */ C5218a(int i2) {
            this();
        }

        /* renamed from: a */
        public static i81 m25462a(InterfaceC6044xw interfaceC6044xw, long j2) {
            return new i81(interfaceC6044xw, System.currentTimeMillis() + j2);
        }
    }

    static {
        new C5218a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i81(InterfaceC6044xw interfaceC6044xw, long j2) {
        this.f51242a = interfaceC6044xw;
        this.f51243b = j2;
    }

    /* renamed from: a */
    public final long m25460a() {
        return this.f51243b;
    }

    /* renamed from: b */
    public final T m25461b() {
        return this.f51242a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i81)) {
            return false;
        }
        i81 i81Var = (i81) obj;
        return Intrinsics.m32174c(this.f51242a, i81Var.f51242a) && this.f51243b == i81Var.f51243b;
    }

    public final int hashCode() {
        T t = this.f51242a;
        int hashCode = t == null ? 0 : t.hashCode();
        long j2 = this.f51243b;
        return ((int) (j2 ^ (j2 >>> 32))) + (hashCode * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("TtlWrapper(value=");
        m26356a.append(this.f51242a);
        m26356a.append(", expiredTimestamp=");
        m26356a.append(this.f51243b);
        m26356a.append(')');
        return m26356a.toString();
    }
}
