package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.security.Signature;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* loaded from: classes.dex */
public class FingerprintManagerCompat {

    /* renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$1 */
    class C02371 extends FingerprintManager.AuthenticationCallback {
        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i2, CharSequence charSequence) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i2, CharSequence charSequence) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            Api23Impl.m1902f(Api23Impl.m1898b(authenticationResult));
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @RequiresPermission
        @DoNotInline
        /* renamed from: a */
        public static void m1897a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i2, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i2, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @DoNotInline
        /* renamed from: b */
        public static FingerprintManager.CryptoObject m1898b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @DoNotInline
        /* renamed from: c */
        public static FingerprintManager m1899c(Context context) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i2 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        @RequiresPermission
        @DoNotInline
        /* renamed from: d */
        public static boolean m1900d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @RequiresPermission
        @DoNotInline
        /* renamed from: e */
        public static boolean m1901e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @DoNotInline
        /* renamed from: f */
        public static CryptoObject m1902f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        @DoNotInline
        /* renamed from: g */
        public static FingerprintManager.CryptoObject m1903g(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.f3426b != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.f3426b);
            }
            if (cryptoObject.f3425a != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.f3425a);
            }
            if (cryptoObject.f3427c != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.f3427c);
            }
            return null;
        }
    }

    public static abstract class AuthenticationCallback {
    }

    public static final class AuthenticationResult {
    }

    public static class CryptoObject {

        /* renamed from: a */
        public final Signature f3425a;

        /* renamed from: b */
        public final Cipher f3426b;

        /* renamed from: c */
        public final Mac f3427c;

        public CryptoObject(@NonNull Signature signature) {
            this.f3425a = signature;
            this.f3426b = null;
            this.f3427c = null;
        }

        public CryptoObject(@NonNull Cipher cipher) {
            this.f3426b = cipher;
            this.f3425a = null;
            this.f3427c = null;
        }

        public CryptoObject(@NonNull Mac mac) {
            this.f3427c = mac;
            this.f3426b = null;
            this.f3425a = null;
        }
    }
}
