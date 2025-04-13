package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* loaded from: classes.dex */
public interface DataSink {

    public interface Factory {
    }

    /* renamed from: a */
    void mo7431a(DataSpec dataSpec) throws IOException;

    void close() throws IOException;

    void write(byte[] bArr, int i2, int i3) throws IOException;
}
