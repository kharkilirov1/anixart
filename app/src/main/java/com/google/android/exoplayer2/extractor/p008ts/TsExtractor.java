package com.google.android.exoplayer2.extractor.p008ts;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class TsExtractor implements Extractor {

    /* renamed from: a */
    public final int f11709a;

    /* renamed from: b */
    public final int f11710b;

    /* renamed from: c */
    public final List<TimestampAdjuster> f11711c;

    /* renamed from: d */
    public final ParsableByteArray f11712d;

    /* renamed from: e */
    public final SparseIntArray f11713e;

    /* renamed from: f */
    public final TsPayloadReader.Factory f11714f;

    /* renamed from: g */
    public final SparseArray<TsPayloadReader> f11715g;

    /* renamed from: h */
    public final SparseBooleanArray f11716h;

    /* renamed from: i */
    public final SparseBooleanArray f11717i;

    /* renamed from: j */
    public final TsDurationReader f11718j;

    /* renamed from: k */
    public TsBinarySearchSeeker f11719k;

    /* renamed from: l */
    public ExtractorOutput f11720l;

    /* renamed from: m */
    public int f11721m;

    /* renamed from: n */
    public boolean f11722n;

    /* renamed from: o */
    public boolean f11723o;

    /* renamed from: p */
    public boolean f11724p;

    /* renamed from: q */
    @Nullable
    public TsPayloadReader f11725q;

    /* renamed from: r */
    public int f11726r;

    /* renamed from: s */
    public int f11727s;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PatReader implements SectionPayloadReader {

        /* renamed from: a */
        public final ParsableBitArray f11728a = new ParsableBitArray(new byte[4]);

        public PatReader() {
        }

        @Override // com.google.android.exoplayer2.extractor.p008ts.SectionPayloadReader
        /* renamed from: a */
        public void mo6576a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        @Override // com.google.android.exoplayer2.extractor.p008ts.SectionPayloadReader
        /* renamed from: b */
        public void mo6577b(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.m7657u() == 0 && (parsableByteArray.m7657u() & 128) != 0) {
                parsableByteArray.m7636G(6);
                int m7637a = parsableByteArray.m7637a() / 4;
                for (int i2 = 0; i2 < m7637a; i2++) {
                    parsableByteArray.m7640d(this.f11728a, 4);
                    int m7622g = this.f11728a.m7622g(16);
                    this.f11728a.m7628m(3);
                    if (m7622g == 0) {
                        this.f11728a.m7628m(13);
                    } else {
                        int m7622g2 = this.f11728a.m7622g(13);
                        if (TsExtractor.this.f11715g.get(m7622g2) == null) {
                            TsExtractor tsExtractor = TsExtractor.this;
                            tsExtractor.f11715g.put(m7622g2, new SectionReader(tsExtractor.new PmtReader(m7622g2)));
                            TsExtractor.this.f11721m++;
                        }
                    }
                }
                TsExtractor tsExtractor2 = TsExtractor.this;
                if (tsExtractor2.f11709a != 2) {
                    tsExtractor2.f11715g.remove(0);
                }
            }
        }
    }

    public class PmtReader implements SectionPayloadReader {

        /* renamed from: a */
        public final ParsableBitArray f11730a = new ParsableBitArray(new byte[5]);

        /* renamed from: b */
        public final SparseArray<TsPayloadReader> f11731b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f11732c = new SparseIntArray();

        /* renamed from: d */
        public final int f11733d;

        public PmtReader(int i2) {
            this.f11733d = i2;
        }

        @Override // com.google.android.exoplayer2.extractor.p008ts.SectionPayloadReader
        /* renamed from: a */
        public void mo6576a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
        
            if (r24.m7657u() == r13) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0231  */
        @Override // com.google.android.exoplayer2.extractor.p008ts.SectionPayloadReader
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo6577b(com.google.android.exoplayer2.util.ParsableByteArray r24) {
            /*
                Method dump skipped, instructions count: 753
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.TsExtractor.PmtReader.mo6577b(com.google.android.exoplayer2.util.ParsableByteArray):void");
        }
    }

    static {
        C0954j c0954j = C0954j.f10223p;
    }

    public TsExtractor() {
        this(1, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), 112800);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11720l = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        TsBinarySearchSeeker tsBinarySearchSeeker;
        Assertions.m7516d(this.f11709a != 2);
        int size = this.f11711c.size();
        for (int i2 = 0; i2 < size; i2++) {
            TimestampAdjuster timestampAdjuster = this.f11711c.get(i2);
            boolean z = timestampAdjuster.m7694d() == -9223372036854775807L;
            if (!z) {
                long m7693c = timestampAdjuster.m7693c();
                z = (m7693c == -9223372036854775807L || m7693c == 0 || m7693c == j3) ? false : true;
            }
            if (z) {
                timestampAdjuster.m7695e(j3);
            }
        }
        if (j3 != 0 && (tsBinarySearchSeeker = this.f11719k) != null) {
            tsBinarySearchSeeker.m6361e(j3);
        }
        this.f11712d.m7631B(0);
        this.f11713e.clear();
        for (int i3 = 0; i3 < this.f11715g.size(); i3++) {
            this.f11715g.valueAt(i3).mo6580c();
        }
        this.f11726r = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        boolean z;
        byte[] bArr = this.f11712d.f14698a;
        extractorInput.mo6386n(bArr, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                }
                if (bArr[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                extractorInput.mo6384k(i2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ?? r0;
        ?? r1;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        long length = extractorInput.getLength();
        int i3 = 1;
        if (this.f11722n) {
            long j2 = -9223372036854775807L;
            if ((length == -1 || this.f11709a == 2) ? false : true) {
                TsDurationReader tsDurationReader = this.f11718j;
                if (!tsDurationReader.f11703d) {
                    int i4 = this.f11727s;
                    if (i4 <= 0) {
                        tsDurationReader.m6588a(extractorInput);
                        return 0;
                    }
                    if (!tsDurationReader.f11705f) {
                        long length2 = extractorInput.getLength();
                        int min = (int) Math.min(tsDurationReader.f11700a, length2);
                        long j3 = length2 - min;
                        if (extractorInput.getPosition() != j3) {
                            positionHolder.f10871a = j3;
                        } else {
                            tsDurationReader.f11702c.m7631B(min);
                            extractorInput.mo6383j();
                            extractorInput.mo6386n(tsDurationReader.f11702c.f14698a, 0, min);
                            ParsableByteArray parsableByteArray = tsDurationReader.f11702c;
                            int i5 = parsableByteArray.f14699b;
                            int i6 = parsableByteArray.f14700c;
                            int i7 = i6 - 188;
                            while (true) {
                                if (i7 < i5) {
                                    break;
                                }
                                byte[] bArr = parsableByteArray.f14698a;
                                int i8 = -4;
                                int i9 = 0;
                                while (true) {
                                    if (i8 > 4) {
                                        z3 = false;
                                        break;
                                    }
                                    int i10 = (i8 * 188) + i7;
                                    if (i10 < i5 || i10 >= i6 || bArr[i10] != 71) {
                                        i9 = 0;
                                    } else {
                                        i9++;
                                        if (i9 == 5) {
                                            z3 = true;
                                            break;
                                        }
                                    }
                                    i8++;
                                }
                                if (z3) {
                                    long m6592a = TsUtil.m6592a(parsableByteArray, i7, i4);
                                    if (m6592a != -9223372036854775807L) {
                                        j2 = m6592a;
                                        break;
                                    }
                                }
                                i7--;
                            }
                            tsDurationReader.f11707h = j2;
                            tsDurationReader.f11705f = true;
                            i3 = 0;
                        }
                    } else {
                        if (tsDurationReader.f11707h == -9223372036854775807L) {
                            tsDurationReader.m6588a(extractorInput);
                            return 0;
                        }
                        if (tsDurationReader.f11704e) {
                            long j4 = tsDurationReader.f11706g;
                            if (j4 == -9223372036854775807L) {
                                tsDurationReader.m6588a(extractorInput);
                                return 0;
                            }
                            long m7692b = tsDurationReader.f11701b.m7692b(tsDurationReader.f11707h) - tsDurationReader.f11701b.m7692b(j4);
                            tsDurationReader.f11708i = m7692b;
                            if (m7692b < 0) {
                                Log.w("TsDurationReader", C0576a.m4113l(65, "Invalid duration: ", m7692b, ". Using TIME_UNSET instead."));
                                tsDurationReader.f11708i = -9223372036854775807L;
                            }
                            tsDurationReader.m6588a(extractorInput);
                            return 0;
                        }
                        int min2 = (int) Math.min(tsDurationReader.f11700a, extractorInput.getLength());
                        long j5 = 0;
                        if (extractorInput.getPosition() != j5) {
                            positionHolder.f10871a = j5;
                        } else {
                            tsDurationReader.f11702c.m7631B(min2);
                            extractorInput.mo6383j();
                            extractorInput.mo6386n(tsDurationReader.f11702c.f14698a, 0, min2);
                            ParsableByteArray parsableByteArray2 = tsDurationReader.f11702c;
                            int i11 = parsableByteArray2.f14699b;
                            int i12 = parsableByteArray2.f14700c;
                            while (true) {
                                if (i11 >= i12) {
                                    break;
                                }
                                if (parsableByteArray2.f14698a[i11] == 71) {
                                    long m6592a2 = TsUtil.m6592a(parsableByteArray2, i11, i4);
                                    if (m6592a2 != -9223372036854775807L) {
                                        j2 = m6592a2;
                                        break;
                                    }
                                }
                                i11++;
                            }
                            tsDurationReader.f11706g = j2;
                            tsDurationReader.f11704e = true;
                            i3 = 0;
                        }
                    }
                    return i3;
                }
            }
            if (!this.f11723o) {
                this.f11723o = true;
                TsDurationReader tsDurationReader2 = this.f11718j;
                long j6 = tsDurationReader2.f11708i;
                if (j6 != -9223372036854775807L) {
                    TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(tsDurationReader2.f11701b, j6, length, this.f11727s, this.f11710b);
                    this.f11719k = tsBinarySearchSeeker;
                    this.f11720l.mo6393d(tsBinarySearchSeeker.f10795a);
                } else {
                    this.f11720l.mo6393d(new SeekMap.Unseekable(j6, 0L));
                }
            }
            if (this.f11724p) {
                z2 = false;
                this.f11724p = false;
                mo6402c(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.f10871a = 0L;
                    return 1;
                }
            } else {
                z2 = false;
            }
            r1 = 1;
            r1 = 1;
            TsBinarySearchSeeker tsBinarySearchSeeker2 = this.f11719k;
            r0 = z2;
            if (tsBinarySearchSeeker2 != null) {
                r0 = z2;
                if (tsBinarySearchSeeker2.m6358b()) {
                    return this.f11719k.m6357a(extractorInput, positionHolder);
                }
            }
        } else {
            r0 = 0;
            r1 = 1;
        }
        ParsableByteArray parsableByteArray3 = this.f11712d;
        byte[] bArr2 = parsableByteArray3.f14698a;
        if (9400 - parsableByteArray3.f14699b < 188) {
            int m7637a = parsableByteArray3.m7637a();
            if (m7637a > 0) {
                System.arraycopy(bArr2, this.f11712d.f14699b, bArr2, r0, m7637a);
            }
            this.f11712d.m7633D(bArr2, m7637a);
        }
        while (true) {
            if (this.f11712d.m7637a() >= 188) {
                z = true;
                break;
            }
            int i13 = this.f11712d.f14700c;
            int read = extractorInput.read(bArr2, i13, 9400 - i13);
            if (read == -1) {
                z = false;
                break;
            }
            this.f11712d.m7634E(i13 + read);
        }
        if (!z) {
            return -1;
        }
        ParsableByteArray parsableByteArray4 = this.f11712d;
        int i14 = parsableByteArray4.f14699b;
        int i15 = parsableByteArray4.f14700c;
        byte[] bArr3 = parsableByteArray4.f14698a;
        int i16 = i14;
        while (i16 < i15 && bArr3[i16] != 71) {
            i16++;
        }
        this.f11712d.m7635F(i16);
        int i17 = i16 + 188;
        if (i17 > i15) {
            int i18 = (i16 - i14) + this.f11726r;
            this.f11726r = i18;
            i2 = 2;
            if (this.f11709a == 2 && i18 > 376) {
                throw ParserException.m5907a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i2 = 2;
            this.f11726r = r0;
        }
        ParsableByteArray parsableByteArray5 = this.f11712d;
        int i19 = parsableByteArray5.f14700c;
        if (i17 > i19) {
            return r0;
        }
        int m7642f = parsableByteArray5.m7642f();
        if ((8388608 & m7642f) != 0) {
            this.f11712d.m7635F(i17);
            return r0;
        }
        int i20 = ((4194304 & m7642f) != 0 ? 1 : 0) | 0;
        int i21 = (2096896 & m7642f) >> 8;
        boolean z4 = (m7642f & 32) != 0;
        TsPayloadReader tsPayloadReader = (m7642f & 16) != 0 ? this.f11715g.get(i21) : null;
        if (tsPayloadReader == null) {
            this.f11712d.m7635F(i17);
            return r0;
        }
        if (this.f11709a != i2) {
            int i22 = m7642f & 15;
            int i23 = this.f11713e.get(i21, i22 - 1);
            this.f11713e.put(i21, i22);
            if (i23 == i22) {
                this.f11712d.m7635F(i17);
                return r0;
            }
            if (i22 != ((i23 + r1) & 15)) {
                tsPayloadReader.mo6580c();
            }
        }
        if (z4) {
            int m7657u = this.f11712d.m7657u();
            i20 |= (this.f11712d.m7657u() & 64) != 0 ? 2 : 0;
            this.f11712d.m7636G(m7657u - r1);
        }
        boolean z5 = this.f11722n;
        if (this.f11709a == i2 || z5 || !this.f11717i.get(i21, r0)) {
            this.f11712d.m7634E(i17);
            tsPayloadReader.mo6579b(this.f11712d, i20);
            this.f11712d.m7634E(i19);
        }
        if (this.f11709a != i2 && !z5 && this.f11722n && length != -1) {
            this.f11724p = r1;
        }
        this.f11712d.m7635F(i17);
        return r0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public TsExtractor(int i2, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory, int i3) {
        Objects.requireNonNull(factory);
        this.f11714f = factory;
        this.f11710b = i3;
        this.f11709a = i2;
        if (i2 == 1 || i2 == 2) {
            this.f11711c = Collections.singletonList(timestampAdjuster);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f11711c = arrayList;
            arrayList.add(timestampAdjuster);
        }
        this.f11712d = new ParsableByteArray(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f11716h = sparseBooleanArray;
        this.f11717i = new SparseBooleanArray();
        SparseArray<TsPayloadReader> sparseArray = new SparseArray<>();
        this.f11715g = sparseArray;
        this.f11713e = new SparseIntArray();
        this.f11718j = new TsDurationReader(i3);
        this.f11720l = ExtractorOutput.f10843w1;
        this.f11727s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<TsPayloadReader> mo6559b = factory.mo6559b();
        int size = mo6559b.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11715g.put(mo6559b.keyAt(i4), mo6559b.valueAt(i4));
        }
        this.f11715g.put(0, new SectionReader(new PatReader()));
        this.f11725q = null;
    }
}
