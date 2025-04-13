package com.yandex.mobile.ads.impl;

import android.util.LruCache;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ss */
/* loaded from: classes3.dex */
public final class C5759ss extends LruCache<hc1, C5987ws> {
    public C5759ss(int i2) {
        super(i2);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, @Nullable hc1 hc1Var, @Nullable C5987ws c5987ws, @Nullable C5987ws c5987ws2) {
        C5987ws c5987ws3 = c5987ws;
        if (c5987ws3 != null) {
            c5987ws3.m29558l();
        }
    }
}
