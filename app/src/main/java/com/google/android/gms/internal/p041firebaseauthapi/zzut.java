package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzao;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzut implements zzuv {

    /* renamed from: a */
    public final int f16861a;

    /* renamed from: c */
    public FirebaseApp f16863c;

    /* renamed from: d */
    public FirebaseUser f16864d;

    /* renamed from: e */
    public Object f16865e;

    /* renamed from: f */
    public zzao f16866f;

    /* renamed from: h */
    public Executor f16868h;

    /* renamed from: i */
    public zzwq f16869i;

    /* renamed from: j */
    public zzwj f16870j;

    /* renamed from: k */
    public zzvv f16871k;

    /* renamed from: l */
    public zzxb f16872l;

    /* renamed from: m */
    public AuthCredential f16873m;

    /* renamed from: n */
    public zzqe f16874n;

    /* renamed from: o */
    public boolean f16875o;

    /* renamed from: p */
    @VisibleForTesting
    public Object f16876p;

    /* renamed from: q */
    public zzus f16877q;

    /* renamed from: b */
    @VisibleForTesting
    public final zzuq f16862b = new zzuq(this);

    /* renamed from: g */
    public final List f16867g = new ArrayList();

    public zzut(int i2) {
        this.f16861a = i2;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ void m9436f(zzut zzutVar) {
        zzutVar.mo9354b();
        Preconditions.m8134i(zzutVar.f16875o, "no success or failure set on method implementation");
    }

    /* renamed from: b */
    public abstract void mo9354b();

    /* renamed from: c */
    public final zzut m9437c(Object obj) {
        Preconditions.m8132g(obj, "external callback cannot be null");
        this.f16865e = obj;
        return this;
    }

    /* renamed from: d */
    public final zzut m9438d(FirebaseApp firebaseApp) {
        Preconditions.m8132g(firebaseApp, "firebaseApp cannot be null");
        this.f16863c = firebaseApp;
        return this;
    }

    /* renamed from: e */
    public final zzut m9439e(FirebaseUser firebaseUser) {
        Preconditions.m8132g(firebaseUser, "firebaseUser cannot be null");
        this.f16864d = firebaseUser;
        return this;
    }

    /* renamed from: g */
    public final void m9440g(Object obj) {
        this.f16875o = true;
        this.f16876p = obj;
        this.f16877q.m9435a(obj, null);
    }
}
