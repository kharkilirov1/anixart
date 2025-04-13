package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ov0 implements View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final zf1 f53333a;

    /* renamed from: b */
    @NonNull
    private final qv0 f53334b;

    /* renamed from: c */
    @NonNull
    private final mv0 f53335c;

    public ov0(@NonNull zf1 zf1Var, @NonNull qv0 qv0Var, @NonNull mv0 mv0Var) {
        this.f53333a = zf1Var;
        this.f53334b = qv0Var;
        this.f53335c = mv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NonNull View view) {
        sl0 m23881b = this.f53333a.m23881b();
        if (m23881b != null) {
            lv0 m27940b = m23881b.m28319a().m27940b();
            Objects.requireNonNull(this.f53335c);
            m27940b.setBackground(null);
            m27940b.setVisibility(8);
            m27940b.m26538a().setOnClickListener(null);
            this.f53334b.mo26158a();
        }
    }
}
