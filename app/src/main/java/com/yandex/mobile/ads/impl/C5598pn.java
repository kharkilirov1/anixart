package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.pn */
/* loaded from: classes3.dex */
public final class C5598pn implements InterfaceC5458mt {

    /* renamed from: b */
    private final InterfaceC4815am f53588b;

    /* renamed from: c */
    private final long f53589c;

    /* renamed from: d */
    private long f53590d;

    /* renamed from: f */
    private int f53592f;

    /* renamed from: g */
    private int f53593g;

    /* renamed from: e */
    private byte[] f53591e = new byte[TextBuffer.MAX_SEGMENT_LEN];

    /* renamed from: a */
    private final byte[] f53587a = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];

    static {
        C5411ls.m26526a("goog.exo.extractor");
    }

    public C5598pn(InterfaceC4978dm interfaceC4978dm, long j2, long j3) {
        this.f53588b = interfaceC4978dm;
        this.f53590d = j2;
        this.f53589c = j3;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public final void mo26761a(byte[] bArr, int i2, int i3) throws IOException {
        mo26764b(bArr, i2, i3, false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: b */
    public final boolean mo26764b(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        if (!m27349a(z, i3)) {
            return false;
        }
        System.arraycopy(this.f53591e, this.f53592f - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: c */
    public final void mo26765c() {
        this.f53592f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: e */
    public final long mo22718e() {
        return this.f53590d + this.f53592f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    public final long getPosition() {
        return this.f53590d;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt, com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f53593g;
        int i5 = 0;
        if (i4 != 0) {
            int min = Math.min(i4, i3);
            System.arraycopy(this.f53591e, 0, bArr, i2, min);
            int i6 = this.f53593g - min;
            this.f53593g = i6;
            this.f53592f = 0;
            byte[] bArr2 = this.f53591e;
            byte[] bArr3 = i6 < bArr2.length - 524288 ? new byte[TextBuffer.MAX_SEGMENT_LEN + i6] : bArr2;
            System.arraycopy(bArr2, min, bArr3, 0, i6);
            this.f53591e = bArr3;
            i5 = min;
        }
        if (i5 == 0) {
            i5 = m27348a(bArr, i2, i3, 0, true);
        }
        if (i5 != -1) {
            this.f53590d += i5;
        }
        return i5;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    public final void readFully(byte[] bArr, int i2, int i3) throws IOException {
        mo26762a(bArr, i2, i3, false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public final long mo22717a() {
        return this.f53589c;
    }

    /* renamed from: c */
    public final int m27351c(int i2) throws IOException {
        int min = Math.min(this.f53593g, i2);
        int i3 = this.f53593g - min;
        this.f53593g = i3;
        this.f53592f = 0;
        byte[] bArr = this.f53591e;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[TextBuffer.MAX_SEGMENT_LEN + i3] : bArr;
        System.arraycopy(bArr, min, bArr2, 0, i3);
        this.f53591e = bArr2;
        if (min == 0) {
            byte[] bArr3 = this.f53587a;
            min = m27348a(bArr3, 0, Math.min(i2, bArr3.length), 0, true);
        }
        if (min != -1) {
            this.f53590d += min;
        }
        return min;
    }

    /* renamed from: a */
    public final boolean m27349a(boolean z, int i2) throws IOException {
        int i3 = this.f53592f + i2;
        byte[] bArr = this.f53591e;
        if (i3 > bArr.length) {
            int length = bArr.length * 2;
            int i4 = TextBuffer.MAX_SEGMENT_LEN + i3;
            int i5 = s91.f54530a;
            this.f53591e = Arrays.copyOf(this.f53591e, Math.max(i4, Math.min(length, i3 + 524288)));
        }
        int i6 = this.f53593g - this.f53592f;
        while (i6 < i2) {
            i6 = m27348a(this.f53591e, this.f53592f, i2, i6, z);
            if (i6 == -1) {
                return false;
            }
            this.f53593g = this.f53592f + i6;
        }
        this.f53592f += i2;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: b */
    public final void mo26763b(int i2) throws IOException {
        m27349a(false, i2);
    }

    /* renamed from: b */
    public final int m27350b(byte[] bArr, int i2, int i3) throws IOException {
        int min;
        int i4 = this.f53592f + i3;
        byte[] bArr2 = this.f53591e;
        if (i4 > bArr2.length) {
            int length = bArr2.length * 2;
            int i5 = TextBuffer.MAX_SEGMENT_LEN + i4;
            int i6 = s91.f54530a;
            this.f53591e = Arrays.copyOf(this.f53591e, Math.max(i5, Math.min(length, i4 + 524288)));
        }
        int i7 = this.f53593g;
        int i8 = this.f53592f;
        int i9 = i7 - i8;
        if (i9 == 0) {
            min = m27348a(this.f53591e, i8, i3, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f53593g += min;
        } else {
            min = Math.min(i3, i9);
        }
        System.arraycopy(this.f53591e, this.f53592f, bArr, i2, min);
        this.f53592f += min;
        return min;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public final void mo26760a(int i2) throws IOException {
        int min = Math.min(this.f53593g, i2);
        int i3 = this.f53593g - min;
        this.f53593g = i3;
        this.f53592f = 0;
        byte[] bArr = this.f53591e;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[TextBuffer.MAX_SEGMENT_LEN + i3] : bArr;
        System.arraycopy(bArr, min, bArr2, 0, i3);
        this.f53591e = bArr2;
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = m27348a(this.f53587a, -i4, Math.min(i2, this.f53587a.length + i4), i4, false);
        }
        if (i4 != -1) {
            this.f53590d += i4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public final boolean mo26762a(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        int i4;
        int i5 = this.f53593g;
        if (i5 == 0) {
            i4 = 0;
        } else {
            int min = Math.min(i5, i3);
            System.arraycopy(this.f53591e, 0, bArr, i2, min);
            int i6 = this.f53593g - min;
            this.f53593g = i6;
            this.f53592f = 0;
            byte[] bArr2 = this.f53591e;
            byte[] bArr3 = i6 < bArr2.length - 524288 ? new byte[TextBuffer.MAX_SEGMENT_LEN + i6] : bArr2;
            System.arraycopy(bArr2, min, bArr3, 0, i6);
            this.f53591e = bArr3;
            i4 = min;
        }
        while (i4 < i3 && i4 != -1) {
            i4 = m27348a(bArr, i2, i3, i4, z);
        }
        if (i4 != -1) {
            this.f53590d += i4;
        }
        return i4 != -1;
    }

    /* renamed from: a */
    private int m27348a(byte[] bArr, int i2, int i3, int i4, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f53588b.read(bArr, i2 + i4, i3 - i4);
            if (read != -1) {
                return i4 + read;
            }
            if (i4 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
