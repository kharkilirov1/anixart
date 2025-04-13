package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.Rating;

/* loaded from: classes3.dex */
public final class ii0 {

    /* renamed from: c */
    private static final Object f51303c = new Object();

    /* renamed from: d */
    private static volatile ii0 f51304d;

    /* renamed from: a */
    @NonNull
    private final Handler f51305a = new Handler();

    /* renamed from: b */
    private boolean f51306b;

    private ii0() {
    }

    /* renamed from: a */
    public static ii0 m25538a() {
        if (f51304d == null) {
            synchronized (f51303c) {
                if (f51304d == null) {
                    f51304d = new ii0();
                }
            }
        }
        return f51304d;
    }

    /* renamed from: b */
    public final void m25542b(@NonNull View view, @NonNull MotionEvent motionEvent) {
        if ((view instanceof TextView) || (view instanceof Rating)) {
            m25540a(view, motionEvent);
        }
    }

    /* renamed from: a */
    private void m25540a(@NonNull View view, @NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f51306b) {
                view.setAlpha(view.getAlpha() / 2.0f);
                this.f51306b = true;
            }
            this.f51305a.postDelayed(new hn1(this, view, 19), 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m25539a(View view) {
        if (this.f51306b) {
            view.setAlpha(view.getAlpha() * 2.0f);
            this.f51306b = false;
        }
    }
}
