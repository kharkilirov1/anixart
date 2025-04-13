package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class BaseImplementation {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {

        /* renamed from: o */
        @KeepForSdk
        public final Api.AnyClientKey<A> f15394o;

        /* renamed from: p */
        @Nullable
        @KeepForSdk
        public final Api<?> f15395p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @KeepForSdk
        public ApiMethodImpl(@NonNull Api<?> api, @NonNull GoogleApiClient googleApiClient) {
            super(googleApiClient);
            Preconditions.m8132g(googleApiClient, "GoogleApiClient must not be null");
            Preconditions.m8132g(api, "Api must not be null");
            this.f15394o = api.f15346b;
            this.f15395p = api;
        }

        @KeepForSdk
        /* renamed from: l */
        public abstract void mo7881l(@NonNull A a2) throws RemoteException;

        @KeepForSdk
        /* renamed from: m */
        public final void m7971m(@NonNull A a2) throws DeadObjectException {
            try {
                mo7881l(a2);
            } catch (DeadObjectException e2) {
                m7972n(new Status(8, e2.getLocalizedMessage(), null));
                throw e2;
            } catch (RemoteException e3) {
                m7972n(new Status(8, e3.getLocalizedMessage(), null));
            }
        }

        @KeepForSdk
        /* renamed from: n */
        public final void m7972n(@NonNull Status status) {
            Preconditions.m8127b(!status.m7964n(), "Failed result must not be success");
            mo7882a(mo7880d(status));
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface ResultHolder<R> {
        @KeepForSdk
        /* renamed from: a */
        void mo7882a(@NonNull R r);
    }
}
