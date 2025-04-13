package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public final class ClientSettings {

    /* renamed from: a */
    @Nullable
    public final Account f15681a;

    /* renamed from: b */
    public final Set<Scope> f15682b;

    /* renamed from: c */
    public final Set<Scope> f15683c;

    /* renamed from: d */
    public final Map<Api<?>, zab> f15684d;

    /* renamed from: e */
    public final String f15685e;

    /* renamed from: f */
    public final String f15686f;

    /* renamed from: g */
    public final SignInOptions f15687g;

    /* renamed from: h */
    public Integer f15688h;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static final class Builder {

        /* renamed from: a */
        @Nullable
        public Account f15689a;

        /* renamed from: b */
        public ArraySet<Scope> f15690b;

        /* renamed from: c */
        public String f15691c;

        /* renamed from: d */
        public String f15692d;

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public ClientSettings m8115a() {
            return new ClientSettings(this.f15689a, this.f15690b, null, 0, null, this.f15691c, this.f15692d, SignInOptions.f17203b);
        }
    }

    public ClientSettings(@Nullable Account account, @NonNull Set set, @NonNull Map map, int i2, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable SignInOptions signInOptions) {
        this.f15681a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f15682b = emptySet;
        Map<Api<?>, zab> emptyMap = Collections.emptyMap();
        this.f15684d = emptyMap;
        this.f15685e = str;
        this.f15686f = str2;
        this.f15687g = signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        Iterator<zab> it = emptyMap.values().iterator();
        while (it.hasNext()) {
            java.util.Objects.requireNonNull(it.next());
            hashSet.addAll(null);
        }
        this.f15683c = Collections.unmodifiableSet(hashSet);
    }
}
