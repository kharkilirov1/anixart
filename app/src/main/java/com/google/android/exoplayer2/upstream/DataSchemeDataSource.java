package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class DataSchemeDataSource extends BaseDataSource {

    /* renamed from: e */
    @Nullable
    public DataSpec f14350e;

    /* renamed from: f */
    @Nullable
    public byte[] f14351f;

    /* renamed from: g */
    public int f14352g;

    /* renamed from: h */
    public int f14353h;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        m7429q(dataSpec);
        this.f14350e = dataSpec;
        Uri uri = dataSpec.f14362a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        Assertions.m7514b(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] m7725X = Util.m7725X(uri.getSchemeSpecificPart(), ",");
        if (m7725X.length != 2) {
            String valueOf2 = String.valueOf(uri);
            throw new ParserException(C0576a.m4114m(valueOf2.length() + 23, "Unexpected URI format: ", valueOf2), null, true, 0);
        }
        String str = m7725X[1];
        if (m7725X[0].contains(";base64")) {
            try {
                this.f14351f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                String valueOf3 = String.valueOf(str);
                throw new ParserException(valueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf3) : new String("Error while parsing Base64 encoded string: "), e2, true, 0);
            }
        } else {
            this.f14351f = Util.m7708G(URLDecoder.decode(str, Charsets.f20502a.name()));
        }
        long j2 = dataSpec.f14367f;
        byte[] bArr = this.f14351f;
        if (j2 > bArr.length) {
            this.f14351f = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j2;
        this.f14352g = i2;
        int length = bArr.length - i2;
        this.f14353h = length;
        long j3 = dataSpec.f14368g;
        if (j3 != -1) {
            this.f14353h = (int) Math.min(length, j3);
        }
        m7430r(dataSpec);
        long j4 = dataSpec.f14368g;
        return j4 != -1 ? j4 : this.f14353h;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f14351f != null) {
            this.f14351f = null;
            m7428p();
        }
        this.f14350e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        DataSpec dataSpec = this.f14350e;
        if (dataSpec != null) {
            return dataSpec.f14362a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f14353h;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        byte[] bArr2 = this.f14351f;
        int i5 = Util.f14736a;
        System.arraycopy(bArr2, this.f14352g, bArr, i2, min);
        this.f14352g += min;
        this.f14353h -= min;
        m7427o(min);
        return min;
    }
}
