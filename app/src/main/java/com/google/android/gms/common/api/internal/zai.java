package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class zai {

    /* renamed from: a */
    public final int f15589a;

    public zai(int i2) {
        this.f15589a = i2;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m8078e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo8072a(@NonNull Status status);

    /* renamed from: b */
    public abstract void mo8073b(@NonNull Exception exc);

    /* renamed from: c */
    public abstract void mo8074c(zabq<?> zabqVar) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo8075d(@NonNull zaad zaadVar, boolean z);
}
