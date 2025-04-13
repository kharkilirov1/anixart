package com.google.common.net;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public final class MediaType {

    /* renamed from: f */
    public static final ImmutableListMultimap<String, String> f21892f = ImmutableListMultimap.m11644p("charset", Ascii.m11123c(Charsets.f20504c.name()));

    /* renamed from: g */
    public static final CharMatcher f21893g = CharMatcher.m11129e().mo11134b(CharMatcher.m11133l().mo11142p()).mo11134b(CharMatcher.m11132k(' ')).mo11134b(CharMatcher.m11128c("()<>@,;:\\\"/[]?=").mo11142p());

    /* renamed from: h */
    public static final Map<MediaType, MediaType> f21894h;

    /* renamed from: i */
    public static final Joiner.MapJoiner f21895i;

    /* renamed from: a */
    public final String f21896a;

    /* renamed from: b */
    public final String f21897b;

    /* renamed from: c */
    public final ImmutableListMultimap<String, String> f21898c;

    /* renamed from: d */
    @LazyInit
    public String f21899d;

    /* renamed from: e */
    @LazyInit
    public int f21900e;

    public static final class Tokenizer {
    }

    static {
        CharMatcher.m11129e().mo11134b(CharMatcher.m11128c("\"\\\r").mo11142p());
        CharMatcher.m11128c(" \t\r\n");
        f21894h = new HashMap();
        m12068a("*", "*");
        m12068a("text", "*");
        m12068a("image", "*");
        m12068a("audio", "*");
        m12068a("video", "*");
        m12068a("application", "*");
        m12068a("font", "*");
        m12069b("text", "cache-manifest");
        m12069b("text", "css");
        m12069b("text", "csv");
        m12069b("text", "html");
        m12069b("text", "calendar");
        m12069b("text", "plain");
        m12069b("text", "javascript");
        m12069b("text", "tab-separated-values");
        m12069b("text", "vcard");
        m12069b("text", "vnd.wap.wml");
        m12069b("text", "xml");
        m12069b("text", "vtt");
        m12068a("image", "bmp");
        m12068a("image", "x-canon-crw");
        m12068a("image", "gif");
        m12068a("image", "vnd.microsoft.icon");
        m12068a("image", "jpeg");
        m12068a("image", "png");
        m12068a("image", "vnd.adobe.photoshop");
        m12069b("image", "svg+xml");
        m12068a("image", "tiff");
        m12068a("image", "webp");
        m12068a("image", "heif");
        m12068a("image", "jp2");
        m12068a("audio", "mp4");
        m12068a("audio", "mpeg");
        m12068a("audio", "ogg");
        m12068a("audio", "webm");
        m12068a("audio", "l16");
        m12068a("audio", "l24");
        m12068a("audio", "basic");
        m12068a("audio", "aac");
        m12068a("audio", "vorbis");
        m12068a("audio", "x-ms-wma");
        m12068a("audio", "x-ms-wax");
        m12068a("audio", "vnd.rn-realaudio");
        m12068a("audio", "vnd.wave");
        m12068a("video", "mp4");
        m12068a("video", "mpeg");
        m12068a("video", "ogg");
        m12068a("video", "quicktime");
        m12068a("video", "webm");
        m12068a("video", "x-ms-wmv");
        m12068a("video", "x-flv");
        m12068a("video", "3gpp");
        m12068a("video", "3gpp2");
        m12069b("application", "xml");
        m12069b("application", "atom+xml");
        m12068a("application", "x-bzip2");
        m12069b("application", "dart");
        m12068a("application", "vnd.apple.pkpass");
        m12068a("application", "vnd.ms-fontobject");
        m12068a("application", "epub+zip");
        m12068a("application", "x-www-form-urlencoded");
        m12068a("application", "pkcs12");
        m12068a("application", "binary");
        m12068a("application", "geo+json");
        m12068a("application", "x-gzip");
        m12068a("application", "hal+json");
        m12069b("application", "javascript");
        m12068a("application", "jose");
        m12068a("application", "jose+json");
        m12069b("application", "json");
        m12069b("application", "manifest+json");
        m12068a("application", "vnd.google-earth.kml+xml");
        m12068a("application", "vnd.google-earth.kmz");
        m12068a("application", "mbox");
        m12068a("application", "x-apple-aspen-config");
        m12068a("application", "vnd.ms-excel");
        m12068a("application", "vnd.ms-outlook");
        m12068a("application", "vnd.ms-powerpoint");
        m12068a("application", "msword");
        m12068a("application", "dash+xml");
        m12068a("application", "wasm");
        m12068a("application", "x-nacl");
        m12068a("application", "x-pnacl");
        m12068a("application", "octet-stream");
        m12068a("application", "ogg");
        m12068a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        m12068a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        m12068a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        m12068a("application", "vnd.oasis.opendocument.graphics");
        m12068a("application", "vnd.oasis.opendocument.presentation");
        m12068a("application", "vnd.oasis.opendocument.spreadsheet");
        m12068a("application", "vnd.oasis.opendocument.text");
        m12069b("application", "opensearchdescription+xml");
        m12068a("application", "pdf");
        m12068a("application", "postscript");
        m12068a("application", "protobuf");
        m12069b("application", "rdf+xml");
        m12069b("application", "rtf");
        m12068a("application", "font-sfnt");
        m12068a("application", "x-shockwave-flash");
        m12068a("application", "vnd.sketchup.skp");
        m12069b("application", "soap+xml");
        m12068a("application", "x-tar");
        m12068a("application", "font-woff");
        m12068a("application", "font-woff2");
        m12069b("application", "xhtml+xml");
        m12069b("application", "xrd+xml");
        m12068a("application", "zip");
        m12068a("font", "collection");
        m12068a("font", "otf");
        m12068a("font", "sfnt");
        m12068a("font", "ttf");
        m12068a("font", "woff");
        m12068a("font", "woff2");
        f21895i = new Joiner.MapJoiner(new Joiner("; "), "=", null);
    }

    public MediaType(String str, String str2, ImmutableListMultimap<String, String> immutableListMultimap) {
        this.f21896a = str;
        this.f21897b = str2;
        this.f21898c = immutableListMultimap;
    }

    /* renamed from: a */
    public static MediaType m12068a(String str, String str2) {
        MediaType mediaType = new MediaType(str, str2, ImmutableListMultimap.m11643o());
        ((HashMap) f21894h).put(mediaType, mediaType);
        return mediaType;
    }

    /* renamed from: b */
    public static MediaType m12069b(String str, String str2) {
        MediaType mediaType = new MediaType(str, str2, f21892f);
        ((HashMap) f21894h).put(mediaType, mediaType);
        Optional.m11176d(Charsets.f20504c);
        return mediaType;
    }

    /* renamed from: c */
    public final Map<String, ImmutableMultiset<String>> m12070c() {
        return Maps.m11795l(this.f21898c.f21052f, new Function<Collection<String>, ImmutableMultiset<String>>() { // from class: com.google.common.net.MediaType.1
            @Override // com.google.common.base.Function
            public ImmutableMultiset<String> apply(Collection<String> collection) {
                return ImmutableMultiset.m11661t(collection);
            }
        });
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        MediaType mediaType = (MediaType) obj;
        if (this.f21896a.equals(mediaType.f21896a) && this.f21897b.equals(mediaType.f21897b)) {
            if (((AbstractMap) m12070c()).equals(mediaType.m12070c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f21900e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(new Object[]{this.f21896a, this.f21897b, m12070c()});
        this.f21900e = hashCode;
        return hashCode;
    }

    public String toString() {
        String str = this.f21899d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21896a);
        sb.append(JsonPointer.SEPARATOR);
        sb.append(this.f21897b);
        if (!this.f21898c.isEmpty()) {
            sb.append("; ");
            ListMultimap m11817b = Multimaps.m11817b(this.f21898c, new Function<String, String>() { // from class: com.google.common.net.MediaType.2
                @Override // com.google.common.base.Function
                public String apply(String str2) {
                    String str3 = str2;
                    if (MediaType.f21893g.mo11140n(str3) && !str3.isEmpty()) {
                        return str3;
                    }
                    StringBuilder sb2 = new StringBuilder(str3.length() + 16);
                    sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    for (int i2 = 0; i2 < str3.length(); i2++) {
                        char charAt = str3.charAt(i2);
                        if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                            sb2.append('\\');
                        }
                        sb2.append(charAt);
                    }
                    sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    return sb2.toString();
                }
            });
            Joiner.MapJoiner mapJoiner = f21895i;
            Iterable mo11345b = m11817b.mo11345b();
            Objects.requireNonNull(mapJoiner);
            try {
                mapJoiner.m11164a(sb, mo11345b.iterator());
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
        String sb2 = sb.toString();
        this.f21899d = sb2;
        return sb2;
    }
}
