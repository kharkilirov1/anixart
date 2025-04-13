package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.u10;
import java.util.Objects;

/* loaded from: classes3.dex */
final class s11 extends u10 {

    /* renamed from: g */
    @NonNull
    private final p10 f54480g;

    public s11(@NonNull kw0 kw0Var, @NonNull u10.InterfaceC5834b interfaceC5834b, @NonNull p10 p10Var) {
        super(kw0Var, interfaceC5834b);
        this.f54480g = p10Var;
    }

    @Override // com.yandex.mobile.ads.impl.u10
    /* renamed from: a */
    public final String mo28039a(@NonNull String str, @NonNull ImageView.ScaleType scaleType) {
        Objects.requireNonNull(this.f54480g);
        return p10.m27141a(str, scaleType);
    }
}
