package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.IPostMessageService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {

    /* renamed from: b */
    @Nullable
    public IPostMessageService f1744b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f1744b = IPostMessageService.Stub.m50i(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f1744b = null;
    }
}
