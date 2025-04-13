package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.o3 */
/* loaded from: classes2.dex */
class C4173o3 {
    @NonNull
    /* renamed from: a */
    public ResultReceiverC4144n0 m20498a(@NonNull Handler handler, @NonNull C4147n3 c4147n3) {
        return new ResultReceiverC4144n0(handler, c4147n3);
    }

    @NonNull
    /* renamed from: a */
    public C3659U3 m20496a(@NonNull Context context, @NonNull ResultReceiverC4144n0 resultReceiverC4144n0) {
        return new C3659U3(context, resultReceiverC4144n0);
    }

    @NonNull
    /* renamed from: a */
    public C4146n2 m20499a(@NonNull C3659U3 c3659u3, @NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        return new C4146n2(c3659u3, context, new C4405x1(context, interfaceExecutorC4297sn), new C4411x7(), new C3891d7());
    }

    @NonNull
    /* renamed from: a */
    public C3375Ii m20495a(@NonNull Context context, @NonNull C4146n2 c4146n2, @NonNull C3291F9 c3291f9, @NonNull Handler handler) {
        return new C3375Ii(context, c4146n2, c3291f9, handler);
    }

    @NonNull
    /* renamed from: a */
    public C3248Dg m20494a(@NonNull C4146n2 c4146n2, @NonNull C3291F9 c3291f9, @NonNull Handler handler) {
        return new C3248Dg(c4146n2, c3291f9, handler);
    }

    @NonNull
    /* renamed from: a */
    public C4094l2 m20497a(@NonNull Context context, @NonNull C3659U3 c3659u3, @NonNull C4146n2 c4146n2, @NonNull Handler handler, @NonNull C3375Ii c3375Ii) {
        return new C4094l2(context, c3659u3, c4146n2, handler, c3375Ii);
    }
}
