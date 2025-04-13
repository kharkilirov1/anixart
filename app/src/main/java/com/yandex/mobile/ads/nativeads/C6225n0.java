package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.nativeads.InterfaceC6213h0;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.n0 */
/* loaded from: classes3.dex */
public final class C6225n0 extends C6210g {
    public C6225n0(@Nullable List<C5276ja<?>> list, @NonNull cj0 cj0Var) {
        super(list, cj0Var);
    }

    @Override // com.yandex.mobile.ads.nativeads.C6210g
    @SuppressLint
    /* renamed from: a */
    public final boolean mo30551a(@NonNull InterfaceC6213h0.b bVar, @Nullable List<C5276ja<?>> list) {
        Objects.requireNonNull(this.f57700b);
        return list == null || bVar.isValid(list);
    }
}
