package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzge extends zzgl {
    public zzge(int i2) {
        super(i2);
    }

    @Override // com.google.android.gms.internal.auth.zzgl
    /* renamed from: a */
    public final void mo8474a() {
        if (!this.f16167e) {
            for (int i2 = 0; i2 < m8476b(); i2++) {
                Map.Entry m8478d = m8478d(i2);
                if (((zzek) m8478d.getKey()).m8389v()) {
                    m8478d.setValue(Collections.unmodifiableList((List) m8478d.getValue()));
                }
            }
            for (Map.Entry entry : this.f16166d.isEmpty() ? zzgh.f16154b : this.f16166d.entrySet()) {
                if (((zzek) entry.getKey()).m8389v()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo8474a();
    }
}
