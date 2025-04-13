package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzbs extends zzaw {

    /* renamed from: a */
    public final String f16414a;

    /* renamed from: b */
    public final int f16415b;

    public /* synthetic */ zzbs(String str, int i2) {
        this.f16414a = str;
        this.f16415b = i2;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f16414a;
        int i2 = this.f16415b - 2;
        objArr[1] = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
