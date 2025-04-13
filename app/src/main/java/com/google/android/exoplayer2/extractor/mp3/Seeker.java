package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;

/* loaded from: classes.dex */
interface Seeker extends SeekMap {

    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        public UnseekableSeeker() {
            super(-9223372036854775807L, 0L);
        }

        @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
        /* renamed from: a */
        public long mo6482a(long j2) {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
        /* renamed from: d */
        public long mo6483d() {
            return -1L;
        }
    }

    /* renamed from: a */
    long mo6482a(long j2);

    /* renamed from: d */
    long mo6483d();
}
