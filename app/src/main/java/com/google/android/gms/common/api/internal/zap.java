package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: c */
    public volatile boolean f15596c;

    /* renamed from: d */
    public final AtomicReference<zam> f15597d;

    /* renamed from: e */
    public final Handler f15598e;

    /* renamed from: f */
    public final GoogleApiAvailability f15599f;

    @VisibleForTesting
    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.f15597d = new AtomicReference<>(null);
        this.f15598e = new com.google.android.gms.internal.base.zaq(Looper.getMainLooper());
        this.f15599f = googleApiAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public final void mo7996d(int i2, int i3, Intent intent) {
        zam zamVar = this.f15597d.get();
        if (i2 != 1) {
            if (i2 == 2) {
                int mo7917c = this.f15599f.mo7917c(m7995b(), GoogleApiAvailabilityLight.f15327a);
                if (mo7917c == 0) {
                    m8080n();
                    return;
                } else {
                    if (zamVar == null) {
                        return;
                    }
                    if (zamVar.f15591b.f15315c == 18 && mo7917c == 18) {
                        return;
                    }
                }
            }
        } else {
            if (i3 == -1) {
                m8080n();
                return;
            }
            if (i3 == 0) {
                if (zamVar == null) {
                    return;
                }
                ConnectionResult connectionResult = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zamVar.f15591b.toString());
                int i4 = zamVar.f15590a;
                this.f15597d.set(null);
                mo8017l(connectionResult, i4);
                return;
            }
        }
        if (zamVar != null) {
            m8079k(zamVar.f15591b, zamVar.f15590a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo7997e(@Nullable Bundle bundle) {
        if (bundle != null) {
            this.f15597d.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo8000h(Bundle bundle) {
        zam zamVar = this.f15597d.get();
        if (zamVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zamVar.f15590a);
        bundle.putInt("failed_status", zamVar.f15591b.f15315c);
        bundle.putParcelable("failed_resolution", zamVar.f15591b.f15316d);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public void mo8001i() {
        this.f15596c = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo8002j() {
        this.f15596c = false;
    }

    /* renamed from: k */
    public final void m8079k(ConnectionResult connectionResult, int i2) {
        this.f15597d.set(null);
        mo8017l(connectionResult, i2);
    }

    /* renamed from: l */
    public abstract void mo8017l(ConnectionResult connectionResult, int i2);

    /* renamed from: m */
    public abstract void mo8018m();

    /* renamed from: n */
    public final void m8080n() {
        this.f15597d.set(null);
        mo8018m();
    }

    /* renamed from: o */
    public final void m8081o(ConnectionResult connectionResult, int i2) {
        zam zamVar = new zam(connectionResult, i2);
        if (this.f15597d.compareAndSet(null, zamVar)) {
            this.f15598e.post(new zao(this, zamVar));
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        zam zamVar = this.f15597d.get();
        int i2 = zamVar == null ? -1 : zamVar.f15590a;
        this.f15597d.set(null);
        mo8017l(connectionResult, i2);
    }
}
