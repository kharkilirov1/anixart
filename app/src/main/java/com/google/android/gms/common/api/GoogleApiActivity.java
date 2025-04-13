package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: c */
    public static final /* synthetic */ int f15368c = 0;

    /* renamed from: b */
    @VisibleForTesting
    public int f15369b = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, @NonNull Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f15369b = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                GoogleApiManager m7983g = GoogleApiManager.m7983g(this);
                if (i3 == -1) {
                    Handler handler = m7983g.f15427o;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i3 == 0) {
                    m7983g.m7990i(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.f15369b = 0;
            setResult(i3, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        this.f15369b = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f15369b = bundle.getInt("resolution");
        }
        if (this.f15369b != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                Objects.requireNonNull(num, "null reference");
                int intValue = num.intValue();
                int i2 = GoogleApiAvailability.f15324c;
                GoogleApiAvailability.f15326e.m7919e(this, intValue, 2, this);
                this.f15369b = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f15369b = 1;
            } catch (ActivityNotFoundException e2) {
                if (extras.getBoolean("notify_manager", true)) {
                    GoogleApiManager.m7983g(this).m7990i(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    String m21r = C0000a.m21r(new StringBuilder(obj.length() + 36), "Activity not found while launching ", obj, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        m21r = m21r.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", m21r, e2);
                }
                this.f15369b = 1;
                finish();
            } catch (IntentSender.SendIntentException e3) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e3);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putInt("resolution", this.f15369b);
        super.onSaveInstanceState(bundle);
    }
}
