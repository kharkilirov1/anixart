package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class LengthCountingOutputStream extends OutputStream {

    /* renamed from: b */
    public long f22592b = 0;

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.f22592b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f22592b += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 >= 0 && i2 <= bArr.length && i3 >= 0 && (i4 = i2 + i3) <= bArr.length && i4 >= 0) {
            this.f22592b += i3;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
