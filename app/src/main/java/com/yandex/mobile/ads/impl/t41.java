package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class t41 {

    /* renamed from: b */
    private static volatile t41 f54946b;

    /* renamed from: c */
    private static final Object f54947c = new Object();

    /* renamed from: a */
    @NonNull
    private final HashMap f54948a = new HashMap();

    private t41() {
    }

    @NonNull
    /* renamed from: a */
    public static t41 m28460a() {
        if (f54946b == null) {
            synchronized (f54947c) {
                if (f54946b == null) {
                    f54946b = new t41();
                }
            }
        }
        return f54946b;
    }

    /* renamed from: b */
    public final void m28462b(@NonNull h70 h70Var, @NonNull Object obj) {
        synchronized (f54947c) {
            Set set = (Set) this.f54948a.get(h70Var);
            if (set == null) {
                set = new HashSet();
                this.f54948a.put(h70Var, set);
            }
            set.add(obj);
        }
    }

    /* renamed from: a */
    public final void m28461a(@NonNull h70 h70Var, @NonNull Object obj) {
        synchronized (f54947c) {
            Set set = (Set) this.f54948a.get(h70Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }
}
