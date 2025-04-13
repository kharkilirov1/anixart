package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class LogWriter extends Writer {

    /* renamed from: b */
    public final String f4485b;

    /* renamed from: c */
    public StringBuilder f4486c = new StringBuilder(128);

    public LogWriter(String str) {
        this.f4485b = str;
    }

    /* renamed from: a */
    public final void m3147a() {
        if (this.f4486c.length() > 0) {
            Log.d(this.f4485b, this.f4486c.toString());
            StringBuilder sb = this.f4486c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m3147a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m3147a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                m3147a();
            } else {
                this.f4486c.append(c2);
            }
        }
    }
}
