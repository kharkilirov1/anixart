package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.re */
/* loaded from: classes3.dex */
final class C5685re {
    /* renamed from: a */
    public static void m27909a(@NonNull p80 p80Var, @NonNull BiddingSettings biddingSettings) {
        List<AdUnitIdBiddingSettings> m21923c = biddingSettings.m21923c();
        HashSet hashSet = new HashSet(m21923c.size());
        for (AdUnitIdBiddingSettings adUnitIdBiddingSettings : m21923c) {
            String m21920c = adUnitIdBiddingSettings.m21920c();
            String m21922e = adUnitIdBiddingSettings.m21922e();
            hashSet.add(m21920c);
            p80Var.putString("BiddingSettingsAdUnitIdsInfo_" + m21920c, m21922e);
        }
        for (String str : p80Var.mo27185a(Collections.emptySet())) {
            if (!hashSet.contains(str)) {
                p80Var.remove("BiddingSettingsAdUnitIdsInfo_" + str);
            }
        }
        p80Var.mo27188a(hashSet);
    }

    /* renamed from: b */
    public static void m27910b(@NonNull p80 p80Var) {
        Iterator it = p80Var.mo27185a(Collections.emptySet()).iterator();
        while (it.hasNext()) {
            p80Var.remove("BiddingSettingsAdUnitIdsInfo_" + ((String) it.next()));
        }
        p80Var.remove("BiddingSettingsAdUnitIdsSet");
    }

    @Nullable
    /* renamed from: a */
    public static BiddingSettings m27908a(@NonNull p80 p80Var) {
        Set mo27185a = p80Var.mo27185a(Collections.emptySet());
        if (!mo27185a.isEmpty()) {
            C5634qe c5634qe = new C5634qe();
            ArrayList arrayList = new ArrayList(mo27185a.size());
            Iterator it = mo27185a.iterator();
            while (it.hasNext()) {
                String mo27190b = p80Var.mo27190b("BiddingSettingsAdUnitIdsInfo_" + ((String) it.next()));
                if (mo27190b != null && !mo27190b.isEmpty()) {
                    try {
                        AdUnitIdBiddingSettings m27701a = c5634qe.m27701a(new JSONObject(mo27190b));
                        if (m27701a != null) {
                            arrayList.add(m27701a);
                        }
                    } catch (JSONException unused) {
                        n60.m26810c("Can't parse bidding block from shared prefs", new Object[0]);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new BiddingSettings(arrayList);
            }
        }
        return null;
    }
}
