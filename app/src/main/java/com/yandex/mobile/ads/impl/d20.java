package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d20 {

    /* renamed from: a */
    @NonNull
    private final w10 f49550a;

    /* renamed from: b */
    @NonNull
    private final C4808af f49551b = new C4808af();

    public d20(@NonNull w10 w10Var) {
        this.f49550a = w10Var;
    }

    /* renamed from: a */
    public final boolean m23792a(@Nullable Drawable drawable, @NonNull z10 z10Var) {
        Bitmap mo24878a = this.f49550a.mo24878a(z10Var);
        if (drawable == null || mo24878a == null) {
            return false;
        }
        Objects.requireNonNull(this.f49551b);
        return C4808af.m22476a(drawable).mo22806a(drawable, mo24878a);
    }
}
