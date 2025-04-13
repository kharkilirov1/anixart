package com.google.android.gms.common.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzg extends zza {

    /* renamed from: g */
    public final /* synthetic */ BaseGmsClient f15804g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzg(BaseGmsClient baseGmsClient, int i2) {
        super(baseGmsClient, i2, null);
        this.f15804g = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.zza
    /* renamed from: d */
    public final void mo8194d(ConnectionResult connectionResult) {
        java.util.Objects.requireNonNull(this.f15804g);
        this.f15804g.f15665o.mo8025a(connectionResult);
        this.f15804g.m8092C(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    /* renamed from: e */
    public final boolean mo8195e() {
        this.f15804g.f15665o.mo8025a(ConnectionResult.f15313f);
        return true;
    }
}
