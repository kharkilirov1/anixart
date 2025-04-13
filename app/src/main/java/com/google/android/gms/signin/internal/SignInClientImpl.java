package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {

    /* renamed from: G */
    public final boolean f17204G;

    /* renamed from: H */
    public final ClientSettings f17205H;

    /* renamed from: I */
    public final Bundle f17206I;

    /* renamed from: J */
    @Nullable
    public final Integer f17207J;

    public SignInClientImpl(@NonNull Context context, @NonNull Looper looper, @NonNull ClientSettings clientSettings, @NonNull Bundle bundle, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f17204G = true;
        this.f17205H = clientSettings;
        this.f17206I = bundle;
        this.f17207J = clientSettings.f15688h;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    /* renamed from: k */
    public final void mo9686k(zae zaeVar) {
        try {
            Account account = this.f17205H.f15681a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount m7868b = "<<default account>>".equals(account.name) ? Storage.m7866a(this.f15659i).m7868b() : null;
            Integer num = this.f17207J;
            Objects.requireNonNull(num, "null reference");
            zat zatVar = new zat(account, num.intValue(), m7868b);
            zaf zafVar = (zaf) m8111y();
            zai zaiVar = new zai(1, zatVar);
            Parcel m8534i = zafVar.m8534i();
            com.google.android.gms.internal.base.zac.m8537b(m8534i, zaiVar);
            com.google.android.gms.internal.base.zac.m8538c(m8534i, zaeVar);
            zafVar.m8535q(12, m8534i);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zaeVar.mo8027k0(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    /* renamed from: n */
    public final void mo9687n(@NonNull IAccountAccessor iAccountAccessor, boolean z) {
        try {
            zaf zafVar = (zaf) m8111y();
            Integer num = this.f17207J;
            Objects.requireNonNull(num, "null reference");
            int intValue = num.intValue();
            Parcel m8534i = zafVar.m8534i();
            com.google.android.gms.internal.base.zac.m8538c(m8534i, iAccountAccessor);
            m8534i.writeInt(intValue);
            m8534i.writeInt(z ? 1 : 0);
            zafVar.m8535q(9, m8534i);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    /* renamed from: o */
    public final void mo9688o() {
        try {
            zaf zafVar = (zaf) m8111y();
            Integer num = this.f17207J;
            Objects.requireNonNull(num, "null reference");
            int intValue = num.intValue();
            Parcel m8534i = zafVar.m8534i();
            m8534i.writeInt(intValue);
            zafVar.m8535q(7, m8534i);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: q */
    public final boolean mo7946q() {
        return this.f17204G;
    }

    @Override // com.google.android.gms.signin.zae
    /* renamed from: r */
    public final void mo9689r() {
        m8100g(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: s */
    public final /* synthetic */ IInterface mo7878s(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zaf ? (zaf) queryLocalInterface : new zaf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: w */
    public final Bundle mo8109w() {
        if (!this.f15659i.getPackageName().equals(this.f17205H.f15685e)) {
            this.f17206I.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f17205H.f15685e);
        }
        return this.f17206I;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
}
