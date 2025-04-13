package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class gu0 {

    /* renamed from: b */
    @NonNull
    private static final Object f50738b = new Object();

    /* renamed from: c */
    private static volatile gu0 f50739c;

    /* renamed from: a */
    @NonNull
    private final WeakHashMap f50740a = new WeakHashMap();

    private gu0() {
    }

    /* renamed from: a */
    public static gu0 m24977a() {
        if (f50739c == null) {
            synchronized (f50738b) {
                if (f50739c == null) {
                    f50739c = new gu0();
                }
            }
        }
        return f50739c;
    }

    @Nullable
    /* renamed from: a */
    public final String m24978a(@NonNull zv0<?> zv0Var) {
        String str;
        synchronized (f50738b) {
            str = (String) this.f50740a.get(zv0Var);
        }
        return str;
    }
}
