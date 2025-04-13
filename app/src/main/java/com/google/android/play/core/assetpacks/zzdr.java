package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzdr extends InputStream {

    /* renamed from: b */
    public final Enumeration<File> f19954b;

    /* renamed from: c */
    @Nullable
    public InputStream f19955c;

    public zzdr(Enumeration<File> enumeration) throws IOException {
        this.f19954b = enumeration;
        m10787a();
    }

    /* renamed from: a */
    public final void m10787a() throws IOException {
        InputStream inputStream = this.f19955c;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f19955c = this.f19954b.hasMoreElements() ? new FileInputStream(this.f19954b.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f19955c;
        if (inputStream != null) {
            inputStream.close();
            this.f19955c = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f19955c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m10787a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f19955c == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return 0;
        }
        do {
            int read = this.f19955c.read(bArr, i2, i3);
            if (read > 0) {
                return read;
            }
            m10787a();
        } while (this.f19955c != null);
        return -1;
    }
}
