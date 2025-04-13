package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzym implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzyu zzyuVar = (zzyu) obj;
        zzyu zzyuVar2 = (zzyu) obj2;
        zzyl zzylVar = new zzyl(zzyuVar);
        zzyl zzylVar2 = new zzyl(zzyuVar2);
        while (zzylVar.hasNext() && zzylVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzylVar.m9509a() & 255).compareTo(Integer.valueOf(zzylVar2.m9509a() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzyuVar.mo9513d()).compareTo(Integer.valueOf(zzyuVar2.mo9513d()));
    }
}
