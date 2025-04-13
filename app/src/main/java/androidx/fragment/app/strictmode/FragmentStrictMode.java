package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: FragmentStrictMode.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "Flag", "OnViolationListener", "Policy", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FragmentStrictMode {

    /* renamed from: a */
    @NotNull
    public static final FragmentStrictMode f4520a = new FragmentStrictMode();

    /* renamed from: b */
    @NotNull
    public static Policy f4521b = Policy.f4531d;

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m31884d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public interface OnViolationListener {
        /* renamed from: a */
        void m3169a(@NotNull Violation violation);
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "Builder", "Companion", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Policy {

        /* renamed from: d */
        @JvmField
        @NotNull
        public static final Policy f4531d;

        /* renamed from: a */
        @NotNull
        public final Set<Flag> f4532a;

        /* renamed from: b */
        @Nullable
        public final OnViolationListener f4533b = null;

        /* renamed from: c */
        @NotNull
        public final Map<String, Set<Class<? extends Violation>>> f4534c;

        /* compiled from: FragmentStrictMode.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Builder {
            public Builder() {
                new LinkedHashSet();
                new LinkedHashMap();
            }
        }

        /* compiled from: FragmentStrictMode.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Companion;", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "LAX", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
        }

        static {
            Map map;
            EmptySet emptySet = EmptySet.f63146b;
            map = EmptyMap.f63145b;
            f4531d = new Policy(emptySet, null, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Policy(@NotNull Set<? extends Flag> set, @Nullable OnViolationListener onViolationListener, @NotNull Map<String, ? extends Set<Class<? extends Violation>>> map) {
            this.f4532a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f4534c = linkedHashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @RestrictTo
    /* renamed from: d */
    public static final void m3163d(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        Intrinsics.m32179h(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        FragmentStrictMode fragmentStrictMode = f4520a;
        fragmentStrictMode.m3166c(fragmentReuseViolation);
        Policy m3164a = fragmentStrictMode.m3164a(fragment);
        if (m3164a.f4532a.contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.m3168f(m3164a, fragment.getClass(), FragmentReuseViolation.class)) {
            fragmentStrictMode.m3165b(m3164a, fragmentReuseViolation);
        }
    }

    /* renamed from: a */
    public final Policy m3164a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                Intrinsics.m32178g(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f4521b;
    }

    /* renamed from: b */
    public final void m3165b(Policy policy, Violation violation) {
        Fragment fragment = violation.f4535b;
        String name = fragment.getClass().getName();
        if (policy.f4532a.contains(Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        if (policy.f4533b != null) {
            m3167e(fragment, new RunnableC0207a(policy, violation, 2));
        }
        if (policy.f4532a.contains(Flag.PENALTY_DEATH)) {
            m3167e(fragment, new RunnableC0207a(name, violation, 3));
        }
    }

    /* renamed from: c */
    public final void m3166c(Violation violation) {
        if (FragmentManager.m2992Q(3)) {
            StringBuilder m24u = C0000a.m24u("StrictMode violation in ");
            m24u.append(violation.f4535b.getClass().getName());
            Log.d("FragmentManager", m24u.toString(), violation);
        }
    }

    /* renamed from: e */
    public final void m3167e(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            ((RunnableC0207a) runnable).run();
            return;
        }
        Handler handler = fragment.getParentFragmentManager().f4358v.f4313d;
        Intrinsics.m32178g(handler, "fragment.parentFragmentManager.host.handler");
        if (Intrinsics.m32174c(handler.getLooper(), Looper.myLooper())) {
            ((RunnableC0207a) runnable).run();
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: f */
    public final boolean m3168f(Policy policy, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        Set<Class<? extends Violation>> set = policy.f4534c.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.m32174c(cls2.getSuperclass(), Violation.class) || !CollectionsKt.m32034n(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
