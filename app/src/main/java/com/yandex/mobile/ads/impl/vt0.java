package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.Rating;

/* loaded from: classes3.dex */
public final class vt0<V extends View & Rating> extends dg1<V, String> {
    public vt0(@NonNull V v) {
        super(v);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo22388a(@NonNull View view, @NonNull String str) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b */
    public final void mo22389b(@NonNull View view, @NonNull String str) {
        String str2 = str;
        try {
            ((Rating) view).setRating(Math.max(Float.parseFloat(str2), 0.0f));
        } catch (NumberFormatException e2) {
            n60.m26808a(e2, String.format("Could not parse rating value. Rating value is %s", str2), new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22387a(@NonNull V v) {
        v.setRating(0.0f);
        super.mo22387a(v);
    }
}
