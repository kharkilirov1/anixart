package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.EpoxyModel;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WrappedEpoxyModelClickListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u0004\b\u0001\u0010\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/airbnb/epoxy/WrappedEpoxyModelClickListener;", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "V", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "ClickedModelInfo", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class WrappedEpoxyModelClickListener<T extends EpoxyModel<?>, V> implements View.OnClickListener, View.OnLongClickListener {

    /* compiled from: WrappedEpoxyModelClickListener.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/WrappedEpoxyModelClickListener$ClickedModelInfo;", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class ClickedModelInfo {

        /* renamed from: a */
        @NotNull
        public final EpoxyModel<?> f7046a;

        /* renamed from: b */
        public final int f7047b;

        /* renamed from: c */
        @NotNull
        public final Object f7048c;

        public ClickedModelInfo(@NotNull EpoxyModel<?> epoxyModel, int i2, @NotNull Object obj) {
            this.f7046a = epoxyModel;
            this.f7047b = i2;
            this.f7048c = obj;
        }
    }

    /* renamed from: a */
    public final Sequence<View> m4628a(View view) {
        if (!(view instanceof ViewGroup)) {
            return SequencesKt.m33858z(view);
        }
        final ViewGroup children = (ViewGroup) view;
        Intrinsics.m32179h(children, "$this$children");
        return SequencesKt.m33856x(SequencesKt.m33845m(new Sequence<View>() { // from class: com.airbnb.epoxy.WrappedEpoxyModelClickListener$children$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<View> iterator() {
                WrappedEpoxyModelClickListener wrappedEpoxyModelClickListener = WrappedEpoxyModelClickListener.this;
                ViewGroup iterator = children;
                Objects.requireNonNull(wrappedEpoxyModelClickListener);
                Intrinsics.m32179h(iterator, "$this$iterator");
                return new WrappedEpoxyModelClickListener$iterator$1(iterator);
            }
        }, new Function1<View, Sequence<? extends View>>() { // from class: com.airbnb.epoxy.WrappedEpoxyModelClickListener$allViewsInHierarchy$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Sequence<? extends View> invoke(View view2) {
                View it = view2;
                Intrinsics.m32179h(it, "it");
                return SequencesKt.m33857y(SequencesKt.m33858z(it), it instanceof ViewGroup ? WrappedEpoxyModelClickListener.this.m4628a(it) : EmptySequence.f66683a);
            }
        }), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 < 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r7 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        r2 = (com.airbnb.epoxy.EpoxyViewHolder) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        r0 = r2;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.airbnb.epoxy.WrappedEpoxyModelClickListener.ClickedModelInfo m4629b(android.view.View r11) {
        /*
            r10 = this;
            com.airbnb.epoxy.EpoxyViewHolder r0 = com.airbnb.epoxy.ListenersUtils.m4589b(r11)
            if (r0 == 0) goto L81
            int r1 = r0.getAdapterPosition()
            r2 = 0
            r3 = -1
            if (r1 != r3) goto Lf
            return r2
        Lf:
            java.lang.Object r4 = r0.m4578c()
            java.lang.String r5 = "epoxyHolder.objectToBind()"
            kotlin.jvm.internal.Intrinsics.m32178g(r4, r5)
            boolean r5 = r4 instanceof com.airbnb.epoxy.ModelGroupHolder
            if (r5 == 0) goto L68
            com.airbnb.epoxy.ModelGroupHolder r4 = (com.airbnb.epoxy.ModelGroupHolder) r4
            java.util.ArrayList<com.airbnb.epoxy.EpoxyViewHolder> r4 = r4.f7005a
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L63
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.airbnb.epoxy.EpoxyViewHolder r6 = (com.airbnb.epoxy.EpoxyViewHolder) r6
            android.view.View r6 = r6.itemView
            java.lang.String r7 = "it.itemView"
            kotlin.jvm.internal.Intrinsics.m32178g(r6, r7)
            kotlin.sequences.Sequence r6 = r10.m4628a(r6)
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
            r8 = 0
        L42:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L5c
            java.lang.Object r9 = r6.next()
            if (r8 < 0) goto L58
            boolean r9 = kotlin.jvm.internal.Intrinsics.m32174c(r11, r9)
            if (r9 == 0) goto L55
            goto L5d
        L55:
            int r8 = r8 + 1
            goto L42
        L58:
            kotlin.collections.CollectionsKt.m32023h0()
            throw r2
        L5c:
            r8 = -1
        L5d:
            if (r8 < 0) goto L60
            r7 = 1
        L60:
            if (r7 == 0) goto L24
            r2 = r5
        L63:
            com.airbnb.epoxy.EpoxyViewHolder r2 = (com.airbnb.epoxy.EpoxyViewHolder) r2
            if (r2 == 0) goto L68
            r0 = r2
        L68:
            com.airbnb.epoxy.WrappedEpoxyModelClickListener$ClickedModelInfo r11 = new com.airbnb.epoxy.WrappedEpoxyModelClickListener$ClickedModelInfo
            r0.m4576a()
            com.airbnb.epoxy.EpoxyModel r2 = r0.f6963a
            java.lang.String r3 = "holderToUse.model"
            kotlin.jvm.internal.Intrinsics.m32178g(r2, r3)
            java.lang.Object r0 = r0.m4578c()
            java.lang.String r3 = "holderToUse.objectToBind()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r3)
            r11.<init>(r2, r1, r0)
            return r11
        L81:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not find RecyclerView holder for clicked view"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.WrappedEpoxyModelClickListener.m4629b(android.view.View):com.airbnb.epoxy.WrappedEpoxyModelClickListener$ClickedModelInfo");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedEpoxyModelClickListener)) {
            return false;
        }
        Objects.requireNonNull((WrappedEpoxyModelClickListener) obj);
        Objects.requireNonNull((WrappedEpoxyModelClickListener) obj);
        return true;
    }

    public int hashCode() {
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        if (m4629b(view) != null) {
            throw new IllegalStateException("Original click listener is null".toString());
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        if (m4629b(view) == null) {
            return false;
        }
        throw new IllegalStateException("Original long click listener is null".toString());
    }
}
