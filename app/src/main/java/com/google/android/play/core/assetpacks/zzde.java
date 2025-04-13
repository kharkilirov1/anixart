package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzde {

    /* renamed from: g */
    public static final com.google.android.play.core.internal.zzag f19909g = new com.google.android.play.core.internal.zzag("ExtractorSessionStoreView");

    /* renamed from: a */
    public final zzbh f19910a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzco<zzy> f19911b;

    /* renamed from: c */
    public final zzco f19912c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzco<Executor> f19913d;

    /* renamed from: e */
    public final Map<Integer, zzdb> f19914e = new HashMap();

    /* renamed from: f */
    public final ReentrantLock f19915f = new ReentrantLock();

    public zzde(zzbh zzbhVar, com.google.android.play.core.internal.zzco<zzy> zzcoVar, zzco zzcoVar2, com.google.android.play.core.internal.zzco<Executor> zzcoVar3) {
        this.f19910a = zzbhVar;
        this.f19911b = zzcoVar;
        this.f19912c = zzcoVar2;
        this.f19913d = zzcoVar3;
    }

    /* renamed from: d */
    public static String m10777d(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new zzck("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    /* renamed from: a */
    public final void m10778a(final int i2) {
        m10780c(new zzdd() { // from class: com.google.android.play.core.assetpacks.zzcr
            @Override // com.google.android.play.core.assetpacks.zzdd
            /* renamed from: u */
            public final Object mo10776u() {
                zzde zzdeVar = zzde.this;
                int i3 = i2;
                zzdb m10779b = zzdeVar.m10779b(i3);
                if (!zzbg.m10723d(m10779b.f19902c.f19897d)) {
                    throw new zzck(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i3)), i3);
                }
                zzbh zzbhVar = zzdeVar.f19910a;
                zzda zzdaVar = m10779b.f19902c;
                zzbhVar.m10729c(zzdaVar.f19894a, m10779b.f19901b, zzdaVar.f19895b);
                zzda zzdaVar2 = m10779b.f19902c;
                int i4 = zzdaVar2.f19897d;
                if (i4 != 5 && i4 != 6) {
                    return null;
                }
                zzbh zzbhVar2 = zzdeVar.f19910a;
                String str = zzdaVar2.f19894a;
                int i5 = m10779b.f19901b;
                long j2 = zzdaVar2.f19895b;
                if (!zzbhVar2.m10739p(str, i5, j2).exists()) {
                    return null;
                }
                zzbh.m10726l(zzbhVar2.m10739p(str, i5, j2));
                return null;
            }
        });
    }

    /* renamed from: b */
    public final zzdb m10779b(int i2) {
        Map<Integer, zzdb> map = this.f19914e;
        Integer valueOf = Integer.valueOf(i2);
        zzdb zzdbVar = map.get(valueOf);
        if (zzdbVar != null) {
            return zzdbVar;
        }
        throw new zzck(String.format("Could not find session %d while trying to get it", valueOf), i2);
    }

    /* renamed from: c */
    public final <T> T m10780c(zzdd<T> zzddVar) {
        try {
            this.f19915f.lock();
            return zzddVar.mo10776u();
        } finally {
            this.f19915f.unlock();
        }
    }
}
