package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class oe0 {

    /* renamed from: a */
    @NonNull
    private final Context f53262a;

    public oe0(@NonNull Context context) {
        this.f53262a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public final ne0 m27082a(@Nullable SSLSocketFactory sSLSocketFactory) {
        return new ne0(this.f53262a, sSLSocketFactory);
    }
}
