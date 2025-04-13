package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import java.util.LinkedList;

/* renamed from: com.yandex.metrica.push.impl.c0 */
/* loaded from: classes2.dex */
class C4567c0 implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final C4568d f47364a;

    public C4567c0(@NonNull C4568d c4568d) {
        this.f47364a = c4568d;
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        String m21659d = c4596r.m21659d();
        return TextUtils.isEmpty(m21659d) ? InterfaceC4508d.a.m21414a("PushId is empty", null) : ((LinkedList) this.f47364a.m21534b()).contains(m21659d) ? InterfaceC4508d.a.m21414a("Duplicate pushId", String.format("Push with the same push id [%s] has already been received", m21659d)) : InterfaceC4508d.a.m21413a();
    }
}
