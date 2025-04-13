package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static zag m8185b(Activity activity, @Nullable Intent intent, int i2) {
        return new zad(intent, activity, i2);
    }

    /* renamed from: c */
    public static zag m8186c(@NonNull LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i2) {
        return new zaf(intent, lifecycleFragment);
    }

    /* renamed from: a */
    public abstract void mo8184a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            mo8184a();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
