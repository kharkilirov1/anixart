package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* renamed from: a */
    @Nullable
    public final Feature[] f15433a;

    /* renamed from: b */
    public final boolean f15434b;

    /* renamed from: c */
    public final int f15435c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* renamed from: a */
        public RemoteCall<A, TaskCompletionSource<ResultT>> f15436a;

        /* renamed from: c */
        public Feature[] f15438c;

        /* renamed from: b */
        public boolean f15437b = true;

        /* renamed from: d */
        public int f15439d = 0;

        public Builder() {
        }

        public /* synthetic */ Builder(zacw zacwVar) {
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public TaskApiCall<A, ResultT> m8009a() {
            Preconditions.m8127b(this.f15436a != null, "execute parameter required");
            return new zacv(this, this.f15438c, this.f15437b, this.f15439d);
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.f15433a = null;
        this.f15434b = false;
        this.f15435c = 0;
    }

    @KeepForSdk
    public TaskApiCall(@Nullable Feature[] featureArr, boolean z, int i2) {
        this.f15433a = featureArr;
        this.f15434b = featureArr != null && z;
        this.f15435c = i2;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> m8008a() {
        return new Builder<>(null);
    }

    @KeepForSdk
    /* renamed from: b */
    public abstract void mo7844b(@NonNull A a2, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;
}
