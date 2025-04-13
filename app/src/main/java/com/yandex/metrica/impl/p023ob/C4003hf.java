package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.hf */
/* loaded from: classes2.dex */
public class C4003hf implements InterfaceC4133mf, InterfaceC3695Ve {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3695Ve
    /* renamed from: a */
    public int mo19276a(@NonNull EnumC4141mn enumC4141mn) {
        return 2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4133mf
    @NonNull
    /* renamed from: a */
    public byte[] mo18816a(@NonNull C3745Xe c3745Xe, @NonNull C4057jh c4057jh) {
        return TextUtils.isEmpty(c3745Xe.f44480b) ? new byte[0] : Base64.decode(c3745Xe.f44480b, 0);
    }
}
