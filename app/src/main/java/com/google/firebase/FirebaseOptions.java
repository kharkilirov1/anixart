package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class FirebaseOptions {

    /* renamed from: a */
    public final String f22273a;

    /* renamed from: b */
    public final String f22274b;

    /* renamed from: c */
    public final String f22275c;

    /* renamed from: d */
    public final String f22276d;

    /* renamed from: e */
    public final String f22277e;

    /* renamed from: f */
    public final String f22278f;

    /* renamed from: g */
    public final String f22279g;

    public static final class Builder {

        /* renamed from: a */
        public String f22280a;

        /* renamed from: b */
        public String f22281b;

        /* renamed from: c */
        public String f22282c;

        /* renamed from: d */
        public String f22283d;
    }

    public FirebaseOptions(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.m8134i(!Strings.m8248b(str), "ApplicationId must be set.");
        this.f22274b = str;
        this.f22273a = str2;
        this.f22275c = str3;
        this.f22276d = str4;
        this.f22277e = str5;
        this.f22278f = str6;
        this.f22279g = str7;
    }

    @Nullable
    /* renamed from: a */
    public static FirebaseOptions m12222a(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String m8136a = stringResourceValueReader.m8136a("google_app_id");
        if (TextUtils.isEmpty(m8136a)) {
            return null;
        }
        return new FirebaseOptions(m8136a, stringResourceValueReader.m8136a("google_api_key"), stringResourceValueReader.m8136a("firebase_database_url"), stringResourceValueReader.m8136a("ga_trackingId"), stringResourceValueReader.m8136a("gcm_defaultSenderId"), stringResourceValueReader.m8136a("google_storage_bucket"), stringResourceValueReader.m8136a("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.m8123a(this.f22274b, firebaseOptions.f22274b) && Objects.m8123a(this.f22273a, firebaseOptions.f22273a) && Objects.m8123a(this.f22275c, firebaseOptions.f22275c) && Objects.m8123a(this.f22276d, firebaseOptions.f22276d) && Objects.m8123a(this.f22277e, firebaseOptions.f22277e) && Objects.m8123a(this.f22278f, firebaseOptions.f22278f) && Objects.m8123a(this.f22279g, firebaseOptions.f22279g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22274b, this.f22273a, this.f22275c, this.f22276d, this.f22277e, this.f22278f, this.f22279g});
    }

    public String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m8124a("applicationId", this.f22274b);
        toStringHelper.m8124a("apiKey", this.f22273a);
        toStringHelper.m8124a("databaseUrl", this.f22275c);
        toStringHelper.m8124a("gcmSenderId", this.f22277e);
        toStringHelper.m8124a("storageBucket", this.f22278f);
        toStringHelper.m8124a("projectId", this.f22279g);
        return toStringHelper.toString();
    }
}
