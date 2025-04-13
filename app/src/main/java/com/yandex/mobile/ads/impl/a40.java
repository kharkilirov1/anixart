package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.j30;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a40 implements hw0<gh1>, j30.InterfaceC5265a {

    /* renamed from: a */
    @NonNull
    private final Context f48306a;

    /* renamed from: b */
    @NonNull
    private final j30 f48307b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4792a f48308c;

    /* renamed from: d */
    @NonNull
    private final C5813tq f48309d = new C5813tq();

    /* renamed from: com.yandex.mobile.ads.impl.a40$a */
    public interface InterfaceC4792a {
        /* renamed from: a */
        void mo22376a(@NonNull l50 l50Var);

        /* renamed from: a */
        void mo22377a(@NonNull String str);
    }

    public a40(@NonNull Context context, @NonNull mc1 mc1Var, @NonNull InterfaceC4792a interfaceC4792a) {
        this.f48306a = context.getApplicationContext();
        this.f48308c = interfaceC4792a;
        this.f48307b = new j30(mc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22374a(@NonNull gh1 gh1Var) {
        List<C5519o1> m24896a = gh1Var.m24896a();
        ArrayList arrayList = new ArrayList();
        for (C5519o1 c5519o1 : m24896a) {
            if (c5519o1.m26981d().contains("linear")) {
                arrayList.add(c5519o1);
            }
        }
        if (arrayList.isEmpty()) {
            this.f48308c.mo22377a("Received response with no ad breaks");
        } else {
            this.f48307b.m25767a(this.f48306a, arrayList, this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22373a(@NonNull ac1 ac1Var) {
        this.f48308c.mo22377a(ac1Var.m22463c());
    }

    /* renamed from: a */
    public final void m22375a(@NonNull ArrayList arrayList) {
        Objects.requireNonNull(this.f48309d);
        ArrayList m28697a = C5813tq.m28697a(arrayList);
        if (!m28697a.isEmpty()) {
            this.f48308c.mo22376a(new l50(m28697a));
        } else {
            this.f48308c.mo22377a("Received response with no ad breaks");
        }
    }
}
