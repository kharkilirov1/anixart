package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.h3 */
/* loaded from: classes3.dex */
public final class C5160h3 {

    /* renamed from: c */
    @NonNull
    private static final Object f50800c = new Object();

    /* renamed from: d */
    @Nullable
    private static volatile C5160h3 f50801d;

    /* renamed from: a */
    @NonNull
    private final ArrayList f50802a = new ArrayList();

    /* renamed from: b */
    @NonNull
    private final ArrayList f50803b = new ArrayList();

    private C5160h3() {
    }

    /* renamed from: b */
    public static C5160h3 m25034b() {
        if (f50801d == null) {
            synchronized (f50800c) {
                if (f50801d == null) {
                    f50801d = new C5160h3();
                }
            }
        }
        return f50801d;
    }

    /* renamed from: a */
    public final void m25036a(@NonNull String str) {
        synchronized (f50800c) {
            this.f50803b.remove(str);
            this.f50803b.add(str);
        }
    }

    @NonNull
    /* renamed from: c */
    public final ArrayList m25038c() {
        ArrayList arrayList;
        synchronized (f50800c) {
            arrayList = new ArrayList(this.f50802a);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m25035a() {
        ArrayList arrayList;
        synchronized (f50800c) {
            arrayList = new ArrayList(this.f50803b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m25037b(@NonNull String str) {
        synchronized (f50800c) {
            this.f50802a.remove(str);
            this.f50802a.add(str);
        }
    }
}
