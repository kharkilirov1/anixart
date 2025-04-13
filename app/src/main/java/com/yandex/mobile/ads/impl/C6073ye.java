package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.yandex.mobile.ads.impl.ye */
/* loaded from: classes3.dex */
public final class C6073ye {

    /* renamed from: a */
    @NonNull
    private final ExecutorService f56809a = Executors.newSingleThreadExecutor();

    /* renamed from: com.yandex.mobile.ads.impl.ye$a */
    public static final class a implements Runnable {

        /* renamed from: d */
        @NonNull
        private final Bitmap f56812d;

        /* renamed from: e */
        @NonNull
        private final b f56813e;

        /* renamed from: c */
        @NonNull
        private final C5022ef f56811c = new C5022ef();

        /* renamed from: b */
        @NonNull
        private final Handler f56810b = new Handler(Looper.getMainLooper());

        public a(@NonNull Bitmap bitmap, @NonNull b bVar) {
            this.f56812d = bitmap;
            this.f56813e = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5022ef c5022ef = this.f56811c;
            Bitmap bitmap = this.f56812d;
            Objects.requireNonNull(c5022ef);
            this.f56810b.post(new RunnableC6024xe(this, C5022ef.m24135a(bitmap)));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ye$b */
    public interface b {
        /* renamed from: a */
        void mo25989a(@NonNull Bitmap bitmap);
    }

    /* renamed from: a */
    public final void m29919a(@NonNull Bitmap bitmap, @NonNull b bVar) {
        this.f56809a.execute(new a(bitmap, bVar));
    }
}
