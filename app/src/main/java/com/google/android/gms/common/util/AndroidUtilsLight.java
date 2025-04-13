package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class AndroidUtilsLight {
    @Nullable
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static byte[] m8232a(@NonNull Context context, @NonNull String str) throws PackageManager.NameNotFoundException {
        MessageDigest m8233b;
        PackageInfo packageInfo = Wrappers.m8251a(context).f15914a.getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m8233b = m8233b("SHA1")) == null) {
            return null;
        }
        return m8233b.digest(packageInfo.signatures[0].toByteArray());
    }

    @Nullable
    /* renamed from: b */
    public static MessageDigest m8233b(@NonNull String str) {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
