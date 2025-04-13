package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzg implements zzj {

    /* renamed from: a */
    public final /* synthetic */ zzs f20198a;

    /* renamed from: b */
    public final /* synthetic */ Set f20199b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f20200c;

    /* renamed from: d */
    public final /* synthetic */ zzm f20201d;

    public zzg(zzm zzmVar, zzs zzsVar, Set set, AtomicBoolean atomicBoolean) {
        this.f20201d = zzmVar;
        this.f20198a = zzsVar;
        this.f20199b = set;
        this.f20200c = atomicBoolean;
    }

    @Override // com.google.android.play.core.splitcompat.zzj
    /* renamed from: a */
    public final void mo10954a(ZipFile zipFile, Set<zzl> set) throws IOException {
        zzm zzmVar = this.f20201d;
        zzs zzsVar = this.f20198a;
        zzf zzfVar = new zzf(this);
        Pattern pattern = zzm.f20210b;
        zzmVar.m10957c(zzsVar, set, zzfVar);
    }
}
