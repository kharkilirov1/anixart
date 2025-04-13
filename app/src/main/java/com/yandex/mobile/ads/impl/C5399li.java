package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.li */
/* loaded from: classes3.dex */
public final class C5399li {
    @NonNull
    /* renamed from: a */
    public static InterfaceC5338ki m26473a(@NonNull FrameLayout frameLayout, @NonNull AdResponse adResponse, @NonNull InterfaceC5449mm interfaceC5449mm, boolean z) {
        Long m21831u = adResponse.m21831u();
        if (z && m21831u == null) {
            return new jf0(frameLayout, new l91());
        }
        return new C5295jn(frameLayout, new ah1(), interfaceC5449mm, m21831u != null ? m21831u.longValue() : 0L);
    }
}
