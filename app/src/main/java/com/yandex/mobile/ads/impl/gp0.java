package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class gp0 {

    /* renamed from: a */
    @NonNull
    private final C5257iz f50691a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5773sz f50692b;

    /* renamed from: f */
    private boolean f50696f;

    /* renamed from: d */
    @NonNull
    private final l11 f50694d = new l11();

    /* renamed from: c */
    @NonNull
    private final Handler f50693c = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    @NonNull
    private final RunnableC5317k4 f50695e = new RunnableC5317k4();

    /* renamed from: com.yandex.mobile.ads.impl.gp0$a */
    public class RunnableC5141a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ long f50697b;

        public RunnableC5141a(long j2) {
            this.f50697b = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n60.m26811d("A page has finished loading. Waiting onHtmlWebViewRender", new Object[0]);
            gp0.this.f50693c.postDelayed(gp0.this.f50695e, this.f50697b);
        }
    }

    public gp0(@NonNull AbstractC5368kz abstractC5368kz, @NonNull C5257iz c5257iz) {
        this.f50692b = abstractC5368kz;
        this.f50691a = c5257iz;
    }

    /* renamed from: a */
    public final void m24954a(int i2, String str) {
        this.f50696f = true;
        this.f50693c.removeCallbacks(this.f50695e);
        this.f50693c.post(new oi1(i2, str, this.f50692b));
    }

    /* renamed from: b */
    public final void m24956b() {
        if (this.f50696f) {
            return;
        }
        this.f50694d.m26317a(new RunnableC5141a(this.f50691a.m25749a()));
    }

    /* renamed from: a */
    public final void m24955a(@Nullable InterfaceC5719rz interfaceC5719rz) {
        this.f50695e.m26023a(interfaceC5719rz);
    }

    /* renamed from: a */
    public final void m24953a() {
        this.f50693c.removeCallbacksAndMessages(null);
        this.f50695e.m26023a(null);
    }
}
