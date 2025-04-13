package com.google.android.play.core.assetpacks.model;

import com.yandex.div2.C3033a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zza {

    /* renamed from: a */
    public static final Map<Integer, String> f19649a;

    /* renamed from: b */
    public static final Map<Integer, String> f19650b;

    static {
        HashMap hashMap = new HashMap();
        f19649a = hashMap;
        HashMap hashMap2 = new HashMap();
        f19650b = hashMap2;
        Integer m17739a = C3033a.m17739a(hashMap, -1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).", -2, "The requested pack is not available.");
        Integer m17739a2 = C3033a.m17739a(hashMap, -3, "The request is invalid.", -4, "The requested download is not found.");
        Integer m17739a3 = C3033a.m17739a(hashMap, -5, "The Asset Delivery API is not available.", -6, "Network error. Unable to obtain the asset pack details.");
        Integer m17739a4 = C3033a.m17739a(hashMap, -7, "Download not permitted under current device circumstances (e.g. in background).", -10, "Asset pack download failed due to insufficient storage.");
        Integer m17739a5 = C3033a.m17739a(hashMap, -11, "The Play Store app is either not installed or not the official version.", -12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        Integer m17739a6 = C3033a.m17739a(hashMap, -13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "Unknown error downloading an asset pack.");
        hashMap2.put(-1, "APP_UNAVAILABLE");
        hashMap2.put(m17739a, "PACK_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(m17739a2, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(m17739a3, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(m17739a4, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(m17739a5, "NETWORK_UNRESTRICTED");
        hashMap2.put(-13, "APP_NOT_OWNED");
        hashMap2.put(m17739a6, "INTERNAL_ERROR");
    }
}
