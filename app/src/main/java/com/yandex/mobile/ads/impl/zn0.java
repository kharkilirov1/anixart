package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.tw0;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zn0 {

    /* renamed from: a */
    private final Context f57252a;

    /* renamed from: b */
    @NotNull
    private final co0 f57253b;

    /* renamed from: c */
    private final iw0 f57254c;

    /* renamed from: d */
    private final xz0 f57255d;

    public zn0(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f57252a = context.getApplicationContext();
        this.f57253b = do0.m23924a(context);
        this.f57254c = iw0.m25739a();
        this.f57255d = xz0.m29823b();
    }

    /* renamed from: a */
    public final void m30233a(@NotNull vn0 listener) {
        Intrinsics.m32179h(listener, "listener");
        cz0 m29824a = this.f57255d.m29824a(this.f57252a);
        String m23607p = m29824a != null ? m29824a.m23607p() : null;
        String m23500b = this.f57253b.m23500b();
        boolean z = false;
        if (m23607p != null) {
            if (m23607p.length() > 0) {
                z = true;
            }
        }
        if (!z || Intrinsics.m32174c(m23607p, m23500b)) {
            ((bo0) listener).mo22903a();
            return;
        }
        C6132a c6132a = new C6132a(this, m23607p, listener);
        n41 n41Var = new n41(m23607p, c6132a, c6132a);
        n41Var.m30318b((Object) "om_sdk_js_request_tag");
        this.f57254c.m25741a(this.f57252a, n41Var);
    }

    /* renamed from: com.yandex.mobile.ads.impl.zn0$a */
    public final class C6132a implements tw0.InterfaceC5822b<String>, tw0.InterfaceC5821a {

        /* renamed from: a */
        @NotNull
        private final String f57256a;

        /* renamed from: b */
        @NotNull
        private final vn0 f57257b;

        /* renamed from: c */
        public final /* synthetic */ zn0 f57258c;

        public C6132a(zn0 zn0Var, @NotNull String omSdkControllerUrl, @NotNull vn0 listener) {
            Intrinsics.m32179h(omSdkControllerUrl, "omSdkControllerUrl");
            Intrinsics.m32179h(listener, "listener");
            this.f57258c = zn0Var;
            this.f57256a = omSdkControllerUrl;
            this.f57257b = listener;
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
        /* renamed from: a */
        public final void mo22924a(String str) {
            String response = str;
            Intrinsics.m32179h(response, "response");
            this.f57258c.f57253b.m23499a(response);
            this.f57258c.f57253b.m23501b(this.f57256a);
            this.f57257b.mo22903a();
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
        /* renamed from: a */
        public final void mo22923a(@NotNull qh1 error) {
            Intrinsics.m32179h(error, "error");
            this.f57257b.mo22903a();
        }
    }

    /* renamed from: a */
    public final void m30232a() {
        iw0 iw0Var = this.f57254c;
        Context context = this.f57252a;
        Objects.requireNonNull(iw0Var);
        iw0.m25740a(context, "om_sdk_js_request_tag");
    }
}
