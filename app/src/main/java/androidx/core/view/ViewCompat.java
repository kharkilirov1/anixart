package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;

@SuppressLint
/* loaded from: classes.dex */
public class ViewCompat {

    /* renamed from: a */
    public static WeakHashMap<View, ViewPropertyAnimatorCompat> f3638a;

    /* renamed from: b */
    public static Field f3639b;

    /* renamed from: c */
    public static boolean f3640c;

    /* renamed from: d */
    public static ThreadLocal<Rect> f3641d;

    /* renamed from: e */
    public static final int[] f3642e;

    /* renamed from: f */
    public static final OnReceiveContentViewBehavior f3643f;

    /* renamed from: g */
    public static final AccessibilityPaneVisibilityManager f3644g;

    /* renamed from: androidx.core.view.ViewCompat$1 */
    class C02551 extends AccessibilityViewProperty<Boolean> {
        public C02551(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi
        /* renamed from: b */
        public Boolean mo2239b(@NonNull View view) {
            return Boolean.valueOf(Api28Impl.m2343d(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi
        /* renamed from: c */
        public void mo2240c(@NonNull View view, Boolean bool) {
            Api28Impl.m2348i(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* renamed from: f */
        public boolean mo2241f(Boolean bool, Boolean bool2) {
            return !m2242a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$2 */
    class C02562 extends AccessibilityViewProperty<CharSequence> {
        public C02562(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi
        /* renamed from: b */
        public CharSequence mo2239b(View view) {
            return Api28Impl.m2341b(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi
        /* renamed from: c */
        public void mo2240c(View view, CharSequence charSequence) {
            Api28Impl.m2347h(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* renamed from: f */
        public boolean mo2241f(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$3 */
    class C02573 extends AccessibilityViewProperty<CharSequence> {
        public C02573(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi
        /* renamed from: b */
        public CharSequence mo2239b(View view) {
            return Api30Impl.m2353a(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi
        /* renamed from: c */
        public void mo2240c(View view, CharSequence charSequence) {
            Api30Impl.m2355c(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* renamed from: f */
        public boolean mo2241f(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$4 */
    class C02584 extends AccessibilityViewProperty<Boolean> {
        public C02584(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi
        /* renamed from: b */
        public Boolean mo2239b(View view) {
            return Boolean.valueOf(Api28Impl.m2342c(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi
        /* renamed from: c */
        public void mo2240c(View view, Boolean bool) {
            Api28Impl.m2346g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* renamed from: f */
        public boolean mo2241f(Boolean bool, Boolean bool2) {
            return !m2242a(bool, bool2);
        }
    }

    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final WeakHashMap<View, Boolean> f3645b = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @RequiresApi
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3645b.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z = key.isShown() && key.getWindowVisibility() == 0;
                    if (booleanValue != z) {
                        ViewCompat.m2177Q(key, z ? 16 : 32);
                        this.f3645b.put(key, Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @RequiresApi
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    @RequiresApi
    public static class Api15Impl {
        private Api15Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static boolean m2245a(@NonNull View view) {
            return view.hasOnClickListeners();
        }
    }

    @RequiresApi
    public static class Api16Impl {
        private Api16Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static AccessibilityNodeProvider m2246a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m2247b(View view) {
            return view.getFitsSystemWindows();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2248c(View view) {
            return view.getImportantForAccessibility();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m2249d(View view) {
            return view.getMinimumHeight();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m2250e(View view) {
            return view.getMinimumWidth();
        }

        @DoNotInline
        /* renamed from: f */
        public static ViewParent m2251f(View view) {
            return view.getParentForAccessibility();
        }

        @DoNotInline
        /* renamed from: g */
        public static int m2252g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @DoNotInline
        /* renamed from: h */
        public static boolean m2253h(View view) {
            return view.hasOverlappingRendering();
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m2254i(View view) {
            return view.hasTransientState();
        }

        @DoNotInline
        /* renamed from: j */
        public static boolean m2255j(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m2256k(View view) {
            view.postInvalidateOnAnimation();
        }

        @DoNotInline
        /* renamed from: l */
        public static void m2257l(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        @DoNotInline
        /* renamed from: m */
        public static void m2258m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @DoNotInline
        /* renamed from: n */
        public static void m2259n(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        @DoNotInline
        /* renamed from: o */
        public static void m2260o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @DoNotInline
        /* renamed from: p */
        public static void m2261p(View view) {
            view.requestFitSystemWindows();
        }

        @DoNotInline
        /* renamed from: q */
        public static void m2262q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @DoNotInline
        /* renamed from: r */
        public static void m2263r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @DoNotInline
        /* renamed from: s */
        public static void m2264s(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }
    }

    @RequiresApi
    public static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static int m2265a() {
            return View.generateViewId();
        }

        @DoNotInline
        /* renamed from: b */
        public static Display m2266b(@NonNull View view) {
            return view.getDisplay();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2267c(View view) {
            return view.getLabelFor();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m2268d(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m2269e(View view) {
            return view.getPaddingEnd();
        }

        @DoNotInline
        /* renamed from: f */
        public static int m2270f(View view) {
            return view.getPaddingStart();
        }

        @DoNotInline
        /* renamed from: g */
        public static boolean m2271g(View view) {
            return view.isPaddingRelative();
        }

        @DoNotInline
        /* renamed from: h */
        public static void m2272h(View view, int i2) {
            view.setLabelFor(i2);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m2273i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @DoNotInline
        /* renamed from: j */
        public static void m2274j(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m2275k(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }
    }

    @RequiresApi
    public static class Api18Impl {
        private Api18Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static Rect m2276a(@NonNull View view) {
            return view.getClipBounds();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m2277b(@NonNull View view) {
            return view.isInLayout();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2278c(@NonNull View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    @RequiresApi
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static int m2279a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m2280b(@NonNull View view) {
            return view.isAttachedToWindow();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m2281c(@NonNull View view) {
            return view.isLaidOut();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m2282d(@NonNull View view) {
            return view.isLayoutDirectionResolved();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m2283e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m2284f(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m2285g(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    @RequiresApi
    public static class Api20Impl {
        private Api20Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static WindowInsets m2286a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* renamed from: b */
        public static WindowInsets m2287b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2288c(View view) {
            view.requestApplyInsets();
        }
    }

    @RequiresApi
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static void m2289a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C2507R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        /* renamed from: b */
        public static WindowInsetsCompat m2290b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets m2432n = windowInsetsCompat.m2432n();
            if (m2432n != null) {
                return WindowInsetsCompat.m2419p(view.computeSystemWindowInsets(m2432n, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m2291c(@NonNull View view, float f2, float f3, boolean z) {
            return view.dispatchNestedFling(f2, f3, z);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m2292d(@NonNull View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m2293e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m2294f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        @DoNotInline
        /* renamed from: g */
        public static ColorStateList m2295g(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        /* renamed from: h */
        public static PorterDuff.Mode m2296h(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        /* renamed from: i */
        public static float m2297i(View view) {
            return view.getElevation();
        }

        @Nullable
        @DoNotInline
        /* renamed from: j */
        public static WindowInsetsCompat m2298j(@NonNull View view) {
            if (!WindowInsetsCompat.Api21ReflectionHolder.f3703d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = WindowInsetsCompat.Api21ReflectionHolder.f3700a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) WindowInsetsCompat.Api21ReflectionHolder.f3701b.get(obj);
                Rect rect2 = (Rect) WindowInsetsCompat.Api21ReflectionHolder.f3702c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder();
                builder.f3704a.mo2439e(Insets.m1779b(rect.left, rect.top, rect.right, rect.bottom));
                builder.f3704a.mo2441g(Insets.m1779b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                WindowInsetsCompat m2433a = builder.m2433a();
                m2433a.f3699a.mo2459p(m2433a);
                m2433a.f3699a.mo2447d(view.getRootView());
                return m2433a;
            } catch (IllegalAccessException e2) {
                StringBuilder m24u = C0000a.m24u("Failed to get insets from AttachInfo. ");
                m24u.append(e2.getMessage());
                Log.w("WindowInsetsCompat", m24u.toString(), e2);
                return null;
            }
        }

        @DoNotInline
        /* renamed from: k */
        public static String m2299k(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        /* renamed from: l */
        public static float m2300l(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        /* renamed from: m */
        public static float m2301m(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        /* renamed from: n */
        public static boolean m2302n(View view) {
            return view.hasNestedScrollingParent();
        }

        @DoNotInline
        /* renamed from: o */
        public static boolean m2303o(View view) {
            return view.isImportantForAccessibility();
        }

        @DoNotInline
        /* renamed from: p */
        public static boolean m2304p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        /* renamed from: q */
        public static void m2305q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: r */
        public static void m2306r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        /* renamed from: s */
        public static void m2307s(View view, float f2) {
            view.setElevation(f2);
        }

        @DoNotInline
        /* renamed from: t */
        public static void m2308t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @DoNotInline
        /* renamed from: u */
        public static void m2309u(@NonNull final View view, @Nullable final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C2507R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C2507R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1

                    /* renamed from: a */
                    public WindowInsetsCompat f3650a = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        WindowInsetsCompat m2419p = WindowInsetsCompat.m2419p(windowInsets, view2);
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 < 30) {
                            Api21Impl.m2289a(windowInsets, view);
                            if (m2419p.equals(this.f3650a)) {
                                return onApplyWindowInsetsListener.mo433a(view2, m2419p).m2432n();
                            }
                        }
                        this.f3650a = m2419p;
                        WindowInsetsCompat mo433a = onApplyWindowInsetsListener.mo433a(view2, m2419p);
                        if (i2 >= 30) {
                            return mo433a.m2432n();
                        }
                        WeakHashMap<View, ViewPropertyAnimatorCompat> weakHashMap = ViewCompat.f3638a;
                        Api20Impl.m2288c(view2);
                        return mo433a.m2432n();
                    }
                });
            }
        }

        @DoNotInline
        /* renamed from: v */
        public static void m2310v(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        /* renamed from: w */
        public static void m2311w(View view, float f2) {
            view.setTranslationZ(f2);
        }

        @DoNotInline
        /* renamed from: x */
        public static void m2312x(@NonNull View view, float f2) {
            view.setZ(f2);
        }

        @DoNotInline
        /* renamed from: y */
        public static boolean m2313y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        @DoNotInline
        /* renamed from: z */
        public static void m2314z(View view) {
            view.stopNestedScroll();
        }
    }

    @RequiresApi
    public static class Api23Impl {
        private Api23Impl() {
        }

        @Nullable
        /* renamed from: a */
        public static WindowInsetsCompat m2315a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat m2419p = WindowInsetsCompat.m2419p(rootWindowInsets, null);
            m2419p.f3699a.mo2459p(m2419p);
            m2419p.f3699a.mo2447d(view.getRootView());
            return m2419p;
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2316b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2317c(@NonNull View view, int i2) {
            view.setScrollIndicators(i2);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2318d(@NonNull View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    @RequiresApi
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static void m2319a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m2320b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2321c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2322d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m2323e(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i2) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i2);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m2324f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @RequiresApi
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static void m2325a(@NonNull View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2326b(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2327c(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m2328d(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m2329e(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m2330f(View view) {
            return view.isImportantForAutofill();
        }

        @DoNotInline
        /* renamed from: g */
        public static boolean m2331g(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        @DoNotInline
        /* renamed from: h */
        public static View m2332h(@NonNull View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m2333i(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        @DoNotInline
        /* renamed from: j */
        public static void m2334j(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m2335k(@NonNull View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @DoNotInline
        /* renamed from: l */
        public static void m2336l(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        @DoNotInline
        /* renamed from: m */
        public static void m2337m(@NonNull View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @DoNotInline
        /* renamed from: n */
        public static void m2338n(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        @DoNotInline
        /* renamed from: o */
        public static void m2339o(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static void m2340a(@NonNull View view, @NonNull final OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(C2507R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(C2507R.id.tag_unhandled_key_listeners, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.d
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return ViewCompat.OnUnhandledKeyEventListenerCompat.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence m2341b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m2342c(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m2343d(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m2344e(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(C2507R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        /* renamed from: f */
        public static <T> T m2345f(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m2346g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m2347h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m2348i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static View.AccessibilityDelegate m2349a(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        /* renamed from: b */
        public static List<Rect> m2350b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2351c(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2352d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @RequiresApi
    public static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static CharSequence m2353a(View view) {
            return view.getStateDescription();
        }

        @Nullable
        /* renamed from: b */
        public static WindowInsetsControllerCompat m2354b(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new WindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2355c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @RequiresApi
    public static final class Api31Impl {
        private Api31Impl() {
        }

        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static String[] m2356a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        @DoNotInline
        /* renamed from: b */
        public static ContentInfoCompat m2357b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo mo2067k = contentInfoCompat.f3575a.mo2067k();
            Objects.requireNonNull(mo2067k);
            ContentInfo performReceiveContent = view.performReceiveContent(mo2067k);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == mo2067k ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(performReceiveContent));
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2358c(@NonNull View view, @Nullable String[] strArr, @Nullable OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerAdapter(onReceiveContentListener));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NestedScrollType {
    }

    @RequiresApi
    public static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {

        /* renamed from: a */
        @NonNull
        public final OnReceiveContentListener f3653a;

        public OnReceiveContentListenerAdapter(@NonNull OnReceiveContentListener onReceiveContentListener) {
            this.f3653a = onReceiveContentListener;
        }

        @Override // android.view.OnReceiveContentListener
        @Nullable
        public ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(contentInfo));
            ContentInfoCompat mo2148a = this.f3653a.mo2148a(view, contentInfoCompat);
            if (mo2148a == null) {
                return null;
            }
            if (mo2148a == contentInfoCompat) {
                return contentInfo;
            }
            ContentInfo mo2067k = mo2148a.f3575a.mo2067k();
            Objects.requireNonNull(mo2067k);
            return mo2067k;
        }
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollIndicators {
    }

    public static class UnhandledKeyEventManager {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f3654d = new ArrayList<>();

        /* renamed from: a */
        @Nullable
        public WeakHashMap<View, Boolean> f3655a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f3656b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f3657c = null;

        @Nullable
        /* renamed from: a */
        public final View m2359a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3655a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m2359a = m2359a(viewGroup.getChildAt(childCount), keyEvent);
                        if (m2359a != null) {
                            return m2359a;
                        }
                    }
                }
                if (m2360b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m2360b(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C2507R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f3638a = null;
        f3640c = false;
        f3642e = new int[]{C2507R.id.accessibility_custom_action_0, C2507R.id.accessibility_custom_action_1, C2507R.id.accessibility_custom_action_2, C2507R.id.accessibility_custom_action_3, C2507R.id.accessibility_custom_action_4, C2507R.id.accessibility_custom_action_5, C2507R.id.accessibility_custom_action_6, C2507R.id.accessibility_custom_action_7, C2507R.id.accessibility_custom_action_8, C2507R.id.accessibility_custom_action_9, C2507R.id.accessibility_custom_action_10, C2507R.id.accessibility_custom_action_11, C2507R.id.accessibility_custom_action_12, C2507R.id.accessibility_custom_action_13, C2507R.id.accessibility_custom_action_14, C2507R.id.accessibility_custom_action_15, C2507R.id.accessibility_custom_action_16, C2507R.id.accessibility_custom_action_17, C2507R.id.accessibility_custom_action_18, C2507R.id.accessibility_custom_action_19, C2507R.id.accessibility_custom_action_20, C2507R.id.accessibility_custom_action_21, C2507R.id.accessibility_custom_action_22, C2507R.id.accessibility_custom_action_23, C2507R.id.accessibility_custom_action_24, C2507R.id.accessibility_custom_action_25, C2507R.id.accessibility_custom_action_26, C2507R.id.accessibility_custom_action_27, C2507R.id.accessibility_custom_action_28, C2507R.id.accessibility_custom_action_29, C2507R.id.accessibility_custom_action_30, C2507R.id.accessibility_custom_action_31};
        f3643f = new OnReceiveContentViewBehavior() { // from class: androidx.core.view.c
            @Override // androidx.core.view.OnReceiveContentViewBehavior
            /* renamed from: b */
            public final ContentInfoCompat mo741b(ContentInfoCompat contentInfoCompat) {
                WeakHashMap<View, ViewPropertyAnimatorCompat> weakHashMap = ViewCompat.f3638a;
                return contentInfoCompat;
            }
        };
        f3644g = new AccessibilityPaneVisibilityManager();
    }

    @Deprecated
    public ViewCompat() {
    }

    @Px
    /* renamed from: A */
    public static int m2157A(@NonNull View view) {
        return Api17Impl.m2269e(view);
    }

    /* renamed from: A0 */
    public static void m2158A0(@NonNull View view, float f2) {
        Api21Impl.m2312x(view, f2);
    }

    @Px
    /* renamed from: B */
    public static int m2159B(@NonNull View view) {
        return Api17Impl.m2270f(view);
    }

    /* renamed from: B0 */
    public static boolean m2160B0(@NonNull View view, int i2) {
        return Api21Impl.m2313y(view, i2);
    }

    @Nullable
    /* renamed from: C */
    public static ViewParent m2161C(@NonNull View view) {
        return Api16Impl.m2251f(view);
    }

    /* renamed from: C0 */
    public static void m2162C0(@NonNull View view) {
        Api21Impl.m2314z(view);
    }

    @Nullable
    /* renamed from: D */
    public static WindowInsetsCompat m2163D(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 23 ? Api23Impl.m2315a(view) : Api21Impl.m2298j(view);
    }

    /* renamed from: D0 */
    public static void m2164D0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @Nullable
    /* renamed from: E */
    public static String m2165E(@NonNull View view) {
        return Api21Impl.m2299k(view);
    }

    /* renamed from: F */
    public static float m2166F(@NonNull View view) {
        return Api21Impl.m2300l(view);
    }

    @Nullable
    @Deprecated
    /* renamed from: G */
    public static WindowInsetsControllerCompat m2167G(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.m2354b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new WindowInsetsControllerCompat(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    /* renamed from: H */
    public static int m2168H(@NonNull View view) {
        return Api16Impl.m2252g(view);
    }

    /* renamed from: I */
    public static float m2169I(@NonNull View view) {
        return Api21Impl.m2301m(view);
    }

    /* renamed from: J */
    public static boolean m2170J(@NonNull View view) {
        return Api15Impl.m2245a(view);
    }

    /* renamed from: K */
    public static boolean m2171K(@NonNull View view) {
        return Api16Impl.m2253h(view);
    }

    /* renamed from: L */
    public static boolean m2172L(@NonNull View view) {
        return Api16Impl.m2254i(view);
    }

    /* renamed from: M */
    public static boolean m2173M(@NonNull View view) {
        return Api19Impl.m2280b(view);
    }

    /* renamed from: N */
    public static boolean m2174N(@NonNull View view) {
        return Api19Impl.m2281c(view);
    }

    /* renamed from: O */
    public static boolean m2175O(@NonNull View view) {
        return Api21Impl.m2304p(view);
    }

    /* renamed from: P */
    public static boolean m2176P(@NonNull View view) {
        return Api17Impl.m2271g(view);
    }

    @RequiresApi
    /* renamed from: Q */
    public static void m2177Q(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m2209l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (Api19Impl.m2279a(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : RecyclerView.ViewHolder.FLAG_MOVED);
                Api19Impl.m2285g(obtain, i2);
                if (z) {
                    obtain.getText().add(m2209l(view));
                    if (Api16Impl.m2248c(view) == 0) {
                        Api16Impl.m2264s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (Api16Impl.m2248c((View) parent) == 4) {
                            Api16Impl.m2264s(view, 2);
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                Api19Impl.m2285g(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m2209l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    Api19Impl.m2283e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    /* renamed from: R */
    public static void m2178R(@NonNull View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect m2223s = m2223s();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m2223s.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m2223s.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m2191c(view, i2);
        if (z && m2223s.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m2223s);
        }
    }

    /* renamed from: S */
    public static void m2179S(@NonNull View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect m2223s = m2223s();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m2223s.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m2223s.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m2193d(view, i2);
        if (z && m2223s.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m2223s);
        }
    }

    @NonNull
    /* renamed from: T */
    public static WindowInsetsCompat m2180T(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets m2432n = windowInsetsCompat.m2432n();
        if (m2432n != null) {
            WindowInsets m2287b = Api20Impl.m2287b(view, m2432n);
            if (!m2287b.equals(m2432n)) {
                return WindowInsetsCompat.m2419p(m2287b, view);
            }
        }
        return windowInsetsCompat;
    }

    /* renamed from: U */
    public static boolean m2181U(@NonNull View view, int i2, @Nullable Bundle bundle) {
        return Api16Impl.m2255j(view, i2, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: V */
    public static ContentInfoCompat m2182V(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m2357b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(C2507R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener == null) {
            return (view instanceof OnReceiveContentViewBehavior ? (OnReceiveContentViewBehavior) view : f3643f).mo741b(contentInfoCompat);
        }
        ContentInfoCompat mo2148a = onReceiveContentListener.mo2148a(view, contentInfoCompat);
        if (mo2148a == null) {
            return null;
        }
        return (view instanceof OnReceiveContentViewBehavior ? (OnReceiveContentViewBehavior) view : f3643f).mo741b(mo2148a);
    }

    /* renamed from: W */
    public static void m2183W(@NonNull View view) {
        Api16Impl.m2256k(view);
    }

    /* renamed from: X */
    public static void m2184X(@NonNull View view, @NonNull Runnable runnable) {
        Api16Impl.m2258m(view, runnable);
    }

    @SuppressLint
    /* renamed from: Y */
    public static void m2185Y(@NonNull View view, @NonNull Runnable runnable, long j2) {
        Api16Impl.m2259n(view, runnable, j2);
    }

    /* renamed from: Z */
    public static void m2186Z(@NonNull View view, int i2) {
        m2188a0(i2, view);
        m2177Q(view, 0);
    }

    /* renamed from: a */
    public static void m2187a(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        AccessibilityDelegateCompat m2205j = m2205j(view);
        if (m2205j == null) {
            m2205j = new AccessibilityDelegateCompat(AccessibilityDelegateCompat.f3569c);
        }
        m2196e0(view, m2205j);
        m2188a0(accessibilityActionCompat.m2516a(), view);
        m2211m(view).add(accessibilityActionCompat);
        m2177Q(view, 0);
    }

    /* renamed from: a0 */
    public static void m2188a0(int i2, View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> m2211m = m2211m(view);
        for (int i3 = 0; i3 < m2211m.size(); i3++) {
            if (m2211m.get(i3).m2516a() == i2) {
                m2211m.remove(i3);
                return;
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public static ViewPropertyAnimatorCompat m2189b(@NonNull View view) {
        if (f3638a == null) {
            f3638a = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = f3638a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f3638a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    /* renamed from: b0 */
    public static void m2190b0(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, @Nullable CharSequence charSequence, @Nullable AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand != null) {
            m2187a(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, accessibilityActionCompat.f3758b, null, accessibilityViewCommand, accessibilityActionCompat.f3759c));
        } else {
            m2188a0(accessibilityActionCompat.m2516a(), view);
            m2177Q(view, 0);
        }
    }

    /* renamed from: c */
    public static void m2191c(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2164D0((View) parent);
            }
        }
    }

    /* renamed from: c0 */
    public static void m2192c0(@NonNull View view) {
        Api20Impl.m2288c(view);
    }

    /* renamed from: d */
    public static void m2193d(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m2164D0((View) parent);
            }
        }
    }

    /* renamed from: d0 */
    public static void m2194d0(@NonNull View view, @NonNull @SuppressLint Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m2351c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    @NonNull
    /* renamed from: e */
    public static WindowInsetsCompat m2195e(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
        return Api21Impl.m2290b(view, windowInsetsCompat, rect);
    }

    /* renamed from: e0 */
    public static void m2196e0(@NonNull View view, @Nullable AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (m2207k(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat(AccessibilityDelegateCompat.f3569c);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.f3571b);
    }

    @NonNull
    /* renamed from: f */
    public static WindowInsetsCompat m2197f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets m2432n = windowInsetsCompat.m2432n();
        if (m2432n != null) {
            WindowInsets m2286a = Api20Impl.m2286a(view, m2432n);
            if (!m2286a.equals(m2432n)) {
                return WindowInsetsCompat.m2419p(m2286a, view);
            }
        }
        return windowInsetsCompat;
    }

    @UiThread
    /* renamed from: f0 */
    public static void m2198f0(@NonNull View view, boolean z) {
        new C02584(C2507R.id.tag_accessibility_heading, Boolean.class, 28).m2244e(view, Boolean.valueOf(z));
    }

    /* renamed from: g */
    public static boolean m2199g(@NonNull View view, int i2, int i3, int i4, int i5, @Nullable int[] iArr) {
        return Api21Impl.m2294f(view, i2, i3, i4, i5, null);
    }

    /* renamed from: g0 */
    public static void m2200g0(@NonNull View view, int i2) {
        Api19Impl.m2284f(view, i2);
    }

    @UiThread
    /* renamed from: h */
    public static boolean m2201h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = UnhandledKeyEventManager.f3654d;
        UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(C2507R.id.tag_unhandled_key_event_manager);
        if (unhandledKeyEventManager == null) {
            unhandledKeyEventManager = new UnhandledKeyEventManager();
            view.setTag(C2507R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = unhandledKeyEventManager.f3655a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = UnhandledKeyEventManager.f3654d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (unhandledKeyEventManager.f3655a == null) {
                        unhandledKeyEventManager.f3655a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = UnhandledKeyEventManager.f3654d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            unhandledKeyEventManager.f3655a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                unhandledKeyEventManager.f3655a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View m2359a = unhandledKeyEventManager.m2359a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m2359a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (unhandledKeyEventManager.f3656b == null) {
                    unhandledKeyEventManager.f3656b = new SparseArray<>();
                }
                unhandledKeyEventManager.f3656b.put(keyCode, new WeakReference<>(m2359a));
            }
        }
        return m2359a != null;
    }

    @UiThread
    /* renamed from: h0 */
    public static void m2202h0(@NonNull View view, @Nullable CharSequence charSequence) {
        new C02562(C2507R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).m2244e(view, charSequence);
        if (charSequence == null) {
            AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager = f3644g;
            accessibilityPaneVisibilityManager.f3645b.remove(view);
            view.removeOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            Api16Impl.m2260o(view.getViewTreeObserver(), accessibilityPaneVisibilityManager);
            return;
        }
        AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager2 = f3644g;
        accessibilityPaneVisibilityManager2.f3645b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
        view.addOnAttachStateChangeListener(accessibilityPaneVisibilityManager2);
        if (Api19Impl.m2280b(view)) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(accessibilityPaneVisibilityManager2);
        }
    }

    /* renamed from: i */
    public static int m2203i() {
        return Api17Impl.m2265a();
    }

    /* renamed from: i0 */
    public static void m2204i0(@NonNull View view, @Nullable Drawable drawable) {
        Api16Impl.m2262q(view, drawable);
    }

    @Nullable
    /* renamed from: j */
    public static AccessibilityDelegateCompat m2205j(@NonNull View view) {
        View.AccessibilityDelegate m2207k = m2207k(view);
        if (m2207k == null) {
            return null;
        }
        return m2207k instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) m2207k).f3572a : new AccessibilityDelegateCompat(m2207k);
    }

    /* renamed from: j0 */
    public static void m2206j0(@NonNull View view, @Nullable ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        Api21Impl.m2305q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (Api21Impl.m2295g(view) == null && Api21Impl.m2296h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            Api16Impl.m2262q(view, background);
        }
    }

    @Nullable
    /* renamed from: k */
    public static View.AccessibilityDelegate m2207k(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.m2349a(view);
        }
        if (f3640c) {
            return null;
        }
        if (f3639b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3639b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3640c = true;
                return null;
            }
        }
        try {
            Object obj = f3639b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3640c = true;
            return null;
        }
    }

    /* renamed from: k0 */
    public static void m2208k0(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        Api21Impl.m2306r(view, mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (Api21Impl.m2295g(view) == null && Api21Impl.m2296h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            Api16Impl.m2262q(view, background);
        }
    }

    @Nullable
    @UiThread
    /* renamed from: l */
    public static CharSequence m2209l(@NonNull View view) {
        return new C02562(C2507R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).m2243d(view);
    }

    /* renamed from: l0 */
    public static void m2210l0(@NonNull View view, @Nullable Rect rect) {
        Api18Impl.m2278c(view, rect);
    }

    /* renamed from: m */
    public static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> m2211m(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C2507R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C2507R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: m0 */
    public static void m2212m0(@NonNull View view, float f2) {
        Api21Impl.m2307s(view, f2);
    }

    @Nullable
    /* renamed from: n */
    public static ColorStateList m2213n(@NonNull View view) {
        return Api21Impl.m2295g(view);
    }

    /* renamed from: n0 */
    public static void m2214n0(@NonNull View view, boolean z) {
        Api16Impl.m2263r(view, z);
    }

    @Nullable
    /* renamed from: o */
    public static PorterDuff.Mode m2215o(@NonNull View view) {
        return Api21Impl.m2296h(view);
    }

    @UiThread
    /* renamed from: o0 */
    public static void m2216o0(@NonNull View view, int i2) {
        Api16Impl.m2264s(view, i2);
    }

    @Nullable
    /* renamed from: p */
    public static Rect m2217p(@NonNull View view) {
        return Api18Impl.m2276a(view);
    }

    /* renamed from: p0 */
    public static void m2218p0(@NonNull View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m2336l(view, i2);
        }
    }

    @Nullable
    /* renamed from: q */
    public static Display m2219q(@NonNull View view) {
        return Api17Impl.m2266b(view);
    }

    /* renamed from: q0 */
    public static void m2220q0(@NonNull View view, @IdRes int i2) {
        Api17Impl.m2272h(view, i2);
    }

    /* renamed from: r */
    public static float m2221r(@NonNull View view) {
        return Api21Impl.m2297i(view);
    }

    /* renamed from: r0 */
    public static void m2222r0(@NonNull View view, boolean z) {
        Api21Impl.m2308t(view, z);
    }

    /* renamed from: s */
    public static Rect m2223s() {
        if (f3641d == null) {
            f3641d = new ThreadLocal<>();
        }
        Rect rect = f3641d.get();
        if (rect == null) {
            rect = new Rect();
            f3641d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: s0 */
    public static void m2224s0(@NonNull View view, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.m2309u(view, onApplyWindowInsetsListener);
    }

    /* renamed from: t */
    public static boolean m2225t(@NonNull View view) {
        return Api16Impl.m2247b(view);
    }

    /* renamed from: t0 */
    public static void m2226t0(@NonNull View view, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
        Api17Impl.m2275k(view, i2, i3, i4, i5);
    }

    /* renamed from: u */
    public static int m2227u(@NonNull View view) {
        return Api16Impl.m2248c(view);
    }

    /* renamed from: u0 */
    public static void m2228u0(@NonNull View view, @Nullable PointerIconCompat pointerIconCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.m2322d(view, pointerIconCompat != null ? pointerIconCompat.f3637a : null);
        }
    }

    @SuppressLint
    /* renamed from: v */
    public static int m2229v(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.m2326b(view);
        }
        return 0;
    }

    @UiThread
    /* renamed from: v0 */
    public static void m2230v0(@NonNull View view, boolean z) {
        new C02551(C2507R.id.tag_screen_reader_focusable, Boolean.class, 28).m2244e(view, Boolean.valueOf(z));
    }

    /* renamed from: w */
    public static int m2231w(@NonNull View view) {
        return Api17Impl.m2268d(view);
    }

    /* renamed from: w0 */
    public static void m2232w0(@NonNull View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.m2318d(view, i2, i3);
        }
    }

    /* renamed from: x */
    public static int m2233x(@NonNull View view) {
        return Api16Impl.m2249d(view);
    }

    @UiThread
    /* renamed from: x0 */
    public static void m2234x0(@NonNull View view, @Nullable CharSequence charSequence) {
        new C02573(C2507R.id.tag_state_description, CharSequence.class, 64, 30).m2244e(view, charSequence);
    }

    /* renamed from: y */
    public static int m2235y(@NonNull View view) {
        return Api16Impl.m2250e(view);
    }

    /* renamed from: y0 */
    public static void m2236y0(@NonNull View view, @Nullable String str) {
        Api21Impl.m2310v(view, str);
    }

    @Nullable
    /* renamed from: z */
    public static String[] m2237z(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.m2356a(view) : (String[]) view.getTag(C2507R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: z0 */
    public static void m2238z0(@NonNull View view, float f2) {
        Api21Impl.m2311w(view, f2);
    }

    public static abstract class AccessibilityViewProperty<T> {

        /* renamed from: a */
        public final int f3646a;

        /* renamed from: b */
        public final Class<T> f3647b;

        /* renamed from: c */
        public final int f3648c;

        /* renamed from: d */
        public final int f3649d;

        public AccessibilityViewProperty(int i2, Class<T> cls, int i3) {
            this.f3646a = i2;
            this.f3647b = cls;
            this.f3649d = 0;
            this.f3648c = i3;
        }

        /* renamed from: a */
        public boolean m2242a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: b */
        public abstract T mo2239b(View view);

        /* renamed from: c */
        public abstract void mo2240c(View view, T t);

        /* renamed from: d */
        public T m2243d(View view) {
            if (Build.VERSION.SDK_INT >= this.f3648c) {
                return mo2239b(view);
            }
            T t = (T) view.getTag(this.f3646a);
            if (this.f3647b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* renamed from: e */
        public void m2244e(View view, T t) {
            if (Build.VERSION.SDK_INT >= this.f3648c) {
                mo2240c(view, t);
                return;
            }
            if (mo2241f(m2243d(view), t)) {
                AccessibilityDelegateCompat m2205j = ViewCompat.m2205j(view);
                if (m2205j == null) {
                    m2205j = new AccessibilityDelegateCompat(AccessibilityDelegateCompat.f3569c);
                }
                ViewCompat.m2196e0(view, m2205j);
                view.setTag(this.f3646a, t);
                ViewCompat.m2177Q(view, this.f3649d);
            }
        }

        /* renamed from: f */
        public boolean mo2241f(T t, T t2) {
            return !t2.equals(t);
        }

        public AccessibilityViewProperty(int i2, Class<T> cls, int i3, int i4) {
            this.f3646a = i2;
            this.f3647b = cls;
            this.f3649d = i3;
            this.f3648c = i4;
        }
    }
}
