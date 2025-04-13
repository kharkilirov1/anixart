package com.google.android.exoplayer2.util;

import android.app.UiModeManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.ParserException;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.yandex.mobile.ads.C4632R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class Util {

    /* renamed from: a */
    public static final int f14736a;

    /* renamed from: b */
    public static final String f14737b;

    /* renamed from: c */
    public static final String f14738c;

    /* renamed from: d */
    public static final String f14739d;

    /* renamed from: e */
    public static final String f14740e;

    /* renamed from: f */
    public static final byte[] f14741f;

    /* renamed from: g */
    public static final Pattern f14742g;

    /* renamed from: h */
    public static final Pattern f14743h;

    /* renamed from: i */
    public static final Pattern f14744i;

    /* renamed from: j */
    public static final Pattern f14745j;

    /* renamed from: k */
    @Nullable
    public static HashMap<String, String> f14746k;

    /* renamed from: l */
    public static final String[] f14747l;

    /* renamed from: m */
    public static final String[] f14748m;

    /* renamed from: n */
    public static final int[] f14749n;

    /* renamed from: o */
    public static final int[] f14750o;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f14736a = i2;
        String str = Build.DEVICE;
        f14737b = str;
        String str2 = Build.MANUFACTURER;
        f14738c = str2;
        String str3 = Build.MODEL;
        f14739d = str3;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str2, C0576a.m4106e(str3, C0576a.m4106e(str, 17))), str, ", ", str3, ", ");
        m4122u.append(str2);
        m4122u.append(", ");
        m4122u.append(i2);
        f14740e = m4122u.toString();
        f14741f = new byte[0];
        f14742g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f14743h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f14744i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f14745j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f14747l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f14748m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f14749n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f14750o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, C4632R.styleable.AppCompatTheme_windowActionModeOverlay, 126, C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, C4632R.styleable.AppCompatTheme_textColorSearchUrl, C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 97, C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, C4632R.styleable.AppCompatTheme_tooltipFrameBackground, C4632R.styleable.AppCompatTheme_viewInflaterClass, 125, C4632R.styleable.AppCompatTheme_windowFixedWidthMajor, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, 221, 218, 211, 212, C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall, C4632R.styleable.AppCompatTheme_textColorAlertDialogListItem, C4632R.styleable.AppCompatTheme_textAppearanceListItem, 96, C4632R.styleable.AppCompatTheme_windowActionBar, C4632R.styleable.AppCompatTheme_tooltipForegroundColor, 123, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, C4632R.styleable.AppCompatTheme_windowActionBarOverlay, C4632R.styleable.AppCompatTheme_toolbarStyle, C4632R.styleable.AppCompatTheme_windowFixedHeightMajor, 127, C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    public static int m7702A(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: B */
    public static int m7703B(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 268435456) {
                    if (i2 == 536870912) {
                        return i3 * 3;
                    }
                    if (i2 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i3 * 4;
        }
        return i3 * 2;
    }

    /* renamed from: C */
    public static long m7704C(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    /* renamed from: D */
    public static int m7705D(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: E */
    public static String m7706E(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long abs = (Math.abs(j2) + 500) / 1000;
        long j3 = abs % 60;
        long j4 = (abs / 60) % 60;
        long j5 = abs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    @Nullable
    /* renamed from: F */
    public static String m7707F(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            Log.m7585b("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e2);
            return null;
        }
    }

    /* renamed from: G */
    public static byte[] m7708G(String str) {
        return str.getBytes(Charsets.f20504c);
    }

    /* renamed from: H */
    public static int m7709H(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && Ascii.m11121a("rtsp", scheme)) {
            return 3;
        }
        String path = uri.getPath();
        if (path == null) {
            return 4;
        }
        String m11123c = Ascii.m11123c(path);
        if (!m11123c.endsWith(".mpd")) {
            if (!m11123c.endsWith(".m3u8")) {
                Matcher matcher = f14745j.matcher(m11123c);
                if (!matcher.matches()) {
                    return 4;
                }
                String group = matcher.group(2);
                if (group != null) {
                    if (!group.contains("format=mpd-time-csf")) {
                        if (group.contains("format=m3u8-aapl")) {
                        }
                    }
                }
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: I */
    public static int m7710I(Uri uri, @Nullable String str) {
        if (str == null) {
            return m7709H(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        return false;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7711J(com.google.android.exoplayer2.util.ParsableByteArray r3, com.google.android.exoplayer2.util.ParsableByteArray r4, @androidx.annotation.Nullable java.util.zip.Inflater r5) {
        /*
            int r0 = r3.m7637a()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            byte[] r0 = r4.f14698a
            int r0 = r0.length
            int r2 = r3.m7637a()
            if (r0 >= r2) goto L1a
            int r0 = r3.m7637a()
            int r0 = r0 * 2
            r4.m7638b(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.f14698a
            int r2 = r3.f14699b
            int r3 = r3.m7637a()
            r5.setInput(r0, r2, r3)
            r3 = 0
        L2d:
            byte[] r0 = r4.f14698a     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 == 0) goto L44
            r4.m7634E(r3)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            r3 = 1
            r5.reset()
            return r3
        L44:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 != 0) goto L5d
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 == 0) goto L51
            goto L5d
        L51:
            byte[] r0 = r4.f14698a     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r3 != r2) goto L2d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r0 = r0 * 2
            r4.m7638b(r0)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            goto L2d
        L5d:
            r5.reset()
            return r1
        L61:
            r3 = move-exception
            r5.reset()
            throw r3
        L66:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.m7711J(com.google.android.exoplayer2.util.ParsableByteArray, com.google.android.exoplayer2.util.ParsableByteArray, java.util.zip.Inflater):boolean");
    }

    /* renamed from: K */
    public static boolean m7712K(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    /* renamed from: L */
    public static boolean m7713L(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    /* renamed from: M */
    public static boolean m7714M(int i2) {
        return i2 == 10 || i2 == 13;
    }

    /* renamed from: N */
    public static boolean m7715N(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: O */
    public static <T> void m7716O(List<T> list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
        list.addAll(Math.min(i4, list.size()), arrayDeque);
    }

    /* renamed from: P */
    public static long m7717P(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    /* renamed from: Q */
    public static String m7718Q(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m11123c = Ascii.m11123c(str);
        int i2 = 0;
        String str2 = m7726Y(m11123c, "-")[0];
        if (f14746k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f14747l.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i3 = 0;
            while (true) {
                String[] strArr = f14747l;
                if (i3 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i3], strArr[i3 + 1]);
                i3 += 2;
            }
            f14746k = hashMap;
        }
        String str4 = f14746k.get(str2);
        if (str4 != null) {
            String valueOf = String.valueOf(m11123c.substring(str2.length()));
            m11123c = valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4);
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return m11123c;
        }
        while (true) {
            String[] strArr2 = f14748m;
            if (i2 >= strArr2.length) {
                return m11123c;
            }
            if (m11123c.startsWith(strArr2[i2])) {
                String valueOf2 = String.valueOf(strArr2[i2 + 1]);
                String valueOf3 = String.valueOf(m11123c.substring(strArr2[i2].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i2 += 2;
        }
    }

    /* renamed from: R */
    public static <T> T[] m7719R(T[] tArr, int i2) {
        Assertions.m7513a(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    /* renamed from: S */
    public static long m7720S(String str) throws ParserException {
        Matcher matcher = f14742g.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw ParserException.m5907a(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "), null);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(valueOf2.length() != 0 ? "0.".concat(valueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
    }

    /* renamed from: T */
    public static boolean m7721T(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: U */
    public static <T> void m7722U(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    /* renamed from: V */
    public static long m7723V(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return (j3 / j4) * j2;
        }
        return (long) (j2 * (j3 / j4));
    }

    /* renamed from: W */
    public static void m7724W(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 >= j2 || j2 % j3 != 0) {
            double d = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d);
                i2++;
            }
            return;
        }
        long j5 = j2 / j3;
        while (i2 < jArr.length) {
            jArr[i2] = jArr[i2] * j5;
            i2++;
        }
    }

    /* renamed from: X */
    public static String[] m7725X(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: Y */
    public static String[] m7726Y(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: Z */
    public static String[] m7727Z(@Nullable String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m7725X(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: a */
    public static boolean m7728a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a0 */
    public static byte[] m7729a0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    public static int m7730b(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    /* renamed from: b0 */
    public static long m7731b0(int i2, int i3) {
        return m7733c0(i3) | (m7733c0(i2) << 32);
    }

    /* renamed from: c */
    public static int m7732c(LongArray longArray, long j2, boolean z, boolean z2) {
        int i2;
        int i3 = longArray.f14652a - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            if (longArray.m7590b(i5) < j2) {
                i4 = i5 + 1;
            } else {
                i3 = i5 - 1;
            }
        }
        if (z && (i2 = i3 + 1) < longArray.f14652a && longArray.m7590b(i2) == j2) {
            return i2;
        }
        if (z2 && i3 == -1) {
            return 0;
        }
        return i3;
    }

    /* renamed from: c0 */
    public static long m7733c0(int i2) {
        return i2 & 4294967295L;
    }

    /* renamed from: d */
    public static <T extends Comparable<? super T>> int m7734d(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t) == 0);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* renamed from: d0 */
    public static long m7735d0(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    /* renamed from: e */
    public static int m7736e(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i2);
            i3 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    /* renamed from: f */
    public static int m7737f(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* renamed from: g */
    public static int m7738g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    /* renamed from: h */
    public static int m7739h(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* renamed from: i */
    public static float m7740i(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    /* renamed from: j */
    public static int m7741j(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    /* renamed from: k */
    public static long m7742k(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    /* renamed from: l */
    public static boolean m7743l(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (m7728a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static Handler m7744m() {
        return m7745n(null);
    }

    /* renamed from: n */
    public static Handler m7745n(@Nullable Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        Assertions.m7518f(myLooper);
        return new Handler(myLooper, callback);
    }

    /* renamed from: o */
    public static Handler m7746o() {
        return new Handler(m7753v(), null);
    }

    /* renamed from: p */
    public static String m7747p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: q */
    public static String m7748q(byte[] bArr) {
        return new String(bArr, Charsets.f20504c);
    }

    /* renamed from: r */
    public static String m7749r(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charsets.f20504c);
    }

    /* renamed from: s */
    public static int m7750s(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i3 = f14736a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: t */
    public static int m7751t(@Nullable String str, int i2) {
        int i3 = 0;
        for (String str2 : m7727Z(str)) {
            if (i2 == MimeTypes.m7601i(MimeTypes.m7597e(str2))) {
                i3++;
            }
        }
        return i3;
    }

    @Nullable
    /* renamed from: u */
    public static String m7752u(@Nullable String str, int i2) {
        String[] m7727Z = m7727Z(str);
        if (m7727Z.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : m7727Z) {
            if (i2 == MimeTypes.m7601i(MimeTypes.m7597e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: v */
    public static Looper m7753v() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: w */
    public static int m7754w(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: x */
    public static String m7755x(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: y */
    public static long m7756y(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    /* renamed from: z */
    public static long m7757z(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + android.os.SystemClock.elapsedRealtime();
    }
}
