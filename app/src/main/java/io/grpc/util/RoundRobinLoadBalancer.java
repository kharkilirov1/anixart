package io.grpc.util;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.EquivalentAddressGroup;
import io.grpc.LoadBalancer;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
final class RoundRobinLoadBalancer extends LoadBalancer {

    /* renamed from: f */
    @VisibleForTesting
    public static final Attributes.Key<Ref<ConnectivityStateInfo>> f59525f = new Attributes.Key<>("state-info");

    /* renamed from: g */
    public static final Status f59526g = Status.f58278e.m30947g("no subchannels ready");

    /* renamed from: a */
    public final LoadBalancer.Helper f59527a;

    /* renamed from: b */
    public final Map<EquivalentAddressGroup, LoadBalancer.Subchannel> f59528b;

    /* renamed from: c */
    public final Random f59529c;

    /* renamed from: d */
    public ConnectivityState f59530d;

    /* renamed from: e */
    public RoundRobinPicker f59531e;

    /* renamed from: io.grpc.util.RoundRobinLoadBalancer$1 */
    class C64941 implements LoadBalancer.SubchannelStateListener {

        /* renamed from: a */
        public final /* synthetic */ LoadBalancer.Subchannel f59532a;

        /* renamed from: b */
        public final /* synthetic */ RoundRobinLoadBalancer f59533b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.LoadBalancer.SubchannelStateListener
        /* renamed from: a */
        public void mo30890a(ConnectivityStateInfo connectivityStateInfo) {
            RoundRobinLoadBalancer roundRobinLoadBalancer = this.f59533b;
            LoadBalancer.Subchannel subchannel = this.f59532a;
            ConnectivityState connectivityState = ConnectivityState.IDLE;
            Map<EquivalentAddressGroup, LoadBalancer.Subchannel> map = roundRobinLoadBalancer.f59528b;
            List<EquivalentAddressGroup> mo30887a = subchannel.mo30887a();
            Preconditions.m11194r(mo30887a.size() == 1, "%s does not have exactly one group", mo30887a);
            if (map.get(new EquivalentAddressGroup(mo30887a.get(0).f58135a, Attributes.f58053b)) != subchannel) {
                return;
            }
            ConnectivityState connectivityState2 = connectivityStateInfo.f58096a;
            ConnectivityState connectivityState3 = ConnectivityState.TRANSIENT_FAILURE;
            if (connectivityState2 == connectivityState3 || connectivityState2 == connectivityState) {
                roundRobinLoadBalancer.f59527a.mo30882a();
            }
            if (connectivityStateInfo.f58096a == connectivityState) {
                subchannel.mo30889c();
            }
            Ref<ConnectivityStateInfo> m31328a = RoundRobinLoadBalancer.m31328a(subchannel);
            if (m31328a.f59538a.f58096a.equals(connectivityState3) && (connectivityStateInfo.f58096a.equals(ConnectivityState.CONNECTING) || connectivityStateInfo.f58096a.equals(connectivityState))) {
                return;
            }
            m31328a.f59538a = connectivityStateInfo;
            roundRobinLoadBalancer.m31330c();
        }
    }

    @VisibleForTesting
    public static final class EmptyPicker extends RoundRobinPicker {

        /* renamed from: a */
        public final Status f59534a;

        public EmptyPicker(@Nonnull Status status) {
            super(null);
            Preconditions.m11187k(status, "status");
            this.f59534a = status;
        }

        @Override // io.grpc.util.RoundRobinLoadBalancer.RoundRobinPicker
        /* renamed from: a */
        public boolean mo31332a(RoundRobinPicker roundRobinPicker) {
            if (roundRobinPicker instanceof EmptyPicker) {
                EmptyPicker emptyPicker = (EmptyPicker) roundRobinPicker;
                if (Objects.m11173a(this.f59534a, emptyPicker.f59534a) || (this.f59534a.m30945e() && emptyPicker.f59534a.m30945e())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(EmptyPicker.class.getSimpleName(), null);
            toStringHelper.m11171e("status", this.f59534a);
            return toStringHelper.toString();
        }
    }

    @VisibleForTesting
    public static final class ReadyPicker extends RoundRobinPicker {

        /* renamed from: c */
        public static final AtomicIntegerFieldUpdater<ReadyPicker> f59535c = AtomicIntegerFieldUpdater.newUpdater(ReadyPicker.class, "b");

        /* renamed from: a */
        public final List<LoadBalancer.Subchannel> f59536a;

        /* renamed from: b */
        public volatile int f59537b;

        public ReadyPicker(List<LoadBalancer.Subchannel> list, int i2) {
            super(null);
            Preconditions.m11179c(!list.isEmpty(), "empty list");
            this.f59536a = list;
            this.f59537b = i2 - 1;
        }

        @Override // io.grpc.util.RoundRobinLoadBalancer.RoundRobinPicker
        /* renamed from: a */
        public boolean mo31332a(RoundRobinPicker roundRobinPicker) {
            if (!(roundRobinPicker instanceof ReadyPicker)) {
                return false;
            }
            ReadyPicker readyPicker = (ReadyPicker) roundRobinPicker;
            return readyPicker == this || (this.f59536a.size() == readyPicker.f59536a.size() && new HashSet(this.f59536a).containsAll(readyPicker.f59536a));
        }

        public String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(ReadyPicker.class.getSimpleName(), null);
            toStringHelper.m11171e("list", this.f59536a);
            return toStringHelper.toString();
        }
    }

    @VisibleForTesting
    public static final class Ref<T> {

        /* renamed from: a */
        public T f59538a;
    }

    public static abstract class RoundRobinPicker extends LoadBalancer.SubchannelPicker {
        public RoundRobinPicker() {
        }

        /* renamed from: a */
        public abstract boolean mo31332a(RoundRobinPicker roundRobinPicker);

        public RoundRobinPicker(C64941 c64941) {
        }
    }

    /* renamed from: a */
    public static Ref<ConnectivityStateInfo> m31328a(LoadBalancer.Subchannel subchannel) {
        Attributes mo30888b = subchannel.mo30888b();
        Ref<ConnectivityStateInfo> ref = (Ref) mo30888b.f58054a.get(f59525f);
        Preconditions.m11187k(ref, "STATE_INFO");
        return ref;
    }

    @VisibleForTesting
    /* renamed from: b */
    public Collection<LoadBalancer.Subchannel> m31329b() {
        return this.f59528b.values();
    }

    /* renamed from: c */
    public final void m31330c() {
        boolean z;
        ConnectivityState connectivityState = ConnectivityState.CONNECTING;
        ConnectivityState connectivityState2 = ConnectivityState.READY;
        Collection<LoadBalancer.Subchannel> m31329b = m31329b();
        ArrayList arrayList = new ArrayList(m31329b.size());
        Iterator<LoadBalancer.Subchannel> it = m31329b.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            LoadBalancer.Subchannel next = it.next();
            if (m31328a(next).f59538a.f58096a == connectivityState2) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            m31331d(connectivityState2, new ReadyPicker(arrayList, this.f59529c.nextInt(arrayList.size())));
            return;
        }
        Status status = f59526g;
        Iterator<LoadBalancer.Subchannel> it2 = m31329b().iterator();
        while (it2.hasNext()) {
            ConnectivityStateInfo connectivityStateInfo = m31328a(it2.next()).f59538a;
            ConnectivityState connectivityState3 = connectivityStateInfo.f58096a;
            if (connectivityState3 == connectivityState || connectivityState3 == ConnectivityState.IDLE) {
                z = true;
            }
            if (status == f59526g || !status.m30945e()) {
                status = connectivityStateInfo.f58097b;
            }
        }
        if (!z) {
            connectivityState = ConnectivityState.TRANSIENT_FAILURE;
        }
        m31331d(connectivityState, new EmptyPicker(status));
    }

    /* renamed from: d */
    public final void m31331d(ConnectivityState connectivityState, RoundRobinPicker roundRobinPicker) {
        if (connectivityState == this.f59530d && roundRobinPicker.mo31332a(this.f59531e)) {
            return;
        }
        this.f59527a.mo30883b(connectivityState, roundRobinPicker);
        this.f59530d = connectivityState;
        this.f59531e = roundRobinPicker;
    }
}
