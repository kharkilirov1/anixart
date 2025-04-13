package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: b */
    public final IBinder f19648b = new zzch(this);

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        return this.f19648b;
    }
}
