package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Vl */
/* loaded from: classes2.dex */
class C3702Vl implements InterfaceC4139ml {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3528Ol f44355a;

    /* renamed from: b */
    private final C3677Ul f44356b;

    /* renamed from: com.yandex.metrica.impl.ob.Vl$a */
    public static class a {
    }

    @VisibleForTesting
    public C3702Vl(@NonNull InterfaceC3528Ol interfaceC3528Ol, @NonNull C3677Ul c3677Ul) {
        this.f44355a = interfaceC3528Ol;
        this.f44356b = c3677Ul;
        c3677Ul.m19257b();
    }

    /* renamed from: a */
    public void m19347a(boolean z) {
        this.f44356b.m19256a(z);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4139ml
    public void onError(@NonNull String str) {
        this.f44356b.m19255a();
        this.f44355a.onError(str);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4139ml
    public void onResult(@NonNull JSONObject jSONObject) {
        this.f44356b.m19255a();
        this.f44355a.onResult(jSONObject);
    }
}
