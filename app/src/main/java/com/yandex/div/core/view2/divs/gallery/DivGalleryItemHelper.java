package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivGallery;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivGalleryItemHelper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DivGalleryItemHelper {

    /* renamed from: a */
    public static final /* synthetic */ int f32619a = 0;

    /* compiled from: DivGalleryItemHelper.kt */
    /* renamed from: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {

        /* renamed from: a */
        public static final /* synthetic */ int f32623a = 0;

        static {
            int i2 = DivGalleryItemHelper.f32619a;
        }

        /* renamed from: a */
        public static void m17057a(DivGalleryItemHelper divGalleryItemHelper, @NotNull View child, int i2, int i3, int i4, int i5, boolean z) {
            Object m31891a;
            int i6;
            int i7;
            DivAlignmentVertical mo17535b;
            DivGallery.CrossContentAlignment crossContentAlignment;
            DivGallery.CrossContentAlignment crossContentAlignment2;
            DivAlignmentHorizontal mo17535b2;
            List<Div> mo3567m;
            Object tag;
            Intrinsics.m32179h(child, "child");
            try {
                mo3567m = divGalleryItemHelper.mo3567m();
                tag = child.getTag(C2507R.id.div_gallery_item_index);
            } catch (Throwable th) {
                m31891a = ResultKt.m31891a(th);
            }
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            m31891a = mo3567m.get(((Integer) tag).intValue()).m17557a();
            DivGallery.CrossContentAlignment crossContentAlignment3 = null;
            if (m31891a instanceof Result.Failure) {
                m31891a = null;
            }
            DivBase divBase = (DivBase) m31891a;
            ExpressionResolver expressionResolver = divGalleryItemHelper.mo3563h().getExpressionResolver();
            Expression<DivGallery.CrossContentAlignment> expression = divGalleryItemHelper.mo3557a().f35947i;
            int mo3571p = divGalleryItemHelper.mo3571p();
            if ((mo3571p == 1 && child.getMeasuredWidth() == 0) || (mo3571p == 0 && child.getMeasuredHeight() == 0)) {
                divGalleryItemHelper.mo3561f(child, i2, i3, i4, i5);
                if (z) {
                    return;
                }
                divGalleryItemHelper.mo3566k().add(child);
                return;
            }
            if (mo3571p == 1) {
                Companion companion = Companion.f32624a;
                Expression<DivAlignmentHorizontal> mo17579m = divBase == null ? null : divBase.mo17579m();
                if (mo17579m == null || (mo17535b2 = mo17579m.mo17535b(expressionResolver)) == null) {
                    crossContentAlignment2 = null;
                } else {
                    int ordinal = mo17535b2.ordinal();
                    if (ordinal == 0) {
                        crossContentAlignment2 = DivGallery.CrossContentAlignment.START;
                    } else if (ordinal == 1) {
                        crossContentAlignment2 = DivGallery.CrossContentAlignment.CENTER;
                    } else {
                        if (ordinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        crossContentAlignment2 = DivGallery.CrossContentAlignment.END;
                    }
                }
                if (crossContentAlignment2 == null) {
                    crossContentAlignment2 = expression.mo17535b(expressionResolver);
                }
                i6 = Companion.m17066a(companion, (divGalleryItemHelper.getView().getMeasuredWidth() - divGalleryItemHelper.getView().getPaddingLeft()) - divGalleryItemHelper.getView().getPaddingRight(), i4 - i2, crossContentAlignment2);
            } else {
                i6 = 0;
            }
            if (mo3571p == 0) {
                Companion companion2 = Companion.f32624a;
                Expression<DivAlignmentVertical> mo17583q = divBase == null ? null : divBase.mo17583q();
                if (mo17583q != null && (mo17535b = mo17583q.mo17535b(expressionResolver)) != null) {
                    int ordinal2 = mo17535b.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            crossContentAlignment = DivGallery.CrossContentAlignment.CENTER;
                        } else if (ordinal2 == 2) {
                            crossContentAlignment = DivGallery.CrossContentAlignment.END;
                        } else if (ordinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        crossContentAlignment3 = crossContentAlignment;
                    }
                    crossContentAlignment = DivGallery.CrossContentAlignment.START;
                    crossContentAlignment3 = crossContentAlignment;
                }
                if (crossContentAlignment3 == null) {
                    crossContentAlignment3 = expression.mo17535b(expressionResolver);
                }
                i7 = Companion.m17066a(companion2, (divGalleryItemHelper.getView().getMeasuredHeight() - divGalleryItemHelper.getView().getPaddingTop()) - divGalleryItemHelper.getView().getPaddingBottom(), i5 - i3, crossContentAlignment3);
            } else {
                i7 = 0;
            }
            divGalleryItemHelper.mo3561f(child, i2 + i6, i3 + i7, i4 + i6, i5 + i7);
            divGalleryItemHelper.mo3569o(child, false);
            if (z) {
                return;
            }
            divGalleryItemHelper.mo3566k().remove(child);
        }

        /* renamed from: b */
        public static void m17058b(DivGalleryItemHelper divGalleryItemHelper, @NotNull RecyclerView view) {
            Intrinsics.m32179h(view, "view");
            int childCount = view.getChildCount();
            if (childCount <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                View childAt = view.getChildAt(i2);
                Intrinsics.m32178g(childAt, "getChildAt(index)");
                divGalleryItemHelper.mo3569o(childAt, false);
                if (i3 >= childCount) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }

        /* renamed from: c */
        public static void m17059c(DivGalleryItemHelper divGalleryItemHelper, @NotNull RecyclerView view, @NotNull RecyclerView.Recycler recycler) {
            Intrinsics.m32179h(view, "view");
            Intrinsics.m32179h(recycler, "recycler");
            int childCount = view.getChildCount();
            if (childCount <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                View childAt = view.getChildAt(i2);
                Intrinsics.m32178g(childAt, "getChildAt(index)");
                divGalleryItemHelper.mo3569o(childAt, true);
                if (i3 >= childCount) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }

        /* renamed from: d */
        public static void m17060d(DivGalleryItemHelper divGalleryItemHelper) {
            for (View view : divGalleryItemHelper.mo3566k()) {
                divGalleryItemHelper.mo3559c(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
            }
            divGalleryItemHelper.mo3566k().clear();
        }

        /* renamed from: e */
        public static void m17061e(DivGalleryItemHelper divGalleryItemHelper, @NotNull RecyclerView.Recycler recycler) {
            Intrinsics.m32179h(recycler, "recycler");
            RecyclerView view = divGalleryItemHelper.getView();
            int childCount = view.getChildCount();
            if (childCount <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                View childAt = view.getChildAt(i2);
                Intrinsics.m32178g(childAt, "getChildAt(index)");
                divGalleryItemHelper.mo3569o(childAt, true);
                if (i3 >= childCount) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }

        /* renamed from: f */
        public static int m17062f(int i2, int i3, int i4, int i5, int i6, boolean z) {
            int i7 = i2 - i4;
            boolean z2 = false;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i5 >= 0 && i5 <= Integer.MAX_VALUE) {
                z2 = true;
            }
            return z2 ? ViewsKt.m17193h(i5) : i5 == -1 ? (z && i3 == 0) ? ViewsKt.m17194i() : View.MeasureSpec.makeMeasureSpec(i7, i3) : i5 == -2 ? i6 == Integer.MAX_VALUE ? ViewsKt.m17194i() : ViewsKt.m17192g(i6) : i5 == -3 ? (i3 == Integer.MIN_VALUE || i3 == 1073741824) ? ViewsKt.m17192g(Math.min(i7, i6)) : i6 == Integer.MAX_VALUE ? ViewsKt.m17194i() : ViewsKt.m17192g(i6) : ViewsKt.m17194i();
        }

        /* renamed from: g */
        public static void m17063g(final DivGalleryItemHelper divGalleryItemHelper, final int i2, final int i3) {
            RecyclerView view = divGalleryItemHelper.getView();
            if (!com.yandex.div.core.util.ViewsKt.m16768b(view) || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$instantScroll$$inlined$doOnActualLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                        Intrinsics.m32179h(view2, "view");
                        view2.removeOnLayoutChangeListener(this);
                        if (i2 == 0) {
                            RecyclerView view3 = divGalleryItemHelper.getView();
                            int i12 = i3;
                            view3.scrollBy(-i12, -i12);
                            return;
                        }
                        divGalleryItemHelper.getView().scrollBy(-divGalleryItemHelper.getView().getScrollX(), -divGalleryItemHelper.getView().getScrollY());
                        RecyclerView.LayoutManager layoutManager = divGalleryItemHelper.getView().getLayoutManager();
                        View mo3676L = layoutManager == null ? null : layoutManager.mo3676L(i2);
                        OrientationHelper m3736b = OrientationHelper.m3736b(divGalleryItemHelper.getView().getLayoutManager(), divGalleryItemHelper.mo3571p());
                        while (mo3676L == null && (divGalleryItemHelper.getView().canScrollVertically(1) || divGalleryItemHelper.getView().canScrollHorizontally(1))) {
                            RecyclerView.LayoutManager layoutManager2 = divGalleryItemHelper.getView().getLayoutManager();
                            if (layoutManager2 != null) {
                                layoutManager2.m3871R0();
                            }
                            RecyclerView.LayoutManager layoutManager3 = divGalleryItemHelper.getView().getLayoutManager();
                            mo3676L = layoutManager3 == null ? null : layoutManager3.mo3676L(i2);
                            if (mo3676L != null) {
                                break;
                            } else {
                                divGalleryItemHelper.getView().scrollBy(divGalleryItemHelper.getView().getWidth(), divGalleryItemHelper.getView().getHeight());
                            }
                        }
                        if (mo3676L == null) {
                            return;
                        }
                        int mo3741g = (m3736b.mo3741g(mo3676L) - m3736b.mo3747m()) - i3;
                        ViewGroup.LayoutParams layoutParams = mo3676L.getLayoutParams();
                        int m2091b = mo3741g + (layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.m2091b((ViewGroup.MarginLayoutParams) layoutParams) : 0);
                        divGalleryItemHelper.getView().scrollBy(m2091b, m2091b);
                    }
                });
                return;
            }
            if (i2 == 0) {
                int i4 = -i3;
                divGalleryItemHelper.getView().scrollBy(i4, i4);
                return;
            }
            divGalleryItemHelper.getView().scrollBy(-divGalleryItemHelper.getView().getScrollX(), -divGalleryItemHelper.getView().getScrollY());
            RecyclerView.LayoutManager layoutManager = divGalleryItemHelper.getView().getLayoutManager();
            View mo3676L = layoutManager == null ? null : layoutManager.mo3676L(i2);
            OrientationHelper m3736b = OrientationHelper.m3736b(divGalleryItemHelper.getView().getLayoutManager(), divGalleryItemHelper.mo3571p());
            while (mo3676L == null && (divGalleryItemHelper.getView().canScrollVertically(1) || divGalleryItemHelper.getView().canScrollHorizontally(1))) {
                RecyclerView.LayoutManager layoutManager2 = divGalleryItemHelper.getView().getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.m3871R0();
                }
                RecyclerView.LayoutManager layoutManager3 = divGalleryItemHelper.getView().getLayoutManager();
                mo3676L = layoutManager3 == null ? null : layoutManager3.mo3676L(i2);
                if (mo3676L != null) {
                    break;
                } else {
                    divGalleryItemHelper.getView().scrollBy(divGalleryItemHelper.getView().getWidth(), divGalleryItemHelper.getView().getHeight());
                }
            }
            if (mo3676L == null) {
                return;
            }
            int mo3741g = (m3736b.mo3741g(mo3676L) - m3736b.mo3747m()) - i3;
            ViewGroup.LayoutParams layoutParams = mo3676L.getLayoutParams();
            int m2091b = mo3741g + (layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.m2091b((ViewGroup.MarginLayoutParams) layoutParams) : 0);
            divGalleryItemHelper.getView().scrollBy(m2091b, m2091b);
        }

        /* renamed from: h */
        public static void m17064h(DivGalleryItemHelper divGalleryItemHelper, @NotNull View child, boolean z) {
            View view;
            Intrinsics.m32179h(child, "child");
            int mo3564i = divGalleryItemHelper.mo3564i(child);
            if (mo3564i == -1) {
                return;
            }
            ViewGroup viewGroup = child instanceof ViewGroup ? (ViewGroup) child : null;
            if (viewGroup == null || (view = (View) SequencesKt.m33844l(ViewGroupKt.m2377b(viewGroup))) == null) {
                return;
            }
            Div div = divGalleryItemHelper.mo3567m().get(mo3564i);
            if (z) {
                DivVisibilityActionTracker mo16644p = divGalleryItemHelper.mo3563h().getDiv2Component().mo16644p();
                Intrinsics.m32178g(mo16644p, "divView.div2Component.visibilityActionTracker");
                mo16644p.m16876d(divGalleryItemHelper.mo3563h(), null, div, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(div.m17557a()) : null);
                divGalleryItemHelper.mo3563h().m16809G(view);
                return;
            }
            DivVisibilityActionTracker mo16644p2 = divGalleryItemHelper.mo3563h().getDiv2Component().mo16644p();
            Intrinsics.m32178g(mo16644p2, "divView.div2Component.visibilityActionTracker");
            mo16644p2.m16876d(divGalleryItemHelper.mo3563h(), view, div, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(div.m17557a()) : null);
            divGalleryItemHelper.mo3563h().m16814o(view, div);
        }
    }

    /* compiled from: DivGalleryItemHelper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f32624a = new Companion();

        /* compiled from: DivGalleryItemHelper.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[DivGallery.CrossContentAlignment.values().length];
                DivGallery.CrossContentAlignment crossContentAlignment = DivGallery.CrossContentAlignment.START;
                iArr[0] = 1;
                DivGallery.CrossContentAlignment crossContentAlignment2 = DivGallery.CrossContentAlignment.CENTER;
                iArr[1] = 2;
                DivGallery.CrossContentAlignment crossContentAlignment3 = DivGallery.CrossContentAlignment.END;
                iArr[2] = 3;
                int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
                iArr2[0] = 1;
                DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
                iArr2[1] = 2;
                DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
                iArr2[2] = 3;
                int[] iArr3 = new int[DivAlignmentVertical.values().length];
                DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
                iArr3[0] = 1;
                DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.BASELINE;
                iArr3[3] = 2;
                DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.CENTER;
                iArr3[1] = 3;
                DivAlignmentVertical divAlignmentVertical4 = DivAlignmentVertical.BOTTOM;
                iArr3[2] = 4;
            }
        }

        /* renamed from: a */
        public static final int m17066a(Companion companion, int i2, int i3, DivGallery.CrossContentAlignment crossContentAlignment) {
            int i4 = i2 - i3;
            int ordinal = crossContentAlignment.ordinal();
            if (ordinal == 0) {
                return 0;
            }
            if (ordinal == 1) {
                return i4 / 2;
            }
            if (ordinal == 2) {
                return i4;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    /* renamed from: a */
    DivGallery mo3557a();

    /* renamed from: b */
    void mo3558b(int i2, int i3);

    /* renamed from: c */
    void mo3559c(@NotNull View view, int i2, int i3, int i4, int i5, boolean z);

    /* renamed from: d */
    int mo3560d();

    /* renamed from: f */
    void mo3561f(@NotNull View view, int i2, int i3, int i4, int i5);

    /* renamed from: g */
    void mo3562g(int i2);

    @NotNull
    RecyclerView getView();

    @NotNull
    /* renamed from: h */
    Div2View mo3563h();

    /* renamed from: i */
    int mo3564i(@NotNull View view);

    /* renamed from: j */
    int mo3565j();

    @NotNull
    /* renamed from: k */
    Set<View> mo3566k();

    @NotNull
    /* renamed from: m */
    List<Div> mo3567m();

    /* renamed from: n */
    int mo3568n();

    /* renamed from: o */
    void mo3569o(@NotNull View view, boolean z);

    /* renamed from: p */
    int mo3571p();
}
