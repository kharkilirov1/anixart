package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
/* loaded from: classes3.dex */
public abstract class NameResolver {

    /* renamed from: io.grpc.NameResolver$1 */
    class C63051 extends Listener2 {

        /* renamed from: a */
        public final /* synthetic */ Listener f58243a;

        @Override // io.grpc.NameResolver.Listener2, io.grpc.NameResolver.Listener
        /* renamed from: a */
        public void mo30926a(Status status) {
            this.f58243a.mo30926a(status);
        }
    }

    @ExperimentalApi
    public static final class Args {

        public static final class Builder {
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11168b("defaultPort", 0);
            m11166b.m11171e("proxyDetector", null);
            m11166b.m11171e("syncContext", null);
            m11166b.m11171e("serviceConfigParser", null);
            m11166b.m11171e("scheduledExecutorService", null);
            m11166b.m11171e("channelLogger", null);
            m11166b.m11171e("executor", null);
            return m11166b.toString();
        }
    }

    @ExperimentalApi
    public static final class ConfigOrError {

        /* renamed from: a */
        public final Status f58244a;

        /* renamed from: b */
        public final Object f58245b;

        public ConfigOrError(Object obj) {
            Preconditions.m11187k(obj, "config");
            this.f58245b = obj;
            this.f58244a = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ConfigOrError.class != obj.getClass()) {
                return false;
            }
            ConfigOrError configOrError = (ConfigOrError) obj;
            return Objects.m11173a(this.f58244a, configOrError.f58244a) && Objects.m11173a(this.f58245b, configOrError.f58245b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f58244a, this.f58245b});
        }

        public String toString() {
            if (this.f58245b != null) {
                MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
                m11166b.m11171e("config", this.f58245b);
                return m11166b.toString();
            }
            MoreObjects.ToStringHelper m11166b2 = MoreObjects.m11166b(this);
            m11166b2.m11171e("error", this.f58244a);
            return m11166b2.toString();
        }
    }

    @ExperimentalApi
    public static abstract class Factory {
        /* renamed from: a */
        public abstract String mo30927a();
    }

    @ExperimentalApi
    @ThreadSafe
    public interface Listener {
        /* renamed from: a */
        void mo30926a(Status status);
    }

    @ExperimentalApi
    public static abstract class Listener2 implements Listener {
        @Override // io.grpc.NameResolver.Listener
        /* renamed from: a */
        public abstract void mo30926a(Status status);
    }

    @ExperimentalApi
    public static final class ResolutionResult {

        /* renamed from: a */
        public final List<EquivalentAddressGroup> f58246a;

        /* renamed from: b */
        public final Attributes f58247b;

        /* renamed from: c */
        @Nullable
        public final ConfigOrError f58248c;

        @ExperimentalApi
        public static final class Builder {

            /* renamed from: a */
            public List<EquivalentAddressGroup> f58249a = Collections.emptyList();

            /* renamed from: b */
            public Attributes f58250b = Attributes.f58053b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ResolutionResult)) {
                return false;
            }
            ResolutionResult resolutionResult = (ResolutionResult) obj;
            return Objects.m11173a(this.f58246a, resolutionResult.f58246a) && Objects.m11173a(this.f58247b, resolutionResult.f58247b) && Objects.m11173a(this.f58248c, resolutionResult.f58248c);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f58246a, this.f58247b, this.f58248c});
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("addresses", this.f58246a);
            m11166b.m11171e("attributes", this.f58247b);
            m11166b.m11171e("serviceConfig", this.f58248c);
            return m11166b.toString();
        }
    }

    @ExperimentalApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResolutionResultAttr {
    }

    @ExperimentalApi
    public static abstract class ServiceConfigParser {
    }
}
