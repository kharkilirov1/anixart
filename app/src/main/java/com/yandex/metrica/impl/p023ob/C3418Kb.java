package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Kb */
/* loaded from: classes2.dex */
public class C3418Kb extends ECommerceEvent {

    /* renamed from: b */
    @NonNull
    public final C3343Hb f43274b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4103lb<C3418Kb> f43275c;

    @VisibleForTesting
    public C3418Kb(@NonNull C3343Hb c3343Hb, @NonNull InterfaceC4103lb<C3418Kb> interfaceC4103lb) {
        this.f43274b = c3343Hb;
        this.f43275c = interfaceC4103lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @NonNull
    public String getPublicDescription() {
        return "shown screen info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p023ob.InterfaceC3293Fb
    public List<C4311tb<C3596Rf, InterfaceC3305Fn>> toProto() {
        return this.f43275c.mo17818b(this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ShownScreenInfoEvent{screen=");
        m24u.append(this.f43274b);
        m24u.append(", converter=");
        m24u.append(this.f43275c);
        m24u.append('}');
        return m24u.toString();
    }
}
