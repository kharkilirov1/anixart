package androidx.browser.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public class CustomTabsClient {

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$1 */
    class C01571 extends CustomTabsServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$2 */
    class BinderC01582 extends ICustomTabsCallback.Stub {

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$2$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ BinderC01582 f1728b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f1728b);
                throw null;
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$2$2, reason: invalid class name */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ BinderC01582 f1729b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f1729b);
                throw null;
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$2$3, reason: invalid class name */
        public class AnonymousClass3 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ BinderC01582 f1730b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f1730b);
                throw null;
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$2$4, reason: invalid class name */
        public class AnonymousClass4 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ BinderC01582 f1731b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f1731b);
                throw null;
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$2$5, reason: invalid class name */
        public class AnonymousClass5 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ BinderC01582 f1732b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f1732b);
                throw null;
            }
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: C1 */
        public void mo30C1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: R1 */
        public void mo31R1(int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: n2 */
        public void mo32n2(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: u2 */
        public void mo33u2(Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: w0 */
        public Bundle mo34w0(@NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        /* renamed from: w2 */
        public void mo35w2(int i2, Uri uri, boolean z, @Nullable Bundle bundle) throws RemoteException {
        }
    }
}
