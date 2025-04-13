package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@SuppressLint
/* loaded from: classes.dex */
public final class MediaCodecUtil {

    /* renamed from: a */
    public static final Pattern f11962a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    @GuardedBy
    public static final HashMap<CodecKey, List<MediaCodecInfo>> f11963b = new HashMap<>();

    /* renamed from: c */
    public static int f11964c = -1;

    public static final class CodecKey {

        /* renamed from: a */
        public final String f11965a;

        /* renamed from: b */
        public final boolean f11966b;

        /* renamed from: c */
        public final boolean f11967c;

        public CodecKey(String str, boolean z, boolean z2) {
            this.f11965a = str;
            this.f11966b = z;
            this.f11967c = z2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != CodecKey.class) {
                return false;
            }
            CodecKey codecKey = (CodecKey) obj;
            return TextUtils.equals(this.f11965a, codecKey.f11965a) && this.f11966b == codecKey.f11966b && this.f11967c == codecKey.f11967c;
        }

        public int hashCode() {
            return ((C0576a.m4107f(this.f11965a, 31, 31) + (this.f11966b ? 1231 : 1237)) * 31) + (this.f11967c ? 1231 : 1237);
        }
    }

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th, C10301 c10301) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface MediaCodecListCompat {
        /* renamed from: a */
        android.media.MediaCodecInfo mo6687a(int i2);

        /* renamed from: b */
        boolean mo6688b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo6689c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo6690d();

        /* renamed from: e */
        boolean mo6691e();
    }

    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        public MediaCodecListCompatV16() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: a */
        public android.media.MediaCodecInfo mo6687a(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: b */
        public boolean mo6688b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: c */
        public boolean mo6689c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: d */
        public int mo6690d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: e */
        public boolean mo6691e() {
            return false;
        }

        public MediaCodecListCompatV16(C10301 c10301) {
        }
    }

    @RequiresApi
    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {

        /* renamed from: a */
        public final int f11968a;

        /* renamed from: b */
        @Nullable
        public android.media.MediaCodecInfo[] f11969b;

        public MediaCodecListCompatV21(boolean z, boolean z2) {
            this.f11968a = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: a */
        public android.media.MediaCodecInfo mo6687a(int i2) {
            if (this.f11969b == null) {
                this.f11969b = new MediaCodecList(this.f11968a).getCodecInfos();
            }
            return this.f11969b[i2];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: b */
        public boolean mo6688b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: c */
        public boolean mo6689c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: d */
        public int mo6690d() {
            if (this.f11969b == null) {
                this.f11969b = new MediaCodecList(this.f11968a).getCodecInfos();
            }
            return this.f11969b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        /* renamed from: e */
        public boolean mo6691e() {
            return true;
        }
    }

    public interface ScoreProvider<T> {
        /* renamed from: a */
        int mo6692a(T t);
    }

    /* renamed from: a */
    public static void m6677a(String str, List<MediaCodecInfo> list) {
        if ("audio/raw".equals(str)) {
            if (Util.f14736a < 26 && Util.f14737b.equals("R9") && list.size() == 1 && list.get(0).f11880a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.m6640i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m6686j(list, C1036e.f11982b);
        }
        int i2 = Util.f14736a;
        if (i2 < 21 && list.size() > 1) {
            String str2 = list.get(0).f11880a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m6686j(list, C1036e.f11983c);
            }
        }
        if (i2 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f11880a)) {
            return;
        }
        list.add(list.remove(0));
    }

    @Nullable
    /* renamed from: b */
    public static String m6678b(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0158, code lost:
    
        switch(r0) {
            case 1567: goto L142;
            case 1568: goto L138;
            case 1569: goto L134;
            case 1570: goto L130;
            default: goto L146;
        };
     */
    /* JADX WARN: Removed duplicated region for block: B:248:0x042f A[Catch: NumberFormatException -> 0x043f, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x043f, blocks: (B:231:0x03c4, B:233:0x03d8, B:245:0x03f7, B:248:0x042f), top: B:230:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025e  */
    @androidx.annotation.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m6679c(com.google.android.exoplayer2.Format r15) {
        /*
            Method dump skipped, instructions count: 2812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m6679c(com.google.android.exoplayer2.Format):android.util.Pair");
    }

    @Nullable
    /* renamed from: d */
    public static MediaCodecInfo m6680d(String str, boolean z, boolean z2) throws DecoderQueryException {
        List<MediaCodecInfo> m6681e = m6681e(str, z, z2);
        if (m6681e.isEmpty()) {
            return null;
        }
        return m6681e.get(0);
    }

    /* renamed from: e */
    public static synchronized List<MediaCodecInfo> m6681e(String str, boolean z, boolean z2) throws DecoderQueryException {
        synchronized (MediaCodecUtil.class) {
            CodecKey codecKey = new CodecKey(str, z, z2);
            HashMap<CodecKey, List<MediaCodecInfo>> hashMap = f11963b;
            List<MediaCodecInfo> list = hashMap.get(codecKey);
            if (list != null) {
                return list;
            }
            int i2 = Util.f14736a;
            ArrayList<MediaCodecInfo> m6682f = m6682f(codecKey, i2 >= 21 ? new MediaCodecListCompatV21(z, z2) : new MediaCodecListCompatV16(null));
            if (z && m6682f.isEmpty() && 21 <= i2 && i2 <= 23) {
                m6682f = m6682f(codecKey, new MediaCodecListCompatV16(null));
                if (!m6682f.isEmpty()) {
                    String str2 = m6682f.get(0).f11880a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            m6677a(str, m6682f);
            List<MediaCodecInfo> unmodifiableList = Collections.unmodifiableList(m6682f);
            hashMap.put(codecKey, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: f */
    public static ArrayList<MediaCodecInfo> m6682f(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat) throws DecoderQueryException {
        String m6678b;
        String str;
        String str2;
        int i2;
        boolean z;
        int i3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean mo6688b;
        boolean mo6689c;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str3 = codecKey.f11965a;
            int mo6690d = mediaCodecListCompat.mo6690d();
            boolean mo6691e = mediaCodecListCompat.mo6691e();
            int i4 = 0;
            while (i4 < mo6690d) {
                android.media.MediaCodecInfo mo6687a = mediaCodecListCompat.mo6687a(i4);
                int i5 = Util.f14736a;
                if (!(i5 >= 29 && mo6687a.isAlias())) {
                    String name = mo6687a.getName();
                    if (m6683g(mo6687a, name, mo6691e, str3) && (m6678b = m6678b(mo6687a, name, str3)) != null) {
                        try {
                            capabilitiesForType = mo6687a.getCapabilitiesForType(m6678b);
                            mo6688b = mediaCodecListCompat.mo6688b("tunneled-playback", m6678b, capabilitiesForType);
                            mo6689c = mediaCodecListCompat.mo6689c("tunneled-playback", m6678b, capabilitiesForType);
                            z2 = codecKey.f11967c;
                        } catch (Exception e2) {
                            e = e2;
                            str = m6678b;
                            str2 = name;
                            i2 = i4;
                            z = mo6691e;
                            i3 = mo6690d;
                        }
                        if ((z2 || !mo6689c) && (!z2 || mo6688b)) {
                            boolean mo6688b2 = mediaCodecListCompat.mo6688b("secure-playback", m6678b, capabilitiesForType);
                            boolean mo6689c2 = mediaCodecListCompat.mo6689c("secure-playback", m6678b, capabilitiesForType);
                            boolean z6 = codecKey.f11966b;
                            if ((z6 || !mo6689c2) && (!z6 || mo6688b2)) {
                                if (i5 >= 29) {
                                    z4 = mo6687a.isHardwareAccelerated();
                                    z3 = true;
                                } else {
                                    z3 = true;
                                    z4 = !m6684h(mo6687a);
                                }
                                boolean m6684h = m6684h(mo6687a);
                                if (i5 >= 29) {
                                    z5 = mo6687a.isVendor();
                                } else {
                                    String m11123c = Ascii.m11123c(mo6687a.getName());
                                    if (m11123c.startsWith("omx.google.") || m11123c.startsWith("c2.android.") || m11123c.startsWith("c2.google.")) {
                                        z3 = false;
                                    }
                                    z5 = z3;
                                }
                                if (!(mo6691e && codecKey.f11966b == mo6688b2) && (mo6691e || codecKey.f11966b)) {
                                    str = m6678b;
                                    str2 = name;
                                    i2 = i4;
                                    z = mo6691e;
                                    i3 = mo6690d;
                                    if (!z && mo6688b2) {
                                        arrayList.add(MediaCodecInfo.m6640i(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, z4, m6684h, z5, false, true));
                                        return arrayList;
                                    }
                                    i4 = i2 + 1;
                                    mo6690d = i3;
                                    mo6691e = z;
                                } else {
                                    str = m6678b;
                                    str2 = name;
                                    i2 = i4;
                                    z = mo6691e;
                                    i3 = mo6690d;
                                    try {
                                        arrayList.add(MediaCodecInfo.m6640i(name, str3, m6678b, capabilitiesForType, z4, m6684h, z5, false, false));
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (Util.f14736a > 23 || arrayList.isEmpty()) {
                                            String str4 = str2;
                                            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 25 + str.length());
                                            sb.append("Failed to query codec ");
                                            sb.append(str4);
                                            sb.append(" (");
                                            sb.append(str);
                                            sb.append(")");
                                            Log.e("MediaCodecUtil", sb.toString());
                                            throw e;
                                        }
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                        sb2.append("Skipping codec ");
                                        sb2.append(str2);
                                        sb2.append(" (failed to query capabilities)");
                                        Log.e("MediaCodecUtil", sb2.toString());
                                        i4 = i2 + 1;
                                        mo6690d = i3;
                                        mo6691e = z;
                                    }
                                    i4 = i2 + 1;
                                    mo6690d = i3;
                                    mo6691e = z;
                                }
                            }
                        }
                    }
                }
                i2 = i4;
                z = mo6691e;
                i3 = mo6690d;
                i4 = i2 + 1;
                mo6690d = i3;
                mo6691e = z;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new DecoderQueryException(e4, null);
        }
    }

    /* renamed from: g */
    public static boolean m6683g(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = Util.f14736a;
        if (i2 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util.f14737b;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util.f14738c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util.f14737b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util.f14737b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i2 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util.f14738c))) {
            String str6 = Util.f14737b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Util.f14738c)) {
            String str7 = Util.f14737b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i2 <= 19 && Util.f14737b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: h */
    public static boolean m6684h(android.media.MediaCodecInfo mediaCodecInfo) {
        if (Util.f14736a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String m11123c = Ascii.m11123c(mediaCodecInfo.getName());
        if (m11123c.startsWith("arc.")) {
            return false;
        }
        return m11123c.startsWith("omx.google.") || m11123c.startsWith("omx.ffmpeg.") || (m11123c.startsWith("omx.sec.") && m11123c.contains(".sw.")) || m11123c.equals("omx.qcom.video.decoder.hevcswvdec") || m11123c.startsWith("c2.android.") || m11123c.startsWith("c2.google.") || !(m11123c.startsWith("omx.") || m11123c.startsWith("c2."));
    }

    /* renamed from: i */
    public static int m6685i() throws DecoderQueryException {
        int i2;
        if (f11964c == -1) {
            int i3 = 0;
            MediaCodecInfo m6680d = m6680d("video/avc", false, false);
            if (m6680d != null) {
                MediaCodecInfo.CodecProfileLevel[] m6642d = m6680d.m6642d();
                int length = m6642d.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = m6642d[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN /* 512 */:
                                i2 = 921600;
                                break;
                            case RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE /* 1024 */:
                                i2 = 1310720;
                                break;
                            case RecyclerView.ViewHolder.FLAG_MOVED /* 2048 */:
                            case RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                                i2 = 2097152;
                                break;
                            case RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST /* 8192 */:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case TextBuffer.MAX_SEGMENT_LEN /* 65536 */:
                                i2 = 9437184;
                                break;
                            case 131072:
                            case PrimitiveArrayBuilder.MAX_CHUNK_SIZE /* 262144 */:
                            case 524288:
                                i2 = 35651584;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                i3 = Math.max(i4, Util.f14736a >= 21 ? 345600 : 172800);
            }
            f11964c = i3;
        }
        return f11964c;
    }

    /* renamed from: j */
    public static <T> void m6686j(List<T> list, final ScoreProvider<T> scoreProvider) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MediaCodecUtil.ScoreProvider scoreProvider2 = MediaCodecUtil.ScoreProvider.this;
                Pattern pattern = MediaCodecUtil.f11962a;
                return scoreProvider2.mo6692a(obj2) - scoreProvider2.mo6692a(obj);
            }
        });
    }
}
