package com.google.android.exoplayer2.p009ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class SpannedToHtmlConverter {

    /* renamed from: a */
    public static final Pattern f14219a = Pattern.compile("(&#13;)?&#10;");

    public static class HtmlAndCss {

        /* renamed from: a */
        public final String f14220a;

        /* renamed from: b */
        public final Map<String, String> f14221b;

        public HtmlAndCss(String str, Map map, C11411 c11411) {
            this.f14220a = str;
            this.f14221b = map;
        }
    }

    public static final class SpanInfo {

        /* renamed from: a */
        public final int f14222a;

        /* renamed from: b */
        public final int f14223b;

        /* renamed from: c */
        public final String f14224c;

        /* renamed from: d */
        public final String f14225d;

        public SpanInfo(int i2, int i3, String str, String str2, C11411 c11411) {
            this.f14222a = i2;
            this.f14223b = i3;
            this.f14224c = str;
            this.f14225d = str2;
        }
    }

    public static final class Transition {

        /* renamed from: a */
        public final List<SpanInfo> f14226a = new ArrayList();

        /* renamed from: b */
        public final List<SpanInfo> f14227b = new ArrayList();
    }

    /* renamed from: a */
    public static String m7396a(CharSequence charSequence) {
        return f14219a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
