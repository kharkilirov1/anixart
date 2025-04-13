package com.google.android.exoplayer2.extractor;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class DefaultExtractorInput implements ExtractorInput {

    /* renamed from: b */
    public final DataReader f10832b;

    /* renamed from: c */
    public final long f10833c;

    /* renamed from: d */
    public long f10834d;

    /* renamed from: f */
    public int f10836f;

    /* renamed from: g */
    public int f10837g;

    /* renamed from: e */
    public byte[] f10835e = new byte[TextBuffer.MAX_SEGMENT_LEN];

    /* renamed from: a */
    public final byte[] f10831a = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j2, long j3) {
        this.f10832b = dataReader;
        this.f10834d = j2;
        this.f10833c = j3;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: b */
    public boolean mo6377b(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        int min;
        int i4 = this.f10837g;
        if (i4 == 0) {
            min = 0;
        } else {
            min = Math.min(i4, i3);
            System.arraycopy(this.f10835e, 0, bArr, i2, min);
            m6390r(min);
        }
        int i5 = min;
        while (i5 < i3 && i5 != -1) {
            i5 = m6389q(bArr, i2, i3, i5, z);
        }
        m6387o(i5);
        return i5 != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: d */
    public boolean mo6378d(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        if (!mo6385l(i3, z)) {
            return false;
        }
        System.arraycopy(this.f10835e, this.f10836f - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: e */
    public long mo6379e() {
        return this.f10834d + this.f10836f;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: f */
    public void mo6380f(int i2) throws IOException {
        mo6385l(i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: g */
    public int mo6381g(int i2) throws IOException {
        int min = Math.min(this.f10837g, i2);
        m6390r(min);
        if (min == 0) {
            byte[] bArr = this.f10831a;
            min = m6389q(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        m6387o(min);
        return min;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.f10833c;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.f10834d;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: h */
    public int mo6382h(byte[] bArr, int i2, int i3) throws IOException {
        int min;
        m6388p(i3);
        int i4 = this.f10837g;
        int i5 = this.f10836f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            min = m6389q(this.f10835e, i5, i3, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f10837g += min;
        } else {
            min = Math.min(i3, i6);
        }
        System.arraycopy(this.f10835e, this.f10836f, bArr, i2, min);
        this.f10836f += min;
        return min;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: j */
    public void mo6383j() {
        this.f10836f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: k */
    public void mo6384k(int i2) throws IOException {
        int min = Math.min(this.f10837g, i2);
        m6390r(min);
        int i3 = min;
        while (i3 < i2 && i3 != -1) {
            i3 = m6389q(this.f10831a, -i3, Math.min(i2, this.f10831a.length + i3), i3, false);
        }
        m6387o(i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: l */
    public boolean mo6385l(int i2, boolean z) throws IOException {
        m6388p(i2);
        int i3 = this.f10837g - this.f10836f;
        while (i3 < i2) {
            i3 = m6389q(this.f10835e, this.f10836f, i2, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.f10837g = this.f10836f + i3;
        }
        this.f10836f += i2;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: n */
    public void mo6386n(byte[] bArr, int i2, int i3) throws IOException {
        mo6378d(bArr, i2, i3, false);
    }

    /* renamed from: o */
    public final void m6387o(int i2) {
        if (i2 != -1) {
            this.f10834d += i2;
        }
    }

    /* renamed from: p */
    public final void m6388p(int i2) {
        int i3 = this.f10836f + i2;
        byte[] bArr = this.f10835e;
        if (i3 > bArr.length) {
            this.f10835e = Arrays.copyOf(this.f10835e, Util.m7741j(bArr.length * 2, TextBuffer.MAX_SEGMENT_LEN + i3, i3 + 524288));
        }
    }

    /* renamed from: q */
    public final int m6389q(byte[] bArr, int i2, int i3, int i4, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f10832b.read(bArr, i2 + i4, i3 - i4);
        if (read != -1) {
            return i4 + read;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: r */
    public final void m6390r(int i2) {
        int i3 = this.f10837g - i2;
        this.f10837g = i3;
        this.f10836f = 0;
        byte[] bArr = this.f10835e;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[TextBuffer.MAX_SEGMENT_LEN + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f10835e = bArr2;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f10837g;
        int i5 = 0;
        if (i4 != 0) {
            int min = Math.min(i4, i3);
            System.arraycopy(this.f10835e, 0, bArr, i2, min);
            m6390r(min);
            i5 = min;
        }
        if (i5 == 0) {
            i5 = m6389q(bArr, i2, i3, 0, true);
        }
        m6387o(i5);
        return i5;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        mo6377b(bArr, i2, i3, false);
    }
}
