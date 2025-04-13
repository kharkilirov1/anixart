package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
class SampleDataQueue {

    /* renamed from: a */
    public final Allocator f12475a;

    /* renamed from: b */
    public final int f12476b;

    /* renamed from: c */
    public final ParsableByteArray f12477c;

    /* renamed from: d */
    public AllocationNode f12478d;

    /* renamed from: e */
    public AllocationNode f12479e;

    /* renamed from: f */
    public AllocationNode f12480f;

    /* renamed from: g */
    public long f12481g;

    public static final class AllocationNode {

        /* renamed from: a */
        public final long f12482a;

        /* renamed from: b */
        public final long f12483b;

        /* renamed from: c */
        public boolean f12484c;

        /* renamed from: d */
        @Nullable
        public Allocation f12485d;

        /* renamed from: e */
        @Nullable
        public AllocationNode f12486e;

        public AllocationNode(long j2, int i2) {
            this.f12482a = j2;
            this.f12483b = j2 + i2;
        }

        /* renamed from: a */
        public int m6879a(long j2) {
            return ((int) (j2 - this.f12482a)) + this.f12485d.f14325b;
        }
    }

    public SampleDataQueue(Allocator allocator) {
        this.f12475a = allocator;
        int mo7425e = allocator.mo7425e();
        this.f12476b = mo7425e;
        this.f12477c = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, mo7425e);
        this.f12478d = allocationNode;
        this.f12479e = allocationNode;
        this.f12480f = allocationNode;
    }

    /* renamed from: e */
    public static AllocationNode m6872e(AllocationNode allocationNode, long j2, ByteBuffer byteBuffer, int i2) {
        while (j2 >= allocationNode.f12483b) {
            allocationNode = allocationNode.f12486e;
        }
        while (i2 > 0) {
            int min = Math.min(i2, (int) (allocationNode.f12483b - j2));
            byteBuffer.put(allocationNode.f12485d.f14324a, allocationNode.m6879a(j2), min);
            i2 -= min;
            j2 += min;
            if (j2 == allocationNode.f12483b) {
                allocationNode = allocationNode.f12486e;
            }
        }
        return allocationNode;
    }

    /* renamed from: f */
    public static AllocationNode m6873f(AllocationNode allocationNode, long j2, byte[] bArr, int i2) {
        while (j2 >= allocationNode.f12483b) {
            allocationNode = allocationNode.f12486e;
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (allocationNode.f12483b - j2));
            System.arraycopy(allocationNode.f12485d.f14324a, allocationNode.m6879a(j2), bArr, i2 - i3, min);
            i3 -= min;
            j2 += min;
            if (j2 == allocationNode.f12483b) {
                allocationNode = allocationNode.f12486e;
            }
        }
        return allocationNode;
    }

    /* renamed from: g */
    public static AllocationNode m6874g(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        AllocationNode allocationNode2;
        int i2;
        if (decoderInputBuffer.m6252p()) {
            long j2 = sampleExtrasHolder.f12522b;
            parsableByteArray.m7631B(1);
            AllocationNode m6873f = m6873f(allocationNode, j2, parsableByteArray.f14698a, 1);
            long j3 = j2 + 1;
            byte b = parsableByteArray.f14698a[0];
            boolean z = (b & 128) != 0;
            int i3 = b & Byte.MAX_VALUE;
            CryptoInfo cryptoInfo = decoderInputBuffer.f10604c;
            byte[] bArr = cryptoInfo.f10581a;
            if (bArr == null) {
                cryptoInfo.f10581a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            allocationNode2 = m6873f(m6873f, j3, cryptoInfo.f10581a, i3);
            long j4 = j3 + i3;
            if (z) {
                parsableByteArray.m7631B(2);
                allocationNode2 = m6873f(allocationNode2, j4, parsableByteArray.f14698a, 2);
                j4 += 2;
                i2 = parsableByteArray.m7662z();
            } else {
                i2 = 1;
            }
            int[] iArr = cryptoInfo.f10584d;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = cryptoInfo.f10585e;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i2 * 6;
                parsableByteArray.m7631B(i4);
                allocationNode2 = m6873f(allocationNode2, j4, parsableByteArray.f14698a, i4);
                j4 += i4;
                parsableByteArray.m7635F(0);
                for (int i5 = 0; i5 < i2; i5++) {
                    iArr2[i5] = parsableByteArray.m7662z();
                    iArr4[i5] = parsableByteArray.m7660x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = sampleExtrasHolder.f12521a - ((int) (j4 - sampleExtrasHolder.f12522b));
            }
            TrackOutput.CryptoData cryptoData = sampleExtrasHolder.f12523c;
            int i6 = Util.f14736a;
            cryptoInfo.m6244a(i2, iArr2, iArr4, cryptoData.f10880b, cryptoInfo.f10581a, cryptoData.f10879a, cryptoData.f10881c, cryptoData.f10882d);
            long j5 = sampleExtrasHolder.f12522b;
            int i7 = (int) (j4 - j5);
            sampleExtrasHolder.f12522b = j5 + i7;
            sampleExtrasHolder.f12521a -= i7;
        } else {
            allocationNode2 = allocationNode;
        }
        if (!decoderInputBuffer.m6240h()) {
            decoderInputBuffer.m6250n(sampleExtrasHolder.f12521a);
            return m6872e(allocationNode2, sampleExtrasHolder.f12522b, decoderInputBuffer.f10605d, sampleExtrasHolder.f12521a);
        }
        parsableByteArray.m7631B(4);
        AllocationNode m6873f2 = m6873f(allocationNode2, sampleExtrasHolder.f12522b, parsableByteArray.f14698a, 4);
        int m7660x = parsableByteArray.m7660x();
        sampleExtrasHolder.f12522b += 4;
        sampleExtrasHolder.f12521a -= 4;
        decoderInputBuffer.m6250n(m7660x);
        AllocationNode m6872e = m6872e(m6873f2, sampleExtrasHolder.f12522b, decoderInputBuffer.f10605d, m7660x);
        sampleExtrasHolder.f12522b += m7660x;
        int i8 = sampleExtrasHolder.f12521a - m7660x;
        sampleExtrasHolder.f12521a = i8;
        ByteBuffer byteBuffer = decoderInputBuffer.f10608g;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            decoderInputBuffer.f10608g = ByteBuffer.allocate(i8);
        } else {
            decoderInputBuffer.f10608g.clear();
        }
        return m6872e(m6872e, sampleExtrasHolder.f12522b, decoderInputBuffer.f10608g, sampleExtrasHolder.f12521a);
    }

    /* renamed from: a */
    public final void m6875a(AllocationNode allocationNode) {
        if (allocationNode.f12484c) {
            AllocationNode allocationNode2 = this.f12480f;
            int i2 = (((int) (allocationNode2.f12482a - allocationNode.f12482a)) / this.f12476b) + (allocationNode2.f12484c ? 1 : 0);
            Allocation[] allocationArr = new Allocation[i2];
            int i3 = 0;
            while (i3 < i2) {
                allocationArr[i3] = allocationNode.f12485d;
                allocationNode.f12485d = null;
                AllocationNode allocationNode3 = allocationNode.f12486e;
                allocationNode.f12486e = null;
                i3++;
                allocationNode = allocationNode3;
            }
            this.f12475a.mo7424d(allocationArr);
        }
    }

    /* renamed from: b */
    public void m6876b(long j2) {
        AllocationNode allocationNode;
        if (j2 == -1) {
            return;
        }
        while (true) {
            allocationNode = this.f12478d;
            if (j2 < allocationNode.f12483b) {
                break;
            }
            this.f12475a.mo7421a(allocationNode.f12485d);
            AllocationNode allocationNode2 = this.f12478d;
            allocationNode2.f12485d = null;
            AllocationNode allocationNode3 = allocationNode2.f12486e;
            allocationNode2.f12486e = null;
            this.f12478d = allocationNode3;
        }
        if (this.f12479e.f12482a < allocationNode.f12482a) {
            this.f12479e = allocationNode;
        }
    }

    /* renamed from: c */
    public final void m6877c(int i2) {
        long j2 = this.f12481g + i2;
        this.f12481g = j2;
        AllocationNode allocationNode = this.f12480f;
        if (j2 == allocationNode.f12483b) {
            this.f12480f = allocationNode.f12486e;
        }
    }

    /* renamed from: d */
    public final int m6878d(int i2) {
        AllocationNode allocationNode = this.f12480f;
        if (!allocationNode.f12484c) {
            Allocation mo7422b = this.f12475a.mo7422b();
            AllocationNode allocationNode2 = new AllocationNode(this.f12480f.f12483b, this.f12476b);
            allocationNode.f12485d = mo7422b;
            allocationNode.f12486e = allocationNode2;
            allocationNode.f12484c = true;
        }
        return Math.min(i2, (int) (this.f12480f.f12483b - this.f12481g));
    }
}
