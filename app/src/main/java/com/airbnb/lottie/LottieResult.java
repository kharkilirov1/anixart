package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LottieResult<V> {

    /* renamed from: a */
    @Nullable
    public final V f7259a;

    /* renamed from: b */
    @Nullable
    public final Throwable f7260b;

    public LottieResult(V v) {
        this.f7259a = v;
        this.f7260b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        V v = this.f7259a;
        if (v != null && v.equals(lottieResult.f7259a)) {
            return true;
        }
        Throwable th = this.f7260b;
        if (th == null || lottieResult.f7260b == null) {
            return false;
        }
        return th.toString().equals(this.f7260b.toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7259a, this.f7260b});
    }

    public LottieResult(Throwable th) {
        this.f7260b = th;
        this.f7259a = null;
    }
}
