package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzah;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GmsSignatureVerifier {
    static {
        zzx zzxVar = new zzx();
        zzxVar.f15949a = "com.google.android.gms";
        zzxVar.f15950b = 204200000L;
        zzk zzkVar = zzm.f15930d;
        Object[] objArr = {zzkVar.mo8254t(), zzm.f15928b.mo8254t()};
        zzah.m8557a(objArr, 2);
        zzag m8553t = zzag.m8553t(objArr, 2);
        Objects.requireNonNull(m8553t, "null reference");
        zzxVar.f15951c = zzag.m8554u(m8553t);
        zzk zzkVar2 = zzm.f15929c;
        Object[] objArr2 = {zzkVar2.mo8254t(), zzm.f15927a.mo8254t()};
        zzah.m8557a(objArr2, 2);
        zzag m8553t2 = zzag.m8553t(objArr2, 2);
        Objects.requireNonNull(m8553t2, "null reference");
        zzxVar.f15952d = zzag.m8554u(m8553t2);
        zzxVar.m8256a();
        zzx zzxVar2 = new zzx();
        zzxVar2.f15949a = "com.android.vending";
        zzxVar2.f15950b = 82240000L;
        Object[] objArr3 = {zzkVar.mo8254t()};
        zzah.m8557a(objArr3, 1);
        zzag m8553t3 = zzag.m8553t(objArr3, 1);
        Objects.requireNonNull(m8553t3, "null reference");
        zzxVar2.f15951c = zzag.m8554u(m8553t3);
        Object[] objArr4 = {zzkVar2.mo8254t()};
        zzah.m8557a(objArr4, 1);
        zzag m8553t4 = zzag.m8553t(objArr4, 1);
        Objects.requireNonNull(m8553t4, "null reference");
        zzxVar2.f15952d = zzag.m8554u(m8553t4);
        zzxVar2.m8256a();
    }
}
