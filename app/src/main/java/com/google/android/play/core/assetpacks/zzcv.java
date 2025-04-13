package com.google.android.play.core.assetpacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcv implements zzdd {

    /* renamed from: a */
    public final /* synthetic */ zzde f19884a;

    /* renamed from: b */
    public final /* synthetic */ String f19885b;

    /* renamed from: c */
    public final /* synthetic */ int f19886c;

    /* renamed from: d */
    public final /* synthetic */ long f19887d;

    public /* synthetic */ zzcv(zzde zzdeVar, String str, int i2, long j2) {
        this.f19884a = zzdeVar;
        this.f19885b = str;
        this.f19886c = i2;
        this.f19887d = j2;
    }

    @Override // com.google.android.play.core.assetpacks.zzdd
    /* renamed from: u */
    public final Object mo10776u() {
        final zzde zzdeVar = this.f19884a;
        String str = this.f19885b;
        int i2 = this.f19886c;
        long j2 = this.f19887d;
        Objects.requireNonNull(zzdeVar);
        final List asList = Arrays.asList(str);
        zzdb zzdbVar = (zzdb) ((Map) zzdeVar.m10780c(new zzdd() { // from class: com.google.android.play.core.assetpacks.zzcx
            @Override // com.google.android.play.core.assetpacks.zzdd
            /* renamed from: u */
            public final Object mo10776u() {
                zzde zzdeVar2 = zzde.this;
                List list = asList;
                Objects.requireNonNull(zzdeVar2);
                HashMap hashMap = new HashMap();
                for (zzdb zzdbVar2 : zzdeVar2.f19914e.values()) {
                    String str2 = zzdbVar2.f19902c.f19894a;
                    if (list.contains(str2)) {
                        zzdb zzdbVar3 = (zzdb) hashMap.get(str2);
                        if ((zzdbVar3 == null ? -1 : zzdbVar3.f19900a) < zzdbVar2.f19900a) {
                            hashMap.put(str2, zzdbVar2);
                        }
                    }
                }
                return hashMap;
            }
        })).get(str);
        if (zzdbVar == null || zzbg.m10723d(zzdbVar.f19902c.f19897d)) {
            zzde.f19909g.m10835b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        zzdeVar.f19910a.m10729c(str, i2, j2);
        zzdbVar.f19902c.f19897d = 4;
        return null;
    }
}
