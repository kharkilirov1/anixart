package com.google.android.exoplayer2.extractor.p008ts;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class AdtsExtractor implements Extractor {

    /* renamed from: a */
    public final int f11424a;

    /* renamed from: b */
    public final AdtsReader f11425b;

    /* renamed from: c */
    public final ParsableByteArray f11426c;

    /* renamed from: d */
    public final ParsableByteArray f11427d;

    /* renamed from: e */
    public final ParsableBitArray f11428e;

    /* renamed from: f */
    public ExtractorOutput f11429f;

    /* renamed from: g */
    public long f11430g;

    /* renamed from: h */
    public long f11431h;

    /* renamed from: i */
    public int f11432i;

    /* renamed from: j */
    public boolean f11433j;

    /* renamed from: k */
    public boolean f11434k;

    /* renamed from: l */
    public boolean f11435l;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        C0954j c0954j = C0954j.f10221n;
    }

    public AdtsExtractor() {
        this(0);
    }

    /* renamed from: a */
    public final int m6553a(ExtractorInput extractorInput) throws IOException {
        int i2 = 0;
        while (true) {
            extractorInput.mo6386n(this.f11427d.f14698a, 0, 10);
            this.f11427d.m7635F(0);
            if (this.f11427d.m7659w() != 4801587) {
                break;
            }
            this.f11427d.m7636G(3);
            int m7656t = this.f11427d.m7656t();
            i2 += m7656t + 10;
            extractorInput.mo6380f(m7656t);
        }
        extractorInput.mo6383j();
        extractorInput.mo6380f(i2);
        if (this.f11431h == -1) {
            this.f11431h = i2;
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11429f = extractorOutput;
        this.f11425b.mo6551e(extractorOutput, new TsPayloadReader.TrackIdGenerator(Integer.MIN_VALUE, 0, 1));
        extractorOutput.mo6394h();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f11434k = false;
        this.f11425b.mo6549c();
        this.f11430g = j3;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        int m6553a = m6553a(extractorInput);
        int i2 = m6553a;
        int i3 = 0;
        int i4 = 0;
        do {
            extractorInput.mo6386n(this.f11427d.f14698a, 0, 2);
            this.f11427d.m7635F(0);
            if (AdtsReader.m6554g(this.f11427d.m7662z())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                extractorInput.mo6386n(this.f11427d.f14698a, 0, 4);
                this.f11428e.m7626k(14);
                int m7622g = this.f11428e.m7622g(13);
                if (m7622g <= 6) {
                    i2++;
                    extractorInput.mo6383j();
                    extractorInput.mo6380f(i2);
                } else {
                    extractorInput.mo6380f(m7622g - 6);
                    i4 += m7622g;
                }
            } else {
                i2++;
                extractorInput.mo6383j();
                extractorInput.mo6380f(i2);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - m6553a < 8192);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        Assertions.m7518f(this.f11429f);
        long length = extractorInput.getLength();
        int i2 = this.f11424a;
        if ((((i2 & 2) == 0 && ((i2 & 1) == 0 || length == -1)) ? false : true) && !this.f11433j) {
            this.f11432i = -1;
            extractorInput.mo6383j();
            if (extractorInput.getPosition() == 0) {
                m6553a(extractorInput);
            }
            long j2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (!extractorInput.mo6378d(this.f11427d.f14698a, 0, 2, true)) {
                        break;
                    }
                    this.f11427d.m7635F(0);
                    if (!AdtsReader.m6554g(this.f11427d.m7662z())) {
                        i3 = 0;
                        break;
                    }
                    if (!extractorInput.mo6378d(this.f11427d.f14698a, 0, 4, true)) {
                        break;
                    }
                    this.f11428e.m7626k(14);
                    int m7622g = this.f11428e.m7622g(13);
                    if (m7622g <= 6) {
                        this.f11433j = true;
                        throw ParserException.m5907a("Malformed ADTS stream", null);
                    }
                    j2 += m7622g;
                    i3++;
                    if (i3 != 1000 && extractorInput.mo6385l(m7622g - 6, true)) {
                    }
                } catch (EOFException unused) {
                }
            }
            extractorInput.mo6383j();
            if (i3 > 0) {
                this.f11432i = (int) (j2 / i3);
            } else {
                this.f11432i = -1;
            }
            this.f11433j = true;
        }
        int read = extractorInput.read(this.f11426c.f14698a, 0, RecyclerView.ViewHolder.FLAG_MOVED);
        boolean z = read == -1;
        if (!this.f11435l) {
            int i4 = this.f11424a;
            boolean z2 = (i4 & 1) != 0 && this.f11432i > 0;
            if (!z2 || this.f11425b.f11453q != -9223372036854775807L || z) {
                if (z2) {
                    long j3 = this.f11425b.f11453q;
                    if (j3 != -9223372036854775807L) {
                        ExtractorOutput extractorOutput = this.f11429f;
                        boolean z3 = (2 & i4) != 0;
                        extractorOutput.mo6393d(new ConstantBitrateSeekMap(length, this.f11431h, (int) (((r9 * 8) * 1000000) / j3), this.f11432i, z3));
                        this.f11435l = true;
                    }
                }
                this.f11429f.mo6393d(new SeekMap.Unseekable(-9223372036854775807L, 0L));
                this.f11435l = true;
            }
        }
        if (z) {
            return -1;
        }
        this.f11426c.m7635F(0);
        this.f11426c.m7634E(read);
        if (!this.f11434k) {
            this.f11425b.mo6552f(this.f11430g, 4);
            this.f11434k = true;
        }
        this.f11425b.mo6548b(this.f11426c);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public AdtsExtractor(int i2) {
        this.f11424a = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f11425b = new AdtsReader(true, null);
        this.f11426c = new ParsableByteArray(RecyclerView.ViewHolder.FLAG_MOVED);
        this.f11432i = -1;
        this.f11431h = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.f11427d = parsableByteArray;
        this.f11428e = new ParsableBitArray(parsableByteArray.f14698a);
    }
}
