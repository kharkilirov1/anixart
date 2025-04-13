package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class o80 {

    /* renamed from: d */
    private static final Object f53202d = new Object();

    /* renamed from: e */
    private static volatile o80 f53203e;

    /* renamed from: a */
    @NonNull
    private final ArrayList f53204a = new ArrayList();

    /* renamed from: b */
    @NonNull
    private final dh0 f53205b = new dh0("YandexMobileAds.BaseController");

    /* renamed from: c */
    private int f53206c = 0;

    private o80() {
    }

    @NonNull
    /* renamed from: a */
    public static o80 m27018a() {
        if (f53203e == null) {
            synchronized (f53202d) {
                if (f53203e == null) {
                    f53203e = new o80();
                }
            }
        }
        return f53203e;
    }

    @NonNull
    /* renamed from: b */
    public final Executor m27019b() {
        Executor executor;
        synchronized (f53202d) {
            if (this.f53204a.size() < 4) {
                executor = Executors.newSingleThreadExecutor(this.f53205b);
                this.f53204a.add(executor);
            } else {
                executor = (Executor) this.f53204a.get(this.f53206c);
                int i2 = this.f53206c + 1;
                this.f53206c = i2;
                if (i2 == 4) {
                    this.f53206c = 0;
                }
            }
        }
        return executor;
    }
}
