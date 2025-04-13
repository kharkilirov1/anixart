package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.impl.C5606pv;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.gv */
/* loaded from: classes3.dex */
public final class C5147gv {

    /* renamed from: a */
    public final int f50741a;

    /* renamed from: b */
    public final int f50742b;

    /* renamed from: c */
    public final int f50743c;

    /* renamed from: d */
    public final int f50744d;

    /* renamed from: e */
    public final int f50745e;

    /* renamed from: f */
    public final int f50746f;

    /* renamed from: g */
    public final int f50747g;

    /* renamed from: h */
    public final int f50748h;

    /* renamed from: i */
    public final int f50749i;

    /* renamed from: j */
    public final long f50750j;

    /* renamed from: k */
    @Nullable
    public final a f50751k;

    /* renamed from: l */
    @Nullable
    private final Metadata f50752l;

    /* renamed from: com.yandex.mobile.ads.impl.gv$a */
    public static class a {

        /* renamed from: a */
        public final long[] f50753a;

        /* renamed from: b */
        public final long[] f50754b;

        public a(long[] jArr, long[] jArr2) {
            this.f50753a = jArr;
            this.f50754b = jArr2;
        }
    }

    public C5147gv(int i2, byte[] bArr) {
        zo0 zo0Var = new zo0(bArr);
        zo0Var.m30255c(i2 * 8);
        this.f50741a = zo0Var.m30252b(16);
        this.f50742b = zo0Var.m30252b(16);
        this.f50743c = zo0Var.m30252b(24);
        this.f50744d = zo0Var.m30252b(24);
        int m30252b = zo0Var.m30252b(20);
        this.f50745e = m30252b;
        this.f50746f = m24980b(m30252b);
        this.f50747g = zo0Var.m30252b(3) + 1;
        int m30252b2 = zo0Var.m30252b(5) + 1;
        this.f50748h = m30252b2;
        this.f50749i = m24979a(m30252b2);
        this.f50750j = zo0Var.m30261g();
        this.f50751k = null;
        this.f50752l = null;
    }

    /* renamed from: a */
    private static int m24979a(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: b */
    private static int m24980b(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public final long m24982a(long j2) {
        long j3 = (j2 * this.f50745e) / 1000000;
        long j4 = this.f50750j - 1;
        int i2 = s91.f54530a;
        return Math.max(0L, Math.min(j3, j4));
    }

    /* renamed from: b */
    public final long m24986b() {
        long j2 = this.f50750j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / this.f50745e;
    }

    /* renamed from: b */
    public final C5147gv m24987b(List<String> list) {
        Metadata m22836a = bi1.m22836a(list);
        Metadata metadata = this.f50752l;
        if (metadata != null) {
            m22836a = metadata.m22235a(m22836a);
        }
        return new C5147gv(this.f50741a, this.f50742b, this.f50743c, this.f50744d, this.f50745e, this.f50747g, this.f50748h, this.f50750j, this.f50751k, m22836a);
    }

    /* renamed from: a */
    public final long m24981a() {
        long j2;
        long j3;
        int i2 = this.f50744d;
        if (i2 > 0) {
            j2 = (i2 + this.f50743c) / 2;
            j3 = 1;
        } else {
            int i3 = this.f50741a;
            j2 = ((((i3 != this.f50742b || i3 <= 0) ? 4096L : i3) * this.f50747g) * this.f50748h) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    /* renamed from: a */
    public final C5606pv m24985a(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.f50744d;
        if (i2 <= 0) {
            i2 = -1;
        }
        Metadata metadata2 = this.f50752l;
        if (metadata2 != null) {
            metadata = metadata2.m22235a(metadata);
        }
        return new C5606pv.a().m27561f("audio/flac").m27564i(i2).m27554c(this.f50747g).m27569n(this.f50745e).m27548a(Collections.singletonList(bArr)).m27545a(metadata).m27550a();
    }

    private C5147gv(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, @Nullable a aVar, @Nullable Metadata metadata) {
        this.f50741a = i2;
        this.f50742b = i3;
        this.f50743c = i4;
        this.f50744d = i5;
        this.f50745e = i6;
        this.f50746f = m24980b(i6);
        this.f50747g = i7;
        this.f50748h = i8;
        this.f50749i = m24979a(i8);
        this.f50750j = j2;
        this.f50751k = aVar;
        this.f50752l = metadata;
    }

    /* renamed from: a */
    public final C5147gv m24983a(@Nullable a aVar) {
        return new C5147gv(this.f50741a, this.f50742b, this.f50743c, this.f50744d, this.f50745e, this.f50747g, this.f50748h, this.f50750j, aVar, this.f50752l);
    }

    /* renamed from: a */
    public final C5147gv m24984a(List<PictureFrame> list) {
        Metadata metadata = new Metadata(list);
        Metadata metadata2 = this.f50752l;
        if (metadata2 != null) {
            metadata = metadata2.m22235a(metadata);
        }
        return new C5147gv(this.f50741a, this.f50742b, this.f50743c, this.f50744d, this.f50745e, this.f50747g, this.f50748h, this.f50750j, this.f50751k, metadata);
    }
}
