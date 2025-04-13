package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
public interface SmsCodeAutofillClient extends HasApiKey<Api.ApiOptions.NoOptions> {

    /* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionState {
    }
}
