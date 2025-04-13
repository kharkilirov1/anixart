package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Jb */
/* loaded from: classes2.dex */
public class C3393Jb extends ECommerceEvent {

    /* renamed from: b */
    @NonNull
    public final C3268Eb f43239b;

    /* renamed from: c */
    @Nullable
    public final C3318Gb f43240c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4103lb<C3393Jb> f43241d;

    @VisibleForTesting
    public C3393Jb(@NonNull C3268Eb c3268Eb, @Nullable C3318Gb c3318Gb, @NonNull InterfaceC4103lb<C3393Jb> interfaceC4103lb) {
        this.f43239b = c3268Eb;
        this.f43240c = c3318Gb;
        this.f43241d = interfaceC4103lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @NonNull
    public String getPublicDescription() {
        return "shown product details info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p023ob.InterfaceC3293Fb
    public List<C4311tb<C3596Rf, InterfaceC3305Fn>> toProto() {
        return this.f43241d.mo17818b(this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ShownProductDetailInfoEvent{product=");
        m24u.append(this.f43239b);
        m24u.append(", referrer=");
        m24u.append(this.f43240c);
        m24u.append(", converter=");
        m24u.append(this.f43241d);
        m24u.append('}');
        return m24u.toString();
    }
}
