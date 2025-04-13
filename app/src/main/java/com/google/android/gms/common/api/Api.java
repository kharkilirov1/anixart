package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class Api<O extends ApiOptions> {

    /* renamed from: a */
    public final AbstractClientBuilder<?, O> f15345a;

    /* renamed from: b */
    public final ClientKey<?> f15346b;

    /* renamed from: c */
    public final String f15347c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @KeepForSdk
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @NonNull
        @KeepForSdk
        @Deprecated
        /* renamed from: a */
        public T mo7838a(@NonNull Context context, @NonNull Looper looper, @NonNull ClientSettings clientSettings, @NonNull O o, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return mo7851b(context, looper, clientSettings, o, connectionCallbacks, onConnectionFailedListener);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: b */
        public T mo7851b(@NonNull Context context, @NonNull Looper looper, @NonNull ClientSettings clientSettings, @NonNull O o, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface AnyClient {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static class AnyClientKey<C extends AnyClient> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface ApiOptions {

        /* renamed from: z1 */
        @NonNull
        public static final NoOptions f15348z1 = new NoOptions(null);

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @NonNull
            /* renamed from: c */
            Account m7932c();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @Nullable
            /* renamed from: i */
            GoogleSignInAccount m7933i();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface HasOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static final class NoOptions implements NotRequiredOptions {
            public NoOptions() {
            }

            public /* synthetic */ NoOptions(zaa zaaVar) {
            }
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @KeepForSdk
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface Client extends AnyClient {
        @NonNull
        @KeepForSdk
        /* renamed from: a */
        Set<Scope> mo7934a();

        @KeepForSdk
        /* renamed from: b */
        void mo7935b();

        @KeepForSdk
        /* renamed from: c */
        void mo7936c(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set);

        @KeepForSdk
        /* renamed from: d */
        void mo7937d(@NonNull String str);

        @KeepForSdk
        /* renamed from: e */
        boolean mo7938e();

        @NonNull
        @KeepForSdk
        /* renamed from: f */
        String mo7939f();

        @KeepForSdk
        /* renamed from: g */
        void mo7940g(@NonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        /* renamed from: h */
        void mo7941h(@NonNull BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        /* renamed from: i */
        boolean mo7942i();

        @KeepForSdk
        /* renamed from: j */
        boolean mo7943j();

        @KeepForSdk
        /* renamed from: l */
        int mo7877l();

        @NonNull
        @KeepForSdk
        /* renamed from: m */
        Feature[] mo7944m();

        @Nullable
        @KeepForSdk
        /* renamed from: p */
        String mo7945p();

        @KeepForSdk
        /* renamed from: q */
        boolean mo7946q();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @KeepForSdk
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public <C extends Client> Api(@NonNull String str, @NonNull AbstractClientBuilder<C, O> abstractClientBuilder, @NonNull ClientKey<C> clientKey) {
        this.f15347c = str;
        this.f15345a = abstractClientBuilder;
        this.f15346b = clientKey;
    }
}
