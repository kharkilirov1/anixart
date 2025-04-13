package com.yandex.mobile.ads.nativeads.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.C5243iq;
import com.yandex.mobile.ads.impl.C5456mr;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.oy0;
import com.yandex.mobile.ads.impl.xz0;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u0010B+\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/mobile/ads/nativeads/view/pager/MultiBannerControlsContainer;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "listener", "", "setOnClickLeftButtonListener", "setOnClickRightButtonListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mobileads_externalRelease"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class MultiBannerControlsContainer extends FrameLayout {

    /* renamed from: a */
    @NotNull
    private final C5243iq f57962a;

    /* renamed from: b */
    @NotNull
    private final oy0 f57963b;

    /* renamed from: c */
    @NotNull
    private final Lazy f57964c;

    /* renamed from: d */
    @NotNull
    private final C5456mr f57965d;

    /* renamed from: e */
    private boolean f57966e;

    /* renamed from: com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer$a */
    public static final class C6261a extends Lambda implements Function0<Boolean> {
        public C6261a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            cz0 m29824a = xz0.m29823b().m29824a(MultiBannerControlsContainer.this.getContext());
            return Boolean.valueOf((m29824a == null || m29824a.m23578Q()) ? false : true);
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer$b */
    public static final class C6262b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        public final /* synthetic */ ViewPager2 f57968a;

        /* renamed from: b */
        public final /* synthetic */ MultiBannerControlsContainer f57969b;

        public C6262b(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
            this.f57968a = viewPager2;
            this.f57969b = multiBannerControlsContainer;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i2) {
            RecyclerView.Adapter adapter = this.f57968a.getAdapter();
            this.f57969b.m30744a(i2, adapter != null ? adapter.getItemCount() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context) {
        super(context);
        Intrinsics.m32179h(context, "context");
        this.f57962a = new C5243iq();
        this.f57963b = new oy0();
        this.f57964c = LazyKt.m31881b(new C6261a());
        this.f57965d = new C5456mr();
        this.f57966e = true;
    }

    public final void setOnClickLeftButtonListener(@NotNull View.OnClickListener listener) {
        Intrinsics.m32179h(listener, "listener");
        oy0 oy0Var = this.f57963b;
        View findViewById = findViewById(C4632R.id.left_scroll_control_button);
        Objects.requireNonNull(oy0Var);
        ImageView imageView = (ImageView) oy0.m27130a(ImageView.class, findViewById);
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setOnClickRightButtonListener(@NotNull View.OnClickListener listener) {
        Intrinsics.m32179h(listener, "listener");
        oy0 oy0Var = this.f57963b;
        View findViewById = findViewById(C4632R.id.right_scroll_control_button);
        Objects.requireNonNull(oy0Var);
        ImageView imageView = (ImageView) oy0.m27130a(ImageView.class, findViewById);
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    /* renamed from: a */
    public final void m30748a(@NotNull ViewPager2 viewPager) {
        Intrinsics.m32179h(viewPager, "viewPager");
        viewPager.m4389c(new C6262b(viewPager, this));
        viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.mobile.ads.nativeads.view.pager.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                MultiBannerControlsContainer.m30746a(MultiBannerControlsContainer.this, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30746a(MultiBannerControlsContainer this$0, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.m32179h(this$0, "this$0");
        if (view instanceof ViewPager2) {
            boolean z = this$0.f57966e;
            boolean m26758a = this$0.f57965d.m26758a(view, i2, i3, i4, i5);
            this$0.f57966e = m26758a;
            if (m26758a != z) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                this$0.m30744a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m32179h(context, "context");
        this.f57962a = new C5243iq();
        this.f57963b = new oy0();
        this.f57964c = LazyKt.m31881b(new C6261a());
        this.f57965d = new C5456mr();
        this.f57966e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m30744a(int i2, int i3) {
        oy0 oy0Var = this.f57963b;
        int i4 = C4632R.id.left_scroll_control_button;
        View findViewById = findViewById(i4);
        Objects.requireNonNull(oy0Var);
        ImageView imageView = (ImageView) oy0.m27130a(ImageView.class, findViewById);
        oy0 oy0Var2 = this.f57963b;
        int i5 = C4632R.id.right_scroll_control_button;
        View findViewById2 = findViewById(i5);
        Objects.requireNonNull(oy0Var2);
        ImageView imageView2 = (ImageView) oy0.m27130a(ImageView.class, findViewById2);
        oy0 oy0Var3 = this.f57963b;
        int i6 = C4632R.id.dot_indicator;
        View findViewById3 = findViewById(i6);
        Objects.requireNonNull(oy0Var3);
        ImageView imageView3 = (ImageView) oy0.m27130a(ImageView.class, findViewById3);
        if (!this.f57966e) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        oy0 oy0Var4 = this.f57963b;
        View findViewById4 = findViewById(i6);
        Objects.requireNonNull(oy0Var4);
        ImageView imageView4 = (ImageView) oy0.m27130a(ImageView.class, findViewById4);
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            C5243iq c5243iq = this.f57962a;
            Context context = getContext();
            Intrinsics.m32178g(context, "context");
            imageView4.setImageDrawable(c5243iq.m25587a(context, i2, i3));
        }
        oy0 oy0Var5 = this.f57963b;
        View findViewById5 = findViewById(i4);
        Objects.requireNonNull(oy0Var5);
        ImageView imageView5 = (ImageView) oy0.m27130a(ImageView.class, findViewById5);
        oy0 oy0Var6 = this.f57963b;
        View findViewById6 = findViewById(i5);
        Objects.requireNonNull(oy0Var6);
        ImageView imageView6 = (ImageView) oy0.m27130a(ImageView.class, findViewById6);
        if (!((Boolean) this.f57964c.getValue()).booleanValue() || imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i2 == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i2 == i3 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.m32179h(context, "context");
        this.f57962a = new C5243iq();
        this.f57963b = new oy0();
        this.f57964c = LazyKt.m31881b(new C6261a());
        this.f57965d = new C5456mr();
        this.f57966e = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @RequiresApi
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        Intrinsics.m32179h(context, "context");
        this.f57962a = new C5243iq();
        this.f57963b = new oy0();
        this.f57964c = LazyKt.m31881b(new C6261a());
        this.f57965d = new C5456mr();
        this.f57966e = true;
    }
}
