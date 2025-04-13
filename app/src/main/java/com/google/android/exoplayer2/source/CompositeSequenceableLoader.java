package com.google.android.exoplayer2.source;

/* loaded from: classes.dex */
public class CompositeSequenceableLoader implements SequenceableLoader {

    /* renamed from: b */
    public final SequenceableLoader[] f12273b;

    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this.f12273b = sequenceableLoaderArr;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (SequenceableLoader sequenceableLoader : this.f12273b) {
                long nextLoadPositionUs2 = sequenceableLoader.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j2;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= sequenceableLoader.continueLoading(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long j2 = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.f12273b) {
            long bufferedPositionUs = sequenceableLoader.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j2 = Math.min(j2, bufferedPositionUs);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long j2 = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.f12273b) {
            long nextLoadPositionUs = sequenceableLoader.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j2 = Math.min(j2, nextLoadPositionUs);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        for (SequenceableLoader sequenceableLoader : this.f12273b) {
            if (sequenceableLoader.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j2) {
        for (SequenceableLoader sequenceableLoader : this.f12273b) {
            sequenceableLoader.reevaluateBuffer(j2);
        }
    }
}
