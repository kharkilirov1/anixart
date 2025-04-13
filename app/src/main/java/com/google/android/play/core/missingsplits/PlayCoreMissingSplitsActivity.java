package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzch;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            String packageName = getPackageName();
            try {
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(C0000a.m21r(new StringBuilder(String.valueOf(packageName).length() + 66), "market://details?id=", packageName, "&referrer=utm_source%3Dplay.core.missingsplits"))).setPackage("com.android.vending"));
            } catch (ActivityNotFoundException e2) {
                new zzag(getClass().getName()).m10836c(e2, "Couldn't start missing splits activity for %s", packageName);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (zzch.m10889b(this)) {
            String charSequence = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb = new StringBuilder(String.valueOf(charSequence).length() + 91);
            sb.append("The app ");
            sb.append(charSequence);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            String charSequence2 = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(charSequence2).length() + 87);
            sb2.append("The app ");
            sb2.append(charSequence2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
    }
}
