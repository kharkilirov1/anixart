package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
class Aes128DataSource implements DataSource {

    /* renamed from: a */
    public final DataSource f13033a;

    /* renamed from: b */
    public final byte[] f13034b;

    /* renamed from: c */
    public final byte[] f13035c;

    /* renamed from: d */
    @Nullable
    public CipherInputStream f13036d;

    public Aes128DataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.f13033a = dataSource;
        this.f13034b = bArr;
        this.f13035c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public final long mo6350a(DataSpec dataSpec) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f13034b, "AES"), new IvParameterSpec(this.f13035c));
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.f13033a, dataSpec);
                this.f13036d = new CipherInputStream(dataSourceInputStream, cipher);
                if (dataSourceInputStream.f14359e) {
                    return -1L;
                }
                dataSourceInputStream.f14356b.mo6350a(dataSourceInputStream.f14357c);
                dataSourceInputStream.f14359e = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public final void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f13033a.mo6818c(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        if (this.f13036d != null) {
            this.f13036d = null;
            this.f13033a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public final Map<String, List<String>> mo6351i() {
        return this.f13033a.mo6351i();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public final Uri mo6352m() {
        return this.f13033a.mo6352m();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        Objects.requireNonNull(this.f13036d);
        int read = this.f13036d.read(bArr, i2, i3);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
