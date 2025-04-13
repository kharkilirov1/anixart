package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ul */
/* loaded from: classes3.dex */
public final class C5871ul implements InterfaceC5589pf {

    /* renamed from: a */
    public static final /* synthetic */ int f55553a = 0;

    static {
        new C5871ul(AbstractC4698p.m22055i());
        jp1 jp1Var = jp1.f51689C;
    }

    public C5871ul(List<C5751sl> list) {
        AbstractC4698p.m22050a((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final C5871ul m29039a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return new C5871ul(parcelableArrayList == null ? AbstractC4698p.m22055i() : C5637qf.m27717a(C5751sl.f54716s, parcelableArrayList));
    }
}
