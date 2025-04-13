package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzcn extends OutputStream {

    /* renamed from: b */
    public final zzds f19867b = new zzds();

    /* renamed from: c */
    public final File f19868c;

    /* renamed from: d */
    public final zzen f19869d;

    /* renamed from: e */
    public long f19870e;

    /* renamed from: f */
    public long f19871f;

    /* renamed from: g */
    public FileOutputStream f19872g;

    /* renamed from: h */
    public zzet f19873h;

    public zzcn(File file, zzen zzenVar) {
        this.f19868c = file;
        this.f19869d = zzenVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        write(new byte[]{(byte) i2}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        int min;
        while (i3 > 0) {
            if (this.f19870e == 0 && this.f19871f == 0) {
                int m10788a = this.f19867b.m10788a(bArr, i2, i3);
                if (m10788a == -1) {
                    return;
                }
                i2 += m10788a;
                i3 -= m10788a;
                zzet m10789b = this.f19867b.m10789b();
                this.f19873h = m10789b;
                if (m10789b.mo10760d()) {
                    this.f19870e = 0L;
                    this.f19869d.m10810k(this.f19873h.mo10762f(), 0, this.f19873h.mo10762f().length);
                    this.f19871f = this.f19873h.mo10762f().length;
                } else if (this.f19873h.m10816h() && !this.f19873h.m10815g()) {
                    this.f19869d.m10808i(this.f19873h.mo10762f());
                    File file = new File(this.f19868c, this.f19873h.mo10759c());
                    file.getParentFile().mkdirs();
                    this.f19870e = this.f19873h.mo10758b();
                    this.f19872g = new FileOutputStream(file);
                } else {
                    byte[] mo10762f = this.f19873h.mo10762f();
                    this.f19869d.m10810k(mo10762f, 0, mo10762f.length);
                    this.f19870e = this.f19873h.mo10758b();
                }
            }
            if (!this.f19873h.m10815g()) {
                if (this.f19873h.mo10760d()) {
                    this.f19869d.m10803d(this.f19871f, bArr, i2, i3);
                    this.f19871f += i3;
                    min = i3;
                } else if (this.f19873h.m10816h()) {
                    min = (int) Math.min(i3, this.f19870e);
                    this.f19872g.write(bArr, i2, min);
                    long j2 = this.f19870e - min;
                    this.f19870e = j2;
                    if (j2 == 0) {
                        this.f19872g.close();
                    }
                } else {
                    min = (int) Math.min(i3, this.f19870e);
                    this.f19869d.m10803d((this.f19873h.mo10762f().length + this.f19873h.mo10758b()) - this.f19870e, bArr, i2, min);
                    this.f19870e -= min;
                }
                i2 += min;
                i3 -= min;
            }
        }
    }
}
