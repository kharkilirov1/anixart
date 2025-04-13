package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
abstract class zza extends zzc<Boolean> {

    /* renamed from: d */
    public final int f15785d;

    /* renamed from: e */
    @Nullable
    public final Bundle f15786e;

    /* renamed from: f */
    public final /* synthetic */ BaseGmsClient f15787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zza(BaseGmsClient baseGmsClient, @Nullable int i2, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.f15787f = baseGmsClient;
        this.f15785d = i2;
        this.f15786e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8192a(Boolean bool) {
        if (this.f15785d != 0) {
            this.f15787f.m8095I(1, null);
            Bundle bundle = this.f15786e;
            mo8194d(new ConnectionResult(this.f15785d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (mo8195e()) {
                return;
            }
            this.f15787f.m8095I(1, null);
            mo8194d(new ConnectionResult(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.zzc
    /* renamed from: b */
    public final void mo8193b() {
    }

    /* renamed from: d */
    public abstract void mo8194d(ConnectionResult connectionResult);

    /* renamed from: e */
    public abstract boolean mo8195e();
}
