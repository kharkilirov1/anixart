package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzeb {

    /* renamed from: d */
    public static final com.google.android.play.core.internal.zzag f19991d = new com.google.android.play.core.internal.zzag("PackMetadataManager");

    /* renamed from: a */
    public final zzbh f19992a;

    /* renamed from: b */
    public final zzed f19993b;

    /* renamed from: c */
    public final com.google.android.play.core.common.zza f19994c;

    public zzeb(zzbh zzbhVar, zzed zzedVar, com.google.android.play.core.common.zza zzaVar) {
        this.f19992a = zzbhVar;
        this.f19993b = zzedVar;
        this.f19994c = zzaVar;
    }

    /* renamed from: a */
    public final String m10795a(String str) {
        if (!this.f19994c.m10822a() || !this.f19992a.m10730d(str)) {
            return "";
        }
        int m10797a = this.f19993b.m10797a();
        zzbh zzbhVar = this.f19992a;
        File file = new File(zzbhVar.m10740q(str, m10797a, zzbhVar.m10737n(str)), "properties.dat");
        try {
            if (!file.exists()) {
                return String.valueOf(m10797a);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(m10797a) : property;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException unused2) {
            f19991d.m10835b("Failed to read pack version tag for pack %s", str);
            return "";
        }
    }

    /* renamed from: b */
    public final void m10796b(String str, int i2, long j2, @Nullable String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i2);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        zzbh zzbhVar = this.f19992a;
        Objects.requireNonNull(zzbhVar);
        File file = new File(zzbhVar.m10740q(str, i2, j2), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
