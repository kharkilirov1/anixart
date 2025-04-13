package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzg extends zzh {

    /* renamed from: c */
    public final byte[] f20154c;

    public zzg(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f20154c = bArr;
    }

    @Override // com.google.android.play.core.internal.zzh, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f20154c;
    }
}
