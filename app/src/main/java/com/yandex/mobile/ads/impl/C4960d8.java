package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.impl.d8 */
/* loaded from: classes3.dex */
public final class C4960d8 {

    /* renamed from: a */
    @NonNull
    private final Object f49597a = new Object();

    /* renamed from: b */
    @NonNull
    private final CopyOnWriteArrayList f49598b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m23832a(@NonNull Context context, @NonNull InterfaceC5170h8 interfaceC5170h8) {
        synchronized (this.f49597a) {
            this.f49598b.add(interfaceC5170h8);
            C4908c8.m23068a(context).m23072b(interfaceC5170h8);
        }
    }

    /* renamed from: a */
    public final void m23831a(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (this.f49597a) {
            arrayList = new ArrayList(this.f49598b);
            this.f49598b.clear();
        }
        C4908c8 m23068a = C4908c8.m23068a(context);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m23068a.m23071a((InterfaceC5170h8) it.next());
        }
    }
}
