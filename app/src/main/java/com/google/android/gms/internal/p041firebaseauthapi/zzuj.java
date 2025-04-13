package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Locale;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzuj {
    /* renamed from: a */
    public static String m9431a() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        m9432b(sb, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            m9432b(sb, locale2);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m9432b(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }
}
