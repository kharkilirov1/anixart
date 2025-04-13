package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzaj;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzse extends zzut {
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        Objects.requireNonNull(zzttVar);
        Objects.requireNonNull((Object) null, "null reference");
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        List list = this.f16871k.f16919g;
        if (list == null) {
            zzao zzaoVar = zzal.f16388c;
            list = zzam.f16389e;
        }
        zzaj zzajVar = new zzaj(list);
        this.f16875o = true;
        this.f16877q.m9435a(zzajVar, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "fetchSignInMethodsForEmail";
    }
}
