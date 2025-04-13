package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.RestrictTo;
import java.util.List;

/* loaded from: classes.dex */
public final class CustomTabsSession {

    public static class MockSession extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: B1 */
        public boolean mo37B1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: P */
        public boolean mo38P(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: P1 */
        public boolean mo39P1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: Q0 */
        public boolean mo40Q0(long j2) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: S */
        public boolean mo41S(ICustomTabsCallback iCustomTabsCallback, int i2, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: U1 */
        public boolean mo42U1(ICustomTabsCallback iCustomTabsCallback, Uri uri) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: f0 */
        public boolean mo43f0(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i2, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: s1 */
        public int mo44s1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: w1 */
        public boolean mo45w1(ICustomTabsCallback iCustomTabsCallback) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: y1 */
        public boolean mo46y1(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: z0 */
        public Bundle mo47z0(String str, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    @RestrictTo
    public static class PendingSession {
    }
}
