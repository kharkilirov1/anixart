package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzcb {

    /* renamed from: a */
    public static final AtomicBoolean f16061a;

    static {
        Uri.parse("content://com.google.android.gsf.gservices");
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
        f16061a = new AtomicBoolean();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
    }
}
