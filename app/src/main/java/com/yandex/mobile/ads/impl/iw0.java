package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.kw0;

/* loaded from: classes3.dex */
public final class iw0 {

    /* renamed from: a */
    private static volatile iw0 f51447a;

    /* renamed from: b */
    private static final Object f51448b = new Object();

    /* renamed from: com.yandex.mobile.ads.impl.iw0$a */
    public class C5253a implements kw0.InterfaceC5364b {

        /* renamed from: a */
        public final /* synthetic */ Object f51449a;

        public C5253a(Object obj) {
            this.f51449a = obj;
        }

        @Override // com.yandex.mobile.ads.impl.kw0.InterfaceC5364b
        /* renamed from: a */
        public final boolean mo25742a(zv0<?> zv0Var) {
            return this.f51449a.equals(zv0Var.m30324j());
        }
    }

    /* renamed from: a */
    public static iw0 m25739a() {
        if (f51447a == null) {
            synchronized (f51448b) {
                if (f51447a == null) {
                    f51447a = new iw0();
                }
            }
        }
        return f51447a;
    }

    /* renamed from: a */
    public final synchronized void m25741a(Context context, n41 n41Var) {
        um0.m29048a(context).m26292a(n41Var);
    }

    /* renamed from: a */
    public static void m25740a(@NonNull Context context, @NonNull Object obj) {
        um0.m29048a(context).m26291a(new C5253a(obj));
    }
}
