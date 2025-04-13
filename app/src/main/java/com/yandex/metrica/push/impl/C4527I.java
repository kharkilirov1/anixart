package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.YandexMetricaPush;
import com.yandex.metrica.push.common.utils.CoreUtils;

/* renamed from: com.yandex.metrica.push.impl.I */
/* loaded from: classes2.dex */
public class C4527I implements InterfaceC4523G {
    @Override // com.yandex.metrica.push.impl.InterfaceC4523G
    /* renamed from: a */
    public void mo21433a(@NonNull Context context, @NonNull C4596r c4596r) {
        Intent intent = new Intent(context.getPackageName() + ".action.ymp.SILENT_PUSH_RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(YandexMetricaPush.EXTRA_PAYLOAD, c4596r.m21660e());
        context.sendBroadcast(intent);
        boolean z = ((C4564b) C4562a.m21488a(context).m21503i()).m21509a().f47231e;
        if (CoreUtils.isEmpty(c4596r.m21659d()) || !z) {
            return;
        }
        C4603u0.m21732a().mo21648d(c4596r.m21659d(), c4596r.m21660e(), c4596r.m21664i());
    }
}
