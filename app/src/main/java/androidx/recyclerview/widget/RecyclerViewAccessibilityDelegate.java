package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {

    /* renamed from: d */
    public final RecyclerView f5642d;

    /* renamed from: e */
    public final ItemDelegate f5643e;

    public static class ItemDelegate extends AccessibilityDelegateCompat {

        /* renamed from: d */
        public final RecyclerViewAccessibilityDelegate f5644d;

        /* renamed from: e */
        public Map<View, AccessibilityDelegateCompat> f5645e;

        public ItemDelegate(@NonNull RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            super(AccessibilityDelegateCompat.f3569c);
            this.f5645e = new WeakHashMap();
            this.f5644d = recyclerViewAccessibilityDelegate;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: a */
        public boolean mo2041a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.mo2041a(view, accessibilityEvent) : this.f3570a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        @Nullable
        /* renamed from: b */
        public AccessibilityNodeProviderCompat mo2042b(@NonNull View view) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.mo2042b(view) : super.mo2042b(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: c */
        public void mo2043c(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo2043c(view, accessibilityEvent);
            } else {
                this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f5644d.m3947k() || this.f5644d.f5642d.getLayoutManager() == null) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                return;
            }
            this.f5644d.f5642d.getLayoutManager().m3904y0(view, accessibilityNodeInfoCompat);
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo2044d(view, accessibilityNodeInfoCompat);
            } else {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: e */
        public void mo2045e(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo2045e(view, accessibilityEvent);
            } else {
                this.f3570a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: f */
        public boolean mo2046f(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(viewGroup);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.mo2046f(viewGroup, view, accessibilityEvent) : this.f3570a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: g */
        public boolean mo2047g(View view, int i2, Bundle bundle) {
            if (this.f5644d.m3947k() || this.f5644d.f5642d.getLayoutManager() == null) {
                return super.mo2047g(view, i2, bundle);
            }
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(view);
            if (accessibilityDelegateCompat != null) {
                if (accessibilityDelegateCompat.mo2047g(view, i2, bundle)) {
                    return true;
                }
            } else if (super.mo2047g(view, i2, bundle)) {
                return true;
            }
            RecyclerView.Recycler recycler = this.f5644d.f5642d.getLayoutManager().f5563c.f5497c;
            return false;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: h */
        public void mo2048h(@NonNull View view, int i2) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo2048h(view, i2);
            } else {
                this.f3570a.sendAccessibilityEvent(view, i2);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: i */
        public void mo2049i(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f5645e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo2049i(view, accessibilityEvent);
            } else {
                this.f3570a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(@NonNull RecyclerView recyclerView) {
        super(AccessibilityDelegateCompat.f3569c);
        this.f5642d = recyclerView;
        AccessibilityDelegateCompat mo3454j = mo3454j();
        if (mo3454j == null || !(mo3454j instanceof ItemDelegate)) {
            this.f5643e = new ItemDelegate(this);
        } else {
            this.f5643e = (ItemDelegate) mo3454j;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: c */
    public void mo2043c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m3947k()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo3702w0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: d */
    public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
        if (m3947k() || this.f5642d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.f5642d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f5563c;
        layoutManager.mo3903x0(recyclerView.f5497c, recyclerView.f5510i0, accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: g */
    public boolean mo2047g(View view, int i2, Bundle bundle) {
        if (super.mo2047g(view, i2, bundle)) {
            return true;
        }
        if (m3947k() || this.f5642d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = this.f5642d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f5563c;
        return layoutManager.mo3865K0(recyclerView.f5497c, recyclerView.f5510i0, i2, bundle);
    }

    @NonNull
    /* renamed from: j */
    public AccessibilityDelegateCompat mo3454j() {
        return this.f5643e;
    }

    /* renamed from: k */
    public boolean m3947k() {
        return this.f5642d.m3785U();
    }
}
