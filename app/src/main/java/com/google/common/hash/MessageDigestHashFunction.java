package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Immutable
/* loaded from: classes.dex */
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: b */
    public final MessageDigest f21793b;

    /* renamed from: c */
    public final int f21794c;

    /* renamed from: d */
    public final boolean f21795d;

    /* renamed from: e */
    public final String f21796e;

    public static final class MessageDigestHasher extends AbstractByteHasher {
    }

    public static final class SerializedForm implements Serializable {
    }

    public MessageDigestHashFunction(String str, String str2) {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.f21793b = messageDigest;
            this.f21794c = messageDigest.getDigestLength();
            this.f21796e = str2;
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.f21795d = z;
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        return this.f21796e;
    }
}
