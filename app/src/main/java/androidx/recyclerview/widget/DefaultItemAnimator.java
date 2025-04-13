package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {

    /* renamed from: s */
    public static TimeInterpolator f5193s;

    /* renamed from: h */
    public ArrayList<RecyclerView.ViewHolder> f5194h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.ViewHolder> f5195i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<MoveInfo> f5196j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<ChangeInfo> f5197k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.ViewHolder>> f5198l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<MoveInfo>> f5199m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<ChangeInfo>> f5200n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.ViewHolder> f5201o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.ViewHolder> f5202p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.ViewHolder> f5203q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.ViewHolder> f5204r = new ArrayList<>();

    public static class ChangeInfo {

        /* renamed from: a */
        public RecyclerView.ViewHolder f5233a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f5234b;

        /* renamed from: c */
        public int f5235c;

        /* renamed from: d */
        public int f5236d;

        /* renamed from: e */
        public int f5237e;

        /* renamed from: f */
        public int f5238f;

        public ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
            this.f5233a = viewHolder;
            this.f5234b = viewHolder2;
            this.f5235c = i2;
            this.f5236d = i3;
            this.f5237e = i4;
            this.f5238f = i5;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("ChangeInfo{oldHolder=");
            m24u.append(this.f5233a);
            m24u.append(", newHolder=");
            m24u.append(this.f5234b);
            m24u.append(", fromX=");
            m24u.append(this.f5235c);
            m24u.append(", fromY=");
            m24u.append(this.f5236d);
            m24u.append(", toX=");
            m24u.append(this.f5237e);
            m24u.append(", toY=");
            return C0000a.m17n(m24u, this.f5238f, '}');
        }
    }

    public static class MoveInfo {

        /* renamed from: a */
        public RecyclerView.ViewHolder f5239a;

        /* renamed from: b */
        public int f5240b;

        /* renamed from: c */
        public int f5241c;

        /* renamed from: d */
        public int f5242d;

        /* renamed from: e */
        public int f5243e;

        public MoveInfo(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
            this.f5239a = viewHolder;
            this.f5240b = i2;
            this.f5241c = i3;
            this.f5242d = i4;
            this.f5243e = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: g */
    public boolean mo3523g(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
        return !list.isEmpty() || mo3851f(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: j */
    public void mo3524j(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.f5196j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f5196j.get(size).f5239a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener = this.f5553a;
                if (itemAnimatorListener != null) {
                    itemAnimatorListener.mo3856a(viewHolder);
                }
                this.f5196j.remove(size);
            }
        }
        m3534v(this.f5197k, viewHolder);
        if (this.f5194h.remove(viewHolder)) {
            view.setAlpha(1.0f);
            RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener2 = this.f5553a;
            if (itemAnimatorListener2 != null) {
                itemAnimatorListener2.mo3856a(viewHolder);
            }
        }
        if (this.f5195i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener3 = this.f5553a;
            if (itemAnimatorListener3 != null) {
                itemAnimatorListener3.mo3856a(viewHolder);
            }
        }
        int size2 = this.f5200n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<ChangeInfo> arrayList = this.f5200n.get(size2);
            m3534v(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f5200n.remove(size2);
            }
        }
        int size3 = this.f5199m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<MoveInfo> arrayList2 = this.f5199m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f5239a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener4 = this.f5553a;
                    if (itemAnimatorListener4 != null) {
                        itemAnimatorListener4.mo3856a(viewHolder);
                    }
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5199m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f5198l.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f5203q.remove(viewHolder);
                this.f5201o.remove(viewHolder);
                this.f5204r.remove(viewHolder);
                this.f5202p.remove(viewHolder);
                m3533u();
                return;
            }
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f5198l.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener5 = this.f5553a;
                if (itemAnimatorListener5 != null) {
                    itemAnimatorListener5.mo3856a(viewHolder);
                }
                if (arrayList3.isEmpty()) {
                    this.f5198l.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: k */
    public void mo3525k() {
        int size = this.f5196j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = this.f5196j.get(size);
            View view = moveInfo.f5239a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m3852h(moveInfo.f5239a);
            this.f5196j.remove(size);
        }
        int size2 = this.f5194h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m3852h(this.f5194h.get(size2));
            this.f5194h.remove(size2);
        }
        int size3 = this.f5195i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = this.f5195i.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener = this.f5553a;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.mo3856a(viewHolder);
            }
            this.f5195i.remove(size3);
        }
        int size4 = this.f5197k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            ChangeInfo changeInfo = this.f5197k.get(size4);
            RecyclerView.ViewHolder viewHolder2 = changeInfo.f5233a;
            if (viewHolder2 != null) {
                m3535w(changeInfo, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = changeInfo.f5234b;
            if (viewHolder3 != null) {
                m3535w(changeInfo, viewHolder3);
            }
        }
        this.f5197k.clear();
        if (!mo3526l()) {
            return;
        }
        int size5 = this.f5199m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<MoveInfo> arrayList = this.f5199m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    MoveInfo moveInfo2 = arrayList.get(size6);
                    View view2 = moveInfo2.f5239a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m3852h(moveInfo2.f5239a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5199m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f5198l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f5198l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.ViewHolder viewHolder4 = arrayList2.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener2 = this.f5553a;
                    if (itemAnimatorListener2 != null) {
                        itemAnimatorListener2.mo3856a(viewHolder4);
                    }
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5198l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f5200n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                m3532t(this.f5203q);
                m3532t(this.f5202p);
                m3532t(this.f5201o);
                m3532t(this.f5204r);
                m3853i();
                return;
            }
            ArrayList<ChangeInfo> arrayList3 = this.f5200n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    ChangeInfo changeInfo2 = arrayList3.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = changeInfo2.f5233a;
                    if (viewHolder5 != null) {
                        m3535w(changeInfo2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = changeInfo2.f5234b;
                    if (viewHolder6 != null) {
                        m3535w(changeInfo2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f5200n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: l */
    public boolean mo3526l() {
        return (this.f5195i.isEmpty() && this.f5197k.isEmpty() && this.f5196j.isEmpty() && this.f5194h.isEmpty() && this.f5202p.isEmpty() && this.f5203q.isEmpty() && this.f5201o.isEmpty() && this.f5204r.isEmpty() && this.f5199m.isEmpty() && this.f5198l.isEmpty() && this.f5200n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: n */
    public void mo3527n() {
        boolean z = !this.f5194h.isEmpty();
        boolean z2 = !this.f5196j.isEmpty();
        boolean z3 = !this.f5197k.isEmpty();
        boolean z4 = !this.f5195i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it = this.f5194h.iterator();
            while (it.hasNext()) {
                final RecyclerView.ViewHolder next = it.next();
                final View view = next.itemView;
                final ViewPropertyAnimator animate = view.animate();
                this.f5203q.add(next);
                animate.setDuration(this.f5556d).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        DefaultItemAnimator.this.m3852h(next);
                        DefaultItemAnimator.this.f5203q.remove(next);
                        DefaultItemAnimator.this.m3533u();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Objects.requireNonNull(DefaultItemAnimator.this);
                    }
                }).start();
            }
            this.f5194h.clear();
            if (z2) {
                final ArrayList<MoveInfo> arrayList = new ArrayList<>();
                arrayList.addAll(this.f5196j);
                this.f5199m.add(arrayList);
                this.f5196j.clear();
                Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            MoveInfo moveInfo = (MoveInfo) it2.next();
                            final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                            final RecyclerView.ViewHolder viewHolder = moveInfo.f5239a;
                            int i2 = moveInfo.f5240b;
                            int i3 = moveInfo.f5241c;
                            int i4 = moveInfo.f5242d;
                            int i5 = moveInfo.f5243e;
                            Objects.requireNonNull(defaultItemAnimator);
                            final View view2 = viewHolder.itemView;
                            final int i6 = i4 - i2;
                            final int i7 = i5 - i3;
                            if (i6 != 0) {
                                view2.animate().translationX(0.0f);
                            }
                            if (i7 != 0) {
                                view2.animate().translationY(0.0f);
                            }
                            final ViewPropertyAnimator animate2 = view2.animate();
                            defaultItemAnimator.f5202p.add(viewHolder);
                            animate2.setDuration(defaultItemAnimator.f5557e).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationCancel(Animator animator) {
                                    if (i6 != 0) {
                                        view2.setTranslationX(0.0f);
                                    }
                                    if (i7 != 0) {
                                        view2.setTranslationY(0.0f);
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    animate2.setListener(null);
                                    DefaultItemAnimator.this.m3852h(viewHolder);
                                    DefaultItemAnimator.this.f5202p.remove(viewHolder);
                                    DefaultItemAnimator.this.m3533u();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationStart(Animator animator) {
                                    Objects.requireNonNull(DefaultItemAnimator.this);
                                }
                            }).start();
                        }
                        arrayList.clear();
                        DefaultItemAnimator.this.f5199m.remove(arrayList);
                    }
                };
                if (z) {
                    ViewCompat.m2185Y(arrayList.get(0).f5239a.itemView, runnable, this.f5556d);
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final ArrayList<ChangeInfo> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f5197k);
                this.f5200n.add(arrayList2);
                this.f5197k.clear();
                Runnable runnable2 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            final ChangeInfo changeInfo = (ChangeInfo) it2.next();
                            final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                            Objects.requireNonNull(defaultItemAnimator);
                            RecyclerView.ViewHolder viewHolder = changeInfo.f5233a;
                            final View view2 = viewHolder == null ? null : viewHolder.itemView;
                            RecyclerView.ViewHolder viewHolder2 = changeInfo.f5234b;
                            final View view3 = viewHolder2 != null ? viewHolder2.itemView : null;
                            if (view2 != null) {
                                final ViewPropertyAnimator duration = view2.animate().setDuration(defaultItemAnimator.f5558f);
                                defaultItemAnimator.f5204r.add(changeInfo.f5233a);
                                duration.translationX(changeInfo.f5237e - changeInfo.f5235c);
                                duration.translationY(changeInfo.f5238f - changeInfo.f5236d);
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator) {
                                        duration.setListener(null);
                                        view2.setAlpha(1.0f);
                                        view2.setTranslationX(0.0f);
                                        view2.setTranslationY(0.0f);
                                        DefaultItemAnimator.this.m3951s(changeInfo.f5233a, true);
                                        DefaultItemAnimator.this.f5204r.remove(changeInfo.f5233a);
                                        DefaultItemAnimator.this.m3533u();
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationStart(Animator animator) {
                                        DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                        RecyclerView.ViewHolder viewHolder3 = changeInfo.f5233a;
                                        Objects.requireNonNull(defaultItemAnimator2);
                                    }
                                }).start();
                            }
                            if (view3 != null) {
                                final ViewPropertyAnimator animate2 = view3.animate();
                                defaultItemAnimator.f5204r.add(changeInfo.f5234b);
                                animate2.translationX(0.0f).translationY(0.0f).setDuration(defaultItemAnimator.f5558f).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.8
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator) {
                                        animate2.setListener(null);
                                        view3.setAlpha(1.0f);
                                        view3.setTranslationX(0.0f);
                                        view3.setTranslationY(0.0f);
                                        DefaultItemAnimator.this.m3951s(changeInfo.f5234b, false);
                                        DefaultItemAnimator.this.f5204r.remove(changeInfo.f5234b);
                                        DefaultItemAnimator.this.m3533u();
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationStart(Animator animator) {
                                        DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                        RecyclerView.ViewHolder viewHolder3 = changeInfo.f5234b;
                                        Objects.requireNonNull(defaultItemAnimator2);
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        DefaultItemAnimator.this.f5200n.remove(arrayList2);
                    }
                };
                if (z) {
                    ViewCompat.m2185Y(arrayList2.get(0).f5233a.itemView, runnable2, this.f5556d);
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f5195i);
                this.f5198l.add(arrayList3);
                this.f5195i.clear();
                Runnable runnable3 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            final RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it2.next();
                            final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                            Objects.requireNonNull(defaultItemAnimator);
                            final View view2 = viewHolder.itemView;
                            final ViewPropertyAnimator animate2 = view2.animate();
                            defaultItemAnimator.f5201o.add(viewHolder);
                            animate2.alpha(1.0f).setDuration(defaultItemAnimator.f5555c).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.5
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationCancel(Animator animator) {
                                    view2.setAlpha(1.0f);
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    animate2.setListener(null);
                                    DefaultItemAnimator.this.m3852h(viewHolder);
                                    DefaultItemAnimator.this.f5201o.remove(viewHolder);
                                    DefaultItemAnimator.this.m3533u();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationStart(Animator animator) {
                                    Objects.requireNonNull(DefaultItemAnimator.this);
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        DefaultItemAnimator.this.f5198l.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    ViewCompat.m2185Y(arrayList3.get(0).itemView, runnable3, Math.max(z2 ? this.f5557e : 0L, z3 ? this.f5558f : 0L) + (z ? this.f5556d : 0L));
                } else {
                    runnable3.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    /* renamed from: o */
    public boolean mo3528o(RecyclerView.ViewHolder viewHolder) {
        m3536x(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f5195i.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    /* renamed from: p */
    public boolean mo3529p(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        if (viewHolder == viewHolder2) {
            return mo3530q(viewHolder, i2, i3, i4, i5);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        m3536x(viewHolder);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        m3536x(viewHolder2);
        viewHolder2.itemView.setTranslationX(-((int) ((i4 - i2) - translationX)));
        viewHolder2.itemView.setTranslationY(-((int) ((i5 - i3) - translationY)));
        viewHolder2.itemView.setAlpha(0.0f);
        this.f5197k.add(new ChangeInfo(viewHolder, viewHolder2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    /* renamed from: q */
    public boolean mo3530q(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        View view = viewHolder.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
        m3536x(viewHolder);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            m3852h(viewHolder);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f5196j.add(new MoveInfo(viewHolder, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    /* renamed from: r */
    public boolean mo3531r(RecyclerView.ViewHolder viewHolder) {
        m3536x(viewHolder);
        this.f5194h.add(viewHolder);
        return true;
    }

    /* renamed from: t */
    public void m3532t(List<RecyclerView.ViewHolder> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).itemView.animate().cancel();
            }
        }
    }

    /* renamed from: u */
    public void m3533u() {
        if (mo3526l()) {
            return;
        }
        m3853i();
    }

    /* renamed from: v */
    public final void m3534v(List<ChangeInfo> list, RecyclerView.ViewHolder viewHolder) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ChangeInfo changeInfo = list.get(size);
            if (m3535w(changeInfo, viewHolder) && changeInfo.f5233a == null && changeInfo.f5234b == null) {
                list.remove(changeInfo);
            }
        }
    }

    /* renamed from: w */
    public final boolean m3535w(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        if (changeInfo.f5234b == viewHolder) {
            changeInfo.f5234b = null;
        } else {
            if (changeInfo.f5233a != viewHolder) {
                return false;
            }
            changeInfo.f5233a = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener = this.f5553a;
        if (itemAnimatorListener == null) {
            return true;
        }
        itemAnimatorListener.mo3856a(viewHolder);
        return true;
    }

    /* renamed from: x */
    public final void m3536x(RecyclerView.ViewHolder viewHolder) {
        if (f5193s == null) {
            f5193s = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f5193s);
        mo3524j(viewHolder);
    }
}
