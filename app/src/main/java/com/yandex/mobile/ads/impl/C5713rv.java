package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.rv */
/* loaded from: classes3.dex */
public class C5713rv implements InterfaceC5458mt {

    /* renamed from: a */
    private final InterfaceC5458mt f54422a;

    public C5713rv(C5598pn c5598pn) {
        this.f54422a = c5598pn;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public final boolean mo26762a(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.f54422a.mo26762a(bArr, 0, i3, z);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: b */
    public final boolean mo26764b(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.f54422a.mo26764b(bArr, 0, i3, z);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: c */
    public final void mo26765c() {
        this.f54422a.mo26765c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: e */
    public long mo22718e() {
        return this.f54422a.mo22718e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    public long getPosition() {
        return this.f54422a.getPosition();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt, com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.f54422a.read(bArr, i2, i3);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    public final void readFully(byte[] bArr, int i2, int i3) throws IOException {
        this.f54422a.readFully(bArr, i2, i3);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public final void mo26760a(int i2) throws IOException {
        this.f54422a.mo26760a(i2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: b */
    public final void mo26763b(int i2) throws IOException {
        this.f54422a.mo26763b(i2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public final void mo26761a(byte[] bArr, int i2, int i3) throws IOException {
        this.f54422a.mo26761a(bArr, i2, i3);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5458mt
    /* renamed from: a */
    public long mo22717a() {
        return this.f54422a.mo22717a();
    }
}
