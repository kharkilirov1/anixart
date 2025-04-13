package com.google.android.play.core.assetpacks;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbh {

    /* renamed from: c */
    public static final com.google.android.play.core.internal.zzag f19740c = new com.google.android.play.core.internal.zzag("AssetPackStorage");

    /* renamed from: d */
    public static final long f19741d;

    /* renamed from: e */
    public static final long f19742e;

    /* renamed from: a */
    public final Context f19743a;

    /* renamed from: b */
    public final zzed f19744b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f19741d = timeUnit.toMillis(14L);
        f19742e = timeUnit.toMillis(28L);
    }

    public zzbh(Context context, zzed zzedVar) {
        this.f19743a = context;
        this.f19744b = zzedVar;
    }

    /* renamed from: e */
    public static long m10724e(File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f19740c.m10838e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e2) {
            f19740c.m10836c(e2, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: k */
    public static void m10725k(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long m10724e = m10724e(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(m10724e)) && !file2.getName().equals("stale.tmp")) {
                m10726l(file2);
            }
        }
    }

    /* renamed from: l */
    public static boolean m10726l(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= m10726l(file2);
            }
        }
        if (file.delete()) {
            return z;
        }
        return false;
    }

    /* renamed from: a */
    public final void m10727a(String str, int i2, long j2, int i3) throws IOException {
        File file = new File(m10741r(str, i2, j2), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i3));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* renamed from: b */
    public final void m10728b(String str, int i2, long j2) {
        File m10731f = m10731f(str);
        if (m10731f.exists()) {
            for (File file : m10731f.listFiles()) {
                if (!file.getName().equals(String.valueOf(i2)) && !file.getName().equals("stale.tmp")) {
                    m10726l(file);
                } else if (file.getName().equals(String.valueOf(i2))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j2))) {
                            m10726l(file2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean m10729c(String str, int i2, long j2) {
        if (m10732g(str, i2, j2).exists()) {
            return m10726l(m10732g(str, i2, j2));
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m10730d(String str) {
        return m10746w(str) != null;
    }

    /* renamed from: f */
    public final File m10731f(String str) {
        return new File(m10733h(), str);
    }

    /* renamed from: g */
    public final File m10732g(String str, int i2, long j2) {
        return new File(new File(new File(m10734i(), str), String.valueOf(i2)), String.valueOf(j2));
    }

    /* renamed from: h */
    public final File m10733h() {
        return new File(this.f19743a.getFilesDir(), "assetpacks");
    }

    /* renamed from: i */
    public final File m10734i() {
        return new File(m10733h(), "_tmp");
    }

    /* renamed from: j */
    public final List<File> m10735j() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e2) {
            f19740c.m10835b("Could not process directory while scanning installed packs. %s", e2);
        }
        if (m10733h().exists() && m10733h().listFiles() != null) {
            for (File file : m10733h().listFiles()) {
                if (!file.getCanonicalPath().equals(m10734i().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: m */
    public final int m10736m(String str, int i2, long j2) throws IOException {
        File file = new File(m10741r(str, i2, j2), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new zzck("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e2) {
                throw new zzck("Merge checkpoint file corrupt.", e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: n */
    public final long m10737n(String str) {
        return m10724e(m10738o(str, (int) m10724e(m10731f(str), true)), true);
    }

    /* renamed from: o */
    public final File m10738o(String str, int i2) {
        return new File(m10731f(str), String.valueOf(i2));
    }

    /* renamed from: p */
    public final File m10739p(String str, int i2, long j2) {
        return new File(m10738o(str, i2), String.valueOf(j2));
    }

    /* renamed from: q */
    public final File m10740q(String str, int i2, long j2) {
        return new File(m10739p(str, i2, j2), "_metadata");
    }

    /* renamed from: r */
    public final File m10741r(String str, int i2, long j2) {
        return new File(m10732g(str, i2, j2), "_packs");
    }

    /* renamed from: s */
    public final File m10742s(String str, int i2, long j2, String str2) {
        return new File(m10743t(str, i2, j2, str2), "checkpoint.dat");
    }

    /* renamed from: t */
    public final File m10743t(String str, int i2, long j2, String str2) {
        return new File(new File(new File(m10732g(str, i2, j2), "_slices"), "_metadata"), str2);
    }

    /* renamed from: u */
    public final File m10744u(String str, int i2, long j2, String str2) {
        return new File(new File(new File(m10732g(str, i2, j2), "_slices"), "_unverified"), str2);
    }

    /* renamed from: v */
    public final File m10745v(String str, int i2, long j2, String str2) {
        return new File(new File(new File(m10732g(str, i2, j2), "_slices"), "_verified"), str2);
    }

    @Nullable
    /* renamed from: w */
    public final String m10746w(String str) throws IOException {
        int length;
        File file = new File(m10733h(), str);
        if (!file.exists()) {
            f19740c.m10834a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f19744b.m10797a()));
        if (!file2.exists()) {
            f19740c.m10834a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f19744b.m10797a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f19740c.m10834a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f19744b.m10797a()));
            return null;
        }
        if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        }
        f19740c.m10835b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f19744b.m10797a()));
        return null;
    }

    /* renamed from: x */
    public final Map<String, Long> m10747x() {
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) m10735j()).iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int m10724e = (int) m10724e(m10731f(name), true);
            long m10724e2 = m10724e(m10738o(name, m10724e), true);
            if (m10739p(name, m10724e, m10724e2).exists()) {
                hashMap.put(name, Long.valueOf(m10724e2));
            }
        }
        return hashMap;
    }

    /* renamed from: y */
    public final void m10748y() {
        Iterator it = ((ArrayList) m10735j()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.listFiles() != null) {
                m10725k(file);
                long m10724e = m10724e(file, false);
                if (this.f19744b.m10797a() != m10724e) {
                    try {
                        new File(new File(file, String.valueOf(m10724e)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f19740c.m10835b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    m10725k(file2);
                }
            }
        }
    }
}
