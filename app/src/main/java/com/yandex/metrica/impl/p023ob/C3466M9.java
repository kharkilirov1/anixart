package com.yandex.metrica.impl.p023ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.M9 */
/* loaded from: classes2.dex */
public final class C3466M9 extends AbstractC3441L9<C3900dg> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3715W9
    /* renamed from: a */
    public Object mo18164a() {
        return new C3900dg();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3715W9
    /* renamed from: a */
    public Object mo18165a(byte[] bArr) {
        C3900dg c3900dg = (C3900dg) AbstractC3909e.m19776a(new C3900dg(), bArr);
        Intrinsics.m32178g(c3900dg, "ClidsInfoProto.ClidsInfo.parseFrom(data)");
        return c3900dg;
    }
}
