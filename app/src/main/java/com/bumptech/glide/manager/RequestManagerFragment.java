package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class RequestManagerFragment extends Fragment {

    /* renamed from: b */
    public final ActivityFragmentLifecycle f8661b;

    /* renamed from: c */
    public final RequestManagerTreeNode f8662c;

    /* renamed from: d */
    public final Set<RequestManagerFragment> f8663d;

    /* renamed from: e */
    @Nullable
    public RequestManager f8664e;

    /* renamed from: f */
    @Nullable
    public RequestManagerFragment f8665f;

    /* renamed from: g */
    @Nullable
    public Fragment f8666g;

    public class FragmentRequestManagerTreeNode implements RequestManagerTreeNode {
        public FragmentRequestManagerTreeNode() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        ActivityFragmentLifecycle activityFragmentLifecycle = new ActivityFragmentLifecycle();
        this.f8662c = new FragmentRequestManagerTreeNode();
        this.f8663d = new HashSet();
        this.f8661b = activityFragmentLifecycle;
    }

    /* renamed from: a */
    public final void m5224a(@NonNull Activity activity) {
        m5225b();
        RequestManagerRetriever requestManagerRetriever = Glide.m4871b(activity).f7886g;
        Objects.requireNonNull(requestManagerRetriever);
        RequestManagerFragment m5233h = requestManagerRetriever.m5233h(activity.getFragmentManager(), null, !activity.isFinishing());
        this.f8665f = m5233h;
        if (equals(m5233h)) {
            return;
        }
        this.f8665f.f8663d.add(this);
    }

    /* renamed from: b */
    public final void m5225b() {
        RequestManagerFragment requestManagerFragment = this.f8665f;
        if (requestManagerFragment != null) {
            requestManagerFragment.f8663d.remove(this);
            this.f8665f = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m5224a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8661b.m5219c();
        m5225b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m5225b();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8661b.m5220d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8661b.m5221e();
    }

    @Override // android.app.Fragment
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f8666g;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
