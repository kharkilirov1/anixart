package com.yandex.metrica.push.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.utils.InternalLogger;

/* renamed from: com.yandex.metrica.push.impl.y0 */
/* loaded from: classes2.dex */
class C4611y0 implements InterfaceC4607w0 {
    @Override // com.yandex.metrica.push.impl.InterfaceC4607w0
    /* renamed from: a */
    public void mo21417a(@NonNull Context context, @NonNull Bundle bundle) {
        C4570e m21502h = C4562a.m21488a(context).m21502h();
        if (m21502h != null) {
            m21502h.m21539c();
        } else {
            InternalLogger.m21370i("PushServiceController is null", new Object[0]);
        }
    }
}
