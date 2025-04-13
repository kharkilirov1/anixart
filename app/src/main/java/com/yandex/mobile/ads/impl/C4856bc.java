package com.yandex.mobile.ads.impl;

import com.yandex.metrica.C4484p;
import com.yandex.mobile.ads.impl.C5275j9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.bc */
/* loaded from: classes3.dex */
public final class C4856bc implements C4484p.Ucc {

    /* renamed from: a */
    @NotNull
    private final C5275j9.a f48831a;

    /* renamed from: b */
    @NotNull
    private final C5071fc f48832b;

    public C4856bc(@NotNull C5275j9.a listener, @NotNull C5071fc autograbParser) {
        Intrinsics.m32179h(listener, "listener");
        Intrinsics.m32179h(autograbParser, "autograbParser");
        this.f48831a = listener;
        this.f48832b = autograbParser;
    }

    @Override // com.yandex.metrica.C4484p.Ucc
    public final void onError(@NotNull String error) {
        Intrinsics.m32179h(error, "error");
        this.f48831a.mo25821b(error);
    }

    @Override // com.yandex.metrica.C4484p.Ucc
    public final void onResult(@NotNull JSONObject jsonObject) {
        Intrinsics.m32179h(jsonObject, "jsonObject");
        this.f48831a.mo25820a(this.f48832b.m24541a(jsonObject));
    }

    public /* synthetic */ C4856bc(C5275j9.a aVar) {
        this(aVar, new C5071fc());
    }
}
