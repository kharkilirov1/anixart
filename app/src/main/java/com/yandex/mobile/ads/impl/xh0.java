package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class xh0 {

    /* renamed from: a */
    @NonNull
    private final C4964db f56472a = new C4964db();

    @NonNull
    /* renamed from: a */
    public final ArrayList m29751a(@NonNull eh0 eh0Var) {
        HashSet hashSet = new HashSet();
        List<C5276ja<?>> m24163b = eh0Var.m24163b();
        Objects.requireNonNull(this.f56472a);
        Iterator it = C4964db.m23862a(m24163b).iterator();
        while (it.hasNext()) {
            z10 z10Var = (z10) it.next();
            if (!TextUtils.isEmpty(z10Var.m30038b())) {
                hashSet.add(z10Var.m30038b());
            }
        }
        return new ArrayList(hashSet);
    }
}
