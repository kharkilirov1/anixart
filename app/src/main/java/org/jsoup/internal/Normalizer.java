package org.jsoup.internal;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class Normalizer {
    /* renamed from: a */
    public static String m34697a(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* renamed from: b */
    public static String m34698b(String str) {
        return m34697a(str).trim();
    }
}
