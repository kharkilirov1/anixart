package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabu implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* renamed from: a */
    public final Api.Client f15541a;

    /* renamed from: b */
    public final ApiKey<?> f15542b;

    /* renamed from: c */
    @Nullable
    public IAccountAccessor f15543c = null;

    /* renamed from: d */
    @Nullable
    public Set<Scope> f15544d = null;

    /* renamed from: e */
    public boolean f15545e = false;

    /* renamed from: f */
    public final /* synthetic */ GoogleApiManager f15546f;

    public zabu(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.f15546f = googleApiManager;
        this.f15541a = client;
        this.f15542b = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    /* renamed from: a */
    public final void mo8025a(@NonNull ConnectionResult connectionResult) {
        this.f15546f.f15427o.post(new zabt(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @WorkerThread
    /* renamed from: b */
    public final void mo8066b(ConnectionResult connectionResult) {
        zabq<?> zabqVar = this.f15546f.f15423k.get(this.f15542b);
        if (zabqVar != null) {
            Preconditions.m8128c(zabqVar.f15536m.f15427o);
            Api.Client client = zabqVar.f15525b;
            String name = client.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            client.mo7937d(C0000a.m22s(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
            zabqVar.m8063s(connectionResult, null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @WorkerThread
    /* renamed from: c */
    public final void mo8067c(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo8066b(new ConnectionResult(4));
            return;
        }
        this.f15543c = iAccountAccessor;
        this.f15544d = set;
        if (this.f15545e) {
            this.f15541a.mo7936c(iAccountAccessor, set);
        }
    }
}
