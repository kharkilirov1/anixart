package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ib */
/* loaded from: classes2.dex */
public class C3368Ib extends ECommerceEvent {

    /* renamed from: b */
    @NonNull
    public final C3268Eb f43118b;

    /* renamed from: c */
    @NonNull
    public final C3343Hb f43119c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4103lb<C3368Ib> f43120d;

    @VisibleForTesting
    public C3368Ib(@NonNull C3268Eb c3268Eb, @NonNull C3343Hb c3343Hb, @NonNull InterfaceC4103lb<C3368Ib> interfaceC4103lb) {
        this.f43118b = c3268Eb;
        this.f43119c = c3343Hb;
        this.f43120d = interfaceC4103lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @NonNull
    public String getPublicDescription() {
        return "shown product card info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p023ob.InterfaceC3293Fb
    public List<C4311tb<C3596Rf, InterfaceC3305Fn>> toProto() {
        return this.f43120d.mo17818b(this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ShownProductCardInfoEvent{product=");
        m24u.append(this.f43118b);
        m24u.append(", screen=");
        m24u.append(this.f43119c);
        m24u.append(", converter=");
        m24u.append(this.f43120d);
        m24u.append('}');
        return m24u.toString();
    }
}
