package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {

    /* renamed from: androidx.browser.customtabs.CustomTabsServiceConnection$1 */
    public class C01601 extends CustomTabsClient {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
