package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class AssetPackStates {
    /* renamed from: c */
    public static AssetPackStates m10684c(Bundle bundle, zzco zzcoVar, zzeb zzebVar, List<String> list, zzbe zzbeVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = stringArrayList.get(i2);
            hashMap.put(str, AssetPackState.m10674i(bundle, str, zzcoVar, zzebVar, zzbeVar));
        }
        for (String str2 : list) {
            hashMap.put(str2, AssetPackState.m10673h(str2, 4, 0, 0L, 0L, 0.0d, 1, "", ""));
        }
        return new zzbo(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: a */
    public abstract Map<String, AssetPackState> mo10685a();

    /* renamed from: b */
    public abstract long mo10686b();
}
