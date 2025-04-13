package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.zm */
/* loaded from: classes3.dex */
public final class C6130zm implements m51 {

    /* renamed from: a */
    @NonNull
    private final WeakReference<Context> f57245a;

    /* renamed from: b */
    @NonNull
    private final C5101g2 f57246b;

    /* renamed from: c */
    @NonNull
    private final ResultReceiver f57247c;

    public C6130zm(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull AdResultReceiver adResultReceiver) {
        this.f57245a = new WeakReference<>(context);
        this.f57246b = c5101g2;
        this.f57247c = adResultReceiver;
    }

    @Override // com.yandex.mobile.ads.impl.m51
    /* renamed from: a */
    public final void mo26573a(@NonNull wv0 wv0Var, @NonNull String str) {
        C6049y0.m29838a(this.f57245a.get(), wv0Var, str, this.f57247c, this.f57246b.m24796r());
    }
}
