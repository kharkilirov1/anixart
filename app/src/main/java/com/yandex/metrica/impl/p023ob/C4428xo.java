package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.xo */
/* loaded from: classes2.dex */
class C4428xo implements InterfaceC4350uo<Integer> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C4298so mo18360a(@Nullable Integer num) {
        if (num == null || num.intValue() > 0) {
            return C4298so.m20769a(this);
        }
        return C4298so.m20770a(this, "Invalid quantity value " + num);
    }
}
