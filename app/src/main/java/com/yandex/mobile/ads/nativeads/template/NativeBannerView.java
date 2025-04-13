package com.yandex.mobile.ads.nativeads.template;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.C4988du;
import com.yandex.mobile.ads.impl.C5172ha;
import com.yandex.mobile.ads.impl.C5200hu;
import com.yandex.mobile.ads.impl.C5551ou;
import com.yandex.mobile.ads.impl.C6084yo;
import com.yandex.mobile.ads.impl.n11;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.tg1;
import com.yandex.mobile.ads.impl.yt0;
import com.yandex.mobile.ads.nativeads.AbstractC6221l0;
import com.yandex.mobile.ads.nativeads.AbstractC6224n;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import com.yandex.mobile.ads.nativeads.template.AbstractC6242a;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import java.util.Arrays;
import java.util.Objects;

@MainThread
/* loaded from: classes3.dex */
public final class NativeBannerView extends AbstractC6224n<AbstractC6221l0> {

    /* renamed from: A */
    private LinearLayout f57812A;

    /* renamed from: B */
    private MediaView f57813B;

    /* renamed from: C */
    private LinearLayout f57814C;

    /* renamed from: D */
    private NativeAdType f57815D;

    /* renamed from: E */
    private NativeAdAssets f57816E;

    /* renamed from: F */
    private C6254e f57817F;

    /* renamed from: G */
    private C6253d f57818G;

    /* renamed from: H */
    private NativeAd f57819H;

    /* renamed from: I */
    private C6251b f57820I;

    /* renamed from: J */
    private final NativeAdImageLoadingListener f57821J;

    /* renamed from: b */
    @NonNull
    private final C6084yo f57822b;

    /* renamed from: c */
    private final int f57823c;

    /* renamed from: d */
    private final int f57824d;

    /* renamed from: e */
    private final int f57825e;

    /* renamed from: f */
    private NativeTemplateAppearance f57826f;

    /* renamed from: g */
    private TextView f57827g;

    /* renamed from: h */
    private TextView f57828h;

    /* renamed from: i */
    private Button f57829i;

    /* renamed from: j */
    private TextView f57830j;

    /* renamed from: k */
    @NonNull
    private ImageView f57831k;

    /* renamed from: l */
    private ImageView f57832l;

    /* renamed from: m */
    private C6255f f57833m;

    /* renamed from: n */
    private TextView f57834n;

    /* renamed from: o */
    private TextView f57835o;

    /* renamed from: p */
    private ImageView f57836p;

    /* renamed from: q */
    private yt0 f57837q;

    /* renamed from: r */
    private TextView f57838r;

    /* renamed from: s */
    private ImageView f57839s;

    /* renamed from: t */
    private ImageView f57840t;

    /* renamed from: u */
    private LinearLayout f57841u;

    /* renamed from: v */
    @NonNull
    private FrameLayout f57842v;

    /* renamed from: w */
    @NonNull
    private LinearLayout f57843w;

    /* renamed from: x */
    private LinearLayout f57844x;

    /* renamed from: y */
    private LinearLayout f57845y;

    /* renamed from: z */
    private ImageView f57846z;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.NativeBannerView$a */
    public class C6239a implements NativeAdImageLoadingListener {
        public C6239a() {
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener
        public final void onFinishLoadingImages() {
            if (NativeBannerView.this.f57819H != null) {
                NativeBannerView.this.f57819H.removeImageLoadingListener(this);
            }
            NativeBannerView.this.f57820I.m30721a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.NativeBannerView$b */
    public static /* synthetic */ class C6240b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57848a;

        static {
            int[] iArr = new int[SizeConstraint.SizeConstraintType.values().length];
            f57848a = iArr;
            try {
                iArr[SizeConstraint.SizeConstraintType.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57848a[SizeConstraint.SizeConstraintType.FIXED_RATIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57848a[SizeConstraint.SizeConstraintType.PREFERRED_RATIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NativeBannerView(@NonNull Context context) {
        super(context);
        this.f57823c = tg1.m28652a(getContext(), 4.0f);
        this.f57824d = tg1.m28652a(getContext(), 8.0f);
        this.f57825e = tg1.m28652a(getContext(), 12.0f);
        this.f57821J = new C6239a();
        this.f57822b = new C6084yo();
        m30659p();
    }

    /* renamed from: p */
    private void m30659p() {
        this.f57826f = new NativeTemplateAppearance.Builder().build();
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f57840t = imageView;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f57843w = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f57843w.setGravity(17);
        this.f57843w.setWeightSum(4.0f);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setGravity(17);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        C6255f c6255f = new C6255f(getContext());
        c6255f.setEllipsize(TextUtils.TruncateAt.END);
        c6255f.setMaxLines(1);
        c6255f.setGravity(17);
        c6255f.setPadding(0, 0, 0, tg1.m28652a(getContext(), 4.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c6255f.setLayoutParams(layoutParams);
        this.f57833m = c6255f;
        linearLayout3.addView(c6255f);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setGravity(8388611);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.rightMargin = this.f57823c;
        textView.setLayoutParams(layoutParams2);
        this.f57827g = textView;
        linearLayout4.addView(textView);
        this.f57843w.addView(linearLayout4);
        this.f57843w.addView(linearLayout3);
        this.f57843w.addView(view);
        LinearLayout linearLayout5 = this.f57843w;
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        this.f57844x = linearLayout6;
        linearLayout6.setOrientation(0);
        this.f57844x.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = this.f57823c;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams3);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f57836p = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setAdjustViewBounds(true);
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f57832l = imageView3;
        ImageView imageView4 = new ImageView(getContext());
        imageView4.setAdjustViewBounds(true);
        imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f57839s = imageView4;
        frameLayout.addView(this.f57836p);
        frameLayout.addView(this.f57832l);
        frameLayout.addView(this.f57839s);
        LinearLayout linearLayout7 = new LinearLayout(getContext());
        linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout7.setOrientation(1);
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f57834n = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setMaxLines(3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f57828h = textView3;
        TextView textView4 = new TextView(getContext());
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setMaxLines(1);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f57830j = textView4;
        linearLayout7.addView(this.f57834n);
        linearLayout7.addView(this.f57828h);
        linearLayout7.addView(this.f57830j);
        LinearLayout linearLayout8 = new LinearLayout(getContext());
        this.f57845y = linearLayout8;
        linearLayout8.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f57824d;
        this.f57845y.setLayoutParams(layoutParams4);
        LinearLayout linearLayout9 = new LinearLayout(getContext());
        linearLayout9.setOrientation(1);
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        yt0 yt0Var = new yt0(getContext(), null, R.attr.ratingBarStyleSmall);
        yt0Var.setNumStars(5);
        yt0Var.setStepSize(0.5f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.rightMargin = this.f57824d;
        yt0Var.setLayoutParams(layoutParams5);
        this.f57837q = yt0Var;
        TextView textView5 = new TextView(getContext());
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        textView5.setMaxLines(1);
        textView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f57838r = textView5;
        linearLayout9.addView(this.f57837q);
        linearLayout9.addView(this.f57838r);
        LinearLayout linearLayout10 = new LinearLayout(getContext());
        linearLayout10.setOrientation(0);
        linearLayout10.setGravity(5);
        linearLayout10.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext(), null, R.attr.borderlessButtonStyle);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setMaxLines(1);
        button.setTransformationMethod(null);
        int m28652a = tg1.m28652a(getContext(), 26.0f);
        button.setMinimumHeight(m28652a);
        button.setMinHeight(m28652a);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f57829i = button;
        linearLayout10.addView(button);
        this.f57845y.addView(linearLayout9);
        this.f57845y.addView(linearLayout10);
        linearLayout7.addView(this.f57845y);
        this.f57844x.addView(frameLayout);
        this.f57844x.addView(linearLayout7);
        LinearLayout linearLayout11 = this.f57844x;
        LinearLayout linearLayout12 = new LinearLayout(getContext());
        linearLayout12.setOrientation(0);
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f57812A = linearLayout12;
        ImageView imageView5 = new ImageView(getContext());
        imageView5.setAdjustViewBounds(true);
        imageView5.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView5.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f57846z = imageView5;
        this.f57812A.addView(imageView5);
        LinearLayout linearLayout13 = this.f57812A;
        LinearLayout linearLayout14 = new LinearLayout(getContext());
        linearLayout14.setOrientation(0);
        linearLayout14.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f57814C = linearLayout14;
        MediaView mediaView = new MediaView(getContext());
        mediaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f57813B = mediaView;
        this.f57814C.addView(mediaView);
        LinearLayout linearLayout15 = this.f57814C;
        TextView textView6 = new TextView(getContext());
        textView6.setEllipsize(TextUtils.TruncateAt.END);
        this.f57835o = textView6;
        linearLayout.addView(linearLayout5);
        linearLayout.addView(linearLayout11);
        linearLayout.addView(linearLayout13);
        linearLayout.addView(linearLayout15);
        linearLayout.addView(textView6);
        this.f57841u = linearLayout;
        int m28652a2 = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getRight()) - this.f57824d;
        C5551ou c5551ou = new C5551ou(getContext());
        this.f57842v = new C5200hu(getContext()).m25372a();
        ImageView m27111a = c5551ou.m27111a(m28652a2, this.f57823c);
        this.f57831k = m27111a;
        this.f57842v.addView(m27111a);
        this.f57842v.setVisibility(8);
        addView(this.f57840t, new ViewGroup.LayoutParams(-1, -2));
        addView(this.f57841u, new ViewGroup.LayoutParams(-1, -1));
        addView(this.f57842v);
        this.f57840t.setVisibility(8);
        this.f57841u.setVisibility(8);
        this.f57820I = new C6251b(this.f57839s, this.f57836p, this.f57832l, this.f57846z, this.f57840t);
        m30657a();
    }

    public void applyAppearance(@NonNull NativeTemplateAppearance nativeTemplateAppearance) {
        if (nativeTemplateAppearance == null || nativeTemplateAppearance.equals(this.f57826f)) {
            return;
        }
        this.f57826f = nativeTemplateAppearance;
        m30657a();
    }

    /* renamed from: c */
    public final TextView m30661c() {
        return this.f57828h;
    }

    /* renamed from: d */
    public final Button m30662d() {
        return this.f57829i;
    }

    /* renamed from: e */
    public final TextView m30663e() {
        return this.f57830j;
    }

    /* renamed from: f */
    public final ImageView m30664f() {
        return this.f57839s;
    }

    @NonNull
    /* renamed from: g */
    public final ImageView m30665g() {
        return this.f57831k;
    }

    /* renamed from: h */
    public final ImageView m30666h() {
        return this.f57836p;
    }

    /* renamed from: i */
    public final ImageView m30667i() {
        NativeAdImage image;
        ImageView imageView = this.f57832l;
        if (this.f57818G == null || (image = this.f57816E.getImage()) == null) {
            return imageView;
        }
        Objects.requireNonNull(this.f57818G);
        if ("fill".equals(image.m30460a())) {
            return this.f57840t;
        }
        Objects.requireNonNull(this.f57818G);
        return C6253d.m30723a(image) ? this.f57846z : imageView;
    }

    /* renamed from: j */
    public final MediaView m30668j() {
        return this.f57813B;
    }

    /* renamed from: k */
    public final yt0 m30669k() {
        return this.f57837q;
    }

    /* renamed from: l */
    public final TextView m30670l() {
        return this.f57838r;
    }

    /* renamed from: m */
    public final TextView m30671m() {
        return this.f57833m;
    }

    /* renamed from: n */
    public final TextView m30672n() {
        return this.f57834n;
    }

    /* renamed from: o */
    public final TextView m30673o() {
        return this.f57835o;
    }

    @Override // com.yandex.mobile.ads.nativeads.AbstractC6224n, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NativeAd nativeAd = this.f57819H;
        if (nativeAd != null) {
            nativeAd.addImageLoadingListener(this.f57821J);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.AbstractC6224n, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NativeAd nativeAd = this.f57819H;
        if (nativeAd != null) {
            nativeAd.removeImageLoadingListener(this.f57821J);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.f57818G != null) {
            int size = View.MeasureSpec.getSize(i2);
            float borderWidth = this.f57826f.getBannerAppearance().getBorderWidth();
            C6084yo c6084yo = this.f57822b;
            Context context = getContext();
            Objects.requireNonNull(c6084yo);
            int m29954a = size - (C6084yo.m29954a(context, borderWidth) * 2);
            if (m29954a < 0) {
                m29954a = 0;
            }
            C6253d c6253d = this.f57818G;
            Context context2 = getContext();
            int m28652a = tg1.m28652a(context2, this.f57826f.getBannerAppearance().getContentPadding().getLeft());
            int m26789a = n11.m26789a(context2, 1, this.f57826f.getBannerAppearance().getContentPadding().getRight());
            if (c6253d.m30725b() || c6253d.m30726c() || c6253d.m30729f()) {
                int round = Math.round((m29954a - m28652a) - m26789a);
                int round2 = Math.round(TypedValue.applyDimension(1, m28652a, context2.getResources().getDisplayMetrics())) + tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getImageMargins().getLeft());
                int m28652a2 = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getImageMargins().getRight());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
                if (c6253d.m30725b()) {
                    NativeAdImage favicon = this.f57816E.getFavicon();
                    int width = favicon.getWidth();
                    int height = favicon.getHeight();
                    SizeConstraint widthConstraint = this.f57826f.getFaviconAppearance().getWidthConstraint();
                    int i6 = C6240b.f57848a[widthConstraint.getSizeConstraintType().ordinal()];
                    AbstractC6242a.d mo30676a = (i6 != 1 ? i6 != 2 ? i6 != 3 ? new AbstractC6242a.c(widthConstraint.getValue()) : new AbstractC6242a.c(widthConstraint.getValue()) : new AbstractC6242a.b(widthConstraint.getValue()) : new AbstractC6242a.a(widthConstraint.getValue())).mo30676a(getContext(), round, width, height);
                    int m28652a3 = tg1.m28652a(getContext(), 5.0f);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(mo30676a.m30678b(), mo30676a.m30677a());
                    layoutParams2.leftMargin = round2;
                    layoutParams2.rightMargin = m28652a3;
                    layoutParams = layoutParams2;
                }
                this.f57839s.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                if (c6253d.m30726c()) {
                    NativeAdImage icon = this.f57816E.getIcon();
                    int width2 = icon.getWidth();
                    int height2 = icon.getHeight();
                    SizeConstraint widthConstraint2 = this.f57826f.getImageAppearance().getWidthConstraint();
                    int i7 = C6240b.f57848a[widthConstraint2.getSizeConstraintType().ordinal()];
                    AbstractC6242a.d mo30676a2 = (i7 != 1 ? i7 != 2 ? i7 != 3 ? new AbstractC6242a.c(widthConstraint2.getValue()) : new AbstractC6242a.c(widthConstraint2.getValue()) : new AbstractC6242a.b(widthConstraint2.getValue()) : new AbstractC6242a.a(widthConstraint2.getValue())).mo30676a(getContext(), round, width2, height2);
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(mo30676a2.m30678b(), mo30676a2.m30677a());
                    layoutParams4.leftMargin = round2;
                    layoutParams4.rightMargin = m28652a2;
                    layoutParams3 = layoutParams4;
                }
                this.f57836p.setLayoutParams(layoutParams3);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                if (c6253d.m30729f()) {
                    NativeAdImage image = this.f57816E.getImage();
                    int width3 = image.getWidth();
                    int height3 = image.getHeight();
                    SizeConstraint widthConstraint3 = this.f57826f.getImageAppearance().getWidthConstraint();
                    int i8 = C6240b.f57848a[widthConstraint3.getSizeConstraintType().ordinal()];
                    AbstractC6242a.d mo30676a3 = (i8 != 1 ? i8 != 2 ? i8 != 3 ? new AbstractC6242a.c(widthConstraint3.getValue()) : new AbstractC6242a.c(widthConstraint3.getValue()) : new AbstractC6242a.b(widthConstraint3.getValue()) : new AbstractC6242a.a(widthConstraint3.getValue())).mo30676a(getContext(), round, width3, height3);
                    layoutParams5 = new FrameLayout.LayoutParams(mo30676a3.m30678b(), mo30676a3.m30677a());
                    layoutParams5.leftMargin = round2;
                    layoutParams5.rightMargin = m28652a2;
                }
                this.f57832l.setLayoutParams(layoutParams5);
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.f57844x.getLayoutParams();
                layoutParams6.leftMargin = 0;
                this.f57844x.setLayoutParams(layoutParams6);
            } else {
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(0, 0);
                this.f57839s.setLayoutParams(layoutParams7);
                this.f57836p.setLayoutParams(layoutParams7);
                this.f57832l.setLayoutParams(layoutParams7);
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) this.f57844x.getLayoutParams();
                layoutParams8.leftMargin = m28652a;
                this.f57844x.setLayoutParams(layoutParams8);
            }
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, 0);
            if (c6253d.m30727d()) {
                NativeAdImage image2 = this.f57816E.getImage();
                int width4 = image2.getWidth();
                int height4 = image2.getHeight();
                float width5 = image2.getWidth();
                float height5 = image2.getHeight();
                if (height5 != 0.0f && width5 / height5 < 1.0f) {
                    i5 = Math.round((m29954a * 3) / 4);
                    i4 = Math.round((i5 / height4) * width4);
                } else {
                    if (width4 != 0) {
                        height4 = Math.round(height4 * (m29954a / width4));
                    }
                    i4 = m29954a;
                    i5 = height4;
                }
                float width6 = image2.getWidth();
                float height6 = image2.getHeight();
                if (!(height6 != 0.0f && width6 / height6 > 1.5f)) {
                    i5 = Math.round(i5 * 0.8f);
                }
                layoutParams9 = new LinearLayout.LayoutParams(i4, i5);
                layoutParams9.topMargin = (this.f57817F.m30731a() || this.f57817F.m30734d()) ? this.f57823c : 0;
                layoutParams9.gravity = 1;
            }
            this.f57812A.setLayoutParams(layoutParams9);
            C6253d c6253d2 = this.f57818G;
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(0, 0);
            NativeAdMedia media = this.f57816E.getMedia();
            if (media != null && c6253d2.m30728e()) {
                layoutParams10 = new LinearLayout.LayoutParams(m29954a, new C5172ha(media.getAspectRatio()).m25096a(m29954a));
            }
            this.f57814C.setLayoutParams(layoutParams10);
            if (this.f57817F.m30735f()) {
                if (this.f57817F.m30736g()) {
                    ((ViewManager) this.f57845y.getParent()).removeView(this.f57845y);
                    LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
                    if (this.f57817F.m30733c()) {
                        layoutParams11.topMargin = this.f57825e;
                    } else {
                        layoutParams11.topMargin = this.f57823c;
                    }
                    layoutParams11.bottomMargin = this.f57824d;
                    this.f57845y.setLayoutParams(layoutParams11);
                    this.f57845y.setPadding(tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getLeft()), 0, tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getRight()), 0);
                    LinearLayout linearLayout = this.f57841u;
                    linearLayout.addView(this.f57845y, linearLayout.getChildCount() - 1);
                } else {
                    ((ViewManager) this.f57845y.getParent()).removeView(this.f57845y);
                    this.f57845y.setPadding(0, 0, 0, 0);
                    LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                    int i9 = this.f57824d;
                    layoutParams12.topMargin = i9;
                    layoutParams12.bottomMargin = i9;
                    ((ViewManager) this.f57830j.getParent()).addView(this.f57845y, layoutParams12);
                }
                this.f57829i.setLayoutParams(this.f57817F.m30732b() ? new LinearLayout.LayoutParams(-1, -2) : new LinearLayout.LayoutParams(-2, -2));
            } else {
                this.f57845y.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
            }
            int round3 = Math.round(m29954a * 0.4f);
            this.f57829i.setMinWidth(round3);
            this.f57829i.setMinimumWidth(round3);
            if (this.f57817F.m30737h()) {
                TextView textView = this.f57835o;
                if (this.f57817F.m30738i()) {
                    textView.setBackgroundColor(0);
                } else {
                    textView.setBackgroundColor(tg1.m28650a(textView.getCurrentTextColor(), 92.0f));
                }
                this.f57835o.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
        }
        super.onMeasure(i2, i3);
    }

    @VisibleForTesting
    /* renamed from: q */
    public final void m30674q() {
        NativeAdImage image;
        int i2 = 0;
        if (this.f57818G != null && (image = this.f57816E.getImage()) != null) {
            Objects.requireNonNull(this.f57818G);
            if ("fill".equals(image.m30460a())) {
                this.f57840t.setVisibility(0);
                i2 = 8;
            }
            Objects.requireNonNull(this.f57818G);
            if (C6253d.m30723a(image)) {
                if (!this.f57817F.m30731a()) {
                    this.f57844x.setVisibility(8);
                }
                if (!this.f57817F.m30734d()) {
                    this.f57843w.setVisibility(8);
                }
            }
        }
        this.f57841u.setVisibility(i2);
    }

    public void setAd(@NonNull NativeAd nativeAd) {
        NativeAd nativeAd2 = this.f57819H;
        if (nativeAd2 != nativeAd) {
            if (nativeAd2 != null) {
                try {
                    nativeAd2.removeImageLoadingListener(this.f57821J);
                } catch (NativeAdException e2) {
                    n60.m26810c(e2.getMessage(), new Object[0]);
                    return;
                }
            }
            nativeAd.addImageLoadingListener(this.f57821J);
            this.f57815D = nativeAd.getAdType();
            NativeAdAssets adAssets = nativeAd.getAdAssets();
            this.f57816E = adAssets;
            this.f57817F = new C6254e(adAssets, this.f57815D);
            this.f57818G = new C6253d(this.f57816E, this.f57815D);
            new C4988du(getContext(), this.f57816E).m23939a(this.f57831k, this.f57842v, this.f57825e);
            ((InterfaceC6256u) nativeAd).mo30562a(this);
            m30674q();
            this.f57819H = nativeAd;
        }
    }

    /* renamed from: a */
    private void m30657a() {
        int m28652a = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getBorderWidth());
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f57826f.getBannerAppearance().getBackgroundColor());
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RectShape());
        Paint paint2 = shapeDrawable2.getPaint();
        paint2.setColor(this.f57826f.getBannerAppearance().getBorderColor());
        paint2.setStrokeWidth(m28652a * 2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        setBackground(new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2}));
        setPadding(m28652a, m28652a, m28652a, m28652a);
        int m28652a2 = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getLeft());
        int m28652a3 = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getRight());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(m28652a2, this.f57824d, m28652a3, this.f57823c);
        this.f57843w.setLayoutParams(layoutParams);
        this.f57843w.invalidate();
        int m28652a4 = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getLeft());
        int m28652a5 = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getRight());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = m28652a4;
        layoutParams2.rightMargin = m28652a5;
        layoutParams2.bottomMargin = this.f57823c;
        this.f57844x.setLayoutParams(layoutParams2);
        this.f57844x.invalidate();
        int m28652a6 = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getLeft());
        int m28652a7 = tg1.m28652a(getContext(), this.f57826f.getBannerAppearance().getContentPadding().getRight());
        TextView textView = this.f57835o;
        int i2 = this.f57823c;
        textView.setPadding(m28652a6, i2, m28652a7, i2);
        this.f57835o.invalidate();
        this.f57829i.setTextColor(this.f57826f.getCallToActionAppearance().getTextAppearance().getTextColor());
        this.f57829i.setTextSize(this.f57826f.getCallToActionAppearance().getTextAppearance().getTextSize());
        this.f57829i.setTypeface(Typeface.create(this.f57826f.getCallToActionAppearance().getTextAppearance().getFontFamilyName(), this.f57826f.getCallToActionAppearance().getTextAppearance().getFontStyle()));
        float[] fArr = new float[8];
        Arrays.fill(fArr, tg1.m28652a(getContext(), 5.0f));
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, fArr);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(roundRectShape);
        shapeDrawable3.getPaint().setColor(this.f57826f.getCallToActionAppearance().getPressedColor());
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(roundRectShape);
        shapeDrawable4.getPaint().setColor(this.f57826f.getCallToActionAppearance().getNormalColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, shapeDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable3);
        stateListDrawable.addState(new int[0], shapeDrawable4);
        int m28652a8 = tg1.m28652a(getContext(), this.f57826f.getCallToActionAppearance().getBorderWidth());
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape);
        Paint paint3 = shapeDrawable5.getPaint();
        paint3.setColor(this.f57826f.getCallToActionAppearance().getBorderColor());
        paint3.setStrokeWidth(m28652a8);
        paint3.setStyle(Paint.Style.STROKE);
        this.f57829i.setBackground(new LayerDrawable(new Drawable[]{stateListDrawable, shapeDrawable5}));
        LayerDrawable layerDrawable = (LayerDrawable) this.f57837q.getProgressDrawable();
        layerDrawable.getDrawable(2).setColorFilter(this.f57826f.getRatingAppearance().getProgressStarColor(), PorterDuff.Mode.SRC_ATOP);
        layerDrawable.getDrawable(1).setColorFilter(this.f57826f.getRatingAppearance().getBackgroundStarColor(), PorterDuff.Mode.SRC_ATOP);
        layerDrawable.getDrawable(0).setColorFilter(this.f57826f.getRatingAppearance().getBackgroundStarColor(), PorterDuff.Mode.SRC_ATOP);
        this.f57827g.setTypeface(Typeface.create(this.f57826f.getAgeAppearance().getFontFamilyName(), this.f57826f.getAgeAppearance().getFontStyle()));
        this.f57827g.setTextColor(this.f57826f.getAgeAppearance().getTextColor());
        this.f57827g.setTextSize(2, this.f57826f.getAgeAppearance().getTextSize());
        this.f57828h.setTypeface(Typeface.create(this.f57826f.getBodyAppearance().getFontFamilyName(), this.f57826f.getBodyAppearance().getFontStyle()));
        this.f57828h.setTextColor(this.f57826f.getBodyAppearance().getTextColor());
        this.f57828h.setTextSize(2, this.f57826f.getBodyAppearance().getTextSize());
        this.f57830j.setTypeface(Typeface.create(this.f57826f.getDomainAppearance().getFontFamilyName(), this.f57826f.getDomainAppearance().getFontStyle()));
        this.f57830j.setTextColor(this.f57826f.getDomainAppearance().getTextColor());
        this.f57830j.setTextSize(2, this.f57826f.getDomainAppearance().getTextSize());
        this.f57838r.setTypeface(Typeface.create(this.f57826f.getReviewCountAppearance().getFontFamilyName(), this.f57826f.getReviewCountAppearance().getFontStyle()));
        this.f57838r.setTextColor(this.f57826f.getReviewCountAppearance().getTextColor());
        this.f57838r.setTextSize(2, this.f57826f.getReviewCountAppearance().getTextSize());
        this.f57833m.setTypeface(Typeface.create(this.f57826f.getSponsoredAppearance().getFontFamilyName(), this.f57826f.getSponsoredAppearance().getFontStyle()));
        this.f57833m.setTextColor(this.f57826f.getSponsoredAppearance().getTextColor());
        this.f57833m.setTextSize(2, this.f57826f.getSponsoredAppearance().getTextSize());
        this.f57834n.setTypeface(Typeface.create(this.f57826f.getTitleAppearance().getFontFamilyName(), this.f57826f.getTitleAppearance().getFontStyle()));
        this.f57834n.setTextColor(this.f57826f.getTitleAppearance().getTextColor());
        this.f57834n.setTextSize(2, this.f57826f.getTitleAppearance().getTextSize());
        this.f57835o.setTypeface(Typeface.create(this.f57826f.getWarningAppearance().getFontFamilyName(), this.f57826f.getWarningAppearance().getFontStyle()));
        this.f57835o.setTextColor(this.f57826f.getWarningAppearance().getTextColor());
        this.f57835o.setTextSize(2, this.f57826f.getWarningAppearance().getTextSize());
        invalidate();
        requestLayout();
    }

    /* renamed from: b */
    public final TextView m30660b() {
        return this.f57827g;
    }

    public NativeBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57823c = tg1.m28652a(getContext(), 4.0f);
        this.f57824d = tg1.m28652a(getContext(), 8.0f);
        this.f57825e = tg1.m28652a(getContext(), 12.0f);
        this.f57821J = new C6239a();
        this.f57822b = new C6084yo();
        m30659p();
    }

    public NativeBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f57823c = tg1.m28652a(getContext(), 4.0f);
        this.f57824d = tg1.m28652a(getContext(), 8.0f);
        this.f57825e = tg1.m28652a(getContext(), 12.0f);
        this.f57821J = new C6239a();
        this.f57822b = new C6084yo();
        m30659p();
    }
}
