package dagger.android.support;

import android.content.Context;
import androidx.fragment.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;

/* loaded from: classes3.dex */
public abstract class DaggerFragment extends Fragment implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    /* renamed from: k1 */
    public AndroidInjector<Object> mo30786k1() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        AndroidSupportInjection.m30789a(this);
        super.onAttach(context);
    }
}
