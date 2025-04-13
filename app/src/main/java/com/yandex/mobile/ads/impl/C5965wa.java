package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.wa */
/* loaded from: classes3.dex */
public final class C5965wa {

    /* renamed from: a */
    @NonNull
    private final HashMap f56063a;

    public C5965wa(@NonNull List<C5276ja<?>> list) {
        this.f56063a = m29416a(list);
    }

    @NonNull
    /* renamed from: a */
    private static HashMap m29416a(@NonNull List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5276ja c5276ja = (C5276ja) it.next();
            hashMap.put(c5276ja.m25824b(), c5276ja.m25826d());
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: a */
    public final jc0 m29417a() {
        Object obj = this.f56063a.get("media");
        if (obj instanceof jc0) {
            return (jc0) obj;
        }
        return null;
    }
}
