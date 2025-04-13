package com.google.android.exoplayer2.upstream;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ByteArrayDataSink implements DataSink {

    /* renamed from: a */
    public ByteArrayOutputStream f14339a;

    @Override // com.google.android.exoplayer2.upstream.DataSink
    /* renamed from: a */
    public void mo7431a(DataSpec dataSpec) {
        long j2 = dataSpec.f14368g;
        if (j2 == -1) {
            this.f14339a = new ByteArrayOutputStream();
        } else {
            Assertions.m7513a(j2 <= ParserMinimalBase.MAX_INT_L);
            this.f14339a = new ByteArrayOutputStream((int) dataSpec.f14368g);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.f14339a;
        int i2 = Util.f14736a;
        byteArrayOutputStream.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream = this.f14339a;
        int i4 = Util.f14736a;
        byteArrayOutputStream.write(bArr, i2, i3);
    }
}
