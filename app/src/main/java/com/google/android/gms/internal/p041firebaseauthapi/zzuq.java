package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzuq implements zztr {

    /* renamed from: a */
    public final /* synthetic */ zzut f16858a;

    public zzuq(zzut zzutVar) {
        this.f16858a = zzutVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: C */
    public final void mo9367C() throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 9, "Unexpected response type " + i2);
        zzut.m9436f(this.f16858a);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: a */
    public final void mo9368a(String str) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 8, "Unexpected response type " + i2);
        zzut zzutVar = this.f16858a;
        Objects.requireNonNull(zzutVar);
        zzutVar.f16875o = true;
        this.f16858a.f16868h.execute(new zzup(this, new zzun(str)));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: b */
    public final void mo9369b(String str) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 8, "Unexpected response type " + i2);
        Objects.requireNonNull(this.f16858a);
        this.f16858a.f16868h.execute(new zzup(this, new zzul(str)));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: c */
    public final void mo9370c() throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 6, "Unexpected response type " + i2);
        zzut.m9436f(this.f16858a);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: d */
    public final void mo9371d(String str) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 7, "Unexpected response type " + i2);
        zzut zzutVar = this.f16858a;
        Objects.requireNonNull(zzutVar);
        zzutVar.mo9354b();
        Preconditions.m8134i(zzutVar.f16875o, "no success or failure set on method implementation");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: e */
    public final void mo9372e(zzwq zzwqVar) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 1, "Unexpected response type: " + i2);
        zzut zzutVar = this.f16858a;
        zzutVar.f16869i = zzwqVar;
        zzutVar.mo9354b();
        Preconditions.m8134i(zzutVar.f16875o, "no success or failure set on method implementation");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: f */
    public final void mo9373f(zzwq zzwqVar, zzwj zzwjVar) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 2, "Unexpected response type: " + i2);
        zzut zzutVar = this.f16858a;
        zzutVar.f16869i = zzwqVar;
        zzutVar.f16870j = zzwjVar;
        zzutVar.mo9354b();
        Preconditions.m8134i(zzutVar.f16875o, "no success or failure set on method implementation");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: g */
    public final void mo9374g(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 8, "Unexpected response type " + i2);
        zzut zzutVar = this.f16858a;
        zzutVar.f16875o = true;
        zzutVar.f16868h.execute(new zzup(this, new zzum(phoneAuthCredential)));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: h */
    public final void mo9375h(Status status) throws RemoteException {
        String str = status.f15381d;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null);
            }
        }
        zzut zzutVar = this.f16858a;
        if (zzutVar.f16861a == 8) {
            zzutVar.f16875o = true;
            zzutVar.f16868h.execute(new zzup(this, new zzuo(status)));
        } else {
            zzao zzaoVar = zzutVar.f16866f;
            if (zzaoVar != null) {
                zzaoVar.mo12301o(status);
            }
            zzut zzutVar2 = this.f16858a;
            zzutVar2.f16875o = true;
            zzutVar2.f16877q.m9435a(null, status);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: i */
    public final void mo9376i(zzqe zzqeVar) {
        zzut zzutVar = this.f16858a;
        zzutVar.f16874n = zzqeVar;
        Status m12298a = zzai.m12298a("REQUIRES_SECOND_FACTOR_AUTH");
        zzutVar.f16875o = true;
        zzutVar.f16877q.m9435a(null, m12298a);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: j */
    public final void mo9377j(zzvv zzvvVar) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 3, "Unexpected response type " + i2);
        zzut zzutVar = this.f16858a;
        zzutVar.f16871k = zzvvVar;
        zzutVar.mo9354b();
        Preconditions.m8134i(zzutVar.f16875o, "no success or failure set on method implementation");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: k */
    public final void mo9378k(@Nullable zzxb zzxbVar) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 4, "Unexpected response type " + i2);
        zzut zzutVar = this.f16858a;
        zzutVar.f16872l = zzxbVar;
        zzutVar.mo9354b();
        Preconditions.m8134i(zzutVar.f16875o, "no success or failure set on method implementation");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: l */
    public final void mo9379l(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 2, "Unexpected response type " + i2);
        m9434n(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: m */
    public final void mo9380m(zzqc zzqcVar) {
        m9434n(zzqcVar.f16695b, zzqcVar.f16696c, zzqcVar.f16697d, zzqcVar.f16698e);
    }

    /* renamed from: n */
    public final void m9434n(Status status, AuthCredential authCredential, @Nullable String str, @Nullable String str2) {
        zzao zzaoVar = this.f16858a.f16866f;
        if (zzaoVar != null) {
            zzaoVar.mo12301o(status);
        }
        zzut zzutVar = this.f16858a;
        zzutVar.f16873m = authCredential;
        zzao zzaoVar2 = zzutVar.f16866f;
        if (zzaoVar2 != null) {
            zzaoVar2.mo12301o(status);
        }
        zzut zzutVar2 = this.f16858a;
        zzutVar2.f16875o = true;
        zzutVar2.f16877q.m9435a(null, status);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zztr
    /* renamed from: x */
    public final void mo9381x() throws RemoteException {
        int i2 = this.f16858a.f16861a;
        Preconditions.m8134i(i2 == 5, "Unexpected response type " + i2);
        zzut.m9436f(this.f16858a);
    }
}
