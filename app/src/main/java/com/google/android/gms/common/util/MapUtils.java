package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class MapUtils {
    @KeepForSdk
    /* renamed from: a */
    public static void m8243a(@NonNull StringBuilder sb, @NonNull HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            C0000a.m1B(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                C0000a.m1B(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
