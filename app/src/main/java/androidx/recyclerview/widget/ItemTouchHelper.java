package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {

    /* renamed from: A */
    public ItemTouchHelperGestureListener f5339A;

    /* renamed from: C */
    public Rect f5341C;

    /* renamed from: D */
    public long f5342D;

    /* renamed from: e */
    public float f5346e;

    /* renamed from: f */
    public float f5347f;

    /* renamed from: g */
    public float f5348g;

    /* renamed from: h */
    public float f5349h;

    /* renamed from: i */
    public float f5350i;

    /* renamed from: j */
    public float f5351j;

    /* renamed from: k */
    public float f5352k;

    /* renamed from: l */
    public float f5353l;

    /* renamed from: n */
    @NonNull
    public Callback f5355n;

    /* renamed from: p */
    public int f5357p;

    /* renamed from: r */
    public int f5359r;

    /* renamed from: s */
    public RecyclerView f5360s;

    /* renamed from: u */
    public VelocityTracker f5362u;

    /* renamed from: v */
    public List<RecyclerView.ViewHolder> f5363v;

    /* renamed from: w */
    public List<Integer> f5364w;

    /* renamed from: z */
    public GestureDetectorCompat f5367z;

    /* renamed from: b */
    public final List<View> f5343b = new ArrayList();

    /* renamed from: c */
    public final float[] f5344c = new float[2];

    /* renamed from: d */
    public RecyclerView.ViewHolder f5345d = null;

    /* renamed from: m */
    public int f5354m = -1;

    /* renamed from: o */
    public int f5356o = 0;

    /* renamed from: q */
    @VisibleForTesting
    public List<RecoverAnimation> f5358q = new ArrayList();

    /* renamed from: t */
    public final Runnable f5361t = new Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.1
        /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0102 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 306
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.RunnableC05111.run():void");
        }
    };

    /* renamed from: x */
    public View f5365x = null;

    /* renamed from: y */
    public int f5366y = -1;

    /* renamed from: B */
    public final RecyclerView.OnItemTouchListener f5340B = new RecyclerView.OnItemTouchListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.2
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* renamed from: a */
        public void mo3577a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            ItemTouchHelper.this.f5367z.m2082a(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.f5362u;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.f5354m == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.f5354m);
            if (findPointerIndex >= 0) {
                ItemTouchHelper.this.m3636k(actionMasked, motionEvent, findPointerIndex);
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.f5345d;
            if (viewHolder == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        itemTouchHelper.m3644t(motionEvent, itemTouchHelper.f5357p, findPointerIndex);
                        ItemTouchHelper.this.m3641q(viewHolder);
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        itemTouchHelper2.f5360s.removeCallbacks(itemTouchHelper2.f5361t);
                        ItemTouchHelper.this.f5361t.run();
                        ItemTouchHelper.this.f5360s.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                    if (pointerId == itemTouchHelper3.f5354m) {
                        itemTouchHelper3.f5354m = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                        itemTouchHelper4.m3644t(motionEvent, itemTouchHelper4.f5357p, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = itemTouchHelper.f5362u;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            ItemTouchHelper.this.m3643s(null, 0);
            ItemTouchHelper.this.f5354m = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* renamed from: c */
        public boolean mo3578c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int findPointerIndex;
            ItemTouchHelper.this.f5367z.m2082a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            RecoverAnimation recoverAnimation = null;
            if (actionMasked == 0) {
                ItemTouchHelper.this.f5354m = motionEvent.getPointerId(0);
                ItemTouchHelper.this.f5346e = motionEvent.getX();
                ItemTouchHelper.this.f5347f = motionEvent.getY();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                VelocityTracker velocityTracker = itemTouchHelper.f5362u;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                itemTouchHelper.f5362u = VelocityTracker.obtain();
                ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                if (itemTouchHelper2.f5345d == null) {
                    if (!itemTouchHelper2.f5358q.isEmpty()) {
                        View m3639n = itemTouchHelper2.m3639n(motionEvent);
                        int size = itemTouchHelper2.f5358q.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            RecoverAnimation recoverAnimation2 = itemTouchHelper2.f5358q.get(size);
                            if (recoverAnimation2.f5386e.itemView == m3639n) {
                                recoverAnimation = recoverAnimation2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (recoverAnimation != null) {
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        itemTouchHelper3.f5346e -= recoverAnimation.f5390i;
                        itemTouchHelper3.f5347f -= recoverAnimation.f5391j;
                        itemTouchHelper3.m3638m(recoverAnimation.f5386e, true);
                        if (ItemTouchHelper.this.f5343b.remove(recoverAnimation.f5386e.itemView)) {
                            ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                            itemTouchHelper4.f5355n.mo3649d(itemTouchHelper4.f5360s, recoverAnimation.f5386e);
                        }
                        ItemTouchHelper.this.m3643s(recoverAnimation.f5386e, recoverAnimation.f5387f);
                        ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                        itemTouchHelper5.m3644t(motionEvent, itemTouchHelper5.f5357p, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper itemTouchHelper6 = ItemTouchHelper.this;
                itemTouchHelper6.f5354m = -1;
                itemTouchHelper6.m3643s(null, 0);
            } else {
                int i2 = ItemTouchHelper.this.f5354m;
                if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    ItemTouchHelper.this.m3636k(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = ItemTouchHelper.this.f5362u;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return ItemTouchHelper.this.f5345d != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* renamed from: e */
        public void mo3579e(boolean z) {
            if (z) {
                ItemTouchHelper.this.m3643s(null, 0);
            }
        }
    };

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$5 */
    class C05155 implements RecyclerView.ChildDrawingOrderCallback {

        /* renamed from: a */
        public final /* synthetic */ ItemTouchHelper f5376a;

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        /* renamed from: a */
        public int mo3645a(int i2, int i3) {
            ItemTouchHelper itemTouchHelper = this.f5376a;
            View view = itemTouchHelper.f5365x;
            if (view == null) {
                return i3;
            }
            int i4 = itemTouchHelper.f5366y;
            if (i4 == -1) {
                i4 = itemTouchHelper.f5360s.indexOfChild(view);
                this.f5376a.f5366y = i4;
            }
            return i3 == i2 + (-1) ? i4 : i3 < i4 ? i3 : i3 + 1;
        }
    }

    public static abstract class Callback {

        /* renamed from: b */
        public static final Interpolator f5377b = new InterpolatorC05161();

        /* renamed from: c */
        public static final Interpolator f5378c = new InterpolatorC05172();

        /* renamed from: a */
        public int f5379a = -1;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$1 */
        public class InterpolatorC05161 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                return f2 * f2 * f2 * f2 * f2;
            }
        }

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$2 */
        public class InterpolatorC05172 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        }

        /* renamed from: f */
        public static int m3646f(int i2, int i3) {
            int i4;
            int i5 = i2 & 789516;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= (-789517) & i7;
                i4 = (i7 & 789516) << 2;
            }
            return i6 | i4;
        }

        /* renamed from: b */
        public boolean mo3647b(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        /* renamed from: c */
        public RecyclerView.ViewHolder mo3648c(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<RecyclerView.ViewHolder> list, int i2, int i3) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = viewHolder.itemView.getWidth() + i2;
            int height = viewHolder.itemView.getHeight() + i3;
            int left2 = i2 - viewHolder.itemView.getLeft();
            int top2 = i3 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i4 = -1;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i5);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i4) {
                    viewHolder2 = viewHolder3;
                    i4 = abs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i2) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs3 = Math.abs(left)) > i4) {
                    viewHolder2 = viewHolder3;
                    i4 = abs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i3) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs2 = Math.abs(top)) > i4) {
                    viewHolder2 = viewHolder3;
                    i4 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs = Math.abs(bottom)) > i4) {
                    viewHolder2 = viewHolder3;
                    i4 = abs;
                }
            }
            return viewHolder2;
        }

        /* renamed from: d */
        public void mo3649d(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            Object tag = view.getTag(C2507R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                ViewCompat.m2212m0(view, ((Float) tag).floatValue());
            }
            view.setTag(C2507R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        /* renamed from: e */
        public int m3650e(int i2, int i3) {
            int i4;
            int i5 = i2 & 3158064;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= (-3158065) & i7;
                i4 = (i7 & 3158064) >> 2;
            }
            return i6 | i4;
        }

        /* renamed from: g */
        public final int m3651g(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return m3650e(mo3653i(recyclerView, viewHolder), ViewCompat.m2231w(recyclerView));
        }

        /* renamed from: h */
        public float mo3652h(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        /* renamed from: i */
        public abstract int mo3653i(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder);

        /* renamed from: j */
        public float mo3654j(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        /* renamed from: k */
        public int m3655k(@NonNull RecyclerView recyclerView, int i2, int i3, long j2) {
            if (this.f5379a == -1) {
                this.f5379a = recyclerView.getResources().getDimensionPixelSize(C2507R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int signum = (int) (((int) (((int) Math.signum(i3)) * this.f5379a * ((InterpolatorC05172) f5378c).getInterpolation(Math.min(1.0f, (Math.abs(i3) * 1.0f) / i2)))) * ((InterpolatorC05161) f5377b).getInterpolation(j2 <= 2000 ? j2 / 2000.0f : 1.0f));
            return signum == 0 ? i3 > 0 ? 1 : -1 : signum;
        }

        /* renamed from: l */
        public void mo3656l(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
            View view = viewHolder.itemView;
            if (z && view.getTag(C2507R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(ViewCompat.m2221r(view));
                int childCount = recyclerView.getChildCount();
                float f4 = 0.0f;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = recyclerView.getChildAt(i3);
                    if (childAt != view) {
                        float m2221r = ViewCompat.m2221r(childAt);
                        if (m2221r > f4) {
                            f4 = m2221r;
                        }
                    }
                }
                ViewCompat.m2212m0(view, f4 + 1.0f);
                view.setTag(C2507R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f2);
            view.setTranslationY(f3);
        }

        /* renamed from: m */
        public void mo3657m(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
            View view = viewHolder.itemView;
        }

        /* renamed from: n */
        public abstract boolean mo3658n(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2);

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: o */
        public void mo3659o(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i2, @NonNull RecyclerView.ViewHolder viewHolder2, int i3, int i4, int i5) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).mo3662l(viewHolder.itemView, viewHolder2.itemView, i4, i5);
                return;
            }
            if (layoutManager.mo3700v()) {
                if (layoutManager.m3873U(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.m3818s0(i3);
                }
                if (layoutManager.m3878X(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.m3818s0(i3);
                }
            }
            if (layoutManager.mo3701w()) {
                if (layoutManager.m3879Y(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.m3818s0(i3);
                }
                if (layoutManager.m3872T(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.m3818s0(i3);
                }
            }
        }

        /* renamed from: p */
        public void mo3660p(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
        }

        /* renamed from: q */
        public abstract void mo3661q(@NonNull RecyclerView.ViewHolder viewHolder, int i2);
    }

    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f5380b = true;

        public ItemTouchHelperGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m3639n;
            RecyclerView.ViewHolder m3783Q;
            if (!this.f5380b || (m3639n = ItemTouchHelper.this.m3639n(motionEvent)) == null || (m3783Q = ItemTouchHelper.this.f5360s.m3783Q(m3639n)) == null) {
                return;
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            Callback callback = itemTouchHelper.f5355n;
            RecyclerView recyclerView = itemTouchHelper.f5360s;
            if ((callback.m3650e(callback.mo3653i(recyclerView, m3783Q), ViewCompat.m2231w(recyclerView)) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i2 = ItemTouchHelper.this.f5354m;
                if (pointerId == i2) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.f5346e = x;
                    itemTouchHelper2.f5347f = y;
                    itemTouchHelper2.f5351j = 0.0f;
                    itemTouchHelper2.f5350i = 0.0f;
                    Objects.requireNonNull(itemTouchHelper2.f5355n);
                    ItemTouchHelper.this.m3643s(m3783Q, 2);
                }
            }
        }
    }

    @VisibleForTesting
    public static class RecoverAnimation implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f5382a;

        /* renamed from: b */
        public final float f5383b;

        /* renamed from: c */
        public final float f5384c;

        /* renamed from: d */
        public final float f5385d;

        /* renamed from: e */
        public final RecyclerView.ViewHolder f5386e;

        /* renamed from: f */
        public final int f5387f;

        /* renamed from: g */
        @VisibleForTesting
        public final ValueAnimator f5388g;

        /* renamed from: h */
        public boolean f5389h;

        /* renamed from: i */
        public float f5390i;

        /* renamed from: j */
        public float f5391j;

        /* renamed from: k */
        public boolean f5392k = false;

        /* renamed from: l */
        public boolean f5393l = false;

        /* renamed from: m */
        public float f5394m;

        public RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f5387f = i3;
            this.f5386e = viewHolder;
            this.f5382a = f2;
            this.f5383b = f3;
            this.f5384c = f4;
            this.f5385d = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5388g = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecoverAnimation.this.f5394m = valueAnimator.getAnimatedFraction();
                }
            });
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            this.f5394m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5394m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5393l) {
                this.f5386e.setIsRecyclable(true);
            }
            this.f5393l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class SimpleCallback extends Callback {
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        /* renamed from: i */
        public int mo3653i(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return 0;
        }
    }

    public interface ViewDropHandler {
        /* renamed from: l */
        void mo3662l(@NonNull View view, @NonNull View view2, int i2, int i3);
    }

    public ItemTouchHelper(@NonNull Callback callback) {
        this.f5355n = callback;
    }

    /* renamed from: p */
    public static boolean m3631p(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    /* renamed from: b */
    public void mo3632b(@NonNull View view) {
        m3642r(view);
        RecyclerView.ViewHolder m3783Q = this.f5360s.m3783Q(view);
        if (m3783Q == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.f5345d;
        if (viewHolder != null && m3783Q == viewHolder) {
            m3643s(null, 0);
            return;
        }
        m3638m(m3783Q, false);
        if (this.f5343b.remove(m3783Q.itemView)) {
            this.f5355n.mo3649d(this.f5360s, m3783Q);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    /* renamed from: d */
    public void mo3633d(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: f */
    public void mo3404f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: g */
    public void mo3576g(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f2;
        float f3;
        this.f5366y = -1;
        if (this.f5345d != null) {
            m3640o(this.f5344c);
            float[] fArr = this.f5344c;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        Callback callback = this.f5355n;
        RecyclerView.ViewHolder viewHolder = this.f5345d;
        List<RecoverAnimation> list = this.f5358q;
        int i2 = this.f5356o;
        Objects.requireNonNull(callback);
        int i3 = 0;
        for (int size = list.size(); i3 < size; size = size) {
            RecoverAnimation recoverAnimation = list.get(i3);
            float f5 = recoverAnimation.f5382a;
            float f6 = recoverAnimation.f5384c;
            if (f5 == f6) {
                recoverAnimation.f5390i = recoverAnimation.f5386e.itemView.getTranslationX();
            } else {
                recoverAnimation.f5390i = C0000a.m4a(f6, f5, recoverAnimation.f5394m, f5);
            }
            float f7 = recoverAnimation.f5383b;
            float f8 = recoverAnimation.f5385d;
            if (f7 == f8) {
                recoverAnimation.f5391j = recoverAnimation.f5386e.itemView.getTranslationY();
            } else {
                recoverAnimation.f5391j = C0000a.m4a(f8, f7, recoverAnimation.f5394m, f7);
            }
            int save = canvas.save();
            callback.mo3656l(canvas, recyclerView, recoverAnimation.f5386e, recoverAnimation.f5390i, recoverAnimation.f5391j, recoverAnimation.f5387f, false);
            canvas.restoreToCount(save);
            i3++;
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            callback.mo3656l(canvas, recyclerView, viewHolder, f2, f3, i2, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: h */
    public void mo3405h(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f2;
        float f3;
        if (this.f5345d != null) {
            m3640o(this.f5344c);
            float[] fArr = this.f5344c;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        Callback callback = this.f5355n;
        RecyclerView.ViewHolder viewHolder = this.f5345d;
        List<RecoverAnimation> list = this.f5358q;
        int i2 = this.f5356o;
        Objects.requireNonNull(callback);
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            RecoverAnimation recoverAnimation = list.get(i3);
            int save = canvas.save();
            callback.mo3657m(canvas, recyclerView, recoverAnimation.f5386e, recoverAnimation.f5390i, recoverAnimation.f5391j, recoverAnimation.f5387f, false);
            canvas.restoreToCount(save);
            i3++;
            list = list;
            i2 = i2;
            size = size;
        }
        int i4 = size;
        int i5 = i2;
        List<RecoverAnimation> list2 = list;
        if (viewHolder != null) {
            int save2 = canvas.save();
            callback.mo3657m(canvas, recyclerView, viewHolder, f2, f3, i5, true);
            canvas.restoreToCount(save2);
        }
        boolean z = false;
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            RecoverAnimation recoverAnimation2 = list2.get(i6);
            boolean z2 = recoverAnimation2.f5393l;
            if (z2 && !recoverAnimation2.f5389h) {
                list2.remove(i6);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* renamed from: i */
    public void m3634i(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5360s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m3805l0(this);
            RecyclerView recyclerView3 = this.f5360s;
            RecyclerView.OnItemTouchListener onItemTouchListener = this.f5340B;
            recyclerView3.f5527r.remove(onItemTouchListener);
            if (recyclerView3.f5529s == onItemTouchListener) {
                recyclerView3.f5529s = null;
            }
            List<RecyclerView.OnChildAttachStateChangeListener> list = this.f5360s.f5474D;
            if (list != null) {
                list.remove(this);
            }
            for (int size = this.f5358q.size() - 1; size >= 0; size--) {
                RecoverAnimation recoverAnimation = this.f5358q.get(0);
                recoverAnimation.f5388g.cancel();
                this.f5355n.mo3649d(this.f5360s, recoverAnimation.f5386e);
            }
            this.f5358q.clear();
            this.f5365x = null;
            this.f5366y = -1;
            VelocityTracker velocityTracker = this.f5362u;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5362u = null;
            }
            ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.f5339A;
            if (itemTouchHelperGestureListener != null) {
                itemTouchHelperGestureListener.f5380b = false;
                this.f5339A = null;
            }
            if (this.f5367z != null) {
                this.f5367z = null;
            }
        }
        this.f5360s = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f5348g = resources.getDimension(C2507R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f5349h = resources.getDimension(C2507R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f5359r = ViewConfiguration.get(this.f5360s.getContext()).getScaledTouchSlop();
            this.f5360s.mo3802k(this);
            this.f5360s.f5527r.add(this.f5340B);
            this.f5360s.m3804l(this);
            this.f5339A = new ItemTouchHelperGestureListener();
            this.f5367z = new GestureDetectorCompat(this.f5360s.getContext(), this.f5339A);
        }
    }

    /* renamed from: j */
    public final int m3635j(RecyclerView.ViewHolder viewHolder, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = this.f5350i > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f5362u;
        if (velocityTracker != null && this.f5354m > -1) {
            Callback callback = this.f5355n;
            float f2 = this.f5349h;
            Objects.requireNonNull(callback);
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.f5362u.getXVelocity(this.f5354m);
            float yVelocity = this.f5362u.getYVelocity(this.f5354m);
            int i4 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i4 & i2) != 0 && i3 == i4) {
                Callback callback2 = this.f5355n;
                float f3 = this.f5348g;
                Objects.requireNonNull(callback2);
                if (abs >= f3 && abs > Math.abs(yVelocity)) {
                    return i4;
                }
            }
        }
        float mo3654j = this.f5355n.mo3654j(viewHolder) * this.f5360s.getWidth();
        if ((i2 & i3) == 0 || Math.abs(this.f5350i) <= mo3654j) {
            return 0;
        }
        return i3;
    }

    /* renamed from: k */
    public void m3636k(int i2, MotionEvent motionEvent, int i3) {
        int m3651g;
        View m3639n;
        if (this.f5345d == null && i2 == 2 && this.f5356o != 2) {
            Objects.requireNonNull(this.f5355n);
            if (this.f5360s.getScrollState() == 1) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = this.f5360s.getLayoutManager();
            int i4 = this.f5354m;
            RecyclerView.ViewHolder viewHolder = null;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float x = motionEvent.getX(findPointerIndex) - this.f5346e;
                float y = motionEvent.getY(findPointerIndex) - this.f5347f;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                float f2 = this.f5359r;
                if ((abs >= f2 || abs2 >= f2) && ((abs <= abs2 || !layoutManager.mo3700v()) && ((abs2 <= abs || !layoutManager.mo3701w()) && (m3639n = m3639n(motionEvent)) != null))) {
                    viewHolder = this.f5360s.m3783Q(m3639n);
                }
            }
            if (viewHolder == null || (m3651g = (this.f5355n.m3651g(this.f5360s, viewHolder) & 65280) >> 8) == 0) {
                return;
            }
            float x2 = motionEvent.getX(i3);
            float y2 = motionEvent.getY(i3);
            float f3 = x2 - this.f5346e;
            float f4 = y2 - this.f5347f;
            float abs3 = Math.abs(f3);
            float abs4 = Math.abs(f4);
            float f5 = this.f5359r;
            if (abs3 >= f5 || abs4 >= f5) {
                if (abs3 > abs4) {
                    if (f3 < 0.0f && (m3651g & 4) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (m3651g & 8) == 0) {
                        return;
                    }
                } else {
                    if (f4 < 0.0f && (m3651g & 1) == 0) {
                        return;
                    }
                    if (f4 > 0.0f && (m3651g & 2) == 0) {
                        return;
                    }
                }
                this.f5351j = 0.0f;
                this.f5350i = 0.0f;
                this.f5354m = motionEvent.getPointerId(0);
                m3643s(viewHolder, 1);
            }
        }
    }

    /* renamed from: l */
    public final int m3637l(RecyclerView.ViewHolder viewHolder, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = this.f5351j > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f5362u;
        if (velocityTracker != null && this.f5354m > -1) {
            Callback callback = this.f5355n;
            float f2 = this.f5349h;
            Objects.requireNonNull(callback);
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.f5362u.getXVelocity(this.f5354m);
            float yVelocity = this.f5362u.getYVelocity(this.f5354m);
            int i4 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i4 & i2) != 0 && i4 == i3) {
                Callback callback2 = this.f5355n;
                float f3 = this.f5348g;
                Objects.requireNonNull(callback2);
                if (abs >= f3 && abs > Math.abs(xVelocity)) {
                    return i4;
                }
            }
        }
        float mo3654j = this.f5355n.mo3654j(viewHolder) * this.f5360s.getHeight();
        if ((i2 & i3) == 0 || Math.abs(this.f5351j) <= mo3654j) {
            return 0;
        }
        return i3;
    }

    /* renamed from: m */
    public void m3638m(RecyclerView.ViewHolder viewHolder, boolean z) {
        RecoverAnimation recoverAnimation;
        int size = this.f5358q.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                recoverAnimation = this.f5358q.get(size);
            }
        } while (recoverAnimation.f5386e != viewHolder);
        recoverAnimation.f5392k |= z;
        if (!recoverAnimation.f5393l) {
            recoverAnimation.f5388g.cancel();
        }
        this.f5358q.remove(size);
    }

    /* renamed from: n */
    public View m3639n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.f5345d;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (m3631p(view, x, y, this.f5352k + this.f5350i, this.f5353l + this.f5351j)) {
                return view;
            }
        }
        for (int size = this.f5358q.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.f5358q.get(size);
            View view2 = recoverAnimation.f5386e.itemView;
            if (m3631p(view2, x, y, recoverAnimation.f5390i, recoverAnimation.f5391j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f5360s;
        int m3497d = recyclerView.f5503f.m3497d();
        while (true) {
            m3497d--;
            if (m3497d < 0) {
                return null;
            }
            View m3496c = recyclerView.f5503f.m3496c(m3497d);
            float translationX = m3496c.getTranslationX();
            float translationY = m3496c.getTranslationY();
            if (x >= m3496c.getLeft() + translationX && x <= m3496c.getRight() + translationX && y >= m3496c.getTop() + translationY && y <= m3496c.getBottom() + translationY) {
                return m3496c;
            }
        }
    }

    /* renamed from: o */
    public final void m3640o(float[] fArr) {
        if ((this.f5357p & 12) != 0) {
            fArr[0] = (this.f5352k + this.f5350i) - this.f5345d.itemView.getLeft();
        } else {
            fArr[0] = this.f5345d.itemView.getTranslationX();
        }
        if ((this.f5357p & 3) != 0) {
            fArr[1] = (this.f5353l + this.f5351j) - this.f5345d.itemView.getTop();
        } else {
            fArr[1] = this.f5345d.itemView.getTranslationY();
        }
    }

    /* renamed from: q */
    public void m3641q(RecyclerView.ViewHolder viewHolder) {
        int i2;
        int i3;
        if (!this.f5360s.isLayoutRequested() && this.f5356o == 2) {
            float mo3652h = this.f5355n.mo3652h(viewHolder);
            int i4 = (int) (this.f5352k + this.f5350i);
            int i5 = (int) (this.f5353l + this.f5351j);
            if (Math.abs(i5 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * mo3652h || Math.abs(i4 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * mo3652h) {
                List<RecyclerView.ViewHolder> list = this.f5363v;
                if (list == null) {
                    this.f5363v = new ArrayList();
                    this.f5364w = new ArrayList();
                } else {
                    list.clear();
                    this.f5364w.clear();
                }
                Objects.requireNonNull(this.f5355n);
                int round = Math.round(this.f5352k + this.f5350i) - 0;
                int round2 = Math.round(this.f5353l + this.f5351j) - 0;
                int width = viewHolder.itemView.getWidth() + round + 0;
                int height = viewHolder.itemView.getHeight() + round2 + 0;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                RecyclerView.LayoutManager layoutManager = this.f5360s.getLayoutManager();
                int m3869Q = layoutManager.m3869Q();
                int i8 = 0;
                while (i8 < m3869Q) {
                    View m3868P = layoutManager.m3868P(i8);
                    if (m3868P != viewHolder.itemView && m3868P.getBottom() >= round2 && m3868P.getTop() <= height && m3868P.getRight() >= round && m3868P.getLeft() <= width) {
                        RecyclerView.ViewHolder m3783Q = this.f5360s.m3783Q(m3868P);
                        i2 = round;
                        i3 = round2;
                        if (this.f5355n.mo3647b(this.f5360s, this.f5345d, m3783Q)) {
                            int abs = Math.abs(i6 - ((m3868P.getRight() + m3868P.getLeft()) / 2));
                            int abs2 = Math.abs(i7 - ((m3868P.getBottom() + m3868P.getTop()) / 2));
                            int i9 = (abs2 * abs2) + (abs * abs);
                            int size = this.f5363v.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (i11 < size) {
                                int i12 = size;
                                if (i9 <= this.f5364w.get(i11).intValue()) {
                                    break;
                                }
                                i10++;
                                i11++;
                                size = i12;
                            }
                            this.f5363v.add(i10, m3783Q);
                            this.f5364w.add(i10, Integer.valueOf(i9));
                        }
                    } else {
                        i2 = round;
                        i3 = round2;
                    }
                    i8++;
                    round = i2;
                    round2 = i3;
                }
                List<RecyclerView.ViewHolder> list2 = this.f5363v;
                if (list2.size() == 0) {
                    return;
                }
                RecyclerView.ViewHolder mo3648c = this.f5355n.mo3648c(viewHolder, list2, i4, i5);
                if (mo3648c == null) {
                    this.f5363v.clear();
                    this.f5364w.clear();
                    return;
                }
                int absoluteAdapterPosition = mo3648c.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                if (this.f5355n.mo3658n(this.f5360s, viewHolder, mo3648c)) {
                    this.f5355n.mo3659o(this.f5360s, viewHolder, absoluteAdapterPosition2, mo3648c, absoluteAdapterPosition, i4, i5);
                }
            }
        }
    }

    /* renamed from: r */
    public void m3642r(View view) {
        if (view == this.f5365x) {
            this.f5365x = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0094, code lost:
    
        if (r2 > 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01be  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3643s(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.m3643s(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: t */
    public void m3644t(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.f5346e;
        this.f5350i = f2;
        this.f5351j = y - this.f5347f;
        if ((i2 & 4) == 0) {
            this.f5350i = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.f5350i = Math.min(0.0f, this.f5350i);
        }
        if ((i2 & 1) == 0) {
            this.f5351j = Math.max(0.0f, this.f5351j);
        }
        if ((i2 & 2) == 0) {
            this.f5351j = Math.min(0.0f, this.f5351j);
        }
    }
}
