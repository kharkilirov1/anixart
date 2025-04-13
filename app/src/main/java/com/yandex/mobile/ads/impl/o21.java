package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o21 {

    /* renamed from: a */
    @NotNull
    private final m21 f53137a = new m21();

    /* renamed from: b */
    @NotNull
    private final C5739sc f53138b = new C5739sc();

    @NotNull
    /* renamed from: a */
    public final n21 m26988a(@NotNull JSONObject jsonValue) throws JSONException {
        f21 f21Var;
        C5683rc c5683rc;
        Intrinsics.m32179h(jsonValue, "jsonValue");
        Object opt = jsonValue.opt("ColorWizButton");
        ArrayList arrayList = null;
        String str = opt instanceof String ? (String) opt : null;
        Object opt2 = jsonValue.opt("ColorWizButtonText");
        String str2 = opt2 instanceof String ? (String) opt2 : null;
        Object opt3 = jsonValue.opt("ColorWizBack");
        String str3 = opt3 instanceof String ? (String) opt3 : null;
        Object opt4 = jsonValue.opt("ColorWizBackRight");
        String str4 = opt4 instanceof String ? (String) opt4 : null;
        JSONObject optJSONObject = jsonValue.optJSONObject("backgroundColors");
        JSONObject optJSONObject2 = jsonValue.optJSONObject("smart-center");
        JSONArray optJSONArray = jsonValue.optJSONArray("smart-centers");
        if (optJSONObject2 != null) {
            Objects.requireNonNull(this.f53137a);
            f21Var = m21.m26560a(optJSONObject2);
        } else {
            f21Var = null;
        }
        if (optJSONObject != null) {
            Objects.requireNonNull(this.f53138b);
            c5683rc = C5739sc.m28204a(optJSONObject);
        } else {
            c5683rc = null;
        }
        if (optJSONArray != null) {
            IntRange m32243j = RangesKt.m32243j(0, optJSONArray.length());
            arrayList = new ArrayList(CollectionsKt.m32032m(m32243j, 10));
            IntIterator it = m32243j.iterator();
            while (((IntProgressionIterator) it).f63385d) {
                int mo1135a = it.mo1135a();
                m21 m21Var = this.f53137a;
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(mo1135a);
                Intrinsics.m32178g(optJSONObject3, "smartCentersJsonArray.optJSONObject(index)");
                Objects.requireNonNull(m21Var);
                arrayList.add(m21.m26560a(optJSONObject3));
            }
        }
        return new n21(str, str2, str3, str4, c5683rc, f21Var, arrayList);
    }
}
