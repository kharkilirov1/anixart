package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.PhoneAuthCredential;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public class zzts {

    /* renamed from: a */
    public final zztr f16819a;

    /* renamed from: b */
    public final Logger f16820b;

    public zzts(zztr zztrVar, Logger logger) {
        Objects.requireNonNull(zztrVar, "null reference");
        this.f16819a = zztrVar;
        Objects.requireNonNull(logger, "null reference");
        this.f16820b = logger;
    }

    /* renamed from: a */
    public final void m9382a(String str) {
        try {
            this.f16819a.mo9368a(str);
        } catch (RemoteException e2) {
            Logger logger = this.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending auto retrieval timeout response.", new Object[0]), e2);
        }
    }

    /* renamed from: b */
    public void mo9383b(String str) {
        try {
            this.f16819a.mo9369b(str);
        } catch (RemoteException e2) {
            Logger logger = this.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending send verification code response.", new Object[0]), e2);
        }
    }

    /* renamed from: c */
    public final void m9384c(zzqe zzqeVar) {
        try {
            this.f16819a.mo9376i(zzqeVar);
        } catch (RemoteException e2) {
            Logger logger = this.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending failure result for mfa", new Object[0]), e2);
        }
    }

    /* renamed from: d */
    public void mo9385d(Status status) {
        try {
            this.f16819a.mo9375h(status);
        } catch (RemoteException e2) {
            Logger logger = this.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending failure result.", new Object[0]), e2);
        }
    }

    /* renamed from: e */
    public final void m9386e(zzwq zzwqVar, zzwj zzwjVar) {
        try {
            this.f16819a.mo9373f(zzwqVar, zzwjVar);
        } catch (RemoteException e2) {
            Logger logger = this.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending get token and account info user response", new Object[0]), e2);
        }
    }

    /* renamed from: f */
    public final void m9387f(@Nullable zzxb zzxbVar) {
        try {
            this.f16819a.mo9378k(zzxbVar);
        } catch (RemoteException e2) {
            Logger logger = this.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending password reset response.", new Object[0]), e2);
        }
    }

    /* renamed from: g */
    public final void m9388g() {
        try {
            this.f16819a.mo9367C();
        } catch (RemoteException e2) {
            Logger logger = this.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when setting FirebaseUI Version", new Object[0]), e2);
        }
    }

    /* renamed from: h */
    public final void m9389h(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.f16819a.mo9374g(phoneAuthCredential);
        } catch (RemoteException e2) {
            Logger logger = this.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending verification completed response.", new Object[0]), e2);
        }
    }
}
