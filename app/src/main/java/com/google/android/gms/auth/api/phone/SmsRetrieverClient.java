package com.google.android.gms.auth.api.phone;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {

    /* renamed from: k */
    public static final Api<Api.ApiOptions.NoOptions> f15160k = new Api<>("SmsRetriever.API", new zza(), new Api.ClientKey());

    public SmsRetrieverClient(@NonNull Context context) {
        super(context, f15160k, Api.ApiOptions.f15348z1, GoogleApi.Settings.f15363c);
    }
}
