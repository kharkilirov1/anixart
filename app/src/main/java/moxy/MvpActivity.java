package moxy;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class MvpActivity extends Activity implements MvpDelegateHolder {
    private MvpDelegate<? extends MvpActivity> mvpDelegate;

    @Override // moxy.MvpDelegateHolder
    public MvpDelegate getMvpDelegate() {
        if (this.mvpDelegate == null) {
            this.mvpDelegate = new MvpDelegate<>(this);
        }
        return this.mvpDelegate;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMvpDelegate().onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getMvpDelegate().onDestroyView();
        if (isFinishing()) {
            getMvpDelegate().onDestroy();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        getMvpDelegate().onAttach();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getMvpDelegate().onSaveInstanceState(bundle);
        getMvpDelegate().onDetach();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        getMvpDelegate().onAttach();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        getMvpDelegate().onDetach();
    }
}
