package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzao extends zzal<List<String>> {

    /* renamed from: c */
    public final /* synthetic */ zzaw f19684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzaw zzawVar, com.google.android.play.core.tasks.zzi<List<String>> zziVar) {
        super(zzawVar, zziVar);
        this.f19684c = zzawVar;
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    /* renamed from: J */
    public final void mo10693J(List<Bundle> list) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onGetSessionStates", new Object[0]);
        zzaw zzawVar = this.f19684c;
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = ((zzbo) AssetPackStates.m10684c(it.next(), zzawVar.f19699b, zzawVar.f19700c, new ArrayList(), zzbf.f19739a)).f19763b.values().iterator().next();
            if (next == null) {
                zzaw.f19696g.m10835b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (zzbg.m10720a(next.mo10678d())) {
                arrayList.add(next.mo10677c());
            }
        }
        this.f19682a.m11015d(arrayList);
    }
}
