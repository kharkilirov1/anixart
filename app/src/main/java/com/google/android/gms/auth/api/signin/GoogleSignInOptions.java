package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: m */
    @NonNull
    public static final GoogleSignInOptions f15187m;

    /* renamed from: n */
    @NonNull
    @VisibleForTesting
    public static final Scope f15188n;

    /* renamed from: o */
    @NonNull
    @VisibleForTesting
    public static final Scope f15189o;

    /* renamed from: p */
    @NonNull
    @VisibleForTesting
    public static final Scope f15190p;

    /* renamed from: q */
    @NonNull
    @VisibleForTesting
    public static final Scope f15191q;

    /* renamed from: r */
    @NonNull
    @VisibleForTesting
    public static final Scope f15192r;

    /* renamed from: s */
    public static Comparator<Scope> f15193s;

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15194b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final ArrayList<Scope> f15195c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public Account f15196d;

    /* renamed from: e */
    @SafeParcelable.Field
    public boolean f15197e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f15198f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final boolean f15199g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public String f15200h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public String f15201i;

    /* renamed from: j */
    @SafeParcelable.Field
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f15202j;

    /* renamed from: k */
    @Nullable
    @SafeParcelable.Field
    public String f15203k;

    /* renamed from: l */
    public Map<Integer, GoogleSignInOptionsExtensionParcelable> f15204l;

    static {
        Scope scope = new Scope("profile");
        f15188n = scope;
        f15189o = new Scope("email");
        Scope scope2 = new Scope("openid");
        f15190p = scope2;
        Scope scope3 = new Scope("https://www.googleapis.com/auth/games_lite");
        f15191q = scope3;
        f15192r = new Scope("https://www.googleapis.com/auth/games");
        Builder builder = new Builder();
        builder.f15205a.add(scope2);
        builder.f15205a.add(scope);
        f15187m = builder.m7860a();
        Builder builder2 = new Builder();
        builder2.f15205a.add(scope3);
        builder2.f15205a.addAll(Arrays.asList(new Scope[0]));
        builder2.m7860a();
        CREATOR = new zae();
        f15193s = new zac();
    }

    public GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, @Nullable String str3) {
        this.f15194b = i2;
        this.f15195c = arrayList;
        this.f15196d = account;
        this.f15197e = z;
        this.f15198f = z2;
        this.f15199g = z3;
        this.f15200h = str;
        this.f15201i = str2;
        this.f15202j = new ArrayList<>(map.values());
        this.f15204l = map;
        this.f15203k = str3;
    }

    @Nullable
    /* renamed from: n */
    public static GoogleSignInOptions m7857n(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    /* renamed from: o */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m7858o(@Nullable List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f15220c), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0043, code lost:
    
        if (r1.equals(r4.f15196d) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f15202j     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 > 0) goto L7f
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f15202j     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 <= 0) goto L17
            goto L7f
        L17:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f15195c     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.m7859m()     // Catch: java.lang.ClassCastException -> L7f
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f15195c     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.m7859m()     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L34
            goto L7f
        L34:
            android.accounts.Account r1 = r3.f15196d     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L3d
            android.accounts.Account r1 = r4.f15196d     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L7f
            goto L45
        L3d:
            android.accounts.Account r2 = r4.f15196d     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
        L45:
            java.lang.String r1 = r3.f15200h     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L56
            java.lang.String r1 = r4.f15200h     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
            goto L61
        L56:
            java.lang.String r1 = r3.f15200h     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r2 = r4.f15200h     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L61
            goto L7f
        L61:
            boolean r1 = r3.f15199g     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.f15199g     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.f15197e     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.f15197e     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.f15198f     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.f15198f     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.lang.String r1 = r3.f15203k     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r4 = r4.f15203k     // Catch: java.lang.ClassCastException -> L7f
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L7f
            if (r4 == 0) goto L7f
            r4 = 1
            return r4
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f15195c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(arrayList2.get(i2).f15373c);
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.m7863a(arrayList);
        hashAccumulator.m7863a(this.f15196d);
        hashAccumulator.m7863a(this.f15200h);
        hashAccumulator.m7864b(this.f15199g);
        hashAccumulator.m7864b(this.f15197e);
        hashAccumulator.m7864b(this.f15198f);
        hashAccumulator.m7863a(this.f15203k);
        return hashAccumulator.f15222a;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: m */
    public ArrayList<Scope> m7859m() {
        return new ArrayList<>(this.f15195c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15194b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8172k(parcel, 2, m7859m(), false);
        SafeParcelWriter.m8167f(parcel, 3, this.f15196d, i2, false);
        boolean z = this.f15197e;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15198f;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f15199g;
        parcel.writeInt(262150);
        parcel.writeInt(z3 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 7, this.f15200h, false);
        SafeParcelWriter.m8168g(parcel, 8, this.f15201i, false);
        SafeParcelWriter.m8172k(parcel, 9, this.f15202j, false);
        SafeParcelWriter.m8168g(parcel, 10, this.f15203k, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class Builder {

        /* renamed from: a */
        public Set<Scope> f15205a;

        /* renamed from: b */
        public boolean f15206b;

        /* renamed from: c */
        public boolean f15207c;

        /* renamed from: d */
        public boolean f15208d;

        /* renamed from: e */
        @Nullable
        public String f15209e;

        /* renamed from: f */
        @Nullable
        public Account f15210f;

        /* renamed from: g */
        @Nullable
        public String f15211g;

        /* renamed from: h */
        public Map<Integer, GoogleSignInOptionsExtensionParcelable> f15212h;

        /* renamed from: i */
        @Nullable
        public String f15213i;

        public Builder() {
            this.f15205a = new HashSet();
            this.f15212h = new HashMap();
        }

        @NonNull
        /* renamed from: a */
        public GoogleSignInOptions m7860a() {
            if (this.f15205a.contains(GoogleSignInOptions.f15192r)) {
                Set<Scope> set = this.f15205a;
                Scope scope = GoogleSignInOptions.f15191q;
                if (set.contains(scope)) {
                    this.f15205a.remove(scope);
                }
            }
            if (this.f15208d && (this.f15210f == null || !this.f15205a.isEmpty())) {
                this.f15205a.add(GoogleSignInOptions.f15190p);
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f15205a), this.f15210f, this.f15208d, this.f15206b, this.f15207c, this.f15209e, this.f15211g, this.f15212h, this.f15213i);
        }

        @NonNull
        /* renamed from: b */
        public Builder m7861b(@NonNull String str) {
            boolean z = true;
            this.f15208d = true;
            Preconditions.m8129d(str);
            String str2 = this.f15209e;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.m8127b(z, "two different server client ids provided");
            this.f15209e = str;
            return this;
        }

        public Builder(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f15205a = new HashSet();
            this.f15212h = new HashMap();
            Objects.requireNonNull(googleSignInOptions, "null reference");
            this.f15205a = new HashSet(googleSignInOptions.f15195c);
            this.f15206b = googleSignInOptions.f15198f;
            this.f15207c = googleSignInOptions.f15199g;
            this.f15208d = googleSignInOptions.f15197e;
            this.f15209e = googleSignInOptions.f15200h;
            this.f15210f = googleSignInOptions.f15196d;
            this.f15211g = googleSignInOptions.f15201i;
            this.f15212h = GoogleSignInOptions.m7858o(googleSignInOptions.f15202j);
            this.f15213i = googleSignInOptions.f15203k;
        }
    }
}
