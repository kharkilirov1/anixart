package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {

    /* renamed from: b */
    public FragmentMaxLifecycleEnforcer f6597b;

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$1 */
    class ViewOnLayoutChangeListenerC06671 implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f6598b;

        /* renamed from: c */
        public final /* synthetic */ FragmentViewHolder f6599c;

        /* renamed from: d */
        public final /* synthetic */ FragmentStateAdapter f6600d;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (this.f6598b.getParent() == null) {
                return;
            }
            this.f6598b.removeOnLayoutChangeListener(this);
            FragmentStateAdapter fragmentStateAdapter = this.f6600d;
            FragmentViewHolder fragmentViewHolder = this.f6599c;
            Objects.requireNonNull(fragmentStateAdapter);
            fragmentViewHolder.getItemId();
            throw null;
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$2 */
    class C06682 implements LifecycleEventObserver {

        /* renamed from: b */
        public final /* synthetic */ FragmentStateAdapter f6601b;

        @Override // androidx.lifecycle.LifecycleEventObserver
        /* renamed from: c */
        public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            Objects.requireNonNull(this.f6601b);
            throw null;
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$3 */
    class C06693 extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a */
        public final /* synthetic */ Fragment f6602a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f6603b;

        /* renamed from: c */
        public final /* synthetic */ FragmentStateAdapter f6604c;

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
            if (fragment == this.f6602a) {
                fragmentManager.m3053r0(this);
                this.f6604c.m4376k(view, this.f6603b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$4 */
    class RunnableC06704 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ FragmentStateAdapter f6605b;

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(this.f6605b);
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$5 */
    class C06715 implements LifecycleEventObserver {

        /* renamed from: b */
        public final /* synthetic */ Handler f6606b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f6607c;

        @Override // androidx.lifecycle.LifecycleEventObserver
        /* renamed from: c */
        public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f6606b.removeCallbacks(this.f6607c);
                lifecycleOwner.getLifecycle().mo3189c(this);
            }
        }
    }

    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        public DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public final void mo3411b(int i2, int i3) {
            mo3410a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public final void mo3412c(int i2, int i3, @Nullable Object obj) {
            mo3410a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public final void mo3413d(int i2, int i3) {
            mo3410a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public final void mo3414e(int i2, int i3, int i4) {
            mo3410a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public final void mo3415f(int i2, int i3) {
            mo3410a();
        }

        public DataSetChangeObserver(ViewOnLayoutChangeListenerC06671 viewOnLayoutChangeListenerC06671) {
        }
    }

    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        public ViewPager2.OnPageChangeCallback f6608a;

        /* renamed from: b */
        public RecyclerView.AdapterDataObserver f6609b;

        /* renamed from: c */
        public LifecycleEventObserver f6610c;

        /* renamed from: d */
        public ViewPager2 f6611d;

        public FragmentMaxLifecycleEnforcer() {
        }

        @NonNull
        /* renamed from: a */
        public final ViewPager2 m4377a(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        public void m4378b(boolean z) {
            Objects.requireNonNull(FragmentStateAdapter.this);
            throw null;
        }
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    /* renamed from: a */
    public final Parcelable mo4374a() {
        throw null;
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    /* renamed from: c */
    public final void mo4375c(@NonNull Parcelable parcelable) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    /* renamed from: k */
    public void m4376k(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        if (!(this.f6597b == null)) {
            throw new IllegalArgumentException();
        }
        final FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f6597b = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.f6611d = fragmentMaxLifecycleEnforcer.m4377a(recyclerView);
        ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i2) {
                FragmentMaxLifecycleEnforcer.this.m4378b(false);
                throw null;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i2) {
                FragmentMaxLifecycleEnforcer.this.m4378b(false);
                throw null;
            }
        };
        fragmentMaxLifecycleEnforcer.f6608a = onPageChangeCallback;
        fragmentMaxLifecycleEnforcer.f6611d.m4389c(onPageChangeCallback);
        DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            /* renamed from: a */
            public void mo3410a() {
                FragmentMaxLifecycleEnforcer.this.m4378b(true);
                throw null;
            }
        };
        fragmentMaxLifecycleEnforcer.f6609b = dataSetChangeObserver;
        registerAdapterDataObserver(dataSetChangeObserver);
        fragmentMaxLifecycleEnforcer.f6610c = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                FragmentMaxLifecycleEnforcer.this.m4378b(false);
                throw null;
            }
        };
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull FragmentViewHolder fragmentViewHolder, int i2) {
        FragmentViewHolder fragmentViewHolder2 = fragmentViewHolder;
        fragmentViewHolder2.getItemId();
        ((FrameLayout) fragmentViewHolder2.itemView).getId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        int i3 = FragmentViewHolder.f6616a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.m2203i());
        frameLayout.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = this.f6597b;
        fragmentMaxLifecycleEnforcer.m4377a(recyclerView).m4393g(fragmentMaxLifecycleEnforcer.f6608a);
        FragmentStateAdapter.this.unregisterAdapterDataObserver(fragmentMaxLifecycleEnforcer.f6609b);
        Objects.requireNonNull(FragmentStateAdapter.this);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(@NonNull FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull FragmentViewHolder fragmentViewHolder) {
        fragmentViewHolder.getItemId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull FragmentViewHolder fragmentViewHolder) {
        ((FrameLayout) fragmentViewHolder.itemView).getId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
