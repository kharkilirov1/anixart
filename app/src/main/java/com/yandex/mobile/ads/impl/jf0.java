package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes3.dex */
final class jf0 implements InterfaceC5338ki {

    /* renamed from: a */
    @NonNull
    private final View f51590a;

    /* renamed from: b */
    @NonNull
    private final Handler f51591b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    @NonNull
    private final l91 f51592c;

    /* renamed from: d */
    private boolean f51593d;

    /* renamed from: com.yandex.mobile.ads.impl.jf0$a */
    public static class RunnableC5283a implements Runnable {

        /* renamed from: b */
        @NonNull
        private final WeakReference<View> f51594b;

        public RunnableC5283a(@NonNull View view) {
            this.f51594b = new WeakReference<>(view);
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f51594b.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public jf0(@NonNull FrameLayout frameLayout, @NonNull l91 l91Var) {
        this.f51590a = frameLayout;
        frameLayout.setVisibility(8);
        this.f51592c = l91Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: a */
    public final void mo25880a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: a */
    public final void mo25881a(boolean z) {
        this.f51593d = true;
        this.f51591b.removeCallbacksAndMessages(null);
        l91 l91Var = this.f51592c;
        View view = this.f51590a;
        Objects.requireNonNull(l91Var);
        view.setVisibility(z ? 8 : 0);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: b */
    public final void mo25882b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: c */
    public final void mo25883c() {
        if (this.f51593d) {
            return;
        }
        this.f51591b.postDelayed(new RunnableC5283a(this.f51590a), 200L);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    @NonNull
    /* renamed from: d */
    public final View mo25884d() {
        return this.f51590a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    public final void invalidate() {
    }
}
