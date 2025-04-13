package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public class zzaaf extends IOException {

    /* renamed from: b */
    public static final /* synthetic */ int f16261b = 0;

    public zzaaf(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    public static zzaaf m8578a() {
        return new zzaaf("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    public static zzaaf m8579b() {
        return new zzaaf("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static zzaaf m8580c() {
        return new zzaaf("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static zzaaf m8581d() {
        return new zzaaf("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: e */
    public static zzaaf m8582e() {
        return new zzaaf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: f */
    public static zzaaf m8583f() {
        return new zzaaf("Failed to parse the message.");
    }

    /* renamed from: g */
    public static zzaaf m8584g() {
        return new zzaaf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public zzaaf(String str) {
        super(str);
    }
}
