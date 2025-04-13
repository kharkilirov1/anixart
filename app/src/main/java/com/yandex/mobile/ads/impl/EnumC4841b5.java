package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.b5 */
/* loaded from: classes3.dex */
enum EnumC4841b5 {
    f48755a,
    f48756b,
    f48757c;


    /* renamed from: d */
    private static final HashMap f48758d;

    static {
        EnumC4841b5 enumC4841b5 = f48755a;
        EnumC4841b5 enumC4841b52 = f48756b;
        EnumC4841b5 enumC4841b53 = f48757c;
        HashMap hashMap = new HashMap();
        f48758d = hashMap;
        hashMap.put(m22719a("values_dimen_%s", enumC4841b5.name()), 48);
        hashMap.put(m22719a("values_dimen_%s_sw600dp", enumC4841b5.name()), 56);
        hashMap.put(m22719a("values_dimen_%s", enumC4841b52.name()), 15);
        hashMap.put(m22719a("values_dimen_%s_sw600dp", enumC4841b52.name()), 17);
        hashMap.put(m22719a("values_dimen_%s", enumC4841b53.name()), 19);
        hashMap.put(m22719a("values_dimen_%s_sw600dp", enumC4841b53.name()), 23);
    }

    EnumC4841b5() {
    }

    /* renamed from: a */
    public static String m22719a(String str, String str2) {
        return String.format(Locale.US, str, str2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }

    /* renamed from: a */
    public final int m22720a(Context context) {
        try {
            StringBuilder sb = new StringBuilder(name());
            if (Math.min(tg1.m28658c(context), tg1.m28656b(context)) >= 600) {
                sb.append("_");
                sb.append("sw600dp");
            }
            Integer num = (Integer) f48758d.get(m22719a("values_dimen_%s", sb.toString()));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            Integer num2 = (Integer) f48758d.get(m22719a("values_dimen_%s", name()));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }
}
