package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cq0 implements InterfaceC4978dm {

    /* renamed from: a */
    public static final cq0 f49337a = new cq0();

    static {
        dn1 dn1Var = dn1.f49706q;
    }

    private cq0() {
    }

    /* renamed from: f */
    public static /* synthetic */ cq0 m23507f() {
        return new cq0();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final void mo22488a(v71 v71Var) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public /* synthetic */ Map mo22489b() {
        return bo1.m22904a(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) {
        throw new UnsupportedOperationException();
    }
}
