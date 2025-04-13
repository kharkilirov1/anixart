package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.Writer;

@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public class LogWriter extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw null;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        throw null;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        if (i3 > 0) {
            if (cArr[i2 + 0] != '\n') {
                throw null;
            }
            throw null;
        }
    }
}
