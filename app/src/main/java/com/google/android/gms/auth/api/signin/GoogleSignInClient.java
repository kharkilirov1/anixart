package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {

    /* renamed from: k */
    @VisibleForTesting
    public static int f15186k = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GoogleSignInClient(@androidx.annotation.NonNull android.app.Activity r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8) {
        /*
            r6 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r3 = com.google.android.gms.auth.api.Auth.f15038a
            com.google.android.gms.common.api.internal.ApiExceptionMapper r0 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r0.<init>()
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r1 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r1.<init>()
            r1.f15366a = r0
            android.os.Looper r0 = r7.getMainLooper()
            java.lang.String r2 = "Looper must not be null."
            com.google.android.gms.common.internal.Preconditions.m8132g(r0, r2)
            r1.f15367b = r0
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r1.m7950a()
            r0 = r6
            r1 = r7
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInClient.<init>(android.app.Activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    @NonNull
    /* renamed from: e */
    public Intent m7855e() {
        Context context = this.f15353a;
        int m7856f = m7856f();
        int i2 = m7856f - 1;
        if (m7856f == 0) {
            throw null;
        }
        if (i2 == 2) {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) this.f15356d;
            zbm.f15244a.m8204a("getFallbackSignInIntent()", new Object[0]);
            Intent m7883a = zbm.m7883a(context, googleSignInOptions);
            m7883a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return m7883a;
        }
        if (i2 == 3) {
            return zbm.m7883a(context, (GoogleSignInOptions) this.f15356d);
        }
        GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions) this.f15356d;
        zbm.f15244a.m8204a("getNoImplementationSignInIntent()", new Object[0]);
        Intent m7883a2 = zbm.m7883a(context, googleSignInOptions2);
        m7883a2.setAction("com.google.android.gms.auth.NO_IMPL");
        return m7883a2;
    }

    /* renamed from: f */
    public final synchronized int m7856f() {
        int i2;
        i2 = f15186k;
        if (i2 == 1) {
            Context context = this.f15353a;
            int i3 = GoogleApiAvailability.f15324c;
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f15326e;
            int mo7917c = googleApiAvailability.mo7917c(context, 12451000);
            if (mo7917c == 0) {
                f15186k = 4;
                i2 = 4;
            } else if (googleApiAvailability.mo7916a(context, mo7917c, null) != null || DynamiteModule.m8286a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                f15186k = 2;
                i2 = 2;
            } else {
                f15186k = 3;
                i2 = 3;
            }
        }
        return i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GoogleSignInClient(@androidx.annotation.NonNull android.content.Context r4, com.google.android.gms.auth.api.signin.GoogleSignInOptions r5) {
        /*
            r3 = this;
            com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r0 = com.google.android.gms.auth.api.Auth.f15038a
            com.google.android.gms.common.api.internal.ApiExceptionMapper r1 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
            r1.<init>()
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r2 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r2.<init>()
            r2.f15366a = r1
            com.google.android.gms.common.api.GoogleApi$Settings r1 = r2.m7950a()
            r3.<init>(r4, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInClient.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }
}
