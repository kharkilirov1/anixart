package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.yp0;

/* renamed from: com.yandex.mobile.ads.impl.pd */
/* loaded from: classes3.dex */
public abstract class AbstractC5587pd<T> implements yp0.InterfaceC6087a, InterfaceC5538oh {

    /* renamed from: a */
    @NonNull
    public final Context f53542a;

    /* renamed from: b */
    @NonNull
    private final yp0 f53543b = yp0.m29957a();

    /* renamed from: c */
    @NonNull
    public final AdResponse<T> f53544c;

    public AbstractC5587pd(@NonNull Context context, @NonNull AdResponse<T> adResponse) {
        this.f53542a = context;
        this.f53544c = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5538oh
    /* renamed from: a */
    public final synchronized boolean mo27086a() {
        return false;
    }

    @NonNull
    /* renamed from: b */
    public final AdResponse<T> m27309b() {
        return this.f53544c;
    }

    @NonNull
    /* renamed from: c */
    public final Context m27310c() {
        return this.f53542a;
    }

    /* renamed from: d */
    public final boolean m27311d() {
        return !this.f53543b.m29961b(this.f53542a);
    }

    /* renamed from: e */
    public final void m27312e() {
        StringBuilder m26356a = l60.m26356a("registerPhoneStateTracker(), clazz = ");
        m26356a.append(getClass());
        n60.m26811d(m26356a.toString(), new Object[0]);
        this.f53543b.m29959a(this.f53542a, this);
    }

    /* renamed from: f */
    public final void m27313f() {
        StringBuilder m26356a = l60.m26356a("unregisterPhoneStateTracker(), clazz = ");
        m26356a.append(getClass());
        n60.m26811d(m26356a.toString(), new Object[0]);
        this.f53543b.m29960b(this.f53542a, this);
    }
}
