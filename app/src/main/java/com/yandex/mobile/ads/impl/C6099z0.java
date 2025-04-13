package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.z0 */
/* loaded from: classes3.dex */
public final class C6099z0 implements m51 {

    /* renamed from: a */
    @NonNull
    private final WeakReference<Context> f56992a;

    /* renamed from: b */
    @NonNull
    private final ResultReceiver f56993b;

    /* renamed from: c */
    private final boolean f56994c;

    public C6099z0(@Nullable Context context, boolean z, @NonNull ResultReceiver resultReceiver) {
        this.f56992a = new WeakReference<>(context);
        this.f56994c = z;
        this.f56993b = resultReceiver;
    }

    @Override // com.yandex.mobile.ads.impl.m51
    /* renamed from: a */
    public final void mo26573a(@NonNull wv0 wv0Var, @NonNull String str) {
        C6049y0.m29838a(this.f56992a.get(), wv0Var, str, this.f56993b, this.f56994c);
    }
}
