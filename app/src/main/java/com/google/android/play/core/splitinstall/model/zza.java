package com.google.android.play.core.splitinstall.model;

import com.yandex.div2.C3033a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zza {

    /* renamed from: a */
    public static final Map<Integer, String> f20217a;

    /* renamed from: b */
    public static final Map<Integer, String> f20218b;

    /* renamed from: c */
    public static final Map<String, Integer> f20219c;

    static {
        HashMap hashMap = new HashMap();
        f20217a = hashMap;
        HashMap hashMap2 = new HashMap();
        f20218b = hashMap2;
        Integer m17739a = C3033a.m17739a(hashMap, -1, "Too many sessions are running for current app, existing sessions must be resolved first.", -2, "A requested module is not available (to this user/device, for the installed apk).");
        Integer m17739a2 = C3033a.m17739a(hashMap, -3, "Request is otherwise invalid.", -4, "Requested session is not found.");
        Integer m17739a3 = C3033a.m17739a(hashMap, -5, "Split Install API is not available.", -6, "Network error: unable to obtain split details.");
        Integer m17739a4 = C3033a.m17739a(hashMap, -7, "Download not permitted under current device circumstances (e.g. in background).", -8, "Requested session contains modules from an existing active session and also new modules.");
        Integer m17739a5 = C3033a.m17739a(hashMap, -9, "Service handling split install has died.", -10, "Install failed due to insufficient storage.");
        Integer m17739a6 = C3033a.m17739a(hashMap, -11, "Signature verification error when invoking SplitCompat.", -12, "Error in SplitCompat emulation.");
        Integer m17739a7 = C3033a.m17739a(hashMap, -13, "Error in copying files for SplitCompat.", -14, "The Play Store app is either not installed or not the official version.");
        Integer m17739a8 = C3033a.m17739a(hashMap, -15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "Unknown error processing split install.");
        hashMap2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        hashMap2.put(m17739a, "MODULE_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(m17739a2, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(m17739a3, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(m17739a4, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        hashMap2.put(-9, "SERVICE_DIED");
        hashMap2.put(m17739a5, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        hashMap2.put(m17739a6, "SPLITCOMPAT_EMULATION_ERROR");
        hashMap2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        hashMap2.put(m17739a7, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-15, "APP_NOT_OWNED");
        hashMap2.put(m17739a8, "INTERNAL_ERROR");
        f20219c = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            f20219c.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }

    @SplitInstallErrorCode
    /* renamed from: a */
    public static int m10971a(String str) {
        Integer num = (Integer) ((HashMap) f20219c).get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" is unknown error."));
    }
}
