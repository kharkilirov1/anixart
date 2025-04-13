package com.yandex.mobile.ads.impl;

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
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.C5751sl;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class ui1 {

    /* renamed from: a */
    public static final Pattern f55509a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f55510b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f55511c;

    /* renamed from: d */
    private static final Map<String, Integer> f55512d;

    /* renamed from: com.yandex.mobile.ads.impl.ui1$a */
    public static class C5864a {

        /* renamed from: c */
        private static final Comparator<C5864a> f55513c = C4891by.f49019o;

        /* renamed from: a */
        private final C5865b f55514a;

        /* renamed from: b */
        private final int f55515b;

        public /* synthetic */ C5864a(C5865b c5865b, int i2, int i3) {
            this(c5865b, i2);
        }

        private C5864a(C5865b c5865b, int i2) {
            this.f55514a = c5865b;
            this.f55515b = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m29015a(C5864a c5864a, C5864a c5864a2) {
            return Integer.compare(c5864a.f55514a.f55517b, c5864a2.f55514a.f55517b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ui1$c */
    public static final class C5866c implements Comparable<C5866c> {

        /* renamed from: a */
        public final int f55520a;

        /* renamed from: b */
        public final si1 f55521b;

        public C5866c(int i2, si1 si1Var) {
            this.f55520a = i2;
            this.f55521b = si1Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C5866c c5866c) {
            return Integer.compare(this.f55520a, c5866c.f55520a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ui1$d */
    public static final class C5867d {

        /* renamed from: c */
        public CharSequence f55524c;

        /* renamed from: a */
        public long f55522a = 0;

        /* renamed from: b */
        public long f55523b = 0;

        /* renamed from: d */
        public int f55525d = 2;

        /* renamed from: e */
        public float f55526e = -3.4028235E38f;

        /* renamed from: f */
        public int f55527f = 1;

        /* renamed from: g */
        public int f55528g = 0;

        /* renamed from: h */
        public float f55529h = -3.4028235E38f;

        /* renamed from: i */
        public int f55530i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f55531j = 1.0f;

        /* renamed from: k */
        public int f55532k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0074, code lost:
        
            if (r8 == 0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.C5751sl.a m29022a() {
            /*
                r13 = this;
                float r0 = r13.f55529h
                r1 = 1056964608(0x3f000000, float:0.5)
                r2 = 0
                r3 = 5
                r4 = 4
                r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r6 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r7 == 0) goto L11
                goto L1e
            L11:
                int r0 = r13.f55525d
                if (r0 == r4) goto L1d
                if (r0 == r3) goto L1a
                r0 = 1056964608(0x3f000000, float:0.5)
                goto L1e
            L1a:
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L1e
            L1d:
                r0 = 0
            L1e:
                int r7 = r13.f55530i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r7 == r8) goto L28
                goto L37
            L28:
                int r7 = r13.f55525d
                if (r7 == r11) goto L36
                if (r7 == r9) goto L34
                if (r7 == r4) goto L36
                if (r7 == r3) goto L34
                r7 = 1
                goto L37
            L34:
                r7 = 2
                goto L37
            L36:
                r7 = 0
            L37:
                com.yandex.mobile.ads.impl.sl$a r8 = new com.yandex.mobile.ads.impl.sl$a
                r8.<init>()
                int r12 = r13.f55525d
                if (r12 == r11) goto L57
                if (r12 == r10) goto L54
                if (r12 == r9) goto L51
                if (r12 == r4) goto L57
                if (r12 == r3) goto L51
                java.lang.String r3 = "Unknown textAlignment: "
                java.lang.String r4 = "WebvttCueParser"
                com.yandex.mobile.ads.impl.c80.m23073a(r3, r12, r4)
                r3 = 0
                goto L59
            L51:
                android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L59
            L54:
                android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L59
            L57:
                android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            L59:
                com.yandex.mobile.ads.impl.sl$a r3 = r8.m28309b(r3)
                float r4 = r13.f55526e
                int r8 = r13.f55527f
                int r9 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r9 == 0) goto L70
                if (r8 != 0) goto L70
                int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r2 < 0) goto L76
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 <= 0) goto L70
                goto L76
            L70:
                if (r9 == 0) goto L74
                r5 = r4
                goto L78
            L74:
                if (r8 != 0) goto L78
            L76:
                r5 = 1065353216(0x3f800000, float:1.0)
            L78:
                com.yandex.mobile.ads.impl.sl$a r2 = r3.m28302a(r8, r5)
                int r3 = r13.f55528g
                com.yandex.mobile.ads.impl.sl$a r2 = r2.m28301a(r3)
                com.yandex.mobile.ads.impl.sl$a r2 = r2.m28307b(r0)
                com.yandex.mobile.ads.impl.sl$a r2 = r2.m28308b(r7)
                float r3 = r13.f55531j
                if (r7 == 0) goto Laa
                if (r7 == r11) goto L9d
                if (r7 != r10) goto L93
                goto Lac
            L93:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r7)
                r0.<init>(r1)
                throw r0
            L9d:
                r4 = 1073741824(0x40000000, float:2.0)
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 > 0) goto La6
                float r0 = r0 * r4
                goto Lac
            La6:
                float r6 = r6 - r0
                float r0 = r6 * r4
                goto Lac
            Laa:
                float r0 = r6 - r0
            Lac:
                float r0 = java.lang.Math.min(r3, r0)
                com.yandex.mobile.ads.impl.sl$a r0 = r2.m28316d(r0)
                int r1 = r13.f55532k
                com.yandex.mobile.ads.impl.sl$a r0 = r0.m28313c(r1)
                java.lang.CharSequence r1 = r13.f55524c
                if (r1 == 0) goto Lc1
                r0.m28304a(r1)
            Lc1:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ui1.C5867d.m29022a():com.yandex.mobile.ads.impl.sl$a");
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
        f55511c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f55512d = Collections.unmodifiableMap(hashMap2);
    }

    @Nullable
    /* renamed from: a */
    public static ti1 m29009a(ap0 ap0Var, ArrayList arrayList) {
        String m22597j = ap0Var.m22597j();
        if (m22597j == null) {
            return null;
        }
        Pattern pattern = f55509a;
        Matcher matcher = pattern.matcher(m22597j);
        if (matcher.matches()) {
            return m29010a(null, matcher, ap0Var, arrayList);
        }
        String m22597j2 = ap0Var.m22597j();
        if (m22597j2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(m22597j2);
        if (matcher2.matches()) {
            return m29010a(m22597j.trim(), matcher2, ap0Var, arrayList);
        }
        return null;
    }

    /* renamed from: b */
    private static void m29013b(String str, C5867d c5867d) {
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
                    ai1.m22527a("Invalid anchor value: ", substring, "WebvttCueParser");
                    i2 = Integer.MIN_VALUE;
                    break;
            }
            c5867d.f55528g = i2;
            str = str.substring(0, indexOf);
        }
        if (!str.endsWith("%")) {
            c5867d.f55526e = Integer.parseInt(str);
            c5867d.f55527f = 1;
            return;
        }
        int i3 = wi1.f56139a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        c5867d.f55526e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        c5867d.f55527f = 0;
    }

    /* renamed from: c */
    private static void m29014c(String str, C5867d c5867d) {
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
                    ai1.m22527a("Invalid anchor value: ", substring, "WebvttCueParser");
                    i2 = Integer.MIN_VALUE;
                    break;
            }
            c5867d.f55530i = i2;
            str = str.substring(0, indexOf);
        }
        int i3 = wi1.f56139a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        c5867d.f55529h = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    /* renamed from: a */
    public static C5751sl.a m29008a(String str) {
        C5867d c5867d = new C5867d();
        m29012a(str, c5867d);
        return c5867d.m29022a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.ui1$b */
    public static final class C5865b {

        /* renamed from: a */
        public final String f55516a;

        /* renamed from: b */
        public final int f55517b;

        /* renamed from: c */
        public final String f55518c;

        /* renamed from: d */
        public final Set<String> f55519d;

        private C5865b(String str, int i2, String str2, Set<String> set) {
            this.f55517b = i2;
            this.f55516a = str;
            this.f55518c = str2;
            this.f55519d = set;
        }

        /* renamed from: a */
        public static C5865b m29021a(int i2, String str) {
            String str2;
            String trim = str.trim();
            C5220ia.m25473a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            int i3 = s91.f54530a;
            String[] split = trim.split("\\.", -1);
            String str3 = split[0];
            HashSet hashSet = new HashSet();
            for (int i4 = 1; i4 < split.length; i4++) {
                hashSet.add(split[i4]);
            }
            return new C5865b(str3, i2, str2, hashSet);
        }

        /* renamed from: a */
        public static C5865b m29020a() {
            return new C5865b("", 0, "", Collections.emptySet());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: a */
    public static SpannedString m29007a(@Nullable String str, String str2, List<si1> list) {
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str2.length()) {
            char charAt = str2.charAt(i3);
            boolean z = true;
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
                            d90.m23842d("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i3 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
                i2 = 0;
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
                        C5220ia.m25473a(!trim.isEmpty());
                        int i7 = s91.f54530a;
                        String str3 = trim.split("[ \\.]", 2)[i2];
                        Objects.requireNonNull(str3);
                        switch (str3.hashCode()) {
                            case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                if (str3.equals("b")) {
                                    break;
                                }
                                break;
                            case C4632R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                if (str3.equals("c")) {
                                    break;
                                }
                                break;
                            case C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                                if (str3.equals("i")) {
                                    break;
                                }
                                break;
                            case C4632R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                if (str3.equals("u")) {
                                    break;
                                }
                                break;
                            case C4632R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                if (str3.equals("v")) {
                                    break;
                                }
                                break;
                            case 3650:
                                if (str3.equals("rt")) {
                                    break;
                                }
                                break;
                            case 3314158:
                                if (str3.equals("lang")) {
                                    break;
                                }
                                break;
                            case 3511770:
                                if (str3.equals("ruby")) {
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
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
                            Method dump skipped, instructions count: 586
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ui1.m29007a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
                    }

                    @Nullable
                    /* renamed from: a */
                    private static ti1 m29010a(@Nullable String str, Matcher matcher, ap0 ap0Var, ArrayList arrayList) {
                        C5867d c5867d = new C5867d();
                        try {
                            String group = matcher.group(1);
                            Objects.requireNonNull(group);
                            c5867d.f55522a = wi1.m29484a(group);
                            String group2 = matcher.group(2);
                            Objects.requireNonNull(group2);
                            c5867d.f55523b = wi1.m29484a(group2);
                            String group3 = matcher.group(3);
                            Objects.requireNonNull(group3);
                            m29012a(group3, c5867d);
                            StringBuilder sb = new StringBuilder();
                            String m22597j = ap0Var.m22597j();
                            while (!TextUtils.isEmpty(m22597j)) {
                                if (sb.length() > 0) {
                                    sb.append("\n");
                                }
                                sb.append(m22597j.trim());
                                m22597j = ap0Var.m22597j();
                            }
                            c5867d.f55524c = m29007a(str, sb.toString(), arrayList);
                            return new ti1(c5867d.m29022a().m28305a(), c5867d.f55522a, c5867d.f55523b);
                        } catch (NumberFormatException unused) {
                            StringBuilder m26356a = l60.m26356a("Skipping cue with bad header: ");
                            m26356a.append(matcher.group());
                            d90.m23842d("WebvttCueParser", m26356a.toString());
                            return null;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:77:0x007d, code lost:
                    
                        if (r4.equals("center") == false) goto L14;
                     */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* renamed from: a */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private static void m29012a(java.lang.String r10, com.yandex.mobile.ads.impl.ui1.C5867d r11) {
                        /*
                            Method dump skipped, instructions count: 370
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ui1.m29012a(java.lang.String, com.yandex.mobile.ads.impl.ui1$d):void");
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* renamed from: a */
                    private static void m29011a(SpannableStringBuilder spannableStringBuilder, C5865b c5865b, @Nullable String str, List list, List list2) {
                        char c2;
                        int i2;
                        ArrayList arrayList;
                        List list3 = list2;
                        int i3 = c5865b.f55517b;
                        int length = spannableStringBuilder.length();
                        String str2 = c5865b.f55516a;
                        Objects.requireNonNull(str2);
                        switch (str2.hashCode()) {
                            case 0:
                                if (str2.equals("")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                if (str2.equals("b")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                if (str2.equals("c")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                                if (str2.equals("i")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                if (str2.equals("u")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case C4632R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                if (str2.equals("v")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3314158:
                                if (str2.equals("lang")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3511770:
                                if (str2.equals("ruby")) {
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
                            case 5:
                            case 6:
                                break;
                            case 1:
                                spannableStringBuilder.setSpan(new StyleSpan(1), i3, length, 33);
                                break;
                            case 2:
                                for (String str3 : c5865b.f55519d) {
                                    Map<String, Integer> map = f55511c;
                                    if (map.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i3, length, 33);
                                    } else {
                                        Map<String, Integer> map2 = f55512d;
                                        if (map2.containsKey(str3)) {
                                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i3, length, 33);
                                        }
                                    }
                                }
                                break;
                            case 3:
                                spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
                                break;
                            case 4:
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
                                break;
                            case 7:
                                ArrayList arrayList2 = new ArrayList();
                                for (int i4 = 0; i4 < list2.size(); i4++) {
                                    si1 si1Var = (si1) list3.get(i4);
                                    int m28255a = si1Var.m28255a(str, c5865b.f55516a, c5865b.f55519d, c5865b.f55518c);
                                    if (m28255a > 0) {
                                        arrayList2.add(new C5866c(m28255a, si1Var));
                                    }
                                }
                                Collections.sort(arrayList2);
                                for (int i5 = 0; i5 < arrayList2.size() && ((C5866c) arrayList2.get(i5)).f55521b.m28272g() == -1; i5++) {
                                }
                                ArrayList arrayList3 = new ArrayList(list.size());
                                arrayList3.addAll(list);
                                Collections.sort(arrayList3, C5864a.f55513c);
                                int i6 = c5865b.f55517b;
                                int i7 = 0;
                                int i8 = 0;
                                while (i7 < arrayList3.size()) {
                                    if ("rt".equals(((C5864a) arrayList3.get(i7)).f55514a.f55516a)) {
                                        C5864a c5864a = (C5864a) arrayList3.get(i7);
                                        C5865b c5865b2 = c5864a.f55514a;
                                        ArrayList arrayList4 = new ArrayList();
                                        int i9 = 0;
                                        while (i9 < list2.size()) {
                                            si1 si1Var2 = (si1) list3.get(i9);
                                            ArrayList arrayList5 = arrayList3;
                                            int m28255a2 = si1Var2.m28255a(str, c5865b2.f55516a, c5865b2.f55519d, c5865b2.f55518c);
                                            if (m28255a2 > 0) {
                                                arrayList4.add(new C5866c(m28255a2, si1Var2));
                                            }
                                            i9++;
                                            list3 = list2;
                                            arrayList3 = arrayList5;
                                        }
                                        arrayList = arrayList3;
                                        Collections.sort(arrayList4);
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < arrayList4.size()) {
                                                si1 si1Var3 = ((C5866c) arrayList4.get(i10)).f55521b;
                                                if (si1Var3.m28272g() != -1) {
                                                    si1Var3.m28272g();
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        }
                                        int i11 = c5864a.f55514a.f55517b - i8;
                                        int i12 = c5864a.f55515b - i8;
                                        CharSequence subSequence = spannableStringBuilder.subSequence(i11, i12);
                                        spannableStringBuilder.delete(i11, i12);
                                        subSequence.toString();
                                        spannableStringBuilder.setSpan(new hy0(), i6, i11, 33);
                                        i8 += subSequence.length();
                                        i6 = i11;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                    i7++;
                                    list3 = list2;
                                    arrayList3 = arrayList;
                                }
                                break;
                            default:
                                return;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            si1 si1Var4 = (si1) list2.get(i13);
                            int m28255a3 = si1Var4.m28255a(str, c5865b.f55516a, c5865b.f55519d, c5865b.f55518c);
                            if (m28255a3 > 0) {
                                arrayList6.add(new C5866c(m28255a3, si1Var4));
                            }
                        }
                        Collections.sort(arrayList6);
                        for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                            si1 si1Var5 = ((C5866c) arrayList6.get(i14)).f55521b;
                            if (si1Var5 != null) {
                                if (si1Var5.m28273h() != -1) {
                                    j31.m25768a(spannableStringBuilder, new StyleSpan(si1Var5.m28273h()), i3, length);
                                }
                                if (si1Var5.m28276k()) {
                                    i2 = 33;
                                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i3, length, 33);
                                } else {
                                    i2 = 33;
                                }
                                if (si1Var5.m28277l()) {
                                    spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, i2);
                                }
                                if (si1Var5.m28275j()) {
                                    j31.m25768a(spannableStringBuilder, new ForegroundColorSpan(si1Var5.m28264c()), i3, length);
                                }
                                if (si1Var5.m28274i()) {
                                    j31.m25768a(spannableStringBuilder, new BackgroundColorSpan(si1Var5.m28254a()), i3, length);
                                }
                                if (si1Var5.m28267d() != null) {
                                    j31.m25768a(spannableStringBuilder, new TypefaceSpan(si1Var5.m28267d()), i3, length);
                                }
                                int m28271f = si1Var5.m28271f();
                                if (m28271f == 1) {
                                    j31.m25768a(spannableStringBuilder, new AbsoluteSizeSpan((int) si1Var5.m28270e(), true), i3, length);
                                } else if (m28271f == 2) {
                                    j31.m25768a(spannableStringBuilder, new RelativeSizeSpan(si1Var5.m28270e()), i3, length);
                                } else if (m28271f == 3) {
                                    j31.m25768a(spannableStringBuilder, new RelativeSizeSpan(si1Var5.m28270e() / 100.0f), i3, length);
                                }
                                if (si1Var5.m28263b()) {
                                    spannableStringBuilder.setSpan(new C5464my(), i3, length, 33);
                                }
                            }
                        }
                    }
                }
