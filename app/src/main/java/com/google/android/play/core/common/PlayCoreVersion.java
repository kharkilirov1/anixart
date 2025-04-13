package com.google.android.play.core.common;

import android.os.Bundle;
import com.google.android.play.core.internal.zzag;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class PlayCoreVersion {

    /* renamed from: a */
    public static final Map<String, Map<String, Integer>> f20080a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList(PluginErrorDetails.Platform.NATIVE, PluginErrorDetails.Platform.UNITY));
        f20080a = new HashMap();
        new zzag("PlayCoreVersion");
    }

    /* renamed from: a */
    public static Bundle m10821a(String str) {
        Map map;
        Bundle bundle = new Bundle();
        synchronized (PlayCoreVersion.class) {
            Map<String, Map<String, Integer>> map2 = f20080a;
            if (!((HashMap) map2).containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11002);
                ((HashMap) map2).put(str, hashMap);
            }
            map = (Map) ((HashMap) map2).get(str);
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey(PluginErrorDetails.Platform.NATIVE)) {
            bundle.putInt("playcore_native_version", ((Integer) map.get(PluginErrorDetails.Platform.NATIVE)).intValue());
        }
        if (map.containsKey(PluginErrorDetails.Platform.UNITY)) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get(PluginErrorDetails.Platform.UNITY)).intValue());
        }
        return bundle;
    }
}
