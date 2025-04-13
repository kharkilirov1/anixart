package com.google.android.play.core.assetpacks;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzdq {
    /* renamed from: a */
    public static String m10786a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream(it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }
}
