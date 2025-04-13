package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.to */
/* loaded from: classes2.dex */
public class C4324to implements InterfaceC4350uo<List<C4298so>> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable List<C4298so> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C4298so c4298so : list) {
            if (!c4298so.m20772b()) {
                linkedList.add(c4298so.m20771a());
                z = false;
            }
        }
        return z ? C4298so.m20769a(this) : C4298so.m20770a(this, TextUtils.join(", ", linkedList));
    }
}
