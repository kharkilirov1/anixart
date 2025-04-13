package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.RunnableC0042c;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTransitionHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "", "ChangeType", "TransitionData", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTransitionHandler {

    /* renamed from: a */
    @NotNull
    public final Div2View f31729a;

    /* renamed from: b */
    @NotNull
    public List<TransitionData> f31730b = new ArrayList();

    /* renamed from: c */
    @NotNull
    public List<TransitionData> f31731c = new ArrayList();

    /* renamed from: d */
    public boolean f31732d;

    /* compiled from: DivTransitionHandler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType;", "", "Visibility", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class ChangeType {

        /* compiled from: DivTransitionHandler.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Visibility extends ChangeType {

            /* renamed from: a */
            public final int f31735a;

            public Visibility(int i2) {
                super(null);
                this.f31735a = i2;
            }
        }

        public ChangeType() {
        }

        public ChangeType(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivTransitionHandler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$TransitionData;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class TransitionData {

        /* renamed from: a */
        @NotNull
        public final Transition f31736a;

        /* renamed from: b */
        @NotNull
        public final View f31737b;

        /* renamed from: c */
        @NotNull
        public final List<ChangeType.Visibility> f31738c;

        /* renamed from: d */
        @NotNull
        public final List<ChangeType.Visibility> f31739d;

        public TransitionData(@NotNull Transition transition, @NotNull View view, @NotNull List<ChangeType.Visibility> list, @NotNull List<ChangeType.Visibility> list2) {
            this.f31736a = transition;
            this.f31737b = view;
            this.f31738c = list;
            this.f31739d = list2;
        }
    }

    public DivTransitionHandler(@NotNull Div2View div2View) {
        this.f31729a = div2View;
    }

    /* renamed from: a */
    public final void m16885a(ViewGroup viewGroup, boolean z) {
        if (z) {
            TransitionManager.m4257b(viewGroup);
        }
        final TransitionSet transitionSet = new TransitionSet();
        Iterator<T> it = this.f31730b.iterator();
        while (it.hasNext()) {
            transitionSet.m4263O(((TransitionData) it.next()).f31736a);
        }
        transitionSet.mo4237a(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.DivTransitionHandler$beginDelayedTransitions$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NotNull Transition transition) {
                Intrinsics.m32179h(transition, "transition");
                this.f31731c.clear();
                Transition.this.mo4255z(this);
            }
        });
        TransitionManager.m4256a(viewGroup, transitionSet);
        for (TransitionData transitionData : this.f31730b) {
            for (ChangeType.Visibility visibility : transitionData.f31738c) {
                View view = transitionData.f31737b;
                Objects.requireNonNull(visibility);
                Intrinsics.m32179h(view, "view");
                view.setVisibility(visibility.f31735a);
                transitionData.f31739d.add(visibility);
            }
        }
        this.f31731c.clear();
        this.f31731c.addAll(this.f31730b);
        this.f31730b.clear();
    }

    /* renamed from: b */
    public final List<ChangeType.Visibility> m16886b(List<TransitionData> list, View view) {
        ArrayList arrayList = new ArrayList();
        for (TransitionData transitionData : list) {
            ChangeType.Visibility visibility = Intrinsics.m32174c(transitionData.f31737b, view) ? (ChangeType.Visibility) CollectionsKt.m31992E(transitionData.f31739d) : null;
            if (visibility != null) {
                arrayList.add(visibility);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void m16887c(@NotNull Transition transition, @NotNull View view, @NotNull ChangeType.Visibility visibility) {
        this.f31730b.add(new TransitionData(transition, view, CollectionsKt.m31998K(visibility), new ArrayList()));
        if (this.f31732d) {
            return;
        }
        this.f31732d = true;
        this.f31729a.post(new RunnableC0042c(this, 16));
    }
}
