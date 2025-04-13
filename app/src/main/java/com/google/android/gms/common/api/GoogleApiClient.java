package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {

    /* renamed from: a */
    @GuardedBy
    public static final Set<GoogleApiClient> f15370a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    @Deprecated
    public static final class Builder {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo7951d(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public Looper mo7952e() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: f */
    public boolean mo7953f(@NonNull SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo7954g() {
        throw new UnsupportedOperationException();
    }
}
