package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class EncodedPayload {

    /* renamed from: a */
    public final Encoding f9151a;

    /* renamed from: b */
    public final byte[] f9152b;

    public EncodedPayload(@NonNull Encoding encoding, @NonNull byte[] bArr) {
        Objects.requireNonNull(encoding, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f9151a = encoding;
        this.f9152b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f9151a.equals(encodedPayload.f9151a)) {
            return Arrays.equals(this.f9152b, encodedPayload.f9152b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9151a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9152b);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("EncodedPayload{encoding=");
        m24u.append(this.f9151a);
        m24u.append(", bytes=[...]}");
        return m24u.toString();
    }
}
