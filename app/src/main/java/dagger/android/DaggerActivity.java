package dagger.android;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class DaggerActivity extends Activity implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    /* renamed from: k1 */
    public AndroidInjector<Object> mo30786k1() {
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        AndroidInjection.m30778a(this);
        super.onCreate(bundle);
    }
}
