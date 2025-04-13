package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbb extends com.google.android.play.core.listener.zzc<AssetPackState> {

    /* renamed from: g */
    public final zzde f19720g;

    /* renamed from: h */
    public final zzcl f19721h;

    /* renamed from: i */
    public final com.google.android.play.core.internal.zzco<zzy> f19722i;

    /* renamed from: j */
    public final zzbx f19723j;

    /* renamed from: k */
    public final zzco f19724k;

    /* renamed from: l */
    public final com.google.android.play.core.internal.zzco<Executor> f19725l;

    /* renamed from: m */
    public final com.google.android.play.core.internal.zzco<Executor> f19726m;

    /* renamed from: n */
    public final zzeb f19727n;

    /* renamed from: o */
    public final Handler f19728o;

    public zzbb(Context context, zzde zzdeVar, zzcl zzclVar, com.google.android.play.core.internal.zzco<zzy> zzcoVar, zzco zzcoVar2, zzbx zzbxVar, com.google.android.play.core.internal.zzco<Executor> zzcoVar3, com.google.android.play.core.internal.zzco<Executor> zzcoVar4, zzeb zzebVar) {
        super(new com.google.android.play.core.internal.zzag("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f19728o = new Handler(Looper.getMainLooper());
        this.f19720g = zzdeVar;
        this.f19721h = zzclVar;
        this.f19722i = zzcoVar;
        this.f19724k = zzcoVar2;
        this.f19723j = zzbxVar;
        this.f19725l = zzcoVar3;
        this.f19726m = zzcoVar4;
        this.f19727n = zzebVar;
    }

    @Override // com.google.android.play.core.listener.zzc
    /* renamed from: a */
    public final void mo10657a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f20162a.m10835b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f20162a.m10835b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState m10674i = AssetPackState.m10674i(bundleExtra, stringArrayList.get(0), this.f19724k, this.f19727n, new zzbe() { // from class: com.google.android.play.core.assetpacks.zzbd
            @Override // com.google.android.play.core.assetpacks.zzbe
            /* renamed from: a */
            public final int mo10719a(int i2, String str) {
                return i2;
            }
        });
        this.f20162a.m10834a("ListenerRegistryBroadcastReceiver.onReceive: %s", m10674i);
        if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
            Objects.requireNonNull(this.f19723j);
        }
        this.f19726m.mo10897u().execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.zzaz
            @Override // java.lang.Runnable
            public final void run() {
                zzbb zzbbVar = zzbb.this;
                final Bundle bundle = bundleExtra;
                AssetPackState assetPackState = m10674i;
                final zzde zzdeVar = zzbbVar.f19720g;
                Objects.requireNonNull(zzdeVar);
                if (((Boolean) zzdeVar.m10780c(new zzdd() { // from class: com.google.android.play.core.assetpacks.zzct
                    @Override // com.google.android.play.core.assetpacks.zzdd
                    /* renamed from: u */
                    public final Object mo10776u() {
                        zzde zzdeVar2 = zzde.this;
                        Bundle bundle2 = bundle;
                        Objects.requireNonNull(zzdeVar2);
                        int i2 = bundle2.getInt("session_id");
                        if (i2 == 0) {
                            return Boolean.TRUE;
                        }
                        Map<Integer, zzdb> map = zzdeVar2.f19914e;
                        Integer valueOf = Integer.valueOf(i2);
                        if (!map.containsKey(valueOf)) {
                            return Boolean.TRUE;
                        }
                        if (zzdeVar2.f19914e.get(valueOf).f19902c.f19897d == 6) {
                            return Boolean.FALSE;
                        }
                        return Boolean.valueOf(!zzbg.m10722c(r0.f19902c.f19897d, bundle2.getInt(com.google.android.play.core.assetpacks.model.zzb.m10688a("status", zzde.m10777d(bundle2)))));
                    }
                })).booleanValue()) {
                    zzbbVar.f19728o.post(new zzba(zzbbVar, assetPackState));
                    zzbbVar.f19722i.mo10897u().mo10716l();
                }
            }
        });
        this.f19725l.mo10897u().execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.zzay
            @Override // java.lang.Runnable
            public final void run() {
                zzbb zzbbVar = zzbb.this;
                final Bundle bundle = bundleExtra;
                final zzde zzdeVar = zzbbVar.f19720g;
                Objects.requireNonNull(zzdeVar);
                if (!((Boolean) zzdeVar.m10780c(new zzdd() { // from class: com.google.android.play.core.assetpacks.zzcu
                    @Override // com.google.android.play.core.assetpacks.zzdd
                    /* renamed from: u */
                    public final Object mo10776u() {
                        zzdc zzdcVar;
                        zzde zzdeVar2 = zzde.this;
                        Bundle bundle2 = bundle;
                        Objects.requireNonNull(zzdeVar2);
                        int i2 = bundle2.getInt("session_id");
                        if (i2 == 0) {
                            return Boolean.FALSE;
                        }
                        Map<Integer, zzdb> map = zzdeVar2.f19914e;
                        Integer valueOf = Integer.valueOf(i2);
                        boolean z = false;
                        if (map.containsKey(valueOf)) {
                            zzdb m10779b = zzdeVar2.m10779b(i2);
                            int i3 = bundle2.getInt(com.google.android.play.core.assetpacks.model.zzb.m10688a("status", m10779b.f19902c.f19894a));
                            if (zzbg.m10722c(m10779b.f19902c.f19897d, i3)) {
                                zzde.f19909g.m10834a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(m10779b.f19902c.f19897d));
                                zzda zzdaVar = m10779b.f19902c;
                                String str = zzdaVar.f19894a;
                                int i4 = zzdaVar.f19897d;
                                if (i4 == 4) {
                                    zzdeVar2.f19911b.mo10897u().mo10709a(i2, str);
                                } else if (i4 == 5) {
                                    zzdeVar2.f19911b.mo10897u().mo10712d(i2);
                                } else if (i4 == 6) {
                                    zzdeVar2.f19911b.mo10897u().mo10714f(Arrays.asList(str));
                                }
                            } else {
                                m10779b.f19902c.f19897d = i3;
                                if (zzbg.m10723d(i3)) {
                                    zzdeVar2.m10778a(i2);
                                    zzdeVar2.f19912c.m10775b(m10779b.f19902c.f19894a);
                                } else {
                                    for (zzdc zzdcVar2 : m10779b.f19902c.f19899f) {
                                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(com.google.android.play.core.assetpacks.model.zzb.m10689b("chunk_intents", m10779b.f19902c.f19894a, zzdcVar2.f19903a));
                                        if (parcelableArrayList != null) {
                                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                                    zzdcVar2.f19906d.get(i5).f19892a = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            String m10777d = zzde.m10777d(bundle2);
                            long j2 = bundle2.getLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("pack_version", m10777d));
                            String string = bundle2.getString(com.google.android.play.core.assetpacks.model.zzb.m10688a("pack_version_tag", m10777d), "");
                            int i6 = bundle2.getInt(com.google.android.play.core.assetpacks.model.zzb.m10688a("status", m10777d));
                            long j3 = bundle2.getLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("total_bytes_to_download", m10777d));
                            List<String> stringArrayList2 = bundle2.getStringArrayList(com.google.android.play.core.assetpacks.model.zzb.m10688a("slice_ids", m10777d));
                            ArrayList arrayList = new ArrayList();
                            if (stringArrayList2 == null) {
                                stringArrayList2 = Collections.emptyList();
                            }
                            for (String str2 : stringArrayList2) {
                                List parcelableArrayList2 = bundle2.getParcelableArrayList(com.google.android.play.core.assetpacks.model.zzb.m10689b("chunk_intents", m10777d, str2));
                                ArrayList arrayList2 = new ArrayList();
                                if (parcelableArrayList2 == null) {
                                    parcelableArrayList2 = Collections.emptyList();
                                }
                                Iterator it = parcelableArrayList2.iterator();
                                while (it.hasNext()) {
                                    if (((Intent) it.next()) != null) {
                                        z = true;
                                    }
                                    arrayList2.add(new zzcz(z));
                                    z = false;
                                }
                                String string2 = bundle2.getString(com.google.android.play.core.assetpacks.model.zzb.m10689b("uncompressed_hash_sha256", m10777d, str2));
                                long j4 = bundle2.getLong(com.google.android.play.core.assetpacks.model.zzb.m10689b("uncompressed_size", m10777d, str2));
                                int i7 = bundle2.getInt(com.google.android.play.core.assetpacks.model.zzb.m10689b("patch_format", m10777d, str2), 0);
                                if (i7 != 0) {
                                    zzdcVar = new zzdc(str2, string2, j4, arrayList2, 0, i7);
                                    z = false;
                                } else {
                                    z = false;
                                    zzdcVar = new zzdc(str2, string2, j4, arrayList2, bundle2.getInt(com.google.android.play.core.assetpacks.model.zzb.m10689b("compression_format", m10777d, str2), 0), 0);
                                }
                                arrayList.add(zzdcVar);
                            }
                            zzdeVar2.f19914e.put(Integer.valueOf(i2), new zzdb(i2, bundle2.getInt("app_version_code"), new zzda(m10777d, j2, i6, j3, arrayList, string)));
                        }
                        return Boolean.TRUE;
                    }
                })).booleanValue()) {
                    return;
                }
                zzcl zzclVar = zzbbVar.f19721h;
                Objects.requireNonNull(zzclVar);
                com.google.android.play.core.internal.zzag zzagVar = zzcl.f19847k;
                zzagVar.m10834a("Run extractor loop", new Object[0]);
                if (!zzclVar.f19857j.compareAndSet(false, true)) {
                    zzagVar.m10838e("runLoop already looping; return", new Object[0]);
                    return;
                }
                while (true) {
                    zzdg zzdgVar = null;
                    try {
                        zzdgVar = zzclVar.f19856i.m10781a();
                    } catch (zzck e2) {
                        zzcl.f19847k.m10835b("Error while getting next extraction task: %s", e2.getMessage());
                        if (e2.f19846b >= 0) {
                            zzclVar.f19855h.mo10897u().mo10712d(e2.f19846b);
                            zzclVar.m10773a(e2.f19846b, e2);
                        }
                    }
                    if (zzdgVar == null) {
                        zzclVar.f19857j.set(false);
                        return;
                    }
                    try {
                        if (zzdgVar instanceof zzce) {
                            zzclVar.f19849b.m10770a((zzce) zzdgVar);
                        } else if (zzdgVar instanceof zzeq) {
                            zzclVar.f19850c.m10814a((zzeq) zzdgVar);
                        } else if (zzdgVar instanceof zzdt) {
                            zzclVar.f19851d.m10793a((zzdt) zzdgVar);
                        } else if (zzdgVar instanceof zzdw) {
                            zzclVar.f19852e.m10794a((zzdw) zzdgVar);
                        } else if (zzdgVar instanceof zzef) {
                            zzclVar.f19853f.m10798a((zzef) zzdgVar);
                        } else if (zzdgVar instanceof zzei) {
                            zzclVar.f19854g.m10799a((zzei) zzdgVar);
                        } else {
                            zzcl.f19847k.m10835b("Unknown task type: %s", zzdgVar.getClass().getName());
                        }
                    } catch (Exception e3) {
                        zzcl.f19847k.m10835b("Error during extraction task: %s", e3.getMessage());
                        zzclVar.f19855h.mo10897u().mo10712d(zzdgVar.f19920a);
                        zzclVar.m10773a(zzdgVar.f19920a, e3);
                    }
                }
            }
        });
    }
}
