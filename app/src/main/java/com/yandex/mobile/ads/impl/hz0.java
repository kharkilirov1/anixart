package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class hz0 {

    /* renamed from: b */
    private static final Object f51151b = new Object();

    /* renamed from: c */
    private static volatile hz0 f51152c;

    /* renamed from: a */
    @NonNull
    private final HashMap f51153a = new HashMap();

    private hz0() {
    }

    /* renamed from: a */
    public static hz0 m25401a() {
        if (f51152c == null) {
            synchronized (f51151b) {
                if (f51152c == null) {
                    f51152c = new hz0();
                }
            }
        }
        return f51152c;
    }

    /* renamed from: a */
    public final void m25403a(@NonNull ez0 ez0Var) {
        synchronized (f51151b) {
            if (!this.f51153a.containsKey(ez0Var)) {
                this.f51153a.put(ez0Var, null);
            }
        }
    }

    /* renamed from: a */
    public final void m25402a(@NonNull Context context, @NonNull cz0 cz0Var) {
        HashSet hashSet;
        synchronized (f51151b) {
            hashSet = new HashSet(this.f51153a.keySet());
            xz0.m29823b().m29826a(context, cz0Var);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((pz0) it.next()).mo24284a(context, cz0Var);
        }
    }
}
