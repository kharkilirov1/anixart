package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.zb */
/* loaded from: classes2.dex */
public class C4467zb extends ECommerceEvent {

    /* renamed from: b */
    public final int f47105b;

    /* renamed from: c */
    @NonNull
    public final C3168Ab f47106c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4103lb<C4467zb> f47107d;

    @VisibleForTesting
    public C4467zb(int i2, @NonNull C3168Ab c3168Ab, @NonNull InterfaceC4103lb<C4467zb> interfaceC4103lb) {
        this.f47105b = i2;
        this.f47106c = c3168Ab;
        this.f47107d = interfaceC4103lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @NonNull
    public String getPublicDescription() {
        int i2 = this.f47105b;
        return i2 != 4 ? i2 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p023ob.InterfaceC3293Fb
    public List<C4311tb<C3596Rf, InterfaceC3305Fn>> toProto() {
        return this.f47107d.mo17818b(this);
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CartActionInfoEvent{eventType=");
        m24u.append(this.f47105b);
        m24u.append(", cartItem=");
        m24u.append(this.f47106c);
        m24u.append(", converter=");
        m24u.append(this.f47107d);
        m24u.append('}');
        return m24u.toString();
    }
}
