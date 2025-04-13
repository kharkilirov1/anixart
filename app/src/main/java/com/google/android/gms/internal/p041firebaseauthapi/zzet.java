package com.google.android.gms.internal.p041firebaseauthapi;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@ThreadSafe
/* loaded from: classes.dex */
final class zzet {

    /* renamed from: f */
    public static final byte[] f16462f = new byte[0];

    /* renamed from: a */
    public final zzes f16463a;

    /* renamed from: b */
    public final BigInteger f16464b;

    /* renamed from: c */
    public final byte[] f16465c;

    /* renamed from: d */
    public final byte[] f16466d;

    /* renamed from: e */
    @GuardedBy
    public BigInteger f16467e = BigInteger.ZERO;

    public zzet(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzes zzesVar) {
        this.f16465c = bArr2;
        this.f16466d = bArr3;
        this.f16464b = bigInteger;
        this.f16463a = zzesVar;
    }
}
