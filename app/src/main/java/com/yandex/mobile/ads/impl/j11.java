package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class j11 implements InterfaceC5426m5 {

    /* renamed from: a */
    @NonNull
    private final C5666r1 f51477a;

    /* renamed from: b */
    @Nullable
    private InterfaceC5473n5 f51478b;

    /* renamed from: com.yandex.mobile.ads.impl.j11$a */
    public class C5262a implements InterfaceC5722s1 {
        private C5262a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: a */
        public final void mo24858a() {
            if (j11.this.f51478b != null) {
                j11.this.f51478b.mo26027b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: b */
        public final void mo24862b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: d */
        public final void mo24865d() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: e */
        public final void mo24866e() {
            if (j11.this.f51478b != null) {
                j11.this.f51478b.mo26028c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5722s1
        /* renamed from: g */
        public final void mo24868g() {
            if (j11.this.f51478b != null) {
                j11.this.f51478b.mo26024a();
            }
        }

        public /* synthetic */ C5262a(j11 j11Var, int i2) {
            this();
        }
    }

    public j11(@NonNull Context context, @NonNull m50 m50Var, @NonNull t30 t30Var, @NonNull f40 f40Var, @NonNull i40 i40Var, @NonNull C5898v1 c5898v1) {
        C5262a c5262a = new C5262a(this, 0);
        C5666r1 c5666r1 = new C5666r1(context, m50Var, t30Var, f40Var, i40Var, c5898v1);
        this.f51477a = c5666r1;
        c5666r1.m27811a(c5262a);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    /* renamed from: c */
    public final void mo24864c() {
        this.f51477a.m27813b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    /* renamed from: f */
    public final void mo24867f() {
        this.f51477a.m27814c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    public final void prepare() {
        this.f51477a.m27815d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    public final void resume() {
        this.f51477a.m27817f();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    public final void start() {
        this.f51477a.m27818g();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    /* renamed from: a */
    public final void mo24860a(@Nullable InterfaceC5473n5 interfaceC5473n5) {
        this.f51478b = interfaceC5473n5;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5426m5
    /* renamed from: a */
    public final void mo24861a(@Nullable tb1 tb1Var) {
        this.f51477a.m27812a(tb1Var);
    }
}
