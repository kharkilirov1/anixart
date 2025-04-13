package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbc extends AsyncTaskLoader implements SignInConnectionListener {

    /* renamed from: l */
    public final Semaphore f15238l;

    /* renamed from: m */
    public final Set f15239m;

    public zbc(Context context, Set set) {
        super(context);
        this.f15238l = new Semaphore(0);
        this.f15239m = set;
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: e */
    public final void mo3275e() {
        this.f15238l.drainPermits();
        m3269l();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo3267j() {
        Iterator it = this.f15239m.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).mo7953f(this)) {
                i2++;
            }
        }
        try {
            this.f15238l.tryAcquire(i2, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e2) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e2);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.f15238l.release();
    }
}
