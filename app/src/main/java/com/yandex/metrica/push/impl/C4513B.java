package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.core.notification.AbstractC4505h;

/* renamed from: com.yandex.metrica.push.impl.B */
/* loaded from: classes2.dex */
public class C4513B extends AbstractC4505h {
    @Override // com.yandex.metrica.push.impl.InterfaceC4612z
    /* renamed from: a */
    public void mo21418a(@NonNull Context context, @NonNull Intent intent) {
        C4594q c4594q = (C4594q) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        if (c4594q != null) {
            String str = c4594q.f47461b;
            boolean z = ((C4564b) C4562a.m21488a(context).m21503i()).m21509a().f47229c;
            if (!CoreUtils.isEmpty(str) && z) {
                C4603u0.m21732a().mo21649e(str, c4594q.f47463d, c4594q.f47460a);
            }
            m21409a(context, c4594q);
            C4562a.m21488a(context).m21501g().m21533a(c4594q.f47461b, false);
        }
    }
}
