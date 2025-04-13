package pl.aprilapps.easyphotopicker;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Files.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lpl/aprilapps/easyphotopicker/Files;", "", "library_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Files {

    /* renamed from: a */
    public static final Files f69345a = new Files();

    @NotNull
    /* renamed from: a */
    public final File m34986a(@NotNull Context context, @NotNull Uri photoUri) throws IOException {
        Intrinsics.m32180i(context, "context");
        Intrinsics.m32180i(photoUri, "photoUri");
        InputStream pictureInputStream = context.getContentResolver().openInputStream(photoUri);
        File file = new File(context.getCacheDir(), "EasyImage");
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder m24u = C0000a.m24u("ei_");
        m24u.append(System.currentTimeMillis());
        sb.append(m24u.toString());
        sb.append(".");
        sb.append(Intrinsics.m32174c(photoUri.getScheme(), "content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(photoUri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(photoUri.getPath())).toString()));
        File file2 = new File(file, sb.toString());
        file2.createNewFile();
        Intrinsics.m32175d(pictureInputStream, "pictureInputStream");
        m34987b(pictureInputStream, file2);
        return file2;
    }

    /* renamed from: b */
    public final void m34987b(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];
            int read = inputStream.read(bArr);
            while (read > 0) {
                fileOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            fileOutputStream.close();
            inputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
