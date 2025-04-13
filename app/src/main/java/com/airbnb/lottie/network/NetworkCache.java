package com.airbnb.lottie.network;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
class NetworkCache {

    /* renamed from: a */
    public final Context f7720a;

    /* renamed from: b */
    public final String f7721b;

    public NetworkCache(Context context, String str) {
        this.f7720a = context.getApplicationContext();
        this.f7721b = str;
    }

    /* renamed from: a */
    public static String m4760a(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder m24u = C0000a.m24u("lottie_cache_");
        m24u.append(str.replaceAll("\\W+", ""));
        if (z) {
            Objects.requireNonNull(fileExtension);
            str2 = ".temp" + fileExtension.f7719b;
        } else {
            str2 = fileExtension.f7719b;
        }
        m24u.append(str2);
        return m24u.toString();
    }

    /* renamed from: b */
    public File m4761b(InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(this.f7720a.getCacheDir(), m4760a(this.f7721b, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
