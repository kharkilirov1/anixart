package com.google.android.play.core.splitinstall;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzbe {

    /* renamed from: a */
    public final Context f20282a;

    public zzbe(@NonNull Context context) {
        this.f20282a = context;
    }

    /* renamed from: a */
    public final Set<String> m10991a() {
        Set<String> hashSet;
        synchronized (zzbe.class) {
            try {
                hashSet = this.f20282a.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }
}
