package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class f30 {

    /* renamed from: b */
    private static final Object f50108b = new Object();

    /* renamed from: c */
    private static volatile f30 f50109c;

    /* renamed from: a */
    @NonNull
    private final WeakHashMap f50110a = new WeakHashMap();

    private f30() {
    }

    @NonNull
    /* renamed from: a */
    public static f30 m24299a() {
        if (f50109c == null) {
            synchronized (f50108b) {
                if (f50109c == null) {
                    f50109c = new f30();
                }
            }
        }
        return f50109c;
    }

    @Nullable
    /* renamed from: a */
    public final InstreamAdBinder m24300a(@NonNull View view) {
        InstreamAdBinder instreamAdBinder;
        synchronized (f50108b) {
            instreamAdBinder = (InstreamAdBinder) this.f50110a.get(view);
        }
        return instreamAdBinder;
    }

    /* renamed from: a */
    public final void m24301a(@NonNull View view, @NonNull InstreamAdBinder instreamAdBinder) {
        synchronized (f50108b) {
            this.f50110a.put(view, instreamAdBinder);
        }
    }

    /* renamed from: a */
    public final boolean m24302a(@NonNull InstreamAdBinder instreamAdBinder) {
        boolean z;
        synchronized (f50108b) {
            Iterator it = this.f50110a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (instreamAdBinder == ((InstreamAdBinder) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
