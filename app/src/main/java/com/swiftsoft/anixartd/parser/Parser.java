package com.swiftsoft.anixartd.parser;

import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.parser.allvideo.AllvideoParser;
import com.swiftsoft.anixartd.parser.anilibria.AniLibriaParser;
import com.swiftsoft.anixartd.parser.kodik.KodikParser;
import com.swiftsoft.anixartd.parser.mailru.MailRuParser;
import com.swiftsoft.anixartd.parser.myvi.MyviParser;
import com.swiftsoft.anixartd.parser.sibnet.SibnetParser;
import com.swiftsoft.anixartd.parser.sovetromantica.SovetRomanticaParser;
import com.swiftsoft.anixartd.utils.Common;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Parser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/Parser;", "", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class Parser {

    /* renamed from: e */
    @NotNull
    public static final Companion f25796e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final String[] f25797f = {"kodik.cc", "kodik.info", "aniqit.com"};

    /* renamed from: g */
    @NotNull
    public static final String[] f25798g = {"www.myvi.top", "myvi.top"};

    /* renamed from: h */
    @NotNull
    public static final String[] f25799h = {"secvideo1.online", "csst.online", "sstrge.online"};

    /* renamed from: i */
    @NotNull
    public static final String[] f25800i = {"anilibria.tv", "new.anilib.one", "inori.anilib.one", "emilia.anilib.one", "new.anilib.moe", "inori.anilib.moe", "emilia.anilib.moe", "anixart.libria.fun"};

    /* renamed from: a */
    @NotNull
    public final String f25801a;

    /* renamed from: b */
    @NotNull
    public String f25802b = "";

    /* renamed from: c */
    @NotNull
    public Map<String, String> f25803c = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public Map<String, String> f25804d = new LinkedHashMap();

    /* compiled from: Parser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/Parser$Companion;", "", "", "", "ALLVIDEO_URL", "[Ljava/lang/String;", "ANILIBRIA_URL", "KODIK_URL", "MAILRU_URL", "Ljava/lang/String;", "MYVI_URL", "SIBNET_URL", "SOVET_ROMANTICA_URL", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final boolean m14182a(@NotNull String str) {
            return ArraysKt.m31963m(Parser.f25797f, str);
        }

        @NotNull
        /* renamed from: b */
        public final Parser m14183b(@NotNull String url) {
            Parser aniLibriaParser;
            Intrinsics.m32179h(url, "url");
            String m16296a = new Common().m16296a(url);
            if (ArraysKt.m31963m(Parser.f25797f, m16296a)) {
                aniLibriaParser = new KodikParser(url);
            } else if (Intrinsics.m32174c(m16296a, "video.sibnet.ru")) {
                aniLibriaParser = new SibnetParser(url);
            } else if (Intrinsics.m32174c(m16296a, "sovetromantica.com")) {
                aniLibriaParser = new SovetRomanticaParser(url);
            } else if (Intrinsics.m32174c(m16296a, "my.mail.ru")) {
                aniLibriaParser = new MailRuParser(url);
            } else if (ArraysKt.m31963m(Parser.f25798g, m16296a)) {
                aniLibriaParser = new MyviParser(url);
            } else if (ArraysKt.m31963m(Parser.f25799h, m16296a)) {
                aniLibriaParser = new AllvideoParser(url);
            } else {
                if (!ArraysKt.m31963m(Parser.f25800i, m16296a)) {
                    throw new Exception("Invalid url");
                }
                aniLibriaParser = new AniLibriaParser(url);
            }
            aniLibriaParser.mo14181i();
            return aniLibriaParser;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Parser(@NotNull String str, boolean z) {
        this.f25801a = str;
    }

    /* renamed from: b */
    public static void m14173b(Parser parser, String str, String url, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        Intrinsics.m32179h(url, "url");
        parser.f25803c.put(str, url);
        if (z) {
            parser.f25804d.put(str, url);
        }
    }

    /* renamed from: c */
    public static String m14174c(Parser parser, String url, boolean z, Map map, Map map2, String str, int i2, Object obj) {
        Map<String, String> headers;
        Map<String, String> postData;
        Map<String, String> map3;
        Map<String, String> map4;
        boolean z2 = (i2 & 2) != 0 ? true : z;
        if ((i2 & 4) != 0) {
            map4 = EmptyMap.f63145b;
            headers = map4;
        } else {
            headers = null;
        }
        if ((i2 & 8) != 0) {
            map3 = EmptyMap.f63145b;
            postData = map3;
        } else {
            postData = null;
        }
        String userAgent = (i2 & 16) != 0 ? "" : str;
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(headers, "headers");
        Intrinsics.m32179h(postData, "postData");
        Intrinsics.m32179h(userAgent, "userAgent");
        ResponseBody body = parser.m14179g(url, z2, headers, postData, userAgent).body();
        String string = body != null ? body.string() : null;
        return string == null ? "" : string;
    }

    /* renamed from: e */
    public static String m14175e(Parser parser, String url, Map map, Map map2, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            map = EmptyMap.f63145b;
        }
        Map headers = map;
        Map<String, String> postData = (i2 & 4) != 0 ? EmptyMap.f63145b : null;
        if ((i2 & 8) != 0) {
            str = "";
        }
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(headers, "headers");
        Intrinsics.m32179h(postData, "postData");
        return parser.m14179g(url, false, headers, postData, str).headers().get("Location");
    }

    /* renamed from: a */
    public final void m14176a(@NotNull String str, @NotNull String str2) {
        this.f25804d.put(str, str2);
    }

    @Nullable
    /* renamed from: d */
    public final String m14177d(@NotNull String str) {
        return this.f25804d.get(str);
    }

    @Nullable
    /* renamed from: f */
    public final String m14178f(@NotNull String str) {
        return this.f25803c.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: g */
    public final Response m14179g(@NotNull String url, boolean z, @NotNull Map<String, String> headers, @NotNull Map<String, String> postData, @NotNull String userAgent) {
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(headers, "headers");
        Intrinsics.m32179h(postData, "postData");
        Intrinsics.m32179h(userAgent, "userAgent");
        OkHttpClient build = new OkHttpClient.Builder().followRedirects(z).callTimeout(20L, TimeUnit.SECONDS).build();
        int i2 = 1;
        if (!(userAgent.length() > 0)) {
            userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36";
        }
        Request.Builder url2 = new Request.Builder().addHeader("User-Agent", userAgent).addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9").url(url);
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            url2.addHeader(entry.getKey(), entry.getValue());
        }
        if (!postData.isEmpty()) {
            FormBody.Builder builder = new FormBody.Builder(null, i2, 0 == true ? 1 : 0);
            for (Map.Entry<String, String> entry2 : postData.entrySet()) {
                builder.add(entry2.getKey(), entry2.getValue());
            }
            url2.post(builder.build());
        }
        return build.newCall(url2.build()).execute();
    }

    @NotNull
    /* renamed from: h */
    public final String m14180h() {
        String string;
        App.Companion companion = App.f25340b;
        if (!companion.m14044b().f25344a.getBoolean("SIBNET_RAND_USER_AGENT", false)) {
            return "";
        }
        String string2 = companion.m14044b().f25344a.getString("SIBNET_USER_AGENT", "");
        if (string2 == null) {
            string2 = "";
        }
        return (!(string2.length() > 0) || (string = companion.m14044b().f25344a.getString("SIBNET_USER_AGENT", "")) == null) ? "" : string;
    }

    /* renamed from: i */
    public abstract void mo14181i();
}
