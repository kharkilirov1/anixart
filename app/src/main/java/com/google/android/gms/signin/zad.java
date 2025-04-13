package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zad {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> f17218a = new zaa();

    static {
        new Scope("profile");
        new Scope("email");
    }
}
