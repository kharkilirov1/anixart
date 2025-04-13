package com.yandex.div.core.view2;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import com.yandex.div.core.widget.DivViewWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AccessibilityListDelegate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/AccessibilityListDelegate;", "Landroidx/recyclerview/widget/RecyclerViewAccessibilityDelegate;", "ItemAccessibilityDelegate", "ViewAccessibilityState", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AccessibilityListDelegate extends RecyclerViewAccessibilityDelegate {

    /* renamed from: k */
    public static final /* synthetic */ int f31517k = 0;

    /* renamed from: f */
    @NotNull
    public final BackHandlingRecyclerView f31518f;

    /* renamed from: g */
    @NotNull
    public final ArrayList<ViewAccessibilityState> f31519g;

    /* renamed from: h */
    @NotNull
    public final ViewTreeObserver.OnGlobalLayoutListener f31520h;

    /* renamed from: i */
    @Nullable
    public AccessibilityDelegateCompat f31521i;

    /* renamed from: j */
    public boolean f31522j;

    /* compiled from: AccessibilityListDelegate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/AccessibilityListDelegate$ItemAccessibilityDelegate;", "Landroidx/recyclerview/widget/RecyclerViewAccessibilityDelegate$ItemDelegate;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class ItemAccessibilityDelegate extends RecyclerViewAccessibilityDelegate.ItemDelegate {
        public ItemAccessibilityDelegate() {
            super(AccessibilityListDelegate.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate, androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
            Intrinsics.m32179h(host, "host");
            Intrinsics.m32179h(info, "info");
            super.mo2044d(host, info);
            info.f3743a.setClassName(Reflection.m32193a(Button.class).mo32165b());
            host.setImportantForAccessibility(AccessibilityListDelegate.this.f31522j ? 1 : 4);
        }
    }

    /* compiled from: AccessibilityListDelegate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/AccessibilityListDelegate$ViewAccessibilityState;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class ViewAccessibilityState {

        /* renamed from: a */
        @NotNull
        public final WeakReference<View> f31526a;

        /* renamed from: b */
        public final int f31527b;

        public ViewAccessibilityState(@NotNull WeakReference<View> weakReference, int i2) {
            this.f31526a = weakReference;
            this.f31527b = i2;
        }
    }

    public AccessibilityListDelegate(@NotNull BackHandlingRecyclerView backHandlingRecyclerView) {
        super(backHandlingRecyclerView);
        this.f31518f = backHandlingRecyclerView;
        this.f31519g = new ArrayList<>();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.yandex.div.core.view2.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AccessibilityListDelegate this$0 = AccessibilityListDelegate.this;
                int i2 = AccessibilityListDelegate.f31517k;
                Intrinsics.m32179h(this$0, "this$0");
                if (this$0.f31522j) {
                    if (this$0.f31518f.getVisibility() == 0) {
                        return;
                    }
                    this$0.m16794l();
                }
            }
        };
        this.f31520h = onGlobalLayoutListener;
        if (backHandlingRecyclerView.isAttachedToWindow()) {
            backHandlingRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        backHandlingRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                Intrinsics.m32179h(view, "view");
                AccessibilityListDelegate.this.f31518f.getViewTreeObserver().addOnGlobalLayoutListener(AccessibilityListDelegate.this.f31520h);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
                Intrinsics.m32179h(view, "view");
                AccessibilityListDelegate.this.f31518f.getViewTreeObserver().removeOnGlobalLayoutListener(AccessibilityListDelegate.this.f31520h);
                AccessibilityListDelegate.this.m16794l();
            }
        });
        int i2 = 0;
        int childCount = backHandlingRecyclerView.getChildCount();
        if (childCount > 0) {
            while (true) {
                int i3 = i2 + 1;
                View childAt = backHandlingRecyclerView.getChildAt(i2);
                Intrinsics.m32178g(childAt, "getChildAt(index)");
                childAt.setImportantForAccessibility(this.f31522j ? 1 : 4);
                if (i3 >= childCount) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        this.f31518f.setOnBackClickListener(new BackKeyPressedHelper.OnBackClickListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.3
            @Override // com.yandex.div.core.view2.backbutton.BackKeyPressedHelper.OnBackClickListener
            /* renamed from: a */
            public boolean mo16798a() {
                AccessibilityListDelegate accessibilityListDelegate = AccessibilityListDelegate.this;
                if (!accessibilityListDelegate.f31522j) {
                    return false;
                }
                accessibilityListDelegate.m16795m(accessibilityListDelegate.f31518f);
                accessibilityListDelegate.m16794l();
                return true;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: d */
    public void mo2044d(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.m32179h(host, "host");
        Intrinsics.m32179h(info, "info");
        super.mo2044d(host, info);
        info.f3743a.setClassName(this.f31522j ? Reflection.m32193a(RecyclerView.class).mo32165b() : Reflection.m32193a(Button.class).mo32165b());
        info.f3743a.addAction(16);
        info.f3743a.setClickable(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            info.f3743a.setImportantForAccessibility(true);
        }
        if (i2 >= 28) {
            info.f3743a.setScreenReaderFocusable(true);
        } else {
            info.m2510p(1, true);
        }
        BackHandlingRecyclerView backHandlingRecyclerView = this.f31518f;
        int i3 = 0;
        int childCount = backHandlingRecyclerView.getChildCount();
        if (childCount <= 0) {
            return;
        }
        while (true) {
            int i4 = i3 + 1;
            View childAt = backHandlingRecyclerView.getChildAt(i3);
            Intrinsics.m32178g(childAt, "getChildAt(index)");
            childAt.setImportantForAccessibility(this.f31522j ? 1 : 4);
            if (i4 >= childCount) {
                return;
            } else {
                i3 = i4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: g */
    public boolean mo2047g(@NotNull View host, int i2, @Nullable Bundle bundle) {
        boolean z;
        View view;
        Intrinsics.m32179h(host, "host");
        if (i2 == 16) {
            m16797o(true);
            m16796n(this.f31518f);
            Sequence<View> m2377b = ViewGroupKt.m2377b(this.f31518f);
            Comparator m32108a = ComparisonsKt.m32108a(AccessibilityListDelegate$firstChild$1.f31528d, AccessibilityListDelegate$firstChild$2.f31529d);
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) ((ViewGroupKt$children$1) m2377b).iterator();
            if (viewGroupKt$iterator$1.hasNext()) {
                ?? next = viewGroupKt$iterator$1.next();
                while (viewGroupKt$iterator$1.hasNext()) {
                    Object next2 = viewGroupKt$iterator$1.next();
                    if (m32108a.compare(next, next2) > 0) {
                        next = next2;
                    }
                }
                view = next;
            } else {
                view = null;
            }
            View view2 = view;
            if (view2 != null) {
                m16795m(view2);
            }
            z = true;
        } else {
            z = false;
        }
        return super.mo2047g(host, i2, bundle) || z;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    @NotNull
    /* renamed from: j */
    public AccessibilityDelegateCompat mo3454j() {
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31521i;
        if (accessibilityDelegateCompat != null) {
            return accessibilityDelegateCompat;
        }
        ItemAccessibilityDelegate itemAccessibilityDelegate = new ItemAccessibilityDelegate();
        this.f31521i = itemAccessibilityDelegate;
        return itemAccessibilityDelegate;
    }

    /* renamed from: l */
    public final void m16794l() {
        m16797o(false);
        for (ViewAccessibilityState viewAccessibilityState : this.f31519g) {
            View view = viewAccessibilityState.f31526a.get();
            if (view != null) {
                view.setImportantForAccessibility(viewAccessibilityState.f31527b);
            }
        }
        this.f31519g.clear();
    }

    /* renamed from: m */
    public final void m16795m(View view) {
        View child;
        if ((view instanceof DivViewWrapper) && (child = ((DivViewWrapper) view).getChild()) != null) {
            view = child;
        }
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(1);
    }

    /* renamed from: n */
    public final void m16796n(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || Intrinsics.m32174c(viewGroup, viewGroup2.getRootView())) {
            return;
        }
        Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b(viewGroup2)).iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (!Intrinsics.m32174c(next, viewGroup) && next.getImportantForAccessibility() != 4) {
                this.f31519g.add(new ViewAccessibilityState(new WeakReference(next), next.getImportantForAccessibility()));
                next.setImportantForAccessibility(4);
            }
        }
        m16796n(viewGroup2);
    }

    /* renamed from: o */
    public final void m16797o(boolean z) {
        if (this.f31522j == z) {
            return;
        }
        this.f31522j = z;
        BackHandlingRecyclerView backHandlingRecyclerView = this.f31518f;
        int i2 = 0;
        int childCount = backHandlingRecyclerView.getChildCount();
        if (childCount <= 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            View childAt = backHandlingRecyclerView.getChildAt(i2);
            Intrinsics.m32178g(childAt, "getChildAt(index)");
            childAt.setImportantForAccessibility(this.f31522j ? 1 : 4);
            if (i3 >= childCount) {
                return;
            } else {
                i2 = i3;
            }
        }
    }
}
