package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class s90 {

    /* renamed from: b */
    private static final Object f54527b = new Object();

    /* renamed from: c */
    private static volatile s90 f54528c;

    /* renamed from: a */
    @NonNull
    private final WeakHashMap f54529a = new WeakHashMap();

    private s90() {
    }

    @NonNull
    /* renamed from: a */
    public static s90 m28081a() {
        if (f54528c == null) {
            synchronized (f54527b) {
                if (f54528c == null) {
                    f54528c = new s90();
                }
            }
        }
        return f54528c;
    }

    @Nullable
    /* renamed from: a */
    public final m90 m28082a(@NonNull InstreamAdView instreamAdView) {
        m90 m90Var;
        synchronized (f54527b) {
            m90Var = (m90) this.f54529a.get(instreamAdView);
        }
        return m90Var;
    }

    /* renamed from: a */
    public final void m28083a(@NonNull InstreamAdView instreamAdView, @NonNull m90 m90Var) {
        synchronized (f54527b) {
            this.f54529a.put(instreamAdView, m90Var);
        }
    }

    /* renamed from: a */
    public final boolean m28084a(@NonNull m90 m90Var) {
        boolean z;
        synchronized (f54527b) {
            Iterator it = this.f54529a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (m90Var == ((m90) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
