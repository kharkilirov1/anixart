package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.rg */
/* loaded from: classes3.dex */
public final class C5688rg<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final ih0 f54305a = new ih0();

    /* renamed from: b */
    @NonNull
    private final C5638qg f54306b;

    public C5688rg(@NonNull Context context) {
        this.f54306b = new C5638qg(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        Objects.requireNonNull(this.f54305a);
        TextView textView = (TextView) v.findViewById(C4632R.id.call_to_action);
        if (textView != null) {
            this.f54306b.m27719a(textView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        this.f54306b.m27718a();
    }
}
