package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import java.util.LinkedList;

/* renamed from: com.yandex.metrica.push.impl.S */
/* loaded from: classes2.dex */
class C4546S implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final C4568d f47309a;

    public C4546S(@NonNull C4568d c4568d) {
        this.f47309a = c4568d;
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        C4590o m21655a = c4596r.m21655a();
        String m21560a = m21655a == null ? null : m21655a.m21560a();
        return TextUtils.isEmpty(m21560a) ? InterfaceC4508d.a.m21413a() : ((LinkedList) this.f47309a.m21529a()).contains(m21560a) ? InterfaceC4508d.a.m21414a("Duplicate contentId", String.format("Push with the same content id [%s] has already been received", m21560a)) : InterfaceC4508d.a.m21413a();
    }
}
