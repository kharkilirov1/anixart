package com.yandex.mobile.ads.impl;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class hc0 {

    /* renamed from: b */
    private static final Pattern f50899b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c */
    private static final Pattern f50900c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: d */
    public static final /* synthetic */ int f50901d = 0;

    /* renamed from: a */
    @NotNull
    private final String f50902a;

    /* renamed from: com.yandex.mobile.ads.impl.hc0$a */
    public static final class C5175a {
        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public static hc0 m25114a(@NotNull String str) {
            Intrinsics.m32179h(str, "<this>");
            Matcher matcher = hc0.f50899b.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(C0000a.m15l("No subtype found for: \"", str, JsonFactory.DEFAULT_QUOTE_CHAR).toString());
            }
            String group = matcher.group(1);
            Intrinsics.m32178g(group, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.m32178g(US, "US");
            Intrinsics.m32178g(group.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            Intrinsics.m32178g(group2, "typeSubtype.group(2)");
            Intrinsics.m32178g(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = hc0.f50900c.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder m26356a = l60.m26356a("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    Intrinsics.m32178g(substring, "this as java.lang.String).substring(startIndex)");
                    m26356a.append(substring);
                    m26356a.append("\" for: \"");
                    m26356a.append(str);
                    m26356a.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    throw new IllegalArgumentException(m26356a.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (StringsKt.m33898X(group4, "'", false, 2, null) && StringsKt.m33926x(group4, "'", false, 2, null) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.m32178g(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new hc0(str, (String[]) array);
        }

        @JvmStatic
        @JvmName
        @Nullable
        /* renamed from: b */
        public static hc0 m25115b(@NotNull String str) {
            Intrinsics.m32179h(str, "<this>");
            try {
                return m25114a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private hc0(String str) {
        this.f50902a = str;
    }

    public /* synthetic */ hc0(String str, String[] strArr) {
        this(str);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof hc0) && Intrinsics.m32174c(((hc0) obj).f50902a, this.f50902a);
    }

    public final int hashCode() {
        return this.f50902a.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f50902a;
    }
}
