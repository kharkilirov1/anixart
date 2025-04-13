package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class z91 {

    /* renamed from: a */
    @NonNull
    private final Context f57086a;

    /* renamed from: b */
    @NonNull
    private final Handler f57087b = new Handler(Looper.getMainLooper());

    /* renamed from: com.yandex.mobile.ads.impl.z91$a */
    public class RunnableC6113a implements Runnable {
        public RunnableC6113a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(z91.this.f57086a, "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs", 1).show();
        }
    }

    public z91(@NonNull Context context) {
        this.f57086a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m30078a() {
        this.f57087b.post(new RunnableC6113a());
    }
}
