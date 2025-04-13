package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.y61;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.sq */
/* loaded from: classes3.dex */
public final class C5757sq implements y61 {

    /* renamed from: a */
    private final byte[] f54799a = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: a */
    public final int mo28344a(InterfaceC4815am interfaceC4815am, int i2, boolean z) throws IOException {
        int read = interfaceC4815am.read(this.f54799a, 0, Math.min(this.f54799a.length, i2));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: a */
    public /* synthetic */ void mo28345a(int i2, ap0 ap0Var) {
        rq1.m27976a(this, i2, ap0Var);
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: a */
    public final void mo28346a(long j2, int i2, int i3, int i4, @Nullable y61.C6060a c6060a) {
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: a */
    public final void mo28347a(C5606pv c5606pv) {
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: b */
    public /* synthetic */ int mo28348b(InterfaceC4815am interfaceC4815am, int i2, boolean z) {
        return rq1.m27977b(this, interfaceC4815am, i2, z);
    }

    @Override // com.yandex.mobile.ads.impl.y61
    /* renamed from: b */
    public final void mo28349b(int i2, ap0 ap0Var) {
        ap0Var.m22593f(i2);
    }
}
