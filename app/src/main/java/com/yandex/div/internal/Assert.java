package com.yandex.div.internal;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class Assert {

    /* renamed from: a */
    public static final /* synthetic */ int f33709a = 0;

    /* renamed from: a */
    public static void m17297a(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                m17299c(str, obj, obj2);
                return;
            }
            if (str == null) {
                str = "";
            }
            new ComparisonFailure(str, (String) obj, (String) obj2);
        }
    }

    /* renamed from: b */
    public static void m17298b() {
        Looper mainLooper = Looper.getMainLooper();
        Looper myLooper = Looper.myLooper();
        if (mainLooper == myLooper) {
            return;
        }
        Objects.toString(mainLooper);
        Objects.toString(myLooper);
    }

    /* renamed from: c */
    public static String m17299c(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = C0000a.m14k(str, " ");
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (!valueOf.equals(valueOf2)) {
            StringBuilder m29z = C0000a.m29z(str2, "expected:<", valueOf, "> but was:<", valueOf2);
            m29z.append(">");
            return m29z.toString();
        }
        StringBuilder m27x = C0000a.m27x(str2, "expected: ");
        m27x.append(m17300d(obj, valueOf));
        m27x.append(" but was: ");
        m27x.append(m17300d(obj2, valueOf2));
        return m27x.toString();
    }

    /* renamed from: d */
    public static String m17300d(@Nullable Object obj, @Nullable String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + "<" + str + ">";
    }
}
