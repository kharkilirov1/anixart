package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class o61 {

    /* renamed from: a */
    @NonNull
    private final oy0 f53176a = new oy0();

    @Nullable
    /* renamed from: a */
    public final View m27009a(@NonNull View view) {
        oy0 oy0Var = this.f53176a;
        View findViewWithTag = view.findViewWithTag("timer_container");
        Objects.requireNonNull(oy0Var);
        return (View) oy0.m27130a(View.class, findViewWithTag);
    }

    @Nullable
    /* renamed from: b */
    public final TextView m27010b(@NonNull View view) {
        oy0 oy0Var = this.f53176a;
        View findViewWithTag = view.findViewWithTag("timer_value");
        Objects.requireNonNull(oy0Var);
        return (TextView) oy0.m27130a(TextView.class, findViewWithTag);
    }
}
