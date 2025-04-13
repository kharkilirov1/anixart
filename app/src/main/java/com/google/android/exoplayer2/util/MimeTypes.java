package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Ascii;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class MimeTypes {

    /* renamed from: a */
    public static final ArrayList<CustomMimeType> f14654a = new ArrayList<>();

    /* renamed from: b */
    public static final Pattern f14655b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class CustomMimeType {
    }

    @VisibleForTesting
    public static final class Mp4aObjectType {

        /* renamed from: a */
        public final int f14656a;

        /* renamed from: b */
        public final int f14657b;

        public Mp4aObjectType(int i2, int i3) {
            this.f14656a = i2;
            this.f14657b = i3;
        }

        /* renamed from: a */
        public int m7608a() {
            int i2 = this.f14657b;
            if (i2 == 2) {
                return 10;
            }
            if (i2 == 5) {
                return 11;
            }
            if (i2 == 29) {
                return 12;
            }
            if (i2 == 42) {
                return 16;
            }
            if (i2 != 22) {
                return i2 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* renamed from: a */
    public static boolean m7593a(@Nullable String str, @Nullable String str2) {
        Mp4aObjectType m7599g;
        int m7608a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (m7599g = m7599g(str2)) != null && (m7608a = m7599g.m7608a()) != 0 && m7608a != 16) {
                }
                break;
        }
        return false;
    }

    @Nullable
    /* renamed from: b */
    public static String m7594b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.m7727Z(str)) {
            String m7597e = m7597e(str2);
            if (m7597e != null && m7603k(m7597e)) {
                return m7597e;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static String m7595c(@Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] m7727Z = Util.m7727Z(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : m7727Z) {
            if (str2.equals(m7597e(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: d */
    public static int m7596d(String str, @Nullable String str2) {
        Mp4aObjectType m7599g;
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (m7599g = m7599g(str2)) == null) {
                    return 0;
                }
                return m7599g.m7608a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    /* renamed from: e */
    public static String m7597e(@Nullable String str) {
        Mp4aObjectType m7599g;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String m11123c = Ascii.m11123c(str.trim());
        if (m11123c.startsWith("avc1") || m11123c.startsWith("avc3")) {
            return "video/avc";
        }
        if (m11123c.startsWith("hev1") || m11123c.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (m11123c.startsWith("dvav") || m11123c.startsWith("dva1") || m11123c.startsWith("dvhe") || m11123c.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (m11123c.startsWith("av01")) {
            return "video/av01";
        }
        if (m11123c.startsWith("vp9") || m11123c.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (m11123c.startsWith("vp8") || m11123c.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (m11123c.startsWith("mp4a")) {
            if (m11123c.startsWith("mp4a.") && (m7599g = m7599g(m11123c)) != null) {
                str2 = m7598f(m7599g.f14656a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (m11123c.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (m11123c.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (m11123c.startsWith("ac-3") || m11123c.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (m11123c.startsWith("ec-3") || m11123c.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (m11123c.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (m11123c.startsWith("ac-4") || m11123c.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (m11123c.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (m11123c.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (m11123c.startsWith("dtsh") || m11123c.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (m11123c.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (m11123c.startsWith("opus")) {
            return "audio/opus";
        }
        if (m11123c.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (m11123c.startsWith("flac")) {
            return "audio/flac";
        }
        if (m11123c.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (m11123c.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (m11123c.contains("cea708")) {
            return "application/cea-708";
        }
        if (m11123c.contains("eia608") || m11123c.contains("cea608")) {
            return "application/cea-608";
        }
        int size = f14654a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull(f14654a.get(i2));
            if (m11123c.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public static String m7598f(int i2) {
        if (i2 == 32) {
            return "video/mp4v-es";
        }
        if (i2 == 33) {
            return "video/avc";
        }
        if (i2 == 35) {
            return "video/hevc";
        }
        if (i2 == 64) {
            return "audio/mp4a-latm";
        }
        if (i2 == 163) {
            return "video/wvc1";
        }
        if (i2 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i2 == 165) {
            return "audio/ac3";
        }
        if (i2 == 166) {
            return "audio/eac3";
        }
        switch (i2) {
            case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case C4632R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case C4632R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case 100:
            case 101:
                return "video/mpeg2";
            case C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case C4632R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return "audio/mp4a-latm";
            case C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
            case C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return "audio/mpeg";
            case C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return "video/mpeg";
            default:
                switch (i2) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: g */
    public static Mp4aObjectType m7599g(String str) {
        Matcher matcher = f14655b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        String group2 = matcher.group(2);
        try {
            return new Mp4aObjectType(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: h */
    public static String m7600h(@Nullable String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: i */
    public static int m7601i(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m7603k(str)) {
            return 1;
        }
        if (m7607o(str)) {
            return 2;
        }
        if (m7606n(str)) {
            return 3;
        }
        if (m7604l(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f14654a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull(f14654a.get(i2));
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    @Nullable
    /* renamed from: j */
    public static String m7602j(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.m7727Z(str)) {
            String m7597e = m7597e(str2);
            if (m7597e != null && m7607o(m7597e)) {
                return m7597e;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m7603k(@Nullable String str) {
        return "audio".equals(m7600h(str));
    }

    /* renamed from: l */
    public static boolean m7604l(@Nullable String str) {
        return "image".equals(m7600h(str));
    }

    /* renamed from: m */
    public static boolean m7605m(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    /* renamed from: n */
    public static boolean m7606n(@Nullable String str) {
        return "text".equals(m7600h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: o */
    public static boolean m7607o(@Nullable String str) {
        return "video".equals(m7600h(str));
    }
}
