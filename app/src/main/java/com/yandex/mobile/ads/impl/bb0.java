package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.bb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@SuppressLint
/* loaded from: classes3.dex */
public final class bb0 {

    /* renamed from: a */
    private static final cb0 f48815a;

    /* renamed from: b */
    private static final Pattern f48816b;

    /* renamed from: c */
    @GuardedBy
    private static final HashMap<C4850a, List<wa0>> f48817c;

    /* renamed from: d */
    private static final String f48818d;

    /* renamed from: e */
    private static final String f48819e;

    /* renamed from: f */
    private static final String f48820f;

    /* renamed from: g */
    private static final String f48821g;

    /* renamed from: h */
    private static final String f48822h;

    /* renamed from: i */
    private static final String f48823i;

    /* renamed from: j */
    private static final String f48824j;

    /* renamed from: k */
    private static int f48825k;

    /* renamed from: com.yandex.mobile.ads.impl.bb0$a */
    public static final class C4850a {

        /* renamed from: a */
        public final String f48826a;

        /* renamed from: b */
        public final boolean f48827b;

        /* renamed from: c */
        public final boolean f48828c;

        public C4850a(String str, boolean z, boolean z2) {
            this.f48826a = str;
            this.f48827b = z;
            this.f48828c = z2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C4850a.class) {
                return false;
            }
            C4850a c4850a = (C4850a) obj;
            return TextUtils.equals(this.f48826a, c4850a.f48826a) && this.f48827b == c4850a.f48827b && this.f48828c == c4850a.f48828c;
        }

        public final int hashCode() {
            return ((o11.m26984a(this.f48826a, 31, 31) + (this.f48827b ? 1231 : 1237)) * 31) + (this.f48828c ? 1231 : 1237);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bb0$b */
    public static class C4851b extends Exception {
        public /* synthetic */ C4851b(Exception exc, int i2) {
            this(exc);
        }

        private C4851b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bb0$c */
    public interface InterfaceC4852c {
        /* renamed from: a */
        int mo22781a();

        /* renamed from: a */
        MediaCodecInfo mo22782a(int i2);

        /* renamed from: a */
        boolean mo22783a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: a */
        boolean mo22784a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo22785b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.bb0$d */
    public static final class C4853d implements InterfaceC4852c {
        private C4853d() {
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: a */
        public final int mo22781a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: a */
        public final boolean mo22783a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: b */
        public final boolean mo22785b() {
            return false;
        }

        public /* synthetic */ C4853d(int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: a */
        public final MediaCodecInfo mo22782a(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: a */
        public final boolean mo22784a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.bb0$e */
    public static final class C4854e implements InterfaceC4852c {

        /* renamed from: a */
        private final int f48829a;

        /* renamed from: b */
        @Nullable
        private MediaCodecInfo[] f48830b;

        public C4854e(boolean z, boolean z2) {
            this.f48829a = (z || z2) ? 1 : 0;
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: a */
        public final boolean mo22784a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: b */
        public final boolean mo22785b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: a */
        public final boolean mo22783a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: a */
        public final int mo22781a() {
            if (this.f48830b == null) {
                this.f48830b = new MediaCodecList(this.f48829a).getCodecInfos();
            }
            return this.f48830b.length;
        }

        @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4852c
        /* renamed from: a */
        public final MediaCodecInfo mo22782a(int i2) {
            if (this.f48830b == null) {
                this.f48830b = new MediaCodecList(this.f48829a).getCodecInfos();
            }
            return this.f48830b[i2];
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bb0$f */
    public interface InterfaceC4855f<T> {
        /* renamed from: a */
        int mo22786a(T t);
    }

    static {
        cb0 m23515g = ct0.m23515g();
        f48815a = m23515g;
        f48816b = Pattern.compile("^\\D?(\\d+)$");
        f48817c = new HashMap<>();
        f48818d = m23515g.m23141d();
        f48819e = m23515g.m23143e();
        f48820f = m23515g.m23120P0();
        f48821g = m23515g.m23103H();
        f48822h = m23515g.m23105I();
        f48823i = m23515g.m23139c();
        f48824j = m23515g.m23134Z();
        f48825k = -1;
    }

    /* renamed from: a */
    public static synchronized List<wa0> m22770a(String str, boolean z, boolean z2) throws C4851b {
        synchronized (bb0.class) {
            C4850a c4850a = new C4850a(str, z, z2);
            HashMap<C4850a, List<wa0>> hashMap = f48817c;
            List<wa0> list = hashMap.get(c4850a);
            if (list != null) {
                return list;
            }
            int i2 = s91.f54530a;
            int i3 = 0;
            ArrayList<wa0> m22769a = m22769a(c4850a, i2 >= 21 ? new C4854e(z, z2) : new C4853d(i3));
            if (z && m22769a.isEmpty() && 21 <= i2 && i2 <= 23) {
                m22769a = m22769a(c4850a, new C4853d(i3));
                if (!m22769a.isEmpty()) {
                    d90.m23842d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + m22769a.get(0).f56065a);
                }
            }
            m22771a(str, m22769a);
            AbstractC4698p m22050a = AbstractC4698p.m22050a((Collection) m22769a);
            hashMap.put(c4850a, m22050a);
            return m22050a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0448 A[Catch: NumberFormatException -> 0x0458, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0458, blocks: (B:262:0x03ec, B:264:0x03fe, B:276:0x041c, B:279:0x0448), top: B:261:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0221  */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m22776b(com.yandex.mobile.ads.impl.C5606pv r20) {
        /*
            Method dump skipped, instructions count: 2170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bb0.m22776b(com.yandex.mobile.ads.impl.pv):android.util.Pair");
    }

    @CheckResult
    /* renamed from: a */
    public static ArrayList m22768a(AbstractC4698p abstractC4698p, C5606pv c5606pv) {
        ArrayList arrayList = new ArrayList(abstractC4698p);
        m22772a(arrayList, new en1(c5606pv, 0));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m22764a(C5606pv c5606pv, wa0 wa0Var) {
        try {
            return wa0Var.m29424a(c5606pv) ? 1 : 0;
        } catch (C4851b unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static int m22762a() throws C4851b {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        if (f48825k == -1) {
            int i3 = 0;
            List<wa0> m22770a = m22770a("video/avc", false, false);
            wa0 wa0Var = m22770a.isEmpty() ? null : m22770a.get(0);
            if (wa0Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = wa0Var.f56068d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
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
                i3 = Math.max(i4, s91.f54530a >= 21 ? 345600 : 172800);
            }
            f48825k = i3;
        }
        return f48825k;
    }

    @Nullable
    /* renamed from: a */
    public static String m22767a(C5606pv c5606pv) {
        Pair<Integer, Integer> m22776b;
        if ("audio/eac3-joc".equals(c5606pv.f53820l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c5606pv.f53820l) || (m22776b = m22776b(c5606pv)) == null) {
            return null;
        }
        int intValue = ((Integer) m22776b.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:32|(1:34)(1:89)|35|(1:37)(2:81|(1:88)(1:87))|(4:(2:75|76)|60|(6:63|64|65|66|68|69)|13)|41|42|43|44|13) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        if (r23.f48827b == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f A[Catch: Exception -> 0x018b, TRY_ENTER, TryCatch #2 {Exception -> 0x018b, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:13:0x015e, B:14:0x0037, B:17:0x0042, B:46:0x0137, B:49:0x013f, B:51:0x0145, B:54:0x0166, B:55:0x0189), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.wa0> m22769a(com.yandex.mobile.ads.impl.bb0.C4850a r23, com.yandex.mobile.ads.impl.bb0.InterfaceC4852c r24) throws com.yandex.mobile.ads.impl.bb0.C4851b {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bb0.m22769a(com.yandex.mobile.ads.impl.bb0$a, com.yandex.mobile.ads.impl.bb0$c):java.util.ArrayList");
    }

    @Nullable
    /* renamed from: a */
    private static String m22766a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            cb0 cb0Var = f48815a;
            if (cb0Var.m23138b0().equals(str)) {
                return cb0Var.m23112L0();
            }
            if (cb0Var.m23146f0().equals(str) || cb0Var.m23176u0().equals(str)) {
                return cb0Var.m23110K0();
            }
            return null;
        }
        if (str2.equals("audio/alac") && f48815a.m23164o0().equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && f48815a.m23166p0().equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && f48815a.m23162n0().equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m22774a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = s91.f54530a;
        if (i2 < 21) {
            cb0 cb0Var = f48815a;
            if (cb0Var.m23161n().equals(str) || cb0Var.m23165p().equals(str) || cb0Var.m23167q().equals(str) || cb0Var.m23163o().equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i2 < 18) {
            cb0 cb0Var2 = f48815a;
            if (cb0Var2.m23140c0().equals(str)) {
                String m23137b = cb0Var2.m23137b();
                String str3 = s91.f54531b;
                if (m23137b.equals(str3) || (cb0Var2.m23122Q0().equals(s91.f54532c) && str3.startsWith(cb0Var2.m23101G()))) {
                    return false;
                }
            }
        }
        if (i2 == 16) {
            cb0 cb0Var3 = f48815a;
            if (cb0Var3.m23170r0().equals(str)) {
                String m23169r = cb0Var3.m23169r();
                String str4 = s91.f54531b;
                if (m23169r.equals(str4) || cb0Var3.m23090A0().equals(str4) || cb0Var3.m23114M0().equals(str4) || cb0Var3.m23118O0().equals(str4) || cb0Var3.m23116N0().equals(str4) || str4.startsWith(cb0Var3.m23171s()) || cb0Var3.m23153j().equals(str4) || cb0Var3.m23155k().equals(str4) || cb0Var3.m23157l().equals(str4) || cb0Var3.m23159m().equals(str4) || cb0Var3.m23127T().equals(str4) || cb0Var3.m23100F0().equals(str4)) {
                    return false;
                }
            }
        }
        if (i2 == 16) {
            cb0 cb0Var4 = f48815a;
            if (cb0Var4.m23168q0().equals(str)) {
                String m23145f = cb0Var4.m23145f();
                String str5 = s91.f54531b;
                if (m23145f.equals(str5) || cb0Var4.m23147g().equals(str5) || cb0Var4.m23149h().equals(str5) || cb0Var4.m23151i().equals(str5)) {
                    return false;
                }
            }
        }
        if (i2 < 24) {
            cb0 cb0Var5 = f48815a;
            if ((cb0Var5.m23150h0().equals(str) || cb0Var5.m23136a0().equals(str)) && cb0Var5.m23102G0().equals(s91.f54532c)) {
                String str6 = s91.f54531b;
                if (str6.startsWith(cb0Var5.m23126S0()) || str6.startsWith(cb0Var5.m23128T0()) || str6.startsWith(cb0Var5.m23124R0()) || cb0Var5.m23096D0().equals(str6) || cb0Var5.m23133Y().equals(str6) || cb0Var5.m23135a().equals(str6) || cb0Var5.m23094C0().equals(str6) || cb0Var5.m23098E0().equals(str6)) {
                    return false;
                }
            }
        }
        if (i2 <= 19) {
            cb0 cb0Var6 = f48815a;
            if (cb0Var6.m23154j0().equals(str) && cb0Var6.m23102G0().equals(s91.f54532c)) {
                String str7 = s91.f54531b;
                if (str7.startsWith("d2") || str7.startsWith(cb0Var6.m23106I0()) || str7.startsWith(cb0Var6.m23107J()) || str7.startsWith(cb0Var6.m23104H0()) || str7.startsWith(cb0Var6.m23108J0())) {
                    return false;
                }
            }
        }
        if (i2 <= 19) {
            String str8 = s91.f54531b;
            cb0 cb0Var7 = f48815a;
            if (str8.startsWith(cb0Var7.m23107J()) && cb0Var7.m23172s0().equals(str)) {
                return false;
            }
        }
        return (i2 <= 23 && "audio/eac3-joc".equals(str2) && f48815a.m23142d0().equals(str)) ? false : true;
    }

    /* renamed from: a */
    private static void m22771a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (s91.f54530a < 26) {
                String str2 = s91.f54531b;
                cb0 cb0Var = f48815a;
                if (str2.equals(cb0Var.m23092B0()) && arrayList.size() == 1 && ((wa0) arrayList.get(0)).f56065a.equals(cb0Var.m23144e0())) {
                    arrayList.add(wa0.m29418a(cb0Var.m23160m0(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            m22772a(arrayList, dn1.f49692c);
        }
        int i2 = s91.f54530a;
        if (i2 < 21 && arrayList.size() > 1) {
            String str3 = ((wa0) arrayList.get(0)).f56065a;
            cb0 cb0Var2 = f48815a;
            if (cb0Var2.m23152i0().equals(str3) || cb0Var2.m23148g0().equals(str3) || cb0Var2.m23156k0().equals(str3)) {
                m22772a(arrayList, dn1.f49693d);
            }
        }
        if (i2 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (f48815a.m23174t0().equals(((wa0) arrayList.get(0)).f56065a)) {
            arrayList.add((wa0) arrayList.remove(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m22775b(wa0 wa0Var) {
        return wa0Var.f56065a.startsWith(f48815a.m23158l0()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m22765a(wa0 wa0Var) {
        String str = wa0Var.f56065a;
        cb0 cb0Var = f48815a;
        if (str.startsWith(cb0Var.m23158l0()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (s91.f54530a >= 26 || !str.equals(cb0Var.m23144e0())) ? 0 : -1;
    }

    /* renamed from: a */
    private static boolean m22773a(MediaCodecInfo mediaCodecInfo, String str) {
        if (s91.f54530a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (he0.m25142b(str)) {
            return true;
        }
        String m24832b = C5114ga.m24832b(mediaCodecInfo.getName());
        if (m24832b.startsWith("arc.")) {
            return false;
        }
        cb0 cb0Var = f48815a;
        if (m24832b.startsWith(cb0Var.m23182x0()) || m24832b.startsWith(cb0Var.m23180w0())) {
            return true;
        }
        if ((m24832b.startsWith(cb0Var.m23186z0()) && m24832b.contains(".sw.")) || m24832b.equals(cb0Var.m23184y0()) || m24832b.startsWith("c2.android.") || m24832b.startsWith("c2.google.")) {
            return true;
        }
        return (m24832b.startsWith(cb0Var.m23178v0()) || m24832b.startsWith("c2.")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m22763a(InterfaceC4855f interfaceC4855f, Object obj, Object obj2) {
        return interfaceC4855f.mo22786a(obj2) - interfaceC4855f.mo22786a(obj);
    }

    /* renamed from: a */
    private static void m22772a(ArrayList arrayList, final InterfaceC4855f interfaceC4855f) {
        Collections.sort(arrayList, new Comparator() { // from class: com.yandex.mobile.ads.impl.fn1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m22763a;
                m22763a = bb0.m22763a(bb0.InterfaceC4855f.this, obj, obj2);
                return m22763a;
            }
        });
    }
}
