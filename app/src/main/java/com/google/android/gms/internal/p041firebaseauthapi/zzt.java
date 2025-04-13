package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzt extends zzq implements Serializable {

    /* renamed from: b */
    public final Pattern f16811b;

    public zzt(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f16811b = pattern;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzq
    /* renamed from: a */
    public final zzp mo9344a(CharSequence charSequence) {
        return new zzs(this.f16811b.matcher(charSequence));
    }

    public final String toString() {
        return this.f16811b.toString();
    }
}
