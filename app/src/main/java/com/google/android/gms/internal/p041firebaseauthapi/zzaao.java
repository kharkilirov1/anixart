package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzaao extends zzaaq {
    public zzaao() {
    }

    public /* synthetic */ zzaao(zzaan zzaanVar) {
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaq
    /* renamed from: a */
    public final List mo8595a(Object obj, long j2) {
        zzaac zzaacVar = (zzaac) zzacp.m8790j(obj, j2);
        if (zzaacVar.mo8573v()) {
            return zzaacVar;
        }
        int size = zzaacVar.size();
        zzaac mo8572c = zzaacVar.mo8572c(size == 0 ? 10 : size + size);
        zzacp.f16357c.m8780p(obj, j2, mo8572c);
        return mo8572c;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaq
    /* renamed from: b */
    public final void mo8596b(Object obj, long j2) {
        ((zzaac) zzacp.m8790j(obj, j2)).mo8574w();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaaq
    /* renamed from: c */
    public final void mo8597c(Object obj, Object obj2, long j2) {
        zzaac zzaacVar = (zzaac) zzacp.m8790j(obj, j2);
        zzaac zzaacVar2 = (zzaac) zzacp.m8790j(obj2, j2);
        int size = zzaacVar.size();
        int size2 = zzaacVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzaacVar.mo8573v()) {
                zzaacVar = zzaacVar.mo8572c(size2 + size);
            }
            zzaacVar.addAll(zzaacVar2);
        }
        if (size > 0) {
            zzaacVar2 = zzaacVar;
        }
        zzacp.f16357c.m8780p(obj, j2, zzaacVar2);
    }
}
