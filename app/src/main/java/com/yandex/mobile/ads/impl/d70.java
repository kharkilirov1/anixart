package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d70 implements InterfaceC5412lt {

    /* renamed from: b */
    private InterfaceC5509nt f49586b;

    /* renamed from: c */
    private int f49587c;

    /* renamed from: d */
    private int f49588d;

    /* renamed from: e */
    private int f49589e;

    /* renamed from: g */
    @Nullable
    private MotionPhotoMetadata f49591g;

    /* renamed from: h */
    private InterfaceC5458mt f49592h;

    /* renamed from: i */
    private b41 f49593i;

    /* renamed from: j */
    @Nullable
    private bf0 f49594j;

    /* renamed from: a */
    private final ap0 f49585a = new ap0(6);

    /* renamed from: f */
    private long f49590f = -1;

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        C5598pn c5598pn = (C5598pn) interfaceC5458mt;
        this.f49585a.m22586c(2);
        c5598pn.mo26764b(this.f49585a.m22587c(), 0, 2, false);
        if (this.f49585a.m22613z() != 65496) {
            return false;
        }
        this.f49585a.m22586c(2);
        c5598pn.mo26764b(this.f49585a.m22587c(), 0, 2, false);
        int m22613z = this.f49585a.m22613z();
        this.f49588d = m22613z;
        if (m22613z == 65504) {
            this.f49585a.m22586c(2);
            c5598pn.mo26764b(this.f49585a.m22587c(), 0, 2, false);
            c5598pn.m27349a(false, this.f49585a.m22613z() - 2);
            this.f49585a.m22586c(2);
            c5598pn.mo26764b(this.f49585a.m22587c(), 0, 2, false);
            this.f49588d = this.f49585a.m22613z();
        }
        if (this.f49588d != 65505) {
            return false;
        }
        c5598pn.m27349a(false, 2);
        this.f49585a.m22586c(6);
        c5598pn.mo26764b(this.f49585a.m22587c(), 0, 6, false);
        return this.f49585a.m22609v() == 1165519206 && this.f49585a.m22613z() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f49586b = interfaceC5509nt;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0203  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22424a(com.yandex.mobile.ads.impl.InterfaceC5458mt r31, com.yandex.mobile.ads.impl.qr0 r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.d70.mo22424a(com.yandex.mobile.ads.impl.mt, com.yandex.mobile.ads.impl.qr0):int");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        if (j2 == 0) {
            this.f49587c = 0;
            this.f49594j = null;
        } else if (this.f49587c == 5) {
            bf0 bf0Var = this.f49594j;
            Objects.requireNonNull(bf0Var);
            bf0Var.mo22430a(j2, j3);
        }
    }
}
