package com.swiftsoft.anixartd;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.multidex.MultiDexApplication;
import com.google.firebase.FirebaseApp;
import com.swiftsoft.anixartd.dagger.ApplicationComponent;
import com.swiftsoft.anixartd.dagger.DaggerApplicationComponent;
import com.swiftsoft.anixartd.dagger.module.AppModule;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.push.YandexMetricaPush;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: App.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/App;", "Landroidx/multidex/MultiDexApplication;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class App extends MultiDexApplication {

    /* renamed from: b */
    @NotNull
    public static final Companion f25340b = new Companion(null);

    /* renamed from: c */
    public static ApplicationComponent f25341c;

    /* renamed from: d */
    public static Prefs f25342d;

    /* compiled from: App.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/App$Companion;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final ApplicationComponent m14043a() {
            ApplicationComponent applicationComponent = App.f25341c;
            if (applicationComponent != null) {
                return applicationComponent;
            }
            Intrinsics.m32189r("applicationComponent");
            throw null;
        }

        @NotNull
        /* renamed from: b */
        public final Prefs m14044b() {
            Prefs prefs = App.f25342d;
            if (prefs != null) {
                return prefs;
            }
            Intrinsics.m32189r("prefs");
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = AppCompatDelegate.f417b;
        VectorEnabledTintResources.f1676c = true;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        FirebaseApp.m12214g(this);
        YandexMetricaConfig build = YandexMetricaConfig.newConfigBuilder("2b12361a-ed35-4ff4-abc3-392ad21b48c8").build();
        Intrinsics.m32178g(build, "newConfigBuilder(\"2b1236…c3-392ad21b48c8\").build()");
        YandexMetrica.activate(getApplicationContext(), build);
        YandexMetrica.enableActivityAutoTracking(this);
        YandexMetricaPush.init(getApplicationContext());
        Companion companion = f25340b;
        f25342d = new Prefs(this);
        DaggerApplicationComponent.Builder builder = new DaggerApplicationComponent.Builder(null);
        builder.f25537a = new AppModule(this);
        f25341c = builder.m14163a();
        companion.m14043a().mo14133l(this);
        int i2 = companion.m14044b().f25344a.getInt("NIGHT_MODE", 0);
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 2;
            } else if (i2 == 2) {
                i3 = -1;
            } else if (i2 == 3) {
                i3 = 3;
            }
        }
        AppCompatDelegate.m380z(i3);
    }
}
