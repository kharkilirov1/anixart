package moxy;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes3.dex */
public class MvpAppCompatFragment extends Fragment implements MvpDelegateHolder {
    private boolean isStateSaved;
    private MvpDelegate<? extends MvpAppCompatFragment> mvpDelegate;

    @Override // moxy.MvpDelegateHolder
    public MvpDelegate getMvpDelegate() {
        if (this.mvpDelegate == null) {
            this.mvpDelegate = new MvpDelegate<>(this);
        }
        return this.mvpDelegate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMvpDelegate().onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getMvpDelegate().onDetach();
        getMvpDelegate().onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.isStateSaved = false;
        getMvpDelegate().onAttach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.isStateSaved = true;
        getMvpDelegate().onSaveInstanceState(bundle);
        getMvpDelegate().onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.isStateSaved = false;
        getMvpDelegate().onAttach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getMvpDelegate().onDetach();
    }
}
