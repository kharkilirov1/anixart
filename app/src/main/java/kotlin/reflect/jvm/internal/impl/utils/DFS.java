package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class DFS {

    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* renamed from: b */
        public void mo33541b(N n) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* renamed from: c */
        public boolean mo32251c(N n) {
            return true;
        }
    }

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {

        /* renamed from: a */
        @NotNull
        public final C f66480a;

        public CollectingNodeHandler(@NotNull C c2) {
            this.f66480a = c2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* renamed from: a */
        public Object mo32484a() {
            return this.f66480a;
        }
    }

    public interface Neighbors<N> {
        @NotNull
        /* renamed from: a */
        Iterable<? extends N> mo32250a(N n);
    }

    public interface NodeHandler<N, R> {
        /* renamed from: a */
        R mo32484a();

        /* renamed from: b */
        void mo33541b(N n);

        /* renamed from: c */
        boolean mo32251c(N n);
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
        public NodeHandlerWithListResult() {
            super(new LinkedList());
        }
    }

    public interface Visited<N> {
        /* renamed from: a */
        boolean mo33777a(N n);
    }

    public static class VisitedWithSet<N> implements Visited<N> {

        /* renamed from: a */
        public final Set<N> f66481a = new HashSet();

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        /* renamed from: a */
        public boolean mo33777a(N n) {
            return this.f66481a.add(n);
        }
    }

    /* renamed from: a */
    public static <N, R> R m33774a(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull NodeHandler<N, R> nodeHandler) {
        VisitedWithSet visitedWithSet = new VisitedWithSet();
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            m33775b(it.next(), neighbors, visitedWithSet, nodeHandler);
        }
        return nodeHandler.mo32484a();
    }

    /* renamed from: b */
    public static <N> void m33775b(@NotNull N n, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, ?> nodeHandler) {
        if (visited.mo33777a(n) && nodeHandler.mo32251c(n)) {
            Iterator<? extends N> it = neighbors.mo32250a(n).iterator();
            while (it.hasNext()) {
                m33775b(it.next(), neighbors, visited, nodeHandler);
            }
            nodeHandler.mo33541b(n);
        }
    }

    /* renamed from: c */
    public static <N> Boolean m33776c(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull final Function1<N, Boolean> function1) {
        final boolean[] zArr = new boolean[1];
        return (Boolean) m33774a(collection, neighbors, new AbstractNodeHandler<N, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.utils.DFS.1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: a */
            public Object mo32484a() {
                return Boolean.valueOf(zArr[0]);
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: c */
            public boolean mo32251c(N n) {
                if (((Boolean) Function1.this.invoke(n)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            }
        });
    }
}
