package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.c8 */
/* loaded from: classes3.dex */
final class C4908c8 implements InterfaceC5009e8 {

    /* renamed from: e */
    private static final long f49173e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: f */
    private static final Object f49174f = new Object();

    /* renamed from: g */
    private static volatile C4908c8 f49175g;

    /* renamed from: b */
    @NonNull
    private final C5108g8 f49177b;

    /* renamed from: d */
    private boolean f49179d;

    /* renamed from: a */
    @NonNull
    private final Handler f49176a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    @NonNull
    private final C5062f8 f49178c = new C5062f8();

    private C4908c8(@NonNull Context context) {
        this.f49177b = new C5108g8(context);
    }

    @NonNull
    /* renamed from: a */
    public static C4908c8 m23068a(@NonNull Context context) {
        if (f49175g == null) {
            synchronized (f49174f) {
                if (f49175g == null) {
                    f49175g = new C4908c8(context);
                }
            }
        }
        return f49175g;
    }

    /* renamed from: b */
    public final void m23072b(@NonNull InterfaceC5170h8 interfaceC5170h8) {
        boolean z;
        this.f49178c.m24334a(interfaceC5170h8);
        synchronized (f49174f) {
            z = true;
            if (this.f49179d) {
                z = false;
            } else {
                this.f49179d = true;
            }
        }
        if (z) {
            this.f49176a.postDelayed(new RunnableC4846b8(this), f49173e);
            this.f49177b.m24818a(this);
        }
    }

    /* renamed from: a */
    public final void m23071a(@NonNull InterfaceC5170h8 interfaceC5170h8) {
        this.f49178c.m24335b(interfaceC5170h8);
    }

    /* renamed from: a */
    public final void m23070a(@NonNull C4796a8 c4796a8) {
        synchronized (f49174f) {
            this.f49176a.removeCallbacksAndMessages(null);
            this.f49179d = false;
        }
        this.f49178c.m24333a(c4796a8);
    }

    /* renamed from: a */
    public final void m23069a() {
        synchronized (f49174f) {
            this.f49176a.removeCallbacksAndMessages(null);
            this.f49179d = false;
        }
        this.f49178c.m24332a();
    }
}
