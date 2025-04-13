package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.mt */
/* loaded from: classes3.dex */
public interface InterfaceC5458mt extends InterfaceC4815am {
    /* renamed from: a */
    long mo22717a();

    /* renamed from: a */
    void mo26760a(int i2) throws IOException;

    /* renamed from: a */
    void mo26761a(byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: a */
    boolean mo26762a(byte[] bArr, int i2, int i3, boolean z) throws IOException;

    /* renamed from: b */
    void mo26763b(int i2) throws IOException;

    /* renamed from: b */
    boolean mo26764b(byte[] bArr, int i2, int i3, boolean z) throws IOException;

    /* renamed from: c */
    void mo26765c();

    /* renamed from: e */
    long mo22718e();

    long getPosition();

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    int read(byte[] bArr, int i2, int i3) throws IOException;

    void readFully(byte[] bArr, int i2, int i3) throws IOException;
}
