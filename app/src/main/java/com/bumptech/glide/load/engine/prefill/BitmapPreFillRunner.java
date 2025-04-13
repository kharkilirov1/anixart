package com.bumptech.glide.load.engine.prefill;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class BitmapPreFillRunner implements Runnable {

    /* renamed from: b */
    public static final long f8414b = TimeUnit.SECONDS.toMillis(1);

    @VisibleForTesting
    public static class Clock {
    }

    public static final class UniqueKey implements Key {
        @Override // com.bumptech.glide.load.Key
        /* renamed from: a */
        public void mo4956a(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        throw null;
    }
}
