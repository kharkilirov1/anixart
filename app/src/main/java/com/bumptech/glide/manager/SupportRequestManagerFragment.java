package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: b */
    public final ActivityFragmentLifecycle f8680b;

    /* renamed from: c */
    public final RequestManagerTreeNode f8681c;

    /* renamed from: d */
    public final Set<SupportRequestManagerFragment> f8682d;

    /* renamed from: e */
    @Nullable
    public SupportRequestManagerFragment f8683e;

    /* renamed from: f */
    @Nullable
    public RequestManager f8684f;

    /* renamed from: g */
    @Nullable
    public Fragment f8685g;

    public class SupportFragmentRequestManagerTreeNode implements RequestManagerTreeNode {
        public SupportFragmentRequestManagerTreeNode() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        ActivityFragmentLifecycle activityFragmentLifecycle = new ActivityFragmentLifecycle();
        this.f8681c = new SupportFragmentRequestManagerTreeNode();
        this.f8682d = new HashSet();
        this.f8680b = activityFragmentLifecycle;
    }

    /* renamed from: n3 */
    public final void m5237n3(@NonNull FragmentActivity fragmentActivity) {
        m5238u3();
        RequestManagerRetriever requestManagerRetriever = Glide.m4871b(fragmentActivity).f7886g;
        Objects.requireNonNull(requestManagerRetriever);
        SupportRequestManagerFragment m5234i = requestManagerRetriever.m5234i(fragmentActivity.getSupportFragmentManager(), null, !fragmentActivity.isFinishing());
        this.f8683e = m5234i;
        if (equals(m5234i)) {
            return;
        }
        this.f8683e.f8682d.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            m5237n3(getActivity());
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8680b.m5219c();
        m5238u3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f8685g = null;
        m5238u3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8680b.m5220d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8680b.m5221e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f8685g;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u3 */
    public final void m5238u3() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f8683e;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f8682d.remove(this);
            this.f8683e = null;
        }
    }
}
