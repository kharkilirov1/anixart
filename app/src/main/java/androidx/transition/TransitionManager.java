package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class TransitionManager {

    /* renamed from: a */
    public static Transition f6297a = new AutoTransition();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> f6298b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f6299c = new ArrayList<>();

    public static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public Transition f6300b;

        /* renamed from: c */
        public ViewGroup f6301c;

        public MultiListener(Transition transition, ViewGroup viewGroup) {
            this.f6300b = transition;
            this.f6301c = viewGroup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01f1 A[EDGE_INSN: B:123:0x01f1->B:124:0x01f1 BREAK  A[LOOP:1: B:17:0x009a->B:30:0x01e7], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 697
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionManager.MultiListener.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f6301c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6301c.removeOnAttachStateChangeListener(this);
            TransitionManager.f6299c.remove(this.f6301c);
            ArrayList<Transition> arrayList = TransitionManager.m4258c().get(this.f6301c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo4227E(this.f6301c);
                }
            }
            this.f6300b.m4243j(true);
        }
    }

    /* renamed from: a */
    public static void m4256a(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        if (f6299c.contains(viewGroup) || !ViewCompat.m2174N(viewGroup)) {
            return;
        }
        f6299c.add(viewGroup);
        if (transition == null) {
            transition = f6297a;
        }
        Transition clone = transition.clone();
        m4260e(viewGroup, clone);
        viewGroup.setTag(C2507R.id.transition_current_scene, null);
        if (clone != null) {
            MultiListener multiListener = new MultiListener(clone, viewGroup);
            viewGroup.addOnAttachStateChangeListener(multiListener);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
        }
    }

    /* renamed from: b */
    public static void m4257b(ViewGroup viewGroup) {
        f6299c.remove(viewGroup);
        ArrayList<Transition> arrayList = m4258c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((Transition) arrayList2.get(size)).mo4248p(viewGroup);
        }
    }

    /* renamed from: c */
    public static ArrayMap<ViewGroup, ArrayList<Transition>> m4258c() {
        ArrayMap<ViewGroup, ArrayList<Transition>> arrayMap;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference = f6298b.get();
        if (weakReference != null && (arrayMap = weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> arrayMap2 = new ArrayMap<>();
        f6298b.set(new WeakReference<>(arrayMap2));
        return arrayMap2;
    }

    /* renamed from: d */
    public static void m4259d(@NonNull Scene scene, @Nullable Transition transition) {
        ViewGroup viewGroup = scene.f6249a;
        if (f6299c.contains(viewGroup)) {
            return;
        }
        Scene.m4219b(viewGroup);
        f6299c.add(viewGroup);
        Transition clone = transition.clone();
        m4260e(viewGroup, clone);
        scene.m4220a();
        MultiListener multiListener = new MultiListener(clone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    /* renamed from: e */
    public static void m4260e(ViewGroup viewGroup, Transition transition) {
        Runnable runnable;
        ArrayList<Transition> arrayList = m4258c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo4254y(viewGroup);
            }
        }
        if (transition != null) {
            transition.m4242i(viewGroup, true);
        }
        Scene scene = (Scene) viewGroup.getTag(C2507R.id.transition_current_scene);
        if (scene == null || Scene.m4219b(scene.f6249a) != scene || (runnable = scene.f6251c) == null) {
            return;
        }
        runnable.run();
    }
}
