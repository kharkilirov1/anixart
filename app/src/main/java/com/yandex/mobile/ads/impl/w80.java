package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

@SuppressLint
/* loaded from: classes3.dex */
public final class w80 {

    /* renamed from: f */
    private static final Object f56039f = new Object();

    /* renamed from: g */
    private static volatile w80 f56040g;

    /* renamed from: a */
    @NonNull
    private final Context f56041a;

    /* renamed from: b */
    @NonNull
    private final z80 f56042b = new z80();

    /* renamed from: c */
    @NonNull
    private final y80 f56043c = new y80();

    /* renamed from: d */
    @NonNull
    private final xz0 f56044d = xz0.m29823b();

    /* renamed from: e */
    @NonNull
    private final l01 f56045e = new l01();

    private w80(@NonNull Context context) {
        this.f56041a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public static w80 m29404a(@NonNull Context context) {
        if (f56040g == null) {
            synchronized (f56039f) {
                if (f56040g == null) {
                    f56040g = new w80(context);
                }
            }
        }
        return f56040g;
    }

    @Nullable
    /* renamed from: a */
    public final Location m29405a() {
        Location location;
        synchronized (f56039f) {
            if (this.f56044d.m29834f()) {
                l01 l01Var = this.f56045e;
                Context context = this.f56041a;
                Objects.requireNonNull(l01Var);
                if (!l01.m26309a(context)) {
                    y80 y80Var = this.f56043c;
                    Context context2 = this.f56041a;
                    Objects.requireNonNull(y80Var);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new m70(context2));
                    cz0 m29824a = xz0.m29823b().m29824a(context2);
                    if (m29824a != null && !m29824a.m23567F()) {
                        arrayList.add(C5995wx.m29583a(context2));
                        arrayList.add(C5417ly.m26543a(context2));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Location mo26585a = ((x80) it.next()).mo26585a();
                        if (mo26585a != null) {
                            arrayList2.add(mo26585a);
                        }
                    }
                    location = this.f56042b.m30074a(arrayList2);
                }
            }
            location = null;
        }
        return location;
    }
}
