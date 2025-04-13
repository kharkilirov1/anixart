package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p041firebaseauthapi.zzxq;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzh {
    @NonNull
    /* renamed from: a */
    public static zzxq m12318a(AuthCredential authCredential, @Nullable String str) {
        if (GoogleAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            GoogleAuthCredential googleAuthCredential = (GoogleAuthCredential) authCredential;
            return new zzxq(googleAuthCredential.f22325b, googleAuthCredential.f22326c, "google.com", null, null, str, null, null);
        }
        if (FacebookAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return new zzxq(null, ((FacebookAuthCredential) authCredential).f22305b, "facebook.com", null, null, str, null, null);
        }
        if (TwitterAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            TwitterAuthCredential twitterAuthCredential = (TwitterAuthCredential) authCredential;
            return new zzxq(null, twitterAuthCredential.f22340b, "twitter.com", twitterAuthCredential.f22341c, null, str, null, null);
        }
        if (GithubAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return new zzxq(null, ((GithubAuthCredential) authCredential).f22324b, "github.com", null, null, str, null, null);
        }
        if (PlayGamesAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return new zzxq(null, null, "playgames.google.com", null, ((PlayGamesAuthCredential) authCredential).f22339b, str, null, null);
        }
        if (!com.google.firebase.auth.zze.class.isAssignableFrom(authCredential.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        com.google.firebase.auth.zze zzeVar = (com.google.firebase.auth.zze) authCredential;
        zzxq zzxqVar = zzeVar.f22454e;
        return zzxqVar != null ? zzxqVar : new zzxq(zzeVar.f22452c, zzeVar.f22453d, zzeVar.f22451b, zzeVar.f22456g, null, str, zzeVar.f22455f, zzeVar.f22457h);
    }
}
