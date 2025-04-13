package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxg implements zzue {

    /* renamed from: b */
    public String f17006b;

    /* renamed from: c */
    public String f17007c;

    /* renamed from: d */
    public String f17008d;

    /* renamed from: e */
    public String f17009e;

    /* renamed from: f */
    public String f17010f;

    /* renamed from: g */
    public String f17011g;

    /* renamed from: h */
    public final zzxo f17012h = new zzxo(null);

    /* renamed from: i */
    public final zzxo f17013i = new zzxo(null);

    /* renamed from: j */
    @Nullable
    public String f17014j;

    @NonNull
    /* renamed from: a */
    public final zzxg m9475a(@Nullable String str) {
        if (str == null) {
            this.f17012h.f17044c.add("EMAIL");
        } else {
            this.f17008d = str;
        }
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final zzxg m9476b(@Nullable String str) {
        if (str == null) {
            this.f17012h.f17044c.add("PASSWORD");
        } else {
            this.f17009e = str;
        }
        return this;
    }

    /* renamed from: c */
    public final boolean m9477c(String str) {
        Preconditions.m8129d(str);
        return this.f17012h.f17044c.contains(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        char c2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        if (!this.f17013i.f17044c.isEmpty()) {
            List list = this.f17013i.f17044c;
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < list.size(); i2++) {
                jSONArray.put(list.get(i2));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List list2 = this.f17012h.f17044c;
        int size = list2.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < list2.size(); i3++) {
            String str = (String) list2.get(i3);
            int i4 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                i4 = 1;
            } else if (c2 != 1) {
                i4 = c2 != 2 ? c2 != 3 ? 0 : 4 : 5;
            }
            iArr[i3] = i4;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i5 = 0; i5 < size; i5++) {
                jSONArray2.put(iArr[i5]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.f17006b;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.f17008d;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.f17009e;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.f17007c;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.f17011g;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.f17010f;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.f17014j;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }
}
