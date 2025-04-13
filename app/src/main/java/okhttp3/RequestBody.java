package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.CloseableKt;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RequestBody.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, m31884d2 = {"Lokhttp3/RequestBody;", "", "()V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "isDuplex", "", "isOneShot", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class RequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RequestBody.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J1\u0010\u0011\u001a\u00020\u0004*\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0012"}, m31884d2 = {"Lokhttp3/RequestBody$Companion;", "", "()V", "create", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "file", "Ljava/io/File;", "content", "", "offset", "", "byteCount", "", "Lokio/ByteString;", "asRequestBody", "toRequestBody", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @JvmStatic
        @JvmName
        @NotNull
        public final RequestBody create(@NotNull String toRequestBody, @Nullable MediaType mediaType) {
            Intrinsics.m32179h(toRequestBody, "$this$toRequestBody");
            Charset charset = Charsets.f66855b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        @JvmStatic
        @NotNull
        @Deprecated
        @JvmOverloads
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        @JvmStatic
        @NotNull
        @Deprecated
        @JvmOverloads
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i2) {
            return create$default(this, mediaType, bArr, i2, 0, 8, (Object) null);
        }

        @JvmStatic
        @JvmName
        @NotNull
        @JvmOverloads
        public final RequestBody create(@NotNull byte[] bArr) {
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        @JvmStatic
        @JvmName
        @NotNull
        @JvmOverloads
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        @JvmStatic
        @JvmName
        @NotNull
        @JvmOverloads
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i2) {
            return create$default(this, bArr, mediaType, i2, 0, 4, (Object) null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return companion.create(bArr, mediaType, i2, i3);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bArr.length;
            }
            return companion.create(mediaType, bArr, i2, i3);
        }

        @JvmStatic
        @JvmName
        @NotNull
        public final RequestBody create(@NotNull final ByteString toRequestBody, @Nullable final MediaType mediaType) {
            Intrinsics.m32179h(toRequestBody, "$this$toRequestBody");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return ByteString.this.mo34576d();
                }

                @Override // okhttp3.RequestBody
                @Nullable
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink sink) {
                    Intrinsics.m32179h(sink, "sink");
                    sink.mo34528T0(ByteString.this);
                }
            };
        }

        @JvmStatic
        @JvmName
        @NotNull
        @JvmOverloads
        public final RequestBody create(@NotNull final byte[] toRequestBody, @Nullable final MediaType mediaType, final int i2, final int i3) {
            Intrinsics.m32179h(toRequestBody, "$this$toRequestBody");
            Util.checkOffsetAndCount(toRequestBody.length, i2, i3);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i3;
                }

                @Override // okhttp3.RequestBody
                @Nullable
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink sink) {
                    Intrinsics.m32179h(sink, "sink");
                    sink.write(toRequestBody, i2, i3);
                }
            };
        }

        @JvmStatic
        @JvmName
        @NotNull
        public final RequestBody create(@NotNull final File asRequestBody, @Nullable final MediaType mediaType) {
            Intrinsics.m32179h(asRequestBody, "$this$asRequestBody");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return asRequestBody.length();
                }

                @Override // okhttp3.RequestBody
                @Nullable
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@NotNull BufferedSink sink) {
                    Intrinsics.m32179h(sink, "sink");
                    Source m34606h = Okio.m34606h(asRequestBody);
                    try {
                        sink.mo34569z0(m34606h);
                        CloseableKt.m32138a(m34606h, null);
                    } finally {
                    }
                }
            };
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull String content) {
            Intrinsics.m32179h(content, "content");
            return create(content, contentType);
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull ByteString content) {
            Intrinsics.m32179h(content, "content");
            return create(content, contentType);
        }

        @JvmStatic
        @NotNull
        @Deprecated
        @JvmOverloads
        public final RequestBody create(@Nullable MediaType contentType, @NotNull byte[] content, int offset, int byteCount) {
            Intrinsics.m32179h(content, "content");
            return create(content, contentType, offset, byteCount);
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull File file) {
            Intrinsics.m32179h(file, "file");
            return create(file, contentType);
        }
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final RequestBody create(@NotNull File file, @Nullable MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
        return INSTANCE.create(mediaType, file);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return INSTANCE.create(mediaType, str);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    @JvmStatic
    @NotNull
    @Deprecated
    @JvmOverloads
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.create$default(INSTANCE, mediaType, bArr, 0, 0, 12, (Object) null);
    }

    @JvmStatic
    @NotNull
    @Deprecated
    @JvmOverloads
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i2) {
        return Companion.create$default(INSTANCE, mediaType, bArr, i2, 0, 8, (Object) null);
    }

    @JvmStatic
    @NotNull
    @Deprecated
    @JvmOverloads
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i2, int i3) {
        return INSTANCE.create(mediaType, bArr, i2, i3);
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final RequestBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @JvmStatic
    @JvmName
    @NotNull
    @JvmOverloads
    public static final RequestBody create(@NotNull byte[] bArr) {
        return Companion.create$default(INSTANCE, bArr, (MediaType) null, 0, 0, 7, (Object) null);
    }

    @JvmStatic
    @JvmName
    @NotNull
    @JvmOverloads
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.create$default(INSTANCE, bArr, mediaType, 0, 0, 6, (Object) null);
    }

    @JvmStatic
    @JvmName
    @NotNull
    @JvmOverloads
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i2) {
        return Companion.create$default(INSTANCE, bArr, mediaType, i2, 0, 4, (Object) null);
    }

    @JvmStatic
    @JvmName
    @NotNull
    @JvmOverloads
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i2, int i3) {
        return INSTANCE.create(bArr, mediaType, i2, i3);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    /* renamed from: contentType */
    public abstract MediaType get$contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull BufferedSink sink) throws IOException;
}
