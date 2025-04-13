package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Objects;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zabv<O extends Api.ApiOptions> extends zaag {

    /* renamed from: b */
    @NotOnlyInitialized
    public final GoogleApi<O> f15547b;

    public zabv(GoogleApi<O> googleApi) {
        this.f15547b = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: d */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo7951d(@NonNull T t) {
        GoogleApi<O> googleApi = this.f15547b;
        Objects.requireNonNull(googleApi);
        t.m7979j();
        GoogleApiManager googleApiManager = googleApi.f15362j;
        Objects.requireNonNull(googleApiManager);
        zae zaeVar = new zae(1, t);
        Handler handler = googleApiManager.f15427o;
        handler.sendMessage(handler.obtainMessage(4, new zach(zaeVar, googleApiManager.f15422j.get(), googleApi)));
        return t;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: e */
    public final Looper mo7952e() {
        return this.f15547b.f15358f;
    }
}
