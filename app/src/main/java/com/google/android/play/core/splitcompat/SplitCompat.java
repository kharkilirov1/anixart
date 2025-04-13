package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.google.android.play.core.internal.zzau;
import com.google.android.play.core.internal.zzaw;
import com.google.android.play.core.internal.zzay;
import com.google.android.play.core.internal.zzaz;
import com.google.android.play.core.internal.zzba;
import com.google.android.play.core.internal.zzbt;
import com.google.android.play.core.splitinstall.zzbe;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class SplitCompat {

    /* renamed from: e */
    public static final AtomicReference<SplitCompat> f20186e = new AtomicReference<>(null);

    /* renamed from: a */
    public final zze f20187a;

    /* renamed from: b */
    public final zzbe f20188b;

    /* renamed from: c */
    @GuardedBy
    public final Set<String> f20189c = new HashSet();

    /* renamed from: d */
    public final zza f20190d;

    public SplitCompat(Context context) {
        try {
            zze zzeVar = new zze(context);
            this.f20187a = zzeVar;
            this.f20190d = new zza(zzeVar);
            this.f20188b = new zzbe(context);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new zzbt(e2);
        }
    }

    /* renamed from: c */
    public static boolean m10935c(Context context, boolean z) {
        AtomicReference<SplitCompat> atomicReference = f20186e;
        boolean compareAndSet = atomicReference.compareAndSet(null, new SplitCompat(context));
        SplitCompat splitCompat = atomicReference.get();
        if (compareAndSet) {
            com.google.android.play.core.splitinstall.zzo zzoVar = com.google.android.play.core.splitinstall.zzo.f20286b;
            com.google.android.play.core.splitinstall.zzo.f20287c.set(new zzaw(context, zzd.m10941a(), new zzay(context, splitCompat.f20187a, new zzau()), splitCompat.f20187a, new zzr()));
            com.google.android.play.core.splitinstall.zzr.f20289a.compareAndSet(null, new zzn(splitCompat));
            zzd.m10941a().execute(new zzo(context));
        }
        try {
            splitCompat.m10937b(context, z);
            return true;
        } catch (Exception e2) {
            Log.e("SplitCompat", "Error installing additional splits", e2);
            return false;
        }
    }

    /* renamed from: a */
    public final void m10936a(Set<String> set) throws IOException {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            zze.m10942e(this.f20187a.m10946b(it.next()));
        }
        zzbe zzbeVar = this.f20188b;
        Objects.requireNonNull(zzbeVar);
        synchronized (zzbe.class) {
            zzbeVar.f20282a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    @RequiresApi
    /* renamed from: b */
    public final synchronized void m10937b(Context context, boolean z) throws IOException {
        if (z) {
            this.f20187a.m10948d();
        } else {
            zzd.m10941a().execute(new zzp(this));
        }
        String packageName = context.getPackageName();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
            List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
            Set<zzs> m10947c = this.f20187a.m10947c();
            Set<String> m10991a = this.f20188b.m10991a();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = (HashSet) m10947c;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                String mo10940b = ((zzs) it.next()).mo10940b();
                if (arrayList.contains(mo10940b) || m10991a.contains(com.google.android.play.core.splitinstall.zzs.m10993a(mo10940b))) {
                    hashSet.add(mo10940b);
                    it.remove();
                }
            }
            if (z) {
                m10936a(hashSet);
            } else if (!hashSet.isEmpty()) {
                zzd.m10941a().execute(new zzq(this, hashSet));
            }
            HashSet hashSet3 = new HashSet();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String mo10940b2 = ((zzs) it2.next()).mo10940b();
                if (!com.google.android.play.core.splitinstall.zzs.m10994b(mo10940b2)) {
                    hashSet3.add(mo10940b2);
                }
            }
            for (String str : arrayList) {
                if (!com.google.android.play.core.splitinstall.zzs.m10994b(str)) {
                    hashSet3.add(str);
                }
            }
            HashSet hashSet4 = new HashSet(hashSet2.size());
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                zzs zzsVar = (zzs) it3.next();
                String mo10940b3 = zzsVar.mo10940b();
                int i2 = com.google.android.play.core.splitinstall.zzs.f20290a;
                if (mo10940b3.startsWith("config.") || hashSet3.contains(com.google.android.play.core.splitinstall.zzs.m10993a(zzsVar.mo10940b()))) {
                    hashSet4.add(zzsVar);
                }
            }
            zzm zzmVar = new zzm(this.f20187a);
            zzaz m10853a = zzba.m10853a();
            ClassLoader classLoader = context.getClassLoader();
            ZipFile zipFile = null;
            if (z) {
                m10853a.mo10850b(classLoader, zzmVar.m10956a());
            } else {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    zzs zzsVar2 = (zzs) it4.next();
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    HashSet hashSet5 = new HashSet();
                    zzm.m10955b(zzsVar2, new zzg(zzmVar, zzsVar2, hashSet5, atomicBoolean));
                    if (!atomicBoolean.get()) {
                        hashSet5 = null;
                    }
                    if (hashSet5 == null) {
                        it4.remove();
                    } else {
                        m10853a.mo10850b(classLoader, hashSet5);
                    }
                }
            }
            HashSet hashSet6 = new HashSet();
            Iterator it5 = hashSet4.iterator();
            while (it5.hasNext()) {
                zzs zzsVar3 = (zzs) it5.next();
                try {
                    ZipFile zipFile2 = new ZipFile(zzsVar3.mo10939a());
                    try {
                        ZipEntry entry = zipFile2.getEntry("classes.dex");
                        zipFile2.close();
                        if (entry != null) {
                            zze zzeVar = this.f20187a;
                            String mo10940b4 = zzsVar3.mo10940b();
                            Objects.requireNonNull(zzeVar);
                            File file = new File(zzeVar.m10952k(), "dex");
                            zze.m10944i(file);
                            File m10943f = zze.m10943f(file, mo10940b4);
                            zze.m10944i(m10943f);
                            if (!m10853a.mo10849a(classLoader, m10943f, zzsVar3.mo10939a(), z)) {
                                String valueOf = String.valueOf(zzsVar3.mo10939a());
                                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                                sb.append("split was not installed ");
                                sb.append(valueOf);
                                Log.w("SplitCompat", sb.toString());
                            }
                        }
                        hashSet6.add(zzsVar3.mo10939a());
                    } catch (IOException e2) {
                        e = e2;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            }
            synchronized (this.f20190d) {
                AssetManager assets = context.getAssets();
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    zza.m10938a(assets, (File) it6.next());
                }
            }
            HashSet hashSet7 = new HashSet();
            Iterator it7 = hashSet4.iterator();
            while (it7.hasNext()) {
                zzs zzsVar4 = (zzs) it7.next();
                if (hashSet6.contains(zzsVar4.mo10939a())) {
                    String mo10940b5 = zzsVar4.mo10940b();
                    StringBuilder sb2 = new StringBuilder(mo10940b5.length() + 30);
                    sb2.append("Split '");
                    sb2.append(mo10940b5);
                    sb2.append("' installation emulated");
                    Log.d("SplitCompat", sb2.toString());
                    hashSet7.add(zzsVar4.mo10940b());
                } else {
                    String mo10940b6 = zzsVar4.mo10940b();
                    StringBuilder sb3 = new StringBuilder(mo10940b6.length() + 35);
                    sb3.append("Split '");
                    sb3.append(mo10940b6);
                    sb3.append("' installation not emulated.");
                    Log.d("SplitCompat", sb3.toString());
                }
            }
            synchronized (this.f20189c) {
                this.f20189c.addAll(hashSet7);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IOException(String.format("Cannot load data for application '%s'", packageName), e4);
        }
    }
}
