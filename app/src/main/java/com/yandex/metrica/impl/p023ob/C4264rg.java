package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.rg */
/* loaded from: classes2.dex */
public class C4264rg implements InterfaceC4350uo<Void> {

    /* renamed from: a */
    @NonNull
    private final C4316tg f46310a;

    public C4264rg(@NonNull C4316tg c4316tg) {
        this.f46310a = c4316tg;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4350uo
    /* renamed from: a */
    public C4298so mo18360a(@Nullable Void r1) {
        Objects.requireNonNull(this.f46310a);
        return C4095l3.m20329h() ? C4298so.m20769a(this) : C4298so.m20770a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }

    /* renamed from: a */
    public C4298so m20662a() {
        Objects.requireNonNull(this.f46310a);
        if (C4095l3.m20329h()) {
            return C4298so.m20769a(this);
        }
        return C4298so.m20770a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }
}
