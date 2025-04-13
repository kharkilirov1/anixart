package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinVersion;
import okhttp3.internal.p038ws.WebSocketProtocol;

/* renamed from: com.yandex.mobile.ads.impl.l */
/* loaded from: classes3.dex */
public final class C5369l {

    /* renamed from: a */
    private static final int[] f52200a = {2002, 2000, 1920, 1601, 1600, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, 1000, 960, 800, 800, 480, 400, 400, RecyclerView.ViewHolder.FLAG_MOVED};

    /* renamed from: com.yandex.mobile.ads.impl.l$a */
    public static final class a {

        /* renamed from: a */
        public final int f52201a;

        /* renamed from: b */
        public final int f52202b;

        /* renamed from: c */
        public final int f52203c;

        public /* synthetic */ a(int i2, int i3, int i4, int i5) {
            this(i3, i4, i5);
        }

        private a(int i2, int i3, int i4) {
            this.f52201a = i2;
            this.f52202b = i3;
            this.f52203c = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        if (r10 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if (r10 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r10 != 8) goto L50;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.C5369l.a m26306a(com.yandex.mobile.ads.impl.zo0 r10) {
        /*
            r0 = 16
            int r1 = r10.m30252b(r0)
            int r0 = r10.m30252b(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.m30252b(r0)
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
            r1 = 2
            int r3 = r10.m30252b(r1)
            r4 = 0
            r5 = 3
            if (r3 != r5) goto L3d
            r6 = 0
        L2b:
            int r7 = r10.m30252b(r1)
            int r7 = r7 + r6
            boolean r6 = r10.m30260f()
            if (r6 != 0) goto L38
            int r3 = r3 + r7
            goto L3d
        L38:
            int r7 = r7 + 1
            int r6 = r7 << 2
            goto L2b
        L3d:
            r6 = 10
            int r6 = r10.m30252b(r6)
            boolean r7 = r10.m30260f()
            if (r7 == 0) goto L52
            int r7 = r10.m30252b(r5)
            if (r7 <= 0) goto L52
            r10.m30257d(r1)
        L52:
            boolean r7 = r10.m30260f()
            r8 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            if (r7 == 0) goto L62
            r7 = 48000(0xbb80, float:6.7262E-41)
            goto L65
        L62:
            r7 = 44100(0xac44, float:6.1797E-41)
        L65:
            int r10 = r10.m30252b(r2)
            if (r7 != r9) goto L74
            r9 = 13
            if (r10 != r9) goto L74
            int[] r1 = com.yandex.mobile.ads.impl.C5369l.f52200a
            r4 = r1[r10]
            goto La0
        L74:
            if (r7 != r8) goto La0
            int[] r8 = com.yandex.mobile.ads.impl.C5369l.f52200a
            r9 = 14
            if (r10 >= r9) goto La0
            r4 = r8[r10]
            int r6 = r6 % 5
            r8 = 8
            r9 = 1
            if (r6 == r9) goto L9a
            r9 = 11
            if (r6 == r1) goto L95
            if (r6 == r5) goto L9a
            if (r6 == r2) goto L8e
            goto La0
        L8e:
            if (r10 == r5) goto L9e
            if (r10 == r8) goto L9e
            if (r10 != r9) goto La0
            goto L9e
        L95:
            if (r10 == r8) goto L9e
            if (r10 != r9) goto La0
            goto L9e
        L9a:
            if (r10 == r5) goto L9e
            if (r10 != r8) goto La0
        L9e:
            int r4 = r4 + 1
        La0:
            com.yandex.mobile.ads.impl.l$a r10 = new com.yandex.mobile.ads.impl.l$a
            r10.<init>(r3, r7, r0, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5369l.m26306a(com.yandex.mobile.ads.impl.zo0):com.yandex.mobile.ads.impl.l$a");
    }

    /* renamed from: a */
    public static void m26307a(int i2, ap0 ap0Var) {
        ap0Var.m22586c(7);
        byte[] m22587c = ap0Var.m22587c();
        m22587c[0] = -84;
        m22587c[1] = 64;
        m22587c[2] = -1;
        m22587c[3] = -1;
        m22587c[4] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        m22587c[5] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        m22587c[6] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
