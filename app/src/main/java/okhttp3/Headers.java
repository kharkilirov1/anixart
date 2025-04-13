package okhttp3;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Headers.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002&'B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\b\u0010\u0017\u001a\u00020\tH\u0016J\u001b\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0019H\u0096\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u001fJ\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"0!J\b\u0010#\u001a\u00020\u0003H\u0016J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010\u0012\u001a\u00020\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006("}, m31884d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "namesAndValues", "", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "size", "", "()I", "byteCount", "", "equals", "", "other", "", "get", "name", "getDate", "Ljava/util/Date;", "getInstant", "Ljava/time/Instant;", "hashCode", "iterator", "", "index", "names", "", "newBuilder", "Lokhttp3/Headers$Builder;", "-deprecated_size", "toMultimap", "", "", "toString", "value", "values", "Builder", "Companion", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m31884d2 = {"Lokhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", "value", "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "get", "removeAll", "set", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Builder {

        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String line) {
            Intrinsics.m32179h(line, "line");
            int m33877C = StringsKt.m33877C(line, ':', 0, false, 6, null);
            if (!(m33877C != -1)) {
                throw new IllegalArgumentException(C0000a.m14k("Unexpected header: ", line).toString());
            }
            String substring = line.substring(0, m33877C);
            Intrinsics.m32178g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String obj = StringsKt.m33914n0(substring).toString();
            String substring2 = line.substring(m33877C + 1);
            Intrinsics.m32178g(substring2, "(this as java.lang.String).substring(startIndex)");
            add(obj, substring2);
            return this;
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            Intrinsics.m32179h(headers, "headers");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                addLenient$okhttp(headers.name(i2), headers.value(i2));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String line) {
            Intrinsics.m32179h(line, "line");
            int m33877C = StringsKt.m33877C(line, ':', 1, false, 4, null);
            if (m33877C != -1) {
                String substring = line.substring(0, m33877C);
                Intrinsics.m32178g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = line.substring(m33877C + 1);
                Intrinsics.m32178g(substring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.m32178g(substring3, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            Headers.INSTANCE.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new Headers((String[]) array, null);
        }

        @Nullable
        public final String get(@NotNull String name) {
            Intrinsics.m32179h(name, "name");
            IntProgression m32242i = RangesKt.m32242i(RangesKt.m32240g(this.namesAndValues.size() - 2, 0), 2);
            int i2 = m32242i.f63380b;
            int i3 = m32242i.f63381c;
            int i4 = m32242i.f63382d;
            if (i4 >= 0) {
                if (i2 > i3) {
                    return null;
                }
            } else if (i2 < i3) {
                return null;
            }
            while (!StringsKt.m33927y(name, this.namesAndValues.get(i2), true)) {
                if (i2 == i3) {
                    return null;
                }
                i2 += i4;
            }
            return this.namesAndValues.get(i2 + 1);
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String name) {
            Intrinsics.m32179h(name, "name");
            int i2 = 0;
            while (i2 < this.namesAndValues.size()) {
                if (StringsKt.m33927y(name, this.namesAndValues.get(i2), true)) {
                    this.namesAndValues.remove(i2);
                    this.namesAndValues.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull Date value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String name, @NotNull Instant value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(StringsKt.m33914n0(value).toString());
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull Date value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String name, @NotNull Instant value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J%\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u0011J\u001d\u0010\u0014\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u000f¨\u0006\u0015"}, m31884d2 = {"Lokhttp3/Headers$Companion;", "", "()V", "checkName", "", "name", "", "checkValue", "value", "get", "namesAndValues", "", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "headersOf", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "headers", "", "toHeaders", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String name) {
            if (!(name.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = name.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = name.charAt(i2);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String value, String name) {
            int length = value.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = value.charAt(i2);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), name));
                    sb.append(Util.isSensitiveHeader(name) ? "" : C0000a.m14k(": ", value));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] namesAndValues, String name) {
            IntProgression m32242i = RangesKt.m32242i(RangesKt.m32240g(namesAndValues.length - 2, 0), 2);
            int i2 = m32242i.f63380b;
            int i3 = m32242i.f63381c;
            int i4 = m32242i.f63382d;
            if (i4 >= 0) {
                if (i2 > i3) {
                    return null;
                }
            } else if (i2 < i3) {
                return null;
            }
            while (!StringsKt.m33927y(name, namesAndValues[i2], true)) {
                if (i2 == i3) {
                    return null;
                }
                i2 += i4;
            }
            return namesAndValues[i2 + 1];
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m35111deprecated_of(@NotNull String... namesAndValues) {
            Intrinsics.m32179h(namesAndValues, "namesAndValues");
            return m34508of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: of */
        public final Headers m34508of(@NotNull String... namesAndValues) {
            Intrinsics.m32179h(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object clone = namesAndValues.clone();
            Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            String[] strArr = (String[]) clone;
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!(strArr[i2] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                String str = strArr[i2];
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                strArr[i2] = StringsKt.m33914n0(str).toString();
            }
            IntProgression m32242i = RangesKt.m32242i(new IntRange(0, ArraysKt.m31929E(strArr)), 2);
            int i3 = m32242i.f63380b;
            int i4 = m32242i.f63381c;
            int i5 = m32242i.f63382d;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (true) {
                    String str2 = strArr[i3];
                    String str3 = strArr[i3 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            return new Headers(strArr, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m35110deprecated_of(@NotNull Map<String, String> headers) {
            Intrinsics.m32179h(headers, "headers");
            return m34507of(headers);
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: of */
        public final Headers m34507of(@NotNull Map<String, String> toHeaders) {
            Intrinsics.m32179h(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i2 = 0;
            for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = StringsKt.m33914n0(key).toString();
                Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = StringsKt.m33914n0(value).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i2] = obj;
                strArr[i2 + 1] = obj2;
                i2 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @JvmStatic
    @JvmName
    @NotNull
    /* renamed from: of */
    public static final Headers m34505of(@NotNull Map<String, String> map) {
        return INSTANCE.m34507of(map);
    }

    @JvmStatic
    @JvmName
    @NotNull
    /* renamed from: of */
    public static final Headers m34506of(@NotNull String... strArr) {
        return INSTANCE.m34508of(strArr);
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m35109deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            length += this.namesAndValues[i2].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) other).namesAndValues);
    }

    @Nullable
    public final String get(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        return INSTANCE.get(this.namesAndValues, name);
    }

    @Nullable
    public final Date getDate(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            pairArr[i2] = new Pair(name(i2), value(i2));
        }
        return ArrayIteratorKt.m32154a(pairArr);
    }

    @NotNull
    public final String name(int index) {
        return this.namesAndValues[index * 2];
    }

    @NotNull
    public final Set<String> names() {
        StringsKt.m33875A(StringCompanionObject.f63355a);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(name(i2));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.m32178g(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        CollectionsKt.m32022h(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    @JvmName
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        StringsKt.m33875A(StringCompanionObject.f63355a);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String name = name(i2);
            Locale locale = Locale.US;
            Intrinsics.m32178g(locale, "Locale.US");
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.m32178g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i2));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String name = name(i2);
            String value = value(i2);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final String value(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    @NotNull
    public final List<String> values(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt.m33927y(name, name(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i2));
            }
        }
        if (arrayList == null) {
            return EmptyList.f63144b;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.m32178g(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
