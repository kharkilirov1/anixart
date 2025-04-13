package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

@SuppressLint
/* renamed from: com.yandex.mobile.ads.impl.p0 */
/* loaded from: classes3.dex */
public final class C5561p0 {

    /* renamed from: b */
    private static final Object f53359b = new Object();

    /* renamed from: c */
    private static volatile C5561p0 f53360c;

    /* renamed from: a */
    @NonNull
    private final HashMap f53361a = new HashMap();

    private C5561p0() {
    }

    @NonNull
    /* renamed from: a */
    public static C5561p0 m27132a() {
        if (f53360c == null) {
            synchronized (f53359b) {
                if (f53360c == null) {
                    f53360c = new C5561p0();
                }
            }
        }
        return f53360c;
    }

    /* renamed from: a */
    public final void m27134a(long j2, @NonNull C5518o0 c5518o0) {
        synchronized (f53359b) {
            this.f53361a.put(Long.valueOf(j2), c5518o0);
        }
    }

    @Nullable
    /* renamed from: a */
    public final C5518o0 m27133a(long j2) {
        C5518o0 c5518o0;
        synchronized (f53359b) {
            c5518o0 = (C5518o0) this.f53361a.remove(Long.valueOf(j2));
        }
        return c5518o0;
    }
}
