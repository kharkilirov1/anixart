package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class EmptySignature implements Key {

    /* renamed from: b */
    public static final EmptySignature f8826b = new EmptySignature();

    @Override // com.bumptech.glide.load.Key
    /* renamed from: a */
    public void mo4956a(@NonNull MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
