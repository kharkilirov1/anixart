package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p041firebaseauthapi.zztu;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzaw extends BroadcastReceiver {

    /* renamed from: a */
    public final WeakReference f22386a;

    /* renamed from: b */
    public final TaskCompletionSource f22387b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f22386a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f22387b.m9715a(zztu.m9397a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            zzax.m12302a(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            Map map = zzbl.f22404a;
            if (intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                this.f22387b.m9715a(zztu.m9397a(zzbl.m12312a(intent)));
                zzax.m12302a(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f22387b.m9715a(zztu.m9397a(zzai.m12298a("WEB_CONTEXT_CANCELED")));
                    zzax.m12302a(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
            this.f22387b.m9716b(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
            zzax.m12302a(context);
            return;
        }
        this.f22387b.m9715a(zztu.m9397a(zzai.m12298a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
    }
}
