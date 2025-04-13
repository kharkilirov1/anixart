package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.wf */
/* loaded from: classes2.dex */
public class C4393wf implements InterfaceC4350uo<String> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable String str) {
        String str2 = str;
        return str2 == null ? C4298so.m20770a(this, "key is null") : str2.startsWith("appmetrica") ? C4298so.m20770a(this, "key starts with appmetrica") : str2.length() > 200 ? C4298so.m20770a(this, "key length more then 200 characters") : C4298so.m20769a(this);
    }
}
