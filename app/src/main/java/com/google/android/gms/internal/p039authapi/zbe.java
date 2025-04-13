package com.google.android.gms.internal.p039authapi;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbe implements CredentialRequestResult {

    /* renamed from: b */
    public final Status f16017b;

    public zbe(Status status, @Nullable Credential credential) {
        this.f16017b = status;
    }

    @Override // com.google.android.gms.common.api.Result
    /* renamed from: k */
    public final Status mo7862k() {
        return this.f16017b;
    }
}
