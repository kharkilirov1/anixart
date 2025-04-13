package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;

/* renamed from: com.yandex.metrica.push.impl.J */
/* loaded from: classes2.dex */
public class C4529J extends AbstractC4539O {

    /* renamed from: a */
    @NonNull
    private final Context f47296a;

    public C4529J(@NonNull Context context) {
        this.f47296a = context;
    }

    @Override // com.yandex.metrica.push.impl.AbstractC4539O
    @NonNull
    /* renamed from: a */
    public C4541P mo21440a(@NonNull C4596r c4596r) {
        InterfaceC4508d.a mo21412a = C4562a.m21488a(this.f47296a).m21500f().mo21412a(c4596r);
        return mo21412a.f47282a == InterfaceC4508d.b.f47285a ? C4541P.m21467a(c4596r) : C4541P.m21468a(c4596r, mo21412a.f47283b, mo21412a.f47284c);
    }
}
