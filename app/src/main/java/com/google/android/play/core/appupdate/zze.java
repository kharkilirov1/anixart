package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.IntentSenderForResultStarter;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zze implements IntentSenderForResultStarter {

    /* renamed from: a */
    public final /* synthetic */ Activity f19609a;

    public zze(Activity activity) {
        this.f19609a = activity;
    }

    /* renamed from: a */
    public final void m10659a(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        this.f19609a.startIntentSenderForResult(intentSender, i2, null, i3, i4, i5, null);
    }
}
