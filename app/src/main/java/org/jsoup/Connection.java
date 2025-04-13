package org.jsoup;

import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.jsoup.nodes.Document;

/* loaded from: classes3.dex */
public interface Connection {

    public interface Base<T extends Base<T>> {
    }

    public interface KeyVal {
        @Nullable
        /* renamed from: a */
        String mo34661a();

        /* renamed from: b */
        String mo34662b();

        /* renamed from: c */
        boolean mo34663c();

        String value();

        @Nullable
        /* renamed from: x */
        InputStream mo34664x();
    }

    public enum Method {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(false),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);


        /* renamed from: b */
        public final boolean f68890b;

        Method(boolean z) {
            this.f68890b = z;
        }
    }

    public interface Request extends Base<Request> {
    }

    public interface Response extends Base<Response> {
        /* renamed from: a */
        Document mo34665a() throws IOException;
    }
}
