package com.yandex.mobile.ads.impl;

import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.vv */
/* loaded from: classes3.dex */
public final class C5942vv implements InterfaceC5646ql {

    /* renamed from: d */
    public static final boolean f55891d;

    /* renamed from: a */
    public final UUID f55892a;

    /* renamed from: b */
    public final byte[] f55893b;

    /* renamed from: c */
    public final boolean f55894c;

    static {
        boolean z;
        if ("Amazon".equals(s91.f54532c)) {
            String str = s91.f54533d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f55891d = z;
            }
        }
        z = false;
        f55891d = z;
    }

    public C5942vv(UUID uuid, byte[] bArr, boolean z) {
        this.f55892a = uuid;
        this.f55893b = bArr;
        this.f55894c = z;
    }
}
