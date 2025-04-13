package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.nativeads.C6218k;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.o */
/* loaded from: classes3.dex */
final class C5517o {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f53111a;

    /* renamed from: b */
    @NonNull
    private final AdResponse f53112b;

    /* renamed from: c */
    @NonNull
    private final wv0 f53113c;

    /* renamed from: d */
    @NonNull
    private final dk0 f53114d;

    /* renamed from: e */
    @NonNull
    private final C6218k f53115e;

    /* renamed from: f */
    @NonNull
    private final C6264w f53116f;

    /* renamed from: g */
    @Nullable
    private final sv0.InterfaceC5763a f53117g;

    public C5517o(@NonNull C5101g2 c5101g2, @NonNull AdResponse adResponse, @NonNull C6123zh c6123zh, @NonNull dk0 dk0Var, @NonNull C6264w c6264w, @NonNull C6218k c6218k, @Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f53111a = c5101g2;
        this.f53112b = adResponse;
        this.f53113c = c6123zh;
        this.f53114d = dk0Var;
        this.f53116f = c6264w;
        this.f53115e = c6218k;
        this.f53117g = interfaceC5763a;
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC5466n m26966a(@NonNull Context context, @NonNull AbstractC5419m abstractC5419m) {
        ck0 m23899a;
        InterfaceC5466n c4886bu;
        String m26547a = abstractC5419m.m26547a();
        m23899a = this.f53114d.m23899a(this.f53113c);
        Objects.requireNonNull(m26547a);
        switch (m26547a) {
            case "social_action":
                return new s21(new w01(context, this.f53112b, this.f53111a, this.f53117g), new a31(this.f53111a, new nh0(context, this.f53112b, this.f53111a), this.f53115e, this.f53116f, this.f53114d));
            case "adtune":
                return new C5008e7(new C5380l7(this.f53115e, m23899a), new C4957d6(context, this.f53111a), this.f53113c);
            case "feedback":
                c4886bu = new C4886bu(new C5359ku(this.f53111a, this.f53113c, this.f53116f, this.f53115e));
                break;
            case "close":
                return new C5080fi(this.f53113c, this.f53115e);
            case "deeplink":
                c4886bu = new C5978wm(new C6082ym(this.f53113c, m23899a, this.f53115e));
                break;
            default:
                return null;
        }
        return c4886bu;
    }
}
