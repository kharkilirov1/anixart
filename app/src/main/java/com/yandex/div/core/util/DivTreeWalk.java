package com.yandex.div.core.util;

import com.yandex.div2.Div;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div/core/util/DivTreeWalk;", "Lkotlin/sequences/Sequence;", "Lcom/yandex/div2/Div;", "BranchNode", "DivTreeWalkIterator", "LeafNode", "Node", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTreeWalk implements Sequence<Div> {

    /* renamed from: a */
    @NotNull
    public final Div f31453a;

    /* renamed from: b */
    @Nullable
    public final Function1<Div, Boolean> f31454b;

    /* renamed from: c */
    @Nullable
    public final Function1<Div, Unit> f31455c;

    /* renamed from: d */
    public final int f31456d;

    /* compiled from: DivTreeWalk.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$BranchNode;", "Lcom/yandex/div/core/util/DivTreeWalk$Node;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class BranchNode implements Node {

        /* renamed from: a */
        @NotNull
        public final Div f31457a;

        /* renamed from: b */
        @Nullable
        public final Function1<Div, Boolean> f31458b;

        /* renamed from: c */
        @Nullable
        public final Function1<Div, Unit> f31459c;

        /* renamed from: d */
        public boolean f31460d;

        /* renamed from: e */
        @Nullable
        public List<? extends Div> f31461e;

        /* renamed from: f */
        public int f31462f;

        /* JADX WARN: Multi-variable type inference failed */
        public BranchNode(@NotNull Div div, @Nullable Function1<? super Div, Boolean> function1, @Nullable Function1<? super Div, Unit> function12) {
            this.f31457a = div;
            this.f31458b = function1;
            this.f31459c = function12;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        /* renamed from: a, reason: from getter */
        public Div getF31465a() {
            return this.f31457a;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        /* renamed from: b */
        public Div mo16753b() {
            ArrayList arrayList;
            if (!this.f31460d) {
                Function1<Div, Boolean> function1 = this.f31458b;
                boolean z = false;
                if (function1 != null && !function1.invoke(this.f31457a).booleanValue()) {
                    z = true;
                }
                if (z) {
                    return null;
                }
                this.f31460d = true;
                return this.f31457a;
            }
            List<? extends Div> list = this.f31461e;
            if (list == null) {
                Div div = this.f31457a;
                if (div instanceof Div.Text) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Image) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.GifImage) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Separator) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Indicator) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Slider) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Input) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Custom) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Select) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Video) {
                    list = EmptyList.f63144b;
                } else if (div instanceof Div.Container) {
                    list = ((Div.Container) div).f34421c.f34953t;
                } else if (div instanceof Div.Grid) {
                    list = ((Div.Grid) div).f34425c.f36481t;
                } else if (div instanceof Div.Gallery) {
                    list = ((Div.Gallery) div).f34423c.f35956r;
                } else if (div instanceof Div.Pager) {
                    list = ((Div.Pager) div).f34429c.f37799o;
                } else {
                    if (div instanceof Div.Tabs) {
                        List<DivTabs.Item> list2 = ((Div.Tabs) div).f34434c.f39522o;
                        arrayList = new ArrayList(CollectionsKt.m32032m(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((DivTabs.Item) it.next()).f39540a);
                        }
                    } else {
                        if (!(div instanceof Div.State)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<DivState.State> list3 = ((Div.State) div).f34433c.f39242s;
                        arrayList = new ArrayList();
                        Iterator<T> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            Div div2 = ((DivState.State) it2.next()).f39259c;
                            if (div2 != null) {
                                arrayList.add(div2);
                            }
                        }
                    }
                    list = arrayList;
                }
                this.f31461e = list;
            }
            if (this.f31462f < list.size()) {
                int i2 = this.f31462f;
                this.f31462f = i2 + 1;
                return list.get(i2);
            }
            Function1<Div, Unit> function12 = this.f31459c;
            if (function12 == null) {
                return null;
            }
            function12.invoke(this.f31457a);
            return null;
        }
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$DivTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Lcom/yandex/div2/Div;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class DivTreeWalkIterator extends AbstractIterator<Div> {

        /* renamed from: d */
        @NotNull
        public final ArrayDeque<Node> f31463d;

        /* renamed from: e */
        public final /* synthetic */ DivTreeWalk f31464e;

        public DivTreeWalkIterator(@NotNull DivTreeWalk divTreeWalk, Div root) {
            Intrinsics.m32179h(root, "root");
            this.f31464e = divTreeWalk;
            ArrayDeque<Node> arrayDeque = new ArrayDeque<>();
            arrayDeque.addLast(m16756f(root));
            this.f31463d = arrayDeque;
        }

        @Override // kotlin.collections.AbstractIterator
        /* renamed from: a */
        public void mo16754a() {
            Div m16755d = m16755d();
            if (m16755d != null) {
                m31904c(m16755d);
            } else {
                m31903b();
            }
        }

        /* renamed from: d */
        public final Div m16755d() {
            Node m31921t = this.f31463d.m31921t();
            if (m31921t == null) {
                return null;
            }
            Div mo16753b = m31921t.mo16753b();
            if (mo16753b == null) {
                this.f31463d.removeLast();
                return m16755d();
            }
            if (Intrinsics.m32174c(mo16753b, m31921t.getF31465a()) || (!DivUtilKt.m16762e(mo16753b)) || this.f31463d.getF63177d() >= this.f31464e.f31456d) {
                return mo16753b;
            }
            this.f31463d.addLast(m16756f(mo16753b));
            return m16755d();
        }

        /* renamed from: f */
        public final Node m16756f(Div div) {
            if (!DivUtilKt.m16762e(div)) {
                return new LeafNode(div);
            }
            DivTreeWalk divTreeWalk = this.f31464e;
            return new BranchNode(div, divTreeWalk.f31454b, divTreeWalk.f31455c);
        }
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$LeafNode;", "Lcom/yandex/div/core/util/DivTreeWalk$Node;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class LeafNode implements Node {

        /* renamed from: a */
        @NotNull
        public final Div f31465a;

        /* renamed from: b */
        public boolean f31466b;

        public LeafNode(@NotNull Div div) {
            this.f31465a = div;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        /* renamed from: a, reason: from getter */
        public Div getF31465a() {
            return this.f31465a;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        /* renamed from: b */
        public Div mo16753b() {
            if (this.f31466b) {
                return null;
            }
            this.f31466b = true;
            return this.f31465a;
        }
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$Node;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface Node {
        @NotNull
        /* renamed from: a */
        Div getF31465a();

        @Nullable
        /* renamed from: b */
        Div mo16753b();
    }

    public DivTreeWalk(@NotNull Div div) {
        this.f31453a = div;
        this.f31454b = null;
        this.f31455c = null;
        this.f31456d = Integer.MAX_VALUE;
    }

    @NotNull
    /* renamed from: b */
    public final DivTreeWalk m16751b(@NotNull Function1<? super Div, Boolean> predicate) {
        Intrinsics.m32179h(predicate, "predicate");
        return new DivTreeWalk(this.f31453a, predicate, this.f31455c, this.f31456d);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Div> iterator() {
        return new DivTreeWalkIterator(this, this.f31453a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivTreeWalk(Div div, Function1<? super Div, Boolean> function1, Function1<? super Div, Unit> function12, int i2) {
        this.f31453a = div;
        this.f31454b = function1;
        this.f31455c = function12;
        this.f31456d = i2;
    }
}
