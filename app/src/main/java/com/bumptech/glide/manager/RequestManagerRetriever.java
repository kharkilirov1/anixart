package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Util;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class RequestManagerRetriever implements Handler.Callback {

    /* renamed from: j */
    public static final RequestManagerFactory f8668j = new RequestManagerFactory() { // from class: com.bumptech.glide.manager.RequestManagerRetriever.1
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        @NonNull
        /* renamed from: a */
        public RequestManager mo4869a(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    };

    /* renamed from: b */
    public volatile RequestManager f8669b;

    /* renamed from: e */
    public final Handler f8672e;

    /* renamed from: f */
    public final RequestManagerFactory f8673f;

    /* renamed from: c */
    @VisibleForTesting
    public final Map<FragmentManager, RequestManagerFragment> f8670c = new HashMap();

    /* renamed from: d */
    @VisibleForTesting
    public final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f8671d = new HashMap();

    /* renamed from: g */
    public final ArrayMap<View, Fragment> f8674g = new ArrayMap<>();

    /* renamed from: h */
    public final ArrayMap<View, android.app.Fragment> f8675h = new ArrayMap<>();

    /* renamed from: i */
    public final Bundle f8676i = new Bundle();

    public interface RequestManagerFactory {
        @NonNull
        /* renamed from: a */
        RequestManager mo4869a(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context);
    }

    public RequestManagerRetriever(@Nullable RequestManagerFactory requestManagerFactory) {
        this.f8673f = requestManagerFactory == null ? f8668j : requestManagerFactory;
        this.f8672e = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: c */
    public static void m5226c(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m5226c(fragment.getChildFragmentManager().m3006N(), map);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final Activity m5227a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5227a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi
    @Deprecated
    /* renamed from: b */
    public final void m5228b(@NonNull FragmentManager fragmentManager, @NonNull ArrayMap<View, android.app.Fragment> arrayMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    m5228b(fragment.getChildFragmentManager(), arrayMap);
                }
            }
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            this.f8676i.putInt("key", i2);
            android.app.Fragment fragment2 = null;
            try {
                fragment2 = fragmentManager.getFragment(this.f8676i, "key");
            } catch (Exception unused) {
            }
            if (fragment2 == null) {
                return;
            }
            if (fragment2.getView() != null) {
                arrayMap.put(fragment2.getView(), fragment2);
                m5228b(fragment2.getChildFragmentManager(), arrayMap);
            }
            i2 = i3;
        }
    }

    @NonNull
    @Deprecated
    /* renamed from: d */
    public final RequestManager m5229d(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment m5233h = m5233h(fragmentManager, fragment, z);
        RequestManager requestManager = m5233h.f8664e;
        if (requestManager != null) {
            return requestManager;
        }
        RequestManager mo4869a = this.f8673f.mo4869a(Glide.m4871b(context), m5233h.f8661b, m5233h.f8662c, context);
        m5233h.f8664e = mo4869a;
        return mo4869a;
    }

    @NonNull
    /* renamed from: e */
    public RequestManager m5230e(@NonNull Activity activity) {
        if (Util.m5350g()) {
            return m5231f(activity.getApplicationContext());
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return m5229d(activity, activity.getFragmentManager(), null, !activity.isFinishing());
    }

    @NonNull
    /* renamed from: f */
    public RequestManager m5231f(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (Util.m5351h() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (Util.m5350g()) {
                    return m5231f(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                return m5235j(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, !fragmentActivity.isFinishing());
            }
            if (context instanceof Activity) {
                return m5230e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return m5231f(((ContextWrapper) context).getBaseContext());
            }
        }
        if (this.f8669b == null) {
            synchronized (this) {
                if (this.f8669b == null) {
                    this.f8669b = this.f8673f.mo4869a(Glide.m4871b(context.getApplicationContext()), new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), context.getApplicationContext());
                }
            }
        }
        return this.f8669b;
    }

    @NonNull
    /* renamed from: g */
    public RequestManager m5232g(@NonNull Fragment fragment) {
        Objects.requireNonNull(fragment.getActivity(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (Util.m5350g()) {
            return m5231f(fragment.getActivity().getApplicationContext());
        }
        return m5235j(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    /* renamed from: h */
    public final RequestManagerFragment m5233h(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment == null && (requestManagerFragment = this.f8670c.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.f8666g = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                requestManagerFragment.m5224a(fragment.getActivity());
            }
            if (z) {
                requestManagerFragment.f8661b.m5220d();
            }
            this.f8670c.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f8672e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        int i2 = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i2 == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.f8670c.remove(obj);
        } else {
            if (i2 != 2) {
                z = false;
                obj2 = null;
                if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.f8671d.remove(obj);
        }
        Object obj4 = obj;
        obj3 = remove;
        obj2 = obj4;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }

    @NonNull
    /* renamed from: i */
    public final SupportRequestManagerFragment m5234i(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.m3000H("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.f8671d.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.f8685g = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                supportRequestManagerFragment.m5237n3(fragment.getActivity());
            }
            if (z) {
                supportRequestManagerFragment.f8680b.m5220d();
            }
            this.f8671d.put(fragmentManager, supportRequestManagerFragment);
            FragmentTransaction m3024d = fragmentManager.m3024d();
            m3024d.mo2941k(0, supportRequestManagerFragment, "com.bumptech.glide.manager", 1);
            m3024d.mo2937f();
            this.f8672e.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    @NonNull
    /* renamed from: j */
    public final RequestManager m5235j(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        SupportRequestManagerFragment m5234i = m5234i(fragmentManager, fragment, z);
        RequestManager requestManager = m5234i.f8684f;
        if (requestManager != null) {
            return requestManager;
        }
        RequestManager mo4869a = this.f8673f.mo4869a(Glide.m4871b(context), m5234i.f8680b, m5234i.f8681c, context);
        m5234i.f8684f = mo4869a;
        return mo4869a;
    }
}
