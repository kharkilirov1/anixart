package com.yandex.mobile.ads.core.identifiers.p024ad.gms.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C6061y7;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.ry0;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.gms.service.d */
/* loaded from: classes2.dex */
public final class C4661d {

    /* renamed from: a */
    @NonNull
    private final Context f47801a;

    /* renamed from: b */
    @NonNull
    private final ry0 f47802b = new ry0();

    /* renamed from: c */
    @NonNull
    private final C4662e f47803c = new C4662e();

    /* renamed from: d */
    @NonNull
    private final C4663f f47804d = new C4663f();

    public C4661d(@NonNull Context context) {
        this.f47801a = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: a */
    public final C6061y7 m21971a() {
        ResolveInfo resolveInfo;
        Objects.requireNonNull(this.f47804d);
        Intent m21973a = C4663f.m21973a();
        ry0 ry0Var = this.f47802b;
        Context context = this.f47801a;
        Objects.requireNonNull(ry0Var);
        C6061y7 c6061y7 = null;
        try {
            resolveInfo = context.getPackageManager().resolveService(m21973a, 0);
        } catch (Throwable th) {
            n60.m26808a(th, th.getMessage(), new Object[0]);
            resolveInfo = null;
        }
        if (resolveInfo != null) {
            try {
                ServiceConnectionC4660c serviceConnectionC4660c = new ServiceConnectionC4660c();
                if (this.f47801a.bindService(m21973a, serviceConnectionC4660c, 1)) {
                    c6061y7 = this.f47803c.m21972a(serviceConnectionC4660c);
                    this.f47801a.unbindService(serviceConnectionC4660c);
                } else {
                    n60.m26809b("Can't bind to GMS identifiers service", new Object[0]);
                }
            } catch (Throwable th2) {
                n60.m26808a(th2, "Exception during advertising info GMS service binding", new Object[0]);
            }
        }
        return c6061y7;
    }
}
