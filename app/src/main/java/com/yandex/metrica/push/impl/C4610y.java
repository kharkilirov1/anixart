package com.yandex.metrica.push.impl;

import android.R;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.y */
/* loaded from: classes2.dex */
public class C4610y implements InterfaceC4612z {
    @Override // com.yandex.metrica.push.impl.InterfaceC4612z
    /* renamed from: a */
    public void mo21418a(@NonNull Context context, @NonNull Intent intent) {
        C4594q c4594q = (C4594q) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        Bundle m1645b = RemoteInput.m1645b(intent);
        if (c4594q == null || m1645b == null) {
            return;
        }
        String charSequence = m1645b.getCharSequence("key_text_reply", "").toString();
        InternalLogger.m21370i("Received inline input from action %s with text %s", c4594q.f47465f, charSequence);
        if (!CoreUtils.isEmpty(c4594q.f47461b)) {
            ((C4564b) C4562a.m21488a(context).m21503i()).m21520l().mo21647c(c4594q.f47461b, c4594q.f47465f, c4594q.f47463d, charSequence, c4594q.f47460a);
        }
        context.sendBroadcast(new Intent(context.getPackageName() + ".action.ymp.INLINE_PUSH_RECEIVE").setPackage(context.getPackageName()).putExtra("com.yandex.metrica.push.extra.ACTION_INFO", c4594q).putExtra("com.yandex.metrica.push.extra.INLINE_ACTION_REPLY", charSequence));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            if (!C4530J0.m21447a(28)) {
                notificationManager.cancel(c4594q.f47466g, c4594q.f47467h);
                C4562a.m21488a(context).m21501g().m21533a(c4594q.f47461b, false);
                return;
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, c4594q.f47469j);
            builder.f3203z.icon = R.drawable.ic_dialog_info;
            builder.m1609c(charSequence);
            builder.f3201x = TimeUnit.SECONDS.toMillis(c4594q.f47468i);
            notificationManager.notify(c4594q.f47466g, c4594q.f47467h, builder.m1608a());
        }
    }
}
