package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.sv0;

/* renamed from: com.yandex.mobile.ads.impl.a0 */
/* loaded from: classes3.dex */
public final class C4786a0 {

    /* renamed from: a */
    @NonNull
    private final Context f48277a;

    /* renamed from: b */
    @NonNull
    private final C5101g2 f48278b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4832b0 f48279c;

    /* renamed from: d */
    @Nullable
    private C6098z f48280d;

    /* renamed from: e */
    @Nullable
    private sv0.InterfaceC5763a f48281e;

    public C4786a0(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull InterfaceC4832b0 interfaceC4832b0) {
        Context applicationContext = context.getApplicationContext();
        this.f48277a = applicationContext;
        this.f48278b = c5101g2;
        this.f48279c = interfaceC4832b0;
        this.f48280d = new C6098z(applicationContext, c5101g2, interfaceC4832b0, null);
    }

    /* renamed from: a */
    public final void m22338a(@Nullable FalseClick falseClick) {
        this.f48280d = new C6098z(this.f48277a, this.f48278b, this.f48279c, falseClick);
        sv0.InterfaceC5763a interfaceC5763a = this.f48281e;
        if (interfaceC5763a != null) {
            m22339a(interfaceC5763a);
        }
    }

    /* renamed from: b */
    public final void m22340b() {
        C6098z c6098z = this.f48280d;
        if (c6098z != null) {
            c6098z.m30003b();
        }
    }

    /* renamed from: c */
    public final void m22341c() {
        C6098z c6098z = this.f48280d;
        if (c6098z != null) {
            c6098z.m30004c();
        }
    }

    /* renamed from: d */
    public final void m22342d() {
        C6098z c6098z = this.f48280d;
        if (c6098z != null) {
            c6098z.m30006e();
        }
    }

    /* renamed from: e */
    public final void m22343e() {
        C6098z c6098z = this.f48280d;
        if (c6098z != null) {
            c6098z.m30007f();
        }
    }

    /* renamed from: f */
    public final void m22344f() {
        C6098z c6098z = this.f48280d;
        if (c6098z != null) {
            c6098z.m30008g();
        }
    }

    /* renamed from: a */
    public final void m22337a() {
        C6098z c6098z = this.f48280d;
        if (c6098z != null) {
            c6098z.m30001a();
        }
    }

    /* renamed from: a */
    public final void m22339a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f48281e = interfaceC5763a;
        C6098z c6098z = this.f48280d;
        if (c6098z != null) {
            c6098z.m30002a(interfaceC5763a);
        }
    }
}
