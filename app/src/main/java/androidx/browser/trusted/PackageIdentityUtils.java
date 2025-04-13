package androidx.browser.trusted;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class PackageIdentityUtils {

    @RequiresApi
    public static class Api28Implementation implements SignaturesCompat {
        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        /* renamed from: a */
        public boolean mo1039a(String str, PackageManager packageManager, TokenContents tokenContents) throws PackageManager.NameNotFoundException, IOException {
            tokenContents.m1041b();
            String str2 = tokenContents.f1748b;
            if (str2 == null) {
                throw new IllegalStateException();
            }
            if (!str2.equals(str)) {
                return false;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(PackageIdentityUtils.m1038a(signature));
                }
            } else {
                arrayList.add(PackageIdentityUtils.m1038a(signingInfo.getSigningCertificateHistory()[0]));
            }
            if (arrayList.size() != 1) {
                return tokenContents.equals(TokenContents.m1040a(str, arrayList));
            }
            tokenContents.m1041b();
            List<byte[]> list = tokenContents.f1749c;
            if (list != null) {
                return packageManager.hasSigningCertificate(str, Arrays.copyOf(list.get(0), tokenContents.f1749c.get(0).length), 1);
            }
            throw new IllegalStateException();
        }
    }

    public static class Pre28Implementation implements SignaturesCompat {
        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        /* renamed from: a */
        public boolean mo1039a(String str, PackageManager packageManager, TokenContents tokenContents) throws IOException, PackageManager.NameNotFoundException {
            tokenContents.m1041b();
            String str2 = tokenContents.f1748b;
            if (str2 == null) {
                throw new IllegalStateException();
            }
            if (!str.equals(str2)) {
                return false;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            Signature[] signatureArr = packageInfo.signatures;
            int length = signatureArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                byte[] m1038a = PackageIdentityUtils.m1038a(signatureArr[i2]);
                if (m1038a == null) {
                    arrayList = null;
                    break;
                }
                arrayList.add(m1038a);
                i2++;
            }
            if (arrayList == null) {
                return false;
            }
            return tokenContents.equals(TokenContents.m1040a(str, arrayList));
        }
    }

    public interface SignaturesCompat {
        /* renamed from: a */
        boolean mo1039a(String str, PackageManager packageManager, TokenContents tokenContents) throws IOException, PackageManager.NameNotFoundException;
    }

    @Nullable
    /* renamed from: a */
    public static byte[] m1038a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
