package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.grpc.ClientStreamTracer;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@NotThreadSafe
/* loaded from: classes3.dex */
public abstract class LoadBalancer {

    @ExperimentalApi
    public static final class CreateSubchannelArgs {

        /* renamed from: a */
        public final List<EquivalentAddressGroup> f58185a;

        /* renamed from: b */
        public final Attributes f58186b;

        /* renamed from: c */
        public final Object[][] f58187c;

        @ExperimentalApi
        public static final class Builder {

            /* renamed from: a */
            public Attributes f58188a = Attributes.f58053b;

            /* renamed from: b */
            public Object[][] f58189b = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        }

        @ExperimentalApi
        public static final class Key<T> {
            public String toString() {
                return null;
            }
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("addrs", this.f58185a);
            m11166b.m11171e("attrs", this.f58186b);
            m11166b.m11171e("customOptions", Arrays.deepToString(this.f58187c));
            return m11166b.toString();
        }
    }

    @ExperimentalApi
    @ThreadSafe
    public static abstract class Factory {
    }

    @ExperimentalApi
    @ThreadSafe
    public static abstract class Helper {
        /* renamed from: a */
        public void mo30882a() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public abstract void mo30883b(@Nonnull ConnectivityState connectivityState, @Nonnull SubchannelPicker subchannelPicker);
    }

    @ExperimentalApi
    @Immutable
    public static final class PickResult {

        /* renamed from: e */
        public static final PickResult f58190e = new PickResult(null, null, Status.f58278e, false);

        /* renamed from: a */
        @Nullable
        public final Subchannel f58191a;

        /* renamed from: b */
        @Nullable
        public final ClientStreamTracer.Factory f58192b;

        /* renamed from: c */
        public final Status f58193c;

        /* renamed from: d */
        public final boolean f58194d;

        public PickResult(@Nullable Subchannel subchannel, @Nullable ClientStreamTracer.Factory factory, Status status, boolean z) {
            this.f58191a = subchannel;
            this.f58192b = factory;
            Preconditions.m11187k(status, "status");
            this.f58193c = status;
            this.f58194d = z;
        }

        /* renamed from: a */
        public static PickResult m30884a(Status status) {
            Preconditions.m11179c(!status.m30945e(), "error status shouldn't be OK");
            return new PickResult(null, null, status, false);
        }

        /* renamed from: b */
        public static PickResult m30885b(Subchannel subchannel) {
            Preconditions.m11187k(subchannel, "subchannel");
            return new PickResult(subchannel, null, Status.f58278e, false);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PickResult)) {
                return false;
            }
            PickResult pickResult = (PickResult) obj;
            return Objects.m11173a(this.f58191a, pickResult.f58191a) && Objects.m11173a(this.f58193c, pickResult.f58193c) && Objects.m11173a(this.f58192b, pickResult.f58192b) && this.f58194d == pickResult.f58194d;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f58191a, this.f58193c, this.f58192b, Boolean.valueOf(this.f58194d)});
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("subchannel", this.f58191a);
            m11166b.m11171e("streamTracerFactory", this.f58192b);
            m11166b.m11171e("status", this.f58193c);
            m11166b.m11170d("drop", this.f58194d);
            return m11166b.toString();
        }
    }

    @ExperimentalApi
    public static abstract class PickSubchannelArgs {
        /* renamed from: a */
        public abstract CallOptions mo30886a();
    }

    @ExperimentalApi
    public static final class ResolvedAddresses {

        /* renamed from: a */
        public final List<EquivalentAddressGroup> f58195a;

        /* renamed from: b */
        public final Attributes f58196b;

        /* renamed from: c */
        @Nullable
        public final Object f58197c;

        @ExperimentalApi
        public static final class Builder {

            /* renamed from: a */
            public Attributes f58198a = Attributes.f58053b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ResolvedAddresses)) {
                return false;
            }
            ResolvedAddresses resolvedAddresses = (ResolvedAddresses) obj;
            return Objects.m11173a(this.f58195a, resolvedAddresses.f58195a) && Objects.m11173a(this.f58196b, resolvedAddresses.f58196b) && Objects.m11173a(this.f58197c, resolvedAddresses.f58197c);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f58195a, this.f58196b, this.f58197c});
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("addresses", this.f58195a);
            m11166b.m11171e("attributes", this.f58196b);
            m11166b.m11171e("loadBalancingPolicyConfig", this.f58197c);
            return m11166b.toString();
        }
    }

    @ExperimentalApi
    public static abstract class Subchannel {
        /* renamed from: a */
        public List<EquivalentAddressGroup> mo30887a() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public abstract Attributes mo30888b();

        /* renamed from: c */
        public abstract void mo30889c();
    }

    @ExperimentalApi
    @ThreadSafe
    public static abstract class SubchannelPicker {
    }

    public interface SubchannelStateListener {
        /* renamed from: a */
        void mo30890a(ConnectivityStateInfo connectivityStateInfo);
    }
}
