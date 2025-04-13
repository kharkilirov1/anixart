package moxy;

import android.app.Fragment;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class MvpFragment extends Fragment implements MvpDelegateHolder {
    private static final int ANDROID_OS_JELLY_BEAN = 17;
    private boolean isStateSaved;
    private MvpDelegate<? extends MvpFragment> mvpDelegate;

    @Override // moxy.MvpDelegateHolder
    public MvpDelegate getMvpDelegate() {
        if (this.mvpDelegate == null) {
            this.mvpDelegate = new MvpDelegate<>(this);
        }
        return this.mvpDelegate;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMvpDelegate().onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (getActivity().isFinishing()) {
            getMvpDelegate().onDestroy();
            return;
        }
        boolean z = false;
        if (this.isStateSaved) {
            this.isStateSaved = false;
            return;
        }
        for (Fragment parentFragment = getParentFragment(); !z && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            z = parentFragment.isRemoving();
        }
        if (isRemoving() || z) {
            getMvpDelegate().onDestroy();
        }
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getMvpDelegate().onDetach();
        getMvpDelegate().onDestroyView();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.isStateSaved = false;
        getMvpDelegate().onAttach();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.isStateSaved = true;
        getMvpDelegate().onSaveInstanceState(bundle);
        getMvpDelegate().onDetach();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.isStateSaved = false;
        getMvpDelegate().onAttach();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        getMvpDelegate().onDetach();
    }
}
