package com.stfalcon.imageviewer.viewer.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.transition.TransitionManager;
import com.stfalcon.imageviewer.common.extensions.ViewKt;
import com.stfalcon.imageviewer.common.extensions.ViewPagerKt;
import com.stfalcon.imageviewer.common.gestures.detector.SimpleOnGestureListener;
import com.stfalcon.imageviewer.common.gestures.direction.SwipeDirection;
import com.stfalcon.imageviewer.common.gestures.direction.SwipeDirectionDetector;
import com.stfalcon.imageviewer.common.gestures.dismiss.SwipeToDismissHandler;
import com.stfalcon.imageviewer.common.pager.MultiTouchViewPager;
import com.stfalcon.imageviewer.loader.ImageLoader;
import com.stfalcon.imageviewer.viewer.adapter.ImagesPagerAdapter;
import com.swiftsoft.anixartd.C2507R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageViewerView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R?\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u00106\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010;\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u000bR$\u0010A\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00038@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010:R$\u0010D\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00038@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bB\u0010?\"\u0004\bC\u0010:¨\u0006E"}, m31884d2 = {"Lcom/stfalcon/imageviewer/viewer/view/ImageViewerView;", "T", "Landroid/widget/RelativeLayout;", "", "color", "", "setBackgroundColor", "", "b", "Z", "isZoomingAllowed$imageviewer_release", "()Z", "setZoomingAllowed$imageviewer_release", "(Z)V", "isZoomingAllowed", "c", "isSwipeToDismissAllowed$imageviewer_release", "setSwipeToDismissAllowed$imageviewer_release", "isSwipeToDismissAllowed", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "getOnDismiss$imageviewer_release", "()Lkotlin/jvm/functions/Function0;", "setOnDismiss$imageviewer_release", "(Lkotlin/jvm/functions/Function0;)V", "onDismiss", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "e", "Lkotlin/jvm/functions/Function1;", "getOnPageChange$imageviewer_release", "()Lkotlin/jvm/functions/Function1;", "setOnPageChange$imageviewer_release", "(Lkotlin/jvm/functions/Function1;)V", "onPageChange", "", "f", "[I", "getContainerPadding$imageviewer_release", "()[I", "setContainerPadding$imageviewer_release", "([I)V", "containerPadding", "Landroid/view/View;", "value", "g", "Landroid/view/View;", "getOverlayView$imageviewer_release", "()Landroid/view/View;", "setOverlayView$imageviewer_release", "(Landroid/view/View;)V", "overlayView", "A", "I", "setStartPosition", "(I)V", "startPosition", "getShouldDismissToBottom", "shouldDismissToBottom", "getCurrentPosition$imageviewer_release", "()I", "setCurrentPosition$imageviewer_release", "currentPosition", "getImagesMargin$imageviewer_release", "setImagesMargin$imageviewer_release", "imagesMargin", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ImageViewerView<T> extends RelativeLayout {

    /* renamed from: B */
    public static final /* synthetic */ int f25284B = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public int startPosition;

    /* renamed from: b, reason: from kotlin metadata */
    public boolean isZoomingAllowed;

    /* renamed from: c, reason: from kotlin metadata */
    public boolean isSwipeToDismissAllowed;

    /* renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> onDismiss;

    /* renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> onPageChange;

    /* renamed from: f, reason: from kotlin metadata */
    @NotNull
    public int[] containerPadding;

    /* renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View overlayView;

    /* renamed from: h */
    public ViewGroup f25292h;

    /* renamed from: i */
    public View f25293i;

    /* renamed from: j */
    public ViewGroup f25294j;

    /* renamed from: k */
    public final FrameLayout f25295k;

    /* renamed from: l */
    public final ImageView f25296l;

    /* renamed from: m */
    public ImageView f25297m;

    /* renamed from: n */
    public MultiTouchViewPager f25298n;

    /* renamed from: o */
    public ImagesPagerAdapter<T> f25299o;

    /* renamed from: p */
    public SwipeDirectionDetector f25300p;

    /* renamed from: q */
    public GestureDetectorCompat f25301q;

    /* renamed from: r */
    public ScaleGestureDetector f25302r;

    /* renamed from: s */
    public SwipeToDismissHandler f25303s;

    /* renamed from: t */
    public boolean f25304t;

    /* renamed from: u */
    public boolean f25305u;

    /* renamed from: v */
    public boolean f25306v;

    /* renamed from: w */
    public SwipeDirection f25307w;

    /* renamed from: x */
    public List<? extends T> f25308x;

    /* renamed from: y */
    public ImageLoader<T> f25309y;

    /* renamed from: z */
    public TransitionImageAnimator f25310z;

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SwipeDirection.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[4] = 4;
        }
    }

    public ImageViewerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, null, (i3 & 4) != 0 ? 0 : i2);
        this.isZoomingAllowed = true;
        this.isSwipeToDismissAllowed = true;
        this.containerPadding = new int[]{0, 0, 0, 0};
        this.f25308x = EmptyList.f63144b;
        View.inflate(context, C2507R.layout.view_image_viewer, this);
        View findViewById = findViewById(C2507R.id.rootContainer);
        Intrinsics.m32175d(findViewById, "findViewById(R.id.rootContainer)");
        this.f25292h = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C2507R.id.backgroundView);
        Intrinsics.m32175d(findViewById2, "findViewById(R.id.backgroundView)");
        this.f25293i = findViewById2;
        View findViewById3 = findViewById(C2507R.id.dismissContainer);
        Intrinsics.m32175d(findViewById3, "findViewById(R.id.dismissContainer)");
        this.f25294j = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(C2507R.id.transitionImageContainer);
        Intrinsics.m32175d(findViewById4, "findViewById(R.id.transitionImageContainer)");
        this.f25295k = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(C2507R.id.transitionImageView);
        Intrinsics.m32175d(findViewById5, "findViewById(R.id.transitionImageView)");
        this.f25296l = (ImageView) findViewById5;
        View findViewById6 = findViewById(C2507R.id.imagesPager);
        Intrinsics.m32175d(findViewById6, "findViewById(R.id.imagesPager)");
        MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) findViewById6;
        this.f25298n = multiTouchViewPager;
        ViewPagerKt.m14025a(multiTouchViewPager, null, new Function1<Integer, Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView.1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Integer num) {
                int intValue = num.intValue();
                ImageViewerView imageViewerView = ImageViewerView.this;
                ImageView imageView = imageViewerView.f25297m;
                if (imageView != null) {
                    if (imageViewerView.getCurrentPosition$imageviewer_release() == imageViewerView.startPosition) {
                        imageView.setVisibility(4);
                    } else {
                        imageView.setVisibility(0);
                    }
                }
                Function1<Integer, Unit> onPageChange$imageviewer_release = ImageViewerView.this.getOnPageChange$imageviewer_release();
                if (onPageChange$imageviewer_release != null) {
                    onPageChange$imageviewer_release.invoke(Integer.valueOf(intValue));
                }
                return Unit.f63088a;
            }
        }, null, 5);
        Context context2 = getContext();
        Intrinsics.m32175d(context2, "context");
        this.f25300p = new SwipeDirectionDetector(context2, new Function1<SwipeDirection, Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$createSwipeDirectionDetector$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(SwipeDirection swipeDirection) {
                SwipeDirection it = swipeDirection;
                Intrinsics.m32180i(it, "it");
                ImageViewerView.this.f25307w = it;
                return Unit.f63088a;
            }
        });
        this.f25301q = new GestureDetectorCompat(getContext(), new SimpleOnGestureListener(new Function1<MotionEvent, Boolean>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$createGestureDetector$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(MotionEvent motionEvent) {
                MotionEvent it = motionEvent;
                Intrinsics.m32180i(it, "it");
                ImageViewerView imageViewerView = ImageViewerView.this;
                if (imageViewerView.f25298n.f25248j0) {
                    ImageViewerView.m14032b(imageViewerView, it, imageViewerView.f25306v);
                }
                return Boolean.FALSE;
            }
        }, new Function1<MotionEvent, Boolean>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$createGestureDetector$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(MotionEvent motionEvent) {
                MotionEvent it = motionEvent;
                Intrinsics.m32180i(it, "it");
                ImageViewerView.this.f25305u = !r2.m14036f();
                return Boolean.FALSE;
            }
        }));
        this.f25302r = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener());
    }

    /* renamed from: b */
    public static final void m14032b(ImageViewerView imageViewerView, MotionEvent motionEvent, boolean z) {
        final View view = imageViewerView.overlayView;
        if (view == null || z) {
            return;
        }
        final boolean z2 = view.getVisibility() == 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", z2 ? 1.0f : 0.0f, z2 ? 0.0f : 1.0f);
        ofFloat.setDuration(ViewConfiguration.getDoubleTapTimeout());
        if (z2) {
            ofFloat.addListener(new AnimatorListenerAdapter(view, z2) { // from class: com.stfalcon.imageviewer.common.extensions.ViewKt$switchVisibilityWithAnimation$$inlined$apply$lambda$1

                /* renamed from: a */
                public final /* synthetic */ View f25219a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animator) {
                    ViewKt.m14022d(this.f25219a);
                }
            });
        } else {
            view.setVisibility(0);
        }
        ofFloat.start();
        super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDismissToBottom() {
        ImageView imageView = this.f25297m;
        if (imageView == null || !ViewKt.m14021c(imageView)) {
            return true;
        }
        return !(getCurrentPosition$imageviewer_release() == this.startPosition);
    }

    private final void setStartPosition(int i2) {
        this.startPosition = i2;
        setCurrentPosition$imageviewer_release(i2);
    }

    /* renamed from: c */
    public final void m14033c() {
        ViewKt.m14023e(this.f25295k);
        ViewKt.m14022d(this.f25298n);
        ViewKt.m14020b(this.f25294j, 0, 0, 0, 0);
        final TransitionImageAnimator transitionImageAnimator = this.f25310z;
        if (transitionImageAnimator == null) {
            Intrinsics.m32189r("transitionImageAnimator");
            throw null;
        }
        boolean shouldDismissToBottom = getShouldDismissToBottom();
        Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$animateClose$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l2) {
                long longValue = l2.longValue();
                View view = ImageViewerView.this.f25293i;
                ViewKt.m14019a(view, Float.valueOf(view.getAlpha()), Float.valueOf(0.0f), longValue);
                View overlayView = ImageViewerView.this.getOverlayView();
                if (overlayView != null) {
                    View overlayView2 = ImageViewerView.this.getOverlayView();
                    ViewKt.m14019a(overlayView, overlayView2 != null ? Float.valueOf(overlayView2.getAlpha()) : null, Float.valueOf(0.0f), longValue);
                }
                return Unit.f63088a;
            }
        };
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$animateClose$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                Function0<Unit> onDismiss$imageviewer_release = ImageViewerView.this.getOnDismiss$imageviewer_release();
                if (onDismiss$imageviewer_release != null) {
                    onDismiss$imageviewer_release.invoke();
                }
                return Unit.f63088a;
            }
        };
        if (!ViewKt.m14021c(transitionImageAnimator.f25323c) || shouldDismissToBottom) {
            ImageView imageView = transitionImageAnimator.f25323c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            function0.invoke();
            return;
        }
        function1.invoke(250L);
        transitionImageAnimator.f25321a = true;
        transitionImageAnimator.f25322b = true;
        TransitionManager.m4256a(transitionImageAnimator.m14040b(), transitionImageAnimator.m14039a(new Function0<Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.TransitionImageAnimator$doCloseTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                TransitionImageAnimator transitionImageAnimator2 = TransitionImageAnimator.this;
                final Function0 function02 = function0;
                ImageView imageView2 = transitionImageAnimator2.f25323c;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                transitionImageAnimator2.f25324d.post(new Runnable() { // from class: com.stfalcon.imageviewer.viewer.view.TransitionImageAnimator$handleCloseTransitionEnd$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Function0.this.invoke();
                    }
                });
                transitionImageAnimator2.f25321a = false;
                return Unit.f63088a;
            }
        }));
        transitionImageAnimator.m14041c();
        transitionImageAnimator.f25325e.requestLayout();
    }

    /* renamed from: d */
    public final void m14034d() {
        if (!getShouldDismissToBottom()) {
            m14033c();
            return;
        }
        SwipeToDismissHandler swipeToDismissHandler = this.f25303s;
        if (swipeToDismissHandler != null) {
            swipeToDismissHandler.m14026a(swipeToDismissHandler.f25241e.getHeight());
        } else {
            Intrinsics.m32189r("swipeDismissHandler");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x016e, code lost:
    
        if (r11 <= 360.0d) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (r9 != 3) goto L89;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stfalcon.imageviewer.viewer.view.ImageViewerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public final boolean m14035e(MotionEvent motionEvent) {
        View view = this.overlayView;
        if (view != null) {
            if ((view.getVisibility() == 0) && view.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m14036f() {
        T t;
        ImagesPagerAdapter<T> imagesPagerAdapter = this.f25299o;
        if (imagesPagerAdapter == null) {
            return false;
        }
        int currentPosition$imageviewer_release = getCurrentPosition$imageviewer_release();
        Iterator<T> it = imagesPagerAdapter.f25259f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = (T) null;
                break;
            }
            t = it.next();
            if (((ImagesPagerAdapter.ViewHolder) t).f25255a == currentPosition$imageviewer_release) {
                break;
            }
        }
        ImagesPagerAdapter.ViewHolder viewHolder = t;
        return viewHolder != null && viewHolder.f25263d.getScale() > 1.0f;
    }

    /* renamed from: g */
    public final void m14037g(@Nullable ImageView imageView, boolean z) {
        Drawable drawable;
        ViewKt.m14023e(this.f25295k);
        ViewKt.m14022d(this.f25298n);
        this.f25297m = imageView;
        ImageLoader<T> imageLoader = this.f25309y;
        if (imageLoader != null) {
            imageLoader.mo14030b(this.f25296l, this.f25308x.get(this.startPosition));
        }
        ImageView copyBitmapFrom = this.f25296l;
        Intrinsics.m32180i(copyBitmapFrom, "$this$copyBitmapFrom");
        if (imageView != null && (drawable = imageView.getDrawable()) != null && (drawable instanceof BitmapDrawable)) {
            copyBitmapFrom.setImageBitmap(((BitmapDrawable) drawable).getBitmap());
        }
        this.f25310z = new TransitionImageAnimator(imageView, this.f25296l, this.f25295k);
        SwipeToDismissHandler swipeToDismissHandler = new SwipeToDismissHandler(this.f25294j, new Function0<Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$createSwipeToDismissHandler$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ImageViewerView imageViewerView = ImageViewerView.this;
                int i2 = ImageViewerView.f25284B;
                imageViewerView.m14033c();
                return Unit.f63088a;
            }
        }, new ImageViewerView$createSwipeToDismissHandler$3(this), new Function0<Boolean>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$createSwipeToDismissHandler$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Boolean invoke() {
                boolean shouldDismissToBottom;
                shouldDismissToBottom = ImageViewerView.this.getShouldDismissToBottom();
                return Boolean.valueOf(shouldDismissToBottom);
            }
        });
        this.f25303s = swipeToDismissHandler;
        this.f25292h.setOnTouchListener(swipeToDismissHandler);
        if (!z) {
            this.f25293i.setAlpha(1.0f);
            ViewKt.m14022d(this.f25295k);
            ViewKt.m14023e(this.f25298n);
            return;
        }
        TransitionImageAnimator transitionImageAnimator = this.f25310z;
        if (transitionImageAnimator == null) {
            Intrinsics.m32189r("transitionImageAnimator");
            throw null;
        }
        int[] containerPadding = this.containerPadding;
        Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$animateOpen$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l2) {
                long longValue = l2.longValue();
                ViewKt.m14019a(ImageViewerView.this.f25293i, Float.valueOf(0.0f), Float.valueOf(1.0f), longValue);
                View overlayView = ImageViewerView.this.getOverlayView();
                if (overlayView != null) {
                    ViewKt.m14019a(overlayView, Float.valueOf(0.0f), Float.valueOf(1.0f), longValue);
                }
                return Unit.f63088a;
            }
        };
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.ImageViewerView$animateOpen$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ImageViewerView imageViewerView = ImageViewerView.this;
                imageViewerView.f25293i.setAlpha(1.0f);
                ViewKt.m14022d(imageViewerView.f25295k);
                ViewKt.m14023e(imageViewerView.f25298n);
                return Unit.f63088a;
            }
        };
        Intrinsics.m32180i(containerPadding, "containerPadding");
        if (!ViewKt.m14021c(transitionImageAnimator.f25323c)) {
            function0.invoke();
            return;
        }
        function1.invoke(200L);
        transitionImageAnimator.f25321a = true;
        transitionImageAnimator.m14041c();
        ViewGroup m14040b = transitionImageAnimator.m14040b();
        m14040b.post(new TransitionImageAnimator$doOpenTransition$$inlined$postApply$1(m14040b, transitionImageAnimator, function0, containerPadding));
    }

    @NotNull
    /* renamed from: getContainerPadding$imageviewer_release, reason: from getter */
    public final int[] getContainerPadding() {
        return this.containerPadding;
    }

    public final int getCurrentPosition$imageviewer_release() {
        return this.f25298n.getCurrentItem();
    }

    public final int getImagesMargin$imageviewer_release() {
        return this.f25298n.getPageMargin();
    }

    @Nullable
    public final Function0<Unit> getOnDismiss$imageviewer_release() {
        return this.onDismiss;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnPageChange$imageviewer_release() {
        return this.onPageChange;
    }

    @Nullable
    /* renamed from: getOverlayView$imageviewer_release, reason: from getter */
    public final View getOverlayView() {
        return this.overlayView;
    }

    /* renamed from: h */
    public final void m14038h(@NotNull List<? extends T> images, int i2, @NotNull ImageLoader<T> imageLoader) {
        Intrinsics.m32180i(images, "images");
        Intrinsics.m32180i(imageLoader, "imageLoader");
        this.f25308x = images;
        this.f25309y = imageLoader;
        Context context = getContext();
        Intrinsics.m32175d(context, "context");
        ImagesPagerAdapter<T> imagesPagerAdapter = new ImagesPagerAdapter<>(context, images, imageLoader, this.isZoomingAllowed);
        this.f25299o = imagesPagerAdapter;
        this.f25298n.setAdapter(imagesPagerAdapter);
        setStartPosition(i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        findViewById(C2507R.id.backgroundView).setBackgroundColor(color);
    }

    public final void setContainerPadding$imageviewer_release(@NotNull int[] iArr) {
        Intrinsics.m32180i(iArr, "<set-?>");
        this.containerPadding = iArr;
    }

    public final void setCurrentPosition$imageviewer_release(int i2) {
        this.f25298n.setCurrentItem(i2);
    }

    public final void setImagesMargin$imageviewer_release(int i2) {
        this.f25298n.setPageMargin(i2);
    }

    public final void setOnDismiss$imageviewer_release(@Nullable Function0<Unit> function0) {
        this.onDismiss = function0;
    }

    public final void setOnPageChange$imageviewer_release(@Nullable Function1<? super Integer, Unit> function1) {
        this.onPageChange = function1;
    }

    public final void setOverlayView$imageviewer_release(@Nullable View view) {
        this.overlayView = view;
        if (view != null) {
            this.f25292h.addView(view);
        }
    }

    public final void setSwipeToDismissAllowed$imageviewer_release(boolean z) {
        this.isSwipeToDismissAllowed = z;
    }

    public final void setZoomingAllowed$imageviewer_release(boolean z) {
        this.isZoomingAllowed = z;
    }
}
