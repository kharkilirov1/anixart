package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzbg {

    /* renamed from: a */
    public final SharedPreferences f22398a;

    /* renamed from: b */
    public final Logger f22399b;

    public zzbg(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        Preconditions.m8129d(str);
        this.f22398a = context.getApplicationContext().getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", str), 0);
        this.f22399b = new Logger("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca A[Catch: zznp -> 0x012e, IllegalArgumentException -> 0x0130, ArrayIndexOutOfBoundsException -> 0x0132, JSONException -> 0x0134, TRY_ENTER, TryCatch #0 {JSONException -> 0x0134, blocks: (B:3:0x0008, B:6:0x0025, B:10:0x003b, B:13:0x0077, B:16:0x007e, B:17:0x008a, B:20:0x008b, B:22:0x009a, B:24:0x00a2, B:25:0x00a6, B:27:0x00ae, B:31:0x00ca, B:36:0x00cc, B:38:0x00d2, B:40:0x00d8, B:41:0x00de, B:43:0x00e4, B:45:0x00fb, B:47:0x0101, B:49:0x0124, B:51:0x011b, B:52:0x0122, B:56:0x012a), top: B:2:0x0008 }] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.auth.internal.zzx m12311a(org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzbg.m12311a(org.json.JSONObject):com.google.firebase.auth.internal.zzx");
    }
}
