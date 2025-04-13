package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzh implements zzj {

    /* renamed from: a */
    public final /* synthetic */ Set f20202a;

    /* renamed from: b */
    public final /* synthetic */ zzs f20203b;

    /* renamed from: c */
    public final /* synthetic */ zzm f20204c;

    public zzh(zzm zzmVar, Set set, zzs zzsVar) {
        this.f20204c = zzmVar;
        this.f20202a = set;
        this.f20203b = zzsVar;
    }

    @Override // com.google.android.play.core.splitcompat.zzj
    /* renamed from: a */
    public final void mo10954a(ZipFile zipFile, Set<zzl> set) throws IOException {
        Set set2 = this.f20202a;
        zzm zzmVar = this.f20204c;
        zzs zzsVar = this.f20203b;
        Pattern pattern = zzm.f20210b;
        HashSet hashSet = new HashSet();
        zzmVar.m10957c(zzsVar, set, new zzi(hashSet, zzsVar, zipFile));
        set2.addAll(hashSet);
    }
}
