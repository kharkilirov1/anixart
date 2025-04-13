package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.qp */
/* loaded from: classes3.dex */
final class C5652qp extends Lambda implements Function1<JSONObject, Unit> {

    /* renamed from: a */
    public final /* synthetic */ List<JSONObject> f54121a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5652qp(ArrayList arrayList) {
        super(1);
        this.f54121a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        JSONObject node = jSONObject;
        Intrinsics.m32179h(node, "node");
        this.f54121a.add(node);
        return Unit.f63088a;
    }
}
