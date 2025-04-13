package com.bumptech.glide.request.target;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Util;
import p000a.C0000a;

@Deprecated
/* loaded from: classes.dex */
public abstract class SimpleTarget<Z> extends BaseTarget<Z> {

    /* renamed from: c */
    public final int f8803c = Integer.MIN_VALUE;

    /* renamed from: d */
    public final int f8804d = Integer.MIN_VALUE;

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: a */
    public void mo4876a(@NonNull SizeReadyCallback sizeReadyCallback) {
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: l */
    public final void mo4878l(@NonNull SizeReadyCallback sizeReadyCallback) {
        if (Util.m5352i(this.f8803c, this.f8804d)) {
            ((SingleRequest) sizeReadyCallback).mo5302e(this.f8803c, this.f8804d);
        } else {
            StringBuilder m24u = C0000a.m24u("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
            m24u.append(this.f8803c);
            m24u.append(" and height: ");
            throw new IllegalArgumentException(C0000a.m18o(m24u, this.f8804d, ", either provide dimensions in the constructor or call override()"));
        }
    }
}
