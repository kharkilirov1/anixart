package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class a61 extends dg1<TextView, String> {
    public a61(@NonNull TextView textView) {
        super(textView);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22387a(@NonNull TextView textView) {
        TextView textView2 = textView;
        textView2.setText("");
        super.mo22387a(textView2);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b */
    public final void mo22389b(@NonNull TextView textView, @NonNull String str) {
        textView.setText(str);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final boolean mo22388a(@NonNull TextView textView, @NonNull String str) {
        return textView.getText().toString().equalsIgnoreCase(str);
    }
}
