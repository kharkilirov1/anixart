package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.yandex.metrica.impl.ob.f8 */
/* loaded from: classes2.dex */
class C3944f8 {

    /* renamed from: a */
    @NonNull
    private final Context f45119a;

    /* renamed from: b */
    @Nullable
    private final File f45120b;

    /* renamed from: c */
    @NonNull
    private final C3432L0 f45121c;

    public C3944f8(@NonNull Context context, @Nullable File file) {
        this(context, file, new C3432L0());
    }

    @Nullable
    @SuppressLint
    /* renamed from: a */
    public String m19895a(@NonNull String str, @NonNull String str2) {
        ZipFile zipFile;
        String str3 = this.f45119a.getApplicationInfo().sourceDir;
        File m18472b = this.f45121c.m18472b(this.f45120b, str2);
        if (m18472b == null) {
            return null;
        }
        if (m18472b.exists()) {
            return m18472b.getAbsolutePath();
        }
        C3205Bn m17908a = C3205Bn.m17908a(this.f45119a, "crpad_ext");
        try {
            m17908a.m17909a();
            if (m18472b.exists()) {
                String absolutePath = m18472b.getAbsolutePath();
                m17908a.m17910b();
                return absolutePath;
            }
            zipFile = new ZipFile(str3);
            try {
                ZipEntry entry = zipFile.getEntry(str);
                if (entry == null) {
                    throw new RuntimeException("Cannot find ZipEntry" + str);
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                FileOutputStream fileOutputStream = new FileOutputStream(m18472b);
                byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
                while (true) {
                    int read = inputStream.read(bArr, 0, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
                    if (-1 == read) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                if (!m18472b.setReadable(true, false)) {
                    m17908a.m17910b();
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return null;
                }
                if (!m18472b.setExecutable(true, false)) {
                    m17908a.m17910b();
                    try {
                        zipFile.close();
                    } catch (IOException unused2) {
                    }
                    return null;
                }
                String absolutePath2 = m18472b.getAbsolutePath();
                m17908a.m17910b();
                try {
                    zipFile.close();
                } catch (IOException unused3) {
                }
                return absolutePath2;
            } catch (Throwable unused4) {
                m17908a.m17910b();
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused5) {
                    }
                }
                return null;
            }
        } catch (Throwable unused6) {
            zipFile = null;
        }
    }

    @VisibleForTesting
    public C3944f8(@NonNull Context context, @Nullable File file, @NonNull C3432L0 c3432l0) {
        this.f45119a = context;
        this.f45120b = file;
        this.f45121c = c3432l0;
    }
}
