package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class yu0 {

    /* renamed from: a */
    @NonNull
    private final C4957d6 f56928a;

    /* renamed from: b */
    @NonNull
    private final xu0 f56929b;

    /* renamed from: c */
    @Nullable
    private final List<String> f56930c;

    public yu0(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2, @Nullable List<String> list) {
        this.f56930c = list;
        this.f56928a = new C4957d6(context, c5101g2);
        this.f56929b = new xu0(context, adResponse, c5101g2);
    }

    /* renamed from: a */
    public final void m29974a(@NonNull ek0 ek0Var) {
        this.f56929b.m29811a(ek0Var);
    }

    /* renamed from: a */
    public final void m29973a() {
        List<String> list = this.f56930c;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f56928a.m23816a(it.next());
            }
        }
        this.f56929b.m29810a();
    }
}
