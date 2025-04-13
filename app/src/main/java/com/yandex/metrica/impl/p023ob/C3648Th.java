package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3570Qd;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Th */
/* loaded from: classes2.dex */
class C3648Th implements C3570Qd.a {

    /* renamed from: a */
    public final /* synthetic */ C3275Ei f44099a;

    /* renamed from: b */
    public final /* synthetic */ File f44100b;

    /* renamed from: c */
    public final /* synthetic */ C3928ei f44101c;

    /* renamed from: d */
    public final /* synthetic */ C3673Uh f44102d;

    public C3648Th(C3673Uh c3673Uh, C3275Ei c3275Ei, File file, C3928ei c3928ei) {
        this.f44102d = c3673Uh;
        this.f44099a = c3275Ei;
        this.f44100b = file;
        this.f44101c = c3928ei;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3570Qd.a
    /* renamed from: a */
    public void mo17835a(@NonNull String str, @NonNull byte[] bArr) {
        InterfaceC3549Ph interfaceC3549Ph;
        FileOutputStream fileOutputStream;
        C3673Uh.m19251a(this.f44102d, this.f44099a.f42823i);
        C3673Uh.m19253c(this.f44102d);
        interfaceC3549Ph = this.f44102d.f44182e;
        interfaceC3549Ph.mo18280a(str);
        C3673Uh c3673Uh = this.f44102d;
        File file = this.f44100b;
        Objects.requireNonNull(c3673Uh);
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        C3658U2.m19209a((Closeable) fileOutputStream);
        this.f44101c.m19822a(this.f44100b);
    }

    @Override // com.yandex.metrica.impl.p023ob.C3570Qd.a
    @Nullable
    /* renamed from: b */
    public String mo17836b() {
        InterfaceC3549Ph interfaceC3549Ph;
        interfaceC3549Ph = this.f44102d.f44182e;
        return interfaceC3549Ph.mo18287b();
    }

    @Override // com.yandex.metrica.impl.p023ob.C3570Qd.a
    /* renamed from: c */
    public void mo17837c() {
        C3673Uh.m19251a(this.f44102d, this.f44099a.f42822h);
        C3673Uh.m19253c(this.f44102d);
    }

    @Override // com.yandex.metrica.impl.p023ob.C3570Qd.a
    /* renamed from: a */
    public void mo17834a() {
        C3673Uh.m19251a(this.f44102d, this.f44099a.f42823i);
        C3673Uh.m19253c(this.f44102d);
        this.f44101c.m19822a(this.f44100b);
    }
}
