package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jm1;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class am1 extends jm1 {

    /* renamed from: c */
    public final HashSet<String> f48605c;

    /* renamed from: d */
    public final JSONObject f48606d;

    /* renamed from: e */
    public final long f48607e;

    public am1(jm1.InterfaceC5294b interfaceC5294b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC5294b);
        this.f48605c = new HashSet<>(hashSet);
        this.f48606d = jSONObject;
        this.f48607e = j2;
    }
}
