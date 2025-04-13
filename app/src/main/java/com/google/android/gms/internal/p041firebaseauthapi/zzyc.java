package com.google.android.gms.internal.p041firebaseauthapi;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzyc {
    @NonNull
    /* renamed from: a */
    public static zzry m9483a(@NonNull Exception exc, @NonNull String str, @NonNull String str2) {
        String message = exc.getMessage();
        StringBuilder m29z = C0000a.m29z("Failed to parse ", str, " for string [", str2, "] with exception: ");
        m29z.append(message);
        Log.e(str, m29z.toString());
        return new zzry("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }

    @NonNull
    /* renamed from: b */
    public static List m9484b(@Nullable JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
        }
        return arrayList;
    }
}
