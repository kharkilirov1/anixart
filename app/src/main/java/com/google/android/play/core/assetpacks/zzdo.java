package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzdo implements zzy {

    /* renamed from: i */
    public static final com.google.android.play.core.internal.zzag f19937i = new com.google.android.play.core.internal.zzag("FakeAssetPackService");

    /* renamed from: j */
    public static final AtomicInteger f19938j = new AtomicInteger(1);

    /* renamed from: a */
    public final String f19939a;

    /* renamed from: b */
    public final zzbb f19940b;

    /* renamed from: c */
    public final zzco f19941c;

    /* renamed from: d */
    public final Context f19942d;

    /* renamed from: e */
    public final zzed f19943e;

    /* renamed from: f */
    public final com.google.android.play.core.internal.zzco<Executor> f19944f;

    /* renamed from: g */
    public final zzeb f19945g;

    /* renamed from: h */
    public final Handler f19946h = new Handler(Looper.getMainLooper());

    @VisibleForTesting
    public zzdo(File file, zzbb zzbbVar, zzco zzcoVar, Context context, zzed zzedVar, com.google.android.play.core.internal.zzco<Executor> zzcoVar2, zzeb zzebVar) {
        this.f19939a = file.getAbsolutePath();
        this.f19940b = zzbbVar;
        this.f19941c = zzcoVar;
        this.f19942d = context;
        this.f19943e = zzedVar;
        this.f19944f = zzcoVar2;
        this.f19945g = zzebVar;
    }

    @VisibleForTesting
    /* renamed from: g */
    public static long m10783g(@AssetPackStatus int i2, long j2) {
        if (i2 == 2) {
            return j2 / 2;
        }
        if (i2 == 3 || i2 == 4) {
            return j2;
        }
        return 0L;
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: a */
    public final void mo10709a(final int i2, final String str) {
        f19937i.m10837d("notifyModuleCompleted", new Object[0]);
        this.f19944f.mo10897u().execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.zzdk
            @Override // java.lang.Runnable
            public final void run() {
                zzdo zzdoVar = zzdo.this;
                int i3 = i2;
                String str2 = str;
                Objects.requireNonNull(zzdoVar);
                try {
                    zzdoVar.m10784h(i3, str2, 4);
                } catch (LocalTestingException e2) {
                    zzdo.f19937i.m10838e("notifyModuleCompleted failed", e2);
                }
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: b */
    public final Task<ParcelFileDescriptor> mo10710b(int i2, String str, String str2, int i3) {
        int i4;
        f19937i.m10837d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        com.google.android.play.core.tasks.zzi zziVar = new com.google.android.play.core.tasks.zzi();
        try {
        } catch (LocalTestingException e2) {
            f19937i.m10838e("getChunkFileDescriptor failed", e2);
            zziVar.m11012a(e2);
        } catch (FileNotFoundException e3) {
            f19937i.m10838e("getChunkFileDescriptor failed", e3);
            zziVar.m11012a(new LocalTestingException("Asset Slice file not found.", e3));
        }
        for (File file : m10785i(str)) {
            if (com.google.android.play.core.internal.zzcj.m10892a(file).equals(str2)) {
                zziVar.m11013b(ParcelFileDescriptor.open(file, 268435456));
                return zziVar.f20324a;
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: c */
    public final void mo10711c(int i2, String str, String str2, int i3) {
        f19937i.m10837d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: d */
    public final void mo10712d(int i2) {
        f19937i.m10837d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: e */
    public final Task<List<String>> mo10713e(Map<String, Long> map) {
        f19937i.m10837d("syncPacks()", new Object[0]);
        return Tasks.m11007c(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: f */
    public final void mo10714f(List<String> list) {
        f19937i.m10837d("cancelDownload(%s)", list);
    }

    /* renamed from: h */
    public final Bundle m10784h(int i2, String str, @AssetPackStatus int i3) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f19943e.m10797a());
        bundle.putInt("session_id", i2);
        File[] m10785i = m10785i(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j2 = 0;
        for (File file : m10785i) {
            j2 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String m10892a = com.google.android.play.core.internal.zzcj.m10892a(file);
            bundle.putParcelableArrayList(com.google.android.play.core.assetpacks.model.zzb.m10689b("chunk_intents", str, m10892a), arrayList2);
            try {
                bundle.putString(com.google.android.play.core.assetpacks.model.zzb.m10689b("uncompressed_hash_sha256", str, m10892a), zzdq.m10786a(Arrays.asList(file)));
                bundle.putLong(com.google.android.play.core.assetpacks.model.zzb.m10689b("uncompressed_size", str, m10892a), file.length());
                arrayList.add(m10892a);
            } catch (IOException e2) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), e2);
            } catch (NoSuchAlgorithmException e3) {
                throw new LocalTestingException("SHA256 algorithm not supported.", e3);
            }
        }
        bundle.putStringArrayList(com.google.android.play.core.assetpacks.model.zzb.m10688a("slice_ids", str), arrayList);
        bundle.putLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("pack_version", str), this.f19943e.m10797a());
        bundle.putInt(com.google.android.play.core.assetpacks.model.zzb.m10688a("status", str), i3);
        bundle.putInt(com.google.android.play.core.assetpacks.model.zzb.m10688a("error_code", str), 0);
        bundle.putLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("bytes_downloaded", str), m10783g(i3, j2));
        bundle.putLong(com.google.android.play.core.assetpacks.model.zzb.m10688a("total_bytes_to_download", str), j2);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", m10783g(i3, j2));
        bundle.putLong("total_bytes_to_download", j2);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f19946h.post(new Runnable() { // from class: com.google.android.play.core.assetpacks.zzdl
            @Override // java.lang.Runnable
            public final void run() {
                zzdo zzdoVar = zzdo.this;
                zzdoVar.f19940b.mo10657a(zzdoVar.f19942d, putExtra);
            }
        });
        return bundle;
    }

    /* renamed from: i */
    public final File[] m10785i(final String str) throws LocalTestingException {
        File file = new File(this.f19939a);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.zzdj
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (listFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (listFiles.length == 0) {
            throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : listFiles) {
            if (com.google.android.play.core.internal.zzcj.m10892a(file2).equals(str)) {
                return listFiles;
            }
        }
        throw new LocalTestingException(String.format("No master slice available for pack '%s'.", str));
    }

    @Override // com.google.android.play.core.assetpacks.zzy
    /* renamed from: l */
    public final void mo10716l() {
        f19937i.m10837d("keepAlive", new Object[0]);
    }
}
