package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.wo */
/* loaded from: classes2.dex */
public class C4402wo implements InterfaceC4350uo<String> {

    /* renamed from: a */
    private final Map<String, ?> f46904a;

    public C4402wo(@NonNull Map<String, ?> map) {
        this.f46904a = map;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable String str) {
        String str2 = str;
        return this.f46904a.containsKey(str2) ? C4298so.m20770a(this, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str2)) : C4298so.m20769a(this);
    }
}
