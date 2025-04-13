package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

@RestrictTo
/* loaded from: classes.dex */
public class LottieCompositionCache {

    /* renamed from: b */
    public static final LottieCompositionCache f7493b = new LottieCompositionCache();

    /* renamed from: a */
    public final LruCache<String, LottieComposition> f7494a = new LruCache<>(20);

    @VisibleForTesting
    public LottieCompositionCache() {
    }
}
