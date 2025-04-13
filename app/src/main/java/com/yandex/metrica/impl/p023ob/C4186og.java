package com.yandex.metrica.impl.p023ob;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.C4481j;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.og */
/* loaded from: classes2.dex */
public class C4186og implements IPluginReporter {

    /* renamed from: a */
    @NonNull
    private final C4472zg f46071a;

    /* renamed from: b */
    @NonNull
    private final C4481j f46072b;

    /* renamed from: c */
    @NonNull
    private final InterfaceExecutorC4297sn f46073c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3778Ym<InterfaceC3706W0> f46074d;

    /* renamed from: com.yandex.metrica.impl.ob.og$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PluginErrorDetails f46075a;

        public a(PluginErrorDetails pluginErrorDetails) {
            this.f46075a = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4186og.m20512a(C4186og.this).reportUnhandledException(this.f46075a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.og$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PluginErrorDetails f46077a;

        /* renamed from: b */
        public final /* synthetic */ String f46078b;

        public b(PluginErrorDetails pluginErrorDetails, String str) {
            this.f46077a = pluginErrorDetails;
            this.f46078b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4186og.m20512a(C4186og.this).reportError(this.f46077a, this.f46078b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.og$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f46080a;

        /* renamed from: b */
        public final /* synthetic */ String f46081b;

        /* renamed from: c */
        public final /* synthetic */ PluginErrorDetails f46082c;

        public c(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f46080a = str;
            this.f46081b = str2;
            this.f46082c = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4186og.m20512a(C4186og.this).reportError(this.f46080a, this.f46081b, this.f46082c);
        }
    }

    public C4186og(@NonNull C4472zg c4472zg, @NonNull C4481j c4481j, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3778Ym<InterfaceC3706W0> interfaceC3778Ym) {
        this.f46071a = c4472zg;
        this.f46072b = c4481j;
        this.f46073c = interfaceExecutorC4297sn;
        this.f46074d = interfaceC3778Ym;
    }

    /* renamed from: a */
    public static IPluginReporter m20512a(C4186og c4186og) {
        return c4186og.f46074d.mo19487a().getPluginExtension();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        if (!this.f46071a.m21296a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        Objects.requireNonNull(this.f46072b);
        ((C4271rn) this.f46073c).execute(new b(pluginErrorDetails, str));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f46071a.reportUnhandledException(pluginErrorDetails);
        Objects.requireNonNull(this.f46072b);
        ((C4271rn) this.f46073c).execute(new a(pluginErrorDetails));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f46071a.reportError(str, str2, pluginErrorDetails);
        Objects.requireNonNull(this.f46072b);
        ((C4271rn) this.f46073c).execute(new c(str, str2, pluginErrorDetails));
    }
}
