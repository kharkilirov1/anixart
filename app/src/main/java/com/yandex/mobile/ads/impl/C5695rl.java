package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.rl */
/* loaded from: classes3.dex */
public final class C5695rl {

    /* renamed from: a */
    @Nullable
    public byte[] f54342a;

    /* renamed from: b */
    @Nullable
    public byte[] f54343b;

    /* renamed from: c */
    public int f54344c;

    /* renamed from: d */
    @Nullable
    public int[] f54345d;

    /* renamed from: e */
    @Nullable
    public int[] f54346e;

    /* renamed from: f */
    public int f54347f;

    /* renamed from: g */
    public int f54348g;

    /* renamed from: h */
    public int f54349h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f54350i;

    /* renamed from: j */
    @Nullable
    private final a f54351j;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.rl$a */
    public static final class a {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f54352a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f54353b;

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, int i2) {
            this(cryptoInfo);
        }

        /* renamed from: a */
        public static void m27946a(a aVar, int i2, int i3) {
            aVar.f54353b.set(i2, i3);
            aVar.f54352a.setPattern(aVar.f54353b);
        }

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f54352a = cryptoInfo;
            this.f54353b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C5695rl() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f54350i = cryptoInfo;
        this.f54351j = s91.f54530a >= 24 ? new a(cryptoInfo, 0) : null;
    }

    /* renamed from: a */
    public final void m27945a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f54347f = i2;
        this.f54345d = iArr;
        this.f54346e = iArr2;
        this.f54343b = bArr;
        this.f54342a = bArr2;
        this.f54344c = i3;
        this.f54348g = i4;
        this.f54349h = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.f54350i;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (s91.f54530a >= 24) {
            a aVar = this.f54351j;
            Objects.requireNonNull(aVar);
            a.m27946a(aVar, i4, i5);
        }
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo m27943a() {
        return this.f54350i;
    }

    /* renamed from: a */
    public final void m27944a(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f54345d == null) {
            int[] iArr = new int[1];
            this.f54345d = iArr;
            this.f54350i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f54345d;
        iArr2[0] = iArr2[0] + i2;
    }
}
