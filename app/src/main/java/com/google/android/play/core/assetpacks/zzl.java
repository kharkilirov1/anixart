package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzl implements AssetPackManager {

    /* renamed from: f */
    public static final com.google.android.play.core.internal.zzag f20050f = new com.google.android.play.core.internal.zzag("AssetPackManager");

    /* renamed from: a */
    public final zzbh f20051a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzco<zzy> f20052b;

    /* renamed from: c */
    public final zzbb f20053c;

    /* renamed from: d */
    public final zzbx f20054d;

    /* renamed from: e */
    public final com.google.android.play.core.internal.zzco<Executor> f20055e;

    public zzl(zzbh zzbhVar, com.google.android.play.core.internal.zzco<zzy> zzcoVar, zzbb zzbbVar, com.google.android.play.core.splitinstall.zzs zzsVar, zzde zzdeVar, zzco zzcoVar2, zzbx zzbxVar, com.google.android.play.core.internal.zzco<Executor> zzcoVar3, com.google.android.play.core.common.zza zzaVar, zzeb zzebVar) {
        new Handler(Looper.getMainLooper());
        this.f20051a = zzbhVar;
        this.f20052b = zzcoVar;
        this.f20053c = zzbbVar;
        this.f20054d = zzbxVar;
        this.f20055e = zzcoVar3;
    }

    /* renamed from: a */
    public final void m10818a(boolean z) {
        boolean z2;
        zzbb zzbbVar = this.f20053c;
        synchronized (zzbbVar) {
            z2 = zzbbVar.f20166e != null;
        }
        zzbb zzbbVar2 = this.f20053c;
        synchronized (zzbbVar2) {
            zzbbVar2.f20167f = z;
            zzbbVar2.m10926b();
        }
        if (!z || z2) {
            return;
        }
        this.f20055e.mo10897u().execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzl zzlVar = zzl.this;
                zzy mo10897u = zzlVar.f20052b.mo10897u();
                zzbh zzbhVar = zzlVar.f20051a;
                Objects.requireNonNull(zzbhVar);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                try {
                    Iterator it = ((ArrayList) zzbhVar.m10735j()).iterator();
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        String m10746w = zzbhVar.m10746w(file.getName());
                        zzbm zzbmVar = null;
                        if (m10746w != null) {
                            File file2 = new File(m10746w, "assets");
                            if (file2.isDirectory()) {
                                zzbmVar = new zzbm(0, m10746w, file2.getCanonicalPath());
                            } else {
                                zzbh.f19740c.m10835b("Failed to find assets directory: %s", file2);
                            }
                        }
                        if (zzbmVar != null) {
                            hashMap2.put(file.getName(), zzbmVar);
                        }
                    }
                } catch (IOException e2) {
                    zzbh.f19740c.m10835b("Could not process directory while scanning installed packs: %s", e2);
                }
                for (String str : hashMap2.keySet()) {
                    hashMap.put(str, Long.valueOf(zzbhVar.m10737n(str)));
                }
                Task<List<String>> mo10713e = mo10897u.mo10713e(hashMap);
                Executor mo10897u2 = zzlVar.f20055e.mo10897u();
                final zzbh zzbhVar2 = zzlVar.f20051a;
                Objects.requireNonNull(zzbhVar2);
                mo10713e.mo11000d(mo10897u2, new OnSuccessListener() { // from class: com.google.android.play.core.assetpacks.zzg
                    @Override // com.google.android.play.core.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        zzbh zzbhVar3 = zzbh.this;
                        List list = (List) obj;
                        int m10797a = zzbhVar3.f19744b.m10797a();
                        Iterator it2 = ((ArrayList) zzbhVar3.m10735j()).iterator();
                        while (it2.hasNext()) {
                            File file3 = (File) it2.next();
                            if (!list.contains(file3.getName()) && zzbh.m10724e(file3, true) != m10797a) {
                                zzbh.m10726l(file3);
                            }
                        }
                    }
                });
                mo10713e.mo10998b(zzlVar.f20055e.mo10897u(), new OnFailureListener() { // from class: com.google.android.play.core.assetpacks.zzf
                    @Override // com.google.android.play.core.tasks.OnFailureListener
                    /* renamed from: a */
                    public final void mo10817a(Exception exc) {
                        zzl.f20050f.m10838e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
                    }
                });
            }
        });
    }
}
