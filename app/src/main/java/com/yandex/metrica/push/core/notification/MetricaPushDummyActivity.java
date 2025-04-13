package com.yandex.metrica.push.core.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C4562a;
import com.yandex.metrica.push.impl.C4564b;
import com.yandex.metrica.push.impl.C4608x;
import java.util.Objects;

/* loaded from: classes2.dex */
public class MetricaPushDummyActivity extends Activity {
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            Context applicationContext = getApplicationContext();
            Intent intent = getIntent();
            Objects.requireNonNull(((C4564b) C4562a.m21488a(applicationContext).m21503i()).m21512d());
            ((C4608x) ((C4564b) C4562a.m21488a(applicationContext).m21503i()).m21513e()).m21740a(applicationContext, intent);
            finish();
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle notification action", th);
        }
    }
}
