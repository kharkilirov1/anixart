package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6206e;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ql0 {

    /* renamed from: a */
    private final C6206e f54074a = new C6206e();

    @NonNull
    /* renamed from: a */
    public final int m27749a(@NonNull MediaView mediaView) {
        Objects.requireNonNull(this.f54074a);
        int m30541b = C6206e.m30541b(mediaView);
        if (m30541b != 0) {
            return m30541b;
        }
        return 2;
    }
}
