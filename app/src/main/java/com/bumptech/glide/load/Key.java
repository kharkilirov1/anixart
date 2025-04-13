package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public interface Key {

    /* renamed from: a */
    public static final Charset f8055a = Charset.forName("UTF-8");

    /* renamed from: a */
    void mo4956a(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
