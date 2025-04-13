package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.SizeInfo;

/* renamed from: com.yandex.mobile.ads.impl.wu */
/* loaded from: classes3.dex */
final class C5990wu {

    /* renamed from: a */
    @NonNull
    private final Context f56271a;

    /* renamed from: b */
    @NonNull
    private final SizeInfo f56272b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5896v0 f56273c;

    public C5990wu(@NonNull Context context, @NonNull SizeInfo sizeInfo, @NonNull InterfaceC5896v0 interfaceC5896v0) {
        this.f56271a = context.getApplicationContext();
        this.f56272b = sizeInfo;
        this.f56273c = interfaceC5896v0;
    }

    /* renamed from: a */
    public final void m29566a() {
        int i2 = this.f56271a.getResources().getConfiguration().orientation;
        Context context = this.f56271a;
        SizeInfo sizeInfo = this.f56272b;
        boolean m27007b = C5526o6.m27007b(context, sizeInfo);
        boolean m27005a = C5526o6.m27005a(context, sizeInfo);
        int i3 = m27007b == m27005a ? -1 : (!m27005a ? 1 == i2 : 1 != i2) ? 6 : 7;
        if (-1 != i3) {
            ((C4788a1) this.f56273c).m22359a(i3);
        }
    }
}
