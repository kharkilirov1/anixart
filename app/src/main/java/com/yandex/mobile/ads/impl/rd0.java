package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.mediation.base.C6164a;
import com.yandex.mobile.ads.mediation.base.C6165b;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
final class rd0 {

    /* renamed from: a */
    @NonNull
    private final ed0 f54282a;

    /* renamed from: b */
    @NonNull
    private final C6165b f54283b = new C6165b();

    public rd0(@NonNull ed0 ed0Var) {
        this.f54282a = ed0Var;
    }

    /* renamed from: a */
    public final void m27907a(@NonNull Context context, @NonNull qd0 qd0Var, @Nullable C6164a c6164a, @NonNull String str, @Nullable Long l2) {
        HashMap hashMap = new HashMap();
        hashMap.put("failure_reason", str);
        hashMap.put("status", "error");
        if (l2 != null) {
            hashMap.put("response_time", l2);
        }
        if (c6164a != null) {
            Objects.requireNonNull(this.f54283b);
            hashMap.putAll(C6165b.m30417a(c6164a));
        }
        this.f54282a.m24127f(context, qd0Var, hashMap);
    }

    /* renamed from: a */
    public final void m27906a(@NonNull Context context, @NonNull qd0 qd0Var, @Nullable C6164a c6164a) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "success");
        if (c6164a != null) {
            Objects.requireNonNull(this.f54283b);
            hashMap.putAll(C6165b.m30417a(c6164a));
        }
        this.f54282a.m24127f(context, qd0Var, hashMap);
    }
}
