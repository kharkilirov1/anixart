package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CryptoInfo {

    /* renamed from: a */
    @Nullable
    public byte[] f10581a;

    /* renamed from: b */
    @Nullable
    public byte[] f10582b;

    /* renamed from: c */
    public int f10583c;

    /* renamed from: d */
    @Nullable
    public int[] f10584d;

    /* renamed from: e */
    @Nullable
    public int[] f10585e;

    /* renamed from: f */
    public int f10586f;

    /* renamed from: g */
    public int f10587g;

    /* renamed from: h */
    public int f10588h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f10589i;

    /* renamed from: j */
    @Nullable
    public final PatternHolderV24 f10590j;

    @RequiresApi
    public static final class PatternHolderV24 {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f10591a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f10592b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo, C09871 c09871) {
            this.f10591a = cryptoInfo;
        }
    }

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10589i = cryptoInfo;
        this.f10590j = Util.f14736a >= 24 ? new PatternHolderV24(cryptoInfo, null) : null;
    }

    /* renamed from: a */
    public void m6244a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f10586f = i2;
        this.f10584d = iArr;
        this.f10585e = iArr2;
        this.f10582b = bArr;
        this.f10581a = bArr2;
        this.f10583c = i3;
        this.f10587g = i4;
        this.f10588h = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.f10589i;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (Util.f14736a >= 24) {
            PatternHolderV24 patternHolderV24 = this.f10590j;
            Objects.requireNonNull(patternHolderV24);
            patternHolderV24.f10592b.set(i4, i5);
            patternHolderV24.f10591a.setPattern(patternHolderV24.f10592b);
        }
    }
}
