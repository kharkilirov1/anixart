package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class MediaCodecInfo {

    /* renamed from: a */
    public final String f11880a;

    /* renamed from: b */
    public final String f11881b;

    /* renamed from: c */
    public final String f11882c;

    /* renamed from: d */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f11883d;

    /* renamed from: e */
    public final boolean f11884e;

    /* renamed from: f */
    public final boolean f11885f;

    /* renamed from: g */
    public final boolean f11886g;

    @VisibleForTesting
    public MediaCodecInfo(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.f11880a = str;
        this.f11881b = str2;
        this.f11882c = str3;
        this.f11883d = codecCapabilities;
        this.f11884e = z4;
        this.f11885f = z6;
        this.f11886g = MimeTypes.m7607o(str2);
    }

    @RequiresApi
    /* renamed from: a */
    public static Point m6638a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.m7738g(i2, widthAlignment) * widthAlignment, Util.m7738g(i3, heightAlignment) * heightAlignment);
    }

    @RequiresApi
    /* renamed from: b */
    public static boolean m6639b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        Point m6638a = m6638a(videoCapabilities, i2, i3);
        int i4 = m6638a.x;
        int i5 = m6638a.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        if ((com.google.android.exoplayer2.util.Util.f14736a >= 21 && r15.isFeatureSupported("secure-playback")) != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.mediacodec.MediaCodecInfo m6640i(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r11 = new com.google.android.exoplayer2.mediacodec.MediaCodecInfo
            r0 = 1
            r2 = 0
            if (r19 != 0) goto L4a
            if (r4 == 0) goto L4a
            int r3 = com.google.android.exoplayer2.util.Util.f14736a
            r5 = 19
            if (r3 < r5) goto L1a
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 == 0) goto L4a
            r5 = 22
            if (r3 > r5) goto L45
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.f14739d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L33
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L45
        L33:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L43
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L45
        L43:
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            if (r3 != 0) goto L4a
            r8 = 1
            goto L4b
        L4a:
            r8 = 0
        L4b:
            r3 = 21
            if (r4 == 0) goto L62
            int r5 = com.google.android.exoplayer2.util.Util.f14736a
            if (r5 < r3) goto L5d
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            if (r5 == 0) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            if (r20 != 0) goto L7b
            if (r4 == 0) goto L79
            int r5 = com.google.android.exoplayer2.util.Util.f14736a
            if (r5 < r3) goto L75
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L75
            r3 = 1
            goto L76
        L75:
            r3 = 0
        L76:
            if (r3 == 0) goto L79
            goto L7b
        L79:
            r10 = 0
            goto L7c
        L7b:
            r10 = 1
        L7c:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecInfo.m6640i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.exoplayer2.mediacodec.MediaCodecInfo");
    }

    /* renamed from: c */
    public DecoderReuseEvaluation m6641c(Format format, Format format2) {
        boolean z = false;
        int i2 = !Util.m7728a(format.f9659m, format2.f9659m) ? 8 : 0;
        if (this.f11886g) {
            if (format.f9667u != format2.f9667u) {
                i2 |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
            }
            if (!this.f11884e && (format.f9664r != format2.f9664r || format.f9665s != format2.f9665s)) {
                i2 |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
            if (!Util.m7728a(format.f9671y, format2.f9671y)) {
                i2 |= RecyclerView.ViewHolder.FLAG_MOVED;
            }
            String str = this.f11880a;
            if (Util.f14739d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
                z = true;
            }
            if (z && !format.m5831e(format2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.f11880a, format, format2, format.m5831e(format2) ? 3 : 2, 0);
            }
        } else {
            if (format.f9672z != format2.f9672z) {
                i2 |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (format.f9641A != format2.f9641A) {
                i2 |= RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST;
            }
            if (format.f9642B != format2.f9642B) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.f11881b)) {
                Pair<Integer, Integer> m6679c = MediaCodecUtil.m6679c(format);
                Pair<Integer, Integer> m6679c2 = MediaCodecUtil.m6679c(format2);
                if (m6679c != null && m6679c2 != null) {
                    int intValue = ((Integer) m6679c.first).intValue();
                    int intValue2 = ((Integer) m6679c2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f11880a, format, format2, 3, 0);
                    }
                }
            }
            if (!format.m5831e(format2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.f11881b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.f11880a, format, format2, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f11880a, format, format2, 0, i2);
    }

    /* renamed from: d */
    public MediaCodecInfo.CodecProfileLevel[] m6642d() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11883d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6643e(com.google.android.exoplayer2.Format r13) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecInfo.m6643e(com.google.android.exoplayer2.Format):boolean");
    }

    /* renamed from: f */
    public boolean m6644f(Format format) {
        if (this.f11886g) {
            return this.f11884e;
        }
        Pair<Integer, Integer> m6679c = MediaCodecUtil.m6679c(format);
        return m6679c != null && ((Integer) m6679c.first).intValue() == 42;
    }

    @RequiresApi
    /* renamed from: g */
    public boolean m6645g(int i2, int i3, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11883d;
        if (codecCapabilities == null) {
            m6646h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m6646h("sizeAndRate.vCaps");
            return false;
        }
        if (!m6639b(videoCapabilities, i2, i3, d)) {
            if (i2 < i3) {
                if ((("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f11880a) && "mcv5a".equals(Util.f14737b)) ? false : true) && m6639b(videoCapabilities, i3, i2, d)) {
                    StringBuilder m4120s = C0576a.m4120s(69, "sizeAndRate.rotated, ", i2, "x", i3);
                    m4120s.append("x");
                    m4120s.append(d);
                    String sb = m4120s.toString();
                    String str = this.f11880a;
                    String str2 = this.f11881b;
                    String str3 = Util.f14740e;
                    StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str3, C0576a.m4106e(str2, C0576a.m4106e(str, C0576a.m4106e(sb, 25)))), "AssumedSupport [", sb, "] [", str);
                    C0000a.m2C(m4122u, ", ", str2, "] [", str3);
                    m4122u.append("]");
                    Log.d("MediaCodecInfo", m4122u.toString());
                }
            }
            StringBuilder m4120s2 = C0576a.m4120s(69, "sizeAndRate.support, ", i2, "x", i3);
            m4120s2.append("x");
            m4120s2.append(d);
            m6646h(m4120s2.toString());
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void m6646h(String str) {
        String str2 = this.f11880a;
        String str3 = this.f11881b;
        String str4 = Util.f14740e;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str4, C0576a.m4106e(str3, C0576a.m4106e(str2, C0576a.m4106e(str, 20)))), "NoSupport [", str, "] [", str2);
        C0000a.m2C(m4122u, ", ", str3, "] [", str4);
        m4122u.append("]");
        Log.d("MediaCodecInfo", m4122u.toString());
    }

    public String toString() {
        return this.f11880a;
    }
}
