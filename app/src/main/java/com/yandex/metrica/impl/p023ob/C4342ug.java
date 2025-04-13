package com.yandex.metrica.impl.p023ob;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.C4481j;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.ug */
/* loaded from: classes2.dex */
public final class C4342ug {

    /* renamed from: a */
    private final InterfaceExecutorC4297sn f46608a;

    /* renamed from: b */
    private final C4316tg f46609b;

    /* renamed from: c */
    private final C4134mg f46610c;

    /* renamed from: d */
    private final C4446yg f46611d;

    /* renamed from: e */
    private final C4481j f46612e;

    /* renamed from: com.yandex.metrica.impl.ob.ug$a */
    public static final class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ PluginErrorDetails f46614b;

        /* renamed from: c */
        public final /* synthetic */ String f46615c;

        public a(PluginErrorDetails pluginErrorDetails, String str) {
            this.f46614b = pluginErrorDetails;
            this.f46615c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4342ug.m20888a(C4342ug.this).getPluginExtension().reportError(this.f46614b, this.f46615c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ug$b */
    public static final class b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f46617b;

        /* renamed from: c */
        public final /* synthetic */ String f46618c;

        /* renamed from: d */
        public final /* synthetic */ PluginErrorDetails f46619d;

        public b(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f46617b = str;
            this.f46618c = str2;
            this.f46619d = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4342ug.m20888a(C4342ug.this).getPluginExtension().reportError(this.f46617b, this.f46618c, this.f46619d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ug$c */
    public static final class c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ PluginErrorDetails f46621b;

        public c(PluginErrorDetails pluginErrorDetails) {
            this.f46621b = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4342ug.m20888a(C4342ug.this).getPluginExtension().reportUnhandledException(this.f46621b);
        }
    }

    @VisibleForTesting
    public C4342ug(@NotNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NotNull C4316tg c4316tg, @NotNull C4134mg c4134mg, @NotNull C4446yg c4446yg, @NotNull C4481j c4481j) {
        this.f46608a = interfaceExecutorC4297sn;
        this.f46609b = c4316tg;
        this.f46610c = c4134mg;
        this.f46611d = c4446yg;
        this.f46612e = c4481j;
    }

    /* renamed from: a */
    public final void m20889a(@Nullable PluginErrorDetails pluginErrorDetails) {
        this.f46610c.mo18360a(null);
        this.f46611d.m17833a().reportUnhandledException(pluginErrorDetails);
        C4481j c4481j = this.f46612e;
        Intrinsics.m32176e(pluginErrorDetails);
        Objects.requireNonNull(c4481j);
        ((C4271rn) this.f46608a).execute(new c(pluginErrorDetails));
    }

    public C4342ug(@NotNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(interfaceExecutorC4297sn, new C4316tg());
    }

    private C4342ug(InterfaceExecutorC4297sn interfaceExecutorC4297sn, C4316tg c4316tg) {
        this(interfaceExecutorC4297sn, c4316tg, new C4134mg(c4316tg), new C4446yg(), new C4481j(c4316tg, new C3733X2()));
    }

    /* renamed from: a */
    public final void m20890a(@Nullable PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.f46610c.mo18360a(null);
        if (!this.f46611d.m17833a().m21296a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        C4481j c4481j = this.f46612e;
        Intrinsics.m32176e(pluginErrorDetails);
        Objects.requireNonNull(c4481j);
        ((C4271rn) this.f46608a).execute(new a(pluginErrorDetails, str));
    }

    /* renamed from: a */
    public final void m20891a(@Nullable String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f46610c.mo18360a(null);
        this.f46611d.m17833a().reportError(str, str2, pluginErrorDetails);
        C4481j c4481j = this.f46612e;
        Intrinsics.m32176e(str);
        Objects.requireNonNull(c4481j);
        ((C4271rn) this.f46608a).execute(new b(str, str2, pluginErrorDetails));
    }

    /* renamed from: a */
    public static final InterfaceC3656U0 m20888a(C4342ug c4342ug) {
        Objects.requireNonNull(c4342ug.f46609b);
        C4095l3 m20332k = C4095l3.m20332k();
        Intrinsics.m32176e(m20332k);
        C4301t1 m20344d = m20332k.m20344d();
        Intrinsics.m32176e(m20344d);
        InterfaceC3656U0 m20774b = m20344d.m20774b();
        Intrinsics.m32178g(m20774b, "provider.peekInitialized…erProvider!!.mainReporter");
        return m20774b;
    }
}
