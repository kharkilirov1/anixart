package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;

/* loaded from: classes.dex */
public interface SeekMap {

    public static class Unseekable implements SeekMap {

        /* renamed from: a */
        public final long f10874a;

        /* renamed from: b */
        public final SeekPoints f10875b;

        public Unseekable(long j2, long j3) {
            this.f10874a = j2;
            this.f10875b = new SeekPoints(j3 == 0 ? SeekPoint.f10876c : new SeekPoint(0L, j3));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: f */
        public boolean mo6363f() {
            return false;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: h */
        public SeekPoints mo6364h(long j2) {
            return this.f10875b;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: i */
        public long mo6365i() {
            return this.f10874a;
        }
    }

    /* renamed from: f */
    boolean mo6363f();

    /* renamed from: h */
    SeekPoints mo6364h(long j2);

    /* renamed from: i */
    long mo6365i();

    public static final class SeekPoints {

        /* renamed from: a */
        public final SeekPoint f10872a;

        /* renamed from: b */
        public final SeekPoint f10873b;

        public SeekPoints(SeekPoint seekPoint) {
            this.f10872a = seekPoint;
            this.f10873b = seekPoint;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SeekPoints.class != obj.getClass()) {
                return false;
            }
            SeekPoints seekPoints = (SeekPoints) obj;
            return this.f10872a.equals(seekPoints.f10872a) && this.f10873b.equals(seekPoints.f10873b);
        }

        public int hashCode() {
            return this.f10873b.hashCode() + (this.f10872a.hashCode() * 31);
        }

        public String toString() {
            String m4114m;
            String valueOf = String.valueOf(this.f10872a);
            if (this.f10872a.equals(this.f10873b)) {
                m4114m = "";
            } else {
                String valueOf2 = String.valueOf(this.f10873b);
                m4114m = C0576a.m4114m(valueOf2.length() + 2, ", ", valueOf2);
            }
            return C1008a.m6437d(C0576a.m4106e(m4114m, valueOf.length() + 2), "[", valueOf, m4114m, "]");
        }

        public SeekPoints(SeekPoint seekPoint, SeekPoint seekPoint2) {
            this.f10872a = seekPoint;
            this.f10873b = seekPoint2;
        }
    }
}
