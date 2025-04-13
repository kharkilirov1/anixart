package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

@RestrictTo
/* loaded from: classes.dex */
public interface KeyPathElement {
    /* renamed from: c */
    void mo4690c(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2);

    /* renamed from: g */
    <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback);
}
