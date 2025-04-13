package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class StreamEncoder implements Encoder<InputStream> {

    /* renamed from: a */
    public final ArrayPool f8489a;

    public StreamEncoder(ArrayPool arrayPool) {
        this.f8489a = arrayPool;
    }

    @Override // com.bumptech.glide.load.Encoder
    /* renamed from: a */
    public boolean mo4950a(@NonNull InputStream inputStream, @NonNull File file, @NonNull Options options) {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.f8489a.mo5065d(TextBuffer.MAX_SEGMENT_LEN, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            this.f8489a.put(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f8489a.put(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z = true;
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e3) {
                e = e3;
            }
            this.f8489a.put(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
