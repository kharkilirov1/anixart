package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabr extends zzacb {
    public zzabr(int i2) {
        super(i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacb
    /* renamed from: a */
    public final void mo8731a() {
        if (!this.f16342e) {
            for (int i2 = 0; i2 < m8733b(); i2++) {
                Map.Entry m8735d = m8735d(i2);
                if (((zzzo) m8735d.getKey()).m9637v()) {
                    m8735d.setValue(Collections.unmodifiableList((List) m8735d.getValue()));
                }
            }
            for (Map.Entry entry : this.f16341d.isEmpty() ? zzabu.f16328b : this.f16341d.entrySet()) {
                if (((zzzo) entry.getKey()).m9637v()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo8731a();
    }
}
