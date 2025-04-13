package com.google.android.exoplayer2.audio;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.ParsableByteArray;
import kotlin.KotlinVersion;
import okhttp3.internal.p038ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class Ac4Util {

    /* renamed from: a */
    public static final int[] f10279a = {2002, 2000, 1920, 1601, 1600, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, 1000, 960, 800, 800, 480, 400, 400, RecyclerView.ViewHolder.FLAG_MOVED};

    public static final class SyncFrameInfo {

        /* renamed from: a */
        public final int f10280a;

        /* renamed from: b */
        public final int f10281b;

        /* renamed from: c */
        public final int f10282c;

        /* renamed from: d */
        public final int f10283d;

        public SyncFrameInfo(int i2, int i3, int i4, int i5, int i6, C09671 c09671) {
            this.f10281b = i3;
            this.f10280a = i4;
            this.f10282c = i5;
            this.f10283d = i6;
        }
    }

    /* renamed from: a */
    public static void m6105a(int i2, ParsableByteArray parsableByteArray) {
        parsableByteArray.m7631B(7);
        byte[] bArr = parsableByteArray.f14698a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r10 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (r10 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if (r10 != 8) goto L50;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.audio.Ac4Util.SyncFrameInfo m6106b(com.google.android.exoplayer2.util.ParsableBitArray r10) {
        /*
            r0 = 16
            int r1 = r10.m7622g(r0)
            int r0 = r10.m7622g(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.m7622g(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.m7622g(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L3e
            r5 = 0
        L2c:
            int r6 = r10.m7622g(r0)
            int r6 = r6 + r5
            boolean r5 = r10.m7621f()
            if (r5 != 0) goto L39
            int r1 = r1 + r6
            goto L3e
        L39:
            int r6 = r6 + 1
            int r5 = r6 << 2
            goto L2c
        L3e:
            r5 = 10
            int r5 = r10.m7622g(r5)
            boolean r6 = r10.m7621f()
            if (r6 == 0) goto L53
            int r6 = r10.m7622g(r4)
            if (r6 <= 0) goto L53
            r10.m7628m(r0)
        L53:
            boolean r6 = r10.m7621f()
            r8 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            if (r6 == 0) goto L63
            r6 = 48000(0xbb80, float:6.7262E-41)
            goto L66
        L63:
            r6 = 44100(0xac44, float:6.1797E-41)
        L66:
            int r10 = r10.m7622g(r2)
            if (r6 != r9) goto L76
            r9 = 13
            if (r10 != r9) goto L76
            int[] r0 = com.google.android.exoplayer2.audio.Ac4Util.f10279a
            r10 = r0[r10]
            r8 = r10
            goto La6
        L76:
            if (r6 != r8) goto La5
            int[] r8 = com.google.android.exoplayer2.audio.Ac4Util.f10279a
            int r9 = r8.length
            if (r10 >= r9) goto La5
            r3 = r8[r10]
            int r5 = r5 % 5
            r8 = 8
            r9 = 1
            if (r5 == r9) goto L9b
            r9 = 11
            if (r5 == r0) goto L96
            if (r5 == r4) goto L9b
            if (r5 == r2) goto L8f
            goto La0
        L8f:
            if (r10 == r4) goto La2
            if (r10 == r8) goto La2
            if (r10 != r9) goto La0
            goto La2
        L96:
            if (r10 == r8) goto La2
            if (r10 != r9) goto La0
            goto La2
        L9b:
            if (r10 == r4) goto La2
            if (r10 != r8) goto La0
            goto La2
        La0:
            r8 = r3
            goto La6
        La2:
            int r3 = r3 + 1
            goto La0
        La5:
            r8 = 0
        La6:
            com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo r10 = new com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo
            r5 = 2
            r9 = 0
            r3 = r10
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.Ac4Util.m6106b(com.google.android.exoplayer2.util.ParsableBitArray):com.google.android.exoplayer2.audio.Ac4Util$SyncFrameInfo");
    }
}
