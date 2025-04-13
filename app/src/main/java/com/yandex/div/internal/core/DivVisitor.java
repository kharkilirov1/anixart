package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVisitor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/core/DivVisitor;", "T", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivVisitor<T> {
    /* renamed from: a */
    public abstract T mo16593a(@NotNull Div div, @NotNull ExpressionResolver expressionResolver);

    /* renamed from: b */
    public T mo16594b(@NotNull Div.Container container, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(container, expressionResolver);
    }

    /* renamed from: c */
    public T mo16595c(@NotNull Div.Custom custom, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(custom, expressionResolver);
    }

    /* renamed from: d */
    public T mo16596d(@NotNull Div.Gallery gallery, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(gallery, expressionResolver);
    }

    /* renamed from: e */
    public T mo16857e(@NotNull Div.GifImage gifImage, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(gifImage, expressionResolver);
    }

    /* renamed from: f */
    public T mo16597f(@NotNull Div.Grid grid, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(grid, expressionResolver);
    }

    /* renamed from: g */
    public T mo16858g(@NotNull Div.Image image, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(image, expressionResolver);
    }

    /* renamed from: h */
    public T mo16598h(@NotNull Div.Pager pager, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(pager, expressionResolver);
    }

    /* renamed from: i */
    public T mo16867i(@NotNull Div.Separator separator, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(separator, expressionResolver);
    }

    /* renamed from: j */
    public T mo16599j(@NotNull Div.State state, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(state, expressionResolver);
    }

    /* renamed from: k */
    public T mo16600k(@NotNull Div.Tabs tabs, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(tabs, expressionResolver);
    }

    /* renamed from: l */
    public T mo16859l(@NotNull Div.Text text, @NotNull ExpressionResolver expressionResolver) {
        return mo16593a(text, expressionResolver);
    }

    /* renamed from: m */
    public final T m17303m(@NotNull Div div, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(resolver, "resolver");
        if (div instanceof Div.Text) {
            return mo16859l((Div.Text) div, resolver);
        }
        if (div instanceof Div.Image) {
            return mo16858g((Div.Image) div, resolver);
        }
        if (div instanceof Div.GifImage) {
            return mo16857e((Div.GifImage) div, resolver);
        }
        if (div instanceof Div.Separator) {
            return mo16867i((Div.Separator) div, resolver);
        }
        if (div instanceof Div.Container) {
            return mo16594b((Div.Container) div, resolver);
        }
        if (div instanceof Div.Grid) {
            return mo16597f((Div.Grid) div, resolver);
        }
        if (div instanceof Div.Gallery) {
            return mo16596d((Div.Gallery) div, resolver);
        }
        if (div instanceof Div.Pager) {
            return mo16598h((Div.Pager) div, resolver);
        }
        if (div instanceof Div.Tabs) {
            return mo16600k((Div.Tabs) div, resolver);
        }
        if (div instanceof Div.State) {
            return mo16599j((Div.State) div, resolver);
        }
        if (div instanceof Div.Custom) {
            return mo16595c((Div.Custom) div, resolver);
        }
        if (div instanceof Div.Indicator) {
            return mo16593a((Div.Indicator) div, resolver);
        }
        if (div instanceof Div.Slider) {
            return mo16593a((Div.Slider) div, resolver);
        }
        if (div instanceof Div.Input) {
            return mo16593a((Div.Input) div, resolver);
        }
        if (div instanceof Div.Select) {
            return mo16593a((Div.Select) div, resolver);
        }
        if (div instanceof Div.Video) {
            return mo16593a((Div.Video) div, resolver);
        }
        throw new NoWhenBranchMatchedException();
    }
}
