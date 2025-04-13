package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.mobile.ads.impl.p80;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint
/* loaded from: classes3.dex */
public final class q80 implements p80, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    @NotNull
    private final Context f53968a;

    /* renamed from: b */
    @NotNull
    private final String f53969b;

    /* renamed from: c */
    @NotNull
    private final u01 f53970c;

    /* renamed from: d */
    @NotNull
    private final Lazy f53971d;

    /* renamed from: e */
    @NotNull
    private final LinkedHashSet f53972e;

    /* renamed from: com.yandex.mobile.ads.impl.q80$a */
    public static final class C5625a extends Lambda implements Function0<SharedPreferences> {
        public C5625a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            u01 u01Var = q80.this.f53970c;
            Context applicationContext = q80.this.f53968a.getApplicationContext();
            Intrinsics.m32178g(applicationContext, "context.applicationContext");
            return u01.m28814a(u01Var, applicationContext, q80.this.f53969b);
        }
    }

    public q80(@NotNull Context context, @NotNull String fileName, @NotNull u01 preferencesFactory) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(fileName, "fileName");
        Intrinsics.m32179h(preferencesFactory, "preferencesFactory");
        this.f53968a = context;
        this.f53969b = fileName;
        this.f53970c = preferencesFactory;
        this.f53971d = LazyKt.m31881b(new C5625a());
        this.f53972e = new LinkedHashSet();
    }

    @Override // com.yandex.mobile.ads.impl.p80
    public final boolean contains(@NotNull String key) {
        Intrinsics.m32179h(key, "key");
        return m27655a().contains(key);
    }

    @Override // com.yandex.mobile.ads.impl.p80
    public final boolean getBoolean(@NotNull String key, boolean z) {
        Intrinsics.m32179h(key, "key");
        return m27655a().getBoolean(key, z);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(@Nullable SharedPreferences sharedPreferences, @Nullable String str) {
        if (str != null) {
            Iterator it = this.f53972e.iterator();
            while (it.hasNext()) {
                p80.InterfaceC5570a interfaceC5570a = (p80.InterfaceC5570a) ((WeakReference) it.next()).get();
                if (interfaceC5570a != null) {
                    interfaceC5570a.mo22842a(this, str);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.p80
    public final void putBoolean(@NotNull String key, boolean z) {
        Intrinsics.m32179h(key, "key");
        m27655a().edit().putBoolean(key, z).commit();
    }

    @Override // com.yandex.mobile.ads.impl.p80
    public final void putLong(@NotNull String key, long j2) {
        Intrinsics.m32179h(key, "key");
        m27655a().edit().putLong(key, j2).commit();
    }

    @Override // com.yandex.mobile.ads.impl.p80
    public final void putString(@NotNull String key, @Nullable String str) {
        Intrinsics.m32179h(key, "key");
        m27655a().edit().putString(key, str).commit();
    }

    @Override // com.yandex.mobile.ads.impl.p80
    public final void remove(@NotNull String key) {
        Intrinsics.m32179h(key, "key");
        m27655a().edit().remove(key).commit();
    }

    /* renamed from: a */
    private final SharedPreferences m27655a() {
        return (SharedPreferences) this.f53971d.getValue();
    }

    @Override // com.yandex.mobile.ads.impl.p80
    @Nullable
    /* renamed from: b */
    public final String mo27190b(@NotNull String key) {
        Intrinsics.m32179h(key, "key");
        return m27655a().getString(key, null);
    }

    @Override // com.yandex.mobile.ads.impl.p80
    @Nullable
    /* renamed from: a */
    public final Set mo27185a(@Nullable Set set) {
        return m27655a().getStringSet("BiddingSettingsAdUnitIdsSet", set);
    }

    @Override // com.yandex.mobile.ads.impl.p80
    /* renamed from: b */
    public final int mo27189b(int i2, @NotNull String key) {
        Intrinsics.m32179h(key, "key");
        m27655a().contains(key);
        return m27655a().getInt(key, i2);
    }

    @Override // com.yandex.mobile.ads.impl.p80
    /* renamed from: a */
    public final void mo27188a(@NotNull HashSet value) {
        Intrinsics.m32179h(value, "value");
        m27655a().edit().putStringSet("BiddingSettingsAdUnitIdsSet", value).commit();
    }

    @Override // com.yandex.mobile.ads.impl.p80
    /* renamed from: a */
    public final void mo27186a(int i2, @NotNull String key) {
        Intrinsics.m32179h(key, "key");
        m27655a().edit().putInt(key, i2).commit();
    }

    @Override // com.yandex.mobile.ads.impl.p80
    /* renamed from: a */
    public final long mo27184a(@NotNull String key) {
        Intrinsics.m32179h(key, "key");
        return m27655a().getLong(key, 0L);
    }

    public /* synthetic */ q80(Context context, String str) {
        this(context, str, new u01());
    }

    @Override // com.yandex.mobile.ads.impl.p80
    /* renamed from: a */
    public final void mo27187a(@NotNull p80.InterfaceC5570a listener) {
        Intrinsics.m32179h(listener, "listener");
        if (this.f53972e.isEmpty()) {
            m27655a().registerOnSharedPreferenceChangeListener(this);
        }
        this.f53972e.add(new WeakReference(listener));
    }
}
