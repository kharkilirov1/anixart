package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    public static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* renamed from: a */
        public final FlacStreamMetadata f10923a;

        /* renamed from: b */
        public final int f10924b;

        /* renamed from: c */
        public final FlacFrameReader.SampleNumberHolder f10925c = new FlacFrameReader.SampleNumberHolder();

        public FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i2, C10091 c10091) {
            this.f10923a = flacStreamMetadata;
            this.f10924b = i2;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        /* renamed from: a */
        public /* synthetic */ void mo6370a() {
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        /* renamed from: b */
        public BinarySearchSeeker.TimestampSearchResult mo6371b(ExtractorInput extractorInput, long j2) throws IOException {
            long position = extractorInput.getPosition();
            long m6440c = m6440c(extractorInput);
            long mo6379e = extractorInput.mo6379e();
            extractorInput.mo6380f(Math.max(6, this.f10923a.f10850c));
            long m6440c2 = m6440c(extractorInput);
            return (m6440c > j2 || m6440c2 <= j2) ? m6440c2 <= j2 ? BinarySearchSeeker.TimestampSearchResult.m6369c(m6440c2, extractorInput.mo6379e()) : BinarySearchSeeker.TimestampSearchResult.m6367a(m6440c, position) : BinarySearchSeeker.TimestampSearchResult.m6368b(mo6379e);
        }

        /* renamed from: c */
        public final long m6440c(ExtractorInput extractorInput) throws IOException {
            while (extractorInput.mo6379e() < extractorInput.getLength() - 6) {
                FlacStreamMetadata flacStreamMetadata = this.f10923a;
                int i2 = this.f10924b;
                FlacFrameReader.SampleNumberHolder sampleNumberHolder = this.f10925c;
                long mo6379e = extractorInput.mo6379e();
                byte[] bArr = new byte[2];
                boolean z = false;
                extractorInput.mo6386n(bArr, 0, 2);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i2) {
                    extractorInput.mo6383j();
                    extractorInput.mo6380f((int) (mo6379e - extractorInput.getPosition()));
                } else {
                    ParsableByteArray parsableByteArray = new ParsableByteArray(16);
                    System.arraycopy(bArr, 0, parsableByteArray.f14698a, 0, 2);
                    parsableByteArray.m7634E(ExtractorUtil.m6407c(extractorInput, parsableByteArray.f14698a, 2, 14));
                    extractorInput.mo6383j();
                    extractorInput.mo6380f((int) (mo6379e - extractorInput.getPosition()));
                    z = FlacFrameReader.m6409b(parsableByteArray, flacStreamMetadata, i2, sampleNumberHolder);
                }
                if (z) {
                    break;
                }
                extractorInput.mo6380f(1);
            }
            if (extractorInput.mo6379e() < extractorInput.getLength() - 6) {
                return this.f10925c.f10844a;
            }
            extractorInput.mo6380f((int) (extractorInput.getLength() - extractorInput.mo6379e()));
            return this.f10923a.f10857j;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FlacBinarySearchSeeker(com.google.android.exoplayer2.extractor.FlacStreamMetadata r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            androidx.core.view.inputmethod.a r1 = new androidx.core.view.inputmethod.a
            r2 = 5
            r1.<init>(r0, r2)
            com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker$FlacTimestampSeeker r2 = new com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker$FlacTimestampSeeker
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4, r3)
            long r3 = r17.m6418d()
            long r7 = r0.f10857j
            int r5 = r0.f10851d
            if (r5 <= 0) goto L28
            long r5 = (long) r5
            int r9 = r0.f10850c
            long r9 = (long) r9
            long r5 = r5 + r9
            r9 = 2
            long r5 = r5 / r9
            r9 = 1
            goto L43
        L28:
            int r5 = r0.f10848a
            int r6 = r0.f10849b
            if (r5 != r6) goto L32
            if (r5 <= 0) goto L32
            long r5 = (long) r5
            goto L34
        L32:
            r5 = 4096(0x1000, double:2.0237E-320)
        L34:
            int r9 = r0.f10854g
            long r9 = (long) r9
            long r5 = r5 * r9
            int r9 = r0.f10855h
            long r9 = (long) r9
            long r5 = r5 * r9
            r9 = 8
            long r5 = r5 / r9
            r9 = 64
        L43:
            long r13 = r5 + r9
            r5 = 6
            int r0 = r0.f10850c
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker.<init>(com.google.android.exoplayer2.extractor.FlacStreamMetadata, int, long, long):void");
    }
}
