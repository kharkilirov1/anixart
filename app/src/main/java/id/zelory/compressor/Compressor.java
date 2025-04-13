package id.zelory.compressor;

import android.content.Context;
import android.graphics.Bitmap;
import io.reactivex.Flowable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class Compressor {

    /* renamed from: a */
    public Bitmap.CompressFormat f58048a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b */
    public int f58049b = 80;

    /* renamed from: c */
    public String f58050c;

    /* renamed from: id.zelory.compressor.Compressor$1 */
    class CallableC62851 implements Callable<Flowable<File>> {
        @Override // java.util.concurrent.Callable
        public Flowable<File> call() throws Exception {
            throw null;
        }
    }

    /* renamed from: id.zelory.compressor.Compressor$2 */
    class CallableC62862 implements Callable<Flowable<Bitmap>> {
        @Override // java.util.concurrent.Callable
        public Flowable<Bitmap> call() throws Exception {
            throw null;
        }
    }

    public Compressor(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        this.f58050c = C0000a.m20q(sb, File.separator, "images");
    }

    /* renamed from: a */
    public File m30795a(File file, String str) throws IOException {
        Bitmap.CompressFormat compressFormat = this.f58048a;
        int i2 = this.f58049b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f58050c);
        String m20q = C0000a.m20q(sb, File.separator, str);
        File parentFile = new File(m20q).getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(m20q);
            try {
                ImageUtil.m30796a(file, 612, 816).compress(compressFormat, i2, fileOutputStream2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                return new File(m20q);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
