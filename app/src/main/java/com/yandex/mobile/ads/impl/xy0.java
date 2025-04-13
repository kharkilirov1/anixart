package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class xy0 {

    /* renamed from: a */
    @NonNull
    private final ArrayList f56603a;

    public xy0(@NonNull w30 w30Var) {
        this.f56603a = m29820a(w30Var);
    }

    @NonNull
    /* renamed from: a */
    private static ArrayList m29820a(@NonNull w30 w30Var) {
        ArrayList arrayList = new ArrayList();
        m50 m29372c = w30Var.m29372c();
        if (m29372c != null) {
            arrayList.add(new fr0(m29372c, 0L));
        }
        arrayList.addAll(w30Var.m29370a());
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m29821a() {
        return this.f56603a;
    }
}
