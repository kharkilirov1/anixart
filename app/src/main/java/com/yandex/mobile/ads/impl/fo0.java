package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class fo0 {

    /* renamed from: a */
    @NonNull
    private final Context f50397a;

    /* renamed from: b */
    @NonNull
    private final sn0 f50398b;

    /* renamed from: c */
    @NonNull
    private final un0 f50399c = un0.m29057a();

    /* renamed from: d */
    @NonNull
    private final go0 f50400d = new go0();

    public fo0(@NonNull Context context, @NonNull db1 db1Var) {
        this.f50397a = context.getApplicationContext();
        this.f50398b = new sn0(context, db1Var);
    }

    @Nullable
    /* renamed from: a */
    public final eo0 m24719a(@NonNull ArrayList arrayList) {
        if (this.f50400d.m24950b(this.f50397a)) {
            this.f50399c.m29058a(this.f50397a);
            tl1 m28342a = this.f50398b.m28342a(arrayList);
            if (m28342a != null) {
                return new eo0(m28342a, ib0.m25488a(m28342a), C5263j2.m25761a(m28342a));
            }
        }
        return null;
    }
}
