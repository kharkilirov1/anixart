package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzwh extends AbstractSafeParcelable implements zzuf<zzwh> {
    public static final Parcelable.Creator<zzwh> CREATOR = new zzwi();

    /* renamed from: b */
    @SafeParcelable.Field
    public zzwl f16947b;

    public zzwh() {
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        zzwl zzwlVar;
        int i2;
        zzwj zzwjVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z = false;
                    int i3 = 0;
                    while (i3 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                        if (jSONObject2 == null) {
                            zzwjVar = new zzwj();
                            i2 = i3;
                        } else {
                            i2 = i3;
                            zzwjVar = new zzwj(Strings.m8247a(jSONObject2.optString("localId", null)), Strings.m8247a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z), Strings.m8247a(jSONObject2.optString("displayName", null)), Strings.m8247a(jSONObject2.optString("photoUrl", null)), zzwy.m9474m(jSONObject2.optJSONArray("providerUserInfo")), Strings.m8247a(jSONObject2.optString("rawPassword", null)), Strings.m8247a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzwu.m9473n(jSONObject2.optJSONArray("mfaInfo")));
                        }
                        arrayList.add(zzwjVar);
                        i3 = i2 + 1;
                        z = false;
                    }
                    zzwlVar = new zzwl(arrayList);
                    this.f16947b = zzwlVar;
                }
                zzwlVar = new zzwl(new ArrayList());
                this.f16947b = zzwlVar;
            } else {
                this.f16947b = new zzwl();
            }
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzwh", str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 2, this.f16947b, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzwh(@SafeParcelable.Param zzwl zzwlVar) {
        zzwl zzwlVar2;
        if (zzwlVar == null) {
            zzwlVar2 = new zzwl();
        } else {
            List list = zzwlVar.f16961b;
            zzwl zzwlVar3 = new zzwl();
            if (list != null && !list.isEmpty()) {
                zzwlVar3.f16961b.addAll(list);
            }
            zzwlVar2 = zzwlVar3;
        }
        this.f16947b = zzwlVar2;
    }
}
