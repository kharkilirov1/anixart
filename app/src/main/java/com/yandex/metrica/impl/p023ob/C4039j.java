package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.billing_interface.C3115a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j */
/* loaded from: classes2.dex */
public class C4039j implements InterfaceC4273s {

    /* renamed from: a */
    private boolean f45361a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC4325u f45362b;

    /* renamed from: c */
    @NonNull
    private final Map<String, C3115a> f45363c = new HashMap();

    public C4039j(@NonNull InterfaceC4325u interfaceC4325u) {
        C4381w3 c4381w3 = (C4381w3) interfaceC4325u;
        for (C3115a c3115a : c4381w3.m21080a()) {
            this.f45363c.put(c3115a.f42393b, c3115a);
        }
        this.f45361a = c4381w3.m21082b();
        this.f45362b = c4381w3;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4273s
    @WorkerThread
    /* renamed from: a */
    public void mo20070a(@NonNull Map<String, C3115a> map) {
        for (C3115a c3115a : map.values()) {
            this.f45363c.put(c3115a.f42393b, c3115a);
        }
        ((C4381w3) this.f45362b).m21081a(new ArrayList(this.f45363c.values()), this.f45361a);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4273s
    /* renamed from: b */
    public void mo20072b() {
        if (this.f45361a) {
            return;
        }
        this.f45361a = true;
        ((C4381w3) this.f45362b).m21081a(new ArrayList(this.f45363c.values()), this.f45361a);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4273s
    @Nullable
    /* renamed from: a */
    public C3115a mo20069a(@NonNull String str) {
        return this.f45363c.get(str);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4273s
    /* renamed from: a */
    public boolean mo20071a() {
        return this.f45361a;
    }
}
