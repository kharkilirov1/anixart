package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.sv0;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.e7 */
/* loaded from: classes3.dex */
public final class C5008e7 implements InterfaceC5466n<C4958d7> {

    /* renamed from: a */
    @NonNull
    private final C5380l7 f49827a;

    /* renamed from: b */
    @NonNull
    private final C4957d6 f49828b;

    /* renamed from: c */
    @NonNull
    private final wv0 f49829c;

    public C5008e7(@NonNull C5380l7 c5380l7, @NonNull C4957d6 c4957d6, @NonNull wv0 wv0Var) {
        this.f49827a = c5380l7;
        this.f49828b = c4957d6;
        this.f49829c = wv0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5466n
    /* renamed from: a */
    public final void mo22935a(@NonNull View view, @NonNull C4958d7 c4958d7) {
        C4958d7 c4958d72 = c4958d7;
        Iterator<String> it = c4958d72.m23821c().iterator();
        while (it.hasNext()) {
            this.f49828b.m23816a(it.next());
        }
        this.f49827a.m26358a(view, c4958d72);
        ((C6123zh) this.f49829c).m30189a(sv0.EnumC5764b.f54841i);
    }
}
