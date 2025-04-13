package com.yandex.mobile.ads.banner;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.InterfaceC5674r6;
import com.yandex.mobile.ads.impl.tg1;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.banner.b */
/* loaded from: classes2.dex */
public final class C4634b implements InterfaceC5674r6 {

    /* renamed from: a */
    @NonNull
    private final WeakReference<AbstractC4639g> f47625a;

    public C4634b(@NonNull AbstractC4639g abstractC4639g) {
        this.f47625a = new WeakReference<>(abstractC4639g);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5674r6
    /* renamed from: a */
    public final boolean mo21749a() {
        AbstractC4639g abstractC4639g = this.f47625a.get();
        return abstractC4639g != null && tg1.m28657b(abstractC4639g) >= 1;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5674r6
    /* renamed from: b */
    public final boolean mo21750b() {
        AbstractC4639g abstractC4639g = this.f47625a.get();
        return (abstractC4639g == null || tg1.m28660d(abstractC4639g)) ? false : true;
    }
}
