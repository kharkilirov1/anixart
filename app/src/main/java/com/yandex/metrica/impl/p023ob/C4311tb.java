package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.InterfaceC3305Fn;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.tb */
/* loaded from: classes2.dex */
public class C4311tb<R, M extends InterfaceC3305Fn> implements InterfaceC3305Fn {

    /* renamed from: a */
    @NonNull
    public final R f46509a;

    /* renamed from: b */
    @NonNull
    public final M f46510b;

    public C4311tb(@NonNull R r, @NonNull M m2) {
        this.f46509a = r;
        this.f46510b = m2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3305Fn
    /* renamed from: a */
    public int mo18020a() {
        return this.f46510b.mo18020a();
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Result{result=");
        m24u.append(this.f46509a);
        m24u.append(", metaInfo=");
        m24u.append(this.f46510b);
        m24u.append('}');
        return m24u.toString();
    }
}
