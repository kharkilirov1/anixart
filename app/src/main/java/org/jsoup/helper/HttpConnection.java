package org.jsoup.helper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class HttpConnection implements Connection {

    /* renamed from: c */
    public static final Charset f68900c = Charset.forName("UTF-8");

    /* renamed from: d */
    public static final Charset f68901d = Charset.forName("ISO-8859-1");

    /* renamed from: a */
    public Request f68902a = new Request();

    /* renamed from: b */
    @Nullable
    public Connection.Response f68903b;

    public static class KeyVal implements Connection.KeyVal {
        @Override // org.jsoup.Connection.KeyVal
        /* renamed from: a */
        public String mo34661a() {
            return null;
        }

        @Override // org.jsoup.Connection.KeyVal
        /* renamed from: b */
        public String mo34662b() {
            return null;
        }

        @Override // org.jsoup.Connection.KeyVal
        /* renamed from: c */
        public boolean mo34663c() {
            return false;
        }

        public String toString() {
            return "null=null";
        }

        @Override // org.jsoup.Connection.KeyVal
        public String value() {
            return null;
        }

        @Override // org.jsoup.Connection.KeyVal
        /* renamed from: x */
        public InputStream mo34664x() {
            return null;
        }
    }

    public static class Request extends Base<Connection.Request> implements Connection.Request {

        /* renamed from: f */
        public int f68909f;

        /* renamed from: g */
        public int f68910g;

        /* renamed from: h */
        public boolean f68911h;

        /* renamed from: i */
        public final Collection<Connection.KeyVal> f68912i;

        /* renamed from: j */
        @Nullable
        public String f68913j;

        /* renamed from: k */
        public Parser f68914k;

        /* renamed from: l */
        public boolean f68915l;

        /* renamed from: m */
        public String f68916m;

        /* renamed from: n */
        @Nullable
        public SSLSocketFactory f68917n;

        /* renamed from: o */
        public CookieManager f68918o;

        /* renamed from: p */
        public volatile boolean f68919p;

        static {
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        }

        public Request() {
            super(null);
            this.f68913j = null;
            this.f68915l = false;
            this.f68916m = DataUtil.f68896c;
            this.f68919p = false;
            this.f68909f = 30000;
            this.f68910g = 2097152;
            this.f68911h = true;
            this.f68912i = new ArrayList();
            this.f68906b = Connection.Method.GET;
            m34676b("Accept-Encoding", "gzip");
            m34676b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
            this.f68914k = Parser.m34889a();
            this.f68918o = new CookieManager();
        }
    }

    /* renamed from: a */
    public static Connection m34671a(String str) {
        String str2;
        HttpConnection httpConnection = new HttpConnection();
        Validate.m34693f(str, "Must supply a valid URL");
        try {
            Request request = httpConnection.f68902a;
            try {
                str2 = m34672c(new URL(str)).toExternalForm();
            } catch (Exception unused) {
                str2 = str;
            }
            request.m34684j(new URL(str2));
            return httpConnection;
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(C0000a.m14k("Malformed URL: ", str), e2);
        }
    }

    /* renamed from: c */
    public static URL m34672c(URL url) {
        URL m34673e = m34673e(url);
        try {
            return new URL(new URI(m34673e.toExternalForm().replace(" ", "%20")).toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
            return m34673e;
        }
    }

    /* renamed from: e */
    public static URL m34673e(URL url) {
        String host = url.getHost();
        String[] strArr = StringUtil.f68937a;
        Validate.m34694g(host);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= host.length()) {
                z = true;
                break;
            }
            if (host.charAt(i2) > 127) {
                break;
            }
            i2++;
        }
        if (z) {
            return url;
        }
        try {
            return new URL(url.getProtocol(), IDN.toASCII(url.getHost()), url.getPort(), url.getFile());
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: b */
    public Connection m34674b(String str, String str2) {
        this.f68902a.m34677c(str, str2);
        return this;
    }

    /* renamed from: d */
    public Document m34675d() throws IOException {
        Request request = this.f68902a;
        Connection.Method method = Connection.Method.GET;
        Objects.requireNonNull(request);
        request.f68906b = method;
        Response m34685k = Response.m34685k(this.f68902a, null);
        this.f68903b = m34685k;
        Validate.m34694g(m34685k);
        return this.f68903b.mo34665a();
    }

    public static abstract class Base<T extends Connection.Base<T>> implements Connection.Base<T> {

        /* renamed from: e */
        public static final URL f68904e;

        /* renamed from: a */
        public URL f68905a = f68904e;

        /* renamed from: b */
        public Connection.Method f68906b = Connection.Method.GET;

        /* renamed from: c */
        public Map<String, List<String>> f68907c = new LinkedHashMap();

        /* renamed from: d */
        public Map<String, String> f68908d = new LinkedHashMap();

        static {
            try {
                f68904e = new URL("http://undefined/");
            } catch (MalformedURLException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public Base() {
        }

        /* renamed from: b */
        public T m34676b(String str, String str2) {
            int i2;
            Validate.m34692e(str);
            if (str2 == null) {
                str2 = "";
            }
            Validate.m34692e(str);
            List<String> m34678d = m34678d(str);
            if (m34678d.isEmpty()) {
                m34678d = new ArrayList<>();
                this.f68907c.put(str, m34678d);
            }
            byte[] bytes = str2.getBytes(HttpConnection.f68901d);
            boolean z = false;
            int i3 = (bytes.length >= 3 && (bytes[0] & 255) == 239 && (bytes[1] & 255) == 187 && (bytes[2] & 255) == 191) ? 3 : 0;
            int length = bytes.length;
            loop0: while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                }
                byte b = bytes[i3];
                if ((b & 128) != 0) {
                    if ((b & 224) != 192) {
                        if ((b & 240) != 224) {
                            if ((b & 248) != 240) {
                                break;
                            }
                            i2 = i3 + 3;
                        } else {
                            i2 = i3 + 2;
                        }
                    } else {
                        i2 = i3 + 1;
                    }
                    if (i2 >= bytes.length) {
                        break;
                    }
                    while (i3 < i2) {
                        i3++;
                        if ((bytes[i3] & 192) != 128) {
                            break loop0;
                        }
                    }
                }
                i3++;
            }
            if (z) {
                str2 = new String(bytes, HttpConnection.f68900c);
            }
            m34678d.add(str2);
            return this;
        }

        /* renamed from: c */
        public T m34677c(String str, String str2) {
            Validate.m34693f(str, "Cookie name must not be empty");
            Validate.m34695h(str2, "Cookie value must not be null");
            this.f68908d.put(str, str2);
            return this;
        }

        /* renamed from: d */
        public final List<String> m34678d(String str) {
            for (Map.Entry<String, List<String>> entry : this.f68907c.entrySet()) {
                if (str.equalsIgnoreCase(entry.getKey())) {
                    return entry.getValue();
                }
            }
            return Collections.emptyList();
        }

        /* renamed from: e */
        public boolean m34679e(String str, String str2) {
            Validate.m34692e(str);
            Validate.m34692e(str2);
            Validate.m34692e(str);
            Iterator<String> it = m34678d(str).iterator();
            while (it.hasNext()) {
                if (str2.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public String m34680f(String str) {
            List<String> m34678d = m34678d(str);
            if (m34678d.size() > 0) {
                return StringUtil.m34704f(m34678d, ", ");
            }
            return null;
        }

        /* renamed from: g */
        public T m34681g(String str, String str2) {
            Validate.m34693f(str, "Header name must not be empty");
            m34682h(str);
            m34676b(str, str2);
            return this;
        }

        /* renamed from: h */
        public T m34682h(String str) {
            Map.Entry<String, List<String>> entry;
            Validate.m34693f(str, "Header name must not be empty");
            String m34697a = Normalizer.m34697a(str);
            Iterator<Map.Entry<String, List<String>>> it = this.f68907c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    entry = null;
                    break;
                }
                entry = it.next();
                if (Normalizer.m34697a(entry.getKey()).equals(m34697a)) {
                    break;
                }
            }
            if (entry != null) {
                this.f68907c.remove(entry.getKey());
            }
            return this;
        }

        /* renamed from: i */
        public URL m34683i() {
            URL url = this.f68905a;
            if (url != f68904e) {
                return url;
            }
            throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
        }

        /* renamed from: j */
        public T m34684j(URL url) {
            this.f68905a = HttpConnection.m34673e(url);
            return this;
        }

        public Base(C68731 c68731) {
        }
    }

    public static class Response extends Base<Connection.Response> implements Connection.Response {

        /* renamed from: o */
        public static final Pattern f68920o = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        /* renamed from: f */
        @Nullable
        public ByteBuffer f68921f;

        /* renamed from: g */
        @Nullable
        public InputStream f68922g;

        /* renamed from: h */
        @Nullable
        public HttpURLConnection f68923h;

        /* renamed from: i */
        @Nullable
        public String f68924i;

        /* renamed from: j */
        @Nullable
        public final String f68925j;

        /* renamed from: k */
        public boolean f68926k;

        /* renamed from: l */
        public boolean f68927l;

        /* renamed from: m */
        public int f68928m;

        /* renamed from: n */
        public final Request f68929n;

        public Response() {
            super(null);
            this.f68926k = false;
            this.f68927l = false;
            this.f68928m = 0;
            this.f68929n = new Request();
            this.f68925j = null;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:(8:(1:(2:181|(2:183|(26:187|38|(1:42)|43|(1:45)|46|(2:49|47)|50|51|52|53|54|(4:57|(5:62|63|(2:73|74)(2:65|(2:67|68)(1:72))|69|70)|71|55)|77|78|(1:80)|(1:84)|85|(5:89|(2:92|90)|93|87|86)|94|95|(4:97|98|99|100)|110|111|112|(2:127|(2:164|165)(6:131|(2:138|139)|146|(1:163)(5:150|(1:152)(1:162)|153|(1:155)(2:159|(1:161))|156)|157|158))(7:116|(1:118)|119|(1:123)|124|125|126)))(3:188|(2:189|(2:191|(2:193|194)(1:198))(2:199|200))|(30:196|38|(2:40|42)|43|(0)|46|(1:47)|50|51|52|53|54|(1:55)|77|78|(0)|(2:82|84)|85|(2:87|86)|94|95|(0)|110|111|112|(1:114)|127|(1:129)|164|165)(1:197))))(6:22|(1:24)(1:179)|25|(4:28|(2:30|31)(2:33|34)|32|26)|35|36)|111|112|(0)|127|(0)|164|165)|52|53|54|(1:55)|77|78|(0)|(0)|85|(2:87|86)|94|95|(0)|110) */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x0342, code lost:
        
            if (org.jsoup.helper.HttpConnection.Response.f68920o.matcher(r3).matches() == false) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x0346, code lost:
        
            if (r16.f68915l != false) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:145:0x0348, code lost:
        
            r16.f68914k = new org.jsoup.parser.Parser(new org.jsoup.parser.XmlTreeBuilder());
            r16.f68915l = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:0x03e4, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:114:0x02b7 A[Catch: IOException -> 0x03df, all -> 0x03e2, TryCatch #0 {all -> 0x03e2, blocks: (B:95:0x027a, B:97:0x0283, B:100:0x028a, B:108:0x0296, B:109:0x0299, B:110:0x029a, B:112:0x02a5, B:114:0x02b7, B:118:0x02bf, B:119:0x02cf, B:121:0x02e0, B:123:0x02e9, B:124:0x02ed, B:131:0x030d, B:133:0x0311, B:135:0x0319, B:138:0x0326, B:139:0x0335, B:141:0x0338, B:143:0x0344, B:145:0x0348, B:146:0x0356, B:148:0x0364, B:150:0x036a, B:152:0x0370, B:153:0x0379, B:155:0x0388, B:156:0x03aa, B:159:0x0392, B:161:0x039c, B:162:0x0375, B:163:0x03c4, B:164:0x03cf, B:165:0x03de, B:169:0x03e7, B:170:0x03ea), top: B:87:0x0252 }] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0309  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01a6 A[LOOP:1: B:47:0x01a0->B:49:0x01a6, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0283 A[Catch: all -> 0x03e2, IOException -> 0x03e4, TRY_LEAVE, TryCatch #0 {all -> 0x03e2, blocks: (B:95:0x027a, B:97:0x0283, B:100:0x028a, B:108:0x0296, B:109:0x0299, B:110:0x029a, B:112:0x02a5, B:114:0x02b7, B:118:0x02bf, B:119:0x02cf, B:121:0x02e0, B:123:0x02e9, B:124:0x02ed, B:131:0x030d, B:133:0x0311, B:135:0x0319, B:138:0x0326, B:139:0x0335, B:141:0x0338, B:143:0x0344, B:145:0x0348, B:146:0x0356, B:148:0x0364, B:150:0x036a, B:152:0x0370, B:153:0x0379, B:155:0x0388, B:156:0x03aa, B:159:0x0392, B:161:0x039c, B:162:0x0375, B:163:0x03c4, B:164:0x03cf, B:165:0x03de, B:169:0x03e7, B:170:0x03ea), top: B:87:0x0252 }] */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static org.jsoup.helper.HttpConnection.Response m34685k(org.jsoup.helper.HttpConnection.Request r16, @javax.annotation.Nullable org.jsoup.helper.HttpConnection.Response r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 1024
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.Response.m34685k(org.jsoup.helper.HttpConnection$Request, org.jsoup.helper.HttpConnection$Response):org.jsoup.helper.HttpConnection$Response");
        }

        /* renamed from: m */
        public static void m34686m(Connection.Request request, OutputStream outputStream, @Nullable String str) throws IOException {
            Request request2 = (Request) request;
            Collection<Connection.KeyVal> collection = request2.f68912i;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(request2.f68916m)));
            if (str != null) {
                for (Connection.KeyVal keyVal : collection) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    String mo34662b = keyVal.mo34662b();
                    Charset charset = HttpConnection.f68900c;
                    bufferedWriter.write(mo34662b.replace("\"", "%22"));
                    bufferedWriter.write("\"");
                    InputStream mo34664x = keyVal.mo34664x();
                    if (mo34664x != null) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(keyVal.value().replace("\"", "%22"));
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        String mo34661a = keyVal.mo34661a();
                        if (mo34661a == null) {
                            mo34661a = "application/octet-stream";
                        }
                        bufferedWriter.write(mo34661a);
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        Pattern pattern = DataUtil.f68894a;
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int read = mo34664x.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                outputStream.write(bArr, 0, read);
                            }
                        }
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(keyVal.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else {
                String str2 = request2.f68913j;
                if (str2 != null) {
                    bufferedWriter.write(str2);
                } else {
                    boolean z = true;
                    for (Connection.KeyVal keyVal2 : collection) {
                        if (z) {
                            z = false;
                        } else {
                            bufferedWriter.append('&');
                        }
                        bufferedWriter.write(URLEncoder.encode(keyVal2.mo34662b(), request2.f68916m));
                        bufferedWriter.write(61);
                        bufferedWriter.write(URLEncoder.encode(keyVal2.value(), request2.f68916m));
                    }
                }
            }
            bufferedWriter.close();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01af  */
        @Override // org.jsoup.Connection.Response
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public org.jsoup.nodes.Document mo34665a() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 463
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.Response.mo34665a():org.jsoup.nodes.Document");
        }

        /* renamed from: l */
        public final void m34687l() {
            InputStream inputStream = this.f68922g;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f68922g = null;
                    throw th;
                }
                this.f68922g = null;
            }
            HttpURLConnection httpURLConnection = this.f68923h;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.f68923h = null;
            }
        }

        public Response(HttpURLConnection httpURLConnection, Request request, @Nullable Response response) throws IOException {
            super(null);
            this.f68926k = false;
            this.f68927l = false;
            this.f68928m = 0;
            this.f68923h = httpURLConnection;
            this.f68929n = request;
            this.f68906b = Connection.Method.valueOf(httpURLConnection.getRequestMethod());
            this.f68905a = httpURLConnection.getURL();
            httpURLConnection.getResponseCode();
            httpURLConnection.getResponseMessage();
            this.f68925j = httpURLConnection.getContentType();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i2);
                String headerField = httpURLConnection.getHeaderField(i2);
                if (headerFieldKey == null && headerField == null) {
                    break;
                }
                i2++;
                if (headerFieldKey != null && headerField != null) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        ((List) linkedHashMap.get(headerFieldKey)).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    List<String> list = (List) entry.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                TokenQueue tokenQueue = new TokenQueue(str2);
                                String m34924e = tokenQueue.m34924e("=");
                                tokenQueue.m34927h("=");
                                String trim = m34924e.trim();
                                String trim2 = tokenQueue.m34924e(";").trim();
                                if (trim.length() > 0 && !this.f68908d.containsKey(trim)) {
                                    m34677c(trim, trim2);
                                }
                            }
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        m34676b(str, (String) it.next());
                    }
                }
            }
            Request request2 = this.f68929n;
            URL url = this.f68905a;
            Map<String, List<String>> map = CookieUtil.f68893a;
            try {
                request2.f68918o.put(url.toURI(), linkedHashMap);
                if (response != null) {
                    for (Map.Entry<String, String> entry2 : response.f68908d.entrySet()) {
                        String key = entry2.getKey();
                        Validate.m34693f(key, "Cookie name must not be empty");
                        if (!this.f68908d.containsKey(key)) {
                            m34677c(entry2.getKey(), entry2.getValue());
                        }
                    }
                    response.m34687l();
                    int i3 = response.f68928m + 1;
                    this.f68928m = i3;
                    if (i3 >= 20) {
                        throw new IOException(String.format("Too many redirects occurred trying to load URL %s", response.m34683i()));
                    }
                }
            } catch (URISyntaxException e2) {
                MalformedURLException malformedURLException = new MalformedURLException(e2.getMessage());
                malformedURLException.initCause(e2);
                throw malformedURLException;
            }
        }
    }
}
