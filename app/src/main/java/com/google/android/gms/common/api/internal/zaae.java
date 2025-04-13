package com.google.android.gms.common.api.internal;

import android.os.Handler;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaae extends zap {

    /* renamed from: g */
    public final ArraySet<ApiKey<?>> f15457g;

    /* renamed from: h */
    public final GoogleApiManager f15458h;

    @VisibleForTesting
    public zaae(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f15457g = new ArraySet<>(0);
        this.f15458h = googleApiManager;
        lifecycleFragment.mo8003g0("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: g */
    public final void mo7999g() {
        if (this.f15457g.isEmpty()) {
            return;
        }
        this.f15458h.m7984a(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo8001i() {
        this.f15596c = true;
        if (this.f15457g.isEmpty()) {
            return;
        }
        this.f15458h.m7984a(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo8002j() {
        this.f15596c = false;
        GoogleApiManager googleApiManager = this.f15458h;
        Objects.requireNonNull(googleApiManager);
        synchronized (GoogleApiManager.f15412s) {
            if (googleApiManager.f15424l == this) {
                googleApiManager.f15424l = null;
                googleApiManager.f15425m.clear();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* renamed from: l */
    public final void mo8017l(ConnectionResult connectionResult, int i2) {
        this.f15458h.m7990i(connectionResult, i2);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* renamed from: m */
    public final void mo8018m() {
        Handler handler = this.f15458h.f15427o;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
