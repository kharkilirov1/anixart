package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.oi */
/* loaded from: classes3.dex */
public final class C5539oi extends dg1<TextView, C5445mi> {
    public C5539oi(@NonNull TextView textView) {
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
    public final void mo22389b(@NonNull TextView textView, @NonNull C5445mi c5445mi) {
        TextView textView2 = textView;
        C5445mi c5445mi2 = c5445mi;
        if (1 == c5445mi2.m26677b()) {
            textView2.setText(c5445mi2.m26676a());
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo22388a(@NonNull TextView textView, @NonNull C5445mi c5445mi) {
        return a2(textView, c5445mi);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public static boolean a2(@NonNull TextView textView, @NonNull C5445mi c5445mi) {
        if (1 == c5445mi.m26677b()) {
            return textView.getText().toString().equals(c5445mi.m26676a());
        }
        return true;
    }
}
