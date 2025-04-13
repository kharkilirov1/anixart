package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.util.Util;
import java.util.UUID;

/* loaded from: classes.dex */
public final class FrameworkCryptoConfig implements CryptoConfig {

    /* renamed from: d */
    public static final boolean f10730d;

    /* renamed from: a */
    public final UUID f10731a;

    /* renamed from: b */
    public final byte[] f10732b;

    /* renamed from: c */
    public final boolean f10733c;

    static {
        boolean z;
        if ("Amazon".equals(Util.f14738c)) {
            String str = Util.f14739d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f10730d = z;
            }
        }
        z = false;
        f10730d = z;
    }

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr, boolean z) {
        this.f10731a = uuid;
        this.f10732b = bArr;
        this.f10733c = z;
    }
}
