package com.yandex.metrica.identifiers.impl;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.h */
/* loaded from: classes2.dex */
public final class C3139h {

    /* renamed from: a */
    public final Map f42499a;

    public C3139h(Map map, int i2) {
        Map providers = (i2 & 1) != 0 ? MapsKt.m32064i(new Pair("google", new C3142k()), new Pair("huawei", new C3149r()), new Pair("yandex", new C3146o())) : null;
        Intrinsics.m32179h(providers, "providers");
        this.f42499a = providers;
    }
}
