package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.y61;

/* loaded from: classes3.dex */
public final class u61 {

    /* renamed from: a */
    public final boolean f55411a;

    /* renamed from: b */
    @Nullable
    public final String f55412b;

    /* renamed from: c */
    public final y61.C6060a f55413c;

    /* renamed from: d */
    public final int f55414d;

    /* renamed from: e */
    @Nullable
    public final byte[] f55415e;

    public u61(boolean z, @Nullable String str, int i2, byte[] bArr, int i3, int i4, @Nullable byte[] bArr2) {
        C5220ia.m25473a((bArr2 == null) ^ (i2 == 0));
        this.f55411a = z;
        this.f55412b = str;
        this.f55414d = i2;
        this.f55415e = bArr2;
        this.f55413c = new y61.C6060a(m28906a(str), i3, i4, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    private static int m28906a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 2;
            default:
                d90.m23842d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
