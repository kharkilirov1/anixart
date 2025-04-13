package dagger.android;

import android.app.DialogFragment;
import android.content.Context;

@Deprecated
/* loaded from: classes3.dex */
public abstract class DaggerDialogFragment extends DialogFragment implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    /* renamed from: k1 */
    public AndroidInjector<Object> mo30786k1() {
        return null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        AndroidInjection.m30779b(this);
        super.onAttach(context);
    }
}
