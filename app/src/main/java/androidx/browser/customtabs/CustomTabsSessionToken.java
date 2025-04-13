package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class CustomTabsSessionToken {

    /* renamed from: a */
    @Nullable
    public final ICustomTabsCallback f1741a;

    /* renamed from: b */
    @Nullable
    public final PendingIntent f1742b;

    /* renamed from: androidx.browser.customtabs.CustomTabsSessionToken$1 */
    public class C01611 extends CustomTabsCallback {
    }

    public static class MockCallback extends ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: C1 */
        public void mo30C1(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: R1 */
        public void mo31R1(int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: n2 */
        public void mo32n2(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: u2 */
        public void mo33u2(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: w0 */
        public Bundle mo34w0(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: w2 */
        public void mo35w2(int i2, Uri uri, boolean z, Bundle bundle) {
        }
    }

    public CustomTabsSessionToken(@Nullable ICustomTabsCallback iCustomTabsCallback, @Nullable PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f1741a = iCustomTabsCallback;
        this.f1742b = pendingIntent;
    }

    /* renamed from: a */
    public final IBinder m1036a() {
        ICustomTabsCallback iCustomTabsCallback = this.f1741a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent pendingIntent = customTabsSessionToken.f1742b;
        PendingIntent pendingIntent2 = this.f1742b;
        if ((pendingIntent2 == null) != (pendingIntent == null)) {
            return false;
        }
        return pendingIntent2 != null ? pendingIntent2.equals(pendingIntent) : m1036a().equals(customTabsSessionToken.m1036a());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f1742b;
        return pendingIntent != null ? pendingIntent.hashCode() : m1036a().hashCode();
    }
}
