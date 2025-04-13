package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: h */
    public static final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15569h = com.google.android.gms.signin.zad.f17218a;

    /* renamed from: a */
    public final Context f15570a;

    /* renamed from: b */
    public final Handler f15571b;

    /* renamed from: c */
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15572c;

    /* renamed from: d */
    public final Set<Scope> f15573d;

    /* renamed from: e */
    public final ClientSettings f15574e;

    /* renamed from: f */
    public com.google.android.gms.signin.zae f15575f;

    /* renamed from: g */
    public zacs f15576g;

    @WorkerThread
    public zact(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = f15569h;
        this.f15570a = context;
        this.f15571b = handler;
        this.f15574e = clientSettings;
        this.f15573d = clientSettings.f15682b;
        this.f15572c = abstractClientBuilder;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    /* renamed from: i */
    public final void mo7980i(int i2) {
        this.f15575f.mo7935b();
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    /* renamed from: k0 */
    public final void mo8027k0(com.google.android.gms.signin.internal.zak zakVar) {
        this.f15571b.post(new zacr(this, zakVar));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    /* renamed from: q */
    public final void mo8006q(@NonNull ConnectionResult connectionResult) {
        this.f15576g.mo8066b(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    /* renamed from: t */
    public final void mo7981t(@Nullable Bundle bundle) {
        this.f15575f.mo9686k(this);
    }
}
