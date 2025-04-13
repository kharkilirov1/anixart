package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.ShadowCache;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.SizeKt;
import com.yandex.div.internal.widget.TransientViewKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivBorderDrawer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "BorderParams", "ClipParams", "Companion", "ShadowParams", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivBorderDrawer implements ExpressionSubscriber {

    /* renamed from: b */
    @NotNull
    public final DisplayMetrics f32713b;

    /* renamed from: c */
    @NotNull
    public final View f32714c;

    /* renamed from: d */
    @NotNull
    public ExpressionResolver f32715d;

    /* renamed from: e */
    @NotNull
    public DivBorder f32716e;

    /* renamed from: i */
    public float f32720i;

    /* renamed from: j */
    public float[] f32721j;

    /* renamed from: k */
    public boolean f32722k;

    /* renamed from: l */
    public boolean f32723l;

    /* renamed from: m */
    public boolean f32724m;

    /* renamed from: n */
    public boolean f32725n;

    /* renamed from: f */
    @NotNull
    public final ClipParams f32717f = new ClipParams();

    /* renamed from: g */
    @NotNull
    public final Lazy f32718g = LazyKt.m31881b(new Function0<BorderParams>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$borderParams$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public DivBorderDrawer.BorderParams invoke() {
            return new DivBorderDrawer.BorderParams(DivBorderDrawer.this);
        }
    });

    /* renamed from: h */
    @NotNull
    public final Lazy f32719h = LazyKt.m31881b(new Function0<ShadowParams>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$shadowParams$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public DivBorderDrawer.ShadowParams invoke() {
            return new DivBorderDrawer.ShadowParams(DivBorderDrawer.this);
        }
    });

    /* renamed from: o */
    @NotNull
    public final List<Disposable> f32726o = new ArrayList();

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$BorderParams;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class BorderParams {

        /* renamed from: a */
        @NotNull
        public final Paint f32727a;

        /* renamed from: b */
        @NotNull
        public final Path f32728b;

        /* renamed from: c */
        @NotNull
        public final RectF f32729c;

        /* renamed from: d */
        public final /* synthetic */ DivBorderDrawer f32730d;

        public BorderParams(DivBorderDrawer this$0) {
            Intrinsics.m32179h(this$0, "this$0");
            this.f32730d = this$0;
            Paint paint = new Paint();
            this.f32727a = paint;
            this.f32728b = new Path();
            this.f32729c = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$ClipParams;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class ClipParams {

        /* renamed from: a */
        @NotNull
        public final Path f32731a = new Path();

        /* renamed from: b */
        @NotNull
        public final RectF f32732b = new RectF();

        public ClipParams() {
        }

        /* renamed from: a */
        public final void m17096a(@NotNull float[] fArr) {
            this.f32732b.set(0.0f, 0.0f, DivBorderDrawer.this.f32714c.getWidth(), DivBorderDrawer.this.f32714c.getHeight());
            this.f32731a.reset();
            this.f32731a.addRoundRect(this.f32732b, (float[]) fArr.clone(), Path.Direction.CW);
            this.f32731a.close();
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$Companion;", "", "", "DEFAULT_DX", "F", "DEFAULT_DY", "DEFAULT_SHADOW_ALPHA", "", "DEFAULT_SHADOW_COLOR", "I", "NO_ELEVATION", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$ShadowParams;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class ShadowParams {

        /* renamed from: a */
        public final float f32734a;

        /* renamed from: b */
        public float f32735b;

        /* renamed from: c */
        public int f32736c;

        /* renamed from: d */
        @NotNull
        public final Paint f32737d;

        /* renamed from: e */
        @NotNull
        public final Rect f32738e;

        /* renamed from: f */
        @Nullable
        public NinePatch f32739f;

        /* renamed from: g */
        public float f32740g;

        /* renamed from: h */
        public float f32741h;

        /* renamed from: i */
        public final /* synthetic */ DivBorderDrawer f32742i;

        public ShadowParams(DivBorderDrawer this$0) {
            Intrinsics.m32179h(this$0, "this$0");
            this.f32742i = this$0;
            float dimension = this$0.f32714c.getContext().getResources().getDimension(C2507R.dimen.div_shadow_elevation);
            this.f32734a = dimension;
            this.f32735b = dimension;
            this.f32736c = -16777216;
            this.f32737d = new Paint();
            this.f32738e = new Rect();
            this.f32741h = 0.5f;
        }
    }

    public DivBorderDrawer(@NotNull DisplayMetrics displayMetrics, @NotNull View view, @NotNull ExpressionResolver expressionResolver, @NotNull DivBorder divBorder) {
        this.f32713b = displayMetrics;
        this.f32714c = view;
        this.f32715d = expressionResolver;
        this.f32716e = divBorder;
        m17095m(this.f32715d, this.f32716e);
    }

    /* renamed from: a */
    public final void m17085a(DivBorder divBorder, ExpressionResolver expressionResolver) {
        boolean z;
        Expression<Integer> expression;
        Integer mo17535b;
        float m17097a = DivBorderDrawerKt.m17097a(divBorder.f34793e, expressionResolver, this.f32713b);
        this.f32720i = m17097a;
        float f2 = 0.0f;
        boolean z2 = m17097a > 0.0f;
        this.f32723l = z2;
        if (z2) {
            DivStroke divStroke = divBorder.f34793e;
            int intValue = (divStroke == null || (expression = divStroke.f39440a) == null || (mo17535b = expression.mo17535b(expressionResolver)) == null) ? 0 : mo17535b.intValue();
            BorderParams m17090g = m17090g();
            m17090g.f32727a.setStrokeWidth(this.f32720i);
            m17090g.f32727a.setColor(intValue);
        }
        DisplayMetrics metrics = this.f32713b;
        Intrinsics.m32179h(metrics, "metrics");
        DivCornersRadius divCornersRadius = divBorder.f34790b;
        Expression<Long> expression2 = divCornersRadius == null ? null : divCornersRadius.f35220c;
        if (expression2 == null) {
            expression2 = divBorder.f34789a;
        }
        float m16961u = BaseDivViewExtensionsKt.m16961u(expression2 == null ? null : expression2.mo17535b(expressionResolver), metrics);
        DivCornersRadius divCornersRadius2 = divBorder.f34790b;
        Expression<Long> expression3 = divCornersRadius2 == null ? null : divCornersRadius2.f35221d;
        if (expression3 == null) {
            expression3 = divBorder.f34789a;
        }
        float m16961u2 = BaseDivViewExtensionsKt.m16961u(expression3 == null ? null : expression3.mo17535b(expressionResolver), metrics);
        DivCornersRadius divCornersRadius3 = divBorder.f34790b;
        Expression<Long> expression4 = divCornersRadius3 == null ? null : divCornersRadius3.f35218a;
        if (expression4 == null) {
            expression4 = divBorder.f34789a;
        }
        float m16961u3 = BaseDivViewExtensionsKt.m16961u(expression4 == null ? null : expression4.mo17535b(expressionResolver), metrics);
        DivCornersRadius divCornersRadius4 = divBorder.f34790b;
        Expression<Long> expression5 = divCornersRadius4 == null ? null : divCornersRadius4.f35219b;
        if (expression5 == null) {
            expression5 = divBorder.f34789a;
        }
        float m16961u4 = BaseDivViewExtensionsKt.m16961u(expression5 == null ? null : expression5.mo17535b(expressionResolver), metrics);
        float[] fArr = {m16961u, m16961u, m16961u2, m16961u2, m16961u4, m16961u4, m16961u3, m16961u3};
        this.f32721j = fArr;
        float m31976z = ArraysKt.m31976z(fArr);
        int length = fArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = true;
                break;
            }
            float f3 = fArr[i2];
            i2++;
            if (!Float.valueOf(f3).equals(Float.valueOf(m31976z))) {
                z = false;
                break;
            }
        }
        this.f32722k = !z;
        boolean z3 = this.f32724m;
        boolean booleanValue = divBorder.f34791c.mo17535b(expressionResolver).booleanValue();
        this.f32725n = booleanValue;
        boolean z4 = divBorder.f34792d != null && booleanValue;
        this.f32724m = z4;
        View view = this.f32714c;
        if (booleanValue && !z4) {
            f2 = view.getContext().getResources().getDimension(C2507R.dimen.div_shadow_elevation);
        }
        view.setElevation(f2);
        m17093k();
        m17092j();
        if (this.f32724m || z3) {
            Object parent = this.f32714c.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 == null) {
                return;
            }
            view2.invalidate();
        }
    }

    /* renamed from: b */
    public final float m17086b(float f2, float f3, float f4) {
        if (f4 <= 0.0f || f3 <= 0.0f) {
            return 0.0f;
        }
        float min = Math.min(f4, f3) / 2;
        if (f2 > min) {
            KLog kLog = KLog.f33717a;
        }
        return Math.min(f2, min);
    }

    /* renamed from: c */
    public final void m17087c(@NotNull Canvas canvas) {
        if (m17094l()) {
            canvas.clipPath(this.f32717f.f32731a);
        }
    }

    /* renamed from: d */
    public final void m17088d(@NotNull Canvas canvas) {
        if (this.f32723l) {
            canvas.drawPath(m17090g().f32728b, m17090g().f32727a);
        }
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    /* renamed from: f */
    public final void m17089f(@NotNull Canvas canvas) {
        if (this.f32724m) {
            float f2 = m17091i().f32740g;
            float f3 = m17091i().f32741h;
            int save = canvas.save();
            canvas.translate(f2, f3);
            try {
                NinePatch ninePatch = m17091i().f32739f;
                if (ninePatch != null) {
                    ninePatch.draw(canvas, m17091i().f32738e, m17091i().f32737d);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: g */
    public final BorderParams m17090g() {
        return (BorderParams) this.f32718g.getValue();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.f32726o;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: h */
    public /* synthetic */ void mo16764h() {
        C6855a.m34406b(this);
    }

    /* renamed from: i */
    public final ShadowParams m17091i() {
        return (ShadowParams) this.f32719h.getValue();
    }

    /* renamed from: j */
    public final void m17092j() {
        if (m17094l()) {
            this.f32714c.setClipToOutline(false);
            this.f32714c.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        } else {
            this.f32714c.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$invalidateOutline$1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(@Nullable View view, @Nullable Outline outline) {
                    if (view == null || outline == null) {
                        return;
                    }
                    int width = view.getWidth();
                    int height = view.getHeight();
                    DivBorderDrawer divBorderDrawer = DivBorderDrawer.this;
                    float[] fArr = divBorderDrawer.f32721j;
                    if (fArr != null) {
                        outline.setRoundRect(0, 0, width, height, divBorderDrawer.m17086b(ArraysKt.m31976z(fArr), view.getWidth(), view.getHeight()));
                    } else {
                        Intrinsics.m32189r("cornerRadii");
                        throw null;
                    }
                }
            });
            this.f32714c.setClipToOutline(true);
        }
    }

    /* renamed from: k */
    public final void m17093k() {
        Number number;
        Number number2;
        DivPoint divPoint;
        DivDimension divDimension;
        DivPoint divPoint2;
        DivDimension divDimension2;
        Expression<Double> expression;
        Double mo17535b;
        Expression<Integer> expression2;
        Integer mo17535b2;
        Expression<Long> expression3;
        Long mo17535b3;
        float[] fArr = this.f32721j;
        if (fArr == null) {
            Intrinsics.m32189r("cornerRadii");
            throw null;
        }
        float[] fArr2 = (float[]) fArr.clone();
        int length = fArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = m17086b(fArr2[i2], this.f32714c.getWidth(), this.f32714c.getHeight());
        }
        this.f32717f.m17096a(fArr2);
        float f2 = this.f32720i / 2.0f;
        int length2 = fArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            fArr2[i3] = Math.max(0.0f, fArr2[i3] - f2);
        }
        if (this.f32723l) {
            BorderParams m17090g = m17090g();
            Objects.requireNonNull(m17090g);
            float f3 = m17090g.f32730d.f32720i / 2.0f;
            m17090g.f32729c.set(f3, f3, r5.f32714c.getWidth() - f3, m17090g.f32730d.f32714c.getHeight() - f3);
            m17090g.f32728b.reset();
            m17090g.f32728b.addRoundRect(m17090g.f32729c, fArr2, Path.Direction.CW);
            m17090g.f32728b.close();
        }
        if (this.f32724m) {
            ShadowParams m17091i = m17091i();
            Objects.requireNonNull(m17091i);
            float f4 = 2;
            m17091i.f32738e.set(0, 0, (int) ((m17091i.f32735b * f4) + m17091i.f32742i.f32714c.getWidth()), (int) ((m17091i.f32735b * f4) + m17091i.f32742i.f32714c.getHeight()));
            DivBorderDrawer divBorderDrawer = m17091i.f32742i;
            DivShadow divShadow = divBorderDrawer.f32716e.f34792d;
            Float valueOf = (divShadow == null || (expression3 = divShadow.f38781b) == null || (mo17535b3 = expression3.mo17535b(divBorderDrawer.f32715d)) == null) ? null : Float.valueOf(BaseDivViewExtensionsKt.m16962v(mo17535b3, m17091i.f32742i.f32713b));
            m17091i.f32735b = valueOf == null ? m17091i.f32734a : valueOf.floatValue();
            int i4 = -16777216;
            if (divShadow != null && (expression2 = divShadow.f38782c) != null && (mo17535b2 = expression2.mo17535b(m17091i.f32742i.f32715d)) != null) {
                i4 = mo17535b2.intValue();
            }
            m17091i.f32736c = i4;
            float f5 = 0.23f;
            if (divShadow != null && (expression = divShadow.f38780a) != null && (mo17535b = expression.mo17535b(m17091i.f32742i.f32715d)) != null) {
                f5 = (float) mo17535b.doubleValue();
            }
            if (divShadow == null || (divPoint2 = divShadow.f38783d) == null || (divDimension2 = divPoint2.f38066a) == null) {
                number = null;
            } else {
                DivBorderDrawer divBorderDrawer2 = m17091i.f32742i;
                number = Integer.valueOf(BaseDivViewExtensionsKt.m16934X(divDimension2, divBorderDrawer2.f32713b, divBorderDrawer2.f32715d));
            }
            if (number == null) {
                number = Float.valueOf(SizeKt.m17395a(0.0f));
            }
            m17091i.f32740g = number.floatValue() - m17091i.f32735b;
            if (divShadow == null || (divPoint = divShadow.f38783d) == null || (divDimension = divPoint.f38067b) == null) {
                number2 = null;
            } else {
                DivBorderDrawer divBorderDrawer3 = m17091i.f32742i;
                number2 = Integer.valueOf(BaseDivViewExtensionsKt.m16934X(divDimension, divBorderDrawer3.f32713b, divBorderDrawer3.f32715d));
            }
            if (number2 == null) {
                number2 = Float.valueOf(SizeKt.m17395a(0.5f));
            }
            m17091i.f32741h = number2.floatValue() - m17091i.f32735b;
            m17091i.f32737d.setColor(m17091i.f32736c);
            m17091i.f32737d.setAlpha((int) (f5 * KotlinVersion.MAX_COMPONENT_VALUE));
            ShadowCache shadowCache = ShadowCache.f31717a;
            Context context = m17091i.f32742i.f32714c.getContext();
            Intrinsics.m32178g(context, "view.context");
            float f6 = m17091i.f32735b;
            Map<ShadowCache.ShadowCacheKey, NinePatch> map = ShadowCache.f31719c;
            ShadowCache.ShadowCacheKey shadowCacheKey = new ShadowCache.ShadowCacheKey(fArr2, f6);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get(shadowCacheKey);
            if (obj == null) {
                float max = Math.max(fArr2[1] + fArr2[2], fArr2[5] + fArr2[6]) + f6;
                float max2 = Math.max(fArr2[0] + fArr2[7], fArr2[3] + fArr2[4]) + f6;
                float m32238e = RangesKt.m32238e(f6, 1.0f, 25.0f);
                float f7 = f6 <= 25.0f ? 1.0f : 25.0f / f6;
                float f8 = f6 * f4;
                int i5 = (int) ((max + f8) * f7);
                int i6 = (int) ((f8 + max2) * f7);
                Bitmap inBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ALPHA_8);
                Bitmap outBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ALPHA_8);
                Intrinsics.m32178g(inBitmap, "inBitmap");
                RoundRectShape roundRectShape = new RoundRectShape(fArr2, null, null);
                roundRectShape.resize(max, max2);
                Canvas canvas = new Canvas();
                canvas.setBitmap(inBitmap);
                int save = canvas.save();
                canvas.translate(m32238e, m32238e);
                try {
                    save = canvas.save();
                    canvas.scale(f7, f7, 0.0f, 0.0f);
                    try {
                        roundRectShape.draw(canvas, ShadowCache.f31718b);
                        canvas.restoreToCount(save);
                        Intrinsics.m32178g(outBitmap, "outBitmap");
                        RenderScript create = RenderScript.create(context);
                        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.A_8(create));
                        Allocation createFromBitmap = Allocation.createFromBitmap(create, inBitmap);
                        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, outBitmap);
                        create2.setRadius(m32238e);
                        create2.setInput(createFromBitmap);
                        create2.forEach(createFromBitmap2);
                        createFromBitmap2.copyTo(outBitmap);
                        inBitmap.recycle();
                        if (f7 < 1.0f) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(outBitmap, (int) (outBitmap.getWidth() / f7), (int) (outBitmap.getHeight() / f7), true);
                            Intrinsics.m32178g(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
                            outBitmap.recycle();
                            outBitmap = createScaledBitmap;
                        }
                        int width = outBitmap.getWidth();
                        int height = outBitmap.getHeight() / 2;
                        int i7 = width / 2;
                        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                        order.put((byte) 1);
                        order.put((byte) 2);
                        order.put((byte) 2);
                        order.put((byte) 9);
                        int i8 = 0;
                        order.putInt(0);
                        order.putInt(0);
                        order.putInt(0);
                        C2052a.m12289x(order, 0, 0, 0, 0);
                        C2052a.m12289x(order, i7 - 1, i7 + 1, height - 1, height + 1);
                        while (i8 < 9) {
                            i8++;
                            order.putInt(1);
                        }
                        byte[] array = order.array();
                        Intrinsics.m32178g(array, "buffer.array()");
                        obj = new NinePatch(outBitmap, array);
                        linkedHashMap.put(shadowCacheKey, obj);
                    } finally {
                        canvas.restoreToCount(save);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m17091i.f32739f = (NinePatch) obj;
        }
    }

    /* renamed from: l */
    public final boolean m17094l() {
        return this.f32724m || (!this.f32725n && (this.f32722k || this.f32723l || TransientViewKt.m17420a(this.f32714c)));
    }

    /* renamed from: m */
    public final void m17095m(final ExpressionResolver expressionResolver, final DivBorder divBorder) {
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        Expression<Integer> expression5;
        Expression<Long> expression6;
        Expression<DivSizeUnit> expression7;
        Expression<Double> expression8;
        Expression<Long> expression9;
        Expression<Integer> expression10;
        DivPoint divPoint;
        DivDimension divDimension;
        Expression<DivSizeUnit> expression11;
        DivPoint divPoint2;
        DivDimension divDimension2;
        Expression<Double> expression12;
        DivPoint divPoint3;
        DivDimension divDimension3;
        Expression<DivSizeUnit> expression13;
        DivPoint divPoint4;
        DivDimension divDimension4;
        Expression<Double> expression14;
        m17085a(divBorder, expressionResolver);
        Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$observeBorder$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivBorderDrawer.this.m17085a(divBorder, expressionResolver);
                DivBorderDrawer.this.f32714c.invalidate();
                return Unit.f63088a;
            }
        };
        Expression<Long> expression15 = divBorder.f34789a;
        Disposable disposable = null;
        Disposable mo17537e = expression15 == null ? null : expression15.mo17537e(expressionResolver, function1);
        if (mo17537e == null) {
            int i2 = Disposable.f30873B1;
            mo17537e = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e);
        DivCornersRadius divCornersRadius = divBorder.f34790b;
        Disposable mo17537e2 = (divCornersRadius == null || (expression = divCornersRadius.f35220c) == null) ? null : expression.mo17537e(expressionResolver, function1);
        if (mo17537e2 == null) {
            int i3 = Disposable.f30873B1;
            mo17537e2 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e2);
        DivCornersRadius divCornersRadius2 = divBorder.f34790b;
        Disposable mo17537e3 = (divCornersRadius2 == null || (expression2 = divCornersRadius2.f35221d) == null) ? null : expression2.mo17537e(expressionResolver, function1);
        if (mo17537e3 == null) {
            int i4 = Disposable.f30873B1;
            mo17537e3 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e3);
        DivCornersRadius divCornersRadius3 = divBorder.f34790b;
        Disposable mo17537e4 = (divCornersRadius3 == null || (expression3 = divCornersRadius3.f35219b) == null) ? null : expression3.mo17537e(expressionResolver, function1);
        if (mo17537e4 == null) {
            int i5 = Disposable.f30873B1;
            mo17537e4 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e4);
        DivCornersRadius divCornersRadius4 = divBorder.f34790b;
        Disposable mo17537e5 = (divCornersRadius4 == null || (expression4 = divCornersRadius4.f35218a) == null) ? null : expression4.mo17537e(expressionResolver, function1);
        if (mo17537e5 == null) {
            int i6 = Disposable.f30873B1;
            mo17537e5 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e5);
        C6855a.m34405a(this, divBorder.f34791c.mo17537e(expressionResolver, function1));
        DivStroke divStroke = divBorder.f34793e;
        Disposable mo17537e6 = (divStroke == null || (expression5 = divStroke.f39440a) == null) ? null : expression5.mo17537e(expressionResolver, function1);
        if (mo17537e6 == null) {
            int i7 = Disposable.f30873B1;
            mo17537e6 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e6);
        DivStroke divStroke2 = divBorder.f34793e;
        Disposable mo17537e7 = (divStroke2 == null || (expression6 = divStroke2.f39442c) == null) ? null : expression6.mo17537e(expressionResolver, function1);
        if (mo17537e7 == null) {
            int i8 = Disposable.f30873B1;
            mo17537e7 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e7);
        DivStroke divStroke3 = divBorder.f34793e;
        Disposable mo17537e8 = (divStroke3 == null || (expression7 = divStroke3.f39441b) == null) ? null : expression7.mo17537e(expressionResolver, function1);
        if (mo17537e8 == null) {
            int i9 = Disposable.f30873B1;
            mo17537e8 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e8);
        DivShadow divShadow = divBorder.f34792d;
        Disposable mo17537e9 = (divShadow == null || (expression8 = divShadow.f38780a) == null) ? null : expression8.mo17537e(expressionResolver, function1);
        if (mo17537e9 == null) {
            int i10 = Disposable.f30873B1;
            mo17537e9 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e9);
        DivShadow divShadow2 = divBorder.f34792d;
        Disposable mo17537e10 = (divShadow2 == null || (expression9 = divShadow2.f38781b) == null) ? null : expression9.mo17537e(expressionResolver, function1);
        if (mo17537e10 == null) {
            int i11 = Disposable.f30873B1;
            mo17537e10 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e10);
        DivShadow divShadow3 = divBorder.f34792d;
        Disposable mo17537e11 = (divShadow3 == null || (expression10 = divShadow3.f38782c) == null) ? null : expression10.mo17537e(expressionResolver, function1);
        if (mo17537e11 == null) {
            int i12 = Disposable.f30873B1;
            mo17537e11 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e11);
        DivShadow divShadow4 = divBorder.f34792d;
        Disposable mo17537e12 = (divShadow4 == null || (divPoint = divShadow4.f38783d) == null || (divDimension = divPoint.f38066a) == null || (expression11 = divDimension.f35521a) == null) ? null : expression11.mo17537e(expressionResolver, function1);
        if (mo17537e12 == null) {
            int i13 = Disposable.f30873B1;
            mo17537e12 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e12);
        DivShadow divShadow5 = divBorder.f34792d;
        Disposable mo17537e13 = (divShadow5 == null || (divPoint2 = divShadow5.f38783d) == null || (divDimension2 = divPoint2.f38066a) == null || (expression12 = divDimension2.f35522b) == null) ? null : expression12.mo17537e(expressionResolver, function1);
        if (mo17537e13 == null) {
            int i14 = Disposable.f30873B1;
            mo17537e13 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e13);
        DivShadow divShadow6 = divBorder.f34792d;
        Disposable mo17537e14 = (divShadow6 == null || (divPoint3 = divShadow6.f38783d) == null || (divDimension3 = divPoint3.f38067b) == null || (expression13 = divDimension3.f35521a) == null) ? null : expression13.mo17537e(expressionResolver, function1);
        if (mo17537e14 == null) {
            int i15 = Disposable.f30873B1;
            mo17537e14 = C2814a.f31000b;
        }
        C6855a.m34405a(this, mo17537e14);
        DivShadow divShadow7 = divBorder.f34792d;
        if (divShadow7 != null && (divPoint4 = divShadow7.f38783d) != null && (divDimension4 = divPoint4.f38067b) != null && (expression14 = divDimension4.f35522b) != null) {
            disposable = expression14.mo17537e(expressionResolver, function1);
        }
        if (disposable == null) {
            int i16 = Disposable.f30873B1;
            disposable = C2814a.f31000b;
        }
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
    }
}
