package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import java.util.Iterator;

/* loaded from: classes.dex */
final class UndirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* renamed from: com.google.common.graph.UndirectedGraphConnections$1 */
    public class C18631 implements Function<N, EndpointPair<N>> {

        /* renamed from: b */
        public final /* synthetic */ Object f21748b;

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return new EndpointPair.Unordered(obj, this.f21748b, null);
        }
    }

    /* renamed from: com.google.common.graph.UndirectedGraphConnections$2 */
    public static /* synthetic */ class C18642 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21749a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f21749a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21749a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.common.graph.GraphConnections
    /* renamed from: a */
    public Iterator<EndpointPair<N>> mo11995a(N n) {
        throw null;
    }
}
