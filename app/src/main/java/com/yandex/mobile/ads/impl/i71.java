package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class i71 {
    @NonNull
    /* renamed from: a */
    public static ArrayList m25456a(@Nullable ArrayList arrayList, @Nullable List list) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (list != null) {
            arrayList2.addAll(list);
        }
        return arrayList2;
    }
}
