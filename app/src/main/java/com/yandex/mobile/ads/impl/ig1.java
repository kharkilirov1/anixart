package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ig1 implements View.OnClickListener {

    /* renamed from: a */
    @Nullable
    private final View f51299a;

    public ig1(@Nullable TextView textView) {
        this.f51299a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        View view2 = this.f51299a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
