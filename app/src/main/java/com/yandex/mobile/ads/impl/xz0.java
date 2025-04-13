package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC4872bk;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class xz0 {

    /* renamed from: h */
    private static final Object f56607h = new Object();

    /* renamed from: i */
    @Nullable
    private static volatile xz0 f56608i;

    /* renamed from: a */
    @Nullable
    private cz0 f56609a;

    /* renamed from: b */
    @Nullable
    private Boolean f56610b;

    /* renamed from: c */
    @Nullable
    private Boolean f56611c;

    /* renamed from: d */
    @Nullable
    private Integer f56612d;

    /* renamed from: f */
    private boolean f56614f;

    /* renamed from: e */
    private boolean f56613e = false;

    /* renamed from: g */
    private boolean f56615g = true;

    private xz0() {
    }

    /* renamed from: b */
    public static xz0 m29823b() {
        if (f56608i == null) {
            synchronized (f56607h) {
                if (f56608i == null) {
                    f56608i = new xz0();
                }
            }
        }
        return f56608i;
    }

    @Nullable
    /* renamed from: a */
    public final cz0 m29824a(@NonNull Context context) {
        cz0 cz0Var;
        synchronized (f56607h) {
            if (this.f56609a == null) {
                Objects.requireNonNull(InterfaceC4872bk.f48907a);
                this.f56609a = InterfaceC4872bk.a.m22851a(context).mo22849a();
            }
            cz0Var = this.f56609a;
        }
        return cz0Var;
    }

    /* renamed from: c */
    public final Integer m29829c() {
        Integer num;
        synchronized (f56607h) {
            num = this.f56612d;
        }
        return num;
    }

    /* renamed from: d */
    public final void m29832d(boolean z) {
        synchronized (f56607h) {
            this.f56610b = Boolean.valueOf(z);
        }
    }

    /* renamed from: e */
    public final boolean m29833e() {
        boolean z;
        synchronized (f56607h) {
            z = this.f56614f;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean m29834f() {
        boolean z;
        synchronized (f56607h) {
            z = this.f56613e;
        }
        return z;
    }

    @Nullable
    /* renamed from: g */
    public final Boolean m29835g() {
        Boolean bool;
        synchronized (f56607h) {
            bool = this.f56610b;
        }
        return bool;
    }

    /* renamed from: h */
    public final boolean m29836h() {
        boolean z;
        synchronized (f56607h) {
            z = this.f56615g;
        }
        return z;
    }

    /* renamed from: c */
    public final void m29830c(boolean z) {
        synchronized (f56607h) {
            this.f56613e = z;
        }
    }

    @Nullable
    /* renamed from: d */
    public final Boolean m29831d() {
        Boolean bool;
        synchronized (f56607h) {
            bool = this.f56611c;
        }
        return bool;
    }

    /* renamed from: a */
    public final void m29826a(@NonNull Context context, @NonNull cz0 cz0Var) {
        synchronized (f56607h) {
            this.f56609a = cz0Var;
            Objects.requireNonNull(InterfaceC4872bk.f48907a);
            InterfaceC4872bk.a.m22851a(context).mo22850a(cz0Var);
        }
    }

    /* renamed from: b */
    public final void m29828b(boolean z) {
        synchronized (f56607h) {
            this.f56611c = Boolean.valueOf(z);
        }
    }

    @Nullable
    /* renamed from: a */
    public static void m29822a() {
        synchronized (f56607h) {
        }
    }

    /* renamed from: a */
    public final void m29827a(boolean z) {
        synchronized (f56607h) {
            this.f56614f = z;
            this.f56615g = z;
        }
    }

    /* renamed from: a */
    public final void m29825a(int i2) {
        synchronized (f56607h) {
            this.f56612d = Integer.valueOf(i2);
        }
    }
}
