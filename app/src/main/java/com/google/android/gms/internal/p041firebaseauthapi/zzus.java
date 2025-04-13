package com.google.android.gms.internal.p041firebaseauthapi;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthMultiFactorException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.zzae;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzba;
import com.google.firebase.auth.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzus {

    /* renamed from: a */
    public final zzut f16859a;

    /* renamed from: b */
    public final TaskCompletionSource f16860b;

    public zzus(zzut zzutVar, TaskCompletionSource taskCompletionSource) {
        this.f16859a = zzutVar;
        this.f16860b = taskCompletionSource;
    }

    /* renamed from: a */
    public final void m9435a(Object obj, Status status) {
        FirebaseException firebaseAuthUserCollisionException;
        Preconditions.m8132g(this.f16860b, "completion source cannot be null");
        if (status == null) {
            this.f16860b.m9716b(obj);
            return;
        }
        zzut zzutVar = this.f16859a;
        if (zzutVar.f16874n == null) {
            if (zzutVar.f16873m == null) {
                this.f16860b.m9715a(zztu.m9397a(status));
                return;
            }
            TaskCompletionSource taskCompletionSource = this.f16860b;
            SparseArray sparseArray = zztu.f16824a;
            int i2 = status.f15380c;
            if (i2 == 17012 || i2 == 17007 || i2 == 17025) {
                Pair pair = (Pair) zztu.f16824a.get(i2);
                firebaseAuthUserCollisionException = new FirebaseAuthUserCollisionException(zztu.m9398b(i2), zztu.m9399c(pair != null ? (String) pair.second : "An internal error has occurred.", status));
            } else {
                firebaseAuthUserCollisionException = zztu.m9397a(status);
            }
            taskCompletionSource.m9715a(firebaseAuthUserCollisionException);
            return;
        }
        TaskCompletionSource taskCompletionSource2 = this.f16860b;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzutVar.f16863c);
        zzut zzutVar2 = this.f16859a;
        zzqe zzqeVar = zzutVar2.f16874n;
        FirebaseUser firebaseUser = ("reauthenticateWithCredential".equals(zzutVar2.mo9355u()) || "reauthenticateWithCredentialWithData".equals(this.f16859a.mo9355u())) ? this.f16859a.f16864d : null;
        SparseArray sparseArray2 = zztu.f16824a;
        Objects.requireNonNull(firebaseAuth);
        Objects.requireNonNull(zzqeVar);
        Pair pair2 = (Pair) zztu.f16824a.get(17078);
        String str = (String) pair2.first;
        String str2 = (String) pair2.second;
        List m12309b = zzba.m12309b(zzqeVar.f16700c);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) m12309b).iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        List m12309b2 = zzba.m12309b(zzqeVar.f16700c);
        String str3 = zzqeVar.f16699b;
        Preconditions.m8129d(str3);
        zzag zzagVar = new zzag();
        zzagVar.f22363d = new ArrayList();
        Iterator it2 = ((ArrayList) m12309b2).iterator();
        while (it2.hasNext()) {
            MultiFactorInfo multiFactorInfo2 = (MultiFactorInfo) it2.next();
            if (multiFactorInfo2 instanceof PhoneMultiFactorInfo) {
                zzagVar.f22363d.add((PhoneMultiFactorInfo) multiFactorInfo2);
            }
        }
        zzagVar.f22362c = str3;
        FirebaseApp firebaseApp = firebaseAuth.f22306a;
        firebaseApp.m12217a();
        taskCompletionSource2.m9715a(new FirebaseAuthMultiFactorException(str, str2, new zzae(arrayList, zzagVar, firebaseApp.f22260b, zzqeVar.f16701d, (zzx) firebaseUser)));
    }
}
