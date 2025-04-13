package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class j30 {

    /* renamed from: a */
    @NonNull
    private final g30 f51483a;

    /* renamed from: com.yandex.mobile.ads.impl.j30$a */
    public interface InterfaceC5265a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.j30$b */
    public static final class C5266b implements hw0<m50> {

        /* renamed from: a */
        @NonNull
        private final AtomicInteger f51484a;

        /* renamed from: b */
        @NonNull
        private final InterfaceC5265a f51485b;

        /* renamed from: c */
        @NonNull
        private final ArrayList f51486c;

        public /* synthetic */ C5266b(int i2, InterfaceC5265a interfaceC5265a, int i3) {
            this(i2, interfaceC5265a);
        }

        @Override // com.yandex.mobile.ads.impl.hw0
        /* renamed from: a */
        public final void mo22374a(@NonNull m50 m50Var) {
            this.f51486c.add(m50Var);
            if (this.f51484a.decrementAndGet() == 0) {
                ((a40) this.f51485b).m22375a(this.f51486c);
            }
        }

        private C5266b(int i2, @NonNull InterfaceC5265a interfaceC5265a) {
            this.f51484a = new AtomicInteger(i2);
            this.f51485b = interfaceC5265a;
            this.f51486c = new ArrayList();
        }

        @Override // com.yandex.mobile.ads.impl.hw0
        /* renamed from: a */
        public final void mo22373a(@NonNull ac1 ac1Var) {
            if (this.f51484a.decrementAndGet() == 0) {
                ((a40) this.f51485b).m22375a(this.f51486c);
            }
        }
    }

    public j30(@NonNull mc1 mc1Var) {
        this.f51483a = new g30(mc1Var);
    }

    /* renamed from: a */
    public final void m25767a(@NonNull Context context, @NonNull ArrayList arrayList, @NonNull InterfaceC5265a interfaceC5265a) {
        C5266b c5266b = new C5266b(arrayList.size(), interfaceC5265a, 0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f51483a.m24801a(context, (C5519o1) it.next(), c5266b);
        }
    }
}
