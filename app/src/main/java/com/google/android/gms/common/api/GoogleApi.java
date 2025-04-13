package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    /* renamed from: a */
    public final Context f15353a;

    /* renamed from: b */
    @Nullable
    public final String f15354b;

    /* renamed from: c */
    public final Api<O> f15355c;

    /* renamed from: d */
    public final O f15356d;

    /* renamed from: e */
    public final ApiKey<O> f15357e;

    /* renamed from: f */
    public final Looper f15358f;

    /* renamed from: g */
    public final int f15359g;

    /* renamed from: h */
    @NotOnlyInitialized
    public final GoogleApiClient f15360h;

    /* renamed from: i */
    public final StatusExceptionMapper f15361i;

    /* renamed from: j */
    @NonNull
    public final GoogleApiManager f15362j;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static class Settings {

        /* renamed from: c */
        @NonNull
        @KeepForSdk
        public static final Settings f15363c = new Builder().m7950a();

        /* renamed from: a */
        @NonNull
        public final StatusExceptionMapper f15364a;

        /* renamed from: b */
        @NonNull
        public final Looper f15365b;

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        @KeepForSdk
        public static class Builder {

            /* renamed from: a */
            public StatusExceptionMapper f15366a;

            /* renamed from: b */
            public Looper f15367b;

            @KeepForSdk
            public Builder() {
            }

            @NonNull
            @KeepForSdk
            /* renamed from: a */
            public Settings m7950a() {
                if (this.f15366a == null) {
                    this.f15366a = new ApiExceptionMapper();
                }
                if (this.f15367b == null) {
                    this.f15367b = Looper.getMainLooper();
                }
                return new Settings(this.f15366a, null, this.f15367b, null);
            }
        }

        public Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, zae zaeVar) {
            this.f15364a = statusExceptionMapper;
            this.f15365b = looper;
        }
    }

    public GoogleApi(@NonNull Context context, @Nullable Activity activity, Api<O> api, O o, Settings settings) {
        Preconditions.m8132g(context, "Null context is not permitted.");
        Preconditions.m8132g(api, "Api must not be null.");
        Preconditions.m8132g(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f15353a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f15354b = str;
        this.f15355c = api;
        this.f15356d = o;
        this.f15358f = settings.f15365b;
        ApiKey<O> apiKey = new ApiKey<>(api, o, str);
        this.f15357e = apiKey;
        this.f15360h = new zabv(this);
        GoogleApiManager m7983g = GoogleApiManager.m7983g(this.f15353a);
        this.f15362j = m7983g;
        this.f15359g = m7983g.f15421i.getAndIncrement();
        this.f15361i = settings.f15364a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            LifecycleFragment m7993c = LifecycleCallback.m7993c(activity);
            zaae zaaeVar = (zaae) m7993c.mo8004i1("ConnectionlessLifecycleHelper", zaae.class);
            if (zaaeVar == null) {
                int i2 = GoogleApiAvailability.f15324c;
                zaaeVar = new zaae(m7993c, m7983g, GoogleApiAvailability.f15326e);
            }
            zaaeVar.f15457g.add(apiKey);
            m7983g.m7984a(zaaeVar);
        }
        Handler handler = m7983g.f15427o;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public ClientSettings.Builder m7948c() {
        Set<Scope> emptySet;
        GoogleSignInAccount m7933i;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o = this.f15356d;
        Account account = null;
        if (!(o instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (m7933i = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o).m7933i()) == null) {
            O o2 = this.f15356d;
            if (o2 instanceof Api.ApiOptions.HasAccountOptions) {
                account = ((Api.ApiOptions.HasAccountOptions) o2).m7932c();
            }
        } else {
            String str = m7933i.f15176e;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        builder.f15689a = account;
        O o3 = this.f15356d;
        if (o3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) {
            GoogleSignInAccount m7933i2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o3).m7933i();
            emptySet = m7933i2 == null ? Collections.emptySet() : m7933i2.m7854m();
        } else {
            emptySet = Collections.emptySet();
        }
        if (builder.f15690b == null) {
            builder.f15690b = new ArraySet<>(0);
        }
        builder.f15690b.addAll(emptySet);
        builder.f15692d = this.f15353a.getClass().getName();
        builder.f15691c = this.f15353a.getPackageName();
        return builder;
    }

    /* renamed from: d */
    public final <TResult, A extends Api.AnyClient> Task<TResult> m7949d(int i2, @NonNull TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15362j.m7989h(this, i2, taskApiCall, taskCompletionSource, this.f15361i);
        return taskCompletionSource.f17240a;
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o, @NonNull Settings settings) {
        this(context, null, api, o, settings);
    }
}
