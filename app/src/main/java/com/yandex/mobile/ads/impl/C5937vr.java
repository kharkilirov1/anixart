package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.vr */
/* loaded from: classes3.dex */
public final class C5937vr extends g11 {
    @Override // com.yandex.mobile.ads.impl.g11
    /* renamed from: a */
    public final Metadata mo22267a(yd0 yd0Var, ByteBuffer byteBuffer) {
        ap0 ap0Var = new ap0(byteBuffer.limit(), byteBuffer.array());
        String m22604q = ap0Var.m22604q();
        Objects.requireNonNull(m22604q);
        String m22604q2 = ap0Var.m22604q();
        Objects.requireNonNull(m22604q2);
        return new Metadata(new EventMessage(m22604q, m22604q2, ap0Var.m22603p(), ap0Var.m22603p(), Arrays.copyOfRange(ap0Var.m22587c(), ap0Var.m22588d(), ap0Var.m22590e())));
    }
}
