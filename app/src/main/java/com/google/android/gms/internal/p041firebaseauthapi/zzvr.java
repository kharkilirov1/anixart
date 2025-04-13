package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvr {

    /* renamed from: a */
    public static final Map f16907a = new ArrayMap();

    /* renamed from: b */
    public static final Map f16908b = new ArrayMap();

    @NonNull
    /* renamed from: a */
    public static String m9462a(String str) {
        zzvp zzvpVar;
        Object obj = f16907a;
        synchronized (obj) {
            zzvpVar = (zzvp) ((SimpleArrayMap) obj).get(str);
        }
        if (zzvpVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        throw null;
    }

    @NonNull
    /* renamed from: b */
    public static String m9463b(String str) {
        zzvp zzvpVar;
        Object obj = f16907a;
        synchronized (obj) {
            zzvpVar = (zzvp) ((SimpleArrayMap) obj).get(str);
        }
        if (zzvpVar == null) {
            return "https://".concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
        }
        throw null;
    }
}
