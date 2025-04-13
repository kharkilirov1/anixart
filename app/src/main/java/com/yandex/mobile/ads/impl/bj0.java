package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class bj0 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @Nullable
    private final qi0 f48902a;

    /* renamed from: b */
    @NonNull
    private final xh0 f48903b = new xh0();

    public bj0(@Nullable qi0 qi0Var) {
        this.f48902a = qi0Var;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        HashMap hashMap = new HashMap();
        qi0 qi0Var = this.f48902a;
        if (qi0Var != null) {
            List<eh0> m27736d = qi0Var.m27736d();
            xh0 xh0Var = this.f48903b;
            Objects.requireNonNull(xh0Var);
            HashSet hashSet = new HashSet();
            Iterator<eh0> it = m27736d.iterator();
            while (it.hasNext()) {
                hashSet.addAll(xh0Var.m29751a(it.next()));
            }
            ArrayList arrayList = new ArrayList(hashSet);
            if (!arrayList.isEmpty()) {
                hashMap.put("image_sizes", arrayList);
            }
        }
        return hashMap;
    }
}
