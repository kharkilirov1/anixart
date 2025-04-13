package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.e2 */
/* loaded from: classes2.dex */
public class C3912e2 {
    @NonNull
    /* renamed from: b */
    private Map<String, String> m19780b(@Nullable String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf >= 0) {
                str = str.substring(lastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (String str2 : str.split("&")) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf >= 0) {
                        hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                    } else {
                        hashMap.put(str2, "");
                    }
                }
            }
        }
        return hashMap;
    }

    @NonNull
    /* renamed from: a */
    public C4404x0 m19781a(@Nullable String str) {
        HashMap hashMap;
        String decode = Uri.decode((String) ((HashMap) m19780b(str)).get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(decode)) {
            hashMap = null;
        } else {
            HashMap hashMap2 = (HashMap) m19780b(decode);
            hashMap = new HashMap(hashMap2.size());
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new C4404x0(decode, hashMap, str);
    }
}
