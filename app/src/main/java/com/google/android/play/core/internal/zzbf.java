package com.google.android.play.core.internal;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbf implements zzaz {
    /* renamed from: c */
    public static Object m10856c(ClassLoader classLoader) {
        return new zzbv(classLoader, zzbw.m10872f(classLoader, "pathList"), Object.class).m10865a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m10857d(ClassLoader classLoader, Set<File> set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
            Log.d("Splitcompat", valueOf.length() != 0 ? "Adding native library parent directory: ".concat(valueOf) : new String("Adding native library parent directory: "));
            hashSet.add(file.getParentFile());
        }
        zzbu m10867a = zzbw.m10867a(m10856c(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) m10867a.m10865a()));
        synchronized (com.google.android.play.core.splitinstall.zzn.class) {
            int size = hashSet.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("Adding directories ");
            sb.append(size);
            Log.d("Splitcompat", sb.toString());
            m10867a.m10864d(hashSet);
        }
    }

    /* renamed from: e */
    public static boolean m10858e(ClassLoader classLoader, File file, File file2, boolean z, zzbe zzbeVar, String str, zzbd zzbdVar) {
        ArrayList<IOException> arrayList = new ArrayList<>();
        Object m10856c = m10856c(classLoader);
        zzbu m10867a = zzbw.m10867a(m10856c, "dexElements", Object.class);
        List asList = Arrays.asList(m10867a.m10865a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) zzbw.m10868b(it.next(), str, File.class).m10865a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z && !zzbdVar.mo10855a(m10856c, file2, file)) {
            String valueOf = String.valueOf(file2.getPath());
            Log.w("SplitCompat", valueOf.length() != 0 ? "Should be optimized ".concat(valueOf) : new String("Should be optimized "));
            return false;
        }
        m10867a.m10863c(Arrays.asList(zzbeVar.mo10854a(m10856c, new ArrayList<>(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbt zzbtVar = new zzbt("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", arrayList.get(i2));
        }
        new zzbu(m10856c, zzbw.m10872f(m10856c, "dexElementsSuppressedExceptions"), IOException.class).m10863c(arrayList);
        throw zzbtVar;
    }

    @Override // com.google.android.play.core.internal.zzaz
    /* renamed from: a */
    public final boolean mo10849a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m10858e(classLoader, file, file2, z, new zzbb(), "zip", new zzbc());
    }

    @Override // com.google.android.play.core.internal.zzaz
    /* renamed from: b */
    public final void mo10850b(ClassLoader classLoader, Set<File> set) {
        m10857d(classLoader, set);
    }
}
