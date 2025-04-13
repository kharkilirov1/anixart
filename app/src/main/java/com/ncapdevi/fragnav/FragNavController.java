package com.ncapdevi.fragnav;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.room.util.C0576a;
import com.ncapdevi.fragnav.tabhistory.CurrentTabHistoryController;
import com.ncapdevi.fragnav.tabhistory.CurrentTabStrategy;
import com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController;
import com.ncapdevi.fragnav.tabhistory.NavigationStrategy;
import com.ncapdevi.fragnav.tabhistory.UniqueTabHistoryController;
import com.ncapdevi.fragnav.tabhistory.UniqueTabHistoryStrategy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p000a.C0000a;

/* compiled from: FragNavController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController;", "", "Companion", "DefaultFragNavPopController", "FragmentHideStrategy", "RootFragmentListener", "TabIndex", "TransactionListener", "TransactionType", "Transit", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class FragNavController {

    /* renamed from: n */
    public static final String f24555n = C0576a.m4116o(FragNavController.class, new StringBuilder(), ":EXTRA_TAG_COUNT");

    /* renamed from: o */
    public static final String f24556o = C0576a.m4116o(FragNavController.class, new StringBuilder(), ":EXTRA_SELECTED_TAB_INDEX");

    /* renamed from: p */
    public static final String f24557p = C0576a.m4116o(FragNavController.class, new StringBuilder(), ":EXTRA_CURRENT_FRAGMENT");

    /* renamed from: q */
    public static final String f24558q = C0576a.m4116o(FragNavController.class, new StringBuilder(), ":EXTRA_FRAGMENT_STACK");

    /* renamed from: a */
    @Nullable
    public FragNavLogger f24559a;

    /* renamed from: b */
    @Nullable
    public RootFragmentListener f24560b;

    /* renamed from: d */
    public int f24562d;

    /* renamed from: e */
    public boolean f24563e;

    /* renamed from: f */
    public int f24564f;

    /* renamed from: h */
    public int f24566h;

    /* renamed from: i */
    public Fragment f24567i;

    /* renamed from: l */
    public final FragmentManager f24570l;

    /* renamed from: m */
    public final int f24571m;

    /* renamed from: c */
    @NotNull
    public NavigationStrategy f24561c = new CurrentTabStrategy();

    /* renamed from: g */
    public final List<Stack<String>> f24565g = new ArrayList();

    /* renamed from: j */
    public FragNavTabHistoryController f24568j = new CurrentTabHistoryController(new DefaultFragNavPopController());

    /* renamed from: k */
    public final Map<String, WeakReference<Fragment>> f24569k = new LinkedHashMap();

    /* compiled from: FragNavController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004¨\u0006$"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController$Companion;", "", "", "DETACH", "I", "DETACH_ON_NAVIGATE_HIDE_ON_SWITCH", "", "EXTRA_CURRENT_FRAGMENT", "Ljava/lang/String;", "EXTRA_FRAGMENT_STACK", "EXTRA_SELECTED_TAB_INDEX", "EXTRA_TAG_COUNT", "HIDE", "MAX_NUM_TABS", "NO_TAB", "REMOVE", "TAB1", "TAB10", "TAB11", "TAB12", "TAB13", "TAB14", "TAB15", "TAB16", "TAB17", "TAB18", "TAB19", "TAB2", "TAB20", "TAB3", "TAB4", "TAB5", "TAB6", "TAB7", "TAB8", "TAB9", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* compiled from: FragNavController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController$DefaultFragNavPopController;", "Lcom/ncapdevi/fragnav/FragNavPopController;", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class DefaultFragNavPopController implements FragNavPopController {
        public DefaultFragNavPopController() {
        }

        @Override // com.ncapdevi.fragnav.FragNavPopController
        /* renamed from: a */
        public int mo13831a(int i2, @Nullable FragNavTransactionOptions fragNavTransactionOptions) throws UnsupportedOperationException {
            FragNavController fragNavController = FragNavController.this;
            if (fragNavController.f24561c instanceof CurrentTabStrategy) {
                Stack stack = (Stack) CollectionsKt.m32048y(fragNavController.f24565g, fragNavController.f24564f);
                if (stack != null && stack.size() == 1) {
                    throw new UnsupportedOperationException("You can not popFragment the rootFragment. If you need to change this fragment, use replaceFragment(fragment)");
                }
            }
            if (i2 < 1) {
                throw new UnsupportedOperationException("popFragments parameter needs to be greater than 0");
            }
            int i3 = fragNavController.f24564f;
            if (i3 == -1) {
                throw new UnsupportedOperationException("You can not pop fragments when no tab is selected");
            }
            Stack<String> stack2 = fragNavController.f24565g.get(i3);
            int size = stack2.size() - 1;
            if (i2 >= size) {
                fragNavController.m13816b(fragNavTransactionOptions);
                return size;
            }
            FragmentTransaction m13817c = fragNavController.m13817c(fragNavTransactionOptions, true, true);
            for (int i4 = 0; i4 < i2; i4++) {
                String pop = stack2.pop();
                Intrinsics.m32175d(pop, "currentStack.pop()");
                Fragment m13820f = fragNavController.m13820f(pop);
                if (m13820f != null) {
                    fragNavController.m13826n(m13817c, m13820f);
                }
            }
            Fragment m13815a = fragNavController.m13815a(m13817c, fragNavController.m13828p());
            m13817c.mo2936e();
            fragNavController.f24567i = m13815a;
            return i2;
        }
    }

    /* compiled from: FragNavController.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController$FragmentHideStrategy;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 1, 13})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface FragmentHideStrategy {
    }

    /* compiled from: FragNavController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController$RootFragmentListener;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public interface RootFragmentListener {
        /* renamed from: A2 */
        int mo13832A2();

        @NotNull
        /* renamed from: u3 */
        Fragment mo13833u3(int i2);
    }

    /* compiled from: FragNavController.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController$TabIndex;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 1, 13})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface TabIndex {
    }

    /* compiled from: FragNavController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController$TransactionListener;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public interface TransactionListener {
    }

    /* compiled from: FragNavController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController$TransactionType;", "", "PUSH", "POP", "REPLACE", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public enum TransactionType {
        /* JADX INFO: Fake field, exist only in values array */
        PUSH,
        /* JADX INFO: Fake field, exist only in values array */
        POP,
        /* JADX INFO: Fake field, exist only in values array */
        REPLACE
    }

    /* compiled from: FragNavController.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavController$Transit;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 1, 13})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface Transit {
    }

    public FragNavController(@NotNull FragmentManager fragmentManager, @IdRes int i2) {
        this.f24570l = fragmentManager;
        this.f24571m = i2;
    }

    @JvmOverloads
    /* renamed from: j */
    public static boolean m13812j(FragNavController fragNavController, FragNavTransactionOptions fragNavTransactionOptions, int i2) throws UnsupportedOperationException {
        if ((i2 & 1) != 0) {
            Objects.requireNonNull(fragNavController);
        }
        return fragNavController.f24568j.mo13841v0(1, null);
    }

    @JvmOverloads
    /* renamed from: l */
    public static /* synthetic */ void m13813l(FragNavController fragNavController, Fragment fragment, FragNavTransactionOptions fragNavTransactionOptions, int i2) {
        if ((i2 & 2) != 0) {
            Objects.requireNonNull(fragNavController);
        }
        fragNavController.m13824k(fragment, null);
    }

    @JvmOverloads
    /* renamed from: s */
    public static void m13814s(FragNavController fragNavController, int i2, FragNavTransactionOptions fragNavTransactionOptions, int i3) throws IndexOutOfBoundsException {
        if ((i3 & 2) != 0) {
            Objects.requireNonNull(fragNavController);
        }
        if (i2 >= fragNavController.f24565g.size()) {
            StringBuilder m25v = C0000a.m25v("Can't switch to a tab that hasn't been initialized, Index : ", i2, ", current stack size : ");
            m25v.append(fragNavController.f24565g.size());
            m25v.append(". Make sure to create all of the tabs you need in the Constructor or provide a way for them to be created via RootFragmentListener.");
            throw new IndexOutOfBoundsException(m25v.toString());
        }
        int i4 = fragNavController.f24564f;
        if (i4 != i2) {
            Fragment fragment = null;
            FragmentTransaction m13817c = fragNavController.m13817c(null, i2 < i4, true);
            fragNavController.m13825m(m13817c, fragNavController.m13829q(), fragNavController.m13830r());
            fragNavController.f24564f = i2;
            fragNavController.f24568j.mo13843t0(i2);
            if (i2 == -1) {
                m13817c.mo2936e();
            } else {
                fragment = fragNavController.m13815a(m13817c, fragNavController.m13829q() || fragNavController.m13830r());
                m13817c.mo2936e();
            }
            fragNavController.f24567i = fragment;
        }
    }

    /* renamed from: a */
    public final Fragment m13815a(FragmentTransaction fragmentTransaction, boolean z) {
        Stack<String> stack = this.f24565g.get(this.f24564f);
        int size = stack.size();
        Fragment fragment = null;
        String currentTag = null;
        int i2 = 0;
        while (fragment == null && (!stack.isEmpty())) {
            i2++;
            currentTag = stack.pop();
            Intrinsics.m32175d(currentTag, "currentTag");
            fragment = m13820f(currentTag);
        }
        if (fragment != null) {
            if (i2 > 1) {
                IllegalStateException illegalStateException = new IllegalStateException("Could not restore top fragment on current stack");
                FragNavLogger fragNavLogger = this.f24559a;
                if (fragNavLogger != null) {
                    fragNavLogger.mo13834a("Could not restore top fragment on current stack", illegalStateException);
                }
            }
            stack.push(currentTag);
            if (z) {
                fragmentTransaction.m3116d(fragment);
                return fragment;
            }
            fragmentTransaction.mo2946q(fragment);
            return fragment;
        }
        if (size > 0) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Could not restore any fragment on current stack, adding new root fragment");
            FragNavLogger fragNavLogger2 = this.f24559a;
            if (fragNavLogger2 != null) {
                fragNavLogger2.mo13834a("Could not restore any fragment on current stack, adding new root fragment", illegalStateException2);
            }
        }
        Fragment m13821g = m13821g(this.f24564f);
        String m13818d = m13818d(m13821g);
        stack.push(m13818d);
        int i3 = this.f24571m;
        this.f24569k.put(m13818d, new WeakReference<>(m13821g));
        fragmentTransaction.mo2941k(i3, m13821g, m13818d, 1);
        return m13821g;
    }

    @JvmOverloads
    /* renamed from: b */
    public final void m13816b(@Nullable FragNavTransactionOptions fragNavTransactionOptions) {
        int i2 = this.f24564f;
        if (i2 == -1) {
            return;
        }
        Stack<String> stack = this.f24565g.get(i2);
        if (stack.size() > 1) {
            FragmentTransaction m13817c = m13817c(fragNavTransactionOptions, true, i2 == this.f24564f);
            while (stack.size() > 1) {
                String pop = stack.pop();
                Intrinsics.m32175d(pop, "fragmentStack.pop()");
                Fragment m13820f = m13820f(pop);
                if (m13820f != null) {
                    m13826n(m13817c, m13820f);
                }
            }
            Fragment m13815a = m13815a(m13817c, m13828p());
            m13817c.mo2936e();
            this.f24567i = m13815a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckResult
    @SuppressLint
    /* renamed from: c */
    public final FragmentTransaction m13817c(FragNavTransactionOptions fragNavTransactionOptions, boolean z, boolean z2) {
        String str;
        FragmentTransaction m3024d = this.f24570l.m3024d();
        if (fragNavTransactionOptions != null) {
            if (z2) {
                if (z) {
                    m3024d.f4427b = 0;
                    m3024d.f4428c = 0;
                    m3024d.f4429d = 0;
                    m3024d.f4430e = 0;
                } else {
                    m3024d.f4427b = 0;
                    m3024d.f4428c = 0;
                    m3024d.f4429d = 0;
                    m3024d.f4430e = 0;
                }
            }
            m3024d.f4431f = 0;
            Iterator<T> it = fragNavTransactionOptions.f24574a.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                View view = (View) pair.f63055b;
                if (view != null && (str = (String) pair.f63056c) != null) {
                    m3024d.m3115c(view, str);
                }
            }
        }
        return m3024d;
    }

    @CheckResult
    /* renamed from: d */
    public final String m13818d(Fragment fragment) {
        StringBuilder sb = new StringBuilder();
        sb.append(fragment.getClass().getName());
        int i2 = this.f24566h + 1;
        this.f24566h = i2;
        sb.append(i2);
        return sb.toString();
    }

    @Nullable
    /* renamed from: e */
    public final Fragment m13819e() {
        Fragment fragment;
        Fragment fragment2 = this.f24567i;
        if (fragment2 != null && fragment2.isAdded() && (fragment = this.f24567i) != null && (!fragment.isDetached())) {
            return this.f24567i;
        }
        if (this.f24564f == -1 || this.f24565g.isEmpty()) {
            return null;
        }
        Stack<String> stack = this.f24565g.get(this.f24564f);
        if (!stack.isEmpty()) {
            String peek = stack.peek();
            Intrinsics.m32175d(peek, "fragmentStack.peek()");
            Fragment m13820f = m13820f(peek);
            if (m13820f != null) {
                this.f24567i = m13820f;
            }
        }
        return this.f24567i;
    }

    /* renamed from: f */
    public final Fragment m13820f(String str) {
        WeakReference<Fragment> weakReference = this.f24569k.get(str);
        if (weakReference != null) {
            Fragment fragment = weakReference.get();
            if (fragment != null) {
                return fragment;
            }
            this.f24569k.remove(str);
        }
        return this.f24570l.m3000H(str);
    }

    @CheckResult
    /* renamed from: g */
    public final Fragment m13821g(int i2) throws IllegalStateException {
        RootFragmentListener rootFragmentListener = this.f24560b;
        Fragment mo13833u3 = rootFragmentListener != null ? rootFragmentListener.mo13833u3(i2) : null;
        Fragment fragment = mo13833u3 != null ? mo13833u3 : null;
        if (fragment != null) {
            return fragment;
        }
        throw new IllegalStateException("Either you haven't past in a fragment at this index in your constructor, or you haven't provided a way to create it while via your RootFragmentListener.getRootFragment(index)");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0203  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m13822h(int r14, @org.jetbrains.annotations.Nullable android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ncapdevi.fragnav.FragNavController.m13822h(int, android.os.Bundle):void");
    }

    /* renamed from: i */
    public final void m13823i(@Nullable Bundle bundle) {
        bundle.putInt(f24555n, this.f24566h);
        bundle.putInt(f24556o, this.f24564f);
        Fragment m13819e = m13819e();
        if (m13819e != null) {
            bundle.putString(f24557p, m13819e.getTag());
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.f24565g.iterator();
            while (it.hasNext()) {
                Stack stack = (Stack) it.next();
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = stack.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put((String) it2.next());
                }
                jSONArray.put(jSONArray2);
            }
            bundle.putString(f24558q, jSONArray.toString());
        } catch (Throwable th) {
            FragNavLogger fragNavLogger = this.f24559a;
            if (fragNavLogger != null) {
                fragNavLogger.mo13834a("Could not save fragment stack", th);
            }
        }
        this.f24568j.mo13842w0(bundle);
    }

    @JvmOverloads
    /* renamed from: k */
    public final void m13824k(@Nullable Fragment fragment, @Nullable FragNavTransactionOptions fragNavTransactionOptions) {
        if (fragment == null || this.f24564f == -1) {
            return;
        }
        FragmentTransaction m13817c = m13817c(fragNavTransactionOptions, false, true);
        m13825m(m13817c, m13828p(), m13830r());
        String m13818d = m13818d(fragment);
        this.f24565g.get(this.f24564f).push(m13818d);
        int i2 = this.f24571m;
        this.f24569k.put(m13818d, new WeakReference<>(fragment));
        m13817c.mo2941k(i2, fragment, m13818d, 1);
        m13817c.mo2936e();
        this.f24567i = fragment;
    }

    /* renamed from: m */
    public final void m13825m(FragmentTransaction fragmentTransaction, boolean z, boolean z2) {
        Fragment m13819e = m13819e();
        if (m13819e != null) {
            if (z) {
                fragmentTransaction.mo2940i(m13819e);
            } else if (z2) {
                fragmentTransaction.mo2943m(m13819e);
            } else {
                fragmentTransaction.mo2942l(m13819e);
            }
        }
    }

    /* renamed from: n */
    public final void m13826n(@NotNull FragmentTransaction fragmentTransaction, Fragment fragment) {
        String tag = fragment.getTag();
        if (tag != null) {
            this.f24569k.remove(tag);
        }
        fragmentTransaction.mo2943m(fragment);
    }

    /* renamed from: o */
    public final void m13827o(@NotNull NavigationStrategy navigationStrategy) {
        this.f24561c = navigationStrategy;
        this.f24568j = new UniqueTabHistoryController(new DefaultFragNavPopController(), ((UniqueTabHistoryStrategy) navigationStrategy).f24579a);
    }

    /* renamed from: p */
    public final boolean m13828p() {
        return this.f24562d != 1;
    }

    /* renamed from: q */
    public final boolean m13829q() {
        return this.f24562d == 0;
    }

    /* renamed from: r */
    public final boolean m13830r() {
        return this.f24562d == 3;
    }
}
