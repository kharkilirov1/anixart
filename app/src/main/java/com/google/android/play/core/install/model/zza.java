package com.google.android.play.core.install.model;

import com.yandex.div2.C3033a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zza {

    /* renamed from: a */
    public static final Map<Integer, String> f20085a;

    /* renamed from: b */
    public static final Map<Integer, String> f20086b;

    static {
        HashMap hashMap = new HashMap();
        f20085a = hashMap;
        HashMap hashMap2 = new HashMap();
        f20086b = hashMap2;
        Integer m17739a = C3033a.m17739a(hashMap, -2, "An unknown error occurred.", -3, "The API is not available on this device.");
        Integer m17739a2 = C3033a.m17739a(hashMap, -4, "The request that was sent by the app is malformed.", -5, "The install is unavailable to this user or device.");
        Integer m17739a3 = C3033a.m17739a(hashMap, -6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", -7, "The install/update has not been (fully) downloaded yet.");
        Integer m17739a4 = C3033a.m17739a(hashMap, -8, "The install is already in progress and there is no UI flow to resume.", -9, "The Play Store app is either not installed or not the official version.");
        Integer m17739a5 = C3033a.m17739a(hashMap, -10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "An internal error happened in the Play Store.");
        hashMap2.put(-2, "ERROR_UNKNOWN");
        hashMap2.put(m17739a, "ERROR_API_NOT_AVAILABLE");
        hashMap2.put(-4, "ERROR_INVALID_REQUEST");
        hashMap2.put(m17739a2, "ERROR_INSTALL_UNAVAILABLE");
        hashMap2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        hashMap2.put(m17739a3, "ERROR_DOWNLOAD_NOT_PRESENT");
        hashMap2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        hashMap2.put(m17739a5, "ERROR_INTERNAL_ERROR");
        hashMap2.put(m17739a4, "ERROR_PLAY_STORE_NOT_FOUND");
        hashMap2.put(-10, "ERROR_APP_NOT_OWNED");
        hashMap2.put(m17739a5, "ERROR_INTERNAL_ERROR");
    }
}
