package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbw implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public final /* synthetic */ SignInHubActivity f15248a;

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3255a(Loader loader, Object obj) {
        SignInHubActivity signInHubActivity = this.f15248a;
        signInHubActivity.setResult(signInHubActivity.f15229e, signInHubActivity.f15230f);
        this.f15248a.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    /* renamed from: b */
    public final Loader mo3256b(int i2, Bundle bundle) {
        SignInHubActivity signInHubActivity = this.f15248a;
        Set<GoogleApiClient> set = GoogleApiClient.f15370a;
        synchronized (set) {
        }
        return new zbc(signInHubActivity, set);
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    /* renamed from: c */
    public final void mo3257c(Loader loader) {
    }
}
