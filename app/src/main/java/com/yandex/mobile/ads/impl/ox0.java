package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ox0 {

    /* renamed from: a */
    @NonNull
    private final v51 f53353a = new v51();

    /* renamed from: b */
    @NonNull
    private final o61 f53354b;

    public ox0(@NonNull o61 o61Var) {
        this.f53354b = o61Var;
    }

    /* renamed from: a */
    public final void m27129a(@NonNull View view, long j2, long j3) {
        view.setVisibility(0);
        TextView m27010b = this.f53354b.m27010b(view);
        if (m27010b != null) {
            Objects.requireNonNull(this.f53353a);
            v51.m29184a(m27010b, j2, j3);
        }
    }
}
