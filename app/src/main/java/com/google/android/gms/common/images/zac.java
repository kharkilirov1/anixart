package com.google.android.gms.common.images;

import com.google.android.gms.common.internal.Asserts;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zac implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ImageManager f15647b;

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.m8087a("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager imageManager = this.f15647b;
        Object obj = ImageManager.f15637a;
        Objects.requireNonNull(imageManager);
        throw null;
    }
}
