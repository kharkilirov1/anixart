package okhttp3;

import com.fasterxml.jackson.core.JsonFactory;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: MediaType.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0019"}, m31884d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "[Ljava/lang/String;", "()Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "equals", "", "other", "hashCode", "", "parameter", "name", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;

    @NotNull
    private final String subtype;

    @NotNull
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* compiled from: MediaType.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m31884d2 = {"Lokhttp3/MediaType$Companion;", "", "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", "", "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @Deprecated
        @JvmName
        @NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m35137deprecated_get(@NotNull String mediaType) {
            Intrinsics.m32179h(mediaType, "mediaType");
            return get(mediaType);
        }

        @Deprecated
        @JvmName
        @Nullable
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m35138deprecated_parse(@NotNull String mediaType) {
            Intrinsics.m32179h(mediaType, "mediaType");
            return parse(mediaType);
        }

        @JvmStatic
        @JvmName
        @NotNull
        public final MediaType get(@NotNull String toMediaType) {
            Intrinsics.m32179h(toMediaType, "$this$toMediaType");
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(C0000a.m15l("No subtype found for: \"", toMediaType, JsonFactory.DEFAULT_QUOTE_CHAR).toString());
            }
            String group = matcher.group(1);
            Intrinsics.m32178g(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            Intrinsics.m32178g(locale, "Locale.US");
            String lowerCase = group.toLowerCase(locale);
            Intrinsics.m32178g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            Intrinsics.m32178g(group2, "typeSubtype.group(2)");
            Intrinsics.m32178g(locale, "Locale.US");
            String lowerCase2 = group2.toLowerCase(locale);
            Intrinsics.m32178g(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.PARAMETER.matcher(toMediaType);
            int end = matcher.end();
            while (end < toMediaType.length()) {
                matcher2.region(end, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder m24u = C0000a.m24u("Parameter is not formatted correctly: \"");
                    String substring = toMediaType.substring(end);
                    Intrinsics.m32178g(substring, "(this as java.lang.String).substring(startIndex)");
                    m24u.append(substring);
                    m24u.append("\" for: \"");
                    m24u.append(toMediaType);
                    m24u.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    throw new IllegalArgumentException(m24u.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (StringsKt.m33898X(group4, "'", false, 2, null) && StringsKt.m33926x(group4, "'", false, 2, null) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.m32178g(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new MediaType(toMediaType, lowerCase, lowerCase2, (String[]) array, null);
        }

        @JvmStatic
        @JvmName
        @Nullable
        public final MediaType parse(@NotNull String toMediaTypeOrNull) {
            Intrinsics.m32179h(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return get(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final MediaType get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    @JvmName
    @Nullable
    public static final MediaType parse(@NotNull String str) {
        return INSTANCE.parse(str);
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_subtype, reason: not valid java name and from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final String getType() {
        return this.type;
    }

    @JvmOverloads
    @Nullable
    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    @JvmOverloads
    @Nullable
    public final Charset charset(@Nullable Charset defaultValue) {
        String parameter = parameter("charset");
        if (parameter == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof MediaType) && Intrinsics.m32174c(((MediaType) other).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    @Nullable
    public final String parameter(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        String[] strArr = this.parameterNamesAndValues;
        Intrinsics.m32179h(strArr, "<this>");
        IntProgression m32242i = RangesKt.m32242i(new IntRange(0, ArraysKt.m31929E(strArr)), 2);
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
        while (!StringsKt.m33927y(this.parameterNamesAndValues[i2], name, true)) {
            if (i2 == i3) {
                return null;
            }
            i2 += i4;
        }
        return this.parameterNamesAndValues[i2 + 1];
    }

    @JvmName
    @NotNull
    public final String subtype() {
        return this.subtype;
    }

    @NotNull
    /* renamed from: toString, reason: from getter */
    public String getMediaType() {
        return this.mediaType;
    }

    @JvmName
    @NotNull
    public final String type() {
        return this.type;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}
