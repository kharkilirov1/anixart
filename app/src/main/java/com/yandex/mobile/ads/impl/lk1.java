package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class lk1 {

    /* renamed from: e */
    private static final Object f52437e = new Object();

    /* renamed from: f */
    private static volatile lk1 f52438f;

    /* renamed from: a */
    @NonNull
    private final ExecutorService f52439a = Executors.newCachedThreadPool();

    /* renamed from: b */
    @NonNull
    private final jk1 f52440b = new jk1();

    /* renamed from: c */
    @NonNull
    private final Handler f52441c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    @NonNull
    private final C5724s3 f52442d = new C5724s3();

    private lk1() {
    }

    @NonNull
    /* renamed from: a */
    public static lk1 m26488a() {
        if (f52438f == null) {
            synchronized (f52437e) {
                if (f52438f == null) {
                    f52438f = new lk1();
                }
            }
        }
        return f52438f;
    }

    /* renamed from: b */
    public final void m26492b(@NonNull Context context, @NonNull BidderTokenLoadListener bidderTokenLoadListener) {
        this.f52439a.execute(new sq1(this, context, bidderTokenLoadListener, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m26489a(Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        new wz0(context, this.f52439a, this.f52442d).m29611a(new kk1(this, context, bidderTokenLoadListener));
    }
}
