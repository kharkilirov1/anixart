package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class RemoteCreator<T> {

    /* renamed from: a */
    public final String f15955a;

    /* renamed from: b */
    public T f15956b;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@NonNull String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    public RemoteCreator(@NonNull String str) {
        this.f15955a = str;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public abstract T mo8191a(@NonNull IBinder iBinder);

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public final T m8285b(@NonNull Context context) throws RemoteCreatorException {
        Context context2;
        if (this.f15956b == null) {
            Objects.requireNonNull(context, "null reference");
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f15332a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f15956b = mo8191a((IBinder) context2.getClassLoader().loadClass(this.f15955a).newInstance());
            } catch (ClassNotFoundException e2) {
                throw new RemoteCreatorException("Could not load creator class.", e2);
            } catch (IllegalAccessException e3) {
                throw new RemoteCreatorException("Could not access creator.", e3);
            } catch (InstantiationException e4) {
                throw new RemoteCreatorException("Could not instantiate creator.", e4);
            }
        }
        return this.f15956b;
    }
}
