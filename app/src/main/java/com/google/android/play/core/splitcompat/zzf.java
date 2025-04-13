package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzf implements zzk {

    /* renamed from: a */
    public final /* synthetic */ zzg f20197a;

    public zzf(zzg zzgVar) {
        this.f20197a = zzgVar;
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    /* renamed from: a */
    public final void mo10953a(zzl zzlVar, File file, boolean z) throws IOException {
        this.f20197a.f20199b.add(file);
        if (z) {
            return;
        }
        this.f20197a.f20200c.set(false);
    }
}
