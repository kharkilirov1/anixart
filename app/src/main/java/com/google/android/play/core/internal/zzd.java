package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzd implements zzc {

    /* renamed from: a */
    public final FileChannel f20146a;

    /* renamed from: b */
    public final long f20147b;

    /* renamed from: c */
    public final long f20148c;

    public zzd(FileChannel fileChannel, long j2, long j3) {
        this.f20146a = fileChannel;
        this.f20147b = j2;
        this.f20148c = j3;
    }

    @Override // com.google.android.play.core.internal.zzc
    /* renamed from: a */
    public final void mo10851a(MessageDigest[] messageDigestArr, long j2, int i2) throws IOException {
        MappedByteBuffer map = this.f20146a.map(FileChannel.MapMode.READ_ONLY, this.f20147b + j2, i2);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.play.core.internal.zzc
    /* renamed from: u */
    public final long mo10852u() {
        return this.f20148c;
    }
}
