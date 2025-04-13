package dagger.android.support;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;

/* loaded from: classes3.dex */
public abstract class DaggerDialogFragment extends DialogFragment implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    /* renamed from: k1 */
    public AndroidInjector<Object> mo30786k1() {
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        AndroidSupportInjection.m30789a(this);
        super.onAttach(context);
    }
}
