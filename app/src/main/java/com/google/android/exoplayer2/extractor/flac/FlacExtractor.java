package com.google.android.exoplayer2.extractor.flac;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class FlacExtractor implements Extractor {

    /* renamed from: a */
    public final byte[] f10926a;

    /* renamed from: b */
    public final ParsableByteArray f10927b;

    /* renamed from: c */
    public final boolean f10928c;

    /* renamed from: d */
    public final FlacFrameReader.SampleNumberHolder f10929d;

    /* renamed from: e */
    public ExtractorOutput f10930e;

    /* renamed from: f */
    public TrackOutput f10931f;

    /* renamed from: g */
    public int f10932g;

    /* renamed from: h */
    @Nullable
    public Metadata f10933h;

    /* renamed from: i */
    public FlacStreamMetadata f10934i;

    /* renamed from: j */
    public int f10935j;

    /* renamed from: k */
    public int f10936k;

    /* renamed from: l */
    public FlacBinarySearchSeeker f10937l;

    /* renamed from: m */
    public int f10938m;

    /* renamed from: n */
    public long f10939n;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        C0954j c0954j = C0954j.f10213f;
    }

    public FlacExtractor() {
        this(0);
    }

    /* renamed from: a */
    public final void m6441a() {
        long j2 = this.f10939n * 1000000;
        FlacStreamMetadata flacStreamMetadata = this.f10934i;
        int i2 = Util.f14736a;
        this.f10931f.mo6398d(j2 / flacStreamMetadata.f10852e, 1, this.f10938m, 0, null);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f10930e = extractorOutput;
        this.f10931f = extractorOutput.mo6392b(0, 1);
        extractorOutput.mo6394h();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        if (j2 == 0) {
            this.f10932g = 0;
        } else {
            FlacBinarySearchSeeker flacBinarySearchSeeker = this.f10937l;
            if (flacBinarySearchSeeker != null) {
                flacBinarySearchSeeker.m6361e(j3);
            }
        }
        this.f10939n = j3 != 0 ? -1L : 0L;
        this.f10938m = 0;
        this.f10927b.m7631B(0);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        FlacMetadataReader.m6411a(extractorInput, false);
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        extractorInput.mo6386n(parsableByteArray.f14698a, 0, 4);
        return parsableByteArray.m7658v() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z;
        SeekMap unseekable;
        boolean z2;
        long j2;
        boolean z3;
        int i2 = this.f10932g;
        ?? r4 = 0;
        if (i2 == 0) {
            boolean z4 = !this.f10928c;
            extractorInput.mo6383j();
            long mo6379e = extractorInput.mo6379e();
            Metadata m6411a = FlacMetadataReader.m6411a(extractorInput, z4);
            extractorInput.mo6384k((int) (extractorInput.mo6379e() - mo6379e));
            this.f10933h = m6411a;
            this.f10932g = 1;
            return 0;
        }
        if (i2 == 1) {
            byte[] bArr = this.f10926a;
            extractorInput.mo6386n(bArr, 0, bArr.length);
            extractorInput.mo6383j();
            this.f10932g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i2 == 2) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(4);
            extractorInput.readFully(parsableByteArray.f14698a, 0, 4);
            if (parsableByteArray.m7658v() != 1716281667) {
                throw ParserException.m5907a("Failed to read FLAC stream marker.", null);
            }
            this.f10932g = 3;
            return 0;
        }
        if (i2 == 3) {
            FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder = new FlacMetadataReader.FlacStreamMetadataHolder(this.f10934i);
            boolean z5 = false;
            while (!z5) {
                extractorInput.mo6383j();
                ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[i3]);
                extractorInput.mo6386n(parsableBitArray.f14694a, r4, i3);
                boolean m7621f = parsableBitArray.m7621f();
                int m7622g = parsableBitArray.m7622g(r9);
                int m7622g2 = parsableBitArray.m7622g(24) + i3;
                if (m7622g == 0) {
                    byte[] bArr2 = new byte[38];
                    extractorInput.readFully(bArr2, r4, 38);
                    flacStreamMetadataHolder.f10845a = new FlacStreamMetadata(bArr2, i3);
                } else {
                    FlacStreamMetadata flacStreamMetadata = flacStreamMetadataHolder.f10845a;
                    if (flacStreamMetadata == null) {
                        throw new IllegalArgumentException();
                    }
                    if (m7622g == i4) {
                        ParsableByteArray parsableByteArray2 = new ParsableByteArray(m7622g2);
                        extractorInput.readFully(parsableByteArray2.f14698a, r4, m7622g2);
                        flacStreamMetadataHolder.f10845a = flacStreamMetadata.m6417b(FlacMetadataReader.m6412b(parsableByteArray2));
                    } else {
                        if (m7622g == i3) {
                            ParsableByteArray parsableByteArray3 = new ParsableByteArray(m7622g2);
                            extractorInput.readFully(parsableByteArray3.f14698a, r4, m7622g2);
                            parsableByteArray3.m7636G(i3);
                            z = m7621f;
                            flacStreamMetadataHolder.f10845a = new FlacStreamMetadata(flacStreamMetadata.f10848a, flacStreamMetadata.f10849b, flacStreamMetadata.f10850c, flacStreamMetadata.f10851d, flacStreamMetadata.f10852e, flacStreamMetadata.f10854g, flacStreamMetadata.f10855h, flacStreamMetadata.f10857j, flacStreamMetadata.f10858k, flacStreamMetadata.m6420f(FlacStreamMetadata.m6414a(Arrays.asList(VorbisUtil.m6432b(parsableByteArray3, r4, r4).f10894a), Collections.emptyList())));
                        } else {
                            z = m7621f;
                            if (m7622g == 6) {
                                ParsableByteArray parsableByteArray4 = new ParsableByteArray(m7622g2);
                                extractorInput.readFully(parsableByteArray4.f14698a, 0, m7622g2);
                                parsableByteArray4.m7636G(i3);
                                int m7642f = parsableByteArray4.m7642f();
                                String m7655s = parsableByteArray4.m7655s(parsableByteArray4.m7642f(), Charsets.f20502a);
                                String m7654r = parsableByteArray4.m7654r(parsableByteArray4.m7642f());
                                int m7642f2 = parsableByteArray4.m7642f();
                                int m7642f3 = parsableByteArray4.m7642f();
                                int m7642f4 = parsableByteArray4.m7642f();
                                int m7642f5 = parsableByteArray4.m7642f();
                                int m7642f6 = parsableByteArray4.m7642f();
                                byte[] bArr3 = new byte[m7642f6];
                                System.arraycopy(parsableByteArray4.f14698a, parsableByteArray4.f14699b, bArr3, 0, m7642f6);
                                parsableByteArray4.f14699b += m7642f6;
                                flacStreamMetadataHolder.f10845a = new FlacStreamMetadata(flacStreamMetadata.f10848a, flacStreamMetadata.f10849b, flacStreamMetadata.f10850c, flacStreamMetadata.f10851d, flacStreamMetadata.f10852e, flacStreamMetadata.f10854g, flacStreamMetadata.f10855h, flacStreamMetadata.f10857j, flacStreamMetadata.f10858k, flacStreamMetadata.m6420f(FlacStreamMetadata.m6414a(Collections.emptyList(), Collections.singletonList(new PictureFrame(m7642f, m7655s, m7654r, m7642f2, m7642f3, m7642f4, m7642f5, bArr3)))));
                            } else {
                                extractorInput.mo6384k(m7622g2);
                            }
                        }
                        FlacStreamMetadata flacStreamMetadata2 = flacStreamMetadataHolder.f10845a;
                        int i5 = Util.f14736a;
                        this.f10934i = flacStreamMetadata2;
                        z5 = z;
                        r4 = 0;
                        i3 = 4;
                        i4 = 3;
                        r9 = 7;
                    }
                }
                z = m7621f;
                FlacStreamMetadata flacStreamMetadata22 = flacStreamMetadataHolder.f10845a;
                int i52 = Util.f14736a;
                this.f10934i = flacStreamMetadata22;
                z5 = z;
                r4 = 0;
                i3 = 4;
                i4 = 3;
                r9 = 7;
            }
            Objects.requireNonNull(this.f10934i);
            this.f10935j = Math.max(this.f10934i.f10850c, 6);
            TrackOutput trackOutput = this.f10931f;
            int i6 = Util.f14736a;
            trackOutput.mo6399e(this.f10934i.m6419e(this.f10926a, this.f10933h));
            this.f10932g = 4;
            return 0;
        }
        if (i2 == 4) {
            extractorInput.mo6383j();
            ParsableByteArray parsableByteArray5 = new ParsableByteArray(2);
            extractorInput.mo6386n(parsableByteArray5.f14698a, 0, 2);
            int m7662z = parsableByteArray5.m7662z();
            if ((m7662z >> 2) != 16382) {
                extractorInput.mo6383j();
                throw ParserException.m5907a("First frame does not start with sync code.", null);
            }
            extractorInput.mo6383j();
            this.f10936k = m7662z;
            ExtractorOutput extractorOutput = this.f10930e;
            int i7 = Util.f14736a;
            long position = extractorInput.getPosition();
            long length = extractorInput.getLength();
            Objects.requireNonNull(this.f10934i);
            FlacStreamMetadata flacStreamMetadata3 = this.f10934i;
            if (flacStreamMetadata3.f10858k != null) {
                unseekable = new FlacSeekTableSeekMap(flacStreamMetadata3, position);
            } else if (length == -1 || flacStreamMetadata3.f10857j <= 0) {
                unseekable = new SeekMap.Unseekable(flacStreamMetadata3.m6418d(), 0L);
            } else {
                FlacBinarySearchSeeker flacBinarySearchSeeker = new FlacBinarySearchSeeker(flacStreamMetadata3, this.f10936k, position, length);
                this.f10937l = flacBinarySearchSeeker;
                unseekable = flacBinarySearchSeeker.f10795a;
            }
            extractorOutput.mo6393d(unseekable);
            this.f10932g = 5;
            return 0;
        }
        if (i2 != 5) {
            throw new IllegalStateException();
        }
        Objects.requireNonNull(this.f10931f);
        Objects.requireNonNull(this.f10934i);
        FlacBinarySearchSeeker flacBinarySearchSeeker2 = this.f10937l;
        if (flacBinarySearchSeeker2 != null && flacBinarySearchSeeker2.m6358b()) {
            return this.f10937l.m6357a(extractorInput, positionHolder);
        }
        if (this.f10939n == -1) {
            FlacStreamMetadata flacStreamMetadata4 = this.f10934i;
            extractorInput.mo6383j();
            extractorInput.mo6380f(1);
            byte[] bArr4 = new byte[1];
            extractorInput.mo6386n(bArr4, 0, 1);
            z2 = (bArr4[0] & 1) == 1;
            extractorInput.mo6380f(2);
            r9 = z2 ? 7 : 6;
            ParsableByteArray parsableByteArray6 = new ParsableByteArray(r9);
            parsableByteArray6.m7634E(ExtractorUtil.m6407c(extractorInput, parsableByteArray6.f14698a, 0, r9));
            extractorInput.mo6383j();
            FlacFrameReader.SampleNumberHolder sampleNumberHolder = new FlacFrameReader.SampleNumberHolder();
            if (!FlacFrameReader.m6408a(parsableByteArray6, flacStreamMetadata4, z2, sampleNumberHolder)) {
                throw ParserException.m5907a(null, null);
            }
            this.f10939n = sampleNumberHolder.f10844a;
            return 0;
        }
        ParsableByteArray parsableByteArray7 = this.f10927b;
        int i8 = parsableByteArray7.f14700c;
        if (i8 < 32768) {
            int read = extractorInput.read(parsableByteArray7.f14698a, i8, 32768 - i8);
            z2 = read == -1;
            if (!z2) {
                this.f10927b.m7634E(i8 + read);
            } else if (this.f10927b.m7637a() == 0) {
                m6441a();
                return -1;
            }
        } else {
            z2 = false;
        }
        ParsableByteArray parsableByteArray8 = this.f10927b;
        int i9 = parsableByteArray8.f14699b;
        int i10 = this.f10938m;
        int i11 = this.f10935j;
        if (i10 < i11) {
            parsableByteArray8.m7636G(Math.min(i11 - i10, parsableByteArray8.m7637a()));
        }
        ParsableByteArray parsableByteArray9 = this.f10927b;
        Objects.requireNonNull(this.f10934i);
        int i12 = parsableByteArray9.f14699b;
        while (true) {
            if (i12 <= parsableByteArray9.f14700c - 16) {
                parsableByteArray9.m7635F(i12);
                if (FlacFrameReader.m6409b(parsableByteArray9, this.f10934i, this.f10936k, this.f10929d)) {
                    parsableByteArray9.m7635F(i12);
                    j2 = this.f10929d.f10844a;
                    break;
                }
                i12++;
            } else {
                if (z2) {
                    while (true) {
                        int i13 = parsableByteArray9.f14700c;
                        if (i12 > i13 - this.f10935j) {
                            parsableByteArray9.m7635F(i13);
                            break;
                        }
                        parsableByteArray9.m7635F(i12);
                        try {
                            z3 = FlacFrameReader.m6409b(parsableByteArray9, this.f10934i, this.f10936k, this.f10929d);
                        } catch (IndexOutOfBoundsException unused) {
                            z3 = false;
                        }
                        if (parsableByteArray9.f14699b > parsableByteArray9.f14700c) {
                            z3 = false;
                        }
                        if (z3) {
                            parsableByteArray9.m7635F(i12);
                            j2 = this.f10929d.f10844a;
                            break;
                        }
                        i12++;
                    }
                } else {
                    parsableByteArray9.m7635F(i12);
                }
                j2 = -1;
            }
        }
        ParsableByteArray parsableByteArray10 = this.f10927b;
        int i14 = parsableByteArray10.f14699b - i9;
        parsableByteArray10.m7635F(i9);
        this.f10931f.mo6397c(this.f10927b, i14);
        this.f10938m += i14;
        if (j2 != -1) {
            m6441a();
            this.f10938m = 0;
            this.f10939n = j2;
        }
        if (this.f10927b.m7637a() >= 16) {
            return 0;
        }
        int m7637a = this.f10927b.m7637a();
        ParsableByteArray parsableByteArray11 = this.f10927b;
        byte[] bArr5 = parsableByteArray11.f14698a;
        System.arraycopy(bArr5, parsableByteArray11.f14699b, bArr5, 0, m7637a);
        this.f10927b.m7635F(0);
        this.f10927b.m7634E(m7637a);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public FlacExtractor(int i2) {
        this.f10926a = new byte[42];
        this.f10927b = new ParsableByteArray(new byte[32768], 0);
        this.f10928c = (i2 & 1) != 0;
        this.f10929d = new FlacFrameReader.SampleNumberHolder();
        this.f10932g = 0;
    }
}
