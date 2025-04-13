package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class s70<V extends ViewGroup> {

    /* renamed from: a */
    @NonNull
    private final Context f54511a;

    /* renamed from: b */
    @NonNull
    private final ViewGroup f54512b;

    /* renamed from: c */
    @NonNull
    private final r70<V> f54513c;

    /* renamed from: d */
    @NonNull
    private final q70<V> f54514d = new q70<>();

    /* renamed from: e */
    @NonNull
    private final p70<V> f54515e = new p70<>();

    public s70(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull ArrayList arrayList) {
        this.f54511a = context;
        this.f54512b = viewGroup;
        this.f54513c = new r70<>(arrayList);
    }

    /* renamed from: a */
    public final boolean m28075a() {
        V m27649a;
        o70<V> m27856a = this.f54513c.m27856a(this.f54511a);
        if (m27856a == null || (m27649a = this.f54514d.m27649a(this.f54512b, m27856a)) == null) {
            return false;
        }
        this.f54515e.m27183a(this.f54512b, m27649a, m27856a);
        return true;
    }

    /* renamed from: b */
    public final void m28076b() {
        this.f54515e.m27182a(this.f54512b);
    }
}
