package com.yandex.div.core.view2;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.Slide;
import com.yandex.div.core.view2.animations.TransitionsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivSlideTransition;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTransitionBuilder.kt */
@DivViewScope
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivTransitionBuilder;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTransitionBuilder {

    /* renamed from: a */
    @NotNull
    public final Context f31665a;

    /* renamed from: b */
    @NotNull
    public final DivViewIdProvider f31666b;

    /* compiled from: DivTransitionBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivTransitionBuilder$Companion;", "", "", "TAG", "Ljava/lang/String;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivTransitionBuilder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivSlideTransition.Edge.values().length];
            DivSlideTransition.Edge edge = DivSlideTransition.Edge.LEFT;
            iArr[0] = 1;
            DivSlideTransition.Edge edge2 = DivSlideTransition.Edge.TOP;
            iArr[1] = 2;
            DivSlideTransition.Edge edge3 = DivSlideTransition.Edge.RIGHT;
            iArr[2] = 3;
            DivSlideTransition.Edge edge4 = DivSlideTransition.Edge.BOTTOM;
            iArr[3] = 4;
        }
    }

    @Inject
    public DivTransitionBuilder(@Named @NotNull Context context, @NotNull DivViewIdProvider viewIdProvider) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(viewIdProvider, "viewIdProvider");
        this.f31665a = context;
        this.f31666b = viewIdProvider;
    }

    @NotNull
    /* renamed from: a */
    public TransitionSet m16862a(@Nullable Sequence<? extends Div> sequence, @Nullable Sequence<? extends Div> sequence2, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.m4268T(0);
        if (sequence != null) {
            ArrayList arrayList = new ArrayList();
            FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1((FilteringSequence) sequence);
            while (filteringSequence$iterator$1.hasNext()) {
                Div div = (Div) filteringSequence$iterator$1.next();
                String f39984w = div.m17557a().getF39984w();
                DivAppearanceTransition f39955t = div.m17557a().getF39955T();
                if (f39984w != null && f39955t != null) {
                    Transition m16863b = m16863b(f39955t, 2, resolver);
                    m16863b.mo4238b(this.f31666b.m16870a(f39984w));
                    arrayList.add(m16863b);
                }
            }
            TransitionsKt.m16897a(transitionSet, arrayList);
        }
        if (sequence != null && sequence2 != null) {
            ArrayList arrayList2 = new ArrayList();
            FilteringSequence$iterator$1 filteringSequence$iterator$12 = new FilteringSequence$iterator$1((FilteringSequence) sequence);
            while (filteringSequence$iterator$12.hasNext()) {
                Div div2 = (Div) filteringSequence$iterator$12.next();
                String f39984w2 = div2.m17557a().getF39984w();
                DivChangeTransition f39953r = div2.m17557a().getF39953R();
                if (f39984w2 != null && f39953r != null) {
                    Transition m16864c = m16864c(f39953r, resolver);
                    m16864c.mo4238b(this.f31666b.m16870a(f39984w2));
                    arrayList2.add(m16864c);
                }
            }
            TransitionsKt.m16897a(transitionSet, arrayList2);
        }
        if (sequence2 != null) {
            ArrayList arrayList3 = new ArrayList();
            FilteringSequence$iterator$1 filteringSequence$iterator$13 = new FilteringSequence$iterator$1((FilteringSequence) sequence2);
            while (filteringSequence$iterator$13.hasNext()) {
                Div div3 = (Div) filteringSequence$iterator$13.next();
                String f39984w3 = div3.m17557a().getF39984w();
                DivAppearanceTransition f39954s = div3.m17557a().getF39954S();
                if (f39984w3 != null && f39954s != null) {
                    Transition m16863b2 = m16863b(f39954s, 1, resolver);
                    m16863b2.mo4238b(this.f31666b.m16870a(f39984w3));
                    arrayList3.add(m16863b2);
                }
            }
            TransitionsKt.m16897a(transitionSet, arrayList3);
        }
        return transitionSet;
    }

    /* renamed from: b */
    public final Transition m16863b(DivAppearanceTransition divAppearanceTransition, int i2, ExpressionResolver expressionResolver) {
        int m16934X;
        if (divAppearanceTransition instanceof DivAppearanceTransition.Set) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator<T> it = ((DivAppearanceTransition.Set) divAppearanceTransition).f34731c.f34719a.iterator();
            while (it.hasNext()) {
                Transition m16863b = m16863b((DivAppearanceTransition) it.next(), i2, expressionResolver);
                transitionSet.m4266R(Math.max(transitionSet.f6267d, m16863b.f6266c + m16863b.f6267d));
                transitionSet.m4263O(m16863b);
            }
            return transitionSet;
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.Fade) {
            DivAppearanceTransition.Fade fade = (DivAppearanceTransition.Fade) divAppearanceTransition;
            Fade fade2 = new Fade((float) fade.f34729c.f35683a.mo17535b(expressionResolver).doubleValue());
            fade2.m4287U(i2);
            fade2.f6267d = fade.f34729c.f35684b.mo17535b(expressionResolver).longValue();
            fade2.f6266c = fade.f34729c.f35686d.mo17535b(expressionResolver).longValue();
            fade2.f6268e = DivUtilKt.m16759b(fade.f34729c.f35685c.mo17535b(expressionResolver));
            return fade2;
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.Scale) {
            DivAppearanceTransition.Scale scale = (DivAppearanceTransition.Scale) divAppearanceTransition;
            Scale scale2 = new Scale((float) scale.f34730c.f38224e.mo17535b(expressionResolver).doubleValue(), (float) scale.f34730c.f38222c.mo17535b(expressionResolver).doubleValue(), (float) scale.f34730c.f38223d.mo17535b(expressionResolver).doubleValue());
            scale2.m4287U(i2);
            scale2.f6267d = scale.f34730c.f38220a.mo17535b(expressionResolver).longValue();
            scale2.f6266c = scale.f34730c.f38225f.mo17535b(expressionResolver).longValue();
            scale2.f6268e = DivUtilKt.m16759b(scale.f34730c.f38221b.mo17535b(expressionResolver));
            return scale2;
        }
        if (!(divAppearanceTransition instanceof DivAppearanceTransition.Slide)) {
            throw new NoWhenBranchMatchedException();
        }
        DivAppearanceTransition.Slide slide = (DivAppearanceTransition.Slide) divAppearanceTransition;
        DivDimension divDimension = slide.f34732c.f38862a;
        if (divDimension == null) {
            m16934X = -1;
        } else {
            DisplayMetrics displayMetrics = this.f31665a.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "context.resources.displayMetrics");
            m16934X = BaseDivViewExtensionsKt.m16934X(divDimension, displayMetrics, expressionResolver);
        }
        int ordinal = slide.f34732c.f38864c.mo17535b(expressionResolver).ordinal();
        int i3 = 3;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i3 = 48;
            } else if (ordinal == 2) {
                i3 = 5;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 80;
            }
        }
        Slide slide2 = new Slide(m16934X, i3);
        slide2.m4287U(i2);
        slide2.f6267d = slide.f34732c.f38863b.mo17535b(expressionResolver).longValue();
        slide2.f6266c = slide.f34732c.f38866e.mo17535b(expressionResolver).longValue();
        slide2.f6268e = DivUtilKt.m16759b(slide.f34732c.f38865d.mo17535b(expressionResolver));
        return slide2;
    }

    /* renamed from: c */
    public final Transition m16864c(DivChangeTransition divChangeTransition, ExpressionResolver expressionResolver) {
        if (divChangeTransition instanceof DivChangeTransition.Set) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator<T> it = ((DivChangeTransition.Set) divChangeTransition).f34860c.f34849a.iterator();
            while (it.hasNext()) {
                transitionSet.m4263O(m16864c((DivChangeTransition) it.next(), expressionResolver));
            }
            return transitionSet;
        }
        if (!(divChangeTransition instanceof DivChangeTransition.Bounds)) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeBounds changeBounds = new ChangeBounds();
        DivChangeTransition.Bounds bounds = (DivChangeTransition.Bounds) divChangeTransition;
        changeBounds.f6267d = bounds.f34858c.f34823a.mo17535b(expressionResolver).longValue();
        changeBounds.f6266c = bounds.f34858c.f34825c.mo17535b(expressionResolver).longValue();
        changeBounds.f6268e = DivUtilKt.m16759b(bounds.f34858c.f34824b.mo17535b(expressionResolver));
        return changeBounds;
    }
}
