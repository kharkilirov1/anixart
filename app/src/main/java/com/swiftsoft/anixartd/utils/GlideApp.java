package com.swiftsoft.anixartd.utils;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.util.Util;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class GlideApp {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: a */
    public static GlideRequests m16332a(@NonNull View view) {
        RequestManager m5229d;
        RequestManagerRetriever m4872c = Glide.m4872c(view.getContext());
        Objects.requireNonNull(m4872c);
        if (Util.m5350g()) {
            m5229d = m4872c.m5231f(view.getContext().getApplicationContext());
        } else {
            Objects.requireNonNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity m5227a = m4872c.m5227a(view.getContext());
            if (m5227a == null) {
                m5229d = m4872c.m5231f(view.getContext().getApplicationContext());
            } else {
                Fragment fragment = null;
                androidx.fragment.app.Fragment fragment2 = null;
                if (m5227a instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) m5227a;
                    m4872c.f8674g.clear();
                    RequestManagerRetriever.m5226c(fragmentActivity.getSupportFragmentManager().m3006N(), m4872c.f8674g);
                    View findViewById = fragmentActivity.findViewById(R.id.content);
                    while (!view.equals(findViewById) && (fragment2 = m4872c.f8674g.get(view)) == null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    m4872c.f8674g.clear();
                    m5229d = fragment2 != null ? m4872c.m5232g(fragment2) : m4872c.m5230e(m5227a);
                } else {
                    m4872c.f8675h.clear();
                    m4872c.m5228b(m5227a.getFragmentManager(), m4872c.f8675h);
                    View findViewById2 = m5227a.findViewById(R.id.content);
                    while (!view.equals(findViewById2) && (fragment = m4872c.f8675h.get(view)) == null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    m4872c.f8675h.clear();
                    if (fragment == null) {
                        m5229d = m4872c.m5230e(m5227a);
                    } else {
                        if (fragment.getActivity() == null) {
                            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                        }
                        m5229d = !Util.m5350g() ? m4872c.m5229d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible()) : m4872c.m5231f(fragment.getActivity().getApplicationContext());
                    }
                }
            }
        }
        return (GlideRequests) m5229d;
    }

    @NonNull
    /* renamed from: b */
    public static GlideRequests m16333b(@NonNull androidx.fragment.app.Fragment fragment) {
        return (GlideRequests) Glide.m4872c(fragment.getActivity()).m5232g(fragment);
    }
}
