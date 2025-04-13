package androidx.browser.trusted;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class TrustedWebActivityServiceConnection {

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$1 */
    class BinderC01651 extends ITrustedWebActivityCallback.Stub {
        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        /* renamed from: s2 */
        public void mo51s2(String str, Bundle bundle) throws RemoteException {
            throw null;
        }
    }

    public static class ActiveNotificationsArgs {
    }

    public static class CancelNotificationArgs {
    }

    public static class NotificationsEnabledArgs {
    }

    public static class NotifyNotificationArgs {
    }

    public static class ResultArgs {
    }

    /* renamed from: a */
    public static void m1048a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException(C0000a.m14k("Bundle must contain ", str));
        }
    }
}
