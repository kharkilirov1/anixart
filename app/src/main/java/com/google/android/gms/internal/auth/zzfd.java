package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfd extends zzfe {
    public zzfd() {
    }

    public /* synthetic */ zzfd(zzfb zzfbVar) {
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    /* renamed from: a */
    public final void mo8422a(Object obj, long j2) {
        ((zzeu) zzgz.m8513f(obj, j2)).mo8348w();
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    /* renamed from: b */
    public final <E> void mo8423b(Object obj, Object obj2, long j2) {
        zzeu zzeuVar = (zzeu) zzgz.m8513f(obj, j2);
        zzeu zzeuVar2 = (zzeu) zzgz.m8513f(obj2, j2);
        int size = zzeuVar.size();
        int size2 = zzeuVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzeuVar.mo8347v()) {
                zzeuVar = zzeuVar.mo8364c(size2 + size);
            }
            zzeuVar.addAll(zzeuVar2);
        }
        if (size > 0) {
            zzeuVar2 = zzeuVar;
        }
        zzgz.f16181c.m8507o(obj, j2, zzeuVar2);
    }
}
