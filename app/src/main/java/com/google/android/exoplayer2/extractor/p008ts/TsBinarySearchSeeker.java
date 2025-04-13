package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes.dex */
final class TsBinarySearchSeeker extends BinarySearchSeeker {

    public static final class TsPcrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* renamed from: a */
        public final TimestampAdjuster f11696a;

        /* renamed from: b */
        public final ParsableByteArray f11697b = new ParsableByteArray();

        /* renamed from: c */
        public final int f11698c;

        /* renamed from: d */
        public final int f11699d;

        public TsPcrSeeker(int i2, TimestampAdjuster timestampAdjuster, int i3) {
            this.f11698c = i2;
            this.f11696a = timestampAdjuster;
            this.f11699d = i3;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        /* renamed from: a */
        public void mo6370a() {
            this.f11697b.m7632C(Util.f14741f);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        /* renamed from: b */
        public BinarySearchSeeker.TimestampSearchResult mo6371b(ExtractorInput extractorInput, long j2) throws IOException {
            long position = extractorInput.getPosition();
            int min = (int) Math.min(this.f11699d, extractorInput.getLength() - position);
            this.f11697b.m7631B(min);
            extractorInput.mo6386n(this.f11697b.f14698a, 0, min);
            ParsableByteArray parsableByteArray = this.f11697b;
            int i2 = parsableByteArray.f14700c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (parsableByteArray.m7637a() >= 188) {
                byte[] bArr = parsableByteArray.f14698a;
                int i3 = parsableByteArray.f14699b;
                while (i3 < i2 && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i2) {
                    break;
                }
                long m6592a = TsUtil.m6592a(parsableByteArray, i3, this.f11698c);
                if (m6592a != -9223372036854775807L) {
                    long m7692b = this.f11696a.m7692b(m6592a);
                    if (m7692b > j2) {
                        return j5 == -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.m6367a(m7692b, position) : BinarySearchSeeker.TimestampSearchResult.m6368b(position + j4);
                    }
                    if (100000 + m7692b > j2) {
                        return BinarySearchSeeker.TimestampSearchResult.m6368b(position + i3);
                    }
                    j5 = m7692b;
                    j4 = i3;
                }
                parsableByteArray.m7635F(i4);
                j3 = i4;
            }
            return j5 != -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.m6369c(j5, position + j3) : BinarySearchSeeker.TimestampSearchResult.f10814d;
        }
    }

    public TsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j2, long j3, int i2, int i3) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new TsPcrSeeker(i2, timestampAdjuster, i3), j2, 0L, j2 + 1, 0L, j3, 188L, 940);
    }
}
