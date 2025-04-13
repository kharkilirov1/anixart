package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.net.Socket;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.Qh */
/* loaded from: classes2.dex */
class C3574Qh extends AbstractC3824ai {

    /* renamed from: f */
    @NonNull
    private final String f43713f;

    /* renamed from: com.yandex.metrica.impl.ob.Qh$a */
    public class a extends HashMap<String, String> {

        /* renamed from: a */
        public final /* synthetic */ byte[] f43714a;

        public a(C3574Qh c3574Qh, byte[] bArr) {
            this.f43714a = bArr;
            put("Content-Type", "text/plain; charset=utf-8");
            put("Access-Control-Allow-Origin", "*");
            put("Access-Control-Allow-Methods", "GET");
            put("Content-Length", String.valueOf(bArr.length));
        }
    }

    public C3574Qh(@NonNull Socket socket, @NonNull Uri uri, @NonNull InterfaceC3980gi interfaceC3980gi, @NonNull C3275Ei c3275Ei, @NonNull String str, @NonNull C4006hi c4006hi) {
        super(socket, uri, interfaceC3980gi, c3275Ei, c4006hi);
        this.f43713f = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3824ai
    /* renamed from: a */
    public void mo18818a() {
        try {
            byte[] encode = Base64.encode(new C3985gn().m19984a(this.f43713f.getBytes()), 0);
            m19584a("HTTP/1.1 200 OK", new a(this, encode), encode);
        } catch (Throwable unused) {
        }
    }
}
