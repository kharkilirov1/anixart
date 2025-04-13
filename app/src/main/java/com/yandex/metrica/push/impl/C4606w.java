package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.utils.CoreUtils;

/* renamed from: com.yandex.metrica.push.impl.w */
/* loaded from: classes2.dex */
public class C4606w implements InterfaceC4612z {
    @Override // com.yandex.metrica.push.impl.InterfaceC4612z
    /* renamed from: a */
    public void mo21418a(@NonNull Context context, @NonNull Intent intent) {
        C4594q c4594q = (C4594q) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        if (c4594q != null) {
            boolean z = ((C4564b) C4562a.m21488a(context).m21503i()).m21509a().f47228b;
            if (!CoreUtils.isEmpty(c4594q.f47461b) && z) {
                C4603u0.m21732a().mo21646c(c4594q.f47461b, c4594q.f47463d, c4594q.f47460a);
            }
            C4562a.m21488a(context).m21501g().m21533a(c4594q.f47461b, false);
        }
    }
}
