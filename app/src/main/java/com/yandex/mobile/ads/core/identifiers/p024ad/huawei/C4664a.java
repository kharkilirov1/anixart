package com.yandex.mobile.ads.core.identifiers.p024ad.huawei;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C6061y7;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.ry0;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.huawei.a */
/* loaded from: classes2.dex */
public final class C4664a {

    /* renamed from: a */
    @NonNull
    private final Context f47808a;

    /* renamed from: b */
    @NonNull
    private final ry0 f47809b = new ry0();

    /* renamed from: c */
    @NonNull
    private final C4666c f47810c = new C4666c();

    /* renamed from: d */
    @NonNull
    private final C4667d f47811d = new C4667d();

    public C4664a(@NonNull Context context) {
        this.f47808a = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: a */
    public final C6061y7 m21974a() {
        ResolveInfo resolveInfo;
        Objects.requireNonNull(this.f47811d);
        Intent m21977a = C4667d.m21977a();
        ry0 ry0Var = this.f47809b;
        Context context = this.f47808a;
        Objects.requireNonNull(ry0Var);
        C6061y7 c6061y7 = null;
        try {
            resolveInfo = context.getPackageManager().resolveService(m21977a, 0);
        } catch (Throwable th) {
            n60.m26808a(th, th.getMessage(), new Object[0]);
            resolveInfo = null;
        }
        if (resolveInfo != null) {
            try {
                ServiceConnectionC4665b serviceConnectionC4665b = new ServiceConnectionC4665b();
                if (this.f47808a.bindService(m21977a, serviceConnectionC4665b, 1)) {
                    c6061y7 = this.f47810c.m21976a(serviceConnectionC4665b);
                    this.f47808a.unbindService(serviceConnectionC4665b);
                } else {
                    n60.m26809b("Can't bind to Huawei identifiers service", new Object[0]);
                }
            } catch (Throwable th2) {
                n60.m26808a(th2, "Exception during advertising info GMS service binding", new Object[0]);
            }
        }
        return c6061y7;
    }
}
