package com.google.android.exoplayer2.offline;

import android.database.Cursor;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class DefaultDownloadIndex implements WritableDownloadIndex {

    public static final class DownloadCursorImpl implements DownloadCursor {

        /* renamed from: b */
        public final Cursor f12145b;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f12145b.close();
        }
    }

    static {
        m6734a(3, 4);
    }

    /* renamed from: a */
    public static String m6734a(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder m27x = C0000a.m27x("state", " IN (");
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 > 0) {
                m27x.append(',');
            }
            m27x.append(iArr[i2]);
        }
        m27x.append(')');
        return m27x.toString();
    }
}
