package com.stfalcon.imageviewer.common.pager;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter.ViewHolder;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RecyclingPagerAdapter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/pager/RecyclingPagerAdapter;", "Lcom/stfalcon/imageviewer/common/pager/RecyclingPagerAdapter$ViewHolder;", "VH", "Landroidx/viewpager/widget/PagerAdapter;", "Companion", "RecycleCache", "ViewHolder", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public abstract class RecyclingPagerAdapter<VH extends ViewHolder> extends PagerAdapter {

    /* renamed from: c */
    public final SparseArray<RecycleCache> f25251c = new SparseArray<>();

    /* renamed from: d */
    public SparseArray<Parcelable> f25252d = new SparseArray<>();

    /* compiled from: RecyclingPagerAdapter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/pager/RecyclingPagerAdapter$Companion;", "", "", "STATE", "Ljava/lang/String;", "", "VIEW_TYPE_IMAGE", "I", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* compiled from: RecyclingPagerAdapter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/pager/RecyclingPagerAdapter$RecycleCache;", "", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class RecycleCache {

        /* renamed from: a */
        @NotNull
        public final List<ViewHolder> f25253a = new ArrayList();

        /* renamed from: b */
        public final RecyclingPagerAdapter<?> f25254b;

        public RecycleCache(@NotNull RecyclingPagerAdapter<?> recyclingPagerAdapter) {
            this.f25254b = recyclingPagerAdapter;
        }
    }

    /* compiled from: RecyclingPagerAdapter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/pager/RecyclingPagerAdapter$ViewHolder;", "", "Companion", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class ViewHolder {

        /* renamed from: a */
        public int f25255a;

        /* renamed from: b */
        public boolean f25256b;

        /* renamed from: c */
        @NotNull
        public final View f25257c;

        /* compiled from: RecyclingPagerAdapter.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/pager/RecyclingPagerAdapter$ViewHolder$Companion;", "", "", "STATE", "Ljava/lang/String;", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Companion {
        }

        public ViewHolder(@NotNull View view) {
            this.f25257c = view;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: a */
    public void mo3073a(@NotNull ViewGroup viewGroup, int i2, @NotNull Object item) {
        Intrinsics.m32180i(item, "item");
        if (item instanceof ViewHolder) {
            ViewHolder viewHolder = (ViewHolder) item;
            viewGroup.removeView(viewHolder.f25257c);
            viewHolder.f25256b = false;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: c */
    public int mo4336c() {
        return mo14027l();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: d */
    public int mo4337d(@NotNull Object item) {
        Intrinsics.m32180i(item, "item");
        return -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter, com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter<VH extends com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder>] */
    @Override // androidx.viewpager.widget.PagerAdapter
    @org.jetbrains.annotations.NotNull
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo3075f(@org.jetbrains.annotations.NotNull android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            android.util.SparseArray<com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$RecycleCache> r0 = r5.f25251c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$RecycleCache r0 = (com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter.RecycleCache) r0
            if (r0 != 0) goto L15
            com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$RecycleCache r0 = new com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$RecycleCache
            r0.<init>(r5)
            android.util.SparseArray<com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$RecycleCache> r2 = r5.f25251c
            r2.put(r1, r0)
        L15:
            r2 = 0
        L16:
            java.util.List<com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder> r3 = r0.f25253a
            int r3 = r3.size()
            if (r2 >= r3) goto L2e
            java.util.List<com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder> r3 = r0.f25253a
            java.lang.Object r3 = r3.get(r2)
            com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder r3 = (com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter.ViewHolder) r3
            boolean r4 = r3.f25256b
            if (r4 != 0) goto L2b
            goto L39
        L2b:
            int r2 = r2 + 1
            goto L16
        L2e:
            com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter<?> r2 = r0.f25254b
            com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder r3 = r2.mo14029n(r6, r1)
            java.util.List<com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter$ViewHolder> r0 = r0.f25253a
            r0.add(r3)
        L39:
            java.util.Objects.requireNonNull(r3)
            r0 = 1
            r3.f25256b = r0
            r3.f25255a = r7
            android.view.View r0 = r3.f25257c
            r6.addView(r0)
            r5.mo14028m(r3, r7)
            android.util.SparseArray<android.os.Parcelable> r6 = r5.f25252d
            java.lang.Object r6 = r6.get(r7)
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            if (r6 == 0) goto L66
            boolean r7 = r6 instanceof android.os.Bundle
            if (r7 == 0) goto L66
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r7 = "ViewHolder"
            boolean r0 = r6.containsKey(r7)
            if (r0 == 0) goto L66
            android.util.SparseArray r6 = r6.getSparseParcelableArray(r7)
            goto L67
        L66:
            r6 = 0
        L67:
            if (r6 == 0) goto L6e
            android.view.View r7 = r3.f25257c
            r7.restoreHierarchyState(r6)
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter.mo3075f(android.view.ViewGroup, int):java.lang.Object");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: g */
    public boolean mo3076g(@NotNull View view, @NotNull Object obj) {
        Intrinsics.m32180i(view, "view");
        Intrinsics.m32180i(obj, "obj");
        return (obj instanceof ViewHolder) && ((ViewHolder) obj).f25257c == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: h */
    public void mo3077h(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
        if (parcelable == null || !(parcelable instanceof Bundle)) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(classLoader);
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("RecyclingPagerAdapter");
        if (sparseParcelableArray == null) {
            sparseParcelableArray = new SparseArray<>();
        }
        this.f25252d = sparseParcelableArray;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    /* renamed from: i */
    public Parcelable mo3078i() {
        ArrayList arrayList = new ArrayList();
        SparseArray<RecycleCache> sparseArray = this.f25251c;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (size != sparseArray.size()) {
                throw new ConcurrentModificationException();
            }
            sparseArray.keyAt(i2);
            for (ViewHolder viewHolder : sparseArray.valueAt(i2).f25253a) {
                if (viewHolder.f25256b) {
                    arrayList.add(viewHolder);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ViewHolder viewHolder2 = (ViewHolder) it.next();
            SparseArray<Parcelable> sparseArray2 = this.f25252d;
            int i3 = viewHolder2.f25255a;
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            viewHolder2.f25257c.saveHierarchyState(sparseArray3);
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("ViewHolder", sparseArray3);
            sparseArray2.put(i3, bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putSparseParcelableArray("RecyclingPagerAdapter", this.f25252d);
        return bundle2;
    }

    /* renamed from: l */
    public abstract int mo14027l();

    /* renamed from: m */
    public abstract void mo14028m(@NotNull VH vh, int i2);

    @NotNull
    /* renamed from: n */
    public abstract VH mo14029n(@NotNull ViewGroup viewGroup, int i2);
}
