package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import java.util.Objects;

/* loaded from: classes.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {

    /* renamed from: b */
    @Nullable
    @VisibleForTesting
    public IUnusedAppRestrictionsBackportService f3302b;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService m1665i = IUnusedAppRestrictionsBackportService.Stub.m1665i(iBinder);
        this.f3302b = m1665i;
        try {
            m1665i.mo1664t0(new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
                @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
                /* renamed from: Y1 */
                public void mo1663Y1(boolean z, boolean z2) throws RemoteException {
                    if (!z) {
                        Objects.requireNonNull(UnusedAppRestrictionsBackportServiceConnection.this);
                        throw null;
                    }
                    if (z2) {
                        Objects.requireNonNull(UnusedAppRestrictionsBackportServiceConnection.this);
                        throw null;
                    }
                    Objects.requireNonNull(UnusedAppRestrictionsBackportServiceConnection.this);
                    throw null;
                }
            });
        } catch (RemoteException unused) {
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f3302b = null;
    }
}
