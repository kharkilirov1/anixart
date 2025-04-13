package com.yandex.mobile.ads.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.mobile.ads.C4632R;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class s91 {

    /* renamed from: a */
    public static final int f54530a;

    /* renamed from: b */
    public static final String f54531b;

    /* renamed from: c */
    public static final String f54532c;

    /* renamed from: d */
    public static final String f54533d;

    /* renamed from: e */
    public static final String f54534e;

    /* renamed from: f */
    public static final byte[] f54535f;

    /* renamed from: g */
    private static final Pattern f54536g;

    /* renamed from: h */
    private static final Pattern f54537h;

    /* renamed from: i */
    @Nullable
    private static HashMap<String, String> f54538i;

    /* renamed from: j */
    private static final String[] f54539j;

    /* renamed from: k */
    private static final String[] f54540k;

    /* renamed from: l */
    private static final int[] f54541l;

    /* renamed from: m */
    private static final int[] f54542m;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f54530a = i2;
        String str = Build.DEVICE;
        f54531b = str;
        String str2 = Build.MANUFACTURER;
        f54532c = str2;
        String str3 = Build.MODEL;
        f54533d = str3;
        StringBuilder m29z = C0000a.m29z(str, ", ", str3, ", ", str2);
        m29z.append(", ");
        m29z.append(i2);
        f54534e = m29z.toString();
        f54535f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f54536g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f54537h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f54539j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f54540k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f54541l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f54542m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, C4632R.styleable.AppCompatTheme_windowActionModeOverlay, 126, C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, C4632R.styleable.AppCompatTheme_textColorSearchUrl, C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 97, C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, C4632R.styleable.AppCompatTheme_tooltipFrameBackground, C4632R.styleable.AppCompatTheme_viewInflaterClass, 125, C4632R.styleable.AppCompatTheme_windowFixedWidthMajor, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, 221, 218, 211, 212, C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall, C4632R.styleable.AppCompatTheme_textColorAlertDialogListItem, C4632R.styleable.AppCompatTheme_textAppearanceListItem, 96, C4632R.styleable.AppCompatTheme_windowActionBar, C4632R.styleable.AppCompatTheme_tooltipForegroundColor, 123, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, C4632R.styleable.AppCompatTheme_windowActionBarOverlay, C4632R.styleable.AppCompatTheme_toolbarStyle, C4632R.styleable.AppCompatTheme_windowFixedHeightMajor, 127, C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: a */
    public static long m28096a(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: a */
    public static <T> T m28101a(@Nullable T t) {
        return t;
    }

    /* renamed from: a */
    public static boolean m28112a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m28116b(int i2) {
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

    /* renamed from: b */
    public static Handler m28120b() {
        return m28121b((Handler.Callback) null);
    }

    /* renamed from: c */
    public static int m28125c(int i2) {
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

    /* renamed from: c */
    public static Looper m28127c() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: d */
    public static String m28130d(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m24832b = C5114ga.m24832b(str);
        int i2 = 0;
        String str2 = m24832b.split("-", 2)[0];
        if (f54538i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f54539j.length);
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
                String[] strArr = f54539j;
                if (i3 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i3], strArr[i3 + 1]);
                i3 += 2;
            }
            f54538i = hashMap;
        }
        String str4 = f54538i.get(str2);
        if (str4 != null) {
            StringBuilder m26356a = l60.m26356a(str4);
            m26356a.append(m24832b.substring(str2.length()));
            m24832b = m26356a.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return m24832b;
        }
        while (true) {
            String[] strArr2 = f54540k;
            if (i2 >= strArr2.length) {
                return m24832b;
            }
            if (m24832b.startsWith(strArr2[i2])) {
                return strArr2[i2 + 1] + m24832b.substring(strArr2[i2].length());
            }
            i2 += 2;
        }
    }

    @Nullable
    /* renamed from: e */
    public static String m28133e(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) == '%') {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        int i5 = length - (i3 * 2);
        StringBuilder sb = new StringBuilder(i5);
        Matcher matcher = f54536g.matcher(str);
        while (i3 > 0 && matcher.find()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            char parseInt = (char) Integer.parseInt(group, 16);
            sb.append((CharSequence) str, i2, matcher.start());
            sb.append(parseInt);
            i2 = matcher.end();
            i3--;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        if (sb.length() != i5) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static boolean m28134e(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    /* renamed from: a */
    public static Object[] m28113a(int i2, Object[] objArr) {
        C5220ia.m25473a(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    /* renamed from: b */
    public static Handler m28121b(@Nullable Handler.Callback callback) {
        return new Handler(m28127c(), callback);
    }

    /* renamed from: c */
    public static ExecutorService m28128c(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.vp1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m28105a;
                m28105a = s91.m28105a(str, runnable);
                return m28105a;
            }
        });
    }

    /* renamed from: a */
    public static Object[] m28114a(Object[] objArr, int i2) {
        C5220ia.m25473a(i2 <= objArr.length);
        return Arrays.copyOfRange(objArr, 1, i2);
    }

    /* renamed from: b */
    public static byte[] m28124b(String str) {
        return str.getBytes(C5285jh.f51608c);
    }

    /* renamed from: c */
    public static Point m28126c(Context context) {
        String str;
        DisplayManager displayManager;
        int i2 = f54530a;
        String str2 = null;
        Display display = (i2 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m28131d(context)) {
            if (i2 < 28) {
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    str = (String) cls.getMethod("get", String.class).invoke(cls, "sys.display-size");
                } catch (Exception e2) {
                    d90.m23838a("Util", "Failed to read system property sys.display-size", e2);
                }
            } else {
                try {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    str = (String) cls2.getMethod("get", String.class).invoke(cls2, "vendor.display-size");
                } catch (Exception e3) {
                    d90.m23838a("Util", "Failed to read system property vendor.display-size", e3);
                }
            }
            str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    String[] split = str2.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                d90.m23839b("Util", "Invalid display size: " + str2);
            }
            if ("Sony".equals(f54532c) && f54533d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i3 = f54530a;
        if (i3 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        if (i3 >= 17) {
            display.getRealSize(point);
            return point;
        }
        display.getSize(point);
        return point;
    }

    /* renamed from: b */
    public static int m28118b(long[] jArr, long j2, boolean z) {
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
            i2 = binarySearch + 1;
        }
        return z ? Math.max(0, i2) : i2;
    }

    /* renamed from: a */
    public static <T> T[] m28115a(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* renamed from: a */
    public static Handler m28098a() {
        return m28099a((Handler.Callback) null);
    }

    /* renamed from: b */
    public static long m28119b(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    /* renamed from: a */
    public static Handler m28099a(@Nullable Handler.Callback callback) {
        return new Handler((Looper) C5220ia.m25474b(Looper.myLooper()), callback);
    }

    /* renamed from: b */
    public static int m28117b(int i2, int i3) {
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

    /* renamed from: b */
    public static String m28122b(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                int length = networkCountryIso.length();
                int i2 = 0;
                while (i2 < length) {
                    char charAt = networkCountryIso.charAt(i2);
                    if (charAt >= 'a' && charAt <= 'z') {
                        char[] charArray = networkCountryIso.toCharArray();
                        while (i2 < length) {
                            char c2 = charArray[i2];
                            if (c2 >= 'a' && c2 <= 'z') {
                                charArray[i2] = (char) (c2 ^ ' ');
                            }
                            i2++;
                        }
                        return String.valueOf(charArray);
                    }
                    i2++;
                }
                return networkCountryIso;
            }
        }
        String country = Locale.getDefault().getCountry();
        int length2 = country.length();
        int i3 = 0;
        while (i3 < length2) {
            char charAt2 = country.charAt(i3);
            if (charAt2 >= 'a' && charAt2 <= 'z') {
                char[] charArray2 = country.toCharArray();
                while (i3 < length2) {
                    char c3 = charArray2[i3];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray2[i3] = (char) (c3 ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray2);
            }
            i3++;
        }
        return country;
    }

    /* renamed from: a */
    public static Handler m28100a(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: a */
    public static void m28106a(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Thread m28105a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: a */
    public static void m28107a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m28110a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static String m28102a(Locale locale) {
        if (f54530a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    /* renamed from: a */
    public static String m28103a(byte[] bArr) {
        return new String(bArr, C5285jh.f51608c);
    }

    /* renamed from: a */
    public static String m28104a(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, C5285jh.f51608c);
    }

    /* renamed from: d */
    public static boolean m28131d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: a */
    public static int m28087a(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    /* renamed from: a */
    public static float m28085a(float f2) {
        return Math.max(0.0f, Math.min(f2, 0.95f));
    }

    /* renamed from: d */
    public static String m28129d(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return CoreConstants.Transport.UNKNOWN;
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? C0000a.m8e("custom (", i2, ")") : "?";
        }
    }

    /* renamed from: a */
    public static int m28094a(int[] iArr, int i2, boolean z, boolean z2) {
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

    /* renamed from: d */
    public static String[] m28132d() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = f54530a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{m28102a(configuration.locale)};
        for (int i2 = 0; i2 < split.length; i2++) {
            split[i2] = m28130d(split[i2]);
        }
        return split;
    }

    /* renamed from: a */
    public static int m28092a(e90 e90Var, long j2) {
        int m24045a = e90Var.m24045a() - 1;
        int i2 = 0;
        while (i2 <= m24045a) {
            int i3 = (i2 + m24045a) >>> 1;
            if (e90Var.m24046a(i3) < j2) {
                i2 = i3 + 1;
            } else {
                m24045a = i3 - 1;
            }
        }
        int i4 = m24045a + 1;
        if (i4 < e90Var.m24045a() && e90Var.m24046a(i4) == j2) {
            return i4;
        }
        if (m24045a == -1) {
            return 0;
        }
        return m24045a;
    }

    /* renamed from: a */
    public static int m28095a(long[] jArr, long j2, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j2);
        return z ? binarySearch - 1 : binarySearch;
    }

    /* renamed from: a */
    public static long m28097a(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return (j3 / j4) * j2;
        }
        return (long) (j2 * (j3 / j4));
    }

    /* renamed from: a */
    public static void m28108a(long[] jArr, long j2) {
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
            return;
        }
        double d = 1000000 / j2;
        while (i2 < jArr.length) {
            jArr[i2] = (long) (jArr[i2] * d);
            i2++;
        }
    }

    /* renamed from: a */
    public static int m28086a(int i2) {
        if (i2 == 12) {
            return f54530a >= 32 ? 743676 : 0;
        }
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
                int i3 = f54530a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    @RequiresApi
    /* renamed from: a */
    public static int m28090a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: a */
    public static int m28091a(Uri uri, @Nullable String str) {
        int i2;
        if (str != null) {
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
        String scheme = uri.getScheme();
        if (scheme != null && C5114ga.m24831a(scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String m24832b = C5114ga.m24832b(lastPathSegment.substring(lastIndexOf + 1));
            Objects.requireNonNull(m24832b);
            switch (m24832b.hashCode()) {
                case 104579:
                    if (m24832b.equals("ism")) {
                        break;
                    }
                    break;
                case 108321:
                    if (m24832b.equals("mpd")) {
                        break;
                    }
                    break;
                case 3242057:
                    if (m24832b.equals("isml")) {
                        break;
                    }
                    break;
                case 3299913:
                    if (m24832b.equals("m3u8")) {
                        break;
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
                */
            /*
                Method dump skipped, instructions count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.s91.m28091a(android.net.Uri, java.lang.String):int");
        }

        /* renamed from: a */
        public static int m28089a(int i2, byte[] bArr) {
            int i3 = -1;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 = f54541l[((i3 >>> 24) ^ (bArr[i4] & 255)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i3 << 8);
            }
            return i3;
        }

        /* renamed from: a */
        public static int m28088a(int i2, int i3, byte[] bArr) {
            int i4 = 0;
            while (i2 < i3) {
                i4 = f54542m[i4 ^ (bArr[i2] & 255)];
                i2++;
            }
            return i4;
        }

        /* renamed from: a */
        public static boolean m28111a(ap0 ap0Var, ap0 ap0Var2, @Nullable Inflater inflater) {
            if (ap0Var.m22579a() <= 0) {
                return false;
            }
            if (ap0Var2.m22584b() < ap0Var.m22579a()) {
                ap0Var2.m22581a(ap0Var.m22579a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(ap0Var.m22587c(), ap0Var.m22588d(), ap0Var.m22579a());
            int i2 = 0;
            while (true) {
                try {
                    i2 += inflater.inflate(ap0Var2.m22587c(), i2, ap0Var2.m22584b() - i2);
                    if (inflater.finished()) {
                        ap0Var2.m22589d(i2);
                        inflater.reset();
                        return true;
                    }
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i2 == ap0Var2.m22584b()) {
                        ap0Var2.m22581a(ap0Var2.m22584b() * 2);
                    }
                } catch (DataFormatException unused) {
                    return false;
                } finally {
                    inflater.reset();
                }
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m28109a(SQLiteDatabase sQLiteDatabase, String str) {
            return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
        }

        /* renamed from: a */
        public static int m28093a(@Nullable String str) {
            String[] split;
            int length;
            if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
                return 0;
            }
            String str2 = split[length - 1];
            boolean z = length >= 3 && "neg".equals(split[length - 2]);
            try {
                Objects.requireNonNull(str2);
                int parseInt = Integer.parseInt(str2);
                return z ? -parseInt : parseInt;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
    }
