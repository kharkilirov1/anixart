package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.hj */
/* loaded from: classes3.dex */
public final class C5188hj {

    /* renamed from: a */
    private static final Pattern f50939a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    private static final Pattern f50940b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    private static final Pattern f50941c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    private static final HashMap f50942d;

    static {
        HashMap hashMap = new HashMap();
        f50942d = hashMap;
        z90.m30076a(-984833, hashMap, "aliceblue", -332841, "antiquewhite", -16711681, "aqua", -8388652, "aquamarine");
        z90.m30076a(-983041, hashMap, "azure", -657956, "beige", -6972, "bisque", -16777216, "black");
        z90.m30076a(-5171, hashMap, "blanchedalmond", -16776961, "blue", -7722014, "blueviolet", -5952982, "brown");
        z90.m30076a(-2180985, hashMap, "burlywood", -10510688, "cadetblue", -8388864, "chartreuse", -2987746, "chocolate");
        z90.m30076a(-32944, hashMap, "coral", -10185235, "cornflowerblue", -1828, "cornsilk", -2354116, "crimson");
        z90.m30076a(-16711681, hashMap, "cyan", -16777077, "darkblue", -16741493, "darkcyan", -4684277, "darkgoldenrod");
        z90.m30076a(-5658199, hashMap, "darkgray", -16751616, "darkgreen", -5658199, "darkgrey", -4343957, "darkkhaki");
        z90.m30076a(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen", -29696, "darkorange", -6737204, "darkorchid");
        z90.m30076a(-7667712, hashMap, "darkred", -1468806, "darksalmon", -7357297, "darkseagreen", -12042869, "darkslateblue");
        z90.m30076a(-13676721, hashMap, "darkslategray", -13676721, "darkslategrey", -16724271, "darkturquoise", -7077677, "darkviolet");
        z90.m30076a(-60269, hashMap, "deeppink", -16728065, "deepskyblue", -9868951, "dimgray", -9868951, "dimgrey");
        z90.m30076a(-14774017, hashMap, "dodgerblue", -5103070, "firebrick", -1296, "floralwhite", -14513374, "forestgreen");
        z90.m30076a(-65281, hashMap, "fuchsia", -2302756, "gainsboro", -460545, "ghostwhite", -10496, "gold");
        z90.m30076a(-2448096, hashMap, "goldenrod", -8355712, "gray", -16744448, "green", -5374161, "greenyellow");
        z90.m30076a(-8355712, hashMap, "grey", -983056, "honeydew", -38476, "hotpink", -3318692, "indianred");
        z90.m30076a(-11861886, hashMap, "indigo", -16, "ivory", -989556, "khaki", -1644806, "lavender");
        z90.m30076a(-3851, hashMap, "lavenderblush", -8586240, "lawngreen", -1331, "lemonchiffon", -5383962, "lightblue");
        z90.m30076a(-1015680, hashMap, "lightcoral", -2031617, "lightcyan", -329006, "lightgoldenrodyellow", -2894893, "lightgray");
        z90.m30076a(-7278960, hashMap, "lightgreen", -2894893, "lightgrey", -18751, "lightpink", -24454, "lightsalmon");
        z90.m30076a(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue", -8943463, "lightslategray", -8943463, "lightslategrey");
        z90.m30076a(-5192482, hashMap, "lightsteelblue", -32, "lightyellow", -16711936, "lime", -13447886, "limegreen");
        z90.m30076a(-331546, hashMap, "linen", -65281, "magenta", -8388608, "maroon", -10039894, "mediumaquamarine");
        z90.m30076a(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid", -7114533, "mediumpurple", -12799119, "mediumseagreen");
        z90.m30076a(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen", -12004916, "mediumturquoise", -3730043, "mediumvioletred");
        z90.m30076a(-15132304, hashMap, "midnightblue", -655366, "mintcream", -6943, "mistyrose", -6987, "moccasin");
        z90.m30076a(-8531, hashMap, "navajowhite", -16777088, "navy", -133658, "oldlace", -8355840, "olive");
        z90.m30076a(-9728477, hashMap, "olivedrab", -23296, "orange", -47872, "orangered", -2461482, "orchid");
        z90.m30076a(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen", -5247250, "paleturquoise", -2396013, "palevioletred");
        z90.m30076a(-4139, hashMap, "papayawhip", -9543, "peachpuff", -3308225, "peru", -16181, "pink");
        z90.m30076a(-2252579, hashMap, "plum", -5185306, "powderblue", -8388480, "purple", -10079335, "rebeccapurple");
        z90.m30076a(-65536, hashMap, "red", -4419697, "rosybrown", -12490271, "royalblue", -7650029, "saddlebrown");
        z90.m30076a(-360334, hashMap, "salmon", -744352, "sandybrown", -13726889, "seagreen", -2578, "seashell");
        z90.m30076a(-6270419, hashMap, "sienna", -4144960, "silver", -7876885, "skyblue", -9807155, "slateblue");
        z90.m30076a(-9404272, hashMap, "slategray", -9404272, "slategrey", -1286, "snow", -16711809, "springgreen");
        z90.m30076a(-12156236, hashMap, "steelblue", -2968436, "tan", -16744320, "teal", -2572328, "thistle");
        z90.m30076a(-40121, hashMap, "tomato", 0, "transparent", -12525360, "turquoise", -1146130, "violet");
        z90.m30076a(-663885, hashMap, "wheat", -1, "white", -657931, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    @ColorInt
    /* renamed from: a */
    public static int m25212a(String str) {
        return m25213a(str, true);
    }

    @ColorInt
    /* renamed from: b */
    public static int m25214b(String str) {
        return m25213a(str, false);
    }

    @ColorInt
    /* renamed from: a */
    private static int m25213a(String str, boolean z) {
        int parseInt;
        C5220ia.m25473a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f50941c : f50940b).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    String group = matcher.group(4);
                    Objects.requireNonNull(group);
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    Objects.requireNonNull(group2);
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                Objects.requireNonNull(group3);
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                Objects.requireNonNull(group4);
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                Objects.requireNonNull(group5);
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f50939a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                Objects.requireNonNull(group6);
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                Objects.requireNonNull(group7);
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                Objects.requireNonNull(group8);
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) f50942d.get(C5114ga.m24832b(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
