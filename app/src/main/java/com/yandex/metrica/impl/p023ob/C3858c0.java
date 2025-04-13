package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.c0 */
/* loaded from: classes2.dex */
public class C3858c0 {

    /* renamed from: f */
    private static final Object f44858f = new Object();

    /* renamed from: g */
    @SuppressLint
    private static volatile C3858c0 f44859g;

    /* renamed from: a */
    public final String f44860a = Build.MANUFACTURER;

    /* renamed from: b */
    public final String f44861b = Build.MODEL;

    /* renamed from: c */
    public final String f44862c = Build.VERSION.RELEASE;

    /* renamed from: d */
    public final int f44863d = Build.VERSION.SDK_INT;

    /* renamed from: e */
    @NonNull
    public final String f44864e = String.valueOf(C4250r2.m20614a());

    /* renamed from: com.yandex.metrica.impl.ob.c0$a */
    public class a extends ArrayList<String> {
        public a(C3858c0 c3858c0) {
            if (C4250r2.m20615b()) {
                add("Superuser.apk");
            }
            if (C4250r2.m20616c()) {
                add("su.so");
            }
        }
    }

    @VisibleForTesting
    public C3858c0() {
        Collections.unmodifiableList(new a(this));
    }

    /* renamed from: a */
    public static C3858c0 m19667a() {
        if (f44859g == null) {
            synchronized (f44858f) {
                if (f44859g == null) {
                    f44859g = new C3858c0();
                }
            }
        }
        return f44859g;
    }
}
