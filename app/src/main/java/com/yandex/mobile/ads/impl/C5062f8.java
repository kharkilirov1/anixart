package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.f8 */
/* loaded from: classes3.dex */
public final class C5062f8 {

    /* renamed from: a */
    @NonNull
    private final Object f50144a = new Object();

    /* renamed from: b */
    @NonNull
    private final WeakHashMap<InterfaceC5170h8, Object> f50145b = new WeakHashMap<>();

    /* renamed from: a */
    public final void m24334a(@NonNull InterfaceC5170h8 interfaceC5170h8) {
        synchronized (this.f50144a) {
            this.f50145b.put(interfaceC5170h8, null);
        }
    }

    /* renamed from: b */
    public final void m24335b(@NonNull InterfaceC5170h8 interfaceC5170h8) {
        synchronized (this.f50144a) {
            this.f50145b.remove(interfaceC5170h8);
        }
    }

    /* renamed from: a */
    public final void m24332a() {
        ArrayList arrayList;
        synchronized (this.f50144a) {
            arrayList = new ArrayList(this.f50145b.keySet());
            this.f50145b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5170h8) it.next()).mo25074a(null);
        }
    }

    /* renamed from: a */
    public final void m24333a(@NonNull C4796a8 c4796a8) {
        ArrayList arrayList;
        synchronized (this.f50144a) {
            arrayList = new ArrayList(this.f50145b.keySet());
            this.f50145b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5170h8) it.next()).mo25074a(c4796a8);
        }
    }
}
