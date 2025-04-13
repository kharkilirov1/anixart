package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* renamed from: b */
    @Nullable
    public final Activity f4311b;

    /* renamed from: c */
    @NonNull
    public final Context f4312c;

    /* renamed from: d */
    @NonNull
    public final Handler f4313d;

    /* renamed from: e */
    public final FragmentManager f4314e;

    public FragmentHostCallback(@NonNull FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f4314e = new FragmentManagerImpl();
        this.f4311b = fragmentActivity;
        Preconditions.m2032e(fragmentActivity, "context == null");
        this.f4312c = fragmentActivity;
        this.f4313d = handler;
    }

    @Override // androidx.fragment.app.FragmentContainer
    @Nullable
    /* renamed from: b */
    public View mo2960b(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    /* renamed from: c */
    public boolean mo2961c() {
        return true;
    }

    /* renamed from: d */
    public void mo2968d(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    @Nullable
    /* renamed from: e */
    public abstract E mo2969e();

    @NonNull
    /* renamed from: f */
    public LayoutInflater mo2970f() {
        return LayoutInflater.from(this.f4312c);
    }

    /* renamed from: g */
    public boolean mo2971g(@NonNull String str) {
        return false;
    }

    /* renamed from: h */
    public void mo2972h() {
    }
}
