package com.google.android.play.core.splitcompat;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzi implements zzk {

    /* renamed from: a */
    public final /* synthetic */ Set f20205a;

    /* renamed from: b */
    public final /* synthetic */ zzs f20206b;

    /* renamed from: c */
    public final /* synthetic */ ZipFile f20207c;

    public zzi(Set set, zzs zzsVar, ZipFile zipFile) {
        this.f20205a = set;
        this.f20206b = zzsVar;
        this.f20207c = zipFile;
    }

    @Override // com.google.android.play.core.splitcompat.zzk
    /* renamed from: a */
    public final void mo10953a(zzl zzlVar, File file, boolean z) throws IOException {
        this.f20205a.add(file);
        if (z) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f20206b.mo10940b(), zzlVar.f20208a, this.f20206b.mo10939a().getAbsolutePath(), zzlVar.f20209b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f20207c;
        ZipEntry zipEntry = zzlVar.f20209b;
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
            }
            throw th2;
        }
    }
}
