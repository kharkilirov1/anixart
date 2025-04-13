package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;

/* loaded from: classes.dex */
public interface ExtractorInput extends DataReader {
    /* renamed from: b */
    boolean mo6377b(byte[] bArr, int i2, int i3, boolean z) throws IOException;

    /* renamed from: d */
    boolean mo6378d(byte[] bArr, int i2, int i3, boolean z) throws IOException;

    /* renamed from: e */
    long mo6379e();

    /* renamed from: f */
    void mo6380f(int i2) throws IOException;

    /* renamed from: g */
    int mo6381g(int i2) throws IOException;

    long getLength();

    long getPosition();

    /* renamed from: h */
    int mo6382h(byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: j */
    void mo6383j();

    /* renamed from: k */
    void mo6384k(int i2) throws IOException;

    /* renamed from: l */
    boolean mo6385l(int i2, boolean z) throws IOException;

    /* renamed from: n */
    void mo6386n(byte[] bArr, int i2, int i3) throws IOException;

    @Override // com.google.android.exoplayer2.upstream.DataReader
    int read(byte[] bArr, int i2, int i3) throws IOException;

    void readFully(byte[] bArr, int i2, int i3) throws IOException;
}
