package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.vg1;
import com.yandex.mobile.ads.impl.vg1.InterfaceC5918a;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.et */
/* loaded from: classes3.dex */
public final class C5044et<T extends View & vg1.InterfaceC5918a> {

    /* renamed from: a */
    @NonNull
    private final T f50048a;

    /* renamed from: b */
    @NonNull
    private final Handler f50049b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    @NonNull
    private final C4938ct f50050c;

    /* renamed from: d */
    @NonNull
    private final lo0 f50051d;

    /* renamed from: e */
    @Nullable
    private Runnable f50052e;

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.et$a */
    public static class a<T extends View & vg1.InterfaceC5918a> implements Runnable {

        /* renamed from: b */
        @NonNull
        private final WeakReference<lo0> f50053b;

        /* renamed from: c */
        @NonNull
        private final WeakReference<T> f50054c;

        /* renamed from: d */
        @NonNull
        private final Handler f50055d;

        /* renamed from: e */
        @NonNull
        private final C4938ct f50056e;

        public a(@NonNull T t, @NonNull lo0 lo0Var, @NonNull Handler handler, @NonNull C4938ct c4938ct) {
            this.f50054c = new WeakReference<>(t);
            this.f50053b = new WeakReference<>(lo0Var);
            this.f50055d = handler;
            this.f50056e = c4938ct;
        }

        @Override // java.lang.Runnable
        public final void run() {
            T t = this.f50054c.get();
            lo0 lo0Var = this.f50053b.get();
            if (t == null || lo0Var == null) {
                return;
            }
            lo0Var.mo26507a(this.f50056e.m23508a(t));
            this.f50055d.postDelayed(this, 200L);
        }
    }

    public C5044et(@NonNull T t, @NonNull C4938ct c4938ct, @NonNull lo0 lo0Var) {
        this.f50048a = t;
        this.f50050c = c4938ct;
        this.f50051d = lo0Var;
    }

    /* renamed from: a */
    public final void m24251a() {
        if (this.f50052e == null) {
            a aVar = new a(this.f50048a, this.f50051d, this.f50049b, this.f50050c);
            this.f50052e = aVar;
            this.f50049b.post(aVar);
        }
    }

    /* renamed from: b */
    public final void m24252b() {
        this.f50049b.removeCallbacksAndMessages(null);
        this.f50052e = null;
    }
}
