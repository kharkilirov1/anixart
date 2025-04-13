package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class j80 {

    /* renamed from: a */
    private static final AtomicLong f51532a = new AtomicLong();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j80(long j2, C5192hm c5192hm, long j3) {
        this();
        Uri uri = c5192hm.f50967a;
        Collections.emptyMap();
    }

    /* renamed from: a */
    public static long m25816a() {
        return f51532a.getAndIncrement();
    }

    public j80() {
    }
}
