package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class he0 {

    /* renamed from: a */
    private static final ArrayList<C5180a> f50917a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f50918b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: c */
    public static final /* synthetic */ int f50919c = 0;

    /* renamed from: com.yandex.mobile.ads.impl.he0$a */
    public static final class C5180a {
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.he0$b */
    public static final class C5181b {

        /* renamed from: a */
        public final int f50920a;

        public C5181b(int i2) {
            this.f50920a = i2;
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m25139a(int i2) {
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

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m25140a(@androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.he0.m25140a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m25141b(java.lang.String r9, @androidx.annotation.Nullable java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.he0.m25141b(java.lang.String, java.lang.String):int");
    }

    /* renamed from: c */
    public static boolean m25143c(@Nullable String str) {
        int indexOf;
        return "text".equals((str != null && (indexOf = str.indexOf(47)) != -1) ? str.substring(0, indexOf) : null) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: d */
    public static boolean m25144d(@Nullable String str) {
        int indexOf;
        return "video".equals((str == null || (indexOf = str.indexOf(47)) == -1) ? null : str.substring(0, indexOf));
    }

    /* renamed from: a */
    public static int m25138a(@Nullable String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m25142b(str)) {
            return 1;
        }
        if (m25144d(str)) {
            return 2;
        }
        if (m25143c(str)) {
            return 3;
        }
        if ("image".equals((str == null || (indexOf = str.indexOf(47)) == -1) ? null : str.substring(0, indexOf))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f50917a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull(f50917a.get(i2));
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m25142b(@Nullable String str) {
        int indexOf;
        return "audio".equals((str == null || (indexOf = str.indexOf(47)) == -1) ? null : str.substring(0, indexOf));
    }
}
