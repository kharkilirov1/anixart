package com.google.android.play.core.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbk implements zzaz {
    /* renamed from: c */
    public static void m10860c(ClassLoader classLoader, Set<File> set, zzbj zzbjVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<File> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getParentFile());
        }
        Object m10856c = zzbf.m10856c(classLoader);
        zzbv m10868b = zzbw.m10868b(m10856c, "nativeLibraryDirectories", List.class);
        synchronized (com.google.android.play.core.splitinstall.zzn.class) {
            ArrayList arrayList = new ArrayList((Collection) m10868b.m10865a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            m10868b.m10866b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] mo10859a = zzbjVar.mo10859a(m10856c, new ArrayList<>(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (com.google.android.play.core.splitinstall.zzn.class) {
                new zzbu(m10856c, zzbw.m10872f(m10856c, "nativeLibraryPathElements"), Object.class).m10864d(Arrays.asList(mo10859a));
            }
            return;
        }
        zzbt zzbtVar = new zzbt("Error in makePathElements");
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
        }
        throw zzbtVar;
    }

    /* renamed from: d */
    public static boolean m10861d(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return zzbf.m10858e(classLoader, file, file2, z, new zzbh(), "zip", new zzbc());
    }

    @Override // com.google.android.play.core.internal.zzaz
    /* renamed from: a */
    public final boolean mo10849a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m10861d(classLoader, file, file2, z, "zip");
    }

    @Override // com.google.android.play.core.internal.zzaz
    /* renamed from: b */
    public final void mo10850b(ClassLoader classLoader, Set<File> set) {
        m10860c(classLoader, set, new zzbi());
    }
}
