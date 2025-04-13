package androidx.core.content.p002pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class PackageInfoCompat {

    @RequiresApi
    public static class Api28Impl {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static Signature[] m1704a(@NonNull SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @DoNotInline
        /* renamed from: b */
        public static long m1705b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @Nullable
        @DoNotInline
        /* renamed from: c */
        public static Signature[] m1706c(@NonNull SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m1707d(@NonNull SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m1708e(@NonNull PackageManager packageManager, @NonNull String str, @NonNull byte[] bArr, int i2) {
            return packageManager.hasSigningCertificate(str, bArr, i2);
        }
    }
}
