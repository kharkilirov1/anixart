package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.di */
/* loaded from: classes2.dex */
public class C3902di extends AbstractC3824ai {
    public C3902di(@NonNull Socket socket, @NonNull Uri uri, @NonNull InterfaceC3980gi interfaceC3980gi, @NonNull C3275Ei c3275Ei, @NonNull C4006hi c4006hi) {
        super(socket, uri, interfaceC3980gi, c3275Ei, c4006hi);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3824ai
    /* renamed from: a */
    public void mo18818a() {
        Set<String> queryParameterNames = this.f44759d.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String str : queryParameterNames) {
            hashMap.put(str, this.f44759d.getQueryParameter(str));
        }
        hashMap.remove("t");
        m19584a("HTTP/1.1 200 OK", new HashMap(), new byte[0]);
        ((RunnableC4058ji) this.f44757b).m20153a(hashMap, this.f44756a.getLocalPort(), this.f44760e);
    }
}
