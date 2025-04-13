package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d41 implements InterfaceC4978dm {

    /* renamed from: a */
    private final InterfaceC4978dm f49567a;

    /* renamed from: b */
    private long f49568b;

    /* renamed from: c */
    private Uri f49569c = Uri.EMPTY;

    public d41(InterfaceC4978dm interfaceC4978dm) {
        this.f49567a = (InterfaceC4978dm) C5220ia.m25469a(interfaceC4978dm);
        Collections.emptyMap();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws IOException {
        this.f49569c = c5192hm.f50967a;
        Collections.emptyMap();
        long mo22487a = this.f49567a.mo22487a(c5192hm);
        Uri mo22490d = this.f49567a.mo22490d();
        Objects.requireNonNull(mo22490d);
        this.f49569c = mo22490d;
        this.f49567a.mo22489b();
        return mo22487a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public final Map<String, List<String>> mo22489b() {
        return this.f49567a.mo22489b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws IOException {
        this.f49567a.close();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f49567a.mo22490d();
    }

    /* renamed from: f */
    public final long m23801f() {
        return this.f49568b;
    }

    /* renamed from: g */
    public final Uri m23802g() {
        return this.f49569c;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int read = this.f49567a.read(bArr, i2, i3);
        if (read != -1) {
            this.f49568b += read;
        }
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final void mo22488a(v71 v71Var) {
        Objects.requireNonNull(v71Var);
        this.f49567a.mo22488a(v71Var);
    }
}
