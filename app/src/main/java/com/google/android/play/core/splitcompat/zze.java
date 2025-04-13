package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.yandex.mobile.ads.C4632R;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zze {

    /* renamed from: a */
    public final long f20194a;

    /* renamed from: b */
    public final Context f20195b;

    /* renamed from: c */
    public File f20196c;

    public zze(Context context) throws PackageManager.NameNotFoundException {
        this.f20195b = context;
        this.f20194a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: e */
    public static void m10942e(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m10942e(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    /* renamed from: f */
    public static File m10943f(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: i */
    public static File m10944i(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        String valueOf = String.valueOf(file.getAbsolutePath());
        throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
    }

    /* renamed from: a */
    public final File m10945a() throws IOException {
        File file = new File(m10952k(), "unverified-splits");
        m10944i(file);
        return file;
    }

    /* renamed from: b */
    public final File m10946b(String str) throws IOException {
        return m10943f(m10950h(), String.valueOf(str).concat(".apk"));
    }

    /* renamed from: c */
    public final Set<zzs> m10947c() throws IOException {
        File m10950h = m10950h();
        HashSet hashSet = new HashSet();
        File[] listFiles = m10950h.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && (!file.canWrite())) {
                    hashSet.add(new zzb(file, file.getName().substring(0, r6.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    public final void m10948d() throws IOException {
        File m10951j = m10951j();
        String[] list = m10951j.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f20194a))) {
                    File file = new File(m10951j, str);
                    String valueOf = String.valueOf(file);
                    long j2 = this.f20194a;
                    StringBuilder sb = new StringBuilder(valueOf.length() + C4632R.styleable.AppCompatTheme_windowActionBarOverlay);
                    C0000a.m1B(sb, "FileStorage: removing directory for different version code (directory = ", valueOf, ", current version code = ");
                    sb.append(j2);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    m10942e(file);
                }
            }
        }
    }

    /* renamed from: g */
    public final File m10949g() throws IOException {
        File file = new File(m10952k(), "native-libraries");
        m10944i(file);
        return file;
    }

    /* renamed from: h */
    public final File m10950h() throws IOException {
        File file = new File(m10952k(), "verified-splits");
        m10944i(file);
        return file;
    }

    /* renamed from: j */
    public final File m10951j() throws IOException {
        if (this.f20196c == null) {
            Context context = this.f20195b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f20196c = context.getFilesDir();
        }
        File file = new File(this.f20196c, "splitcompat");
        m10944i(file);
        return file;
    }

    /* renamed from: k */
    public final File m10952k() throws IOException {
        File file = new File(m10951j(), Long.toString(this.f20194a));
        m10944i(file);
        return file;
    }
}
