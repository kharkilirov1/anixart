package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.xl */
/* loaded from: classes2.dex */
class C4425xl {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4243ql f46951a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3203Bl f46952b;

    public C4425xl(@NonNull InterfaceC4243ql interfaceC4243ql, @NonNull InterfaceC3203Bl interfaceC3203Bl) {
        this.f46951a = interfaceC4243ql;
        this.f46952b = interfaceC3203Bl;
    }

    /* renamed from: a */
    public boolean m21162a(@NonNull Activity activity, @NonNull C3854bm c3854bm) {
        Bundle mo17980a = this.f46951a.mo17980a(activity);
        return this.f46952b.mo17906a(mo17980a == null ? null : mo17980a.getString("yandex:ads:context"), c3854bm);
    }
}
