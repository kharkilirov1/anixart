package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class k01 implements View.OnClickListener {

    /* renamed from: a */
    private final View f51796a;

    public k01(@Nullable TextView textView) {
        this.f51796a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f51796a;
        if (view2 != null) {
            view2.setSelected(!view2.isSelected());
        }
    }
}
