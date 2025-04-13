package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class o90<T> implements InstreamAdBreakQueue<T> {

    /* renamed from: a */
    @NonNull
    private final Queue<T> f53227a;

    public o90(@NonNull Queue<T> queue) {
        this.f53227a = queue;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final int getCount() {
        return this.f53227a.size();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    @Nullable
    public final T poll() {
        return this.f53227a.poll();
    }
}
