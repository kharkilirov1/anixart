package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.C4657a;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* renamed from: com.yandex.mobile.ads.impl.da */
/* loaded from: classes3.dex */
public final class C4963da implements InterfaceC5471n3<C4911ca> {

    /* renamed from: a */
    @NotNull
    private final Context f49606a;

    /* renamed from: b */
    @NotNull
    private final h90 f49607b;

    /* renamed from: c */
    @NotNull
    private final f90 f49608c;

    /* renamed from: d */
    @NotNull
    private final C4657a f49609d;

    /* renamed from: e */
    @NotNull
    private final C5011ea f49610e;

    /* renamed from: f */
    @NotNull
    private final CopyOnWriteArrayList<C4911ca> f49611f;

    /* renamed from: g */
    @Nullable
    private AppOpenAdLoadListener f49612g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C4963da(@NotNull Context context) {
        this(context, 0);
        Intrinsics.m32179h(context, "context");
    }

    @JvmOverloads
    public C4963da(@NotNull Context context, @NotNull h90 mainThreadUsageValidator, @NotNull f90 mainThreadExecutor, @NotNull C4657a adRequestConfigurationProvider, @NotNull C5011ea adLoadControllerFactory) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.m32179h(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.m32179h(adRequestConfigurationProvider, "adRequestConfigurationProvider");
        Intrinsics.m32179h(adLoadControllerFactory, "adLoadControllerFactory");
        this.f49606a = context;
        this.f49607b = mainThreadUsageValidator;
        this.f49608c = mainThreadExecutor;
        this.f49609d = adRequestConfigurationProvider;
        this.f49610e = adLoadControllerFactory;
        this.f49611f = new CopyOnWriteArrayList<>();
        mainThreadUsageValidator.m25094a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5471n3
    /* renamed from: a */
    public final void mo23851a(C4911ca loadController) {
        Intrinsics.m32179h(loadController, "loadController");
        this.f49607b.m25094a();
        loadController.m23083a((AppOpenAdLoadListener) null);
        this.f49611f.remove(loadController);
    }

    @MainThread
    /* renamed from: a */
    public final void m23849a(@Nullable AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f49607b.m25094a();
        this.f49612g = appOpenAdLoadListener;
        Iterator<C4911ca> it = this.f49611f.iterator();
        while (it.hasNext()) {
            it.next().m23083a(appOpenAdLoadListener);
        }
    }

    public /* synthetic */ C4963da(Context context, int i2) {
        this(context, new h90(context), new f90(), new C4657a(), new C5011ea());
    }

    @MainThread
    /* renamed from: a */
    public final void m23850a(@NotNull AdRequestConfiguration adRequestConfiguration) {
        Intrinsics.m32179h(adRequestConfiguration, "adRequestConfiguration");
        this.f49607b.m25094a();
        this.f49608c.m24373a(new hn1(this, adRequestConfiguration, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m23846a(C4963da this$0, AdRequestConfiguration adRequestConfiguration) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(adRequestConfiguration, "$adRequestConfiguration");
        C5011ea c5011ea = this$0.f49610e;
        Context context = this$0.f49606a;
        Objects.requireNonNull(c5011ea);
        C4911ca m24050a = C5011ea.m24050a(context, this$0);
        this$0.f49611f.add(m24050a);
        Objects.requireNonNull(this$0.f49609d);
        String m21969b = C4657a.m21969b(adRequestConfiguration);
        Objects.requireNonNull(this$0.f49609d);
        AdRequest m21968a = C4657a.m21968a(adRequestConfiguration);
        m24050a.m28609a(m21969b);
        m24050a.m23083a(this$0.f49612g);
        m24050a.mo26773b(m21968a);
    }

    @MainThread
    /* renamed from: a */
    public final void m23848a() {
        this.f49607b.m25094a();
        this.f49608c.m24372a();
        Iterator<C4911ca> it = this.f49611f.iterator();
        while (it.hasNext()) {
            C4911ca next = it.next();
            next.m23083a((AppOpenAdLoadListener) null);
            next.m26775u();
        }
        this.f49611f.clear();
    }
}
