package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class BlockingServiceConnection implements ServiceConnection {

    /* renamed from: b */
    public boolean f15311b = false;

    /* renamed from: c */
    public final BlockingQueue<IBinder> f15312c = new LinkedBlockingQueue();

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public IBinder m7911a(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.m8131f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f15311b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f15311b = true;
        IBinder poll = this.f15312c.poll(j2, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f15312c.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
