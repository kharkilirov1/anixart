package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
public final class CacheBuilderSpec {

    /* renamed from: com.google.common.cache.CacheBuilderSpec$1 */
    public static /* synthetic */ class C15831 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20624a;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            f20624a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20624a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class AccessDurationParser extends DurationParser {
    }

    public static class ConcurrencyLevelParser extends IntegerParser {
    }

    public static abstract class DurationParser implements ValueParser {
    }

    public static class InitialCapacityParser extends IntegerParser {
    }

    public static abstract class IntegerParser implements ValueParser {
    }

    public static class KeyStrengthParser implements ValueParser {
        public KeyStrengthParser(LocalCache.Strength strength) {
        }
    }

    public static abstract class LongParser implements ValueParser {
    }

    public static class MaximumSizeParser extends LongParser {
    }

    public static class MaximumWeightParser extends LongParser {
    }

    public static class RecordStatsParser implements ValueParser {
    }

    public static class RefreshDurationParser extends DurationParser {
    }

    public interface ValueParser {
    }

    public static class ValueStrengthParser implements ValueParser {
        public ValueStrengthParser(LocalCache.Strength strength) {
        }
    }

    public static class WriteDurationParser extends DurationParser {
    }

    static {
        Splitter.m11204a(',').m11209f();
        Splitter.m11204a('=').m11209f();
        ImmutableMap.Builder m11648a = ImmutableMap.m11648a();
        m11648a.mo11614c("initialCapacity", new InitialCapacityParser());
        m11648a.mo11614c("maximumSize", new MaximumSizeParser());
        m11648a.mo11614c("maximumWeight", new MaximumWeightParser());
        m11648a.mo11614c("concurrencyLevel", new ConcurrencyLevelParser());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        m11648a.mo11614c("weakKeys", new KeyStrengthParser(strength));
        m11648a.mo11614c("softValues", new ValueStrengthParser(LocalCache.Strength.SOFT));
        m11648a.mo11614c("weakValues", new ValueStrengthParser(strength));
        m11648a.mo11614c("recordStats", new RecordStatsParser());
        m11648a.mo11614c("expireAfterAccess", new AccessDurationParser());
        m11648a.mo11614c("expireAfterWrite", new WriteDurationParser());
        m11648a.mo11614c("refreshAfterWrite", new RefreshDurationParser());
        m11648a.mo11614c("refreshInterval", new RefreshDurationParser());
        m11648a.mo11613a();
    }

    @NullableDecl
    /* renamed from: a */
    public static Long m11236a(long j2, @NullableDecl TimeUnit timeUnit) {
        return null;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        Objects.requireNonNull((CacheBuilderSpec) obj);
        return com.google.common.base.Objects.m11173a(null, null) && com.google.common.base.Objects.m11173a(null, null) && com.google.common.base.Objects.m11173a(null, null) && com.google.common.base.Objects.m11173a(null, null) && com.google.common.base.Objects.m11173a(null, null) && com.google.common.base.Objects.m11173a(null, null) && com.google.common.base.Objects.m11173a(null, null) && com.google.common.base.Objects.m11173a(m11236a(0L, null), m11236a(0L, null)) && com.google.common.base.Objects.m11173a(m11236a(0L, null), m11236a(0L, null)) && com.google.common.base.Objects.m11173a(m11236a(0L, null), m11236a(0L, null));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null, null, null, null, m11236a(0L, null), m11236a(0L, null), m11236a(0L, null)});
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11172f(null);
        return m11166b.toString();
    }
}
