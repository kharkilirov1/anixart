package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzwy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwy> CREATOR = new zzwz();

    /* renamed from: b */
    @SafeParcelable.Field
    public final List f16987b;

    public zzwy() {
        this.f16987b = new ArrayList();
    }

    /* renamed from: m */
    public static zzwy m9474m(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzwy(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            arrayList.add(jSONObject == null ? new zzww() : new zzww(Strings.m8247a(jSONObject.optString("federatedId", null)), Strings.m8247a(jSONObject.optString("displayName", null)), Strings.m8247a(jSONObject.optString("photoUrl", null)), Strings.m8247a(jSONObject.optString("providerId", null)), null, Strings.m8247a(jSONObject.optString("phoneNumber", null)), Strings.m8247a(jSONObject.optString("email", null))));
        }
        return new zzwy(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8172k(parcel, 2, this.f16987b, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzwy(@SafeParcelable.Param List list) {
        if (list != null && !list.isEmpty()) {
            this.f16987b = Collections.unmodifiableList(list);
        } else {
            this.f16987b = Collections.emptyList();
        }
    }
}
