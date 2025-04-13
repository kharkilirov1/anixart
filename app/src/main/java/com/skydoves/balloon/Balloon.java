package com.skydoves.balloon;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonPersistence;
import com.skydoves.balloon.IconForm;
import com.skydoves.balloon.TextForm;
import com.skydoves.balloon.annotations.InterfaceC2452Dp;
import com.skydoves.balloon.annotations.InterfaceC2453Sp;
import com.skydoves.balloon.databinding.LayoutBalloonBinding;
import com.skydoves.balloon.extensions.ContextExtensionKt;
import com.skydoves.balloon.extensions.ImageViewExtensionKt;
import com.skydoves.balloon.extensions.TextViewExtensionKt;
import com.skydoves.balloon.extensions.ViewExtensionKt;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Balloon.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, m31884d2 = {"Lcom/skydoves/balloon/Balloon;", "Landroidx/lifecycle/LifecycleObserver;", "", "onPause", "onDestroy", "Builder", "Factory", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Balloon implements LifecycleObserver {

    /* renamed from: b */
    public final LayoutBalloonBinding f24591b;

    /* renamed from: c */
    public final PopupWindow f24592c;

    /* renamed from: d */
    public boolean f24593d;

    /* renamed from: e */
    public boolean f24594e;

    /* renamed from: f */
    public int f24595f;

    /* renamed from: g */
    public final BalloonPersistence f24596g;

    /* renamed from: h */
    public final Context f24597h;

    /* renamed from: i */
    public final Builder f24598i;

    /* compiled from: Balloon.kt */
    @BalloonDsl
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/skydoves/balloon/Balloon$Builder;", "", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Builder {

        /* renamed from: A */
        @JvmField
        public float f24664A;

        /* renamed from: E */
        @JvmField
        @Nullable
        public LifecycleOwner f24668E;

        /* renamed from: K */
        public final Context f24674K;

        /* renamed from: c */
        @Px
        @JvmField
        public int f24677c;

        /* renamed from: d */
        @Px
        @JvmField
        public int f24678d;

        /* renamed from: e */
        @Px
        @JvmField
        public int f24679e;

        /* renamed from: f */
        @Px
        @JvmField
        public int f24680f;

        /* renamed from: g */
        @Px
        @JvmField
        public int f24681g;

        /* renamed from: h */
        @Px
        @JvmField
        public int f24682h;

        /* renamed from: k */
        @Px
        @JvmField
        public int f24685k;

        /* renamed from: q */
        @Px
        @JvmField
        public float f24691q;

        /* renamed from: w */
        @Px
        @JvmField
        public int f24697w;

        /* renamed from: x */
        @Px
        @JvmField
        public int f24698x;

        /* renamed from: a */
        @Px
        @JvmField
        public int f24675a = Integer.MIN_VALUE;

        /* renamed from: b */
        @Px
        @JvmField
        public int f24676b = Integer.MIN_VALUE;

        /* renamed from: i */
        @JvmField
        public boolean f24683i = true;

        /* renamed from: j */
        @ColorInt
        @JvmField
        public int f24684j = Integer.MIN_VALUE;

        /* renamed from: l */
        @FloatRange
        @JvmField
        public float f24686l = 0.5f;

        /* renamed from: m */
        @JvmField
        @NotNull
        public ArrowConstraints f24687m = ArrowConstraints.ALIGN_BALLOON;

        /* renamed from: n */
        @JvmField
        @NotNull
        public ArrowOrientation f24688n = ArrowOrientation.BOTTOM;

        /* renamed from: o */
        @JvmField
        public float f24689o = 2.5f;

        /* renamed from: p */
        @ColorInt
        @JvmField
        public int f24690p = -16777216;

        /* renamed from: r */
        @JvmField
        @NotNull
        public CharSequence f24692r = "";

        /* renamed from: s */
        @ColorInt
        @JvmField
        public int f24693s = -1;

        /* renamed from: t */
        @JvmField
        @InterfaceC2453Sp
        public float f24694t = 12.0f;

        /* renamed from: u */
        @JvmField
        public int f24695u = 17;

        /* renamed from: v */
        @JvmField
        @NotNull
        public IconGravity f24696v = IconGravity.LEFT;

        /* renamed from: y */
        @ColorInt
        @JvmField
        public int f24699y = -1;

        /* renamed from: z */
        @FloatRange
        @JvmField
        public float f24700z = 1.0f;

        /* renamed from: B */
        @LayoutRes
        @JvmField
        public int f24665B = Integer.MIN_VALUE;

        /* renamed from: C */
        @JvmField
        public boolean f24666C = true;

        /* renamed from: D */
        @JvmField
        public long f24667D = -1;

        /* renamed from: F */
        @StyleRes
        @JvmField
        public int f24669F = Integer.MIN_VALUE;

        /* renamed from: G */
        @JvmField
        @NotNull
        public BalloonAnimation f24670G = BalloonAnimation.FADE;

        /* renamed from: H */
        @JvmField
        public long f24671H = 500;

        /* renamed from: I */
        @JvmField
        public boolean f24672I = true;

        /* renamed from: J */
        @JvmField
        public boolean f24673J = true;

        public Builder(@NotNull Context context) {
            this.f24674K = context;
            this.f24685k = ContextExtensionKt.m13875c(context, 12);
            this.f24691q = ContextExtensionKt.m13875c(context, 5);
            this.f24697w = ContextExtensionKt.m13875c(context, 28);
            this.f24698x = ContextExtensionKt.m13875c(context, 8);
            this.f24664A = ContextExtensionKt.m13874b(context, 2.0f);
        }

        @NotNull
        /* renamed from: a */
        public final Balloon m13858a() {
            return new Balloon(this.f24674K, this);
        }

        @NotNull
        /* renamed from: b */
        public final Builder m13859b(@NotNull ArrowConstraints arrowConstraints) {
            this.f24687m = arrowConstraints;
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final Builder m13860c(@NotNull ArrowOrientation arrowOrientation) {
            this.f24688n = arrowOrientation;
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final Builder m13861d(@InterfaceC2452Dp int i2) {
            this.f24685k = ContextExtensionKt.m13875c(this.f24674K, i2);
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final Builder m13862e(@ColorRes int i2) {
            Context contextColor = this.f24674K;
            Intrinsics.m32179h(contextColor, "$this$contextColor");
            this.f24690p = ContextCompat.m1670c(contextColor, i2);
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final Builder m13863f(@NotNull BalloonAnimation balloonAnimation) {
            this.f24670G = balloonAnimation;
            if (balloonAnimation == BalloonAnimation.CIRCULAR) {
                this.f24672I = false;
            }
            return this;
        }

        @NotNull
        /* renamed from: g */
        public final Builder m13864g(@InterfaceC2452Dp float f2) {
            this.f24691q = ContextExtensionKt.m13874b(this.f24674K, f2);
            return this;
        }

        @TargetApi
        @NotNull
        /* renamed from: h */
        public final Builder m13865h(@InterfaceC2452Dp int i2) {
            this.f24664A = ContextExtensionKt.m13875c(this.f24674K, i2);
            return this;
        }

        @NotNull
        /* renamed from: i */
        public final Builder m13866i(@InterfaceC2452Dp int i2) {
            this.f24682h = ContextExtensionKt.m13875c(this.f24674K, i2);
            return this;
        }

        @NotNull
        /* renamed from: j */
        public final Builder m13867j(@InterfaceC2452Dp int i2) {
            this.f24681g = ContextExtensionKt.m13875c(this.f24674K, i2);
            return this;
        }

        @NotNull
        /* renamed from: k */
        public final Builder m13868k(@InterfaceC2452Dp int i2) {
            this.f24677c = ContextExtensionKt.m13875c(this.f24674K, i2);
            this.f24678d = ContextExtensionKt.m13875c(this.f24674K, i2);
            this.f24679e = ContextExtensionKt.m13875c(this.f24674K, i2);
            this.f24680f = ContextExtensionKt.m13875c(this.f24674K, i2);
            return this;
        }

        @NotNull
        /* renamed from: l */
        public final Builder m13869l(@ColorRes int i2) {
            Context contextColor = this.f24674K;
            Intrinsics.m32179h(contextColor, "$this$contextColor");
            this.f24693s = ContextCompat.m1670c(contextColor, i2);
            return this;
        }

        @NotNull
        /* renamed from: m */
        public final Builder m13870m(@StringRes int i2) {
            String string = this.f24674K.getString(i2);
            Intrinsics.m32178g(string, "context.getString(value)");
            this.f24692r = string;
            return this;
        }
    }

    /* compiled from: Balloon.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/skydoves/balloon/Balloon$Factory;", "", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class Factory {
        @NotNull
        /* renamed from: a */
        public abstract Balloon mo13871a(@NotNull Context context, @Nullable LifecycleOwner lifecycleOwner);
    }

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ArrowOrientation.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            int[] iArr2 = new int[ArrowOrientation.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
            int[] iArr3 = new int[ArrowConstraints.values().length];
            iArr3[0] = 1;
            iArr3[1] = 2;
            int[] iArr4 = new int[ArrowConstraints.values().length];
            iArr4[0] = 1;
            iArr4[1] = 2;
            int[] iArr5 = new int[ArrowOrientation.values().length];
            iArr5[2] = 1;
            iArr5[1] = 2;
            iArr5[3] = 3;
            iArr5[0] = 4;
            int[] iArr6 = new int[BalloonAnimation.values().length];
            iArr6[1] = 1;
            iArr6[3] = 2;
            iArr6[2] = 3;
            iArr6[4] = 4;
        }
    }

    public Balloon(@NotNull Context context, @NotNull Builder builder) {
        String str;
        Lifecycle lifecycle;
        Intrinsics.m32179h(context, "context");
        this.f24597h = context;
        this.f24598i = builder;
        View inflate = LayoutInflater.from(context).inflate(C2507R.layout.layout_balloon, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C2507R.id.balloon);
        if (frameLayout != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C2507R.id.balloon_arrow);
            if (appCompatImageView != null) {
                CardView cardView = (CardView) inflate.findViewById(C2507R.id.balloon_card);
                if (cardView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.balloon_content);
                    if (relativeLayout != null) {
                        VectorTextView vectorTextView = (VectorTextView) inflate.findViewById(C2507R.id.balloon_text);
                        if (vectorTextView != null) {
                            RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(C2507R.id.balloon_wrapper);
                            if (relativeLayout2 != null) {
                                FrameLayout frameLayout2 = (FrameLayout) inflate;
                                this.f24591b = new LayoutBalloonBinding(frameLayout2, frameLayout, appCompatImageView, cardView, relativeLayout, vectorTextView, relativeLayout2);
                                this.f24595f = 1;
                                BalloonPersistence.Companion companion = BalloonPersistence.f24711c;
                                BalloonPersistence balloonPersistence = BalloonPersistence.f24709a;
                                if (balloonPersistence == null) {
                                    synchronized (companion) {
                                        balloonPersistence = BalloonPersistence.f24709a;
                                        if (balloonPersistence == null) {
                                            balloonPersistence = new BalloonPersistence();
                                            BalloonPersistence.f24709a = balloonPersistence;
                                            SharedPreferences sharedPreferences = context.getSharedPreferences("com.skydoves.balloon", 0);
                                            Intrinsics.m32178g(sharedPreferences, "context.getSharedPrefere…n\", Context.MODE_PRIVATE)");
                                            BalloonPersistence.f24710b = sharedPreferences;
                                        }
                                    }
                                }
                                this.f24596g = balloonPersistence;
                                PopupWindow popupWindow = new PopupWindow(frameLayout2, -2, -2);
                                this.f24592c = popupWindow;
                                cardView.setAlpha(builder.f24700z);
                                cardView.setCardElevation(builder.f24664A);
                                cardView.setCardBackgroundColor(builder.f24690p);
                                cardView.setRadius(builder.f24691q);
                                ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
                                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(builder.f24682h, 0, builder.f24681g, 0);
                                popupWindow.setFocusable(builder.f24672I);
                                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                popupWindow.setElevation(builder.f24664A);
                                m13853q();
                                relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.skydoves.balloon.Balloon$initializeBalloonListeners$1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Objects.requireNonNull(Balloon.this);
                                        Objects.requireNonNull(Balloon.this.f24598i);
                                    }
                                });
                                popupWindow.setOutsideTouchable(builder.f24666C);
                                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.skydoves.balloon.Balloon$initializeBalloonListeners$$inlined$with$lambda$1
                                    @Override // android.widget.PopupWindow.OnDismissListener
                                    public final void onDismiss() {
                                        Balloon.this.m13846j();
                                        Objects.requireNonNull(Balloon.this);
                                    }
                                });
                                popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: com.skydoves.balloon.Balloon$initializeBalloonListeners$$inlined$with$lambda$2
                                    @Override // android.view.View.OnTouchListener
                                    @SuppressLint
                                    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
                                        Intrinsics.m32179h(view, "view");
                                        Intrinsics.m32179h(event, "event");
                                        if (event.getAction() != 4) {
                                            return false;
                                        }
                                        Balloon balloon = Balloon.this;
                                        if (balloon.f24598i.f24666C) {
                                            balloon.m13846j();
                                        }
                                        Objects.requireNonNull(Balloon.this);
                                        return true;
                                    }
                                });
                                if (builder.f24665B != Integer.MIN_VALUE) {
                                    cardView.removeAllViews();
                                    Object systemService = context.getSystemService("layout_inflater");
                                    Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                    ((LayoutInflater) systemService).inflate(builder.f24665B, cardView);
                                } else {
                                    Context context2 = vectorTextView.getContext();
                                    Intrinsics.m32178g(context2, "context");
                                    IconForm.Builder builder2 = new IconForm.Builder(context2);
                                    builder2.f24720a = null;
                                    builder2.f24722c = builder.f24697w;
                                    builder2.f24724e = builder.f24699y;
                                    builder2.f24723d = builder.f24698x;
                                    IconGravity value = builder.f24696v;
                                    Intrinsics.m32179h(value, "value");
                                    builder2.f24721b = value;
                                    ImageViewExtensionKt.m13878a(vectorTextView, new IconForm(builder2));
                                    m13854r();
                                }
                                LifecycleOwner lifecycleOwner = builder.f24668E;
                                if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                                    return;
                                }
                                lifecycle.mo3187a(this);
                                return;
                            }
                            str = "balloonWrapper";
                        } else {
                            str = "balloonText";
                        }
                    } else {
                        str = "balloonContent";
                    }
                } else {
                    str = "balloonCard";
                }
            } else {
                str = "balloonArrow";
            }
        } else {
            str = "balloon";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: h */
    public static final void m13844h(Balloon balloon) {
        Builder builder = balloon.f24598i;
        int i2 = builder.f24669F;
        if (i2 != Integer.MIN_VALUE) {
            balloon.f24592c.setAnimationStyle(i2);
            return;
        }
        int ordinal = builder.f24670G.ordinal();
        if (ordinal == 1) {
            balloon.f24592c.setAnimationStyle(C2507R.style.Elastic);
            return;
        }
        if (ordinal == 2) {
            balloon.f24592c.setAnimationStyle(C2507R.style.Fade);
            return;
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                balloon.f24592c.setAnimationStyle(C2507R.style.Normal);
                return;
            } else {
                balloon.f24592c.setAnimationStyle(C2507R.style.Overshoot);
                return;
            }
        }
        View contentView = balloon.f24592c.getContentView();
        Intrinsics.m32178g(contentView, "bodyWindow.contentView");
        ViewExtensionKt.m13880a(contentView, balloon.f24598i.f24671H);
        balloon.f24592c.setAnimationStyle(C2507R.style.NormalDispose);
    }

    /* renamed from: i */
    public static final void m13845i(final Balloon balloon, final View view) {
        final AppCompatImageView visible = balloon.f24591b.f24743b;
        Intrinsics.m32179h(visible, "$this$visible");
        visible.setVisibility(8);
        int i2 = balloon.f24598i.f24685k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        int ordinal = balloon.f24598i.f24688n.ordinal();
        if (ordinal == 0) {
            RelativeLayout relativeLayout = balloon.f24591b.f24745d;
            Intrinsics.m32178g(relativeLayout, "binding.balloonContent");
            layoutParams.addRule(8, relativeLayout.getId());
            visible.setRotation(180.0f);
        } else if (ordinal == 1) {
            RelativeLayout relativeLayout2 = balloon.f24591b.f24745d;
            Intrinsics.m32178g(relativeLayout2, "binding.balloonContent");
            layoutParams.addRule(6, relativeLayout2.getId());
            visible.setRotation(0.0f);
        } else if (ordinal == 2) {
            RelativeLayout relativeLayout3 = balloon.f24591b.f24745d;
            Intrinsics.m32178g(relativeLayout3, "binding.balloonContent");
            layoutParams.addRule(5, relativeLayout3.getId());
            visible.setRotation(-90.0f);
        } else if (ordinal == 3) {
            RelativeLayout relativeLayout4 = balloon.f24591b.f24745d;
            Intrinsics.m32178g(relativeLayout4, "binding.balloonContent");
            layoutParams.addRule(7, relativeLayout4.getId());
            visible.setRotation(90.0f);
        }
        visible.setLayoutParams(layoutParams);
        visible.setAlpha(balloon.f24598i.f24700z);
        Objects.requireNonNull(balloon.f24598i);
        Objects.requireNonNull(balloon.f24598i);
        Objects.requireNonNull(balloon.f24598i);
        Objects.requireNonNull(balloon.f24598i);
        Objects.requireNonNull(balloon.f24598i);
        visible.setPadding(0, 0, 0, 0);
        Builder builder = balloon.f24598i;
        int i3 = builder.f24684j;
        if (i3 != Integer.MIN_VALUE) {
            ImageViewCompat.m2594c(visible, ColorStateList.valueOf(i3));
        } else {
            ImageViewCompat.m2594c(visible, ColorStateList.valueOf(builder.f24690p));
        }
        balloon.f24591b.f24742a.post(new Runnable() { // from class: com.skydoves.balloon.Balloon$initializeArrow$$inlined$with$lambda$1
            @Override // java.lang.Runnable
            public final void run() {
                AppCompatImageView appCompatImageView = balloon.f24591b.f24743b;
                Intrinsics.m32178g(appCompatImageView, "binding.balloonArrow");
                if (balloon.f24598i.f24683i) {
                    appCompatImageView.setVisibility(0);
                } else {
                    appCompatImageView.setVisibility(8);
                }
                Objects.requireNonNull(balloon);
                int ordinal2 = balloon.f24598i.f24688n.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1) {
                    AppCompatImageView appCompatImageView2 = AppCompatImageView.this;
                    Balloon balloon2 = balloon;
                    View view2 = view;
                    RelativeLayout relativeLayout5 = balloon2.f24591b.f24745d;
                    Intrinsics.m32178g(relativeLayout5, "binding.balloonContent");
                    int i4 = balloon2.m13852p(relativeLayout5)[0];
                    int i5 = balloon2.m13852p(view2)[0];
                    float f2 = (r8.f24685k * balloon2.f24598i.f24689o) + 0;
                    float m13850n = ((balloon2.m13850n() - f2) - r8.f24681g) - r8.f24682h;
                    float f3 = r8.f24685k / 2.0f;
                    int ordinal3 = balloon2.f24598i.f24687m.ordinal();
                    if (ordinal3 == 0) {
                        Intrinsics.m32178g(balloon2.f24591b.f24747f, "binding.balloonWrapper");
                        f2 = (r2.getWidth() * balloon2.f24598i.f24686l) - f3;
                    } else {
                        if (ordinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (view2.getWidth() + i5 >= i4) {
                            if (balloon2.m13850n() + i4 >= i5) {
                                float width = (((view2.getWidth() * balloon2.f24598i.f24686l) + i5) - i4) - f3;
                                if (width > balloon2.m13848l()) {
                                    if (width <= balloon2.m13850n() - balloon2.m13848l()) {
                                        f2 = width;
                                    }
                                }
                            }
                            f2 = m13850n;
                        }
                    }
                    appCompatImageView2.setX(f2);
                    return;
                }
                if (ordinal2 == 2 || ordinal2 == 3) {
                    AppCompatImageView appCompatImageView3 = AppCompatImageView.this;
                    Balloon balloon3 = balloon;
                    View view3 = view;
                    RelativeLayout relativeLayout6 = balloon3.f24591b.f24745d;
                    Intrinsics.m32178g(relativeLayout6, "binding.balloonContent");
                    int m13851o = balloon3.m13852p(relativeLayout6)[1] - balloon3.m13851o();
                    int m13851o2 = balloon3.m13852p(view3)[1] - balloon3.m13851o();
                    float f4 = 0;
                    float f5 = (r9.f24685k * balloon3.f24598i.f24689o) + f4;
                    Objects.requireNonNull(balloon3.f24598i);
                    Objects.requireNonNull(balloon3.f24598i);
                    float m13849m = ((balloon3.m13849m() - f5) - f4) - f4;
                    Balloon.Builder builder2 = balloon3.f24598i;
                    int i6 = builder2.f24685k / 2;
                    int ordinal4 = builder2.f24687m.ordinal();
                    if (ordinal4 == 0) {
                        Intrinsics.m32178g(balloon3.f24591b.f24747f, "binding.balloonWrapper");
                        f5 = (r2.getHeight() * balloon3.f24598i.f24686l) - i6;
                    } else {
                        if (ordinal4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (view3.getHeight() + m13851o2 >= m13851o) {
                            if (balloon3.m13849m() + m13851o >= m13851o2) {
                                float height = (((view3.getHeight() * balloon3.f24598i.f24686l) + m13851o2) - m13851o) - i6;
                                if (height > balloon3.m13848l()) {
                                    if (height <= balloon3.m13849m() - balloon3.m13848l()) {
                                        f5 = height;
                                    }
                                }
                            }
                            f5 = m13849m;
                        }
                    }
                    appCompatImageView3.setY(f5);
                }
            }
        });
    }

    /* renamed from: j */
    public final void m13846j() {
        if (this.f24593d) {
            final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.skydoves.balloon.Balloon$dismiss$dismissWindow$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Unit invoke() {
                    Balloon balloon = Balloon.this;
                    balloon.f24593d = false;
                    balloon.f24592c.dismiss();
                    return Unit.f63088a;
                }
            };
            if (this.f24598i.f24670G != BalloonAnimation.CIRCULAR) {
                function0.invoke();
                return;
            }
            View contentView = this.f24592c.getContentView();
            Intrinsics.m32178g(contentView, "this.bodyWindow.contentView");
            ViewExtensionKt.m13881b(contentView, this.f24598i.f24671H, new Function0<Unit>() { // from class: com.skydoves.balloon.Balloon$dismiss$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Unit invoke() {
                    Function0.this.invoke();
                    return Unit.f63088a;
                }
            });
        }
    }

    /* renamed from: k */
    public final void m13847k(long j2) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.skydoves.balloon.Balloon$dismissWithDelay$1
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.this.m13846j();
            }
        }, j2);
    }

    /* renamed from: l */
    public final int m13848l() {
        return this.f24598i.f24685k * 2;
    }

    /* renamed from: m */
    public final int m13849m() {
        int i2 = this.f24598i.f24676b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        FrameLayout frameLayout = this.f24591b.f24742a;
        Intrinsics.m32178g(frameLayout, "this.binding.root");
        return frameLayout.getMeasuredHeight();
    }

    /* renamed from: n */
    public final int m13850n() {
        int i2 = ContextExtensionKt.m13873a(this.f24597h).x;
        Objects.requireNonNull(this.f24598i);
        int i3 = this.f24598i.f24675a;
        if (i3 != Integer.MIN_VALUE && i3 < i2) {
            return i3;
        }
        FrameLayout frameLayout = this.f24591b.f24742a;
        Intrinsics.m32178g(frameLayout, "binding.root");
        if (frameLayout.getMeasuredWidth() > i2) {
            return i2;
        }
        FrameLayout frameLayout2 = this.f24591b.f24742a;
        Intrinsics.m32178g(frameLayout2, "this.binding.root");
        return frameLayout2.getMeasuredWidth();
    }

    /* renamed from: o */
    public final int m13851o() {
        Rect rect = new Rect();
        Context context = this.f24597h;
        if (!(context instanceof Activity) || !this.f24598i.f24673J) {
            return 0;
        }
        Window window = ((Activity) context).getWindow();
        Intrinsics.m32178g(window, "context.window");
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.f24594e = true;
        m13846j();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        Objects.requireNonNull(this.f24598i);
    }

    /* renamed from: p */
    public final int[] m13852p(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: q */
    public final void m13853q() {
        Builder builder = this.f24598i;
        int i2 = (builder.f24685k * 2) - 2;
        RelativeLayout relativeLayout = this.f24591b.f24745d;
        int ordinal = builder.f24688n.ordinal();
        if (ordinal == 0) {
            relativeLayout.setPadding(0, 0, 0, i2);
        } else if (ordinal == 1) {
            relativeLayout.setPadding(0, i2, 0, 0);
        } else if (ordinal == 2) {
            relativeLayout.setPadding(i2, 0, 0, 0);
        } else if (ordinal == 3) {
            relativeLayout.setPadding(0, 0, i2, 0);
        }
        VectorTextView vectorTextView = this.f24591b.f24746e;
        Builder builder2 = this.f24598i;
        vectorTextView.setPadding(builder2.f24677c, builder2.f24678d, builder2.f24679e, builder2.f24680f);
    }

    /* renamed from: r */
    public final void m13854r() {
        VectorTextView vectorTextView = this.f24591b.f24746e;
        Objects.requireNonNull(this.f24598i);
        Context context = vectorTextView.getContext();
        Intrinsics.m32178g(context, "context");
        TextForm.Builder builder = new TextForm.Builder(context);
        CharSequence value = this.f24598i.f24692r;
        Intrinsics.m32179h(value, "value");
        builder.f24735a = value;
        Builder builder2 = this.f24598i;
        builder.f24736b = builder2.f24694t;
        builder.f24737c = builder2.f24693s;
        Objects.requireNonNull(builder2);
        builder.f24738d = false;
        Builder builder3 = this.f24598i;
        builder.f24741g = builder3.f24695u;
        Objects.requireNonNull(builder3);
        builder.f24739e = 0;
        Objects.requireNonNull(this.f24598i);
        builder.f24740f = null;
        Objects.requireNonNull(this.f24598i);
        vectorTextView.setMovementMethod(null);
        TextViewExtensionKt.m13879a(vectorTextView, new TextForm(builder));
        Intrinsics.m32178g(vectorTextView, "this");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        Context context2 = vectorTextView.getContext();
        Intrinsics.m32178g(context2, "context");
        vectorTextView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(ContextExtensionKt.m13873a(context2).y, 0));
        ViewGroup.LayoutParams layoutParams = vectorTextView.getLayoutParams();
        int measuredWidth = vectorTextView.getMeasuredWidth();
        int i2 = ContextExtensionKt.m13873a(this.f24597h).x;
        Builder builder4 = this.f24598i;
        int m13875c = ContextExtensionKt.m13875c(this.f24597h, 24) + builder4.f24677c + builder4.f24679e;
        Objects.requireNonNull(this.f24598i);
        int i3 = m13875c + 0;
        Objects.requireNonNull(this.f24598i);
        int i4 = this.f24598i.f24675a;
        if (i4 == Integer.MIN_VALUE || i4 > i2) {
            int i5 = i2 - i3;
            if (measuredWidth >= i5) {
                measuredWidth = i5;
            }
        } else {
            measuredWidth = i4 - i3;
        }
        layoutParams.width = measuredWidth;
    }

    /* renamed from: s */
    public final void m13855s(@NotNull final View view, final int i2, final int i3) {
        if (this.f24593d || this.f24594e) {
            Objects.requireNonNull(this.f24598i);
            return;
        }
        this.f24593d = true;
        Objects.requireNonNull(this.f24598i);
        long j2 = this.f24598i.f24667D;
        if (j2 != -1) {
            m13847k(j2);
        }
        view.post(new Runnable() { // from class: com.skydoves.balloon.Balloon$show$$inlined$show$2
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.this.m13854r();
                Balloon.this.f24591b.f24742a.measure(0, 0);
                Balloon balloon = Balloon.this;
                balloon.f24592c.setWidth(balloon.m13850n());
                Balloon balloon2 = Balloon.this;
                balloon2.f24592c.setHeight(balloon2.m13849m());
                VectorTextView vectorTextView = Balloon.this.f24591b.f24746e;
                Intrinsics.m32178g(vectorTextView, "this.binding.balloonText");
                vectorTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                Balloon.m13845i(Balloon.this, view);
                Balloon.this.m13853q();
                Balloon.m13844h(Balloon.this);
                this.f24592c.showAsDropDown(view, i2, i3);
            }
        });
    }

    /* renamed from: t */
    public final void m13856t(@NotNull final View view) {
        if (this.f24593d || this.f24594e) {
            Objects.requireNonNull(this.f24598i);
            return;
        }
        this.f24593d = true;
        Objects.requireNonNull(this.f24598i);
        long j2 = this.f24598i.f24667D;
        if (j2 != -1) {
            m13847k(j2);
        }
        view.post(new Runnable() { // from class: com.skydoves.balloon.Balloon$showAlignBottom$$inlined$show$1
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.this.m13854r();
                Balloon.this.f24591b.f24742a.measure(0, 0);
                Balloon balloon = Balloon.this;
                balloon.f24592c.setWidth(balloon.m13850n());
                Balloon balloon2 = Balloon.this;
                balloon2.f24592c.setHeight(balloon2.m13849m());
                VectorTextView vectorTextView = Balloon.this.f24591b.f24746e;
                Intrinsics.m32178g(vectorTextView, "this.binding.balloonText");
                vectorTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                Balloon.m13845i(Balloon.this, view);
                Balloon.this.m13853q();
                Balloon.m13844h(Balloon.this);
                Balloon balloon3 = this;
                PopupWindow popupWindow = balloon3.f24592c;
                View view2 = view;
                popupWindow.showAsDropDown(view2, ((view2.getMeasuredWidth() / 2) - (this.m13850n() / 2)) * balloon3.f24595f, 0);
            }
        });
    }

    /* renamed from: u */
    public final void m13857u(@NotNull final View view, final int i2, final int i3) {
        if (this.f24593d || this.f24594e) {
            Objects.requireNonNull(this.f24598i);
            return;
        }
        this.f24593d = true;
        Objects.requireNonNull(this.f24598i);
        long j2 = this.f24598i.f24667D;
        if (j2 != -1) {
            m13847k(j2);
        }
        view.post(new Runnable() { // from class: com.skydoves.balloon.Balloon$showAlignBottom$$inlined$show$2
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.this.m13854r();
                Balloon.this.f24591b.f24742a.measure(0, 0);
                Balloon balloon = Balloon.this;
                balloon.f24592c.setWidth(balloon.m13850n());
                Balloon balloon2 = Balloon.this;
                balloon2.f24592c.setHeight(balloon2.m13849m());
                VectorTextView vectorTextView = Balloon.this.f24591b.f24746e;
                Intrinsics.m32178g(vectorTextView, "this.binding.balloonText");
                vectorTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                Balloon.m13845i(Balloon.this, view);
                Balloon.this.m13853q();
                Balloon.m13844h(Balloon.this);
                Balloon balloon3 = this;
                PopupWindow popupWindow = balloon3.f24592c;
                View view2 = view;
                popupWindow.showAsDropDown(view2, (((view2.getMeasuredWidth() / 2) - (this.m13850n() / 2)) + i2) * balloon3.f24595f, i3);
            }
        });
    }
}
