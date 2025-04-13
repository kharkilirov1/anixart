package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.u3 */
/* loaded from: classes3.dex */
public final class C5838u3 {

    /* renamed from: a */
    @NonNull
    private final vv0 f55351a;

    /* renamed from: b */
    @NonNull
    private final C5780t3 f55352b;

    /* renamed from: c */
    @Nullable
    private sv0.InterfaceC5763a f55353c;

    /* renamed from: d */
    @Nullable
    private sv0.InterfaceC5763a f55354d;

    public C5838u3(@NonNull Context context, @NonNull C5724s3 c5724s3) {
        this.f55351a = C5730s8.m28078a(context);
        this.f55352b = new C5780t3(c5724s3);
    }

    /* renamed from: a */
    public final void m28844a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f55354d = interfaceC5763a;
    }

    /* renamed from: b */
    public final void m28846b(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f55353c = interfaceC5763a;
    }

    /* renamed from: a */
    public final void m28843a() {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "success");
        hashMap.putAll(this.f55352b.m28439a());
        sv0.InterfaceC5763a interfaceC5763a = this.f55353c;
        if (interfaceC5763a != null) {
            hashMap.putAll(interfaceC5763a.mo22529a());
        }
        sv0.InterfaceC5763a interfaceC5763a2 = this.f55354d;
        if (interfaceC5763a2 != null) {
            hashMap.putAll(interfaceC5763a2.mo22529a());
        }
        this.f55351a.mo23876a(new sv0(sv0.EnumC5764b.f54834b.m28361a(), hashMap));
    }

    /* renamed from: a */
    public final void m28845a(@NonNull String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "error");
        hashMap.put("failure_reason", str);
        hashMap.putAll(this.f55352b.m28439a());
        sv0.InterfaceC5763a interfaceC5763a = this.f55353c;
        if (interfaceC5763a != null) {
            hashMap.putAll(interfaceC5763a.mo22529a());
        }
        sv0.InterfaceC5763a interfaceC5763a2 = this.f55354d;
        if (interfaceC5763a2 != null) {
            hashMap.putAll(interfaceC5763a2.mo22529a());
        }
        this.f55351a.mo23876a(new sv0(sv0.EnumC5764b.f54834b.m28361a(), hashMap));
    }
}
