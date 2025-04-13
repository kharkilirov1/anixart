package com.google.android.gms.security;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class ProviderInstaller {

    /* renamed from: a */
    public static final GoogleApiAvailabilityLight f17201a = GoogleApiAvailabilityLight.f15328b;

    /* renamed from: b */
    public static final Object f17202b = new Object();

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface ProviderInstallListener {
    }

    /* renamed from: a */
    public static void m9685a(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Preconditions.m8132g(null, "Context must not be null");
        throw null;
    }
}
