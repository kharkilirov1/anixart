package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class TabLayoutMediator {

    public class PagerAdapterObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo3410a() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public void mo3411b(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public void mo3412c(int i2, int i3, @Nullable Object obj) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
            throw null;
        }
    }

    public interface TabConfigurationStrategy {
    }

    public static class TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        public int f18964a;

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i2) {
            this.f18964a = i2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i2, float f2, int i3) {
            throw null;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
            throw null;
        }
    }

    public static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /* renamed from: a */
        public void mo10411a(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /* renamed from: b */
        public void mo10412b(@NonNull TabLayout.Tab tab) {
            int i2 = tab.f18941d;
            throw null;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /* renamed from: c */
        public void mo10413c(TabLayout.Tab tab) {
        }
    }
}
