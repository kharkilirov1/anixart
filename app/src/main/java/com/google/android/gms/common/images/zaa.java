package com.google.android.gms.common.images;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaa implements Runnable {

    /* renamed from: b */
    public final Uri f15644b;

    /* renamed from: c */
    @Nullable
    public final ParcelFileDescriptor f15645c;

    /* renamed from: d */
    public final /* synthetic */ ImageManager f15646d;

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder(valueOf.length() + 56 + valueOf2.length());
            C0000a.m2C(sb, "checkNotMainThread: current thread ", valueOf, " IS the main thread ", valueOf2);
            sb.append("!");
            Log.e("Asserts", sb.toString());
            throw new IllegalStateException("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        }
        ParcelFileDescriptor parcelFileDescriptor = this.f15645c;
        if (parcelFileDescriptor != null) {
            try {
                BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e2) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f15644b)), e2);
            }
            try {
                this.f15645c.close();
            } catch (IOException e3) {
                Log.e("ImageManager", "closed failed", e3);
            }
        }
        new CountDownLatch(1);
        ImageManager imageManager = this.f15646d;
        Object obj = ImageManager.f15637a;
        Objects.requireNonNull(imageManager);
        throw null;
    }
}
