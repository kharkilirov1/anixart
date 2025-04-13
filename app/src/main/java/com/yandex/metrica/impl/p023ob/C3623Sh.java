package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C4377w;
import java.io.File;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Sh */
/* loaded from: classes2.dex */
class C3623Sh implements C4377w.c {

    /* renamed from: a */
    public final /* synthetic */ String f44007a;

    /* renamed from: b */
    public final /* synthetic */ File f44008b;

    /* renamed from: c */
    public final /* synthetic */ C3928ei f44009c;

    /* renamed from: d */
    public final /* synthetic */ C3275Ei f44010d;

    /* renamed from: e */
    public final /* synthetic */ C3673Uh f44011e;

    public C3623Sh(C3673Uh c3673Uh, String str, File file, C3928ei c3928ei, C3275Ei c3275Ei) {
        this.f44011e = c3673Uh;
        this.f44007a = str;
        this.f44008b = file;
        this.f44009c = c3928ei;
        this.f44010d = c3275Ei;
    }

    @Override // com.yandex.metrica.impl.p023ob.C4377w.c
    /* renamed from: a */
    public void mo17830a() {
        C3570Qd c3570Qd;
        c3570Qd = this.f44011e.f44181d;
        String str = this.f44007a;
        C3673Uh c3673Uh = this.f44011e;
        File file = this.f44008b;
        C3928ei c3928ei = this.f44009c;
        C3275Ei c3275Ei = this.f44010d;
        Objects.requireNonNull(c3673Uh);
        c3570Qd.m18815a(str, new C3648Th(c3673Uh, c3275Ei, file, c3928ei));
    }
}
