package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C4824au;
import com.yandex.mobile.ads.nativeads.C6218k;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ku */
/* loaded from: classes3.dex */
public final class C5359ku {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f52147a;

    /* renamed from: b */
    @NonNull
    private final wv0 f52148b;

    /* renamed from: c */
    @NonNull
    private final C6264w f52149c;

    /* renamed from: d */
    @NonNull
    private final C5302ju f52150d = new C5302ju();

    /* renamed from: e */
    @NonNull
    private final C6218k f52151e;

    public C5359ku(@NonNull C5101g2 c5101g2, @NonNull wv0 wv0Var, @NonNull C6264w c6264w, @NonNull C6218k c6218k) {
        this.f52147a = c5101g2;
        this.f52148b = wv0Var;
        this.f52149c = c6264w;
        this.f52151e = c6218k;
    }

    /* renamed from: a */
    public final void m26256a(@NonNull Context context, @NonNull C4824au c4824au) {
        ImageView m30509h = this.f52149c.m30757h().m30509h();
        if (m30509h != null) {
            List<C4824au.a> m22623b = c4824au.m22623b();
            if (m22623b.isEmpty()) {
                return;
            }
            try {
                C4957d6 c4957d6 = new C4957d6(context, this.f52147a);
                Objects.requireNonNull(this.f52150d);
                PopupMenu m25953a = C5302ju.m25953a(context, m30509h, m22623b);
                m25953a.setOnMenuItemClickListener(new nr0(c4957d6, m22623b, this.f52148b, this.f52151e));
                m25953a.show();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }
}
