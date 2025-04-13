package com.google.android.play.core.assetpacks;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbw extends FilterInputStream {

    /* renamed from: b */
    public final zzds f19777b;

    /* renamed from: c */
    public byte[] f19778c;

    /* renamed from: d */
    public long f19779d;

    /* renamed from: e */
    public boolean f19780e;

    /* renamed from: f */
    public boolean f19781f;

    public zzbw(InputStream inputStream) {
        super(inputStream);
        this.f19777b = new zzds();
        this.f19778c = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f19780e = false;
        this.f19781f = false;
    }

    /* renamed from: a */
    public final zzet m10766a() throws IOException {
        byte[] bArr;
        if (this.f19779d > 0) {
            do {
                bArr = this.f19778c;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f19780e || this.f19781f) {
            return new zzbq(null, -1L, -1, false, false, null);
        }
        if (!m10768c(30)) {
            this.f19780e = true;
            return this.f19777b.m10789b();
        }
        zzet m10789b = this.f19777b.m10789b();
        zzbq zzbqVar = (zzbq) m10789b;
        if (zzbqVar.f19773e) {
            this.f19781f = true;
            return m10789b;
        }
        if (zzbqVar.f19770b == 4294967295L) {
            throw new zzck("Files bigger than 4GiB are not supported.");
        }
        int i2 = this.f19777b.f19961f - 30;
        long j2 = i2;
        int length = this.f19778c.length;
        if (j2 > length) {
            do {
                length += length;
            } while (length < j2);
            this.f19778c = Arrays.copyOf(this.f19778c, length);
        }
        if (!m10768c(i2)) {
            this.f19780e = true;
            return this.f19777b.m10789b();
        }
        zzet m10789b2 = this.f19777b.m10789b();
        this.f19779d = ((zzbq) m10789b2).f19770b;
        return m10789b2;
    }

    /* renamed from: b */
    public final int m10767b(byte[] bArr, int i2, int i3) throws IOException {
        return Math.max(0, super.read(bArr, i2, i3));
    }

    /* renamed from: c */
    public final boolean m10768c(int i2) throws IOException {
        int m10767b = m10767b(this.f19778c, 0, i2);
        if (m10767b != i2) {
            int i3 = i2 - m10767b;
            if (m10767b(this.f19778c, m10767b, i3) != i3) {
                this.f19777b.m10788a(this.f19778c, 0, m10767b);
                return false;
            }
        }
        this.f19777b.m10788a(this.f19778c, 0, i2);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f19779d;
        if (j2 <= 0 || this.f19780e) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i2, (int) Math.min(j2, i3)));
        this.f19779d -= max;
        if (max != 0) {
            return max;
        }
        this.f19780e = true;
        return 0;
    }
}
