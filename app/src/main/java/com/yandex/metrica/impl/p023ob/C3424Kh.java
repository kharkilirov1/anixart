package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.InterfaceC3126g;
import com.yandex.metrica.impl.p023ob.C4108lg;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Kh */
/* loaded from: classes2.dex */
public class C3424Kh {

    /* renamed from: a */
    @NonNull
    private final C3449Lh f43282a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3126g f43283b;

    public C3424Kh() {
        this(new C3449Lh(), C3524Oh.m18679a());
    }

    /* renamed from: a */
    public void m18449a(@NonNull C4108lg.e.b bVar) {
        this.f43283b.mo17792b("provided_request_result", this.f43282a.m18511a(bVar));
    }

    /* renamed from: b */
    public void m18450b(@NonNull C4108lg.e.a aVar) {
        String th;
        InterfaceC3126g interfaceC3126g = this.f43283b;
        Objects.requireNonNull(this.f43282a);
        try {
            th = new JSONObject().put("id", aVar.f45902a).toString();
        } catch (Throwable th2) {
            th = th2.toString();
        }
        interfaceC3126g.mo17792b("provided_request_send", th);
    }

    @VisibleForTesting
    public C3424Kh(@NonNull C3449Lh c3449Lh, @NonNull InterfaceC3126g interfaceC3126g) {
        this.f43282a = c3449Lh;
        this.f43283b = interfaceC3126g;
    }

    /* renamed from: a */
    public void m18448a(@NonNull C4108lg.e.a aVar) {
        String th;
        InterfaceC3126g interfaceC3126g = this.f43283b;
        Objects.requireNonNull(this.f43282a);
        try {
            th = new JSONObject().put("id", aVar.f45902a).toString();
        } catch (Throwable th2) {
            th = th2.toString();
        }
        interfaceC3126g.mo17792b("provided_request_schedule", th);
    }
}
