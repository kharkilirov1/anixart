package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15173b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public String f15174c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public String f15175d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public String f15176e;

    /* renamed from: f */
    @Nullable
    @SafeParcelable.Field
    public String f15177f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public Uri f15178g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public String f15179h;

    /* renamed from: i */
    @SafeParcelable.Field
    public long f15180i;

    /* renamed from: j */
    @SafeParcelable.Field
    public String f15181j;

    /* renamed from: k */
    @SafeParcelable.Field
    public List<Scope> f15182k;

    /* renamed from: l */
    @Nullable
    @SafeParcelable.Field
    public String f15183l;

    /* renamed from: m */
    @Nullable
    @SafeParcelable.Field
    public String f15184m;

    /* renamed from: n */
    public Set<Scope> f15185n = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param int i2, @Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @Nullable @SafeParcelable.Param Uri uri, @Nullable @SafeParcelable.Param String str5, @SafeParcelable.Param long j2, @SafeParcelable.Param String str6, @SafeParcelable.Param List<Scope> list, @Nullable @SafeParcelable.Param String str7, @Nullable @SafeParcelable.Param String str8) {
        this.f15173b = i2;
        this.f15174c = str;
        this.f15175d = str2;
        this.f15176e = str3;
        this.f15177f = str4;
        this.f15178g = uri;
        this.f15179h = str5;
        this.f15180i = j2;
        this.f15181j = str6;
        this.f15182k = list;
        this.f15183l = str7;
        this.f15184m = str8;
    }

    @Nullable
    /* renamed from: n */
    public static GoogleSignInAccount m7853n(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        Preconditions.m8129d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f15179h = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f15181j.equals(this.f15181j) && googleSignInAccount.m7854m().equals(m7854m());
    }

    public int hashCode() {
        return m7854m().hashCode() + C0576a.m4107f(this.f15181j, 527, 31);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: m */
    public Set<Scope> m7854m() {
        HashSet hashSet = new HashSet(this.f15182k);
        hashSet.addAll(this.f15185n);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15173b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15174c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f15175d, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f15176e, false);
        SafeParcelWriter.m8168g(parcel, 5, this.f15177f, false);
        SafeParcelWriter.m8167f(parcel, 6, this.f15178g, i2, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f15179h, false);
        long j2 = this.f15180i;
        parcel.writeInt(524296);
        parcel.writeLong(j2);
        SafeParcelWriter.m8168g(parcel, 9, this.f15181j, false);
        SafeParcelWriter.m8172k(parcel, 10, this.f15182k, false);
        SafeParcelWriter.m8168g(parcel, 11, this.f15183l, false);
        SafeParcelWriter.m8168g(parcel, 12, this.f15184m, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
