package com.yandex.mobile.ads.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.nativeads.a0 */
/* loaded from: classes3.dex */
final class C6199a0 {

    /* renamed from: b */
    private static final Object f57663b = new Object();

    /* renamed from: c */
    private static volatile C6199a0 f57664c;

    /* renamed from: a */
    @NonNull
    private final WeakHashMap f57665a = new WeakHashMap();

    @NonNull
    /* renamed from: a */
    public static C6199a0 m30496a() {
        if (f57664c == null) {
            synchronized (f57663b) {
                if (f57664c == null) {
                    f57664c = new C6199a0();
                }
            }
        }
        return f57664c;
    }

    @Nullable
    /* renamed from: a */
    public final AbstractC6221l0 m30497a(@NonNull View view) {
        AbstractC6221l0 abstractC6221l0;
        synchronized (f57663b) {
            abstractC6221l0 = (AbstractC6221l0) this.f57665a.get(view);
        }
        return abstractC6221l0;
    }

    /* renamed from: a */
    public final void m30498a(@NonNull View view, @NonNull AbstractC6221l0 abstractC6221l0) {
        synchronized (f57663b) {
            this.f57665a.put(view, abstractC6221l0);
        }
    }

    /* renamed from: a */
    public final boolean m30499a(@NonNull AbstractC6221l0 abstractC6221l0) {
        Iterator it = this.f57665a.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((AbstractC6221l0) ((Map.Entry) it.next()).getValue()) == abstractC6221l0) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
