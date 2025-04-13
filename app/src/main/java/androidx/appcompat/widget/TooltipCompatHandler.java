package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l */
    public static TooltipCompatHandler f1657l;

    /* renamed from: m */
    public static TooltipCompatHandler f1658m;

    /* renamed from: b */
    public final View f1659b;

    /* renamed from: c */
    public final CharSequence f1660c;

    /* renamed from: d */
    public final int f1661d;

    /* renamed from: g */
    public int f1664g;

    /* renamed from: h */
    public int f1665h;

    /* renamed from: i */
    public TooltipPopup f1666i;

    /* renamed from: j */
    public boolean f1667j;

    /* renamed from: e */
    public final Runnable f1662e = new RunnableC0142a(this, 0);

    /* renamed from: f */
    public final Runnable f1663f = new RunnableC0142a(this, 1);

    /* renamed from: k */
    public boolean f1668k = true;

    public TooltipCompatHandler(View view, CharSequence charSequence) {
        this.f1659b = view;
        this.f1660c = charSequence;
        this.f1661d = ViewConfigurationCompat.m2363c(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m1000b(TooltipCompatHandler tooltipCompatHandler) {
        TooltipCompatHandler tooltipCompatHandler2 = f1657l;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.f1659b.removeCallbacks(tooltipCompatHandler2.f1662e);
        }
        f1657l = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.f1659b.postDelayed(tooltipCompatHandler.f1662e, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public void m1001a() {
        if (f1658m == this) {
            f1658m = null;
            TooltipPopup tooltipPopup = this.f1666i;
            if (tooltipPopup != null) {
                tooltipPopup.m1003a();
                this.f1666i = null;
                this.f1668k = true;
                this.f1659b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1657l == this) {
            m1000b(null);
        }
        this.f1659b.removeCallbacks(this.f1663f);
    }

    /* renamed from: c */
    public void m1002c(boolean z) {
        int height;
        int i2;
        long j2;
        int longPressTimeout;
        long j3;
        if (ViewCompat.m2173M(this.f1659b)) {
            m1000b(null);
            TooltipCompatHandler tooltipCompatHandler = f1658m;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.m1001a();
            }
            f1658m = this;
            this.f1667j = z;
            TooltipPopup tooltipPopup = new TooltipPopup(this.f1659b.getContext());
            this.f1666i = tooltipPopup;
            View view = this.f1659b;
            int i3 = this.f1664g;
            int i4 = this.f1665h;
            boolean z2 = this.f1667j;
            CharSequence charSequence = this.f1660c;
            if (tooltipPopup.f1670b.getParent() != null) {
                tooltipPopup.m1003a();
            }
            tooltipPopup.f1671c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = tooltipPopup.f1672d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = tooltipPopup.f1669a.getResources().getDimensionPixelOffset(C2507R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i3 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = tooltipPopup.f1669a.getResources().getDimensionPixelOffset(C2507R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = tooltipPopup.f1669a.getResources().getDimensionPixelOffset(z2 ? C2507R.dimen.tooltip_y_offset_touch : C2507R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(tooltipPopup.f1673e);
                Rect rect = tooltipPopup.f1673e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = tooltipPopup.f1669a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    tooltipPopup.f1673e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(tooltipPopup.f1675g);
                view.getLocationOnScreen(tooltipPopup.f1674f);
                int[] iArr = tooltipPopup.f1674f;
                int i5 = iArr[0];
                int[] iArr2 = tooltipPopup.f1675g;
                iArr[0] = i5 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                tooltipPopup.f1670b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = tooltipPopup.f1670b.getMeasuredHeight();
                int[] iArr3 = tooltipPopup.f1674f;
                int i6 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = iArr3[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= tooltipPopup.f1673e.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) tooltipPopup.f1669a.getSystemService("window")).addView(tooltipPopup.f1670b, tooltipPopup.f1672d);
            this.f1659b.addOnAttachStateChangeListener(this);
            if (this.f1667j) {
                j3 = 2500;
            } else {
                if ((ViewCompat.m2168H(this.f1659b) & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - longPressTimeout;
            }
            this.f1659b.removeCallbacks(this.f1663f);
            this.f1659b.postDelayed(this.f1663f, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1666i != null && this.f1667j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1659b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 7) {
            if (action == 10) {
                this.f1668k = true;
                m1001a();
            }
        } else if (this.f1659b.isEnabled() && this.f1666i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f1668k || Math.abs(x - this.f1664g) > this.f1661d || Math.abs(y - this.f1665h) > this.f1661d) {
                this.f1664g = x;
                this.f1665h = y;
                this.f1668k = false;
            } else {
                z = false;
            }
            if (z) {
                m1000b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1664g = view.getWidth() / 2;
        this.f1665h = view.getHeight() / 2;
        m1002c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m1001a();
    }
}
