package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbm {

    /* renamed from: a */
    public static final Logger f15244a = new Logger("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m7883a(Context context, GoogleSignInOptions googleSignInOptions) {
        f15244a.m8204a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: b */
    public static PendingResult m7884b(GoogleApiClient googleApiClient, Context context, boolean z) {
        f15244a.m8204a("Revoking access", new Object[0]);
        String m7871e = Storage.m7866a(context).m7871e("refreshToken");
        m7886d(context);
        if (!z) {
            return googleApiClient.mo7951d(new zbk(googleApiClient));
        }
        Logger logger = zbb.f15235d;
        if (m7871e == null) {
            return PendingResults.m7958a(new Status(4, null), null);
        }
        zbb zbbVar = new zbb(m7871e);
        new Thread(zbbVar).start();
        return zbbVar.f15237c;
    }

    /* renamed from: c */
    public static PendingResult m7885c(GoogleApiClient googleApiClient, Context context, boolean z) {
        f15244a.m8204a("Signing out", new Object[0]);
        m7886d(context);
        if (!z) {
            return googleApiClient.mo7951d(new zbi(googleApiClient));
        }
        Status status = Status.f15374g;
        Preconditions.m8132g(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.mo7882a(status);
        return statusPendingResult;
    }

    /* renamed from: d */
    public static void m7886d(Context context) {
        zbn.m7887a(context).m7888b();
        Set<GoogleApiClient> set = GoogleApiClient.f15370a;
        synchronized (set) {
        }
        Iterator<GoogleApiClient> it = set.iterator();
        while (it.hasNext()) {
            it.next().mo7954g();
        }
        synchronized (GoogleApiManager.f15412s) {
            GoogleApiManager googleApiManager = GoogleApiManager.f15413t;
            if (googleApiManager != null) {
                googleApiManager.f15422j.incrementAndGet();
                Handler handler = googleApiManager.f15427o;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
