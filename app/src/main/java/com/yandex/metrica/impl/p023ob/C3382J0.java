package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.J0 */
/* loaded from: classes2.dex */
public final class C3382J0 {

    /* renamed from: a */
    private static final Set<Integer> f43167a;

    /* renamed from: b */
    private static final EnumSet<EnumC4067k1> f43168b;

    /* renamed from: c */
    private static final EnumSet<EnumC4067k1> f43169c;

    /* renamed from: d */
    private static final EnumSet<EnumC4067k1> f43170d;

    /* renamed from: e */
    private static final EnumSet<EnumC4067k1> f43171e;

    /* renamed from: f */
    private static final EnumSet<EnumC4067k1> f43172f;

    /* renamed from: g */
    private static final EnumSet<EnumC4067k1> f43173g;

    /* renamed from: h */
    private static final EnumSet<EnumC4067k1> f43174h;

    /* renamed from: i */
    public static final List<Integer> f43175i;

    /* renamed from: j */
    public static final List<Integer> f43176j;

    static {
        Integer[] numArr = {Integer.valueOf(EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.m20218b()), Integer.valueOf(EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.m20218b()), Integer.valueOf(EnumC4067k1.EVENT_TYPE_EXCEPTION_USER.m20218b()), Integer.valueOf(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.m20218b()), Integer.valueOf(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.m20218b()), Integer.valueOf(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.m20218b()), Integer.valueOf(EnumC4067k1.EVENT_TYPE_ANR.m20218b())};
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 7; i2++) {
            hashSet.add(numArr[i2]);
        }
        f43167a = Collections.unmodifiableSet(hashSet);
        EnumC4067k1 enumC4067k1 = EnumC4067k1.EVENT_TYPE_UNDEFINED;
        EnumC4067k1 enumC4067k12 = EnumC4067k1.EVENT_TYPE_SEND_REFERRER;
        EnumC4067k1 enumC4067k13 = EnumC4067k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC4067k1 enumC4067k14 = EnumC4067k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC4067k1 enumC4067k15 = EnumC4067k1.EVENT_TYPE_ACTIVATION;
        EnumC4067k1 enumC4067k16 = EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        EnumC4067k1 enumC4067k17 = EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC4067k1 enumC4067k18 = EnumC4067k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        f43168b = EnumSet.of(enumC4067k1, EnumC4067k1.EVENT_TYPE_PURGE_BUFFER, enumC4067k12, enumC4067k13, enumC4067k14, enumC4067k15, enumC4067k16, enumC4067k17, enumC4067k18);
        EnumC4067k1 enumC4067k19 = EnumC4067k1.EVENT_TYPE_SET_USER_INFO;
        EnumC4067k1 enumC4067k110 = EnumC4067k1.EVENT_TYPE_REPORT_USER_INFO;
        EnumC4067k1 enumC4067k111 = EnumC4067k1.EVENT_TYPE_INIT;
        EnumC4067k1 enumC4067k112 = EnumC4067k1.EVENT_TYPE_APP_UPDATE;
        f43169c = EnumSet.of(enumC4067k19, enumC4067k110, EnumC4067k1.EVENT_TYPE_IDENTITY, enumC4067k1, enumC4067k111, enumC4067k112, enumC4067k12, EnumC4067k1.EVENT_TYPE_ALIVE, EnumC4067k1.EVENT_TYPE_STARTUP, enumC4067k13, enumC4067k14, enumC4067k15, enumC4067k16, enumC4067k17, enumC4067k18, EnumC4067k1.EVENT_TYPE_WEBVIEW_SYNC);
        EnumC4067k1 enumC4067k113 = EnumC4067k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC4067k1 enumC4067k114 = EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f43170d = EnumSet.of(enumC4067k113, enumC4067k19, enumC4067k110, enumC4067k114);
        EnumC4067k1 enumC4067k115 = EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        EnumC4067k1 enumC4067k116 = EnumC4067k1.EVENT_TYPE_REGULAR;
        f43171e = EnumSet.of(enumC4067k115, enumC4067k114, EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC4067k1.EVENT_TYPE_EXCEPTION_USER, EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, enumC4067k16, enumC4067k17, EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, enumC4067k18, enumC4067k116);
        f43172f = EnumSet.of(EnumC4067k1.EVENT_TYPE_DIAGNOSTIC, EnumC4067k1.EVENT_TYPE_DIAGNOSTIC_STATBOX, EnumC4067k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING, EnumC4067k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS);
        f43173g = EnumSet.of(enumC4067k116);
        f43174h = EnumSet.of(enumC4067k16, enumC4067k17, enumC4067k18);
        f43175i = Arrays.asList(Integer.valueOf(enumC4067k111.m20218b()), Integer.valueOf(EnumC4067k1.EVENT_TYPE_FIRST_ACTIVATION.m20218b()), Integer.valueOf(enumC4067k12.m20218b()), Integer.valueOf(enumC4067k112.m20218b()));
        f43176j = Arrays.asList(Integer.valueOf(EnumC4067k1.EVENT_TYPE_CLEANUP.m20218b()));
    }

    /* renamed from: a */
    public static boolean m18368a(EnumC4067k1 enumC4067k1) {
        return !f43168b.contains(enumC4067k1);
    }

    /* renamed from: b */
    public static boolean m18371b(EnumC4067k1 enumC4067k1) {
        return !f43169c.contains(enumC4067k1);
    }

    /* renamed from: c */
    public static boolean m18373c(int i2) {
        return f43171e.contains(EnumC4067k1.m20216a(i2));
    }

    /* renamed from: d */
    public static boolean m18374d(int i2) {
        return !f43174h.contains(EnumC4067k1.m20216a(i2));
    }

    /* renamed from: e */
    public static boolean m18375e(int i2) {
        return f43173g.contains(EnumC4067k1.m20216a(i2));
    }

    /* renamed from: f */
    public static boolean m18376f(int i2) {
        return f43167a.contains(Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static boolean m18367a(int i2) {
        return f43172f.contains(EnumC4067k1.m20216a(i2));
    }

    /* renamed from: b */
    public static boolean m18370b(int i2) {
        return f43170d.contains(EnumC4067k1.m20216a(i2));
    }

    /* renamed from: c */
    public static C4066k0 m18372c(@Nullable String str, @NonNull C3379Im c3379Im) {
        return m18364a(str, EnumC4067k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF, c3379Im);
    }

    /* renamed from: a */
    public static C4066k0 m18363a(@NonNull String str, @NonNull C3379Im c3379Im) {
        return m18364a(str, EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, c3379Im);
    }

    /* renamed from: b */
    public static C4066k0 m18369b(@NonNull String str, @NonNull C3379Im c3379Im) {
        return m18364a(str, EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, c3379Im);
    }

    /* renamed from: a */
    private static C4066k0 m18364a(@Nullable String str, @NonNull EnumC4067k1 enumC4067k1, @NonNull C3379Im c3379Im) {
        C3605S c3605s = new C3605S("", "", enumC4067k1.m20218b(), 0, c3379Im);
        if (str != null) {
            c3605s.m19072i(str);
        }
        return c3605s;
    }

    /* renamed from: a */
    public static C4066k0 m18362a() {
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.m20218b();
        try {
            c4066k0.f45521b = new JSONObject().put("stat_sending", new JSONObject().put("disabled", true)).toString();
        } catch (Throwable unused) {
        }
        return c4066k0;
    }

    /* renamed from: a */
    public static C4066k0 m18366a(@Nullable String str, @NonNull byte[] bArr, @NonNull C3379Im c3379Im) {
        return new C3605S(bArr, str, EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.m20218b(), c3379Im);
    }

    /* renamed from: a */
    public static C4066k0 m18365a(String str, String str2, boolean z, @NonNull C3379Im c3379Im) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("link", str2);
        hashMap.put("auto", Boolean.valueOf(z));
        return new C3605S(C4452ym.m21272g(hashMap), "", EnumC4067k1.EVENT_TYPE_APP_OPEN.m20218b(), 0, c3379Im);
    }
}
