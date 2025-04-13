package com.google.android.exoplayer2.extractor;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class ChunkIndex implements SeekMap {

    /* renamed from: a */
    public final int f10818a;

    /* renamed from: b */
    public final int[] f10819b;

    /* renamed from: c */
    public final long[] f10820c;

    /* renamed from: d */
    public final long[] f10821d;

    /* renamed from: e */
    public final long[] f10822e;

    /* renamed from: f */
    public final long f10823f;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f10819b = iArr;
        this.f10820c = jArr;
        this.f10821d = jArr2;
        this.f10822e = jArr3;
        int length = iArr.length;
        this.f10818a = length;
        if (length > 0) {
            this.f10823f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f10823f = 0L;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        int m7737f = Util.m7737f(this.f10822e, j2, true, true);
        long[] jArr = this.f10822e;
        long j3 = jArr[m7737f];
        long[] jArr2 = this.f10820c;
        SeekPoint seekPoint = new SeekPoint(j3, jArr2[m7737f]);
        if (j3 >= j2 || m7737f == this.f10818a - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i2 = m7737f + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f10823f;
    }

    public String toString() {
        int i2 = this.f10818a;
        String arrays = Arrays.toString(this.f10819b);
        String arrays2 = Arrays.toString(this.f10820c);
        String arrays3 = Arrays.toString(this.f10822e);
        String arrays4 = Arrays.toString(this.f10821d);
        StringBuilder sb = new StringBuilder(C0576a.m4106e(arrays4, C0576a.m4106e(arrays3, C0576a.m4106e(arrays2, C0576a.m4106e(arrays, 71)))));
        sb.append("ChunkIndex(length=");
        sb.append(i2);
        sb.append(", sizes=");
        sb.append(arrays);
        C0000a.m2C(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return C0000a.m21r(sb, ", durationsUs=", arrays4, ")");
    }
}
