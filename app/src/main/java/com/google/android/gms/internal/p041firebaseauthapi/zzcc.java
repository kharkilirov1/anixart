package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@Deprecated
/* loaded from: classes.dex */
public final class zzcc {

    /* renamed from: a */
    public static final zzkq f16429a = m8887b(16);

    /* renamed from: b */
    public static final zzkq f16430b;

    static {
        m8887b(32);
        m8886a(16, 16);
        m8886a(32, 16);
        f16430b = m8888c(16, 16, 32, 16);
        m8888c(32, 16, 32, 32);
        zzkp m9228q = zzkq.m9228q();
        new zzcx();
        m9228q.m9225k("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        m9228q.m9227m(3);
        zzkp m9228q2 = zzkq.m9228q();
        new zzdh();
        m9228q2.m9225k("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        m9228q2.m9227m(3);
    }

    /* renamed from: a */
    public static zzkq m8886a(int i2, int i3) {
        zzhi m9037r = zzhj.m9037r();
        if (m9037r.f17169d) {
            m9037r.m9647j();
            m9037r.f17169d = false;
        }
        ((zzhj) m9037r.f17168c).zzf = i2;
        zzhl m9044r = zzhm.m9044r();
        if (m9044r.f17169d) {
            m9044r.m9647j();
            m9044r.f17169d = false;
        }
        ((zzhm) m9044r.f17168c).zze = 16;
        zzhm zzhmVar = (zzhm) m9044r.m9645h();
        if (m9037r.f17169d) {
            m9037r.m9647j();
            m9037r.f17169d = false;
        }
        zzhj.m9040v((zzhj) m9037r.f17168c, zzhmVar);
        zzhj zzhjVar = (zzhj) m9037r.m9645h();
        zzkp m9228q = zzkq.m9228q();
        m9228q.m9226l(zzhjVar.mo8622b());
        new zzco();
        m9228q.m9225k("type.googleapis.com/google.crypto.tink.AesEaxKey");
        m9228q.m9227m(3);
        return (zzkq) m9228q.m9645h();
    }

    /* renamed from: b */
    public static zzkq m8887b(int i2) {
        zzhr m9056r = zzhs.m9056r();
        if (m9056r.f17169d) {
            m9056r.m9647j();
            m9056r.f17169d = false;
        }
        ((zzhs) m9056r.f17168c).zze = i2;
        zzhs zzhsVar = (zzhs) m9056r.m9645h();
        zzkp m9228q = zzkq.m9228q();
        m9228q.m9226l(zzhsVar.mo8622b());
        new zzcr();
        m9228q.m9225k("type.googleapis.com/google.crypto.tink.AesGcmKey");
        m9228q.m9227m(3);
        return (zzkq) m9228q.m9645h();
    }

    /* renamed from: c */
    public static zzkq m8888c(int i2, int i3, int i4, int i5) {
        zzgz m9015r = zzha.m9015r();
        zzhc m9023r = zzhd.m9023r();
        if (m9023r.f17169d) {
            m9023r.m9647j();
            m9023r.f17169d = false;
        }
        ((zzhd) m9023r.f17168c).zze = 16;
        zzhd zzhdVar = (zzhd) m9023r.m9645h();
        if (m9015r.f17169d) {
            m9015r.m9647j();
            m9015r.f17169d = false;
        }
        zzha.m9019w((zzha) m9015r.f17168c, zzhdVar);
        if (m9015r.f17169d) {
            m9015r.m9647j();
            m9015r.f17169d = false;
        }
        ((zzha) m9015r.f17168c).zzf = i2;
        zzha zzhaVar = (zzha) m9015r.m9645h();
        zzjq m9164r = zzjr.m9164r();
        zzjt m9174r = zzju.m9174r();
        m9174r.m9173l(5);
        m9174r.m9172k(i5);
        m9164r.m9163l((zzju) m9174r.m9645h());
        m9164r.m9162k(32);
        zzjr zzjrVar = (zzjr) m9164r.m9645h();
        zzgt m8998q = zzgu.m8998q();
        if (m8998q.f17169d) {
            m8998q.m9647j();
            m8998q.f17169d = false;
        }
        zzgu.m9001v((zzgu) m8998q.f17168c, zzhaVar);
        if (m8998q.f17169d) {
            m8998q.m9647j();
            m8998q.f17169d = false;
        }
        zzgu.m9002w((zzgu) m8998q.f17168c, zzjrVar);
        zzgu zzguVar = (zzgu) m8998q.m9645h();
        zzkp m9228q = zzkq.m9228q();
        m9228q.m9226l(zzguVar.mo8622b());
        new zzci();
        m9228q.m9225k("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        m9228q.m9227m(3);
        return (zzkq) m9228q.m9645h();
    }
}
