package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class c90 {

    /* renamed from: a */
    @NonNull
    private final a90 f49183a;

    /* renamed from: b */
    @NonNull
    private final qp0 f49184b;

    /* renamed from: c */
    @Nullable
    private b90 f49185c;

    public c90(@NonNull Context context, @NonNull String str) {
        this.f49183a = new a90(context, str);
        this.f49184b = new qp0(context);
    }

    @Nullable
    /* renamed from: a */
    public final b90 m23078a() {
        b90 b90Var = this.f49185c;
        if (b90Var != null) {
            return b90Var;
        }
        C5514nx m22408a = this.f49183a.m22408a();
        if (m22408a == null) {
            return null;
        }
        boolean m27771a = this.f49184b.m27771a();
        boolean m27772b = this.f49184b.m27772b();
        if (m27771a || m27772b) {
            return m22408a.m26960a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23079b() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.a90 r0 = r4.f49183a
            com.yandex.mobile.ads.impl.nx r0 = r0.m22408a()
            r1 = 0
            if (r0 == 0) goto L1e
            com.yandex.mobile.ads.impl.qp0 r2 = r4.f49184b
            boolean r2 = r2.m27771a()
            com.yandex.mobile.ads.impl.qp0 r3 = r4.f49184b
            boolean r3 = r3.m27772b()
            if (r2 != 0) goto L19
            if (r3 == 0) goto L1e
        L19:
            com.yandex.mobile.ads.impl.b90 r0 = r0.m26960a()
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r4.f49185c = r0
            com.yandex.mobile.ads.impl.a90 r0 = r4.f49183a
            com.yandex.mobile.ads.impl.nx r0 = r0.m22408a()
            if (r0 == 0) goto L3d
            com.yandex.mobile.ads.impl.qp0 r2 = r4.f49184b
            boolean r2 = r2.m27771a()
            com.yandex.mobile.ads.impl.qp0 r3 = r4.f49184b
            boolean r3 = r3.m27772b()
            if (r2 != 0) goto L39
            if (r3 == 0) goto L3d
        L39:
            com.yandex.mobile.ads.impl.b90 r1 = r0.m26960a()
        L3d:
            r4.f49185c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c90.m23079b():void");
    }
}
