package com.yandex.div.core.view2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivViewCreator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivViewCreator;", "Lcom/yandex/div/internal/core/DivVisitor;", "Landroid/view/View;", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivViewCreator extends DivVisitor<View> {

    /* renamed from: a */
    @NotNull
    public final Context f31675a;

    /* renamed from: b */
    @NotNull
    public final ViewPool f31676b;

    /* renamed from: c */
    @NotNull
    public final DivValidator f31677c;

    /* compiled from: DivViewCreator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0015"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivViewCreator$Companion;", "", "", "TAG_CUSTOM", "Ljava/lang/String;", "TAG_GALLERY", "TAG_GIF_IMAGE", "TAG_GRID", "TAG_IMAGE", "TAG_INDICATOR", "TAG_INPUT", "TAG_LINEAR_CONTAINER", "TAG_OVERLAP_CONTAINER", "TAG_PAGER", "TAG_SELECT", "TAG_SLIDER", "TAG_STATE", "TAG_TABS", "TAG_TEXT", "TAG_VIDEO", "TAG_WRAP_CONTAINER", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @Inject
    public DivViewCreator(@Named @NotNull Context context, @NotNull ViewPool viewPool, @NotNull DivValidator validator) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(viewPool, "viewPool");
        Intrinsics.m32179h(validator, "validator");
        this.f31675a = context;
        this.f31676b = viewPool;
        this.f31677c = validator;
        viewPool.mo17401b("DIV2.TEXT_VIEW", new C2856b(this, 0), 20);
        viewPool.mo17401b("DIV2.IMAGE_VIEW", new C2856b(this, 8), 20);
        viewPool.mo17401b("DIV2.IMAGE_GIF_VIEW", new C2856b(this, 9), 3);
        viewPool.mo17401b("DIV2.OVERLAP_CONTAINER_VIEW", new C2856b(this, 10), 8);
        viewPool.mo17401b("DIV2.LINEAR_CONTAINER_VIEW", new C2856b(this, 11), 12);
        viewPool.mo17401b("DIV2.WRAP_CONTAINER_VIEW", new C2856b(this, 12), 4);
        viewPool.mo17401b("DIV2.GRID_VIEW", new C2856b(this, 13), 4);
        viewPool.mo17401b("DIV2.GALLERY_VIEW", new C2856b(this, 14), 6);
        viewPool.mo17401b("DIV2.PAGER_VIEW", new C2856b(this, 15), 2);
        viewPool.mo17401b("DIV2.TAB_VIEW", new C2856b(this, 16), 2);
        viewPool.mo17401b("DIV2.STATE", new C2856b(this, 1), 4);
        viewPool.mo17401b("DIV2.CUSTOM", new C2856b(this, 2), 2);
        viewPool.mo17401b("DIV2.INDICATOR", new C2856b(this, 3), 2);
        viewPool.mo17401b("DIV2.SLIDER", new C2856b(this, 4), 2);
        viewPool.mo17401b("DIV2.INPUT", new C2856b(this, 5), 2);
        viewPool.mo17401b("DIV2.SELECT", new C2856b(this, 6), 2);
        viewPool.mo17401b("DIV2.VIDEO", new C2856b(this, 7), 2);
    }

    @Override // com.yandex.div.internal.core.DivVisitor
    /* renamed from: b */
    public View mo16594b(Div.Container container, ExpressionResolver expressionResolver) {
        ViewGroup viewGroup = (ViewGroup) mo16593a(container, expressionResolver);
        Iterator<T> it = container.f34421c.f34953t.iterator();
        while (it.hasNext()) {
            viewGroup.addView(m16868n((Div) it.next(), expressionResolver));
        }
        return viewGroup;
    }

    @Override // com.yandex.div.internal.core.DivVisitor
    /* renamed from: f */
    public View mo16597f(Div.Grid grid, ExpressionResolver expressionResolver) {
        ViewGroup viewGroup = (ViewGroup) mo16593a(grid, expressionResolver);
        Iterator<T> it = grid.f34425c.f36481t.iterator();
        while (it.hasNext()) {
            viewGroup.addView(m16868n((Div) it.next(), expressionResolver));
        }
        return viewGroup;
    }

    @Override // com.yandex.div.internal.core.DivVisitor
    /* renamed from: i */
    public View mo16867i(Div.Separator separator, ExpressionResolver expressionResolver) {
        return new DivSeparatorView(this.f31675a, null, 0, 6);
    }

    @NotNull
    /* renamed from: n */
    public View m16868n(@NotNull Div div, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(resolver, "resolver");
        DivValidator divValidator = this.f31677c;
        Objects.requireNonNull(divValidator);
        return divValidator.m17303m(div, resolver).booleanValue() ? m17303m(div, resolver) : new Space(this.f31675a);
    }

    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public View mo16593a(@NotNull Div data, @NotNull ExpressionResolver resolver) {
        String str;
        Intrinsics.m32179h(data, "data");
        Intrinsics.m32179h(resolver, "resolver");
        ViewPool viewPool = this.f31676b;
        if (data instanceof Div.Container) {
            Div.Container container = (Div.Container) data;
            str = BaseDivViewExtensionsKt.m16918H(container.f34421c, resolver) ? "DIV2.WRAP_CONTAINER_VIEW" : container.f34421c.f34958y.mo17535b(resolver) == DivContainer.Orientation.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
        } else if (data instanceof Div.Custom) {
            str = "DIV2.CUSTOM";
        } else if (data instanceof Div.Gallery) {
            str = "DIV2.GALLERY_VIEW";
        } else if (data instanceof Div.GifImage) {
            str = "DIV2.IMAGE_GIF_VIEW";
        } else if (data instanceof Div.Grid) {
            str = "DIV2.GRID_VIEW";
        } else if (data instanceof Div.Image) {
            str = "DIV2.IMAGE_VIEW";
        } else if (data instanceof Div.Indicator) {
            str = "DIV2.INDICATOR";
        } else if (data instanceof Div.Input) {
            str = "DIV2.INPUT";
        } else if (data instanceof Div.Pager) {
            str = "DIV2.PAGER_VIEW";
        } else if (data instanceof Div.Select) {
            str = "DIV2.SELECT";
        } else if (data instanceof Div.Slider) {
            str = "DIV2.SLIDER";
        } else if (data instanceof Div.State) {
            str = "DIV2.STATE";
        } else if (data instanceof Div.Tabs) {
            str = "DIV2.TAB_VIEW";
        } else if (data instanceof Div.Text) {
            str = "DIV2.TEXT_VIEW";
        } else if (data instanceof Div.Video) {
            str = "DIV2.VIDEO";
        } else {
            if (!(data instanceof Div.Separator)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        return viewPool.mo17400a(str);
    }
}
