package com.yandex.metrica.impl.p023ob;

import androidx.annotation.WorkerThread;
import com.yandex.metrica.billing_interface.C3115a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.m */
/* loaded from: classes2.dex */
public final class C4117m implements InterfaceC4273s {

    /* renamed from: a */
    private boolean f45926a;

    /* renamed from: b */
    private final Map<String, C3115a> f45927b;

    /* renamed from: c */
    private final InterfaceC4325u f45928c;

    public C4117m(@NotNull InterfaceC4325u storage) {
        Intrinsics.m32179h(storage, "storage");
        this.f45928c = storage;
        C4381w3 c4381w3 = (C4381w3) storage;
        this.f45926a = c4381w3.m21082b();
        List<C3115a> m21080a = c4381w3.m21080a();
        Intrinsics.m32178g(m21080a, "storage.billingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m21080a) {
            linkedHashMap.put(((C3115a) obj).f42393b, obj);
        }
        this.f45927b = linkedHashMap;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4273s
    @WorkerThread
    /* renamed from: a */
    public void mo20070a(@NotNull Map<String, ? extends C3115a> history) {
        Intrinsics.m32179h(history, "history");
        for (C3115a c3115a : history.values()) {
            Map<String, C3115a> map = this.f45927b;
            String str = c3115a.f42393b;
            Intrinsics.m32178g(str, "billingInfo.sku");
            map.put(str, c3115a);
        }
        ((C4381w3) this.f45928c).m21081a(CollectionsKt.m32027j0(this.f45927b.values()), this.f45926a);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4273s
    /* renamed from: b */
    public void mo20072b() {
        if (this.f45926a) {
            return;
        }
        this.f45926a = true;
        ((C4381w3) this.f45928c).m21081a(CollectionsKt.m32027j0(this.f45927b.values()), this.f45926a);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4273s
    @Nullable
    /* renamed from: a */
    public C3115a mo20069a(@NotNull String sku) {
        Intrinsics.m32179h(sku, "sku");
        return this.f45927b.get(sku);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4273s
    /* renamed from: a */
    public boolean mo20071a() {
        return this.f45926a;
    }
}
