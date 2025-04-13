package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes.dex */
final class PsBinarySearchSeeker extends BinarySearchSeeker {

    public static final class PsScrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* renamed from: a */
        public final TimestampAdjuster f11660a;

        /* renamed from: b */
        public final ParsableByteArray f11661b = new ParsableByteArray();

        public PsScrSeeker(TimestampAdjuster timestampAdjuster, C10191 c10191) {
            this.f11660a = timestampAdjuster;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        /* renamed from: a */
        public void mo6370a() {
            this.f11661b.m7632C(Util.f14741f);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        /* renamed from: b */
        public BinarySearchSeeker.TimestampSearchResult mo6371b(ExtractorInput extractorInput, long j2) throws IOException {
            int m6583g;
            long position = extractorInput.getPosition();
            int min = (int) Math.min(20000L, extractorInput.getLength() - position);
            this.f11661b.m7631B(min);
            extractorInput.mo6386n(this.f11661b.f14698a, 0, min);
            ParsableByteArray parsableByteArray = this.f11661b;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            int i3 = -1;
            while (parsableByteArray.m7637a() >= 4) {
                if (PsBinarySearchSeeker.m6583g(parsableByteArray.f14698a, parsableByteArray.f14699b) != 442) {
                    parsableByteArray.m7636G(1);
                } else {
                    parsableByteArray.m7636G(4);
                    long m6584c = PsDurationReader.m6584c(parsableByteArray);
                    if (m6584c != -9223372036854775807L) {
                        long m7692b = this.f11660a.m7692b(m6584c);
                        if (m7692b > j2) {
                            return j3 == -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.m6367a(m7692b, position) : BinarySearchSeeker.TimestampSearchResult.m6368b(position + i3);
                        }
                        if (100000 + m7692b > j2) {
                            return BinarySearchSeeker.TimestampSearchResult.m6368b(position + parsableByteArray.f14699b);
                        }
                        i3 = parsableByteArray.f14699b;
                        j3 = m7692b;
                    }
                    int i4 = parsableByteArray.f14700c;
                    if (parsableByteArray.m7637a() >= 10) {
                        parsableByteArray.m7636G(9);
                        int m7657u = parsableByteArray.m7657u() & 7;
                        if (parsableByteArray.m7637a() >= m7657u) {
                            parsableByteArray.m7636G(m7657u);
                            if (parsableByteArray.m7637a() >= 4) {
                                if (PsBinarySearchSeeker.m6583g(parsableByteArray.f14698a, parsableByteArray.f14699b) == 443) {
                                    parsableByteArray.m7636G(4);
                                    int m7662z = parsableByteArray.m7662z();
                                    if (parsableByteArray.m7637a() < m7662z) {
                                        parsableByteArray.m7635F(i4);
                                    } else {
                                        parsableByteArray.m7636G(m7662z);
                                    }
                                }
                                while (true) {
                                    if (parsableByteArray.m7637a() < 4 || (m6583g = PsBinarySearchSeeker.m6583g(parsableByteArray.f14698a, parsableByteArray.f14699b)) == 442 || m6583g == 441 || (m6583g >>> 8) != 1) {
                                        break;
                                    }
                                    parsableByteArray.m7636G(4);
                                    if (parsableByteArray.m7637a() < 2) {
                                        parsableByteArray.m7635F(i4);
                                        break;
                                    }
                                    parsableByteArray.m7635F(Math.min(parsableByteArray.f14700c, parsableByteArray.f14699b + parsableByteArray.m7662z()));
                                }
                            } else {
                                parsableByteArray.m7635F(i4);
                            }
                        } else {
                            parsableByteArray.m7635F(i4);
                        }
                    } else {
                        parsableByteArray.m7635F(i4);
                    }
                    i2 = parsableByteArray.f14699b;
                }
            }
            return j3 != -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.m6369c(j3, position + i2) : BinarySearchSeeker.TimestampSearchResult.f10814d;
        }
    }

    public PsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j2, long j3) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new PsScrSeeker(timestampAdjuster, null), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    /* renamed from: g */
    public static int m6583g(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
