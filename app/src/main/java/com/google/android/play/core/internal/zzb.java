package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzb implements zzc {

    /* renamed from: a */
    public final ByteBuffer f20133a;

    public zzb(ByteBuffer byteBuffer) {
        this.f20133a = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.internal.zzc
    /* renamed from: a */
    public final void mo10851a(MessageDigest[] messageDigestArr, long j2, int i2) throws IOException {
        ByteBuffer slice;
        synchronized (this.f20133a) {
            int i3 = (int) j2;
            this.f20133a.position(i3);
            this.f20133a.limit(i3 + i2);
            slice = this.f20133a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.play.core.internal.zzc
    /* renamed from: u */
    public final long mo10852u() {
        return this.f20133a.capacity();
    }
}
