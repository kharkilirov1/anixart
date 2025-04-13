package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzr implements AppSetIdClient {

    /* renamed from: a */
    public final AppSetIdClient f15995a;

    /* renamed from: b */
    public final AppSetIdClient f15996b;

    public zzr(Context context) {
        AppSetIdClient appSetIdClient;
        this.f15995a = new zzp(context, GoogleApiAvailabilityLight.f15328b);
        synchronized (zzl.class) {
            Preconditions.m8132g(context, "Context must not be null");
            if (zzl.f15985e == null) {
                zzl.f15985e = new zzl(context.getApplicationContext());
            }
            appSetIdClient = zzl.f15985e;
        }
        this.f15996b = appSetIdClient;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    /* renamed from: a */
    public final Task<AppSetIdInfo> mo7830a() {
        return this.f15995a.mo7830a().mo9705j(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: e */
            public final Object mo7340e(Task task) {
                zzr zzrVar = zzr.this;
                if (task.mo9712q() || task.mo9710o()) {
                    return task;
                }
                Exception mo9707l = task.mo9707l();
                if (!(mo9707l instanceof ApiException)) {
                    return task;
                }
                int i2 = ((ApiException) mo9707l).f15349b.f15380c;
                return (i2 == 43001 || i2 == 43002 || i2 == 43003 || i2 == 17) ? zzrVar.f15996b.mo7830a() : i2 == 43000 ? Tasks.m9722d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i2 != 15 ? task : Tasks.m9722d(new Exception("The operation to get app set ID timed out. Please try again later."));
            }
        });
    }
}
