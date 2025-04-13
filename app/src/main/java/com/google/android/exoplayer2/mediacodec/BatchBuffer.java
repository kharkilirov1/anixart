package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* loaded from: classes.dex */
final class BatchBuffer extends DecoderInputBuffer {

    /* renamed from: j */
    public long f11862j;

    /* renamed from: k */
    public int f11863k;

    /* renamed from: l */
    public int f11864l;

    public BatchBuffer() {
        super(2);
        this.f11864l = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    /* renamed from: l */
    public void mo6248l() {
        super.mo6248l();
        this.f11863k = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6632q(com.google.android.exoplayer2.decoder.DecoderInputBuffer r5) {
        /*
            r4 = this;
            boolean r0 = r5.m6252p()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.m7513a(r0)
            boolean r0 = r5.m6240h()
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.m7513a(r0)
            boolean r0 = r5.m6242j()
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.m7513a(r0)
            boolean r0 = r4.m6633r()
            r2 = 0
            if (r0 != 0) goto L22
        L20:
            r0 = 1
            goto L4c
        L22:
            int r0 = r4.f11863k
            int r3 = r4.f11864l
            if (r0 < r3) goto L2a
        L28:
            r0 = 0
            goto L4c
        L2a:
            boolean r0 = r5.m6241i()
            boolean r3 = r4.m6241i()
            if (r0 == r3) goto L35
            goto L28
        L35:
            java.nio.ByteBuffer r0 = r5.f10605d
            if (r0 == 0) goto L20
            java.nio.ByteBuffer r3 = r4.f10605d
            if (r3 == 0) goto L20
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L20
            goto L28
        L4c:
            if (r0 != 0) goto L4f
            return r2
        L4f:
            int r0 = r4.f11863k
            int r2 = r0 + 1
            r4.f11863k = r2
            if (r0 != 0) goto L63
            long r2 = r5.f10607f
            r4.f10607f = r2
            boolean r0 = r5.m6243k()
            if (r0 == 0) goto L63
            r4.f10580b = r1
        L63:
            boolean r0 = r5.m6241i()
            if (r0 == 0) goto L6d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f10580b = r0
        L6d:
            java.nio.ByteBuffer r0 = r5.f10605d
            if (r0 == 0) goto L7d
            int r2 = r0.remaining()
            r4.m6250n(r2)
            java.nio.ByteBuffer r2 = r4.f10605d
            r2.put(r0)
        L7d:
            long r2 = r5.f10607f
            r4.f11862j = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.BatchBuffer.m6632q(com.google.android.exoplayer2.decoder.DecoderInputBuffer):boolean");
    }

    /* renamed from: r */
    public boolean m6633r() {
        return this.f11863k > 0;
    }
}
