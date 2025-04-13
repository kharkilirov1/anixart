package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import com.yandex.metrica.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.yo */
/* loaded from: classes2.dex */
public class C4454yo implements InterfaceC4350uo<Revenue> {

    /* renamed from: a */
    private final InterfaceC4350uo<List<C4298so>> f47040a = new C4324to();

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable Revenue revenue) {
        return this.f47040a.mo18360a(Arrays.asList(new C4428xo().mo18360a(revenue.quantity)));
    }
}
