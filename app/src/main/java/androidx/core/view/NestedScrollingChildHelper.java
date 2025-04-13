package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewParentCompat;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollingChildHelper {

    /* renamed from: a */
    public ViewParent f3627a;

    /* renamed from: b */
    public ViewParent f3628b;

    /* renamed from: c */
    public final View f3629c;

    /* renamed from: d */
    public boolean f3630d;

    /* renamed from: e */
    public int[] f3631e;

    public NestedScrollingChildHelper(@NonNull View view) {
        this.f3629c = view;
    }

    /* renamed from: a */
    public boolean m2135a(float f2, float f3, boolean z) {
        ViewParent m2141g;
        if (!this.f3630d || (m2141g = m2141g(0)) == null) {
            return false;
        }
        try {
            return ViewParentCompat.Api21Impl.m2381a(m2141g, this.f3629c, f2, f3, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + m2141g + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    /* renamed from: b */
    public boolean m2136b(float f2, float f3) {
        ViewParent m2141g;
        if (!this.f3630d || (m2141g = m2141g(0)) == null) {
            return false;
        }
        try {
            return ViewParentCompat.Api21Impl.m2382b(m2141g, this.f3629c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + m2141g + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m2137c(int i2, int i3, @Nullable int[] iArr, @Nullable int[] iArr2, int i4) {
        ViewParent m2141g;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f3630d || (m2141g = m2141g(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr2 != null) {
                this.f3629c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i6 = iArr2[1];
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (iArr == null) {
                if (this.f3631e == null) {
                    this.f3631e = new int[2];
                }
                iArr3 = this.f3631e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f3629c;
            if (m2141g instanceof NestedScrollingParent2) {
                ((NestedScrollingParent2) m2141g).mo684p(view, i2, i3, iArr3, i4);
            } else if (i4 == 0) {
                try {
                    ViewParentCompat.Api21Impl.m2383c(m2141g, view, i2, i3, iArr3);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + m2141g + " does not implement interface method onNestedPreScroll", e2);
                }
            }
            if (iArr2 != null) {
                this.f3629c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i6;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }

    /* renamed from: d */
    public void m2138d(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6, @Nullable int[] iArr2) {
        m2140f(i2, i3, i4, i5, null, i6, iArr2);
    }

    /* renamed from: e */
    public boolean m2139e(int i2, int i3, int i4, int i5, @Nullable int[] iArr) {
        return m2140f(i2, i3, i4, i5, iArr, 0, null);
    }

    /* renamed from: f */
    public final boolean m2140f(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6, @Nullable int[] iArr2) {
        ViewParent m2141g;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f3630d || (m2141g = m2141g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3629c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f3631e == null) {
                this.f3631e = new int[2];
            }
            int[] iArr4 = this.f3631e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f3629c;
        if (m2141g instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) m2141g).mo675g(view, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (m2141g instanceof NestedScrollingParent2) {
                ((NestedScrollingParent2) m2141g).mo680l(view, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    ViewParentCompat.Api21Impl.m2384d(m2141g, view, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + m2141g + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            this.f3629c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    /* renamed from: g */
    public final ViewParent m2141g(int i2) {
        if (i2 == 0) {
            return this.f3627a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f3628b;
    }

    /* renamed from: h */
    public boolean m2142h(int i2) {
        return m2141g(i2) != null;
    }

    /* renamed from: i */
    public void m2143i(boolean z) {
        if (this.f3630d) {
            View view = this.f3629c;
            WeakHashMap<View, ViewPropertyAnimatorCompat> weakHashMap = ViewCompat.f3638a;
            ViewCompat.Api21Impl.m2314z(view);
        }
        this.f3630d = z;
    }

    /* renamed from: j */
    public boolean m2144j(int i2, int i3) {
        boolean m2386f;
        if (m2141g(i3) != null) {
            return true;
        }
        if (this.f3630d) {
            View view = this.f3629c;
            for (ViewParent parent = this.f3629c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f3629c;
                boolean z = parent instanceof NestedScrollingParent2;
                if (z) {
                    m2386f = ((NestedScrollingParent2) parent).mo681m(view, view2, i2, i3);
                } else {
                    if (i3 == 0) {
                        try {
                            m2386f = ViewParentCompat.Api21Impl.m2386f(parent, view, view2, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    m2386f = false;
                }
                if (m2386f) {
                    if (i3 == 0) {
                        this.f3627a = parent;
                    } else if (i3 == 1) {
                        this.f3628b = parent;
                    }
                    View view3 = this.f3629c;
                    if (z) {
                        ((NestedScrollingParent2) parent).mo682n(view, view3, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            ViewParentCompat.Api21Impl.m2385e(parent, view, view3, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m2145k(int i2) {
        ViewParent m2141g = m2141g(i2);
        if (m2141g != null) {
            View view = this.f3629c;
            if (m2141g instanceof NestedScrollingParent2) {
                ((NestedScrollingParent2) m2141g).mo683o(view, i2);
            } else if (i2 == 0) {
                try {
                    ViewParentCompat.Api21Impl.m2387g(m2141g, view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + m2141g + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f3627a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f3628b = null;
            }
        }
    }
}
