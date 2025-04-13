package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.Gm */
/* loaded from: classes2.dex */
public class C3329Gm extends HashMap<String, String> {

    /* renamed from: a */
    private int f43017a;

    public C3329Gm() {
        this.f43017a = 0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String put(@NonNull String str, @Nullable String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f43017a = str2.length() + str.length() + this.f43017a;
            return (String) super.put(str, str2);
        }
        if (str2 == null) {
            return remove(str);
        }
        String str3 = get(str);
        this.f43017a = (str2.length() - (str3 == null ? 0 : str3.length())) + this.f43017a;
        return (String) super.put(str, str2);
    }

    public C3329Gm(@NonNull String str) throws JSONException {
        super(C4452ym.m21268e(str));
        this.f43017a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f43017a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f43017a;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String remove(@NonNull Object obj) {
        if (containsKey(obj)) {
            String str = get(obj);
            this.f43017a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    /* renamed from: a */
    public int m18179a() {
        return this.f43017a;
    }
}
