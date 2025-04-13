package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class PostMessageService extends Service {

    /* renamed from: b */
    public IPostMessageService.Stub f1743b = new IPostMessageService.Stub(this) { // from class: androidx.browser.customtabs.PostMessageService.1
        @Override // android.support.customtabs.IPostMessageService
        /* renamed from: M0 */
        public void mo48M0(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) throws RemoteException {
            iCustomTabsCallback.mo33u2(bundle);
        }

        @Override // android.support.customtabs.IPostMessageService
        /* renamed from: a1 */
        public void mo49a1(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            iCustomTabsCallback.mo32n2(str, bundle);
        }
    };

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.f1743b;
    }
}
