package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ProgressBar;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zao implements Runnable {

    /* renamed from: b */
    public final zam f15594b;

    /* renamed from: c */
    public final /* synthetic */ zap f15595c;

    public zao(zap zapVar, zam zamVar) {
        this.f15595c = zapVar;
        this.f15594b = zamVar;
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        if (this.f15595c.f15596c) {
            ConnectionResult connectionResult = this.f15594b.f15591b;
            if (connectionResult.m7913m()) {
                zap zapVar = this.f15595c;
                LifecycleFragment lifecycleFragment = zapVar.f15430b;
                Activity m7995b = zapVar.m7995b();
                PendingIntent pendingIntent = connectionResult.f15316d;
                Objects.requireNonNull(pendingIntent, "null reference");
                int i2 = this.f15594b.f15590a;
                int i3 = GoogleApiActivity.f15368c;
                Intent intent = new Intent(m7995b, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i2);
                intent.putExtra("notify_manager", false);
                lifecycleFragment.startActivityForResult(intent, 1);
                return;
            }
            zap zapVar2 = this.f15595c;
            if (zapVar2.f15599f.mo7916a(zapVar2.m7995b(), connectionResult.f15315c, null) != null) {
                zap zapVar3 = this.f15595c;
                GoogleApiAvailability googleApiAvailability = zapVar3.f15599f;
                Activity m7995b2 = zapVar3.m7995b();
                zap zapVar4 = this.f15595c;
                googleApiAvailability.m7924j(m7995b2, zapVar4.f15430b, connectionResult.f15315c, zapVar4);
                return;
            }
            if (connectionResult.f15315c != 18) {
                zap zapVar5 = this.f15595c;
                int i4 = this.f15594b.f15590a;
                zapVar5.f15597d.set(null);
                zapVar5.mo8017l(connectionResult, i4);
                return;
            }
            zap zapVar6 = this.f15595c;
            GoogleApiAvailability googleApiAvailability2 = zapVar6.f15599f;
            Activity m7995b3 = zapVar6.m7995b();
            zap zapVar7 = this.f15595c;
            Objects.requireNonNull(googleApiAvailability2);
            ProgressBar progressBar = new ProgressBar(m7995b3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(m7995b3);
            builder.setView(progressBar);
            builder.setMessage(com.google.android.gms.common.internal.zac.m8180b(m7995b3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            googleApiAvailability2.m7922h(m7995b3, create, "GooglePlayServicesUpdatingDialog", zapVar7);
            zap zapVar8 = this.f15595c;
            zapVar8.f15599f.m7921g(zapVar8.m7995b().getApplicationContext(), new zan(this, create));
        }
    }
}
