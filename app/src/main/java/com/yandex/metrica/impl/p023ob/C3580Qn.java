package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.InterfaceC3305Fn;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Qn */
/* loaded from: classes2.dex */
public class C3580Qn<V, M extends InterfaceC3305Fn> implements InterfaceC3305Fn {

    /* renamed from: a */
    @Nullable
    public final V f43777a;

    /* renamed from: b */
    @NonNull
    public final M f43778b;

    public C3580Qn(@Nullable V v, @NonNull M m2) {
        this.f43777a = v;
        this.f43778b = m2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3305Fn
    /* renamed from: a */
    public int mo18020a() {
        return this.f43778b.mo18020a();
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("TrimmingResult{value=");
        m24u.append(this.f43777a);
        m24u.append(", metaInfo=");
        m24u.append(this.f43778b);
        m24u.append('}');
        return m24u.toString();
    }
}
