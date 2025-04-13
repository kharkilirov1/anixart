package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzvl extends BroadcastReceiver {

    /* renamed from: a */
    public final String f16892a;

    /* renamed from: b */
    public final /* synthetic */ zzvn f16893b;

    public zzvl(zzvn zzvnVar, String str) {
        this.f16893b = zzvnVar;
        this.f16892a = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f15380c == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzvm zzvmVar = (zzvm) this.f16893b.f16906c.get(this.f16892a);
                if (zzvmVar == null) {
                    Logger logger = zzvn.f16903d;
                    Log.e(logger.f15834a, logger.m8206c("Verification code received with no active retrieval session.", new Object[0]));
                } else {
                    Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
                    String group = matcher.find() ? matcher.group() : null;
                    zzvmVar.f16898e = group;
                    if (group == null) {
                        Logger logger2 = zzvn.f16903d;
                        Log.e(logger2.f15834a, logger2.m8206c("Unable to extract verification code.", new Object[0]));
                    } else if (!zzag.m8817c(zzvmVar.f16897d)) {
                        zzvn.m9452b(this.f16893b, this.f16892a);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
