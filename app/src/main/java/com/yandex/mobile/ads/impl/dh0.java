package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class dh0 implements ThreadFactory {

    /* renamed from: a */
    private final String f49649a;

    public dh0(String str) {
        this.f49649a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, this.f49649a);
    }
}
