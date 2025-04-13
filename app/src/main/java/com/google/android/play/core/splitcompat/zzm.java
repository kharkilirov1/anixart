package com.google.android.play.core.splitcompat;

import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.google.android.play.core.internal.zzci;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzm {

    /* renamed from: b */
    public static final Pattern f20210b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    public final zze f20211a;

    public zzm(zze zzeVar) throws IOException {
        this.f20211a = zzeVar;
    }

    @RequiresApi
    /* renamed from: b */
    public static void m10955b(zzs zzsVar, zzj zzjVar) throws IOException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(zzsVar.mo10939a());
        } catch (IOException e2) {
            e = e2;
            zipFile = null;
        }
        try {
            String mo10940b = zzsVar.mo10940b();
            HashMap hashMap = new HashMap();
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = f20210b.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", mo10940b, group2, group));
                    Set set = (Set) hashMap.get(group);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(group, set);
                    }
                    set.add(new zzl(nextElement, group2));
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : Build.SUPPORTED_ABIS) {
                if (hashMap.containsKey(str)) {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                    for (zzl zzlVar : (Set) hashMap.get(str)) {
                        if (hashMap2.containsKey(zzlVar.f20208a)) {
                            Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", zzlVar.f20208a, str));
                        } else {
                            hashMap2.put(zzlVar.f20208a, zzlVar);
                            Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", zzlVar.f20208a, str));
                        }
                    }
                } else {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                }
            }
            zzjVar.mo10954a(zipFile, new HashSet(hashMap2.values()));
            zipFile.close();
        } catch (IOException e3) {
            e = e3;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException unused) {
                }
            }
            throw e;
        }
    }

    @RequiresApi
    /* renamed from: a */
    public final Set<File> m10956a() throws IOException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<zzs> m10947c = this.f20211a.m10947c();
        zze zzeVar = this.f20211a;
        Objects.requireNonNull(zzeVar);
        ArrayList arrayList = new ArrayList();
        File[] listFiles = zzeVar.m10949g().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = ((HashSet) m10947c).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    File m10943f = zze.m10943f(this.f20211a.m10949g(), str);
                    zze.m10944i(m10943f);
                    zze.m10942e(m10943f);
                    break;
                }
                if (((zzs) it2.next()).mo10940b().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = ((HashSet) m10947c).iterator();
        while (it3.hasNext()) {
            zzs zzsVar = (zzs) it3.next();
            HashSet hashSet2 = new HashSet();
            m10955b(zzsVar, new zzh(this, hashSet2, zzsVar));
            zze zzeVar2 = this.f20211a;
            String mo10940b = zzsVar.mo10940b();
            Objects.requireNonNull(zzeVar2);
            HashSet hashSet3 = new HashSet();
            File m10943f2 = zze.m10943f(zzeVar2.m10949g(), mo10940b);
            zze.m10944i(m10943f2);
            File[] listFiles2 = m10943f2.listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    if (file2.isFile()) {
                        hashSet3.add(file2);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file3 = (File) it4.next();
                if (!hashSet2.contains(file3)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file3.getAbsolutePath(), zzsVar.mo10940b(), zzsVar.mo10939a().getAbsolutePath()));
                    zze zzeVar3 = this.f20211a;
                    Objects.requireNonNull(zzeVar3);
                    zzci.m10891b(file3.getParentFile().getParentFile().equals(zzeVar3.m10949g()), "File to remove is not a native library");
                    zze.m10942e(file3);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* renamed from: c */
    public final void m10957c(zzs zzsVar, Set<zzl> set, zzk zzkVar) throws IOException {
        for (zzl zzlVar : set) {
            zze zzeVar = this.f20211a;
            String mo10940b = zzsVar.mo10940b();
            String str = zzlVar.f20208a;
            File m10943f = zze.m10943f(zzeVar.m10949g(), mo10940b);
            zze.m10944i(m10943f);
            File m10943f2 = zze.m10943f(m10943f, str);
            boolean z = true;
            if (!m10943f2.exists() || m10943f2.length() != zzlVar.f20209b.getSize() || !(!m10943f2.canWrite())) {
                z = false;
            }
            zzkVar.mo10953a(zzlVar, m10943f2, z);
        }
    }
}
