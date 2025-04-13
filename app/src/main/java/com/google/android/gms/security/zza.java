package com.google.android.gms.security;

import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zza extends AsyncTask<Void, Void, Integer> {
    @Override // android.os.AsyncTask
    public final Integer doInBackground(Void[] voidArr) {
        try {
            ProviderInstaller.m9685a(null);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e2) {
            return Integer.valueOf(e2.f15329b);
        } catch (GooglePlayServicesRepairableException e3) {
            return Integer.valueOf(e3.f15330b);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        Integer num2 = num;
        if (num2.intValue() == 0) {
            throw null;
        }
        ProviderInstaller.f17201a.mo7916a(null, num2.intValue(), "pi");
        num2.intValue();
        throw null;
    }
}
