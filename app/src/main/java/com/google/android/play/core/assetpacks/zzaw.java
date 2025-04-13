package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzaw implements zzy {

    /* renamed from: g */
    public static final com.google.android.play.core.internal.zzag f19696g = new com.google.android.play.core.internal.zzag("AssetPackServiceImpl");

    /* renamed from: h */
    public static final Intent f19697h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final String f19698a;

    /* renamed from: b */
    public final zzco f19699b;

    /* renamed from: c */
    public final zzeb f19700c;

    /* renamed from: d */
    @Nullable
    public com.google.android.play.core.internal.zzas<com.google.android.play.core.internal.zzu> f19701d;

    /* renamed from: e */
    @Nullable
    public com.google.android.play.core.internal.zzas<com.google.android.play.core.internal.zzu> f19702e;

    /* renamed from: f */
    public final AtomicBoolean f19703f = new AtomicBoolean();

    public zzaw(Context context, zzco zzcoVar, zzeb zzebVar) {
        this.f19698a = context.getPackageName();
        this.f19699b = zzcoVar;
        this.f19700c = zzebVar;
        if (com.google.android.play.core.internal.zzch.m10889b(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            com.google.android.play.core.internal.zzag zzagVar = f19696g;
            Intent intent = f19697h;
            zzz zzzVar = new com.google.android.play.core.internal.zzan() { // from class: com.google.android.play.core.assetpacks.zzz
                @Override // com.google.android.play.core.internal.zzan
                /* renamed from: a */
                public final Object mo10661a(IBinder iBinder) {
                    int i2 = com.google.android.play.core.internal.zzt.f20160a;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
                    return queryLocalInterface instanceof com.google.android.play.core.internal.zzu ? (com.google.android.play.core.internal.zzu) queryLocalInterface : new com.google.android.play.core.internal.zzs(iBinder);
                }
            };
            this.f19701d = new com.google.android.play.core.internal.zzas<>(context2, zzagVar, "AssetPackService", intent, zzzVar, null);
            Context applicationContext2 = context.getApplicationContext();
            this.f19702e = new com.google.android.play.core.internal.zzas<>(applicationContext2 != null ? applicationContext2 : context, zzagVar, "AssetPackService-keepAlive", intent, zzzVar, null);
        }
        f19696g.m10834a("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: g */
    public static Bundle m10704g() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11002);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* renamed from: h */
    public static <T> Task<T> m10705h() {
        f19696g.m10835b("onError(%d)", -11);
        return Tasks.m11006b(new AssetPackException(-11));
    }

    /* renamed from: j */
    public static Bundle m10706j(int i2, String str, String str2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i2);
        bundle.putString("module_name", str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i3);
        return bundle;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ Bundle m10707k(Map map) {
        Bundle m10704g = m10704g();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        m10704g.putParcelableArrayList("installed_asset_module", arrayList);
        return m10704g;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ ArrayList m10708m(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: a */
    public final void mo10709a(int i2, String str) {
        m10715i(i2, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: b */
    public final Task<ParcelFileDescriptor> mo10710b(int i2, String str, String str2, int i3) {
        if (this.f19701d == null) {
            return m10705h();
        }
        f19696g.m10837d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i3), Integer.valueOf(i2));
        com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
        this.f19701d.m10842b(new zzaj(this, zziVar, i2, str, str2, i3, zziVar), zziVar);
        return zziVar.f20324a;
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: c */
    public final void mo10711c(int i2, String str, String str2, int i3) {
        if (this.f19701d == null) {
            throw new zzck("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f19696g.m10837d("notifyChunkTransferred", new Object[0]);
        com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
        this.f19701d.m10842b(new zzag(this, zziVar, i2, str, str2, i3, zziVar), zziVar);
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: d */
    public final void mo10712d(int i2) {
        if (this.f19701d == null) {
            throw new zzck("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f19696g.m10837d("notifySessionFailed", new Object[0]);
        com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
        this.f19701d.m10842b(new zzai(this, zziVar, i2, zziVar), zziVar);
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: e */
    public final Task<List<String>> mo10713e(Map<String, Long> map) {
        if (this.f19701d == null) {
            return m10705h();
        }
        f19696g.m10837d("syncPacks", new Object[0]);
        com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
        this.f19701d.m10842b(new zzae(this, zziVar, map, zziVar), zziVar);
        return zziVar.f20324a;
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: f */
    public final void mo10714f(List<String> list) {
        if (this.f19701d == null) {
            return;
        }
        f19696g.m10837d("cancelDownloads(%s)", list);
        com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
        this.f19701d.m10842b(new zzad(this, zziVar, list, zziVar), zziVar);
    }

    /* renamed from: i */
    public final void m10715i(int i2, String str, int i3) {
        if (this.f19701d == null) {
            throw new zzck("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f19696g.m10837d("notifyModuleCompleted", new Object[0]);
        com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
        this.f19701d.m10842b(new zzah(this, zziVar, i2, str, zziVar, i3), zziVar);
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: l */
    public final synchronized void mo10716l() {
        if (this.f19702e == null) {
            f19696g.m10838e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        com.google.android.play.core.internal.zzag zzagVar = f19696g;
        zzagVar.m10837d("keepAlive", new Object[0]);
        if (!this.f19703f.compareAndSet(false, true)) {
            zzagVar.m10837d("Service is already kept alive.", new Object[0]);
        } else {
            com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
            this.f19702e.m10842b(new zzak(this, zziVar, zziVar), zziVar);
        }
    }
}
