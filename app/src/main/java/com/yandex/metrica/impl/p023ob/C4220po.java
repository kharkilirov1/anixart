package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.po */
/* loaded from: classes2.dex */
public class C4220po implements InterfaceC4350uo<String> {

    /* renamed from: a */
    private final String f46213a;

    public C4220po(@NonNull String str) {
        this.f46213a = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return C4298so.m20769a(this);
        }
        return C4298so.m20770a(this, this.f46213a + " is empty.");
    }
}
