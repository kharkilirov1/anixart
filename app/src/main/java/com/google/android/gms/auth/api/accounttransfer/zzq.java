package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzq implements Api.ApiOptions.Optional {

    /* renamed from: b */
    public final Bundle f15062b;

    static {
        Bundle bundle = new Bundle();
        if (bundle.containsKey("accountTypes")) {
            return;
        }
        bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
    }

    /* renamed from: a */
    public final Bundle m7849a() {
        return new Bundle(this.f15062b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        Bundle m7849a = m7849a();
        Bundle m7849a2 = ((zzq) obj).m7849a();
        if (m7849a.size() != m7849a2.size()) {
            return false;
        }
        for (String str : m7849a.keySet()) {
            if (!m7849a2.containsKey(str) || !Objects.m8123a(m7849a.get(str), m7849a2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Bundle m7849a = m7849a();
        int size = m7849a.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(m7849a.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) arrayList2.get(i2);
            arrayList.add(str);
            arrayList.add(m7849a.get(str));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }
}
