package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Bb */
/* loaded from: classes2.dex */
public class C3193Bb extends ECommerceEvent {

    /* renamed from: b */
    public final int f42616b;

    /* renamed from: c */
    @NonNull
    public final C3218Cb f42617c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4103lb<C3193Bb> f42618d;

    @VisibleForTesting
    public C3193Bb(int i2, @NonNull C3218Cb c3218Cb, @NonNull InterfaceC4103lb<C3193Bb> interfaceC4103lb) {
        this.f42616b = i2;
        this.f42617c = c3218Cb;
        this.f42618d = interfaceC4103lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @NonNull
    public String getPublicDescription() {
        return "order info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p023ob.InterfaceC3293Fb
    public List<C4311tb<C3596Rf, InterfaceC3305Fn>> toProto() {
        return this.f42618d.mo17818b(this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("OrderInfoEvent{eventType=");
        m24u.append(this.f42616b);
        m24u.append(", order=");
        m24u.append(this.f42617c);
        m24u.append(", converter=");
        m24u.append(this.f42618d);
        m24u.append('}');
        return m24u.toString();
    }
}
