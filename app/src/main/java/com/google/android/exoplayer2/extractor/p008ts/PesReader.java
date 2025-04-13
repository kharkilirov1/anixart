package com.google.android.exoplayer2.extractor.p008ts;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* loaded from: classes.dex */
public final class PesReader implements TsPayloadReader {

    /* renamed from: a */
    public final ElementaryStreamReader f11648a;

    /* renamed from: b */
    public final ParsableBitArray f11649b = new ParsableBitArray(new byte[10]);

    /* renamed from: c */
    public int f11650c = 0;

    /* renamed from: d */
    public int f11651d;

    /* renamed from: e */
    public TimestampAdjuster f11652e;

    /* renamed from: f */
    public boolean f11653f;

    /* renamed from: g */
    public boolean f11654g;

    /* renamed from: h */
    public boolean f11655h;

    /* renamed from: i */
    public int f11656i;

    /* renamed from: j */
    public int f11657j;

    /* renamed from: k */
    public boolean f11658k;

    /* renamed from: l */
    public long f11659l;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.f11648a = elementaryStreamReader;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader
    /* renamed from: a */
    public void mo6578a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f11652e = timestampAdjuster;
        this.f11648a.mo6551e(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader
    /* renamed from: b */
    public final void mo6579b(ParsableByteArray parsableByteArray, int i2) throws ParserException {
        boolean z;
        Assertions.m7518f(this.f11652e);
        int i3 = -1;
        int i4 = 3;
        if ((i2 & 1) != 0) {
            int i5 = this.f11650c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    int i6 = this.f11657j;
                    if (i6 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i6);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f11648a.mo6550d();
                }
            }
            m6582e(1);
        }
        while (parsableByteArray.m7637a() > 0) {
            int i7 = this.f11650c;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        if (m6581d(parsableByteArray, this.f11649b.f14694a, Math.min(10, this.f11656i)) && m6581d(parsableByteArray, null, this.f11656i)) {
                            this.f11649b.m7626k(0);
                            this.f11659l = -9223372036854775807L;
                            if (this.f11653f) {
                                this.f11649b.m7628m(4);
                                this.f11649b.m7628m(1);
                                this.f11649b.m7628m(1);
                                long m7622g = (this.f11649b.m7622g(i4) << 30) | (this.f11649b.m7622g(15) << 15) | this.f11649b.m7622g(15);
                                this.f11649b.m7628m(1);
                                if (!this.f11655h && this.f11654g) {
                                    this.f11649b.m7628m(4);
                                    this.f11649b.m7628m(1);
                                    this.f11649b.m7628m(1);
                                    this.f11649b.m7628m(1);
                                    this.f11652e.m7692b((this.f11649b.m7622g(i4) << 30) | (this.f11649b.m7622g(15) << 15) | this.f11649b.m7622g(15));
                                    this.f11655h = true;
                                }
                                this.f11659l = this.f11652e.m7692b(m7622g);
                            }
                            i2 |= this.f11658k ? 4 : 0;
                            this.f11648a.mo6552f(this.f11659l, i2);
                            m6582e(3);
                        }
                    } else {
                        if (i7 != i4) {
                            throw new IllegalStateException();
                        }
                        int m7637a = parsableByteArray.m7637a();
                        int i8 = this.f11657j;
                        int i9 = i8 != i3 ? m7637a - i8 : 0;
                        if (i9 > 0) {
                            m7637a -= i9;
                            parsableByteArray.m7634E(parsableByteArray.f14699b + m7637a);
                        }
                        this.f11648a.mo6548b(parsableByteArray);
                        int i10 = this.f11657j;
                        if (i10 != i3) {
                            int i11 = i10 - m7637a;
                            this.f11657j = i11;
                            if (i11 == 0) {
                                this.f11648a.mo6550d();
                                m6582e(1);
                            }
                        }
                    }
                } else if (m6581d(parsableByteArray, this.f11649b.f14694a, 9)) {
                    this.f11649b.m7626k(0);
                    int m7622g2 = this.f11649b.m7622g(24);
                    if (m7622g2 != 1) {
                        C0576a.m4123v(41, "Unexpected start code prefix: ", m7622g2, "PesReader");
                        this.f11657j = -1;
                        z = false;
                    } else {
                        this.f11649b.m7628m(8);
                        int m7622g3 = this.f11649b.m7622g(16);
                        this.f11649b.m7628m(5);
                        this.f11658k = this.f11649b.m7621f();
                        this.f11649b.m7628m(2);
                        this.f11653f = this.f11649b.m7621f();
                        this.f11654g = this.f11649b.m7621f();
                        this.f11649b.m7628m(6);
                        int m7622g4 = this.f11649b.m7622g(8);
                        this.f11656i = m7622g4;
                        if (m7622g3 == 0) {
                            this.f11657j = -1;
                        } else {
                            int i12 = ((m7622g3 + 6) - 9) - m7622g4;
                            this.f11657j = i12;
                            if (i12 < 0) {
                                C0576a.m4123v(47, "Found negative packet payload size: ", i12, "PesReader");
                                this.f11657j = -1;
                            }
                        }
                        z = true;
                    }
                    m6582e(z ? 2 : 0);
                }
            } else {
                parsableByteArray.m7636G(parsableByteArray.m7637a());
            }
            i3 = -1;
            i4 = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader
    /* renamed from: c */
    public final void mo6580c() {
        this.f11650c = 0;
        this.f11651d = 0;
        this.f11655h = false;
        this.f11648a.mo6549c();
    }

    /* renamed from: d */
    public final boolean m6581d(ParsableByteArray parsableByteArray, @Nullable byte[] bArr, int i2) {
        int min = Math.min(parsableByteArray.m7637a(), i2 - this.f11651d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.m7636G(min);
        } else {
            System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, this.f11651d, min);
            parsableByteArray.f14699b += min;
        }
        int i3 = this.f11651d + min;
        this.f11651d = i3;
        return i3 == i2;
    }

    /* renamed from: e */
    public final void m6582e(int i2) {
        this.f11650c = i2;
        this.f11651d = 0;
    }
}
