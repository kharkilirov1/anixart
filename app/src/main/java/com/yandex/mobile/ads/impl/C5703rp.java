package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.rp */
/* loaded from: classes3.dex */
public final class C5703rp {

    /* renamed from: a */
    @NotNull
    private static final List<String> f54381a = CollectionsKt.m31994G("native_ad_view", "timer_container", "timer_value");

    /* renamed from: com.yandex.mobile.ads.impl.rp$a */
    public static final class a extends Lambda implements Function1<C5600pp, JSONObject> {

        /* renamed from: a */
        public static final a f54382a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final JSONObject invoke(C5600pp c5600pp) {
            return c5600pp.m27359a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rp$b */
    public static final class b extends Lambda implements Function1<JSONObject, List<? extends JSONObject>> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends JSONObject> invoke(JSONObject jSONObject) {
            JSONObject card = jSONObject;
            Intrinsics.m32179h(card, "card");
            return C5703rp.m27959a(C5703rp.this, card);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rp$c */
    public static final class c extends Lambda implements Function1<JSONObject, String> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(JSONObject jSONObject) {
            JSONObject node = jSONObject;
            Intrinsics.m32179h(node, "node");
            return C5703rp.m27963b(C5703rp.this, node);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rp$d */
    public static final class d extends Lambda implements Function1<String, Boolean> {

        /* renamed from: a */
        public static final d f54385a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String it = str;
            Intrinsics.m32179h(it, "it");
            return Boolean.valueOf(!C5703rp.f54381a.contains(it));
        }
    }

    /* renamed from: a */
    public static final ArrayList m27959a(C5703rp c5703rp, JSONObject jSONObject) {
        Objects.requireNonNull(c5703rp);
        ArrayList arrayList = new ArrayList();
        m27962a(jSONObject, new C5652qp(arrayList));
        return arrayList;
    }

    /* renamed from: b */
    public static final String m27963b(C5703rp c5703rp, JSONObject jSONObject) {
        Objects.requireNonNull(c5703rp);
        if (jSONObject.has("view_name")) {
            Object m27582a = py0.m27582a("view_name", jSONObject);
            if (m27582a instanceof String) {
                return (String) m27582a;
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m27964a(@NotNull InterfaceC6256u nativeAdPrivate) {
        Intrinsics.m32179h(nativeAdPrivate, "nativeAdPrivate");
        List<C5600pp> mo30563b = nativeAdPrivate.mo30563b();
        if (mo30563b == null) {
            mo30563b = EmptyList.f63144b;
        }
        return CollectionsKt.m32027j0(SequencesKt.m33833C(SequencesKt.m33841i(SequencesKt.m33853u(SequencesKt.m33846n(SequencesKt.m33852t(CollectionsKt.m32028k(mo30563b), a.f54382a), new b()), new c()), d.f54385a)));
    }

    /* renamed from: a */
    private static void m27962a(JSONObject jSONObject, Function1 function1) {
        ((C5652qp) function1).invoke(jSONObject);
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.m32178g(keys, "this.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.m32178g(key, "key");
            Object m27582a = py0.m27582a(key, jSONObject);
            if (m27582a instanceof JSONObject) {
                m27962a((JSONObject) m27582a, function1);
            } else if (m27582a instanceof JSONArray) {
                m27961a((JSONArray) m27582a, function1);
            }
        }
    }

    /* renamed from: a */
    private static void m27961a(JSONArray jSONArray, Function1 function1) {
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object m27583a = py0.m27583a(jSONArray, i2);
            if (m27583a instanceof JSONObject) {
                m27962a((JSONObject) m27583a, function1);
            } else if (m27583a instanceof JSONArray) {
                m27961a((JSONArray) m27583a, function1);
            }
        }
    }
}
