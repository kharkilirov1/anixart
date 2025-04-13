package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.Preconditions;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zai {

    /* renamed from: b */
    public final A f15584b;

    public zae(int i2, A a2) {
        super(i2);
        Preconditions.m8132g(a2, "Null methods are not runnable.");
        this.f15584b = a2;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: a */
    public final void mo8072a(@NonNull Status status) {
        try {
            this.f15584b.m7972n(status);
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: b */
    public final void mo8073b(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f15584b.m7972n(new Status(10, C0000a.m21r(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage)));
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: c */
    public final void mo8074c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.f15584b.m7971m(zabqVar.f15525b);
        } catch (RuntimeException e2) {
            mo8073b(e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: d */
    public final void mo8075d(@NonNull zaad zaadVar, boolean z) {
        A a2 = this.f15584b;
        zaadVar.f15455a.put(a2, Boolean.valueOf(z));
        a2.mo7955b(new zaab(zaadVar, a2));
    }
}
