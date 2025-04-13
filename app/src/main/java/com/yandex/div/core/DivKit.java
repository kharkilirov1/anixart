package com.yandex.div.core;

import android.content.Context;
import androidx.annotation.AnyThread;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.dagger.DaggerDivKitComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivKit.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/DivKit;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivKit {

    /* renamed from: b */
    @NotNull
    public static final Companion f30958b = new Companion(null);

    /* renamed from: c */
    @NotNull
    public static final DivKitConfiguration f30959c;

    /* renamed from: d */
    @Nullable
    public static volatile DivKit f30960d;

    /* renamed from: a */
    @NotNull
    public final DivKitComponent f30961a;

    /* compiled from: DivKit.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div/core/DivKit$Companion;", "", "Lcom/yandex/div/core/DivKitConfiguration;", "DEFAULT_CONFIGURATION", "Lcom/yandex/div/core/DivKitConfiguration;", "configuration", "Lcom/yandex/div/core/DivKit;", "instance", "Lcom/yandex/div/core/DivKit;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @AnyThread
        @NotNull
        /* renamed from: a */
        public final DivKit m16587a(@NotNull Context context) {
            Intrinsics.m32179h(context, "context");
            DivKit divKit = DivKit.f30960d;
            if (divKit != null) {
                return divKit;
            }
            synchronized (this) {
                DivKit divKit2 = DivKit.f30960d;
                if (divKit2 != null) {
                    return divKit2;
                }
                Companion companion = DivKit.f30958b;
                DivKit divKit3 = new DivKit(context, DivKit.f30959c, null);
                Companion companion2 = DivKit.f30958b;
                DivKit.f30960d = divKit3;
                return divKit3;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.m32178g(newSingleThreadExecutor, "executorService ?: Execu…newSingleThreadExecutor()");
        f30959c = new DivKitConfiguration(null, newSingleThreadExecutor, C2832g.f31279b, null);
    }

    public DivKit(Context context, DivKitConfiguration divKitConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        DivKitComponent.Builder m16617c = DaggerDivKitComponent.m16617c();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m32178g(applicationContext, "context.applicationContext");
        m16617c.mo16622b(applicationContext);
        m16617c.mo16621a(divKitConfiguration);
        this.f30961a = m16617c.mo16620A();
    }
}
