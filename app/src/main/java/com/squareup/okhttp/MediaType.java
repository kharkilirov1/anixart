package com.squareup.okhttp;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class MediaType {

    /* renamed from: b */
    public static final Pattern f24876b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c */
    public static final Pattern f24877c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f24878a;

    public MediaType(String str, String str2, String str3, String str4) {
        this.f24878a = str;
    }

    /* renamed from: a */
    public static MediaType m13921a(String str) {
        Matcher matcher = f24876b.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f24877c.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(C0000a.m14k("Multiple different charsets: ", str));
                }
                str2 = group3;
            }
        }
        return new MediaType(str, lowerCase, lowerCase2, str2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).f24878a.equals(this.f24878a);
    }

    public int hashCode() {
        return this.f24878a.hashCode();
    }

    public String toString() {
        return this.f24878a;
    }
}
