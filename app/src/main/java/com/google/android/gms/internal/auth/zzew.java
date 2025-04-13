package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzew extends IOException {
    public zzew(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    public static zzew m8414a() {
        return new zzew("Protocol message had invalid UTF-8.");
    }

    /* renamed from: b */
    public static zzew m8415b() {
        return new zzew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static zzew m8416c() {
        return new zzew("Failed to parse the message.");
    }

    /* renamed from: d */
    public static zzew m8417d() {
        return new zzew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public zzew(String str) {
        super(str);
    }
}
