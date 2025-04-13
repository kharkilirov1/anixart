package com.google.android.exoplayer2.text.webvtt;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.SpanUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class WebvttCueParser {

    /* renamed from: a */
    public static final Pattern f13824a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f13825b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map<String, Integer> f13826c;

    /* renamed from: d */
    public static final Map<String, Integer> f13827d;

    public static class Element {

        /* renamed from: a */
        public final StartTag f13828a;

        /* renamed from: b */
        public final int f13829b;

        public Element(StartTag startTag, int i2, C11321 c11321) {
            this.f13828a = startTag;
            this.f13829b = i2;
        }
    }

    public static final class StartTag {

        /* renamed from: a */
        public final String f13830a;

        /* renamed from: b */
        public final int f13831b;

        /* renamed from: c */
        public final String f13832c;

        /* renamed from: d */
        public final Set<String> f13833d;

        public StartTag(String str, int i2, String str2, Set<String> set) {
            this.f13831b = i2;
            this.f13830a = str;
            this.f13832c = str2;
            this.f13833d = set;
        }
    }

    public static final class StyleMatch implements Comparable<StyleMatch> {

        /* renamed from: b */
        public final int f13834b;

        /* renamed from: c */
        public final WebvttCssStyle f13835c;

        public StyleMatch(int i2, WebvttCssStyle webvttCssStyle) {
            this.f13834b = i2;
            this.f13835c = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public int compareTo(StyleMatch styleMatch) {
            return Integer.compare(this.f13834b, styleMatch.f13834b);
        }
    }

    public static final class WebvttCueInfoBuilder {

        /* renamed from: c */
        public CharSequence f13838c;

        /* renamed from: a */
        public long f13836a = 0;

        /* renamed from: b */
        public long f13837b = 0;

        /* renamed from: d */
        public int f13839d = 2;

        /* renamed from: e */
        public float f13840e = -3.4028235E38f;

        /* renamed from: f */
        public int f13841f = 1;

        /* renamed from: g */
        public int f13842g = 0;

        /* renamed from: h */
        public float f13843h = -3.4028235E38f;

        /* renamed from: i */
        public int f13844i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f13845j = 1.0f;

        /* renamed from: k */
        public int f13846k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0074, code lost:
        
            if (r6 == 0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.google.android.exoplayer2.text.Cue.Builder m7282a() {
            /*
                Method dump skipped, instructions count: 183
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder.m7282a():com.google.android.exoplayer2.text.Cue$Builder");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f13826c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f13827d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static void m7274a(@Nullable String str, StartTag startTag, List<Element> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        char c2;
        int i2 = startTag.f13831b;
        int length = spannableStringBuilder.length();
        String str2 = startTag.f13830a;
        Objects.requireNonNull(str2);
        int hashCode = str2.hashCode();
        int i3 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c2 = 3;
            }
            c2 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c2 = 6;
            }
            c2 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c2 = 7;
            }
            c2 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c2 = 5;
            }
            c2 = 65535;
        } else {
            if (str2.equals("u")) {
                c2 = 4;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                for (String str3 : startTag.f13833d) {
                    Map<String, Integer> map = f13826c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i2, length, 33);
                    } else {
                        Map<String, Integer> map2 = f13827d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 7:
                int m7276c = m7276c(list2, str, startTag);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C1133a.f13853c);
                int i4 = startTag.f13831b;
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList.size()) {
                    if ("rt".equals(((Element) arrayList.get(i5)).f13828a.f13830a)) {
                        Element element = (Element) arrayList.get(i5);
                        int m7276c2 = m7276c(list2, str, element.f13828a);
                        if (m7276c2 == i3) {
                            m7276c2 = m7276c != i3 ? m7276c : 1;
                        }
                        int i7 = element.f13828a.f13831b - i6;
                        int i8 = element.f13829b - i6;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i7, i8);
                        spannableStringBuilder.delete(i7, i8);
                        spannableStringBuilder.setSpan(new RubySpan(subSequence.toString(), m7276c2), i4, i7, 33);
                        i6 = subSequence.length() + i6;
                        i4 = i7;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            default:
                return;
        }
        List<StyleMatch> m7275b = m7275b(list2, str, startTag);
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) m7275b;
            if (i9 >= arrayList2.size()) {
                return;
            }
            WebvttCssStyle webvttCssStyle = ((StyleMatch) arrayList2.get(i9)).f13835c;
            if (webvttCssStyle != null) {
                if (webvttCssStyle.m7273a() != -1) {
                    SpanUtil.m7230a(spannableStringBuilder, new StyleSpan(webvttCssStyle.m7273a()), i2, length, 33);
                }
                if (webvttCssStyle.f13813j == 1) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, length, 33);
                }
                if (webvttCssStyle.f13814k == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (webvttCssStyle.f13810g) {
                    if (!webvttCssStyle.f13810g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    SpanUtil.m7230a(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.f13809f), i2, length, 33);
                }
                if (webvttCssStyle.f13812i) {
                    if (!webvttCssStyle.f13812i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    SpanUtil.m7230a(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.f13811h), i2, length, 33);
                }
                if (webvttCssStyle.f13808e != null) {
                    SpanUtil.m7230a(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.f13808e), i2, length, 33);
                }
                int i10 = webvttCssStyle.f13817n;
                if (i10 == 1) {
                    SpanUtil.m7230a(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.f13818o, true), i2, length, 33);
                } else if (i10 == 2) {
                    SpanUtil.m7230a(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.f13818o), i2, length, 33);
                } else if (i10 == 3) {
                    SpanUtil.m7230a(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.f13818o / 100.0f), i2, length, 33);
                }
                if (webvttCssStyle.f13820q) {
                    spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i2, length, 33);
                }
            }
            i9++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static List<StyleMatch> m7275b(List<WebvttCssStyle> list, @Nullable String str, StartTag startTag) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            WebvttCssStyle webvttCssStyle = list.get(i2);
            String str2 = startTag.f13830a;
            Set<String> set = startTag.f13833d;
            String str3 = startTag.f13832c;
            if (webvttCssStyle.f13804a.isEmpty() && webvttCssStyle.f13805b.isEmpty() && webvttCssStyle.f13806c.isEmpty() && webvttCssStyle.f13807d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int m7272b = WebvttCssStyle.m7272b(WebvttCssStyle.m7272b(WebvttCssStyle.m7272b(0, webvttCssStyle.f13804a, str, 1073741824), webvttCssStyle.f13805b, str2, 2), webvttCssStyle.f13807d, str3, 4);
                size = (m7272b == -1 || !set.containsAll(webvttCssStyle.f13806c)) ? 0 : m7272b + (webvttCssStyle.f13806c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new StyleMatch(size, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static int m7276c(List<WebvttCssStyle> list, @Nullable String str, StartTag startTag) {
        List<StyleMatch> m7275b = m7275b(list, str, startTag);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) m7275b;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            int i3 = ((StyleMatch) arrayList.get(i2)).f13835c.f13819p;
            if (i3 != -1) {
                return i3;
            }
            i2++;
        }
    }

    @Nullable
    /* renamed from: d */
    public static WebvttCueInfo m7277d(@Nullable String str, Matcher matcher, ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            webvttCueInfoBuilder.f13836a = WebvttParserUtil.m7285c(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            webvttCueInfoBuilder.f13837b = WebvttParserUtil.m7285c(group2);
            String group3 = matcher.group(3);
            Objects.requireNonNull(group3);
            m7278e(group3, webvttCueInfoBuilder);
            StringBuilder sb = new StringBuilder();
            String m7643g = parsableByteArray.m7643g();
            while (!TextUtils.isEmpty(m7643g)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(m7643g.trim());
                m7643g = parsableByteArray.m7643g();
            }
            webvttCueInfoBuilder.f13838c = m7279f(str, sb.toString(), list);
            return new WebvttCueInfo(webvttCueInfoBuilder.m7282a().m7178a(), webvttCueInfoBuilder.f13836a, webvttCueInfoBuilder.f13837b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    public static void m7278e(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        Matcher matcher = f13825b.matcher(str);
        while (matcher.find()) {
            int i2 = 1;
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            try {
                if ("line".equals(group)) {
                    m7280g(group2, webvttCueInfoBuilder);
                } else if ("align".equals(group)) {
                    switch (group2) {
                        case "center":
                        case "middle":
                            i2 = 2;
                            break;
                        case "end":
                            i2 = 3;
                            break;
                        case "left":
                            i2 = 4;
                            break;
                        case "right":
                            i2 = 5;
                            break;
                        case "start":
                            break;
                        default:
                            Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid alignment value: ".concat(group2) : new String("Invalid alignment value: "));
                            i2 = 2;
                            break;
                    }
                    webvttCueInfoBuilder.f13839d = i2;
                } else if ("position".equals(group)) {
                    m7281h(group2, webvttCueInfoBuilder);
                } else if ("size".equals(group)) {
                    webvttCueInfoBuilder.f13845j = WebvttParserUtil.m7284b(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i2 = 2;
                    } else if (!group2.equals("rl")) {
                        Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid 'vertical' value: ".concat(group2) : new String("Invalid 'vertical' value: "));
                        i2 = Integer.MIN_VALUE;
                    }
                    webvttCueInfoBuilder.f13846k = i2;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    Log.w("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    public static SpannedString m7279f(@Nullable String str, String str2, List<WebvttCssStyle> list) {
        String substring;
        char c2;
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String str3 = "";
            if (i3 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m7274a(str, (StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m7274a(str, new StartTag("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i3);
            if (charAt == '&') {
                i3++;
                int indexOf = str2.indexOf(59, i3);
                int indexOf2 = str2.indexOf(32, i3);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i3, indexOf);
                    Objects.requireNonNull(substring);
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(substring.length() + 33);
                            sb.append("ignoring unsupported entity: '&");
                            sb.append(substring);
                            sb.append(";'");
                            Log.w("WebvttCueParser", sb.toString());
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i3 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i3++;
            } else {
                int i4 = i3 + 1;
                if (i4 < str2.length()) {
                    boolean z2 = str2.charAt(i4) == '/';
                    int indexOf3 = str2.indexOf(62, i4);
                    i4 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i5 = i4 - 2;
                    boolean z3 = str2.charAt(i5) == '/';
                    int i6 = i3 + (z2 ? 2 : 1);
                    if (!z3) {
                        i5 = i4 - 1;
                    }
                    String substring2 = str2.substring(i6, i5);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        Assertions.m7513a(!trim.isEmpty());
                        int i7 = Util.f14736a;
                        String str4 = trim.split("[ \\.]", 2)[i2];
                        Objects.requireNonNull(str4);
                        switch (str4.hashCode()) {
                            case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                if (str4.equals("b")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                if (str4.equals("c")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                                if (str4.equals("i")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                if (str4.equals("u")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                if (str4.equals("v")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3650:
                                if (str4.equals("rt")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3314158:
                                if (str4.equals("lang")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3511770:
                                if (str4.equals("ruby")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                        if (z) {
                            if (z2) {
                                while (!arrayDeque.isEmpty()) {
                                    StartTag startTag = (StartTag) arrayDeque.pop();
                                    m7274a(str, startTag, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new Element(startTag, spannableStringBuilder.length(), null));
                                    }
                                    if (startTag.f13830a.equals(str4)) {
                                    }
                                }
                            } else if (!z3) {
                                int length = spannableStringBuilder.length();
                                String trim2 = substring2.trim();
                                Assertions.m7513a(!trim2.isEmpty());
                                int indexOf4 = trim2.indexOf(" ");
                                if (indexOf4 != -1) {
                                    str3 = trim2.substring(indexOf4).trim();
                                    trim2 = trim2.substring(i2, indexOf4);
                                }
                                String[] m7725X = Util.m7725X(trim2, "\\.");
                                String str5 = m7725X[i2];
                                HashSet hashSet = new HashSet();
                                for (int i8 = 1; i8 < m7725X.length; i8++) {
                                    hashSet.add(m7725X[i8]);
                                }
                                arrayDeque.push(new StartTag(str5, length, str3, hashSet));
                            }
                        }
                    }
                    i3 = i4;
                }
                i3 = i4;
            }
            i2 = 0;
        }
    }

    /* renamed from: g */
    public static void m7280g(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        String substring;
        int i2;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            Objects.requireNonNull(substring);
            i2 = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i2 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i2 = 0;
                    break;
                default:
                    Log.w("WebvttCueParser", substring.length() != 0 ? "Invalid anchor value: ".concat(substring) : new String("Invalid anchor value: "));
                    i2 = Integer.MIN_VALUE;
                    break;
            }
            webvttCueInfoBuilder.f13842g = i2;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.f13840e = WebvttParserUtil.m7284b(str);
            webvttCueInfoBuilder.f13841f = 0;
        } else {
            webvttCueInfoBuilder.f13840e = Integer.parseInt(str);
            webvttCueInfoBuilder.f13841f = 1;
        }
    }

    /* renamed from: h */
    public static void m7281h(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        String substring;
        int i2;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            Objects.requireNonNull(substring);
            i2 = 2;
            switch (substring) {
                case "line-left":
                case "start":
                    i2 = 0;
                    break;
                case "center":
                case "middle":
                    i2 = 1;
                    break;
                case "line-right":
                case "end":
                    break;
                default:
                    Log.w("WebvttCueParser", substring.length() != 0 ? "Invalid anchor value: ".concat(substring) : new String("Invalid anchor value: "));
                    i2 = Integer.MIN_VALUE;
                    break;
            }
            webvttCueInfoBuilder.f13844i = i2;
            str = str.substring(0, indexOf);
        }
        webvttCueInfoBuilder.f13843h = WebvttParserUtil.m7284b(str);
    }
}
