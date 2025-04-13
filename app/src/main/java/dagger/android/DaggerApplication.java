package dagger.android;

import android.app.Application;
import com.google.errorprone.annotations.ForOverride;

/* loaded from: classes3.dex */
public abstract class DaggerApplication extends Application implements HasAndroidInjector {
    @ForOverride
    /* renamed from: a */
    public abstract AndroidInjector<? extends DaggerApplication> m30787a();

    /* renamed from: b */
    public final void m30788b() {
        synchronized (this) {
            m30787a().mo30782a(this);
            throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
        }
    }

    @Override // dagger.android.HasAndroidInjector
    /* renamed from: k1 */
    public AndroidInjector<Object> mo30786k1() {
        m30788b();
        throw null;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        m30788b();
        throw null;
    }
}
