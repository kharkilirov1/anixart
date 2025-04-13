package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public class PreferenceRecyclerViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {

    /* renamed from: f */
    public final RecyclerView f5089f;

    /* renamed from: g */
    public final AccessibilityDelegateCompat f5090g;

    /* renamed from: h */
    public final AccessibilityDelegateCompat f5091h;

    public PreferenceRecyclerViewAccessibilityDelegate(@NonNull RecyclerView recyclerView) {
        super(recyclerView);
        this.f5090g = this.f5643e;
        this.f5091h = new AccessibilityDelegateCompat() { // from class: androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.1
            {
                View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                PreferenceRecyclerViewAccessibilityDelegate.this.f5090g.mo2044d(view, accessibilityNodeInfoCompat);
                int m3782P = PreferenceRecyclerViewAccessibilityDelegate.this.f5089f.m3782P(view);
                RecyclerView.Adapter adapter = PreferenceRecyclerViewAccessibilityDelegate.this.f5089f.getAdapter();
                if (adapter instanceof PreferenceGroupAdapter) {
                    ((PreferenceGroupAdapter) adapter).m3434m(m3782P);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: g */
            public boolean mo2047g(View view, int i2, Bundle bundle) {
                return PreferenceRecyclerViewAccessibilityDelegate.this.f5090g.mo2047g(view, i2, bundle);
            }
        };
        this.f5089f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    @NonNull
    /* renamed from: j */
    public AccessibilityDelegateCompat mo3454j() {
        return this.f5091h;
    }
}
