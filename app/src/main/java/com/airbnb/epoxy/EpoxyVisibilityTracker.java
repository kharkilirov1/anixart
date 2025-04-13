package com.airbnb.epoxy;

import android.util.SparseArray;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpoxyVisibilityTracker.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker;", "", "Companion", "DataObserver", "Listener", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EpoxyVisibilityTracker {

    /* renamed from: f */
    public RecyclerView f6989f;

    /* renamed from: g */
    public RecyclerView.Adapter<?> f6990g;

    /* renamed from: i */
    public boolean f6992i;

    /* renamed from: k */
    @IntRange
    @Nullable
    public Integer f6994k;

    /* renamed from: a */
    public final RecyclerView.ItemAnimator.ItemAnimatorFinishedListener f6984a = new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: com.airbnb.epoxy.EpoxyVisibilityTracker$itemAnimatorFinishedListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
        /* renamed from: a */
        public final void mo3855a() {
            EpoxyVisibilityTracker.this.m4582a("ItemAnimatorFinishedListener.onAnimationsFinished", false);
        }
    };

    /* renamed from: b */
    public final SparseArray<EpoxyVisibilityItem> f6985b = new SparseArray<>();

    /* renamed from: c */
    public final List<EpoxyVisibilityItem> f6986c = new ArrayList();

    /* renamed from: d */
    public final Listener f6987d = new Listener();

    /* renamed from: e */
    public final DataObserver f6988e = new DataObserver();

    /* renamed from: h */
    public final Map<RecyclerView, EpoxyVisibilityTracker> f6991h = new HashMap();

    /* renamed from: j */
    public boolean f6993j = true;

    /* compiled from: EpoxyVisibilityTracker.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$Companion;", "", "", "DEBUG_LOG", "Z", "", "TAG", "Ljava/lang/String;", "", "TAG_ID", "I", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class Companion {
    }

    /* compiled from: EpoxyVisibilityTracker.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$DataObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public final class DataObserver extends RecyclerView.AdapterDataObserver {
        public DataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo3410a() {
            if (m4587h(EpoxyVisibilityTracker.this.f6989f)) {
                return;
            }
            EpoxyVisibilityTracker.this.f6985b.clear();
            EpoxyVisibilityTracker.this.f6986c.clear();
            EpoxyVisibilityTracker.this.f6992i = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
            if (m4587h(EpoxyVisibilityTracker.this.f6989f)) {
                return;
            }
            for (EpoxyVisibilityItem epoxyVisibilityItem : EpoxyVisibilityTracker.this.f6986c) {
                int i4 = epoxyVisibilityItem.f6969b;
                if (i4 >= i2) {
                    EpoxyVisibilityTracker.this.f6992i = true;
                    epoxyVisibilityItem.f6969b = i4 + i3;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
            if (m4587h(EpoxyVisibilityTracker.this.f6989f)) {
                return;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i2 + i5;
                int i7 = i3 + i5;
                if (!m4587h(EpoxyVisibilityTracker.this.f6989f)) {
                    for (EpoxyVisibilityItem epoxyVisibilityItem : EpoxyVisibilityTracker.this.f6986c) {
                        int i8 = epoxyVisibilityItem.f6969b;
                        if (i8 == i6) {
                            epoxyVisibilityItem.m4580a(i7 - i6);
                            EpoxyVisibilityTracker.this.f6992i = true;
                        } else if (i6 < i7) {
                            if (i6 + 1 <= i8 && i7 >= i8) {
                                epoxyVisibilityItem.m4580a(-1);
                                EpoxyVisibilityTracker.this.f6992i = true;
                            }
                        } else if (i6 > i7 && i7 <= i8 && i6 > i8) {
                            epoxyVisibilityItem.m4580a(1);
                            EpoxyVisibilityTracker.this.f6992i = true;
                        }
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
            if (m4587h(EpoxyVisibilityTracker.this.f6989f)) {
                return;
            }
            for (EpoxyVisibilityItem epoxyVisibilityItem : EpoxyVisibilityTracker.this.f6986c) {
                if (epoxyVisibilityItem.f6969b >= i2) {
                    EpoxyVisibilityTracker.this.f6992i = true;
                    epoxyVisibilityItem.m4580a(-i3);
                }
            }
        }

        /* renamed from: h */
        public final boolean m4587h(RecyclerView recyclerView) {
            return recyclerView == null || !(recyclerView.getAdapter() instanceof BaseEpoxyAdapter);
        }
    }

    /* compiled from: EpoxyVisibilityTracker.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$Listener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Landroid/view/View$OnLayoutChangeListener;", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public final class Listener extends RecyclerView.OnScrollListener implements View.OnLayoutChangeListener, RecyclerView.OnChildAttachStateChangeListener {
        public Listener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        /* renamed from: b */
        public void mo3632b(@NotNull View child) {
            Intrinsics.m32179h(child, "child");
            if (child instanceof RecyclerView) {
                EpoxyVisibilityTracker.this.f6991h.remove((RecyclerView) child);
            }
            EpoxyVisibilityTracker epoxyVisibilityTracker = EpoxyVisibilityTracker.this;
            if (!epoxyVisibilityTracker.f6992i) {
                epoxyVisibilityTracker.m4584d(child, true, "onChildViewDetachedFromWindow");
            } else {
                epoxyVisibilityTracker.m4583c(child, "onChildViewDetachedFromWindow");
                EpoxyVisibilityTracker.this.f6992i = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        /* renamed from: c */
        public void mo3586c(@NotNull RecyclerView recyclerView, int i2, int i3) {
            Intrinsics.m32179h(recyclerView, "recyclerView");
            EpoxyVisibilityTracker.m4581b(EpoxyVisibilityTracker.this, "onScrolled", false, 2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        /* renamed from: d */
        public void mo3633d(@NotNull View child) {
            Intrinsics.m32179h(child, "child");
            if (child instanceof RecyclerView) {
                EpoxyVisibilityTracker.this.m4586f((RecyclerView) child);
            }
            EpoxyVisibilityTracker.this.m4584d(child, false, "onChildViewAttachedToWindow");
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View recyclerView, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            Intrinsics.m32179h(recyclerView, "recyclerView");
            EpoxyVisibilityTracker.m4581b(EpoxyVisibilityTracker.this, "onLayoutChange", false, 2);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m4581b(EpoxyVisibilityTracker epoxyVisibilityTracker, String str, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        epoxyVisibilityTracker.m4582a(str, z);
    }

    /* renamed from: a */
    public final void m4582a(String str, boolean z) {
        RecyclerView recyclerView = this.f6989f;
        if (recyclerView != null) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (!z || itemAnimator == null) {
                m4583c(null, str);
                return;
            }
            RecyclerView.ItemAnimator.ItemAnimatorFinishedListener itemAnimatorFinishedListener = this.f6984a;
            boolean mo3526l = itemAnimator.mo3526l();
            if (itemAnimatorFinishedListener != null) {
                if (mo3526l) {
                    itemAnimator.f5554b.add(itemAnimatorFinishedListener);
                } else {
                    itemAnimatorFinishedListener.mo3855a();
                }
            }
            if (mo3526l) {
                m4583c(null, str);
            }
        }
    }

    /* renamed from: c */
    public final void m4583c(View view, String str) {
        RecyclerView.Adapter<?> adapter;
        RecyclerView recyclerView = this.f6989f;
        if (recyclerView != null) {
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (!Intrinsics.m32174c(this.f6990g, adapter))) {
                RecyclerView.Adapter<?> adapter2 = this.f6990g;
                if (adapter2 != null) {
                    adapter2.unregisterAdapterDataObserver(this.f6988e);
                }
                adapter.registerAdapterDataObserver(this.f6988e);
                this.f6990g = adapter;
            }
            if (view != null) {
                m4584d(view, true, str);
            }
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != null && childAt != view) {
                    m4584d(childAt, false, str);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m4584d(View view, boolean z, String str) {
        RecyclerView recyclerView = this.f6989f;
        if (recyclerView != null) {
            RecyclerView.ViewHolder m3783Q = view.getParent() == null || view.getParent() == recyclerView ? recyclerView.m3783Q(view) : null;
            if (m3783Q instanceof EpoxyViewHolder) {
                EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) m3783Q;
                epoxyViewHolder.m4576a();
                EpoxyHolder epoxyHolder = epoxyViewHolder.f6965c;
                m4585e(recyclerView, view, z, str, epoxyViewHolder);
                if (epoxyHolder instanceof ModelGroupHolder) {
                    Iterator<EpoxyViewHolder> it = ((ModelGroupHolder) epoxyHolder).f7005a.iterator();
                    while (it.hasNext()) {
                        EpoxyViewHolder next = it.next();
                        View view2 = next.itemView;
                        if (view2 instanceof RecyclerView) {
                            if (z) {
                                Intrinsics.m32178g(view2, "groupChildHolder.itemView");
                                this.f6991h.remove((RecyclerView) view2);
                            } else {
                                Intrinsics.m32178g(view2, "groupChildHolder.itemView");
                                m4586f((RecyclerView) view2);
                            }
                        }
                        View view3 = next.itemView;
                        Intrinsics.m32178g(view3, "groupChildHolder.itemView");
                        m4585e(recyclerView, view3, z, str, next);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b0, code lost:
    
        if (r7 == r8.intValue()) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0148, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        if (r5.f6973f > 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
    
        if (r10 >= r3) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0192  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4585e(androidx.recyclerview.widget.RecyclerView r17, android.view.View r18, boolean r19, java.lang.String r20, com.airbnb.epoxy.EpoxyViewHolder r21) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyVisibilityTracker.m4585e(androidx.recyclerview.widget.RecyclerView, android.view.View, boolean, java.lang.String, com.airbnb.epoxy.EpoxyViewHolder):void");
    }

    /* renamed from: f */
    public final void m4586f(RecyclerView recyclerView) {
        EpoxyVisibilityTracker epoxyVisibilityTracker = (EpoxyVisibilityTracker) recyclerView.getTag(C2507R.id.epoxy_visibility_tracker);
        if (epoxyVisibilityTracker == null) {
            epoxyVisibilityTracker = new EpoxyVisibilityTracker();
            epoxyVisibilityTracker.f6994k = this.f6994k;
            epoxyVisibilityTracker.f6989f = recyclerView;
            recyclerView.m3806m(epoxyVisibilityTracker.f6987d);
            recyclerView.addOnLayoutChangeListener(epoxyVisibilityTracker.f6987d);
            recyclerView.m3804l(epoxyVisibilityTracker.f6987d);
            recyclerView.setTag(C2507R.id.epoxy_visibility_tracker, epoxyVisibilityTracker);
        }
        this.f6991h.put(recyclerView, epoxyVisibilityTracker);
    }
}
