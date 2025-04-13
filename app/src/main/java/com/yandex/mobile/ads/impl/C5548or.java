package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;

/* renamed from: com.yandex.mobile.ads.impl.or */
/* loaded from: classes3.dex */
public final class C5548or {

    /* renamed from: c */
    @Nullable
    private static C5548or f53314c;

    /* renamed from: d */
    @NonNull
    private static final Object f53315d = new Object();

    /* renamed from: a */
    @NonNull
    private final C5507nr f53316a;

    /* renamed from: b */
    @NonNull
    private k10 f53317b;

    public C5548or(@NonNull Context context) {
        Collections.emptyList();
        Collections.emptyMap();
        this.f53316a = new C5507nr();
        this.f53317b = C5732s9.m28080a(context);
    }

    @NonNull
    /* renamed from: a */
    public static C5548or m27100a(@NonNull Context context) {
        synchronized (f53315d) {
            if (f53314c == null) {
                f53314c = new C5548or(context);
            }
        }
        return f53314c;
    }

    @NonNull
    /* renamed from: b */
    public final k10 m27102b() {
        return this.f53317b;
    }

    @NonNull
    /* renamed from: a */
    public final C5507nr m27101a() {
        return this.f53316a;
    }
}
