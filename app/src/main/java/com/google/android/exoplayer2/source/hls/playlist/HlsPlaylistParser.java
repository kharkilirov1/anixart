package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.C0932C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {

    /* renamed from: a */
    public final HlsMasterPlaylist f13392a;

    /* renamed from: b */
    @Nullable
    public final HlsMediaPlaylist f13393b;

    /* renamed from: c */
    public static final Pattern f13368c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    public static final Pattern f13369d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    public static final Pattern f13370e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    public static final Pattern f13371f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g */
    public static final Pattern f13372g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h */
    public static final Pattern f13373h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f13374i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j */
    public static final Pattern f13375j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k */
    public static final Pattern f13376k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l */
    public static final Pattern f13377l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m */
    public static final Pattern f13378m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n */
    public static final Pattern f13379n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o */
    public static final Pattern f13380o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p */
    public static final Pattern f13381p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q */
    public static final Pattern f13382q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r */
    public static final Pattern f13383r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s */
    public static final Pattern f13384s = m7151b("CAN-SKIP-DATERANGES");

    /* renamed from: t */
    public static final Pattern f13385t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u */
    public static final Pattern f13386u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v */
    public static final Pattern f13387v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    public static final Pattern f13388w = m7151b("CAN-BLOCK-RELOAD");

    /* renamed from: x */
    public static final Pattern f13389x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y */
    public static final Pattern f13390y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z */
    public static final Pattern f13391z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A */
    public static final Pattern f13340A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B */
    public static final Pattern f13341B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C */
    public static final Pattern f13342C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D */
    public static final Pattern f13343D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E */
    public static final Pattern f13344E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F */
    public static final Pattern f13345F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G */
    public static final Pattern f13346G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H */
    public static final Pattern f13347H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I */
    public static final Pattern f13348I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J */
    public static final Pattern f13349J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K */
    public static final Pattern f13350K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L */
    public static final Pattern f13351L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M */
    public static final Pattern f13352M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N */
    public static final Pattern f13353N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O */
    public static final Pattern f13354O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P */
    public static final Pattern f13355P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q */
    public static final Pattern f13356Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R */
    public static final Pattern f13357R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S */
    public static final Pattern f13358S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T */
    public static final Pattern f13359T = m7151b("AUTOSELECT");

    /* renamed from: U */
    public static final Pattern f13360U = m7151b("DEFAULT");

    /* renamed from: V */
    public static final Pattern f13361V = m7151b("FORCED");

    /* renamed from: W */
    public static final Pattern f13362W = m7151b("INDEPENDENT");

    /* renamed from: X */
    public static final Pattern f13363X = m7151b("GAP");

    /* renamed from: Y */
    public static final Pattern f13364Y = m7151b("PRECISE");

    /* renamed from: Z */
    public static final Pattern f13365Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0 */
    public static final Pattern f13366a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0 */
    public static final Pattern f13367b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class LineIterator {

        /* renamed from: a */
        public final BufferedReader f13394a;

        /* renamed from: b */
        public final Queue<String> f13395b;

        /* renamed from: c */
        @Nullable
        public String f13396c;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.f13395b = queue;
            this.f13394a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* renamed from: a */
        public boolean m7169a() throws IOException {
            String trim;
            if (this.f13396c != null) {
                return true;
            }
            if (!this.f13395b.isEmpty()) {
                String poll = this.f13395b.poll();
                Objects.requireNonNull(poll);
                this.f13396c = poll;
                return true;
            }
            do {
                String readLine = this.f13394a.readLine();
                this.f13396c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f13396c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m7170b() throws IOException {
            if (!m7169a()) {
                throw new NoSuchElementException();
            }
            String str = this.f13396c;
            this.f13396c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this.f13392a = HlsMasterPlaylist.f13275n;
        this.f13393b = null;
    }

    /* renamed from: b */
    public static Pattern m7151b(String str) {
        StringBuilder m4122u = C0576a.m4122u(str.length() + 9, str, "=(", "NO", "|");
        m4122u.append("YES");
        m4122u.append(")");
        return Pattern.compile(m4122u.toString());
    }

    /* renamed from: c */
    public static DrmInitData m7152c(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i2];
            schemeDataArr2[i2] = new DrmInitData.SchemeData(schemeData.f10713c, schemeData.f10714d, schemeData.f10715e, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    @Nullable
    /* renamed from: d */
    public static String m7153d(long j2, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    /* renamed from: e */
    public static double m7154e(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(m7166q(str, pattern, Collections.emptyMap()));
    }

    @Nullable
    /* renamed from: f */
    public static DrmInitData.SchemeData m7155f(String str, String str2, Map<String, String> map) throws ParserException {
        String m7164o = m7164o(str, f13349J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m7166q = m7166q(str, f13350K, map);
            return new DrmInitData.SchemeData(C0932C.f9459d, null, "video/mp4", Base64.decode(m7166q.substring(m7166q.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(C0932C.f9459d, null, "hls", Util.m7708G(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(m7164o)) {
            return null;
        }
        String m7166q2 = m7166q(str, f13350K, map);
        byte[] decode = Base64.decode(m7166q2.substring(m7166q2.indexOf(44)), 0);
        UUID uuid = C0932C.f9460e;
        return new DrmInitData.SchemeData(uuid, null, "video/mp4", PsshAtomUtil.m6524a(uuid, decode));
    }

    /* renamed from: g */
    public static String m7156g(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: h */
    public static int m7157h(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(m7166q(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0134, code lost:
    
        if (r6 > 0) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist m7158i(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator r34, java.lang.String r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.m7158i(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist");
    }

    /* renamed from: j */
    public static HlsMediaPlaylist m7159j(HlsMasterPlaylist hlsMasterPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) throws IOException {
        String str2;
        String str3;
        ArrayList arrayList;
        long j2;
        HlsMasterPlaylist hlsMasterPlaylist2;
        int i2;
        ArrayList arrayList2;
        String str4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j3;
        ArrayList arrayList5;
        long j4;
        HlsMediaPlaylist.Segment segment;
        DrmInitData drmInitData;
        ArrayList arrayList6;
        long j5;
        long j6;
        ArrayList arrayList7;
        String str5;
        String str6;
        ArrayList arrayList8;
        ArrayList arrayList9;
        int i3;
        String str7;
        ArrayList arrayList10;
        ArrayList arrayList11;
        String str8;
        long parseLong;
        long j7;
        boolean z = hlsMasterPlaylist.f13339c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl = new HlsMediaPlaylist.ServerControl(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str9 = "";
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        HlsMasterPlaylist hlsMasterPlaylist3 = hlsMasterPlaylist;
        boolean z2 = z;
        HlsMediaPlaylist.ServerControl serverControl2 = serverControl;
        String str10 = "";
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        int i4 = 0;
        String str11 = null;
        long j16 = -9223372036854775807L;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 0;
        int i6 = 1;
        long j17 = -9223372036854775807L;
        long j18 = -9223372036854775807L;
        boolean z5 = false;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        boolean z6 = false;
        String str12 = null;
        long j19 = -1;
        String str13 = null;
        int i7 = 0;
        boolean z7 = false;
        HlsMediaPlaylist.Segment segment2 = null;
        ArrayList arrayList16 = arrayList13;
        HlsMediaPlaylist.Part part = null;
        while (lineIterator.m7169a()) {
            String m7170b = lineIterator.m7170b();
            if (m7170b.startsWith("#EXT")) {
                arrayList15.add(m7170b);
            }
            if (m7170b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String m7166q = m7166q(m7170b, f13382q, hashMap);
                if ("VOD".equals(m7166q)) {
                    i4 = 1;
                } else if ("EVENT".equals(m7166q)) {
                    i4 = 2;
                }
            } else if (m7170b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (m7170b.startsWith("#EXT-X-START")) {
                    str2 = str9;
                    long m7154e = (long) (m7154e(m7170b, f13342C) * 1000000.0d);
                    z3 = m7160k(m7170b, f13364Y, false);
                    j16 = m7154e;
                    str3 = str11;
                    arrayList = arrayList12;
                } else {
                    str2 = str9;
                    if (m7170b.startsWith("#EXT-X-SERVER-CONTROL")) {
                        arrayList = arrayList12;
                        double m7161l = m7161l(m7170b, f13383r, -9.223372036854776E18d);
                        if (m7161l == -9.223372036854776E18d) {
                            str3 = str11;
                            j2 = -9223372036854775807L;
                        } else {
                            str3 = str11;
                            j2 = (long) (m7161l * 1000000.0d);
                        }
                        boolean m7160k = m7160k(m7170b, f13384s, false);
                        double m7161l2 = m7161l(m7170b, f13386u, -9.223372036854776E18d);
                        long j20 = m7161l2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (m7161l2 * 1000000.0d);
                        double m7161l3 = m7161l(m7170b, f13387v, -9.223372036854776E18d);
                        serverControl2 = new HlsMediaPlaylist.ServerControl(j2, m7160k, j20, m7161l3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (m7161l3 * 1000000.0d), m7160k(m7170b, f13388w, false));
                    } else {
                        str3 = str11;
                        arrayList = arrayList12;
                        if (m7170b.startsWith("#EXT-X-PART-INF")) {
                            j18 = (long) (m7154e(m7170b, f13380o) * 1000000.0d);
                        } else if (m7170b.startsWith("#EXT-X-MAP")) {
                            String m7166q2 = m7166q(m7170b, f13350K, hashMap);
                            String m7165p = m7165p(m7170b, f13344E, hashMap);
                            if (m7165p != null) {
                                int i8 = Util.f14736a;
                                String[] split = m7165p.split("@", -1);
                                j19 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j10 = Long.parseLong(split[1]);
                                }
                            }
                            if (j19 == -1) {
                                j10 = 0;
                            }
                            String str14 = str12;
                            if (str3 != null && str14 == null) {
                                throw ParserException.m5908b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            segment2 = new HlsMediaPlaylist.Segment(m7166q2, j10, j19, str3, str14);
                            if (j19 != -1) {
                                j10 += j19;
                            }
                            str11 = str3;
                            str12 = str14;
                            str9 = str2;
                            arrayList12 = arrayList;
                            j19 = -1;
                        } else {
                            String str15 = str12;
                            if (m7170b.startsWith("#EXT-X-TARGETDURATION")) {
                                j17 = m7157h(m7170b, f13378m) * 1000000;
                            } else if (m7170b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                parseLong = Long.parseLong(m7166q(m7170b, f13389x, Collections.emptyMap()));
                                i2 = i4;
                                arrayList2 = arrayList16;
                                arrayList8 = arrayList15;
                                str11 = str3;
                                str6 = str15;
                                j7 = parseLong;
                                arrayList9 = arrayList;
                                arrayList3 = arrayList9;
                                j12 = parseLong;
                                str15 = str6;
                                str4 = str13;
                                arrayList4 = arrayList8;
                                j9 = j7;
                                str13 = str4;
                                i4 = i2;
                                arrayList16 = arrayList2;
                                arrayList15 = arrayList4;
                                arrayList12 = arrayList3;
                                str12 = str15;
                                str9 = str2;
                            } else if (m7170b.startsWith("#EXT-X-VERSION")) {
                                i6 = m7157h(m7170b, f13381p);
                            } else {
                                if (m7170b.startsWith("#EXT-X-DEFINE")) {
                                    String m7165p2 = m7165p(m7170b, f13366a0, hashMap);
                                    if (m7165p2 != null) {
                                        String str16 = hlsMasterPlaylist3.f13284l.get(m7165p2);
                                        if (str16 != null) {
                                            hashMap.put(m7165p2, str16);
                                        }
                                    } else {
                                        hashMap.put(m7166q(m7170b, f13355P, hashMap), m7166q(m7170b, f13365Z, hashMap));
                                    }
                                    i2 = i4;
                                    arrayList4 = arrayList15;
                                    j3 = j12;
                                    str4 = str13;
                                    arrayList7 = arrayList;
                                    arrayList5 = arrayList16;
                                } else {
                                    hlsMasterPlaylist2 = hlsMasterPlaylist3;
                                    if (m7170b.startsWith("#EXTINF")) {
                                        BigDecimal bigDecimal = new BigDecimal(m7166q(m7170b, f13390y, Collections.emptyMap()));
                                        i2 = i4;
                                        j14 = bigDecimal.multiply(new BigDecimal(1000000L)).longValue();
                                        str8 = str2;
                                        str10 = m7164o(m7170b, f13391z, str8, hashMap);
                                        str2 = str8;
                                        arrayList2 = arrayList16;
                                        arrayList8 = arrayList15;
                                        str11 = str3;
                                        str6 = str15;
                                        hlsMasterPlaylist3 = hlsMasterPlaylist2;
                                        arrayList9 = arrayList;
                                        j7 = j9;
                                        parseLong = j12;
                                        arrayList3 = arrayList9;
                                        j12 = parseLong;
                                        str15 = str6;
                                        str4 = str13;
                                        arrayList4 = arrayList8;
                                        j9 = j7;
                                        str13 = str4;
                                        i4 = i2;
                                        arrayList16 = arrayList2;
                                        arrayList15 = arrayList4;
                                        arrayList12 = arrayList3;
                                        str12 = str15;
                                        str9 = str2;
                                    } else {
                                        i2 = i4;
                                        String str17 = str2;
                                        if (m7170b.startsWith("#EXT-X-SKIP")) {
                                            int m7157h = m7157h(m7170b, f13385t);
                                            HlsMediaPlaylist hlsMediaPlaylist3 = hlsMediaPlaylist2;
                                            Assertions.m7516d(hlsMediaPlaylist3 != null && arrayList.isEmpty());
                                            int i9 = Util.f14736a;
                                            int i10 = (int) (j9 - hlsMediaPlaylist3.f13302k);
                                            int i11 = m7157h + i10;
                                            if (i10 < 0 || i11 > hlsMediaPlaylist3.f13309r.size()) {
                                                throw new DeltaUpdateException();
                                            }
                                            str6 = str15;
                                            str11 = str3;
                                            HlsMediaPlaylist hlsMediaPlaylist4 = hlsMediaPlaylist3;
                                            while (i10 < i11) {
                                                HlsMediaPlaylist.Segment segment3 = hlsMediaPlaylist4.f13309r.get(i10);
                                                if (j9 != hlsMediaPlaylist4.f13302k) {
                                                    int i12 = (hlsMediaPlaylist4.f13301j - i5) + segment3.f13324e;
                                                    ArrayList arrayList17 = new ArrayList();
                                                    long j21 = j13;
                                                    int i13 = 0;
                                                    while (i13 < segment3.f13320n.size()) {
                                                        HlsMediaPlaylist.Part part2 = segment3.f13320n.get(i13);
                                                        arrayList17.add(new HlsMediaPlaylist.Part(part2.f13321b, part2.f13322c, part2.f13323d, i12, j21, part2.f13326g, part2.f13327h, part2.f13328i, part2.f13329j, part2.f13330k, part2.f13331l, part2.f13314m, part2.f13315n));
                                                        j21 += part2.f13323d;
                                                        i13++;
                                                        arrayList15 = arrayList15;
                                                        i11 = i11;
                                                        arrayList16 = arrayList16;
                                                        str17 = str17;
                                                    }
                                                    i3 = i11;
                                                    str7 = str17;
                                                    arrayList10 = arrayList16;
                                                    arrayList11 = arrayList15;
                                                    segment3 = new HlsMediaPlaylist.Segment(segment3.f13321b, segment3.f13322c, segment3.f13319m, segment3.f13323d, i12, j13, segment3.f13326g, segment3.f13327h, segment3.f13328i, segment3.f13329j, segment3.f13330k, segment3.f13331l, arrayList17);
                                                } else {
                                                    i3 = i11;
                                                    str7 = str17;
                                                    arrayList10 = arrayList16;
                                                    arrayList11 = arrayList15;
                                                }
                                                ArrayList arrayList18 = arrayList;
                                                arrayList18.add(segment3);
                                                j13 += segment3.f13323d;
                                                long j22 = segment3.f13330k;
                                                if (j22 != -1) {
                                                    j10 = segment3.f13329j + j22;
                                                }
                                                int i14 = segment3.f13324e;
                                                HlsMediaPlaylist.Segment segment4 = segment3.f13322c;
                                                DrmInitData drmInitData4 = segment3.f13326g;
                                                str11 = segment3.f13327h;
                                                String str18 = segment3.f13328i;
                                                if (str18 == null || !str18.equals(Long.toHexString(j12))) {
                                                    str6 = segment3.f13328i;
                                                }
                                                j12++;
                                                i10++;
                                                arrayList = arrayList18;
                                                i7 = i14;
                                                segment2 = segment4;
                                                drmInitData3 = drmInitData4;
                                                i11 = i3;
                                                arrayList16 = arrayList10;
                                                j11 = j13;
                                                hlsMediaPlaylist4 = hlsMediaPlaylist;
                                                arrayList15 = arrayList11;
                                                str17 = str7;
                                            }
                                            str2 = str17;
                                            arrayList2 = arrayList16;
                                            arrayList8 = arrayList15;
                                            arrayList9 = arrayList;
                                            hlsMasterPlaylist3 = hlsMasterPlaylist;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            j7 = j9;
                                            parseLong = j12;
                                            arrayList3 = arrayList9;
                                            j12 = parseLong;
                                            str15 = str6;
                                            str4 = str13;
                                            arrayList4 = arrayList8;
                                            j9 = j7;
                                            str13 = str4;
                                            i4 = i2;
                                            arrayList16 = arrayList2;
                                            arrayList15 = arrayList4;
                                            arrayList12 = arrayList3;
                                            str12 = str15;
                                            str9 = str2;
                                        } else {
                                            str2 = str17;
                                            arrayList2 = arrayList16;
                                            ArrayList arrayList19 = arrayList15;
                                            if (m7170b.startsWith("#EXT-X-KEY")) {
                                                String m7166q3 = m7166q(m7170b, f13347H, hashMap);
                                                String m7164o = m7164o(m7170b, f13348I, "identity", hashMap);
                                                if ("NONE".equals(m7166q3)) {
                                                    treeMap.clear();
                                                    str5 = null;
                                                    str15 = null;
                                                } else {
                                                    str15 = m7165p(m7170b, f13351L, hashMap);
                                                    if (!"identity".equals(m7164o)) {
                                                        String str19 = str13;
                                                        str13 = str19 == null ? m7156g(m7166q3) : str19;
                                                        DrmInitData.SchemeData m7155f = m7155f(m7170b, m7164o, hashMap);
                                                        if (m7155f != null) {
                                                            treeMap.put(m7164o, m7155f);
                                                            str5 = null;
                                                        }
                                                    } else if ("AES-128".equals(m7166q3)) {
                                                        str5 = m7166q(m7170b, f13350K, hashMap);
                                                        arrayList6 = arrayList;
                                                        arrayList4 = arrayList19;
                                                        str11 = str5;
                                                        arrayList16 = arrayList2;
                                                    }
                                                    str5 = null;
                                                    arrayList6 = arrayList;
                                                    arrayList4 = arrayList19;
                                                    str11 = str5;
                                                    arrayList16 = arrayList2;
                                                }
                                                drmInitData3 = null;
                                                arrayList6 = arrayList;
                                                arrayList4 = arrayList19;
                                                str11 = str5;
                                                arrayList16 = arrayList2;
                                            } else {
                                                str4 = str13;
                                                if (m7170b.startsWith("#EXT-X-BYTERANGE")) {
                                                    String m7166q4 = m7166q(m7170b, f13343D, hashMap);
                                                    int i15 = Util.f14736a;
                                                    String[] split2 = m7166q4.split("@", -1);
                                                    j19 = Long.parseLong(split2[0]);
                                                    if (split2.length > 1) {
                                                        j10 = Long.parseLong(split2[1]);
                                                    }
                                                } else if (m7170b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                    i5 = Integer.parseInt(m7170b.substring(m7170b.indexOf(58) + 1));
                                                    z4 = true;
                                                } else if (m7170b.equals("#EXT-X-DISCONTINUITY")) {
                                                    i7++;
                                                } else {
                                                    if (m7170b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                        if (j8 == 0) {
                                                            j8 = Util.m7717P(Util.m7720S(m7170b.substring(m7170b.indexOf(58) + 1))) - j13;
                                                        } else {
                                                            arrayList3 = arrayList;
                                                            arrayList4 = arrayList19;
                                                            arrayList5 = arrayList2;
                                                            j3 = j12;
                                                            arrayList7 = arrayList3;
                                                        }
                                                    } else if (m7170b.equals("#EXT-X-GAP")) {
                                                        z6 = true;
                                                    } else if (m7170b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                        z2 = true;
                                                    } else if (m7170b.equals("#EXT-X-ENDLIST")) {
                                                        z5 = true;
                                                    } else {
                                                        if (m7170b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                            arrayList3 = arrayList;
                                                            arrayList4 = arrayList19;
                                                            arrayList14.add(new HlsMediaPlaylist.RenditionReport(Uri.parse(UriUtil.m7700c(str, m7166q(m7170b, f13350K, hashMap))), m7163n(m7170b, f13340A, -1L), m7162m(m7170b, f13341B, -1)));
                                                        } else {
                                                            arrayList3 = arrayList;
                                                            arrayList4 = arrayList19;
                                                            if (!m7170b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                                j3 = j12;
                                                                if (m7170b.startsWith("#EXT-X-PART")) {
                                                                    String m7153d = m7153d(j3, str3, str15);
                                                                    String m7166q5 = m7166q(m7170b, f13350K, hashMap);
                                                                    long m7154e2 = (long) (m7154e(m7170b, f13379n) * 1000000.0d);
                                                                    boolean m7160k2 = m7160k(m7170b, f13362W, false) | (z2 && arrayList2.isEmpty());
                                                                    boolean m7160k3 = m7160k(m7170b, f13363X, false);
                                                                    String m7165p3 = m7165p(m7170b, f13344E, hashMap);
                                                                    if (m7165p3 != null) {
                                                                        int i16 = Util.f14736a;
                                                                        String[] split3 = m7165p3.split("@", -1);
                                                                        j6 = Long.parseLong(split3[0]);
                                                                        if (split3.length > 1) {
                                                                            j15 = Long.parseLong(split3[1]);
                                                                        }
                                                                        j5 = -1;
                                                                    } else {
                                                                        j5 = -1;
                                                                        j6 = -1;
                                                                    }
                                                                    if (j6 == j5) {
                                                                        j15 = 0;
                                                                    }
                                                                    if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                        DrmInitData drmInitData5 = new DrmInitData(str4, true, schemeDataArr);
                                                                        if (drmInitData2 == null) {
                                                                            drmInitData2 = m7152c(str4, schemeDataArr);
                                                                        }
                                                                        drmInitData3 = drmInitData5;
                                                                    }
                                                                    arrayList5 = arrayList2;
                                                                    arrayList5.add(new HlsMediaPlaylist.Part(m7166q5, segment2, m7154e2, i7, j11, drmInitData3, str3, m7153d, j15, j6, m7160k3, m7160k2, false));
                                                                    j11 += m7154e2;
                                                                    if (j6 != j5) {
                                                                        j15 += j6;
                                                                    }
                                                                } else {
                                                                    arrayList5 = arrayList2;
                                                                    if (!m7170b.startsWith("#")) {
                                                                        String m7153d2 = m7153d(j3, str3, str15);
                                                                        j12 = j3 + 1;
                                                                        String m7167r = m7167r(m7170b, hashMap);
                                                                        HlsMediaPlaylist.Segment segment5 = (HlsMediaPlaylist.Segment) hashMap2.get(m7167r);
                                                                        if (j19 == -1) {
                                                                            j4 = 0;
                                                                        } else {
                                                                            if (z7 && segment2 == null && segment5 == null) {
                                                                                segment5 = new HlsMediaPlaylist.Segment(m7167r, 0L, j10, null, null);
                                                                                hashMap2.put(m7167r, segment5);
                                                                            }
                                                                            j4 = j10;
                                                                        }
                                                                        if (drmInitData3 != null || treeMap.isEmpty()) {
                                                                            segment = segment5;
                                                                            drmInitData = drmInitData3;
                                                                        } else {
                                                                            segment = segment5;
                                                                            DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                            drmInitData = new DrmInitData(str4, true, schemeDataArr2);
                                                                            if (drmInitData2 == null) {
                                                                                drmInitData2 = m7152c(str4, schemeDataArr2);
                                                                            }
                                                                        }
                                                                        arrayList6 = arrayList3;
                                                                        arrayList6.add(new HlsMediaPlaylist.Segment(m7167r, segment2 != null ? segment2 : segment, str10, j14, i7, j13, drmInitData, str3, m7153d2, j4, j19, z6, arrayList5));
                                                                        j13 += j14;
                                                                        ArrayList arrayList20 = new ArrayList();
                                                                        if (j19 != -1) {
                                                                            j4 += j19;
                                                                        }
                                                                        arrayList16 = arrayList20;
                                                                        str11 = str3;
                                                                        str13 = str4;
                                                                        drmInitData3 = drmInitData;
                                                                        j14 = 0;
                                                                        j10 = j4;
                                                                        j11 = j13;
                                                                        str10 = str2;
                                                                        z6 = false;
                                                                        j19 = -1;
                                                                    }
                                                                }
                                                                arrayList7 = arrayList3;
                                                            } else if (part == null && "PART".equals(m7166q(m7170b, f13353N, hashMap))) {
                                                                String m7166q6 = m7166q(m7170b, f13350K, hashMap);
                                                                long m7163n = m7163n(m7170b, f13345F, -1L);
                                                                long m7163n2 = m7163n(m7170b, f13346G, -1L);
                                                                long j23 = j12;
                                                                String m7153d3 = m7153d(j23, str3, str15);
                                                                if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                    DrmInitData drmInitData6 = new DrmInitData(str4, true, schemeDataArr3);
                                                                    if (drmInitData2 == null) {
                                                                        drmInitData2 = m7152c(str4, schemeDataArr3);
                                                                    }
                                                                    drmInitData3 = drmInitData6;
                                                                }
                                                                if (m7163n == -1 || m7163n2 != -1) {
                                                                    part = new HlsMediaPlaylist.Part(m7166q6, segment2, 0L, i7, j11, drmInitData3, str3, m7153d3, m7163n != -1 ? m7163n : 0L, m7163n2, false, false, true);
                                                                }
                                                                hlsMasterPlaylist3 = hlsMasterPlaylist;
                                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                j12 = j23;
                                                                str11 = str3;
                                                                str13 = str4;
                                                                i4 = i2;
                                                                arrayList16 = arrayList2;
                                                                arrayList15 = arrayList4;
                                                                arrayList12 = arrayList3;
                                                            }
                                                        }
                                                        arrayList5 = arrayList2;
                                                        j3 = j12;
                                                        arrayList7 = arrayList3;
                                                    }
                                                    str12 = str15;
                                                    str9 = str2;
                                                }
                                                hlsMasterPlaylist3 = hlsMasterPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                arrayList3 = arrayList;
                                                arrayList4 = arrayList19;
                                                str11 = str3;
                                                str13 = str4;
                                                i4 = i2;
                                                arrayList16 = arrayList2;
                                                arrayList15 = arrayList4;
                                                arrayList12 = arrayList3;
                                                str12 = str15;
                                                str9 = str2;
                                            }
                                            hlsMasterPlaylist3 = hlsMasterPlaylist;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            i4 = i2;
                                            arrayList12 = arrayList6;
                                            arrayList15 = arrayList4;
                                            str12 = str15;
                                            str9 = str2;
                                        }
                                    }
                                }
                                hlsMasterPlaylist3 = hlsMasterPlaylist;
                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                j12 = j3;
                                arrayList16 = arrayList5;
                                str11 = str3;
                                str13 = str4;
                                i4 = i2;
                                arrayList12 = arrayList7;
                                arrayList15 = arrayList4;
                                str12 = str15;
                                str9 = str2;
                            }
                            i2 = i4;
                            hlsMasterPlaylist2 = hlsMasterPlaylist3;
                            str8 = str2;
                            str2 = str8;
                            arrayList2 = arrayList16;
                            arrayList8 = arrayList15;
                            str11 = str3;
                            str6 = str15;
                            hlsMasterPlaylist3 = hlsMasterPlaylist2;
                            arrayList9 = arrayList;
                            j7 = j9;
                            parseLong = j12;
                            arrayList3 = arrayList9;
                            j12 = parseLong;
                            str15 = str6;
                            str4 = str13;
                            arrayList4 = arrayList8;
                            j9 = j7;
                            str13 = str4;
                            i4 = i2;
                            arrayList16 = arrayList2;
                            arrayList15 = arrayList4;
                            arrayList12 = arrayList3;
                            str12 = str15;
                            str9 = str2;
                        }
                    }
                }
                str11 = str3;
                str9 = str2;
                arrayList12 = arrayList;
            }
        }
        int i17 = i4;
        ArrayList arrayList21 = arrayList15;
        ArrayList arrayList22 = arrayList12;
        ArrayList arrayList23 = arrayList16;
        HashMap hashMap3 = new HashMap();
        for (int i18 = 0; i18 < arrayList14.size(); i18++) {
            HlsMediaPlaylist.RenditionReport renditionReport = (HlsMediaPlaylist.RenditionReport) arrayList14.get(i18);
            long j24 = renditionReport.f13317b;
            if (j24 == -1) {
                j24 = (j9 + arrayList22.size()) - (arrayList23.isEmpty() ? 1L : 0L);
            }
            int i19 = renditionReport.f13318c;
            if (i19 == -1 && j18 != -9223372036854775807L) {
                i19 = (arrayList23.isEmpty() ? ((HlsMediaPlaylist.Segment) Iterables.m11700e(arrayList22)).f13320n : arrayList23).size() - 1;
            }
            Uri uri = renditionReport.f13316a;
            hashMap3.put(uri, new HlsMediaPlaylist.RenditionReport(uri, j24, i19));
        }
        if (part != null) {
            arrayList23.add(part);
        }
        return new HlsMediaPlaylist(i17, str, arrayList21, j16, z3, j8, z4, i5, j9, i6, j17, j18, z2, z5, j8 != 0, drmInitData2, arrayList22, arrayList23, serverControl2, hashMap3);
    }

    /* renamed from: k */
    public static boolean m7160k(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z;
    }

    /* renamed from: l */
    public static double m7161l(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        return Double.parseDouble(group);
    }

    /* renamed from: m */
    public static int m7162m(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return i2;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        return Integer.parseInt(group);
    }

    /* renamed from: n */
    public static long m7163n(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return j2;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        return Long.parseLong(group);
    }

    /* renamed from: o */
    public static String m7164o(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            Objects.requireNonNull(str2);
        }
        return (map.isEmpty() || str2 == null) ? str2 : m7167r(str2, map);
    }

    @Nullable
    /* renamed from: p */
    public static String m7165p(String str, Pattern pattern, Map<String, String> map) {
        return m7164o(str, pattern, null, map);
    }

    /* renamed from: q */
    public static String m7166q(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String m7164o = m7164o(str, pattern, null, map);
        if (m7164o != null) {
            return m7164o;
        }
        String pattern2 = pattern.pattern();
        throw ParserException.m5908b(C1008a.m6437d(C0576a.m4106e(str, C0576a.m4106e(pattern2, 19)), "Couldn't match ", pattern2, " in ", str), null);
    }

    /* renamed from: r */
    public static String m7167r(String str, Map<String, String> map) {
        Matcher matcher = f13367b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public static int m7168s(BufferedReader bufferedReader, boolean z, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z || !Util.m7714M(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x00ee, LOOP:0: B:13:0x0051->B:38:0x0051, LOOP_START, TryCatch #3 {all -> 0x00ee, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0051, B:15:0x0057, B:18:0x0062, B:57:0x006a, B:20:0x0080, B:22:0x0088, B:24:0x0090, B:26:0x0098, B:28:0x00a0, B:30:0x00a8, B:32:0x00b0, B:34:0x00b8, B:36:0x00c1, B:41:0x00c5, B:69:0x00e7, B:70:0x00ed, B:71:0x002d, B:73:0x0036, B:75:0x003f, B:79:0x0046), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7 A[Catch: all -> 0x00ee, TRY_ENTER, TryCatch #3 {all -> 0x00ee, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0051, B:15:0x0057, B:18:0x0062, B:57:0x006a, B:20:0x0080, B:22:0x0088, B:24:0x0090, B:26:0x0098, B:28:0x00a0, B:30:0x00a8, B:32:0x00b0, B:34:0x00b8, B:36:0x00c1, B:41:0x00c5, B:69:0x00e7, B:70:0x00ed, B:71:0x002d, B:73:0x0036, B:75:0x003f, B:79:0x0046), top: B:2:0x000f }] */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist mo6752a(android.net.Uri r7, java.io.InputStream r8) throws java.io.IOException {
        /*
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r8)
            r0.<init>(r1)
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Lee
            r2 = 239(0xef, float:3.35E-43)
            r3 = 0
            if (r1 != r2) goto L2d
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Lee
            r2 = 187(0xbb, float:2.62E-43)
            if (r1 != r2) goto L4e
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Lee
            r2 = 191(0xbf, float:2.68E-43)
            if (r1 == r2) goto L29
            goto L4e
        L29:
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Lee
        L2d:
            r2 = 1
            int r1 = m7168s(r0, r2, r1)     // Catch: java.lang.Throwable -> Lee
            r2 = 7
            r4 = 0
        L34:
            if (r4 >= r2) goto L46
            java.lang.String r5 = "#EXTM3U"
            char r5 = r5.charAt(r4)     // Catch: java.lang.Throwable -> Lee
            if (r1 == r5) goto L3f
            goto L4e
        L3f:
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Lee
            int r4 = r4 + 1
            goto L34
        L46:
            int r1 = m7168s(r0, r3, r1)     // Catch: java.lang.Throwable -> Lee
            boolean r3 = com.google.android.exoplayer2.util.Util.m7714M(r1)     // Catch: java.lang.Throwable -> Lee
        L4e:
            r1 = 0
            if (r3 == 0) goto Le7
        L51:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> Lee
            if (r2 == 0) goto Ldb
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> Lee
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lee
            if (r3 == 0) goto L62
            goto L51
        L62:
            java.lang.String r3 = "#EXT-X-STREAM-INF"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 == 0) goto L80
            r8.add(r2)     // Catch: java.lang.Throwable -> Lee
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator     // Catch: java.lang.Throwable -> Lee
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lee
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist r7 = m7158i(r1, r7)     // Catch: java.lang.Throwable -> Lee
        L7a:
            int r8 = com.google.android.exoplayer2.util.Util.f14736a
            r0.close()     // Catch: java.io.IOException -> Lda
            goto Lda
        L80:
            java.lang.String r3 = "#EXT-X-TARGETDURATION"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 != 0) goto Lc5
            java.lang.String r3 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 != 0) goto Lc5
            java.lang.String r3 = "#EXTINF"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 != 0) goto Lc5
            java.lang.String r3 = "#EXT-X-KEY"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 != 0) goto Lc5
            java.lang.String r3 = "#EXT-X-BYTERANGE"
            boolean r3 = r2.startsWith(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 != 0) goto Lc5
            java.lang.String r3 = "#EXT-X-DISCONTINUITY"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 != 0) goto Lc5
            java.lang.String r3 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 != 0) goto Lc5
            java.lang.String r3 = "#EXT-X-ENDLIST"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lee
            if (r3 == 0) goto Lc1
            goto Lc5
        Lc1:
            r8.add(r2)     // Catch: java.lang.Throwable -> Lee
            goto L51
        Lc5:
            r8.add(r2)     // Catch: java.lang.Throwable -> Lee
            com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist r1 = r6.f13392a     // Catch: java.lang.Throwable -> Lee
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2 = r6.f13393b     // Catch: java.lang.Throwable -> Lee
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator r3 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator     // Catch: java.lang.Throwable -> Lee
            r3.<init>(r8, r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lee
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r7 = m7159j(r1, r2, r3, r7)     // Catch: java.lang.Throwable -> Lee
            goto L7a
        Lda:
            return r7
        Ldb:
            int r7 = com.google.android.exoplayer2.util.Util.f14736a
            r0.close()     // Catch: java.io.IOException -> Le0
        Le0:
            java.lang.String r7 = "Failed to parse the playlist, could not identify any tags."
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.m5908b(r7, r1)
            throw r7
        Le7:
            java.lang.String r7 = "Input does not start with the #EXTM3U header."
            com.google.android.exoplayer2.ParserException r7 = com.google.android.exoplayer2.ParserException.m5908b(r7, r1)     // Catch: java.lang.Throwable -> Lee
            throw r7     // Catch: java.lang.Throwable -> Lee
        Lee:
            r7 = move-exception
            int r8 = com.google.android.exoplayer2.util.Util.f14736a
            r0.close()     // Catch: java.io.IOException -> Lf4
        Lf4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.mo6752a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    public HlsPlaylistParser(HlsMasterPlaylist hlsMasterPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        this.f13392a = hlsMasterPlaylist;
        this.f13393b = hlsMediaPlaylist;
    }
}
