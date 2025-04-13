package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.r1 */
/* loaded from: classes3.dex */
public final class C5666r1 {

    /* renamed from: a */
    @NonNull
    private final m50 f54154a;

    /* renamed from: b */
    @NonNull
    private final C5898v1 f54155b;

    /* renamed from: c */
    @NonNull
    private final f40 f54156c;

    /* renamed from: d */
    @NonNull
    private final C6003x2 f54157d;

    /* renamed from: e */
    @NonNull
    private final C6050y1 f54158e;

    /* renamed from: f */
    @Nullable
    private InterfaceC5722s1 f54159f;

    /* renamed from: g */
    private boolean f54160g;

    /* renamed from: com.yandex.mobile.ads.impl.r1$a */
    public class a implements InterfaceC6103z2 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC6103z2
        /* renamed from: a */
        public final void mo27819a() {
            EnumC5832u1 m29165a = C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a);
            if (m29165a.equals(EnumC5832u1.f55324h) || m29165a.equals(EnumC5832u1.f55323g)) {
                C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55320d);
                C5666r1.this.f54158e.m29841a();
                if (C5666r1.this.f54159f != null) {
                    C5666r1.this.f54159f.mo24866e();
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC6103z2
        /* renamed from: b */
        public final void mo27820b() {
            C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55322f);
            C5666r1.this.f54158e.m29842b();
            if (C5666r1.this.f54159f != null) {
                C5666r1.this.f54159f.mo24868g();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC6103z2
        /* renamed from: c */
        public final void mo27821c() {
            C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55322f);
            C5666r1.this.f54158e.m29842b();
            if (C5666r1.this.f54159f != null) {
                C5666r1.this.f54159f.mo24868g();
            }
        }

        public /* synthetic */ a(C5666r1 c5666r1, int i2) {
            this();
        }
    }

    public C5666r1(@NonNull Context context, @NonNull m50 m50Var, @NonNull t30 t30Var, @NonNull f40 f40Var, @NonNull i40 i40Var, @NonNull C5898v1 c5898v1) {
        this.f54154a = m50Var;
        this.f54155b = c5898v1;
        this.f54156c = f40Var;
        this.f54157d = new C6003x2(context, m50Var, t30Var, f40Var, i40Var, new a(this, 0));
        this.f54158e = new C6050y1(context, m50Var.m26569a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r0 != 7) goto L15;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m27816e() {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.v1 r0 = r3.f54155b
            com.yandex.mobile.ads.impl.m50 r1 = r3.f54154a
            com.yandex.mobile.ads.impl.u1 r0 = r0.m29165a(r1)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 5
            if (r0 == r1) goto L1c
            r1 = 6
            if (r0 == r1) goto L2b
            r1 = 7
            if (r0 == r1) goto L2b
            goto L3e
        L1c:
            com.yandex.mobile.ads.impl.v1 r0 = r3.f54155b
            com.yandex.mobile.ads.impl.m50 r1 = r3.f54154a
            com.yandex.mobile.ads.impl.u1 r2 = com.yandex.mobile.ads.impl.EnumC5832u1.f55317a
            r0.m29166a(r1, r2)
            com.yandex.mobile.ads.impl.x2 r0 = r3.f54157d
            r0.m29641a()
            goto L3e
        L2b:
            com.yandex.mobile.ads.impl.v1 r0 = r3.f54155b
            com.yandex.mobile.ads.impl.m50 r1 = r3.f54154a
            com.yandex.mobile.ads.impl.u1 r2 = com.yandex.mobile.ads.impl.EnumC5832u1.f55317a
            r0.m29166a(r1, r2)
            com.yandex.mobile.ads.impl.x2 r0 = r3.f54157d
            r0.m29648g()
            com.yandex.mobile.ads.impl.x2 r0 = r3.f54157d
            r0.m29641a()
        L3e:
            r0 = 0
            r3.f54160g = r0
            com.yandex.mobile.ads.impl.f40 r0 = r3.f54156c
            r0.m24313a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5666r1.m27816e():void");
    }

    /* renamed from: a */
    public final void m27811a(@Nullable InterfaceC5722s1 interfaceC5722s1) {
        this.f54159f = interfaceC5722s1;
    }

    /* renamed from: b */
    public final void m27813b() {
        int ordinal = this.f54155b.m29165a(this.f54154a).ordinal();
        if (ordinal == 1) {
            this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55317a);
            this.f54157d.m29648g();
            this.f54157d.m29641a();
        } else if (ordinal == 2) {
            this.f54160g = false;
            this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55317a);
            this.f54157d.m29648g();
            this.f54157d.m29641a();
        } else if (ordinal == 5) {
            this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55317a);
            this.f54157d.m29641a();
        } else if (ordinal == 6 || ordinal == 7) {
            this.f54160g = true;
            this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55317a);
            this.f54157d.m29648g();
            this.f54157d.m29641a();
        }
        this.f54156c.m24313a();
    }

    /* renamed from: c */
    public final void m27814c() {
        int ordinal = this.f54155b.m29165a(this.f54154a).ordinal();
        if (ordinal == 1) {
            this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55317a);
            this.f54157d.m29648g();
        } else if (ordinal == 6 || ordinal == 7) {
            this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55323g);
            this.f54157d.m29644c();
        }
        this.f54156c.m24313a();
    }

    /* renamed from: d */
    public final void m27815d() {
        if (this.f54155b.m29165a(this.f54154a).equals(EnumC5832u1.f55317a)) {
            this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55318b);
            this.f54157d.m29646e();
        }
    }

    /* renamed from: f */
    public final void m27817f() {
        int ordinal = this.f54155b.m29165a(this.f54154a).ordinal();
        if (ordinal == 0) {
            if (this.f54155b.m29165a(this.f54154a).equals(EnumC5832u1.f55317a)) {
                this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55318b);
                this.f54157d.m29646e();
                return;
            }
            return;
        }
        if (ordinal != 2) {
            if (ordinal == 6 || ordinal == 7) {
                this.f54157d.m29647f();
                return;
            }
            return;
        }
        if (this.f54155b.m29165a(this.f54154a).equals(EnumC5832u1.f55319c)) {
            InterfaceC5722s1 interfaceC5722s1 = this.f54159f;
            if (interfaceC5722s1 != null) {
                interfaceC5722s1.mo24865d();
            }
            this.f54157d.m29645d();
        }
    }

    /* renamed from: g */
    public final void m27818g() {
        if (this.f54155b.m29165a(this.f54154a).equals(EnumC5832u1.f55319c)) {
            InterfaceC5722s1 interfaceC5722s1 = this.f54159f;
            if (interfaceC5722s1 != null) {
                interfaceC5722s1.mo24865d();
            }
            this.f54157d.m29645d();
        }
    }

    /* renamed from: a */
    public final void m27812a(@Nullable sb1 sb1Var) {
        this.f54157d.m29642a(sb1Var);
    }

    /* renamed from: a */
    public final void m27810a() {
        int ordinal = this.f54155b.m29165a(this.f54154a).ordinal();
        if (ordinal == 6 || ordinal == 7) {
            this.f54155b.m29166a(this.f54154a, EnumC5832u1.f55323g);
            this.f54157d.m29644c();
        }
    }

    /* renamed from: e */
    public static void m27807e(C5666r1 c5666r1) {
        if (c5666r1.f54155b.m29165a(c5666r1.f54154a).equals(EnumC5832u1.f55319c)) {
            InterfaceC5722s1 interfaceC5722s1 = c5666r1.f54159f;
            if (interfaceC5722s1 != null) {
                interfaceC5722s1.mo24865d();
            }
            c5666r1.f54157d.m29645d();
        }
    }
}
