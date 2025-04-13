package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.zm */
/* loaded from: classes2.dex */
public abstract class AbstractC4478zm {

    /* renamed from: a */
    private static Map<String, C3379Im> f47141a = new HashMap();

    /* renamed from: b */
    private static Map<String, C4426xm> f47142b = new HashMap();

    /* renamed from: c */
    private static final Object f47143c = new Object();

    /* renamed from: d */
    private static final Object f47144d = new Object();

    /* renamed from: e */
    public static final /* synthetic */ int f47145e = 0;

    @NonNull
    /* renamed from: a */
    public static C4426xm m21312a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return C4426xm.m21163g();
        }
        C4426xm c4426xm = f47142b.get(str);
        if (c4426xm == null) {
            synchronized (f47144d) {
                c4426xm = f47142b.get(str);
                if (c4426xm == null) {
                    c4426xm = new C4426xm(str);
                    f47142b.put(str, c4426xm);
                }
            }
        }
        return c4426xm;
    }

    @NonNull
    /* renamed from: b */
    public static C3379Im m21313b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return C3379Im.m18338g();
        }
        C3379Im c3379Im = f47141a.get(str);
        if (c3379Im == null) {
            synchronized (f47143c) {
                c3379Im = f47141a.get(str);
                if (c3379Im == null) {
                    c3379Im = new C3379Im(str);
                    f47141a.put(str, c3379Im);
                }
            }
        }
        return c3379Im;
    }

    @NonNull
    /* renamed from: a */
    public static C3379Im m21311a() {
        return C3379Im.m18338g();
    }
}
