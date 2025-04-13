package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfl implements zzbi {

    /* renamed from: a */
    public final SharedPreferences.Editor f16501a;

    public zzfl(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (str == null) {
            this.f16501a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f16501a = applicationContext.getSharedPreferences(str, 0).edit();
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbi
    /* renamed from: a */
    public final void mo8828a(zzky zzkyVar) throws IOException {
        if (!this.f16501a.putString("GenericIdpKeyset", zznd.m9335a(zzkyVar.mo8621a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbi
    /* renamed from: b */
    public final void mo8829b(zzjj zzjjVar) throws IOException {
        if (!this.f16501a.putString("GenericIdpKeyset", zznd.m9335a(zzjjVar.mo8621a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
