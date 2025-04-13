package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzaq implements zzbi {

    /* renamed from: a */
    public final OutputStream f16391a;

    public zzaq(OutputStream outputStream) {
        this.f16391a = outputStream;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbi
    /* renamed from: a */
    public final void mo8828a(zzky zzkyVar) throws IOException {
        try {
            OutputStream outputStream = this.f16391a;
            Objects.requireNonNull(zzkyVar);
            int mo8619D = zzkyVar.mo8619D();
            Logger logger = zzzf.f17142b;
            if (mo8619D > 4096) {
                mo8619D = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            zzzd zzzdVar = new zzzd(outputStream, mo8619D);
            zzkyVar.m9655i(zzzdVar);
            if (zzzdVar.f17136f > 0) {
                zzzdVar.m9606E();
            }
        } finally {
            this.f16391a.close();
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbi
    /* renamed from: b */
    public final void mo8829b(zzjj zzjjVar) throws IOException {
        throw null;
    }
}
