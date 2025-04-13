package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.us */
/* loaded from: classes3.dex */
public final class C5881us extends RuntimeException {
    public C5881us(int i2) {
        super(m29097a(i2));
    }

    /* renamed from: a */
    private static String m29097a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
