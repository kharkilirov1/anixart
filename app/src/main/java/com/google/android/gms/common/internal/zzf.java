package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzf extends zza {

    /* renamed from: g */
    @Nullable
    public final IBinder f15802g;

    /* renamed from: h */
    public final /* synthetic */ BaseGmsClient f15803h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzf(BaseGmsClient baseGmsClient, @Nullable int i2, @Nullable IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i2, bundle);
        this.f15803h = baseGmsClient;
        this.f15802g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    /* renamed from: d */
    public final void mo8194d(ConnectionResult connectionResult) {
        BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener = this.f15803h.f15671u;
        if (baseOnConnectionFailedListener != null) {
            baseOnConnectionFailedListener.mo8114q(connectionResult);
        }
        this.f15803h.m8092C(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    /* renamed from: e */
    public final boolean mo8195e() {
        try {
            IBinder iBinder = this.f15802g;
            java.util.Objects.requireNonNull(iBinder, "null reference");
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f15803h.mo7879z().equals(interfaceDescriptor)) {
                String mo7879z = this.f15803h.mo7879z();
                Log.w("GmsClient", C0000a.m22s(new StringBuilder(String.valueOf(mo7879z).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", mo7879z, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface mo7878s = this.f15803h.mo7878s(this.f15802g);
            if (mo7878s == null || !(BaseGmsClient.m8089G(this.f15803h, 2, 4, mo7878s) || BaseGmsClient.m8089G(this.f15803h, 3, 4, mo7878s))) {
                return false;
            }
            BaseGmsClient baseGmsClient = this.f15803h;
            baseGmsClient.f15675y = null;
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.f15670t;
            if (baseConnectionCallbacks == null) {
                return true;
            }
            baseConnectionCallbacks.mo8113t(null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
