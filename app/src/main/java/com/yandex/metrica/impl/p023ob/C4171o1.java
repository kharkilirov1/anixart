package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.o1 */
/* loaded from: classes2.dex */
public class C4171o1 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3712W6 f46026a;

    /* renamed from: b */
    @NonNull
    private final C3887d3 f46027b;

    /* renamed from: c */
    @NonNull
    private final C3406K f46028c;

    /* renamed from: d */
    @NonNull
    private final C3256E f46029d;

    /* renamed from: e */
    @NonNull
    private final List<InterfaceC3284F2> f46030e;

    public C4171o1(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(C3658U2.m19211a(21) ? new C3737X6(context) : new C3762Y6(), new C3887d3(context, interfaceExecutorC4297sn), new C3406K(context, interfaceExecutorC4297sn), new C3256E());
    }

    /* renamed from: a */
    public synchronized void m20469a(@NonNull InterfaceC3284F2 interfaceC3284F2) {
        this.f46030e.add(interfaceC3284F2);
    }

    @NonNull
    /* renamed from: b */
    public C3406K m20470b() {
        return this.f46028c;
    }

    @NonNull
    /* renamed from: c */
    public InterfaceC3712W6 m20471c() {
        return this.f46026a;
    }

    @NonNull
    /* renamed from: d */
    public C3887d3 m20472d() {
        return this.f46027b;
    }

    /* renamed from: e */
    public synchronized void m20473e() {
        Iterator<InterfaceC3284F2> it = this.f46030e.iterator();
        while (it.hasNext()) {
            it.next().mo17988a();
        }
    }

    /* renamed from: f */
    public synchronized void m20474f() {
        Iterator<InterfaceC3284F2> it = this.f46030e.iterator();
        while (it.hasNext()) {
            it.next().mo17990b();
        }
    }

    @NonNull
    /* renamed from: a */
    public C3256E m20468a() {
        return this.f46029d;
    }

    @VisibleForTesting
    public C4171o1(@NonNull InterfaceC3712W6 interfaceC3712W6, @NonNull C3887d3 c3887d3, @NonNull C3406K c3406k, @NonNull C3256E c3256e) {
        ArrayList arrayList = new ArrayList();
        this.f46030e = arrayList;
        this.f46026a = interfaceC3712W6;
        arrayList.add(interfaceC3712W6);
        this.f46027b = c3887d3;
        arrayList.add(c3887d3);
        this.f46028c = c3406k;
        arrayList.add(c3406k);
        this.f46029d = c3256e;
        arrayList.add(c3256e);
    }
}
