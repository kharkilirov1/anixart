package moxy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes3.dex */
public class MvpAppCompatActivity extends AppCompatActivity implements MvpDelegateHolder {
    private MvpDelegate<? extends MvpAppCompatActivity> mvpDelegate;

    @Override // moxy.MvpDelegateHolder
    public MvpDelegate getMvpDelegate() {
        if (this.mvpDelegate == null) {
            this.mvpDelegate = new MvpDelegate<>(this);
        }
        return this.mvpDelegate;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMvpDelegate().onCreate(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getMvpDelegate().onDestroyView();
        if (isFinishing()) {
            getMvpDelegate().onDestroy();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getMvpDelegate().onAttach();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getMvpDelegate().onSaveInstanceState(bundle);
        getMvpDelegate().onDetach();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getMvpDelegate().onAttach();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getMvpDelegate().onDetach();
    }
}
