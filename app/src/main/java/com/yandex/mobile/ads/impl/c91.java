package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vm0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class c91 implements vm0.InterfaceC5930c {

    /* renamed from: a */
    @NonNull
    private final LruCache<String, Bitmap> f49186a;

    /* renamed from: b */
    @NonNull
    private final p10 f49187b;

    public c91(@NonNull LruCache<String, Bitmap> lruCache, @NonNull p10 p10Var) {
        this.f49186a = lruCache;
        this.f49187b = p10Var;
    }

    @Override // com.yandex.mobile.ads.impl.vm0.InterfaceC5930c
    @Nullable
    /* renamed from: a */
    public final Bitmap mo23080a(@NonNull String str) {
        Objects.requireNonNull(this.f49187b);
        return this.f49186a.get(p10.m27140a(str));
    }

    @Override // com.yandex.mobile.ads.impl.vm0.InterfaceC5930c
    /* renamed from: a */
    public final void mo23081a(@NonNull String str, @NonNull Bitmap bitmap) {
        Objects.requireNonNull(this.f49187b);
        this.f49186a.put(p10.m27140a(str), bitmap);
    }
}
