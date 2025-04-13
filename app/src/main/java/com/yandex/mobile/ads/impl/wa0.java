package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class wa0 {

    /* renamed from: i */
    private static final xa0 f56064i = ct0.m23513e();

    /* renamed from: a */
    public final String f56065a;

    /* renamed from: b */
    public final String f56066b;

    /* renamed from: c */
    public final String f56067c;

    /* renamed from: d */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f56068d;

    /* renamed from: e */
    public final boolean f56069e;

    /* renamed from: f */
    public final boolean f56070f;

    /* renamed from: g */
    public final boolean f56071g;

    /* renamed from: h */
    private final boolean f56072h;

    @VisibleForTesting
    public wa0(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.f56065a = (String) C5220ia.m25469a(str);
        this.f56066b = str2;
        this.f56067c = str3;
        this.f56068d = codecCapabilities;
        this.f56071g = z;
        this.f56069e = z2;
        this.f56070f = z3;
        this.f56072h = he0.m25144d(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if ((com.yandex.mobile.ads.impl.s91.f54530a >= 21 && r11.isFeatureSupported("secure-playback")) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.wa0 m29418a(java.lang.String r8, java.lang.String r9, java.lang.String r10, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            com.yandex.mobile.ads.impl.wa0 r13 = new com.yandex.mobile.ads.impl.wa0
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L50
            int r1 = com.yandex.mobile.ads.impl.s91.f54530a
            r2 = 19
            if (r1 < r2) goto L16
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 == 0) goto L50
            r2 = 22
            if (r1 > r2) goto L4b
            com.yandex.mobile.ads.impl.xa0 r1 = com.yandex.mobile.ads.impl.wa0.f56064i
            java.lang.String r2 = r1.m29713d()
            java.lang.String r3 = com.yandex.mobile.ads.impl.s91.f54533d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L35
            java.lang.String r2 = r1.m29712c()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4b
        L35:
            java.lang.String r2 = r1.m29714e()
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L49
            java.lang.String r1 = r1.m29715f()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L4b
        L49:
            r1 = 1
            goto L4c
        L4b:
            r1 = 0
        L4c:
            if (r1 != 0) goto L50
            r6 = 1
            goto L51
        L50:
            r6 = 0
        L51:
            r1 = 21
            if (r11 == 0) goto L5f
            int r2 = com.yandex.mobile.ads.impl.s91.f54530a
            if (r2 < r1) goto L5f
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L5f:
            if (r15 != 0) goto L77
            if (r11 == 0) goto L75
            int r15 = com.yandex.mobile.ads.impl.s91.f54530a
            if (r15 < r1) goto L71
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L71
            r15 = 1
            goto L72
        L71:
            r15 = 0
        L72:
            if (r15 == 0) goto L75
            goto L77
        L75:
            r7 = 0
            goto L78
        L77:
            r7 = 1
        L78:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wa0.m29418a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.yandex.mobile.ads.impl.wa0");
    }

    /* renamed from: b */
    public final boolean m29425b(C5606pv c5606pv) {
        if (this.f56072h) {
            return this.f56069e;
        }
        Pair<Integer, Integer> m22776b = bb0.m22776b(c5606pv);
        return m22776b != null && ((Integer) m22776b.first).intValue() == 42;
    }

    public final String toString() {
        return this.f56065a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d1, code lost:
    
        if (r4 == false) goto L185;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ac A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m29424a(com.yandex.mobile.ads.impl.C5606pv r14) throws com.yandex.mobile.ads.impl.bb0.C4851b {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wa0.m29424a(com.yandex.mobile.ads.impl.pv):boolean");
    }

    /* renamed from: a */
    public final boolean m29422a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (s91.f54530a >= 29 && "video/x-vnd.on2.vp9".equals(this.f56066b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f56068d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C5873um m29421a(C5606pv c5606pv, C5606pv c5606pv2) {
        boolean z = false;
        int i2 = !s91.m28112a(c5606pv.f53820l, c5606pv2.f53820l) ? 8 : 0;
        if (this.f56072h) {
            if (c5606pv.f53828t != c5606pv2.f53828t) {
                i2 |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
            }
            if (!this.f56069e && (c5606pv.f53825q != c5606pv2.f53825q || c5606pv.f53826r != c5606pv2.f53826r)) {
                i2 |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
            if (!s91.m28112a(c5606pv.f53832x, c5606pv2.f53832x)) {
                i2 |= RecyclerView.ViewHolder.FLAG_MOVED;
            }
            String str = this.f56065a;
            String str2 = s91.f54533d;
            xa0 xa0Var = f56064i;
            if (str2.startsWith(xa0Var.m29718i()) && xa0Var.m29716g().equals(str)) {
                z = true;
            }
            if (z && !c5606pv.m27509a(c5606pv2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C5873um(this.f56065a, c5606pv, c5606pv2, c5606pv.m27509a(c5606pv2) ? 3 : 2, 0);
            }
        } else {
            if (c5606pv.f53833y != c5606pv2.f53833y) {
                i2 |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (c5606pv.f53834z != c5606pv2.f53834z) {
                i2 |= RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST;
            }
            if (c5606pv.f53803A != c5606pv2.f53803A) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.f56066b)) {
                Pair<Integer, Integer> m22776b = bb0.m22776b(c5606pv);
                Pair<Integer, Integer> m22776b2 = bb0.m22776b(c5606pv2);
                if (m22776b != null && m22776b2 != null) {
                    int intValue = ((Integer) m22776b.first).intValue();
                    int intValue2 = ((Integer) m22776b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C5873um(this.f56065a, c5606pv, c5606pv2, 3, 0);
                    }
                }
            }
            if (!c5606pv.m27509a(c5606pv2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.f56066b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C5873um(this.f56065a, c5606pv, c5606pv2, 1, 0);
            }
        }
        return new C5873um(this.f56065a, c5606pv, c5606pv2, 0, i2);
    }

    @RequiresApi
    /* renamed from: a */
    public final boolean m29423a(int i2, int i3, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f56068d;
        if (codecCapabilities == null) {
            m29419a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m29419a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(s91.m28087a(i2, widthAlignment) * widthAlignment, s91.m28087a(i3, heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i4, i5);
        }
        if (!isSizeSupported) {
            if (i2 < i3) {
                String str = this.f56065a;
                xa0 xa0Var = f56064i;
                if ((xa0Var.m29717h().equals(str) && xa0Var.m29711b().equals(s91.f54531b)) ? false : true) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point(s91.m28087a(i3, widthAlignment2) * widthAlignment2, s91.m28087a(i2, heightAlignment2) * heightAlignment2);
                    int i6 = point2.x;
                    int i7 = point2.y;
                    if (d != -1.0d && d >= 1.0d) {
                        isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i6, i7, Math.floor(d));
                    } else {
                        isSizeSupported2 = videoCapabilities.isSizeSupported(i6, i7);
                    }
                    if (isSizeSupported2) {
                        StringBuilder m26w = C0000a.m26w("sizeAndRate.rotated, ", i2, "x", i3, "x");
                        m26w.append(d);
                        StringBuilder m28y = C0000a.m28y("AssumedSupport [", m26w.toString(), "] [");
                        m28y.append(this.f56065a);
                        m28y.append(", ");
                        m28y.append(this.f56066b);
                        m28y.append("] [");
                        m28y.append(s91.f54534e);
                        m28y.append("]");
                        d90.m23837a("MediaCodecInfo", m28y.toString());
                    }
                }
            }
            StringBuilder m26w2 = C0000a.m26w("sizeAndRate.support, ", i2, "x", i3, "x");
            m26w2.append(d);
            m29419a(m26w2.toString());
            return false;
        }
        return true;
    }

    @Nullable
    @RequiresApi
    /* renamed from: a */
    public final Point m29420a(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f56068d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(s91.m28087a(i2, widthAlignment) * widthAlignment, s91.m28087a(i3, heightAlignment) * heightAlignment);
    }

    /* renamed from: a */
    private void m29419a(String str) {
        StringBuilder m28y = C0000a.m28y("NoSupport [", str, "] [");
        m28y.append(this.f56065a);
        m28y.append(", ");
        m28y.append(this.f56066b);
        m28y.append("] [");
        m28y.append(s91.f54534e);
        m28y.append("]");
        d90.m23837a("MediaCodecInfo", m28y.toString());
    }
}
