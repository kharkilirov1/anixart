package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.C5319k6;
import com.yandex.mobile.ads.impl.InterfaceC5330ka;
import com.yandex.mobile.ads.impl.xl0;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.q0 */
/* loaded from: classes3.dex */
final class C6231q0 implements xl0 {

    /* renamed from: a */
    @Nullable
    private final List<C5276ja<?>> f57786a;

    public C6231q0(@Nullable List<C5276ja<?>> list) {
        this.f57786a = list;
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29765a() {
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29766a(@NonNull C6264w c6264w) {
    }

    @Override // com.yandex.mobile.ads.impl.xl0
    /* renamed from: a */
    public final void mo29767a(@NonNull C6264w c6264w, @NonNull C6200b c6200b) {
        List<C5276ja<?>> list = this.f57786a;
        if (list != null) {
            C5319k6 c5319k6 = new C5319k6(c6264w, c6200b);
            for (C5276ja<?> c5276ja : list) {
                InterfaceC5330ka m30749a = c6264w.m30749a(c5276ja);
                if (m30749a != null) {
                    m30749a.mo23914c(c5276ja.m25826d());
                    m30749a.mo23910a(c5276ja, c5319k6);
                }
            }
        }
    }
}
